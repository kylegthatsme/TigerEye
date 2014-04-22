package com.example.demo;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainMenuActivity extends Activity {
	private static String pt_url="http://people.clemson.edu/~myankou/php/EyeApp/points.php";
	private static String TAG_NAME = "name";
	
	
	ArrayList<Double> LatList, LonList;
	ArrayList<String> PList;
	
	ServiceHandler sh;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainmenu);
		
		Button b_start = (Button)this.findViewById(R.id.main_menu_start);
		b_start.setOnClickListener(l_start);	
		
		Button b_spots = (Button)this.findViewById(R.id.spots_near_you);
		b_spots.setOnClickListener(l_spots);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return true;
	}
	private OnClickListener l_start = new OnClickListener() {
	    public void onClick(View v) {
	      // do something when the button is clicked
	    	
	    	Intent myIntent = new Intent(v.getContext(), MainActivity.class);
	    	startActivity(myIntent);
	    }
	};
	private OnClickListener l_spots = new OnClickListener() {
	    public void onClick(View v) {
	      // do something when the button is clicked
	    	
	    	Intent myIntent = new Intent(v.getContext(), TakeMeThere.class);
	    	startActivity(myIntent);
	    }
	};
}
