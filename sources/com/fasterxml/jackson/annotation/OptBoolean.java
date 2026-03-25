package com.fasterxml.jackson.annotation;

/* JADX INFO: loaded from: classes21.dex */
public enum OptBoolean {
    TRUE,
    FALSE,
    DEFAULT;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Boolean asBoolean() {
        if (this == DEFAULT) {
            return null;
        }
        return this == TRUE ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean asPrimitive() {
        return this == TRUE;
    }

    public static OptBoolean fromBoolean(Boolean bool) {
        return bool == null ? DEFAULT : bool.booleanValue() ? TRUE : FALSE;
    }

    public static boolean equals(Boolean bool, Boolean bool2) {
        if (bool == null) {
            return bool2 == null;
        }
        return bool.equals(bool2);
    }
}
