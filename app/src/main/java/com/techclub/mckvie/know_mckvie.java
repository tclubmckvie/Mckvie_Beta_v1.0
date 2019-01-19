package com.techclub.mckvie;

import android.app.DownloadManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class know_mckvie extends AppCompatActivity {

    TextView textView86, textView65, textView83, textView82, textView59, textView60,textView61,textView62,textView58,textView100,textView64,textView69,textView71,textView73,textView75,textView76,textView77,textView78;
    DownloadManager downloadManager;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.knowmckvie);

         textView59 = (TextView)findViewById(R.id.textView59);
         textView60 = (TextView)findViewById(R.id.textView60);
         textView61 = (TextView)findViewById(R.id.textView61);
         textView62 = (TextView)findViewById(R.id.textView62);
         textView58 = (TextView)findViewById(R.id.textView58);
         textView100 = (TextView)findViewById(R.id.textView100);
         textView64 = (TextView)findViewById(R.id.textView64);
         textView65 = (TextView)findViewById(R.id.textView65);
         textView69 = (TextView)findViewById(R.id.textView69);
         textView71 = (TextView)findViewById(R.id.textView71);
         textView73 = (TextView)findViewById(R.id.textView73);
         textView75 = (TextView)findViewById(R.id.textView75);
         textView76 = (TextView)findViewById(R.id.textView76);
         textView77 = (TextView)findViewById(R.id.textView77);
         textView78 = (TextView)findViewById(R.id.textView78);
         textView82 = (TextView)findViewById(R.id.textView82);
         textView83 = (TextView)findViewById(R.id.textView83);

        textView59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mckvie.edu.in/academics/departments-and-programs/automobile-engineering/"));
                startActivity(intent);
            }
        });

        textView60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("www.mckvie.edu.in/academics/departments-and-programs/computer-science-engineering/"));
                startActivity(intent);
            }
        });

        textView61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mckvie.edu.in/academics/departments-and-programs/electrical-engineering/"));
                startActivity(intent);
            }
        });

        textView62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mckvie.edu.in/academics/departments-and-programs/electronics-communication-engineering/"));
                startActivity(intent);
            }
        });

        textView58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mckvie.edu.in/academics/departments-and-programs/information-technology/"));
                startActivity(intent);
            }
        });

        textView100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mckvie.edu.in/academics/departments-and-programs/mechanical-engineering/"));
                startActivity(intent);
            }
        });

        textView64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mckvie.edu.in/academics/departments-and-programs/electronics-communication-engineering/#index2"));
                startActivity(intent);
            }
        });

        textView65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mckvie.edu.in/academics/departments-and-programs/mca/"));
                startActivity(intent);
            }
        });


        textView69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mckvie.edu.in/placements/training/"));
                startActivity(intent);
            }
        });

        textView69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mckvie.edu.in/placements/training/"));
                startActivity(intent);
            }
        });

        textView71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mckvie.edu.in/placements/placement-records/"));
                startActivity(intent);
            }
        });


        textView73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mckvie.edu.in/about/affiliations-accreditations/"));
                startActivity(intent);
            }
        });

        textView73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mckvie.edu.in/about/affiliations-accreditations/"));
                startActivity(intent);
            }
        });

        textView75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("http://www.mckvie.edu.in/site/assets/files/1210/introduction-to-qeee-2015.pdf");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                downloadManager.enqueue(request);
            }
        });

        textView76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("http://www.mckvie.edu.in/site/assets/files/1210/introduction-to-qeee-2015.pdf");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                downloadManager.enqueue(request);
            }
        });

        textView77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mckvie.edu.in/campus-life/student-chapters/"));
                startActivity(intent);
            }
        });

        textView78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mckvie.edu.in/nostalgia/"));
                startActivity(intent);
            }
        });

        textView82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mckvie.edu.in/campus-life/svcpt/"));
                startActivity(intent);
            }
        });

        textView83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mckvie.edu.in/campus-life/mckvie-rotaract-club/"));
                startActivity(intent);
            }
        });

        textView86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("http://mckvie.edu.in/site/assets/files/1204/mckv_ie_pull_out_final_offset_setting_2_-curve.pdf");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                downloadManager.enqueue(request);
            }
        });
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
