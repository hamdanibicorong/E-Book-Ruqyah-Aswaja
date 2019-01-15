package me.developermuda.www.bdrawer.detail;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import me.developermuda.www.bdrawer.ContenRuqyah.BtnDoaFragment;
import me.developermuda.www.bdrawer.R;

public class ScrollingDoaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("E-Book Ruqyah");
        setSupportActionBar(toolbar);

        //Buat back tollbar

        Toolbar ToolBarAtas = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(ToolBarAtas);
        ToolBarAtas.setLogo(R.drawable.ab);
        ToolBarAtas.setLogoDescription(getResources().getString(R.string.app_name));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


//        getSupportActionBar().setDisplayShowCustomEnabled(true);


        WebView webView = (WebView) findViewById(R.id.conten_scroll);
        String url = getIntent().getStringExtra("url");
        webView.loadUrl(url);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_scroll);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScrollingDoaActivity.this,BtnDoaFragment.class);
                startActivity(intent);
            }
        });

        }
        //Actiotion tollbar back

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

