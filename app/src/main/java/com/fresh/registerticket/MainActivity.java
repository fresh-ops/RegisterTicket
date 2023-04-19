package com.fresh.registerticket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.fresh.registerticket.ticket.Ticket;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ticket ticket = new Ticket();
        EditText fieldID = findViewById(R.id.fieldID);
        EditText fieldCost = findViewById(R.id.fieldCost);
        String userID = String.format("Пользователь #%d", ticket.getUserID());
        String cost = String.format("%d монет", ticket.getCost());

        fieldID.setText(userID);
        fieldCost.setText(cost);
    }
}