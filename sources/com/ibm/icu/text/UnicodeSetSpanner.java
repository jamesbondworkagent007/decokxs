package com.ibm.icu.text;

/* JADX INFO: loaded from: classes22.dex */
public class UnicodeSetSpanner {
    public final UnicodeSet OLrzqt;

    public enum CountMethod {
        WHOLE_SPAN,
        MIN_ELEMENTS
    }

    public enum TrimOption {
        LEADING,
        BOTH,
        TRAILING
    }

    public boolean equals(Object obj) {
        return (obj instanceof UnicodeSetSpanner) && this.OLrzqt.equals(((UnicodeSetSpanner) obj).OLrzqt);
    }

    public int hashCode() {
        return this.OLrzqt.hashCode();
    }
}
