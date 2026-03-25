package com.ibm.icu.impl.number;

import com.ibm.icu.impl.StandardPlural;
import o.C7020abU;
import o.InterfaceC7176aer;

/* JADX INFO: loaded from: classes3.dex */
public interface Modifier {

    public enum Signum {
        NEG,
        NEG_ZERO,
        POS_ZERO,
        POS;

        public static final int COUNT = values().length;
    }

    public static class TaskDescription {
        public Signum AEQbTJ;
        public InterfaceC7176aer EZpvd;
        public StandardPlural OLrzqt;
    }

    int AEQbTJ();

    int AEQbTJ(C7020abU c7020abU, int i, int i2);

    int OLrzqt();
}
