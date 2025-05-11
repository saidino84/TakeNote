package com.saidinosystems.uixchalange.db.provider

import android.provider.ContactsContract.CommonDataKinds.Note
import android.util.Log
import androidx.compose.runtime.mutableStateOf

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue


import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore

class AppDataBase{
    val db = Firebase.firestore;

    fun saveSomeThingTest(): Boolean{
        val TAG = "AppDataBase"
        var sucess by mutableStateOf(false)
        val user = hashMapOf(
            "first" to "Saidino",
            "last" to "Esperanca",
            "born" to 1996,
        )
        db.collection("usertest").add(user)
            .addOnSuccessListener { documentReference ->
                Log.d(TAG, "DocumentSnapshot added with ID: ${documentReference.id}")
                sucess=true
            }
            .addOnFailureListener { e ->
                Log.w(TAG, "Error adding document", e)
                sucess=false

            }

        return sucess

    }

}