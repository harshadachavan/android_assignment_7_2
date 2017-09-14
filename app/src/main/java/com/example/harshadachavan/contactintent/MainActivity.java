package com.example.harshadachavan.contactintent;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/*
* @purpose
* The assignment is to open up contacts menu with intents
* Here I have used an onclick listener for event trigger
* when the user clicks on open cotacts button he is taken to contact menu
*
* @Author
* Harshada Chavan
* */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button contact = (Button)findViewById(R.id.contact_btn);

        //call an onclick listener on button click
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //set intent action to open contacts menu
                Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
                startActivityForResult(intent, 1);
            }
        });
    }
}
