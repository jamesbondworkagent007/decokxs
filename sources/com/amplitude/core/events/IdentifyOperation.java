package com.amplitude.core.events;

/* JADX INFO: loaded from: classes2.dex */
public enum IdentifyOperation {
    SET("$set"),
    SET_ONCE("$setOnce"),
    ADD("$add"),
    APPEND("$append"),
    CLEAR_ALL("$clearAll"),
    PREPEND("$prepend"),
    UNSET("$unset"),
    PRE_INSERT("$preInsert"),
    POST_INSERT("$postInsert"),
    REMOVE("$remove");

    private final String operationType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOperationType() {
        return this.operationType;
    }

    IdentifyOperation(String str) {
        this.operationType = str;
    }
}
