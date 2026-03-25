package com.amplifyframework.core.model.query.predicate;

/* JADX INFO: loaded from: classes21.dex */
public abstract class QueryOperator<T> implements Evaluable<T> {
    private final Type type;

    public enum Type {
        NOT_EQUAL,
        EQUAL,
        LESS_OR_EQUAL,
        LESS_THAN,
        GREATER_OR_EQUAL,
        GREATER_THAN,
        CONTAINS,
        NOT_CONTAINS,
        BETWEEN,
        BEGINS_WITH
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Type type() {
        return this.type;
    }

    public QueryOperator(Type type) {
        this.type = type;
    }
}
