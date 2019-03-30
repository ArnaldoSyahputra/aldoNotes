package com.kunthu.arnaldo.aldoNotes;

import com.kunthu.arnaldo.aldoNotes.entity.Note;

import java.util.ArrayList;


public interface LoadNotesCallback {
    void preExecute();

    void postExecute(ArrayList<Note> notes);
}

