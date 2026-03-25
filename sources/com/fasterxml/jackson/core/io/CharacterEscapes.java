package com.fasterxml.jackson.core.io;

import java.io.Serializable;
import java.util.Arrays;
import o.C5521Ux;
import o.InterfaceC5501Ue;

/* JADX INFO: loaded from: classes21.dex */
public abstract class CharacterEscapes implements Serializable {
    public static final int ESCAPE_CUSTOM = -2;
    public static final int ESCAPE_NONE = 0;
    public static final int ESCAPE_STANDARD = -1;

    public abstract int[] getEscapeCodesForAscii();

    public abstract InterfaceC5501Ue getEscapeSequence(int i);

    public static int[] standardAsciiEscapesForJSON() {
        int[] iArrOLrzqt = C5521Ux.OLrzqt();
        return Arrays.copyOf(iArrOLrzqt, iArrOLrzqt.length);
    }
}
