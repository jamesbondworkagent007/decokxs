package com.ibm.icu.impl.locale;

/* JADX INFO: loaded from: classes3.dex */
public class LocaleSyntaxException extends Exception {
    private static final long serialVersionUID = 1;
    private int _index;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getErrorIndex() {
        return this._index;
    }

    public LocaleSyntaxException(String str) {
        this(str, 0);
    }

    public LocaleSyntaxException(String str, int i) {
        super(str);
        this._index = i;
    }
}
