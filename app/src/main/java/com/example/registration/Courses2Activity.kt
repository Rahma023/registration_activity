package com.example.registration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Courses2Activity : AppCompatActivity() {
   // lateinit var rvcourse:RecyclerView
   lateinit var rvcourse: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses2)
        displayCourses()
    }
//    fun display(){
//        var coursesList= listOf<Courses>(
//            Courses("Android","Mobile101","Introduction to Mobile development","John Owour"),
//            Courses("JavaScript","JavaScript102","Introduction to Web development","Purity"),
//            Courses("Android","Mobile101","Introduction to Mobile development","John Owour"),
//            Courses("Android","Mobile101","Introduction to Mobile development","John Owour"),
//            Courses("Android","Mobile101","Introduction to Mobile development","John Owour"),
//            Courses("JavaScript","JavaScript102","Introduction to Web development","Purity"),
//            Courses("Android","Mobile101","Introduction to Mobile development","John Owour"),
//            Courses("Android","Mobile101","Introduction to Mobile development","John Owour"),
//            Courses("Android","Mobile101","Introduction to Mobile development","John Owour")
//
//        )

    fun displayCourses(){
        var coursesList= listOf<course>(
            course("Android","AND 101","Native android development","John Owuor"),
            course("Python","PY 101","Backend development with Python","James Mwai"),
            course("JavaScript","JS 101","JavaScript for the web","Purity Maina"),
            course("Android","AND 101","Native android development","John Owuor"),



            )
        rvcourse=findViewById(R.id.rvcourse)
        var coursesAdapter=coursesRVAdapater(coursesList)
        rvcourse.layoutManager=LinearLayoutManager(baseContext)
        rvcourse.adapter=coursesAdapter
    }
}
//        rvCourses=findViewById(R.id.rvCources)
//        var coursesAdapter=CourcesRvAdapter(coursesList)
//        rvCourses.layoutManager=LinearLayoutManager(baseContext)
//        rvCourses.adapter=coursesAdapter


//    }
//}
//rvcourse=findViewById(R.id.rvcourse)
//        var coursesAdapter=coursesRVAdapater(coursesList)
//        rvcourse.layoutManager=LinearLayoutManager(baseContext)
//        rvcourse.adapter=coursesAdapter
//    }
//}