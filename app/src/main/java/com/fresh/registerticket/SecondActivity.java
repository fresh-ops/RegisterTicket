package com.fresh.registerticket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.fresh.registerticket.ticket.Ticket;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
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