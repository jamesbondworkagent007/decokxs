package o;

import androidx.camera.video.AudioStats;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mqd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33129mqd {
    public static final RoundingMode OLrzqt = RoundingMode.DOWN;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final RoundingMode KWHzl() {
        return OLrzqt;
    }

    public static /* synthetic */ java.lang.String addS$default(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode, int i, java.lang.Object obj3) {
        if ((i & 2) != 0) {
            num = 16;
        }
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        if ((i & 8) != 0) {
            roundingMode = OLrzqt;
        }
        return copydefault(obj, obj2, num, bool, roundingMode);
    }

    public static final java.lang.String copydefault(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode) {
        if (obj == null || obj2 == null) {
            return EZpvd(copydefault("0.0"), num, bool, roundingMode);
        }
        return EZpvd(copydefault(obj).add(copydefault(obj2)), num, bool, roundingMode);
    }

    public static /* synthetic */ java.lang.String subS$default(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode, int i, java.lang.Object obj3) {
        if ((i & 2) != 0) {
            num = 16;
        }
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        if ((i & 8) != 0) {
            roundingMode = OLrzqt;
        }
        return AhwBna(obj, obj2, num, bool, roundingMode);
    }

    public static final java.lang.String AhwBna(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode) {
        if (obj == null || obj2 == null) {
            return EZpvd(copydefault("0.0"), num, bool, roundingMode);
        }
        return EZpvd(copydefault(obj).subtract(copydefault(obj2)), num, bool, roundingMode);
    }

    public static /* synthetic */ java.lang.String mulS$default(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode, int i, java.lang.Object obj3) {
        if ((i & 2) != 0) {
            num = 16;
        }
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        if ((i & 8) != 0) {
            roundingMode = OLrzqt;
        }
        return gEmmrt(obj, obj2, num, bool, roundingMode);
    }

    public static final java.lang.String gEmmrt(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode) {
        if (obj == null || obj2 == null) {
            return EZpvd(copydefault("0.0"), num, bool, roundingMode);
        }
        return EZpvd(copydefault(obj).multiply(copydefault(obj2)), num, bool, roundingMode);
    }

    public static /* synthetic */ java.lang.String divS$default(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode, int i, java.lang.Object obj3) {
        if ((i & 2) != 0) {
            num = 16;
        }
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        if ((i & 8) != 0) {
            roundingMode = OLrzqt;
        }
        return OLrzqt(obj, obj2, num, bool, roundingMode);
    }

    public static final java.lang.String OLrzqt(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode) {
        if (obj == null || obj2 == null || AEQbTJ(obj2) == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return EZpvd(copydefault("0.0"), num, bool, roundingMode);
        }
        return EZpvd(copydefault(obj).divide(copydefault(obj2), 16, 1), num, bool, roundingMode);
    }

    public static /* synthetic */ java.lang.String remS$default(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode, int i, java.lang.Object obj3) {
        if ((i & 2) != 0) {
            num = 16;
        }
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        if ((i & 8) != 0) {
            roundingMode = OLrzqt;
        }
        return djBIcL(obj, obj2, num, bool, roundingMode);
    }

    public static final java.lang.String djBIcL(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode) {
        if (obj == null || obj2 == null || AEQbTJ(obj2) == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return EZpvd(copydefault("0.0"), num, bool, roundingMode);
        }
        return EZpvd(copydefault(obj).remainder(copydefault(obj2)), num, bool, roundingMode);
    }

    public static final double KWHzl(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode) {
        return AEQbTJ(copydefault(obj, obj2, num, bool, roundingMode));
    }

    public static /* synthetic */ double addD$default(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode, int i, java.lang.Object obj3) {
        if ((i & 2) != 0) {
            num = 16;
        }
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        if ((i & 8) != 0) {
            roundingMode = OLrzqt;
        }
        return KWHzl(obj, obj2, num, bool, roundingMode);
    }

    public static /* synthetic */ double subD$default(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode, int i, java.lang.Object obj3) {
        if ((i & 2) != 0) {
            num = 16;
        }
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        if ((i & 8) != 0) {
            roundingMode = OLrzqt;
        }
        return valueOf(obj, obj2, num, bool, roundingMode);
    }

    public static final double valueOf(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode) {
        return AEQbTJ(AhwBna(obj, obj2, num, bool, roundingMode));
    }

    public static final double EZpvd(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode) {
        return AEQbTJ(gEmmrt(obj, obj2, num, bool, roundingMode));
    }

    public static /* synthetic */ double mulD$default(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode, int i, java.lang.Object obj3) {
        if ((i & 2) != 0) {
            num = 16;
        }
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        if ((i & 8) != 0) {
            roundingMode = OLrzqt;
        }
        return EZpvd(obj, obj2, num, bool, roundingMode);
    }

    public static final double AEQbTJ(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode) {
        return AEQbTJ(OLrzqt(obj, obj2, num, bool, roundingMode));
    }

    public static /* synthetic */ double divD$default(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode, int i, java.lang.Object obj3) {
        if ((i & 2) != 0) {
            num = 16;
        }
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        if ((i & 8) != 0) {
            roundingMode = OLrzqt;
        }
        return AEQbTJ(obj, obj2, num, bool, roundingMode);
    }

    public static final double AYXKKw(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode) {
        return AEQbTJ(djBIcL(obj, obj2, num, bool, roundingMode));
    }

    public static /* synthetic */ double remD$default(java.lang.Object obj, java.lang.Object obj2, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode, int i, java.lang.Object obj3) {
        if ((i & 2) != 0) {
            num = 16;
        }
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        if ((i & 8) != 0) {
            roundingMode = OLrzqt;
        }
        return AYXKKw(obj, obj2, num, bool, roundingMode);
    }

    public static final java.lang.String AEQbTJ(java.lang.Object obj, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode) {
        return EZpvd(copydefault(obj), num, bool, roundingMode);
    }

    public static /* synthetic */ java.lang.String formatS$default(java.lang.Object obj, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            num = 16;
        }
        if ((i & 2) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        if ((i & 4) != 0) {
            roundingMode = OLrzqt;
        }
        return AEQbTJ(obj, num, bool, roundingMode);
    }

    public static final double EZpvd(java.lang.Object obj, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode) {
        return AEQbTJ(EZpvd(copydefault(obj), num, bool, roundingMode));
    }

    public static /* synthetic */ double formatD$default(java.lang.Object obj, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            num = 16;
        }
        if ((i & 2) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        if ((i & 4) != 0) {
            roundingMode = OLrzqt;
        }
        return EZpvd(obj, num, bool, roundingMode);
    }

    public static /* synthetic */ java.lang.String format$default(BigDecimal bigDecimal, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = 16;
        }
        if ((i & 2) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        if ((i & 4) != 0) {
            roundingMode = OLrzqt;
        }
        return EZpvd(bigDecimal, num, bool, roundingMode);
    }

    public static final java.lang.String EZpvd(BigDecimal bigDecimal, java.lang.Integer num, java.lang.Boolean bool, RoundingMode roundingMode) {
        BigDecimal bigDecimalCopydefault = copydefault(bigDecimal);
        int iIntValue = num != null ? num.intValue() : 16;
        if (roundingMode == null) {
            roundingMode = OLrzqt;
        }
        BigDecimal scale = bigDecimalCopydefault.setScale(iIntValue, roundingMode);
        if (bool == null || bool.booleanValue()) {
            if (AEQbTJ(scale) == AudioStats.AUDIO_AMPLITUDE_NONE) {
                return "0";
            }
            scale = scale.stripTrailingZeros();
        }
        java.lang.String plainString = scale.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "");
        return plainString;
    }

    public static final BigDecimal copydefault(java.lang.Object obj) {
        BigDecimal bigDecimal;
        try {
            if (obj == null) {
                bigDecimal = new BigDecimal("0.0");
            } else {
                bigDecimal = obj instanceof BigDecimal ? (BigDecimal) obj : new BigDecimal(obj.toString());
            }
            return bigDecimal;
        } catch (java.lang.Exception unused) {
            return new BigDecimal("0.0");
        }
    }

    public static final double AEQbTJ(java.lang.Object obj) {
        try {
            return copydefault(obj).doubleValue();
        } catch (java.lang.Exception unused) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
    }

    public static final int AhwBna(java.lang.Object obj) {
        try {
            return copydefault(obj).intValue();
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    public static final float djBIcL(java.lang.Object obj) {
        try {
            return copydefault(obj).floatValue();
        } catch (java.lang.Exception unused) {
            return 0.0f;
        }
    }

    public static final long valueOf(java.lang.Object obj) {
        try {
            return copydefault(obj).longValue();
        } catch (java.lang.Exception unused) {
            return 0L;
        }
    }

    public static final BigDecimal EZpvd(java.lang.Object obj) {
        try {
            return copydefault(java.lang.String.valueOf(obj));
        } catch (java.lang.Exception unused) {
            return new BigDecimal("0.0");
        }
    }

    public static final java.lang.String gEmmrt(java.lang.Object obj) {
        if (obj != null) {
            try {
                java.lang.String string = obj.toString();
                if (string != null) {
                    return string;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return "";
    }

    public static final java.lang.String AYXKKw(java.lang.Object obj) {
        try {
            java.lang.String string = copydefault(obj).toBigInteger().toString();
            Intrinsics.copydefault((java.lang.Object) string);
            return string;
        } catch (java.lang.Exception unused) {
            return "0";
        }
    }

    public static final java.math.BigInteger KWHzl(java.lang.Object obj) {
        try {
            java.math.BigInteger bigInteger = copydefault(obj).toBigInteger();
            Intrinsics.copydefault(bigInteger);
            return bigInteger;
        } catch (java.lang.Exception unused) {
            java.math.BigInteger bigInteger2 = java.math.BigInteger.ZERO;
            Intrinsics.copydefault(bigInteger2);
            return bigInteger2;
        }
    }

    public static final java.lang.String OLrzqt(java.lang.Object obj) {
        try {
            return formatS$default(obj, null, null, null, 7, null);
        } catch (java.lang.Exception unused) {
            return "0.0";
        }
    }

    public static final double OLrzqt(@NotNull C56515yIf c56515yIf, java.lang.Object obj) {
        java.lang.String string;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(c56515yIf, "");
        if (obj != null) {
            try {
                string = obj.toString();
            } catch (java.lang.Exception unused) {
                return AudioStats.AUDIO_AMPLITUDE_NONE;
            }
        } else {
            string = null;
        }
        if (string != null) {
            str = string;
        }
        java.lang.Double dValueOf = java.lang.Double.valueOf(str);
        Intrinsics.copydefault(dValueOf);
        return dValueOf.doubleValue();
    }

    public static final int KWHzl(@NotNull C56523yIn c56523yIn, java.lang.Object obj) {
        java.lang.String string;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(c56523yIn, "");
        if (obj != null) {
            try {
                string = obj.toString();
            } catch (java.lang.Exception unused) {
                return 0;
            }
        } else {
            string = null;
        }
        if (string != null) {
            str = string;
        }
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(str);
        Intrinsics.copydefault(numValueOf);
        return numValueOf.intValue();
    }

    public static final long copydefault(@NotNull C56521yIl c56521yIl, java.lang.Object obj) {
        java.lang.String string;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(c56521yIl, "");
        if (obj != null) {
            try {
                string = obj.toString();
            } catch (java.lang.Exception unused) {
                return 0L;
            }
        } else {
            string = null;
        }
        if (string != null) {
            str = string;
        }
        java.lang.Long lValueOf = java.lang.Long.valueOf(str);
        Intrinsics.copydefault(lValueOf);
        return lValueOf.longValue();
    }

    public static final <T> boolean KWHzl(java.util.Collection<? extends T> collection) {
        return collection != null && (collection.isEmpty() ^ true);
    }

    public static final boolean OLrzqt(java.lang.CharSequence charSequence) {
        return charSequence != null && charSequence.length() > 0 && (StringsKt__StringsKt.fARcdN(charSequence) ^ true);
    }

    public static final boolean AEQbTJ(java.lang.Object obj, java.lang.Object obj2) {
        return copydefault(obj).compareTo(copydefault(obj2)) > 0;
    }

    public static final boolean gEmmrt(java.lang.Object obj, java.lang.Object obj2) {
        return copydefault(obj).compareTo(copydefault(obj2)) < 0;
    }

    public static final boolean copydefault(java.lang.Object obj, java.lang.Object obj2) {
        return copydefault(obj).compareTo(copydefault(obj2)) >= 0;
    }

    public static final boolean valueOf(java.lang.Object obj, java.lang.Object obj2) {
        return copydefault(obj).compareTo(copydefault(obj2)) <= 0;
    }

    public static final boolean OLrzqt(java.lang.Object obj, java.lang.Object obj2) {
        return copydefault(obj).compareTo(copydefault(obj2)) == 0;
    }

    public static final boolean AhwBna(java.lang.Object obj, java.lang.Object obj2) {
        return copydefault(obj).compareTo(copydefault(obj2)) != 0;
    }

    public static final java.lang.String EZpvd(java.lang.Object obj, java.lang.Object obj2) {
        return copydefault(obj, obj2) ? OLrzqt(obj) : OLrzqt(obj2);
    }

    public static final java.lang.String KWHzl(java.lang.Object obj, java.lang.Object obj2) {
        return valueOf(obj, obj2) ? OLrzqt(obj) : OLrzqt(obj2);
    }
}
