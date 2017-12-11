package com.londonappbrewery.quizzler;

/**
 * Created by david on 12/10/2017.
 */

public class TrueFalse {

    private int mQuestionID;
    private boolean mAnswer;

    // created constructor for the value of question and trueOrFalse
    public TrueFalse(int questionResourceID, boolean trueOrFalse) {

        mQuestionID = questionResourceID;
        mAnswer = trueOrFalse;
    }

    public int getQuestionID() {
        return mQuestionID;
    }

    public void setQuestionID(int questionID) {
        mQuestionID = questionID;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
