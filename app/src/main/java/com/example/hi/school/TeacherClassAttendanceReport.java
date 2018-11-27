package com.example.hi.school;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.TextView;

public class TeacherClassAttendanceReport extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_class_attendance_report);

        TextView text = (TextView)findViewById(R.id.txtview);

        RotateAnimation rotate= (RotateAnimation)AnimationUtils.loadAnimation(this,R.anim.rotateanimation);
        text.setAnimation(rotate);

    }
}
