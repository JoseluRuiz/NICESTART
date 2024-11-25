package com.example.interfaces;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;

public class Main extends AppCompatActivity {

    private SwipeRefreshLayout swipeLayout;
    private WebView miVisorWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ImageView mGirl = findViewById(R.id.foto);

        TextView mycontext = (TextView) findViewById(R.id.txt_main  );
        registerForContextMenu(mycontext);

        swipeLayout = (SwipeRefreshLayout) findViewById(R.id.swiperefresh);
        swipeLayout.setOnRefreshListener(mOnRefreshListener);


        miVisorWeb = (WebView) findViewById(R.id.vistaWeb);
        WebSettings websettings = miVisorWeb.getSettings();
        websettings.setLoadWithOverviewMode(true);
        websettings.setUseWideViewPort(true);
        miVisorWeb.loadUrl("https://thispersondoesnotexist.com");




        Glide.with(this)
                .load(R.drawable.hipman)
                .transition(DrawableTransitionOptions.withCrossFade(2000))
                .centerCrop()
                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.black)))
                .into(mGirl);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_aptbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        if(id == R.id.item1)
        {
            Toast toast = Toast.makeText(this, "Infecting", Toast.LENGTH_LONG);
            toast.show();
        }
        if(id == R.id.item2)
        {
            Toast toast2 = Toast.makeText(this, "Fixing", Toast.LENGTH_LONG);
            toast2.show();
        }
        if (id == R.id.item3) {
            Toast toast3 = Toast.makeText(this, "Todavia no hay contenido",Toast.LENGTH_LONG);
            toast3.show();
        }

        if (id == R.id.item4) {
            Toast toast4 = Toast.makeText(this, "Todavia no hay contenido",Toast.LENGTH_LONG);
            toast4.show();
        }

        if (id == R.id.item5) {
            showAlertDialogButtonClicked(Main.this);
        }
        return super.onOptionsItemSelected(item);
    }


    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        getMenuInflater().inflate(R.menu.menu_context, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        if(id == R.id.item1)
        {
            Toast toast = Toast.makeText(this,"Item copied",Toast.LENGTH_LONG);
            toast.show();
        }
        if(id == R.id.item2)
        {
            Toast toast2 = Toast.makeText(this," Downloading item...",Toast.LENGTH_LONG);
            toast2.show();
        }
        return super.onOptionsItemSelected(item);
    }


    protected SwipeRefreshLayout.OnRefreshListener
	mOnRefreshListener = new SwipeRefreshLayout.OnRefreshListener() {

        @Override
        public void onRefresh(){

            //Toast toast0 = Toast.makeText(Main.this, "Hi there! I don't exists", Toast.LENGTH_LONG);
            //toast0.show();

            final ConstraintLayout mLayout = findViewById(R.id.main);

            Snackbar snackbar = Snackbar
                .make(mLayout,"fancy a Snack while you refresh?",Snackbar.LENGTH_SHORT)
                .setAction("UNDO", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar snackbar1 = Snackbar.make(mLayout,"Action is restored!", Snackbar.LENGTH_SHORT);
                        snackbar1.show();
                    }
                });
            snackbar.show();


            miVisorWeb.reload();
            swipeLayout.setRefreshing(false);
        }
    };

    public void showAlertDialogButtonClicked(Main mainActivity) {

        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(this);

        builder.setTitle("Achtung!");
        builder.setMessage("Where do you go?");
        builder.setIcon(R.drawable.iconografia_b_foreground);
        builder.setCancelable(true);

        builder.setPositiveButton("Scrolling", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent2 = new Intent(Main.this, Profile.class);
                startActivity(intent2);
                //dialog.dismiss();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

}