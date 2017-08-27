package com.example.android.hitungluas;
//
//import android.content.Intent;
//import android.net.Uri;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.text.TextUtils;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;
//
//public class MainActivity extends AppCompatActivity {
//
//    private Button btnSub1, btnSub2, btnDial;
//    private String strIntent;
//    private Button btnHitung;
//    private EditText txtIntent;
//
//
////    private EditText edtPanjang, edtLebar, ;
////    private TextView txtLuas;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
////        getSupportActionBar().setTitle("Hitung Luas Persegi Panjang");
////        edtPanjang = (EditText)findViewById(R.id.edt_panjang);
////        edtLebar = (EditText)findViewById(R.id.edt_lebar);
////        btnHitung = (Button)findViewById(R.id.btn_hitung);
////        txtLuas = (TextView)findViewById(R.id.txt_luas);
//
//        btnSub1 = (Button)findViewById(R.id.btn_activity_sub_1);
//        btnSub2 = (Button)findViewById(R.id.btn_activity_sub_2);
//        btnDial = (Button)findViewById(R.id.btn_activity_dial);
//
//        txtIntent = (EditText)findViewById(R.id.text_Intent);
//
//        btnSub1.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                Intent intent = new Intent(MainActivity.this, Sub1Activity.class);
//                startActivity(intent);
//
//            }
//        });
//
//
//        btnSub2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                strIntent = txtIntent.getText().toString();
//                Intent intent  = new Intent(MainActivity.this, Sub2Activity.class);
//                intent.putExtra(Sub2Activity.KEY_DATA, strIntent);
//                startActivityForResult(intent, 0);
//            }
//        });
//
//
//        btnDial.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:082121212093"));
//                startActivity(intent);
//            }
//        });
//
////        if (TextUtils.isEmpty(edtPanjang.getText ()) || TextUtils.isEmpty(edtLebar.getText())){
////            Toast.makeText(this, "Nilai yang dimasukkan tidak boleh kosong",Toast.LENGTH_SHORT).show();
////        }else {
////            //do something
////        }
//
////        btnHitung.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                String panjang = edtPanjang.getText().toString().trim();
////                String lebar = edtLebar.getText().toString().trim();
////
////                double p = Double.parseDouble(panjang);
////                double l = Double.parseDouble(lebar);
////                double luas = p * l;
////
////                txtLuas.setText("Luasnya adalah : "+luas);
////            }
////        });
//
//    }
//
//
//}


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.android.hitungluas.R;
import com.example.android.hitungluas.Sub1Activity;
import com.example.android.hitungluas.Sub2Activity;

public class MainActivity extends AppCompatActivity
{
    private Button btnSub1, btnSub2, btnDial;
    private String strIntent;
    private EditText txtIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSub1 = (Button)findViewById(R.id.btn_activity_sub_1);
        btnSub2 = (Button)findViewById(R.id.btn_activity_sub_2);
        btnDial = (Button)findViewById(R.id.btn_activity_dial);

        txtIntent = (EditText)findViewById(R.id.text_Intent);

        btnSub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Sub1Activity.class);
                startActivity(intent);
            }
        });

        btnSub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strIntent = txtIntent.getText().toString();
                Intent intent = new Intent(MainActivity.this, Sub2Activity.class);
                intent.putExtra(Sub2Activity.KEY_DATA, strIntent);
                startActivityForResult(intent, 0);
            }
        });

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:082121212093"));
                startActivity(intent);
            }
        });
    }
}
