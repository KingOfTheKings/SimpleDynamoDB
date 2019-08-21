package edu.buffalo.cse.cse486586.simpledynamo;

public enum MessageType {
    INSERT,
    INSERT_ACK,
    DELETE,
    DELETE_SUCC,
    DELETE_FAIL,
    JOIN_ACK,
    JOIN,
    QUERY,
    QUERY_ACK;

}
