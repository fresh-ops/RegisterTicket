package com.fresh.registerticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.fresh.registerticket.ticket.Ticket;

public class SecondActivity extends AppCompatActivity {
    private Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        restoreData();
        btnBack = findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
    }

    private void restoreData() {
        Bundle bundle = getIntent().getExtras();
        Ticket ticket = (Ticket) bundle.getSerializable(Ticket.class.getSimpleName());
        TextView ticketData = findViewById(R.id.ticket_data);
        StringBuffer data = new StringBuffer();
        data.append(String.format("Пользователь №%d\n", ticket.getUserID()));
        data.append(String.format("Место отправления: %s\n", ticket.getDeparturePlace()));
        data.append(String.format("Время отправления: %s\n", ticket.getDepartureTime()));
        data.append(String.format("Место прибытия: %s\n", ticket.getArrivalPlace()));
        data.append(String.format("Время прибытия: %s\n", ticket.getArrivalTime()));
        data.append(String.format("Цена: %d монет", ticket.getCost()));
        ticketData.setText(data.toString());
    }
}