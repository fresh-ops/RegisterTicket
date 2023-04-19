package com.fresh.registerticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.fresh.registerticket.ticket.Ticket;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    private final Ticket ticket = new Ticket();
    private Button btnSubmitData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText fieldID = findViewById(R.id.fieldID);
        EditText fieldCost = findViewById(R.id.fieldCost);
        String userID = String.format("Пользователь #%d", ticket.getUserID());
        String cost = String.format("%d монет", ticket.getCost());

        fieldID.setText(userID);
        fieldCost.setText(cost);

        btnSubmitData = findViewById(R.id.btnSubmitData);

        btnSubmitData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                EditText departurePlaceIn = findViewById(R.id.departurePlaceIn);
                ticket.setDeparturePlace(String.valueOf(departurePlaceIn.getText()));
                EditText departureTimeIn = findViewById(R.id.departureTimeIn);
                ticket.setDepartureTime(String.valueOf(departureTimeIn.getText()));
                EditText arrivalPlaceIn = findViewById(R.id.arrivalPlaceIn);
                ticket.setArrivalPlace(String.valueOf(arrivalPlaceIn.getText()));
                EditText arrivalTimeIn = findViewById(R.id.arrivalTimeIn);
                ticket.setArrivalTime(String.valueOf(arrivalTimeIn.getText()));

                intent.putExtra(Ticket.class.getSimpleName(), ticket);

                startActivity(intent);
            }
        });
    }
}