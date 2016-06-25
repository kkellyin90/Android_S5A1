package com.funapp.session5assignment1;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GoogleSearchActivity extends AppCompatActivity {
EditText query;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_search);

        Button search = (Button)findViewById(R.id.buttonSearch);
                query = (EditText)findViewById(R.id.editText);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(query.getText().toString() == null){
                    return;
                }
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, query.getText().toString());
                startActivity(intent);
            }
        });

    }
}
