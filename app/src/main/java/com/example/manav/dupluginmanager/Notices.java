package com.example.manav.dupluginmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Notices extends AppCompatActivity {

    DatabaseReference mNoticeRef;
    EditText mTitle,mDesc,mDepartment,mDeadline;
    Button mSubmit;
    Notice notice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notices);
        mNoticeRef = FirebaseDatabase.getInstance().getReference().child("notice");
        mTitle = (EditText)findViewById(R.id.editText_notice_title);
        mDesc = (EditText)findViewById(R.id.editText_notice_desc);
        mDepartment = (EditText)findViewById(R.id.editText_notice_department);
        mDeadline = (EditText)findViewById(R.id.editText_notice_deadline);
        mSubmit = (Button)findViewById(R.id.button_notice_submit);
        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bindData();
            }
        });
    }
    private void bindData()
    {
        String title = mTitle.getText().toString();
        String description = mDesc.getText().toString();
        String department = mDepartment.getText().toString();
        String deadline = mDeadline.getText().toString();
        String time = getCurrentTime();
        notice = new Notice(title,description,department,deadline,time);
        mNoticeRef.push().setValue(notice).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                Toast.makeText(Notices.this,"Notice Uploaded!",Toast.LENGTH_SHORT).show();
            }
        });
    }
    private static String getCurrentTime()
    {
        Long time = System.currentTimeMillis();
        String ts = time.toString();
        return  ts;
    }
    @Override
    public void onBackPressed() {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
        finish();
    }
}
