package o;

import com.okinc.planet.format.TextColor;
import com.okinc.planet.serializer.PlanetNumericString;
import com.okinc.unify_trade.biz.BizInstrument;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC54581xNr;
import o.tRU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tRR {

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RoundingMode.values().length];
            try {
                iArr[RoundingMode.UP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RoundingMode.DOWN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> AEQbTJ(@NotNull java.lang.Number number, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull tRU tru, boolean z, boolean z2, @androidx.annotation.ColorRes int i) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tru, "");
        return EZpvd(EZpvd(str2, str), number, tru, z, z2, i);
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull tRU tru, boolean z, boolean z2, @androidx.annotation.ColorRes int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tru, "");
        return AEQbTJ(C33129mqd.EZpvd(PlanetNumericString.OLrzqt(str)), str2, str3, tru, z, z2, i);
    }

    public static /* synthetic */ kotlin.Pair formatPrice$default(xMS xms, java.lang.Number number, tRU tru, boolean z, boolean z2, int i, int i2, java.lang.Object obj) {
        boolean z3 = (i2 & 4) != 0 ? false : z;
        boolean z4 = (i2 & 8) != 0 ? false : z2;
        if ((i2 & 16) != 0) {
            i = C52761wXj.Activity.fdOvFl;
        }
        return EZpvd(xms, number, tru, z3, z4, i);
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> EZpvd(xMS xms, @NotNull java.lang.Number number, @NotNull tRU tru, boolean z, boolean z2, @androidx.annotation.ColorRes int i) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(tru, "");
        if (xms == null) {
            return C56390yDp.OLrzqt(pTB.formatICUNumber$default(number, null, C38307pTy.Companion.EZpvd(4), null, null, 13, null), java.lang.Integer.valueOf(C46368tRt.getRateColor$default(C33129mqd.EZpvd(C33129mqd.formatS$default(C33129mqd.EZpvd(number).setScale(4, RoundingMode.DOWN), null, null, null, 7, null)), i, false, 2, null)));
        }
        kotlin.Pair<java.lang.String, TextColor> pairKWHzl = KWHzl(xms, C33129mqd.gEmmrt(number), z, z2, OLrzqt(tru));
        return C56390yDp.OLrzqt(pairKWHzl.component1(), java.lang.Integer.valueOf(pairKWHzl.component2().color(i)));
    }

    /* JADX INFO: renamed from: formatPrice-CY2YnII$default, reason: not valid java name */
    public static /* synthetic */ kotlin.Pair m8750formatPriceCY2YnII$default(xMS xms, java.lang.String str, tRU tru, boolean z, boolean z2, int i, int i2, java.lang.Object obj) {
        boolean z3 = (i2 & 4) != 0 ? false : z;
        boolean z4 = (i2 & 8) != 0 ? false : z2;
        if ((i2 & 16) != 0) {
            i = C52761wXj.Activity.fdOvFl;
        }
        return KWHzl(xms, str, tru, z3, z4, i);
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> KWHzl(xMS xms, @NotNull java.lang.String str, @NotNull tRU tru, boolean z, boolean z2, @androidx.annotation.ColorRes int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tru, "");
        return EZpvd(xms, C33129mqd.EZpvd(PlanetNumericString.OLrzqt(str)), tru, z, z2, i);
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull tRU tru, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tru, "");
        return AEQbTJ(C33129mqd.EZpvd(PlanetNumericString.OLrzqt(str)), str2, str3, tru, z, z2);
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.Number number, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull tRU tru, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tru, "");
        return EZpvd(EZpvd(str2, str), number, tru, z, z2);
    }

    public static /* synthetic */ java.lang.String formatPricePlain$default(xMS xms, java.lang.Number number, tRU tru, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return EZpvd(xms, number, tru, z, z2);
    }

    public static final java.lang.String EZpvd(xMS xms, @NotNull java.lang.Number number, @NotNull tRU tru, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(tru, "");
        if (C33129mqd.OLrzqt((java.lang.Object) number, (java.lang.Object) 0)) {
            return "--";
        }
        if (xms == null) {
            return pTB.formatICUNumber$default(number, null, C38307pTy.Companion.EZpvd(4), null, null, 13, null);
        }
        java.lang.String plainString = number instanceof BigDecimal ? ((BigDecimal) number).toPlainString() : C33129mqd.gEmmrt(number);
        Intrinsics.copydefault((java.lang.Object) plainString);
        return KWHzl(xms, plainString, z, z2, OLrzqt(tru)).component1();
    }

    /* JADX INFO: renamed from: formatPricePlain-eLEVFN8$default, reason: not valid java name */
    public static /* synthetic */ java.lang.String m8752formatPricePlaineLEVFN8$default(xMS xms, java.lang.String str, tRU tru, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return copydefault(xms, str, tru, z, z2);
    }

    public static final java.lang.String copydefault(xMS xms, @NotNull java.lang.String str, @NotNull tRU tru, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tru, "");
        return EZpvd(xms, C33129mqd.EZpvd(PlanetNumericString.OLrzqt(str)), tru, z, z2);
    }

    /* JADX INFO: renamed from: formatMarkOrLastPricePlain-P8q7UIc$default, reason: not valid java name */
    public static /* synthetic */ java.lang.String m8747formatMarkOrLastPricePlainP8q7UIc$default(xMS xms, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return AEQbTJ(xms, str, z, z2);
    }

    public static final java.lang.String AEQbTJ(xMS xms, @NotNull java.lang.String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        return EZpvd(xms, C33129mqd.EZpvd(PlanetNumericString.OLrzqt(str)), new tRU.TaskDescription("", ""), z, z2);
    }

    /* JADX INFO: renamed from: formatClosePricePlain-eLEVFN8$default, reason: not valid java name */
    public static /* synthetic */ java.lang.String m8746formatClosePricePlaineLEVFN8$default(xMS xms, java.lang.String str, tRU tru, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return OLrzqt(xms, str, tru, z, z2);
    }

    public static final java.lang.String OLrzqt(xMS xms, @NotNull java.lang.String str, @NotNull tRU tru, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tru, "");
        return EZpvd(xms, str, tru, z, z2);
    }

    /* JADX INFO: renamed from: formatSLOrLiqPricePlain-eLEVFN8$default, reason: not valid java name */
    public static /* synthetic */ java.lang.String m8754formatSLOrLiqPricePlaineLEVFN8$default(xMS xms, java.lang.String str, tRU tru, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return AEQbTJ(xms, str, tru, z, z2);
    }

    public static final java.lang.String AEQbTJ(xMS xms, @NotNull java.lang.String str, @NotNull tRU tru, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tru, "");
        return KWHzl(xms, str, tru, z, z2);
    }

    /* JADX INFO: renamed from: buyUpSellDown-eLEVFN8$default, reason: not valid java name */
    public static /* synthetic */ java.lang.String m8745buyUpSellDowneLEVFN8$default(xMS xms, java.lang.String str, tRU tru, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return KWHzl(xms, str, tru, z, z2);
    }

    public static final java.lang.String KWHzl(xMS xms, java.lang.String str, tRU tru, boolean z, boolean z2) {
        if (C33129mqd.OLrzqt((java.lang.Object) PlanetNumericString.OLrzqt(str), (java.lang.Object) 0)) {
            return "--";
        }
        if (xms == null) {
            return pTB.formatICUNumber$default(C33129mqd.EZpvd(PlanetNumericString.OLrzqt(str)), null, C38307pTy.Companion.EZpvd(4), null, null, 13, null);
        }
        return KWHzl(xms, str, z, z2, copydefault(tru)).component1();
    }

    /* JADX INFO: renamed from: buyDownSellUp-eLEVFN8$default, reason: not valid java name */
    public static /* synthetic */ java.lang.String m8744buyDownSellUpeLEVFN8$default(xMS xms, java.lang.String str, tRU tru, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return EZpvd(xms, str, tru, z, z2);
    }

    public static final java.lang.String EZpvd(xMS xms, java.lang.String str, tRU tru, boolean z, boolean z2) {
        if (C33129mqd.OLrzqt((java.lang.Object) PlanetNumericString.OLrzqt(str), (java.lang.Object) 0)) {
            return "--";
        }
        if (xms == null) {
            return pTB.formatICUNumber$default(C33129mqd.EZpvd(PlanetNumericString.OLrzqt(str)), null, C38307pTy.Companion.EZpvd(4), null, null, 13, null);
        }
        return KWHzl(xms, str, z, z2, OLrzqt(tru)).component1();
    }

    public static final xMS EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String strAEQbTJ;
        xMS xmsGEmmrt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54581xNr interfaceC54581xNrEZpvd = C46392tSq.EZpvd.EZpvd();
        if (interfaceC54581xNrEZpvd == null) {
            return null;
        }
        BizInstrument suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrEZpvd, str2, str, null, null, 12, null);
        if (suggestedInstrument$default == null || (strAEQbTJ = suggestedInstrument$default.getInstFamily()) == null) {
            strAEQbTJ = xUW.KWHzl.AEQbTJ(str);
        }
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrEZpvd.OLrzqt(str2);
        if (abstractC54531xLwOLrzqt == null || (xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(strAEQbTJ)) == null) {
            return null;
        }
        return xmsGEmmrt;
    }

    public static final kotlin.Pair<java.lang.String, TextColor> KWHzl(xMS xms, java.lang.String str, boolean z, boolean z2, RoundingMode roundingMode) {
        C54536xML c54536xMLAEQbTJ = xms.AYXKKw(str).AEQbTJ(true);
        if (c54536xMLAEQbTJ.AhwBna().length() == 0) {
            c54536xMLAEQbTJ.EZpvd("8");
        }
        int i = StateListAnimator.copydefault[roundingMode.ordinal()];
        if (i == 1) {
            c54536xMLAEQbTJ.AuCTel();
        } else if (i == 2) {
            c54536xMLAEQbTJ.copydefault();
        } else if (i == 3) {
            Unit unit = Unit.INSTANCE;
        } else {
            c54536xMLAEQbTJ.valueOf();
        }
        java.lang.String strAYXKKw = c54536xMLAEQbTJ.AYXKKw();
        java.lang.String strGEmmrt = c54536xMLAEQbTJ.gEmmrt();
        java.lang.String safeString$default = C54536xML.toSafeString$default(c54536xMLAEQbTJ, false, 1, null);
        if (z) {
            java.lang.String iCUNumber$default = pTB.formatICUNumber$default(C33129mqd.EZpvd(safeString$default), null, C38307pTy.Companion.AEQbTJ(100), null, null, 13, null);
            if (z2) {
                if (strAYXKKw == null) {
                    strAYXKKw = "";
                }
                iCUNumber$default = C46367tRs.copydefault(iCUNumber$default, strAYXKKw);
            }
            return C56390yDp.OLrzqt(C46367tRs.OLrzqt(iCUNumber$default, strGEmmrt), TextColor.Companion.AEQbTJ(C33129mqd.EZpvd(safeString$default)));
        }
        java.lang.String iCUNumber$default2 = pTB.formatICUNumber$default(C33129mqd.EZpvd(safeString$default), null, C38307pTy.Companion.AEQbTJ(100), null, null, 13, null);
        if (z2) {
            if (strAYXKKw == null) {
                strAYXKKw = "";
            }
            iCUNumber$default2 = C46367tRs.copydefault(iCUNumber$default2, strAYXKKw);
        }
        return C56390yDp.OLrzqt(iCUNumber$default2, TextColor.Companion.AEQbTJ(C33129mqd.EZpvd(safeString$default)));
    }

    public static final RoundingMode OLrzqt(tRU tru) {
        if (tru instanceof tRU.ActionBar) {
            return RoundingMode.DOWN;
        }
        if (tru instanceof tRU.Activity) {
            return RoundingMode.UP;
        }
        if (tru instanceof tRU.TaskDescription) {
            return RoundingMode.UNNECESSARY;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final RoundingMode copydefault(tRU tru) {
        if (tru instanceof tRU.ActionBar) {
            return RoundingMode.UP;
        }
        if (tru instanceof tRU.Activity) {
            return RoundingMode.DOWN;
        }
        if (tru instanceof tRU.TaskDescription) {
            return RoundingMode.UNNECESSARY;
        }
        throw new NoWhenBranchMatchedException();
    }
}
