package edu.buffalo.cse.cse486586.simpledynamo;

import java.io.Serializable;

public class Message implements Serializable {

    private MessageType type;
    private String content;

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Message(){

    }
}
