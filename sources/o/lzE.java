package o;

import com.okinc.buysell.data.formatter.RoundingType;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lzE implements InterfaceC3696Aqn {
    @Override // o.InterfaceC3696Aqn
    public java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "AED")) {
            return "AED " + str;
        }
        try {
            return C38305pTw.formatFiatSymbol$default(C33129mqd.EZpvd(str), str2, RoundingType.Companion.KWHzl(i), C38307pTy.Companion.AEQbTJ(i2), null, null, null, 56, null);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // o.InterfaceC3696Aqn
    public java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "AED")) {
            return "AED " + str;
        }
        try {
            return C38305pTw.formatFiatSymbol$default(C33129mqd.EZpvd(str), str2, RoundingType.Companion.KWHzl(i), C38307pTy.Companion.KWHzl(0, i2), null, null, null, 56, null);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // o.InterfaceC3696Aqn
    public java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            return C38305pTw.formatFiatCode$default(C33129mqd.EZpvd(str), str2, RoundingType.Companion.KWHzl(i), C38307pTy.Companion.AEQbTJ(C38306pTx.AEQbTJ.AEQbTJ(str2)), null, null, null, 56, null);
        } catch (java.lang.Exception unused) {
            return pTB.formatLocalized$default(str, null, 1, null) + " " + str2;
        }
    }

    @Override // o.InterfaceC3696Aqn
    public java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            return C38305pTw.formatFiatCode$default(C33129mqd.EZpvd(str), str2, RoundingType.Companion.KWHzl(i), C38307pTy.Companion.KWHzl(0, C38306pTx.AEQbTJ.AEQbTJ(str2)), null, null, null, 56, null);
        } catch (java.lang.Exception unused) {
            return pTB.formatLocalized$default(str, null, 1, null) + " " + str2;
        }
    }

    @Override // o.InterfaceC3696Aqn
    public java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            return C38305pTw.formatCryptoCode$default(C33129mqd.EZpvd(str), str2, RoundingType.Companion.KWHzl(i), C38307pTy.Companion.AEQbTJ(i2), null, null, null, 56, null);
        } catch (java.lang.Exception unused) {
            java.lang.String plainString = C33129mqd.EZpvd(str).setScale(8, 1).toPlainString();
            Intrinsics.checkNotNullExpressionValue(plainString, "");
            return pTB.formatLocalized$default(plainString, null, 1, null) + " " + str2;
        }
    }

    @Override // o.InterfaceC3696Aqn
    public java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return KWHzl(str, str2, RoundingType.DOWN.getCode(), C56395yDu.EZpvd(8)) + " ≈ " + EZpvd(str3, str4, i, i2);
    }

    @Override // o.InterfaceC3696Aqn
    public java.lang.String AEQbTJ(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return pTB.toLocalizationStringWithMaxPrecision$default(str, i, RoundingMode.DOWN, null, 4, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.lzi.formatToMaxPrecision$default(java.lang.String, int, java.math.RoundingMode, int, java.lang.Object):java.lang.String */
    @Override // o.InterfaceC3696Aqn
    public java.lang.String EZpvd(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return C31661lzi.formatToMaxPrecision$default(str, i, null, 2, null);
    }
}
