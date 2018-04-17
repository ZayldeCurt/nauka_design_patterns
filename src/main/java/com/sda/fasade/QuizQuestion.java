package com.sda.fasade;

import java.util.List;

public class QuizQuestion {
    private String question;
    private List<String> possibleAnsers;
    private char answer;

    public QuizQuestion(String question, List<String> possibleAnsers, char answer) {
        this.question = question;
        this.possibleAnsers = possibleAnsers;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getPossibleAnsers() {
        return possibleAnsers;
    }

    public void setPossibleAnsers(List<String> possibleAnsers) {
        this.possibleAnsers = possibleAnsers;
    }

    public char getAnswer() {
        return answer;
    }

    public void setAnswer(char answer) {
        this.answer = answer;
    }
}
