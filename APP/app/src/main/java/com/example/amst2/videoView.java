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

    private String automatico="https://r5---sn-ab5sznle.googlevideo.com/videoplayback?expire=1572832584&ei=6DC_Xb-rBLOA4AGmmKCgCQ&ip=77.83.87.213&id=o-AL12qhbiu26vX-jWmglAF6TALWF7PVrLVYnuNIQiYtXH&itag=18&source=youtube&requiressl=yes&pcm2=yes&mime=video%2Fmp4&gir=yes&clen=10179443&ratebypass=yes&dur=212.880&lmt=1513145267451422&fvip=5&fexp=23842630&c=WEB&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cpcm2%2Cmime%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=ALgxI2wwRgIhAM8XJ7JrHa3_karppV-lrgdyZwD9afh4TRsXCEMW2OPBAiEA_kouXO7m0Y0WMDKiWMAv61VkzUfVQw7cYV4qruhn9r4%3D&title=dr%20%20malito%20amenazando%20la%20casa%20blanca&rm=sn-vgqe7d76&req_id=d94d8ebb3058a3ee&ipbypass=yes&redirect_counter=2&cm2rm=sn-jou-btxd7l&cms_redirect=yes&mip=2800:4f0:72:3dc0:f14c:cf6f:99ad:4ff8&mm=29&mn=sn-ab5sznle&ms=rdu&mt=1572810954&mv=m&mvi=4&pl=46&lsparams=ipbypass,mip,mm,mn,ms,mv,mvi,pl&lsig=AHylml4wRgIhAKJ_yp4plI3e7uU6ydJGqkyOvq7q7eynIt5kkglRZQ4oAiEAx1aK79SsXsIl49cuM5AAxZC7XW2LcnDBLpVik6qMZI4=";
    private String url1= "https://r4---sn-jou-btxs.googlevideo.com/videoplayback?expire=1572832736&ei=gDG_Xfi9MYiZhwbUrrqQCA&ip=109.236.52.32&id=o-AOyVHtQqDgiqOoC6ix5tuPqwb6wpNH4grFuVBp740t4n&itag=18&source=youtube&requiressl=yes&mime=video%2Fmp4&gir=yes&clen=13522418&ratebypass=yes&dur=193.770&lmt=1569874593018870&fvip=4&fexp=23842630&c=WEB&txp=5531432&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cmime%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=ALgxI2wwRQIgTdJH8wQLEHwAAU6YwXPH5k3aCANrex9c6LWdIqJia_gCIQD1ePDGBffqYmvci8MWVnQcqS8spit2eRqPnnBLMwZGng%3D%3D&title=Loki%20|%20Destripando%20la%20Historia&redirect_counter=1&rm=sn-ab5e7e7z&req_id=a4bcf17c5462a3ee&cms_redirect=yes&ipbypass=yes&mip=2800:4f0:72:3dc0:f14c:cf6f:99ad:4ff8&mm=31&mn=sn-jou-btxs&ms=au&mt=1572811091&mv=m&mvi=3&pl=46&lsparams=ipbypass,mip,mm,mn,ms,mv,mvi,pl&lsig=AHylml4wRAIgP5vjrJryOSIe7pt_H4vkqwWz-G5qeazBy8aiWSaOuDkCIBi8eUf3Ipz6-sX5FpMW5-Y-xKlYFZDJnqcwG_sDnVwP";
    private String url2= "https://r4---sn-jou-btxs.googlevideo.com/videoplayback?expire=1572832818&ei=0TG_XcqWPJiD1uUPi9yXoAo&ip=45.67.213.54&id=o-AGLDKbEM5OKDiOcB10Dwt4f-3T5NwkpXm8n-SxbQBDyE&itag=18&source=youtube&requiressl=yes&mime=video%2Fmp4&gir=yes&clen=12929496&ratebypass=yes&dur=171.990&lmt=1570952048279335&fvip=4&fexp=9466586,23842630&beids=9466586&c=WEB&txp=5531432&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cmime%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=ALgxI2wwRQIhAITQIiUJUsn1fEBZd33i4gyFIp-Kd28LaBZ36s5nc4dqAiAs0aKEvr9ExxRv_jNoAhdfclhLpp4U8HVmDZnX2qKKxQ%3D%3D&title=POSEID%C3%93N%20|%20Destripando%20la%20Historia%20|%20Canci%C3%B3n&redirect_counter=1&rm=sn-vgqy67z&req_id=24ff00967876a3ee&cms_redirect=yes&ipbypass=yes&mip=2800:4f0:72:3dc0:f14c:cf6f:99ad:4ff8&mm=31&mn=sn-jou-btxs&ms=au&mt=1572811154&mv=m&mvi=3&pl=46&lsparams=ipbypass,mip,mm,mn,ms,mv,mvi,pl&lsig=AHylml4wRQIhAI9hue7Kr7yPRcg0o0d1fsGOMvZYK1G5SfpZmWtG-16dAiAL7cxoVqyJ2va7Hk9U5lh4zbr6Q7wP13ObCpJxZoWOZA==";
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
