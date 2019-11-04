package com.example.amst2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.VideoView;

public class videoView extends AppCompatActivity {
    private RadioGroup g1;
    private RadioButton opcion;
    private Button btnElegir;
    private String eleccion="Opcion 1";

    Uri uri;
    VideoView videoView;
    MediaController mediaController;

    private String automatico="https://r2---sn-jou-btxd.googlevideo.com/videoplayback?expire=1572859534&ei=Lpq_XcjUDofUwQGXiYfwDA&ip=77.83.86.11&id=o-ADDnM_ZM1EbnvMD60xurkyoen89_HFPsVn7CbZ44jeAL&itag=18&source=youtube&requiressl=yes&mime=video%2Fmp4&gir=yes&clen=3779218&ratebypass=yes&dur=99.636&lmt=1532456857902432&fvip=2&fexp=23842630&c=WEB&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cmime%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=ALgxI2wwRQIgd5cbefocCb47rINF9ZCzJIZNafPF0cuYzY3ug2rAlfwCIQC1c0eACU6KRLTN1_Zcs_gLl8ZX22tmBEdHZ6j1gWghsg%3D%3D&title=%C2%BFQu%C3%A9%20es%20Internet&%20-%20Explicaci%C3%B3n%20para%20primaria=&redirect_counter=1&rm=sn-vgqke7l&req_id=cf317f1e7831a3ee&cms_redirect=yes&ipbypass=yes&mip=2800:4f0:70:7610:8e6:2f67:73bb:b5f4&mm=31&mn=sn-jou-btxd&ms=au&mt=1572837913&mv=m&mvi=1&pcm2cms=yes&pl=46&lsparams=ipbypass,mip,mm,mn,ms,mv,mvi,pcm2cms,pl&lsig=AHylml4wRQIhAMc3n3d_BqG3YpaGENyCJTzadOIlb5drOC3B2FH6_HDnAiBm9RMILTozI5i0FAlIGQPwt07TQNpIA4PFGUPSdOCoAw==";
    private String url1= "https://r1---sn-vgqsdn7s.googlevideo.com/videoplayback?expire=1572859541&ei=NZq_XYqsFJXX7ATQpLHADg&ip=5.189.207.87&id=o-AKYnBCKDuT6Dt10ERer7QcXJGIbYa8Xiea5ELfAudPpp&itag=18&source=youtube&requiressl=yes&mime=video%2Fmp4&gir=yes&clen=10188548&ratebypass=yes&dur=233.128&lmt=1457827430354117&fvip=12&fexp=23842630&c=WEB&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cmime%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=ALgxI2wwRgIhAO6AkBSnKtMrAZaFZqDKOoS4h2KkFLp2rXw26JHt-ozpAiEAsQrZRPJvIup2np6WpaRSJ2inYTt6XBJfU4fVDTrqMTs%3D&title=Los%20B%C3%A1sicos%20de%20Internet%20-%20%C2%BF%20Qu%C3%A9%20es%20ISP%20e%20IP%20&rm=sn-ug5onuxaxjvh-n8vs7e&req_id=60d87b9522b2a3ee&redirect_counter=2&cm2rm=sn-f5fd7e&cms_redirect=yes&mip=2800:4f0:70:7610:8e6:2f67:73bb:b5f4&mm=34&mn=sn-vgqsdn7s&ms=ltu&mt=1572837990&mv=m&mvi=0&pl=46&lsparams=mip,mm,mn,ms,mv,mvi,pl&lsig=AHylml4wRQIhAL8K9lKdoczcxDoWXPkY7IbOmM4p_MxOXIneO9u667P2AiBdbAyppOcHv2p16JkeTQkH6kW-pTAdPao8lqPw4vlvEQ==";
    private String url2= "https://r4---sn-ab5szn7k.googlevideo.com/videoplayback?expire=1572859571&ei=U5q_XZPxGqWGjASB5ajgAg&ip=85.208.86.108&id=o-AK7MBLbCLsbZYDEylOyCu5mjrkN0PVmu8osH9JJ3t6ng&itag=18&source=youtube&requiressl=yes&mime=video%2Fmp4&gir=yes&clen=8865885&ratebypass=yes&dur=271.185&lmt=1498370658500017&fvip=4&fexp=9466586,23842630&beids=9466586&c=WEB&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cmime%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=ALgxI2wwRQIhAMpBoJrAmwmvN08H5EQOlYNxC6Ys9Gq0ie-oSEsuIgQtAiARx88YoXfpfcg8x2FlqE__XY-TaxRS5Gl5Rk20NG86VQ%3D%3D&title=Que%20es%20un%20router%20y%20un%20switch&rm=sn-vgqe7y7z&req_id=7b1c8467ab56a3ee&ipbypass=yes&redirect_counter=2&cm2rm=sn-jou-btxk7e&cms_redirect=yes&mip=2800:4f0:70:7610:8e6:2f67:73bb:b5f4&mm=29&mn=sn-ab5szn7k&ms=rdu&mt=1572838013&mv=m&mvi=3&pl=46&lsparams=ipbypass,mip,mm,mn,ms,mv,mvi,pl&lsig=AHylml4wRQIhAJY_xCltUPqTO3bJ85_-8YUOtRlUwvlyjSFljgM_wsmCAiA7MJpk1wMU7BWJmjZWUR7WFVwlX45mhHEj9tCX1__ntg==";
    private String url3= "https://r2---sn-vgqs7ns7.googlevideo.com/videoplayback?expire=1572832849&ei=8TG_XfbBI8OHkgbRqJ-YBQ&ip=109.196.128.126&id=o-ABuCQ3ZTEb40Z625ModrzohSVe_tlVWb2hS1PmhBMf7A&itag=18&source=youtube&requiressl=yes&mime=video%2Fmp4&gir=yes&clen=7947279&ratebypass=yes&dur=212.114&lmt=1556577362937510&fvip=2&fexp=23842630&c=WEB&txp=5431432&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cmime%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=ALgxI2wwRQIgJ2habcEXRpv9ApmBuyjzAbkgyGe1noUUb3ryv2Fl560CIQDQPjA4mjK3PIman5ICk6INDfRiOHpPgvbT0MKqxEtzSg%3D%3D&title=Como%20Cambiar%20la%20IP%20de%20mi%20PC%20a%20cualquier%20pais%202019%20GRATIS&redirect_counter=1&cm2rm=sn-a5mry7l&req_id=8e0deee22fca3ee&cms_redirect=yes&mip=2800:4f0:72:3dc0:f14c:cf6f:99ad:4ff8&mm=34&mn=sn-vgqs7ns7&ms=ltu&mt=1572810923&mv=u&mvi=1&pl=46&lsparams=mip,mm,mn,ms,mv,mvi,pl&lsig=AHylml4wRgIhAJaRTcANVxILmtCKVUuHUT0c0YIBQJnHLuzarDDf3WxsAiEAw3eiVAAkJ-ZUwbaJwBotlryY2pErZ0BmZSoLh-8UYq4=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);

        Toast.makeText(this, "Video automático",Toast.LENGTH_SHORT).show();

        g1=findViewById(R.id.g1);
        btnElegir=findViewById(R.id.btnElegir);
        videoView =(VideoView)findViewById(R.id.videoView);
        mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        uri=Uri.parse(automatico);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

        btnElegir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (eleccion){
                    case "Opcion 1":
                        uri=Uri.parse(url1);
                        break;
                    case "Opcion 2":
                        uri=Uri.parse(url2);
                        break;
                    case "Opcion 3":
                        uri=Uri.parse(url3);
                        break;
                    default:
                        break;
                }
                videoView.setVideoURI(uri);
                videoView.requestFocus();
                videoView.start();

            }
        });
    }

    public void revisar (View view){
        int num= g1.getCheckedRadioButtonId();
        opcion=findViewById(num);
        eleccion=(String) opcion.getText();
        Toast.makeText(this, "Has seleccionado " + eleccion,Toast.LENGTH_SHORT).show();
    }


    public void graficoLineal(View view){
        Intent intent = new Intent(this,LinealGraph.class);
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
