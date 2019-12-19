package com.example.hostelallotmentapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class StudentPreference extends AppCompatActivity {

    TextView nameText, idText, hostelText, roomText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_preference);

        nameText = findViewById(R.id.NameTextView);
        idText = findViewById(R.id.IDTextView);
        hostelText = findViewById(R.id.HostelTextView);
        roomText = findViewById(R.id.RoomTextView);
        String id = getIntent().getStringExtra("id");

        idText.setText(id);
    }
}
