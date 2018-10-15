package com.example.rathana.qr_code_scanner;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import net.glxn.qrgen.android.QRCode;

public class MainActivity extends AppCompatActivity {

    ImageView qrImage;
    Button btnScanQR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        qrImage=findViewById(R.id.qrImage);
        btnScanQR=findViewById(R.id.btnScan);

        //generate qr code
        Bitmap bitmap=QRCode.from("http://seavphov.khmeracademy.org/").withSize(300,300).bitmap();
        qrImage.setImageBitmap(bitmap);

        btnScanQR.setOnClickListener(v->{
            startActivity(new Intent(this,ScanQRActivity.class));
        });
    }
}
