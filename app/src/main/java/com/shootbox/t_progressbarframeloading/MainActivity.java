package com.shootbox.t_progressbarframeloading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ProgressBar progressBar= (ProgressBar) findViewById(R.id.progress);
		progressBar.setVisibility(View.VISIBLE);
//		progressBar.setVisibility(View.GONE);
	}
}
