package com.rodrigmatrix.sippa.persistance

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "students")
data class Student(
    @PrimaryKey
    var id: Int,
    var jsession: String,
    var responseHtml: String,
    var name: String,
    var matricula: String,
    var horasComplementares: String
)