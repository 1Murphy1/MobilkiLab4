package com.example.roomdagger.ui

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.roomdagger.MyApplication
import com.example.roomdagger.data.Note
import com.example.roomdagger.ui.NoteViewModel
import com.example.roomdagger.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var noteViewModel: NoteViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as MyApplication).appComponent.inject(this)

        val btnAddNote: Button = findViewById(R.id.btnAddNote)

        btnAddNote.setOnClickListener {
            val newNote = Note(
                title = "New Note",
                content = "This is a note",
                timestamp = System.currentTimeMillis()
            )
            noteViewModel.addNote(newNote)
        }
    }
}
