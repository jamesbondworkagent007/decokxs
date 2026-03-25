package o;

import kotlin.text.CharsKt__CharJVMKt;

/* JADX INFO: renamed from: o.zhj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59475zhj extends CharsKt__CharJVMKt {
    public static int AEQbTJ(char c) {
        int iCopydefault = CharsKt__CharJVMKt.copydefault(c, 10);
        if (iCopydefault >= 0) {
            return iCopydefault;
        }
        throw new java.lang.IllegalArgumentException("Char " + c + " is not a decimal digit");
    }

    public static java.lang.String AhwBna(char c) {
        return C59461zhV.AEQbTJ(c);
    }

    public static /* synthetic */ boolean equals$default(char c, char c2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return OLrzqt(c, c2, z);
    }

    public static final boolean OLrzqt(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = java.lang.Character.toUpperCase(c);
        char upperCase2 = java.lang.Character.toUpperCase(c2);
        return upperCase == upperCase2 || java.lang.Character.toLowerCase(upperCase) == java.lang.Character.toLowerCase(upperCase2);
    }
}
