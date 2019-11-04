package com.example.amst2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.juang.jplot.PlotPlanitoXY;

public class LinealGraph extends AppCompatActivity {

    private PlotPlanitoXY plot;
    private LinearLayout pantalla;
    Context context;

    float [] X,Y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lineal_graph);
        context=this;
        pantalla= (LinearLayout) (findViewById(R.id.pantalla));

        X=new float[4]; Y=new float[4];// si se desean graficar datos tipo double debe convertirse de "double a float"
        X[0]=3.4f;Y[0]=2.5f;
        X[1]=11.3f;Y[1]=6.6f;
        X[2]=12.4f;Y[2]=7.6f;
        X[3]=20.9f;Y[3]=10.4f;
        plot = new PlotPlanitoXY(context,"Grafico lineal estatico","Tiempo [s]","Velocidad [m/s]");
        plot.SetSerie1(X,Y,"graph 1",5,true);// el 5 es el tamaño de punto "true" es para unir los puntos
        //con una linea
           /*antes de mostrar el grafico en pantalla(LinearLayout) deben de ir todos los ajustes "Set" del grafico.
           Todos los metodos publicos que ayudan a personalizar el grafico se describen cada uno en la siguiente sección */

           /*
           //agregando imagem.png al fondo de la cuadricula que esta en la carpeta "drawable" del proyecto.
           Drawable myDrawable = getResources().getDrawable(R.drawable.fneon);//debe cambiarse "fneon" por tu imagen
           Bitmap myFondo = ((BitmapDrawable) myDrawable).getBitmap();
           plot.SetImagFondo1(myFondo);
           */

        plot.SetSizeTitulo(50);
        plot.SetSizeLeyend(550);
        plot.SetSizeTituloX(50);
        plot.SetSizeTituloY1(50);
        plot.SetSizeTituloY2(100);
        plot.SetSizeTextX(150);
        plot.SetSizeTextY1(150);
        plot.SetSizeTextY2(150);

        plot.SetHD(true); //ajustamos la calidad hd que suaviza bordes del grafico. por default esta desactivado
        plot.SetTouch(true);// activa el touch sobre el grafico no es necesario colocarlo ya que por default esta activado

        pantalla.addView(plot);
    }

    public void playVideo(View view){
        Intent intent = new Intent(this,videoView.class);
        startActivity(intent);
    }
    public void verMap(View view){
        MainActivity main = new MainActivity();
        if(main.isServiceOk()){
            Intent intent = new Intent(this,myMap.class);
            startActivity(intent);
        }
    }
    public void verCalendario(View view){
        Intent intent = new Intent(this,calendar.class);
        startActivity(intent);
    }
}
