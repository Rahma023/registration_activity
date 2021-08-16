package com.example.registration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var etNameLbl: EditText
    lateinit var etDobLbl: EditText
    lateinit var etIdLbl: EditText
    lateinit var etPhoneLbl: TextView
    lateinit var etEmailLbl: EditText
    lateinit var btnbutton: Button
    lateinit var spnationality:Spinner


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setView()
        clickRegister()
    }
fun setView() {
    etNameLbl = findViewById(R.id.etName)
    etDobLbl = findViewById(R.id.etDobLbl)
    etIdLbl = findViewById(R.id.etIdLbl)
    etPhoneLbl = findViewById(R.id.etPhoneLbl)
    etEmailLbl = findViewById(R.id.etEmailLbl)
    btnbutton = findViewById(R.id.btnbutton)
    spnationality=findViewById(R.id.spnationality)
    var nationalities= arrayOf("Select Nationality","Kenyan","Rwandan","South Sudaneese","Ugandan")
    var nationalityAdapter=ArrayAdapter(baseContext,android.R.layout.simple_spinner_item,nationalities)
    nationalityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
    spnationality.adapter=nationalityAdapter

}
    fun clickRegister(){
        btnbutton.setOnClickListener {
            var name=etNameLbl.text.toString()
            var dob=etDobLbl.text.toString()
            var idNo=etIdLbl.text.toString()
            var nationality=spnationality.selectedItem.toString()
            var phone=etPhoneLbl.text.toString()
            var email=etEmailLbl.text.toString()
            var student=Student(name,dob, idNo, nationality, phone, email )
            Toast.makeText(baseContext, student.toString(), Toast.LENGTH_LONG).show()
            val intent=Intent(baseContext, Courses2Activity::class.java)
            startActivity(intent)

        }
}}
data class Student(
    var name: String,
    var dob: String,
    var idNo: String,
    var nationality: String,
    var phoneNumber: String,
    var email: String

)

