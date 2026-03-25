package com.ibm.icu.text;

import com.ibm.icu.text.Normalizer;
import o.C7067aco;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Normalizer2 {

    /* JADX INFO: loaded from: classes14.dex */
    public enum Mode {
        COMPOSE,
        DECOMPOSE,
        FCD,
        COMPOSE_CONTIGUOUS
    }

    public int AEQbTJ(int i) {
        return 0;
    }

    public abstract StringBuilder EZpvd(StringBuilder sb, CharSequence charSequence);

    public abstract boolean KWHzl(CharSequence charSequence);

    public abstract Normalizer.QuickCheckResult OLrzqt(CharSequence charSequence);

    public abstract StringBuilder OLrzqt(StringBuilder sb, CharSequence charSequence);

    public abstract boolean OLrzqt(int i);

    public abstract int copydefault(CharSequence charSequence);

    public abstract StringBuilder copydefault(CharSequence charSequence, StringBuilder sb);

    public abstract boolean copydefault(int i);

    public static Normalizer2 copydefault() {
        return C7067aco.AEQbTJ().KWHzl;
    }

    public static Normalizer2 OLrzqt() {
        return C7067aco.AEQbTJ().AEQbTJ;
    }

    public static Normalizer2 EZpvd() {
        return C7067aco.OLrzqt().KWHzl;
    }

    public static Normalizer2 AEQbTJ() {
        return C7067aco.OLrzqt().AEQbTJ;
    }

    public String EZpvd(CharSequence charSequence) {
        if (charSequence instanceof String) {
            int iCopydefault = copydefault(charSequence);
            if (iCopydefault == charSequence.length()) {
                return (String) charSequence;
            }
            if (iCopydefault != 0) {
                StringBuilder sb = new StringBuilder(charSequence.length());
                sb.append(charSequence, 0, iCopydefault);
                return EZpvd(sb, charSequence.subSequence(iCopydefault, charSequence.length())).toString();
            }
        }
        return copydefault(charSequence, new StringBuilder(charSequence.length())).toString();
    }

    @Deprecated
    public Normalizer2() {
    }
}
