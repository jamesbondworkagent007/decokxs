package o;

import com.google.common.primitives.UnsignedBytes;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.bouncycastle.crypto.hpke.HPKE;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.asn1.cmc.BodyPartID;

/* JADX INFO: renamed from: o.zhU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59460zhU {
    public static final java.lang.String KWHzl(byte b, int i) {
        java.lang.String string = java.lang.Integer.toString(b & UnsignedBytes.MAX_VALUE, CharsKt__CharJVMKt.checkRadix(i));
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final java.lang.String copydefault(short s, int i) {
        java.lang.String string = java.lang.Integer.toString(s & HPKE.aead_EXPORT_ONLY, CharsKt__CharJVMKt.checkRadix(i));
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final java.lang.String EZpvd(long j, int i) {
        return C56399yDy.OLrzqt(j, CharsKt__CharJVMKt.checkRadix(i));
    }

    public static final byte AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C56393yDs c56393yDsOLrzqt = OLrzqt(str);
        if (c56393yDsOLrzqt != null) {
            return c56393yDsOLrzqt.OLrzqt();
        }
        StringsKt__StringNumberConversionsKt.ejfBZ(str);
        throw new KotlinNothingValueException();
    }

    public static final short valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        yDB ydbDjBIcL = djBIcL(str);
        if (ydbDjBIcL != null) {
            return ydbDjBIcL.EZpvd();
        }
        StringsKt__StringNumberConversionsKt.ejfBZ(str);
        throw new KotlinNothingValueException();
    }

    public static final short AEQbTJ(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        yDB ydbEZpvd = EZpvd(str, i);
        if (ydbEZpvd != null) {
            return ydbEZpvd.EZpvd();
        }
        StringsKt__StringNumberConversionsKt.ejfBZ(str);
        throw new KotlinNothingValueException();
    }

    public static final int copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C56395yDu c56395yDuEZpvd = EZpvd(str);
        if (c56395yDuEZpvd != null) {
            return c56395yDuEZpvd.copydefault();
        }
        StringsKt__StringNumberConversionsKt.ejfBZ(str);
        throw new KotlinNothingValueException();
    }

    public static final long KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C56396yDv c56396yDvGEmmrt = gEmmrt(str);
        if (c56396yDvGEmmrt != null) {
            return c56396yDvGEmmrt.OLrzqt();
        }
        StringsKt__StringNumberConversionsKt.ejfBZ(str);
        throw new KotlinNothingValueException();
    }

    public static final C56393yDs OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return copydefault(str, 10);
    }

    public static final C56393yDs copydefault(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        C56395yDu c56395yDuKWHzl = KWHzl(str, i);
        if (c56395yDuKWHzl == null) {
            return null;
        }
        int iCopydefault = c56395yDuKWHzl.copydefault();
        if (java.lang.Integer.compare(iCopydefault ^ Integer.MIN_VALUE, C56395yDu.EZpvd(255) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return C56393yDs.OLrzqt(C56393yDs.copydefault((byte) iCopydefault));
    }

    public static final yDB djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return EZpvd(str, 10);
    }

    public static final yDB EZpvd(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        C56395yDu c56395yDuKWHzl = KWHzl(str, i);
        if (c56395yDuKWHzl == null) {
            return null;
        }
        int iCopydefault = c56395yDuKWHzl.copydefault();
        if (java.lang.Integer.compare(iCopydefault ^ Integer.MIN_VALUE, C56395yDu.EZpvd(65535) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return yDB.EZpvd(yDB.AEQbTJ((short) iCopydefault));
    }

    public static final C56395yDu EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl(str, 10);
    }

    public static final C56395yDu KWHzl(@NotNull java.lang.String str, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(str, "");
        CharsKt__CharJVMKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.copydefault((int) cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        int iEZpvd = C56395yDu.EZpvd(i);
        int iEZpvd2 = 119304647;
        while (i2 < length) {
            int iCopydefault = CharsKt__CharJVMKt.copydefault(str.charAt(i2), i);
            if (iCopydefault < 0) {
                return null;
            }
            if (java.lang.Integer.compare(i3 ^ Integer.MIN_VALUE, iEZpvd2 ^ Integer.MIN_VALUE) > 0) {
                if (iEZpvd2 == 119304647) {
                    iEZpvd2 = C7988auH.EZpvd(-1, iEZpvd);
                    if (java.lang.Integer.compare(i3 ^ Integer.MIN_VALUE, iEZpvd2 ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int iEZpvd3 = C56395yDu.EZpvd(i3 * iEZpvd);
            int iEZpvd4 = C56395yDu.EZpvd(C56395yDu.EZpvd(iCopydefault) + iEZpvd3);
            if (java.lang.Integer.compare(iEZpvd4 ^ Integer.MIN_VALUE, iEZpvd3 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i2++;
            i3 = iEZpvd4;
        }
        return C56395yDu.AEQbTJ(i3);
    }

    public static final C56396yDv gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return OLrzqt(str, 10);
    }

    public static final C56396yDv OLrzqt(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        CharsKt__CharJVMKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.copydefault((int) cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long jCopydefault = C56396yDv.copydefault(i);
        long j = 0;
        long jCopydefault2 = 512409557603043100L;
        while (i2 < length) {
            int iCopydefault = CharsKt__CharJVMKt.copydefault(str.charAt(i2), i);
            if (iCopydefault < 0) {
                return null;
            }
            if (java.lang.Long.compare(j ^ Long.MIN_VALUE, jCopydefault2 ^ Long.MIN_VALUE) > 0) {
                if (jCopydefault2 == 512409557603043100L) {
                    jCopydefault2 = C7994auN.copydefault(-1L, jCopydefault);
                    if (java.lang.Long.compare(j ^ Long.MIN_VALUE, jCopydefault2 ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            long jCopydefault3 = C56396yDv.copydefault(j * jCopydefault);
            long jCopydefault4 = C56396yDv.copydefault(C56396yDv.copydefault(((long) C56395yDu.EZpvd(iCopydefault)) & BodyPartID.bodyIdMax) + jCopydefault3);
            if (java.lang.Long.compare(jCopydefault4 ^ Long.MIN_VALUE, jCopydefault3 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i2++;
            j = jCopydefault4;
        }
        return C56396yDv.KWHzl(j);
    }
}
