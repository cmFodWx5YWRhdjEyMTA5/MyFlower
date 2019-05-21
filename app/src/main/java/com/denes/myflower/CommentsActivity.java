package com.denes.myflower;

import java.util.Date;

public class CommentsActivity extends FlowerPostId {

    private String message,user_id;
    private Date timestamp;



    public String getMessage() {
        return message;
    }
    public CommentsActivity(){

    }

    public CommentsActivity(String message, String user_id, Date timestamp) {
        this.message = message;
        this.user_id = user_id;
        this.timestamp = timestamp;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }


}
