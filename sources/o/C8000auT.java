package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.auT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C8000auT {
    public static /* synthetic */ int toDigit$default(char c, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 10;
        }
        return KWHzl(c, i);
    }

    public static final int KWHzl(char c, int i) {
        int i2;
        int i3;
        if ('0' <= c && c <= '9') {
            i3 = (char) (c - '0');
        } else if ('a' <= c && c <= 'z') {
            i3 = c - 87;
        } else if ('A' > c || c > 'Z') {
            if (65313 <= c && c <= 65338) {
                i2 = 65323;
            } else {
                if (65345 > c || c > 65370) {
                    if (c == '.') {
                        throw new java.lang.NumberFormatException("Invalid digit for radix " + c + " (Possibly a decimal value, which is not supported by BigInteger parser");
                    }
                    throw new java.lang.NumberFormatException(Intrinsics.KWHzl("Invalid digit for radix ", java.lang.Character.valueOf(c)));
                }
                i2 = 65355;
            }
            i3 = c - i2;
        } else {
            i3 = c - 55;
        }
        if (i3 >= 0 && i3 < i) {
            return i3;
        }
        throw new java.lang.NumberFormatException(c + " is not a valid digit for number system with base " + i);
    }
}
