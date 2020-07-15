package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.util.Log;

import com.example.myapplication.R;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity /*implements OnChartValueSelectedListener */{
    /*PieChart pieChart;
    ArrayList yvalues;
    ArrayList xVals;
    PieData data;
    PieDataSet dataSet;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        /*pieChart = findViewById(R.id.piechart);
        pieChart.setUsePercentValues(true);

        yvalues = new ArrayList<>();
        yvalues.add(new Entry(50f, 0));
        yvalues.add(new Entry(50f, 1));

        dataSet = new PieDataSet(yvalues, "Results");

        xVals = new ArrayList<String>();

        xVals.add("Yes");
        xVals.add("No");

        data = new PieData(dataSet);

        data.setValueFormatter(new PercentFormatter());

        pieChart.setData(data);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setTransparentCircleRadius(58f);

        pieChart.setHoleRadius(58f);
        dataSet.setColors(ColorTemplate.VORDIPLOM_COLORS);

        data.setValueTextSize(13f);
        data.setValueTextColor(Color.DKGRAY);

        pieChart.setOnChartValueSelectedListener(this);

    }

    @Override
    public void onValueSelected(Entry e, Highlight h) {
        if (e == null)
            return;
        Log.i("VAL SELECTED","Value: " + e.getY() + ", index: " + h.getX()
                + ", DataSet index: " + h.getDataSetIndex());
    }

    @Override
    public void onNothingSelected() {
        Log.i("PieChart", "nothing selected");*/
    }
    }
