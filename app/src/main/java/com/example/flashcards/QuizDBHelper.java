package com.example.flashcards;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.flashcards.QuizContract.*;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class QuizDBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "flashcards.db";
    private static final int DATABASE_VERSION = 6;

    private SQLiteDatabase db;

    public QuizDBHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionsTable.TABLE_NAME + " ( " +
                QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuestionsTable.COLUMN_ANSWER_NUM + " INTEGER" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuestionsTable.TABLE_NAME);
        onCreate(db);

    }

    private void fillQuestionsTable(){
        Question q1 = new Question("What is inheritance in object-oriented programming?", "A type of computer programming (software design) in which programmers define the data type of a data structure and also the functions that can be applied to it", "Allows classes to inherit commonly used state and behavior from other classes", "The wrapping up of data under a single unit; mechanism that binds code and the data it manipulates", "Each piece or module contains everything necessary to execute one aspect of desired functionality",2);
        addQuestion(q1);
        Question q2 = new Question("What is object-oriented programming?", "Allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters or both", "Allows classes to inherit commonly used state and behavior from other classes", "A blueprint from which individual objects are created", "A type of computer programming (software design) in which programmers define the data type of a data structure and also the functions that can be applied to it", 4);
        addQuestion(q2);
        Question q3 = new Question("What is modularity in computer science?", "Each piece or module contains everything necessary to execute one aspect of desired functionality", "Allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters or both", "A software bundle of related state and behavior", "Allows classes to inherit commonly used state and behavior from other classes", 1);
        addQuestion(q3);
        Question q4 = new Question("What is method overloading?", "A feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes", "The wrapping up of data under a single unit; mechanism that binds code and the data it manipulates", "Allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters or both", "A blueprint from which individual objects are created", 3);
        addQuestion(q4);
        Question q5 = new Question("What is encapsulation?", "Allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters or both", "Allows you to define one interface and have multiple implementations", "A feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes", "The wrapping up of data under a single unit; mechanism that binds code and the data it manipulates", 4);
        addQuestion(q5);
        Question q6 = new Question("What is an object in object-oriented programming?", "A blueprint from which individual objects are created", "Allows you to define one interface and have multiple implementations", "A software bundle of related state and behavior", "It specifies what a class must do, but not how", 3);
        addQuestion(q6);
        Question q7 = new Question("What is a class in object-oriented programming?", "A type of computer programming (software design) in which programmers define the data type of a data structure and also the functions that can be applied to it", "A blueprint from which individual objects are created", "The wrapping up of data under a single unit; mechanism that binds code and the data it manipulates", "Each piece or module contains everything necessary to execute one aspect of desired functionality",2);
        addQuestion(q7);
        Question q8 = new Question("What is a memory cell?", "The fundamental building block of computer memory", "Used for mass storage devices including SSDs", "Used for code execution because of its fast read times", "A solid-state non-volatile memory medium that can be erased and reprogrammed", 1);
        addQuestion(q8);
        Question q9 = new Question("What is flash storage?", "A solid-state non-volatile memory medium that can be erased and reprogrammed", "The fundamental building block of computer memory", "A software bundle of related state and behavior", "Specifies what a class must do, but not how", 1);
        addQuestion(q9);
        Question q10 = new Question("When is recursion useful?", "When you want to return a value quickly", "When there's a condition involved", "When solving problems that can be broken down into smaller, repetitive problems", "When we know how many times we need to execute a block of code", 3);
        addQuestion(q10);
        Question q11 = new Question("What is NOR flash primarily used for?", "Used for mass storage devices including SSDs", "Used in many processor systems to provide the working memory", "Primarily used for caching", "Used for code execution because of its fast read times", 4);
        addQuestion(q11);
        Question q12 = new Question("What is SRAM used for?", "Used primarily for caching", "Used for mass storage devices including SSDs", "Used in many processor systems to provide the working memory", "Used primarily for main memory", 1);
        addQuestion(q12);
        Question q13 = new Question("What is DRAM used for?", "Used for code execution because of its fast read times", "Used primarily for caching", "Used primarily for main memory", "Used for mass storage devices including SSDs",3);
        addQuestion(q13);
        Question q14 = new Question("What is overriding?", "Allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters or both", "Allows classes to inherit commonly used state and behavior from other classes", "Allows you to define one interface and have multiple implementations", "A feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes", 4);
        addQuestion(q14);
        Question q15 = new Question("What is polymorphism?", "Allows you to define one interface and have multiple implementations", "Allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters or both", "A software bundle of related state and behavior", "Allows classes to inherit commonly used state and behavior from other classes", 1);
        addQuestion(q15);
        Question q16 = new Question("What is an interface?", "A feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes", "The wrapping up of data under a single unit; mechanism that binds code and the data it manipulates", "Specifies what a class must do, but not how", "A blueprint from which individual objects are created", 3);
        addQuestion(q16);
        Question q17 = new Question("Select the two general categories of NOR flash", "Single-level cell and multi-level cell", "Serial and single-level cell", "Parallel and multi-level cell", "Serial and parallel", 4);
        addQuestion(q17);
        Question q18 = new Question("What are the two general categories of NAND flash?", "Serial and single-level cell", "Single-level cell and multi-level cell", "Parallel and multi-level cell", "Serial and parallel", 2);
        addQuestion(q18);
        Question q19 = new Question("What is a MOSFET?", "The smallest building block of computer memory", "A generic term for any semiconductor memory that can be written to, as well as read from", "The most common semiconductor device in digital and analog circuits, and the most common power device", "A device designed to hold permanent data, and in normal operation is only read from, not written to",3);
        addQuestion(q19);
        Question q20 = new Question("What is a word in computer science?", "A character sequence", "A unit of digital information that most commonly consists of eight bits", "A string of non-numeric characters", "A fixed-sized piece of data handled as a unit by the instruction set or the hardware of the processor", 4);
        addQuestion(q20);
        Question q21 = new Question("What is modularity in computer science?", "Each piece or module contains everything necessary to execute one aspect of desired functionality", "Allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters or both", "A software bundle of related state and behavior", "Allows classes to inherit commonly used state and behavior from other classes", 1);
        addQuestion(q21);
        Question q22 = new Question("What is method overloading?", "A feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes", "The wrapping up of data under a single unit; mechanism that binds code and the data it manipulates", "Allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters or both", "A blueprint from which individual objects are created", 3);
        addQuestion(q22);
        Question q23 = new Question("What is encapsulation?", "Allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters or both", "Allows you to define one interface and have multiple implementations", "A feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes", "The wrapping up of data under a single unit; mechanism that binds code and the data it manipulates", 1);
        addQuestion(q23);
        Question q24 = new Question("What is encapsulation?", "Allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters or both", "Allows you to define one interface and have multiple implementations", "A feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes", "The wrapping up of data under a single unit; mechanism that binds code and the data it manipulates", 2);
        addQuestion(q24);
        Question q25 = new Question("What is encapsulation?", "Allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters or both", "Allows you to define one interface and have multiple implementations", "A feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes", "The wrapping up of data under a single unit; mechanism that binds code and the data it manipulates", 2);
        addQuestion(q25);
    }

    private void addQuestion(Question question){
        ContentValues cv = new ContentValues();
        cv.put(QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuestionsTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuestionsTable.COLUMN_OPTION4, question.getOption4());
        cv.put(QuestionsTable.COLUMN_ANSWER_NUM, question.getAnswerNum());
        db.insert(QuestionsTable.TABLE_NAME, null, cv);
    }

    public ArrayList<Question> getAllQuestions(){
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME, null);
        if(c.moveToFirst()){
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION4)));
                question.setAnswerNum(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NUM)));
                questionList.add(question);
            }while(c.moveToNext());
        }
        c.close();
        return questionList;
    }
}
