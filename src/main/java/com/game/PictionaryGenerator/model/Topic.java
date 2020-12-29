package com.game.PictionaryGenerator.model;

public class Topic {
    private String topic;
    private String hint;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "topic='" + topic + '\'' +
                ", hint='" + hint + '\'' +
                '}';
    }
}
