package com.ev55.roomapplication

import androidx.room.*

@Entity(tableName = "word_table")
class Word(@PrimaryKey @ColumnInfo(name = "word") val word: String)
