package com.morningstarwang.sensorlookuper

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val smm = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        val sensor = smm.getSensorList(Sensor.TYPE_ALL)
        lv_sensor_list.adapter = ArrayAdapter<Sensor>(this,
            android.R.layout.simple_list_item_1,
            sensor)
    }
}
