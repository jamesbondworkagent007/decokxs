package com.amplifyframework.api.graphql;

/* JADX INFO: loaded from: classes21.dex */
public enum OperationType {
    QUERY("query"),
    MUTATION("mutation"),
    SUBSCRIPTION("subscription");

    private final String name;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getName() {
        return this.name;
    }

    OperationType(String str) {
        this.name = str;
    }
}
