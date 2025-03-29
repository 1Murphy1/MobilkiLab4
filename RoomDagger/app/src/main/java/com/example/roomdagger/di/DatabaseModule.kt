package com.example.roomdagger.di

import android.content.Context
import com.example.roomdagger.data.NoteDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(context: Context): NoteDatabase {
        return NoteDatabase.getDatabase(context)
    }

    @Provides
    fun provideNoteDao(noteDatabase: NoteDatabase) = noteDatabase.noteDao()
}
