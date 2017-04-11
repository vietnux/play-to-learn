package com.avoid.playtolearn.cache;

import com.avoid.playtolearn.model.Question;

import java.util.ArrayList;

public class QuestionCache {
    private static ArrayList<Question> questionArrayList = new ArrayList<>();

    public static ArrayList<Question> getQuestionArrayList() {
        return questionArrayList;
    }

    public static void setQuestionArrayList(ArrayList<Question> questionArrayList) {
        QuestionCache.questionArrayList = questionArrayList;
    }
}
