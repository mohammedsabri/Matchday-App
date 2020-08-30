package com.example.matchdayapp.activities.activities

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.widget.DatePicker
import android.widget.TimePicker
import androidx.appcompat.app.AppCompatActivity
import com.example.matchdayapp.R
import kotlinx.android.synthetic.main.activity_matchdatetime.*
import java.util.*

class MatchdatetimeActivity : AppCompatActivity(), DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {


    var day = 0
    var month = 0
    var year = 0
    var hour = 0
    var minute = 0


    var saveDay = 0
    var saveMonth = 0
    var saveYear = 0
    var saveHour = 0
    var saveMinute = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matchdatetime)
    pickDate()

    }

    private fun getDateTimeCalender(){
        val cal = Calendar.getInstance()
        day = cal.get(Calendar.DAY_OF_MONTH)
        month = cal.get(Calendar.MONTH)
        year = cal.get(Calendar.YEAR)
        hour = cal.get(Calendar.HOUR)
        minute = cal.get(Calendar.MINUTE)




    }
    private fun pickDate() {
        btn_timePicker.setOnClickListener {
            getDateTimeCalender()


            DatePickerDialog(this,this,year,month,day).show()

        }
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {

        saveDay = dayOfMonth
        saveMonth = month
        saveYear = year

        getDateTimeCalender()

        TimePickerDialog(this,this,hour,minute,true).show()



    }

    @SuppressLint("SetTextI18n")
    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
        saveHour = hourOfDay
        saveMinute = minute

        btn_matchTime.text = "$saveDay-$saveMonth-$saveYear\n Hour: $saveHour Minute: $saveMinute"
    }
}