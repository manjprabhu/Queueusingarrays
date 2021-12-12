package com.example.queue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Queue queue = new Queue();
        queue.enQueue(10);
        queue.enQueue(11);
        queue.enQueue(12);
        queue.enQueue(13);
        queue.enQueue(14);
        queue.enQueue(15);

        queue.display();

        Log.d("Queue", "************************************* ");
        queue.deQueue();
        queue.deQueue();
        queue.display();


    }
}