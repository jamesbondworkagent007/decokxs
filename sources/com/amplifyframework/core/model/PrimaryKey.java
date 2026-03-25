package com.amplifyframework.core.model;

/* JADX INFO: loaded from: classes21.dex */
public final class PrimaryKey {
    private static final String ID = "id";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String fieldName() {
        return "id";
    }

    private PrimaryKey() {
    }

    public static boolean matches(Object obj) {
        return (obj instanceof String) && fieldName().equals(obj);
    }
}
