package com.example.hi.school;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button PrincipleHome,ParentHome,TeacherHome,TeacherAttendance,TeacherAttendance2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PrincipleHome=(Button)findViewById(R.id.PrincipleHome);
        ParentHome=(Button)findViewById(R.id.ParentHome);
        TeacherHome=(Button)findViewById(R.id.TeacherHome);
        TeacherAttendance=(Button)findViewById(R.id.TeacherAttendance);
        TeacherAttendance2=(Button)findViewById(R.id.TeacherAttendance2);


        PrincipleHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, PrincipleHome.class);
                startActivity(i);
            }
        });

        ParentHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, ParentHome.class);
                startActivity(i);
            }
        });

        TeacherHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, TeacherHome.class);
                startActivity(i);
            }
        });

        TeacherAttendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, TeacherAttendance.class);
                startActivity(i);
            }
        });

        TeacherAttendance2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, TeacherAttendance2.class);
                startActivity(i);
            }
        });


    }
}
