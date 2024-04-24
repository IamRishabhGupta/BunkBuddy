package com.tejasdev.bunkbuddy.interfaces

import androidx.lifecycle.LiveData
import com.tejasdev.bunkbuddy.datamodel.HistoryItem
import com.tejasdev.bunkbuddy.datamodel.Lecture
import com.tejasdev.bunkbuddy.datamodel.Subject

interface SubjectRepositoryInterface {
    fun getAllSubjects(): LiveData<List<Subject>>
    suspend fun updateSubjectAndLectures(subject: Subject)

    fun getTotalMissedClasses(): LiveData<Int>
    fun getTotalAttendedClasses(): LiveData<Int>

    fun getSubjectSync(): List<Subject>

    suspend fun addSubject(subject: Subject)

    suspend fun deleteSubject(subject: Subject)

    fun getAllLectures(): List<Lecture>

    fun updateSubject(subject: Subject)

    fun addLecture(lecture: Lecture): Int

    fun deleteLecture(lecture: Lecture)

    fun getLecturesForDay(day: Int): LiveData<List<Lecture>>

    fun getHistory(): LiveData<List<HistoryItem>>

    suspend fun addHistoryItem(history: HistoryItem)

}