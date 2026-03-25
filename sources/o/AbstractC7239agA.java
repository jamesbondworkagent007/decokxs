package o;

import java.text.CharacterIterator;

/* JADX INFO: renamed from: o.agA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7239agA implements java.lang.Cloneable {
    public abstract int AEQbTJ();

    public abstract int EZpvd();

    public abstract int KWHzl();

    public abstract int OLrzqt();

    public abstract int copydefault();

    public abstract void copydefault(int i);

    public static final AbstractC7239agA copydefault(java.lang.String str) {
        return new C7073acu(str);
    }

    public static final AbstractC7239agA copydefault(CharacterIterator characterIterator) {
        return new C7015abP(characterIterator);
    }

    public int valueOf() {
        int iKWHzl = KWHzl();
        char c = (char) iKWHzl;
        if (C7242agD.AEQbTJ(c)) {
            int iKWHzl2 = KWHzl();
            char c2 = (char) iKWHzl2;
            if (C7242agD.OLrzqt(c2)) {
                return java.lang.Character.toCodePoint(c, c2);
            }
            if (iKWHzl2 != -1) {
                copydefault();
            }
        }
        return iKWHzl;
    }

    public int AYXKKw() {
        int iCopydefault = copydefault();
        char c = (char) iCopydefault;
        if (C7242agD.OLrzqt(c)) {
            int iCopydefault2 = copydefault();
            char c2 = (char) iCopydefault2;
            if (C7242agD.AEQbTJ(c2)) {
                return java.lang.Character.toCodePoint(c2, c);
            }
            if (iCopydefault2 != -1) {
                KWHzl();
            }
        }
        return iCopydefault;
    }

    public int OLrzqt(int i) {
        int iMax = java.lang.Math.max(0, java.lang.Math.min(EZpvd() + i, AEQbTJ()));
        copydefault(iMax);
        return iMax;
    }

    public int EZpvd(int i) {
        if (i > 0) {
            while (i > 0 && valueOf() != -1) {
                i--;
            }
        } else {
            while (i < 0 && AYXKKw() != -1) {
                i++;
            }
        }
        if (i != 0) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        return EZpvd();
    }

    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return super.clone();
    }
}
