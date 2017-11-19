package com.neeraj.example.doct;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Launcher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
       /* try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Intent intent=new Intent(Launcher.this,MainActivityNav.class);
        startActivity(intent);*/
        Thread thread=  new Thread(){
            @Override
            public void run(){
                try {
                    synchronized(this){
                        wait(2000);

                    }
                }
                catch(InterruptedException ex){
                }

                Intent intent=new Intent(Launcher.this,MainActivityNav.class);
                startActivity(intent);
                finish();
            }
        };

        thread.start();
    }
}
