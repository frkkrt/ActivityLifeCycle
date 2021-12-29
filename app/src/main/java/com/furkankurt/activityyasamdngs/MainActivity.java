package com.furkankurt.activityyasamdngs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Activy Yaşam Döngüsü
    //Activy'inin açılışından kapanmasına kadar otomatik çalışan 6 metot vardır.

    //Activity ilk açıldığında türetilir ve yaşamı boyunca sadece 1 kez çağrılır.
    //Veri listelemesi click olayları gibi herseyi burada yapılır.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("OnCreate Çalıştı.");

        Button btn=findViewById(R.id.BtnAc);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,
                        MainActivity2.class);
                startActivity(intent);

            }
        });

    }
    //Activty ön plana geldiğinde çalışır.
    //Actvity her arkaplandan alınıp kullanıldığında çalışacaktır.


    @Override
    protected void onStart() {
        System.out.println("OnStart Çalıştı.");
        super.onStart();
    }
    //Activity'nin kullanıcı ile etkileşime geçmesinde çalışır
    //Onstart'dan sonra çalışır.

    @Override
    protected void onResume() {
        System.out.println("OnResume Çalıştı.");
        super.onResume();
    }
    //Activty duraklatıldı.
    //Uygulama arkaplana alındığında çalışan metot'tur.
    //Genellikle uygulama arkaplana geçtiğinde telefonun şarzını zz kullanması için bazı özeliikler pasif edilir.
    //Tekrar ön plana geçtiğinde kaldığı activity'dek, Onstart metot'u ile durdurduklarımızı başlatabilirler.
    //Activity arası geçiş yaptığımızda, halen actvity arkaplan kalacağı için burada işlem yapılır.

    @Override
    protected void onPause() {
        System.out.println("OnPause Çalıştı.");
        super.onPause();
    }
    //OnStopta activty komple yok edilir.
    //Activity kapatılıp başka bir activity açıldığında çalışır.
    //Kapatılan activity teelfonun geri butonu ile dönülemeyeceği durumlarda kullanılır.

    @Override
    protected void onStop() {
        System.out.println("OnStop Çalıştı.");
        super.onStop();
    }
    //Actvity yok edilmeden hemen önce çalışır.
    @Override
    protected void onDestroy() {
        System.out.println("OnDestroy Çalıştı.");
        super.onDestroy();
    }
}