package com.fasterxml.jackson.annotation;

/* JADX INFO: loaded from: classes21.dex */
public enum PropertyAccessor {
    GETTER,
    SETTER,
    CREATOR,
    FIELD,
    IS_GETTER,
    NONE,
    ALL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean creatorEnabled() {
        return this == CREATOR || this == ALL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fieldEnabled() {
        return this == FIELD || this == ALL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean getterEnabled() {
        return this == GETTER || this == ALL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isGetterEnabled() {
        return this == IS_GETTER || this == ALL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean setterEnabled() {
        return this == SETTER || this == ALL;
    }
}
