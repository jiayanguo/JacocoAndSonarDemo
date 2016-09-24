package app.entity;

import java.io.Serializable;

/**
 * Created by jiayanguo on 9/24/16.
 */
public class Message implements Serializable {
    private String name;
    private String message;

    private Long luckNumber;

    public Long getLuckNumber() {
        return luckNumber;
    }

    public void setLuckNumber(Long luckNumber) {
        this.luckNumber = luckNumber;
    }

    public Message(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
