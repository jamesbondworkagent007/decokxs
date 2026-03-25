package o;

import androidx.camera.video.AudioStats;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.market.ext.UpDownColor;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qqW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41421qqW implements InterfaceC49405unt<InterfaceC41655qus, C41424qqZ> {
    public static final int KWHzl = 8;
    public final C41560qtC EZpvd;
    public final InterfaceC56387yDm copydefault;

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return false;
    }

    @yCM
    public C41421qqW(@NotNull C41560qtC c41560qtC) {
        Intrinsics.checkNotNullParameter(c41560qtC, "");
        this.EZpvd = c41560qtC;
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.qrd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41421qqW.copydefault();
            }
        });
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;)Ljava/lang/Object; */
    public C41424qqZ copydefault(@NotNull InterfaceC41655qus interfaceC41655qus) {
        return (C41424qqZ) InterfaceC49405unt.Activity.EZpvd(this, interfaceC41655qus);
    }

    public final java.lang.String KWHzl() {
        return (java.lang.String) this.copydefault.getValue();
    }

    public static final java.lang.String copydefault() {
        return ">" + pTB.formatICUPercent$default(java.lang.Double.valueOf(999.99d), RoundingMode.HALF_UP, C38307pTy.Companion.EZpvd(0), DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 16, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xHR.formatScientificCurrency$default(o.xHR, java.lang.String, boolean, java.math.RoundingMode, boolean, boolean, boolean, boolean, com.okinc.localization.util.format.DisplaySign, boolean, int, java.lang.Object):java.lang.String */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    public C41424qqZ AEQbTJ(@NotNull InterfaceC41655qus interfaceC41655qus) {
        kotlin.Pair pairOLrzqt;
        java.lang.String strKWHzl;
        java.lang.String strKWHzl2;
        java.lang.String strKWHzl3;
        java.lang.String strKWHzl4;
        BigDecimal bigDecimalEZpvd;
        BigDecimal bigDecimal;
        BigDecimal bigDecimalEZpvd2;
        java.lang.String strGEmmrt;
        java.lang.String strGEmmrt2;
        java.lang.String strGEmmrt3;
        java.lang.String strGEmmrt4;
        Intrinsics.checkNotNullParameter(interfaceC41655qus, "");
        java.lang.Double dKWHzl = interfaceC41655qus.KWHzl();
        java.lang.String iCUCompact$default = null;
        if (dKWHzl == null) {
            pairOLrzqt = C56390yDp.OLrzqt(null, null);
        } else if (dKWHzl.doubleValue() >= 99999.0d) {
            pairOLrzqt = C56390yDp.OLrzqt(KWHzl(), UpDownColor.UP);
        } else {
            pairOLrzqt = dKWHzl.doubleValue() <= -99.99d ? C56390yDp.OLrzqt("-99.99%", UpDownColor.DOWN) : (kotlin.Pair) this.EZpvd.copydefault(java.lang.Double.valueOf(dKWHzl.doubleValue() / 100.0d));
        }
        java.lang.String str = (java.lang.String) pairOLrzqt.component1();
        UpDownColor upDownColor = (UpDownColor) pairOLrzqt.component2();
        java.lang.Double dDjBIcL = interfaceC41655qus.djBIcL();
        if (dDjBIcL == null || (strGEmmrt4 = C33129mqd.gEmmrt(dDjBIcL)) == null) {
            strKWHzl = null;
        } else {
            strKWHzl = xHR.EZpvd.KWHzl(strGEmmrt4, (245 & 1) != 0 ? false : false, (245 & 2) != 0 ? RoundingMode.HALF_UP : RoundingMode.DOWN, (245 & 4) != 0, (245 & 8) == 0 ? true : true, (245 & 16) != 0 ? false : false, (245 & 32) != 0 ? false : false, (245 & 64) != 0 ? DisplaySign.AUTO : null, (245 & 128) == 0 ? false : false);
        }
        BigDecimal bigDecimalAYXKKw = interfaceC41655qus.AYXKKw();
        if (bigDecimalAYXKKw == null || (strGEmmrt3 = C33129mqd.gEmmrt(bigDecimalAYXKKw)) == null) {
            strKWHzl2 = null;
        } else {
            strKWHzl2 = xHR.EZpvd.KWHzl(strGEmmrt3, (245 & 1) != 0 ? false : true, (245 & 2) != 0 ? RoundingMode.HALF_UP : RoundingMode.DOWN, (245 & 4) != 0, (245 & 8) == 0 ? false : true, (245 & 16) != 0 ? false : false, (245 & 32) != 0 ? false : false, (245 & 64) != 0 ? DisplaySign.AUTO : null, (245 & 128) == 0 ? false : false);
        }
        BigDecimal bigDecimalValues = interfaceC41655qus.values();
        if (bigDecimalValues == null || (strGEmmrt2 = C33129mqd.gEmmrt(bigDecimalValues)) == null) {
            strKWHzl3 = null;
        } else {
            strKWHzl3 = xHR.EZpvd.KWHzl(strGEmmrt2, (245 & 1) != 0 ? false : true, (245 & 2) != 0 ? RoundingMode.HALF_UP : RoundingMode.DOWN, (245 & 4) != 0, (245 & 8) == 0 ? false : true, (245 & 16) != 0 ? false : false, (245 & 32) != 0 ? false : false, (245 & 64) != 0 ? DisplaySign.AUTO : null, (245 & 128) == 0 ? false : false);
        }
        BigDecimal bigDecimalAhwBna = interfaceC41655qus.AhwBna();
        if (bigDecimalAhwBna == null || (strGEmmrt = C33129mqd.gEmmrt(bigDecimalAhwBna)) == null) {
            strKWHzl4 = null;
        } else {
            strKWHzl4 = xHR.EZpvd.KWHzl(strGEmmrt, (245 & 1) != 0 ? false : true, (245 & 2) != 0 ? RoundingMode.HALF_UP : RoundingMode.DOWN, (245 & 4) != 0, (245 & 8) == 0 ? false : true, (245 & 16) != 0 ? false : false, (245 & 32) != 0 ? false : false, (245 & 64) != 0 ? DisplaySign.AUTO : null, (245 & 128) == 0 ? false : false);
        }
        java.lang.String strKWHzl5 = KWHzl(interfaceC41655qus.copydefault().getTokenContractAddress());
        java.lang.Double dDjBIcL2 = interfaceC41655qus.djBIcL();
        if ((dDjBIcL2 == null || !java.lang.Double.isNaN(dDjBIcL2.doubleValue())) && !Intrinsics.EZpvd(interfaceC41655qus.djBIcL(), AudioStats.AUDIO_AMPLITUDE_NONE)) {
            java.lang.Double dDjBIcL3 = interfaceC41655qus.djBIcL();
            if (dDjBIcL3 != null && (bigDecimalEZpvd = C33129mqd.EZpvd(dDjBIcL3)) != null) {
                BigDecimal bigDecimalValues2 = interfaceC41655qus.values();
                if (bigDecimalValues2 == null || (bigDecimalEZpvd2 = C33129mqd.EZpvd(bigDecimalValues2)) == null) {
                    bigDecimal = null;
                } else {
                    BigDecimal bigDecimalDivide = bigDecimalEZpvd2.divide(bigDecimalEZpvd, RoundingMode.HALF_EVEN);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "");
                    bigDecimal = bigDecimalDivide;
                }
                if (bigDecimal != null) {
                    iCUCompact$default = pTB.formatICUCompact$default(bigDecimal, null, null, null, null, 15, null);
                }
            }
        } else {
            iCUCompact$default = "--";
        }
        return new C41424qqZ(str, upDownColor, strKWHzl, strKWHzl3, strKWHzl2, strKWHzl4, strKWHzl5, iCUCompact$default);
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        if (str == null) {
            return "";
        }
        if (str.length() <= 10) {
            return str;
        }
        return C59454zhO.AkhnZx(str, 4) + "..." + C59454zhO.isConnected(str, 4);
    }
}
