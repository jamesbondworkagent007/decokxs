package o;

import androidx.camera.video.AudioStats;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.biz.TacticsType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.MpStgyParam;
import com.okinc.unify_trade.biz.OrderCategory;
import com.okinc.unify_trade.biz.PlaceOrderCondition;
import com.okinc.unify_trade.biz.SignParamItem;
import com.okinc.unify_trade.biz.StrategyOrderBillDetailsResponse;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.bot.EarnType;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.GridStopTriggerType;
import com.okinc.unify_trade.bot.config.TimeFrame;
import com.okinc.unify_trade.bot.config.TriggerCond;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.ItemData;
import com.okinc.unify_trade.bot.data.ItemDataToggle;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.xvF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56033xvF {

    /* JADX INFO: renamed from: o.xvF$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;

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
                iArr[RoundingMode.HALF_UP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[EarnType.values().length];
            try {
                iArr2[EarnType.Ratio.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[EarnType.Absolute.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            OLrzqt = iArr2;
        }
    }

    public static final int AEQbTJ(boolean z) {
        return z ? 14 : 13;
    }

    public static final int KWHzl(boolean z) {
        return z ? 0 : 8;
    }

    public static /* synthetic */ java.lang.String fmtBotPnlPercent$default(java.lang.String str, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 2;
        }
        return copydefault(str, z, i);
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        boolean z2 = C33129mqd.copydefault(str, "0.00001") && C33129mqd.gEmmrt(str, "0.0001");
        java.lang.String str2 = z2 ? "0.0001" : str;
        RoundingMode roundingMode = (z2 || C33129mqd.copydefault((java.lang.Object) str, (java.lang.Object) 0)) ? RoundingMode.DOWN : RoundingMode.UP;
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "--";
        }
        if (z) {
            return xMR.copydefault.copydefault(str2, i, 2, roundingMode);
        }
        return xMR.copydefault.EZpvd(str2, i, 2, roundingMode);
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "";
        }
        if (C33129mqd.copydefault(str, "0.00001") && C33129mqd.gEmmrt(str, "0.0001")) {
            return C33129mqd.AEQbTJ("0.0001", 4, java.lang.Boolean.TRUE, RoundingMode.DOWN);
        }
        if (C33129mqd.gEmmrt(str, 0)) {
            return C33129mqd.AEQbTJ(str, 4, java.lang.Boolean.TRUE, RoundingMode.UP);
        }
        return C33129mqd.AEQbTJ(str, 4, java.lang.Boolean.TRUE, RoundingMode.DOWN);
    }

    public static final java.lang.String djBIcL(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null) : null;
        java.lang.String marginSymbol = suggestedInstrument$default != null ? suggestedInstrument$default.getMarginSymbol() : null;
        return (str3 == null || str3.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3)) ? marginSymbol != null ? marginSymbol : "" : str3;
    }

    public static final java.lang.String valueOf(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null) : null;
        java.lang.String profitSymbol = suggestedInstrument$default != null ? suggestedInstrument$default.getProfitSymbol() : null;
        return (str3 == null || str3.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3)) ? profitSymbol != null ? profitSymbol : "" : str3;
    }

    public static /* synthetic */ java.lang.String getBotPnl$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, java.lang.String str5, boolean z3, java.lang.String str6, java.lang.Integer num, RoundingMode roundingMode, int i, java.lang.Object obj) {
        return AEQbTJ(str, str2, str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : roundingMode);
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z, boolean z2, java.lang.String str5, boolean z3, java.lang.String str6, java.lang.Integer num, RoundingMode roundingMode) {
        RoundingMode roundingMode2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        java.lang.String strKWHzl = C56066xvm.EZpvd.KWHzl(str, str2, str4);
        java.lang.String strAhwBna = AhwBna(str, str2, str3, strKWHzl);
        boolean z4 = false;
        if (roundingMode != null) {
            roundingMode2 = roundingMode;
        } else if (C33129mqd.AEQbTJ(str3, 0)) {
            roundingMode2 = RoundingMode.DOWN;
        } else {
            roundingMode2 = RoundingMode.UP;
        }
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl) && (str6 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str6))) {
            z4 = true;
        }
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3)) {
            return "--";
        }
        if (z4) {
            return pTB.formatICUNumber$default(C33129mqd.EZpvd(str3), roundingMode2, C38307pTy.Companion.EZpvd(4), z2 ? DisplaySign.EXCEPT_ZERO : DisplaySign.AUTO, null, 8, null);
        }
        java.lang.String strFmtBotValueBySymbol$default = fmtBotValueBySymbol$default((str6 == null || str6.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str6)) ? strKWHzl : str6, str3, roundingMode2, z, valueOf(str, str2, str4, str5), z3, null, null, null, num, null, 1472, null);
        if (!z2 || !C33129mqd.AEQbTJ(strAhwBna, "0")) {
            return strFmtBotValueBySymbol$default;
        }
        return Marker.ANY_NON_NULL_MARKER + strFmtBotValueBySymbol$default;
    }

    public static /* synthetic */ java.lang.String getBotPrecision$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        return valueOf(str, str2, str3, str4);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String valueOf(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4) {
        java.lang.Object objValueOf;
        TradeCoinInfo tradeCoinInfoAhwBna;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        C56066xvm c56066xvm = C56066xvm.EZpvd;
        java.lang.String strKWHzl = c56066xvm.KWHzl(str, str2, str3);
        int iAEQbTJ = c56066xvm.AEQbTJ(str, str2);
        java.lang.String sizeDig = (interfaceC54581xNrCopydefault == null || (tradeCoinInfoAhwBna = interfaceC54581xNrCopydefault.AhwBna(strKWHzl)) == null) ? null : tradeCoinInfoAhwBna.getSizeDig();
        if (str4 != null) {
            int length = str4.length();
            objValueOf = str4;
            if (length == 0) {
                objValueOf = C33129mqd.AEQbTJ(java.lang.Integer.valueOf(iAEQbTJ), sizeDig) ? java.lang.Integer.valueOf(iAEQbTJ) : sizeDig;
            }
        }
        return java.lang.String.valueOf(objValueOf);
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, java.lang.String str3, boolean z2, boolean z3, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return getBotPnl$default("", "", str, str2, z, z3, str3, z2, null, num, null, 1280, null);
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        C54536xML c54536xMLCopydefault;
        java.lang.String strGEmmrt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String strAEQbTJ = null;
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null) : null;
        java.lang.String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        if (instFamily == null || instFamily.length() == 0) {
            strAEQbTJ = xUW.KWHzl.AEQbTJ(str);
        } else if (suggestedInstrument$default != null) {
            strAEQbTJ = suggestedInstrument$default.getInstFamily();
        }
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str2)) == null) {
            return "";
        }
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        xMV xmvAEQbTJ = abstractC54531xLwOLrzqt.AEQbTJ(strAEQbTJ, str3);
        return (xmvAEQbTJ == null || (c54536xMLCopydefault = xmvAEQbTJ.copydefault("0")) == null || (strGEmmrt = c54536xMLCopydefault.gEmmrt()) == null) ? "" : strGEmmrt;
    }

    public static /* synthetic */ java.lang.String getDigitPnl$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str4 = "";
        }
        return AhwBna(str, str2, str3, str4);
    }

    public static final java.lang.String AhwBna(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        RoundingMode roundingMode;
        TradeCoinInfo tradeCoinInfoAhwBna;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (C33129mqd.AEQbTJ(str3, 0)) {
            roundingMode = RoundingMode.DOWN;
        } else {
            roundingMode = RoundingMode.UP;
        }
        RoundingMode roundingMode2 = roundingMode;
        C56066xvm c56066xvm = C56066xvm.EZpvd;
        int iMax = java.lang.Math.max(C33129mqd.AhwBna((interfaceC54581xNrCopydefault == null || (tradeCoinInfoAhwBna = interfaceC54581xNrCopydefault.AhwBna(c56066xvm.KWHzl(str, str2, str4))) == null) ? null : tradeCoinInfoAhwBna.getSizeDig()), c56066xvm.AEQbTJ(str, str2));
        if (iMax == 0) {
            iMax = 4;
        }
        return C33129mqd.formatS$default(str3, java.lang.Integer.valueOf(iMax), null, roundingMode2, 2, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xMR.formatPercent$default(o.xMR, java.lang.String, int, java.math.RoundingMode, int, java.lang.Object):java.lang.String */
    public static final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return xMR.formatPercent$default(xMR.copydefault, str, 0, RoundingMode.DOWN, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, @NotNull java.lang.String str7, boolean z, int i) {
        boolean z2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str7, "");
        if (C33129mqd.OLrzqt(AhwBna(str, str2, str4 == null ? "" : str4, str6 == null ? "" : str6), "0")) {
            z2 = true;
        } else {
            if (!C33129mqd.OLrzqt(AhwBna(str, str2, str5 == null ? "" : str5, str6 == null ? "" : str6), "0")) {
                z2 = false;
            }
        }
        java.lang.String str8 = ((i <= 0 || str3.length() <= i * 10) && !z) ? " " : "\n";
        if (z2) {
            return str3;
        }
        return str3 + str8 + "(" + C33069mpW.copydefault(C55688xof.Application.setPlaybackToLocal, C56424yEw.gEmmrt(C56390yDp.OLrzqt("amt1", getBotPnl$default(str, str2, str4 == null ? "" : str4, str6 == null ? "" : str6, false, false, null, false, null, null, null, 1984, null)), C56390yDp.OLrzqt("amt2", getBotPnl$default(str, str2, str5 == null ? "" : str5, str6 == null ? "" : str6, false, false, null, false, null, null, null, 1984, null)), C56390yDp.OLrzqt("ccy", (str6 == null || str6.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str6)) ? str7 : str6))) + ")";
    }

    public static /* synthetic */ java.lang.String getBotLever$default(java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return KWHzl(str, z);
    }

    public static final java.lang.String KWHzl(java.lang.String str, boolean z) {
        if (C33129mqd.valueOf(C33129mqd.EZpvd(str).setScale(2, RoundingMode.HALF_UP), 0)) {
            return "";
        }
        java.lang.String roundToMax$default = pTB.formatRoundToMax$default(C33129mqd.EZpvd(str), 2, null, 2, null);
        if (!z) {
            return roundToMax$default;
        }
        return roundToMax$default + "x";
    }

    public static /* synthetic */ java.lang.String formatLeverPrincipal$default(java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            str = "x";
        }
        return EZpvd(obj, str);
    }

    public static final java.lang.String EZpvd(java.lang.Object obj, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(obj);
        if (!C33129mqd.AEQbTJ(bigDecimalEZpvd, 0)) {
            bigDecimalEZpvd = null;
        }
        if (bigDecimalEZpvd != null) {
            java.lang.String str2 = pTB.formatDownToMax$default(bigDecimalEZpvd, 1, null, 2, null) + str;
            if (str2 != null) {
                return str2;
            }
        }
        return "--";
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str, PlaceOrderCondition placeOrderCondition) {
        java.lang.String strAEQbTJ;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strCopydefault = "--";
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (placeOrderCondition != null ? placeOrderCondition.getSpreadRatio() : null))) {
            xMR xmr = xMR.copydefault;
            java.lang.String spreadRatio = placeOrderCondition != null ? placeOrderCondition.getSpreadRatio() : null;
            if (spreadRatio == null) {
                spreadRatio = "";
            }
            strAEQbTJ = xmr.AEQbTJ(spreadRatio, 3, RoundingMode.FLOOR);
        } else {
            strAEQbTJ = "--";
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (placeOrderCondition != null ? placeOrderCondition.getUnitAmt() : null))) {
            xMR xmr2 = xMR.copydefault;
            java.lang.String unitAmt = placeOrderCondition != null ? placeOrderCondition.getUnitAmt() : null;
            strCopydefault = xmr2.copydefault(unitAmt != null ? unitAmt : "", 3);
        }
        return "≥" + strAEQbTJ + " | " + strCopydefault + " " + str;
    }

    public static /* synthetic */ java.lang.String getBotFee$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        return EZpvd(str, str2, str3, str4, z);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z) {
        java.lang.String strAEQbTJ;
        xMV xmvKWHzl;
        C54536xML c54536xMLAuCTel;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        C54536xML c54536xMLAuCTel2;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLAuCTel3;
        C54536xML c54536xMLDjBIcL3;
        C54536xML c54536xMLAuCTel4;
        C54536xML c54536xMLFetchVPNInfo2;
        C54536xML c54536xMLDjBIcL4;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (str3.length() == 0) {
            return "--";
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str, str2, null, null, 12, null) : null;
        java.lang.String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        if (instFamily == null || instFamily.length() == 0) {
            strAEQbTJ = xUW.KWHzl.AEQbTJ(str2);
        } else {
            strAEQbTJ = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        }
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str)) == null) {
            xmvKWHzl = null;
        } else {
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            xmvKWHzl = abstractC54531xLwOLrzqt.KWHzl(strAEQbTJ, str4);
        }
        java.lang.String strCopydefault = xmvKWHzl != null ? xmvKWHzl.copydefault() : null;
        if (strCopydefault == null || strCopydefault.length() == 0) {
            strCopydefault = "8";
        }
        java.lang.String strEZpvd = xmvKWHzl != null ? xmvKWHzl.EZpvd() : null;
        xMV xmvKWHzl2 = new xMV().KWHzl(strEZpvd != null ? strEZpvd : "", strCopydefault);
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "MARGIN")) {
            if (z) {
                C54536xML c54536xMLCopydefault = xmvKWHzl2.copydefault(str3);
                if (c54536xMLCopydefault == null || (c54536xMLAuCTel2 = c54536xMLCopydefault.AuCTel()) == null || (c54536xMLFetchVPNInfo = c54536xMLAuCTel2.fetchVPNInfo()) == null || (c54536xMLDjBIcL2 = c54536xMLFetchVPNInfo.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL2, false, 1, null)) == null) {
                    return "--";
                }
            } else {
                C54536xML c54536xMLCopydefault2 = xmvKWHzl2.copydefault(str3);
                if (c54536xMLCopydefault2 == null || (c54536xMLAuCTel = c54536xMLCopydefault2.AuCTel()) == null || (c54536xMLDjBIcL = c54536xMLAuCTel.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) == null) {
                    return "--";
                }
            }
        } else if (z) {
            C54536xML c54536xMLCopydefault3 = xmvKWHzl2.copydefault(str3);
            if (c54536xMLCopydefault3 == null || (c54536xMLAuCTel4 = c54536xMLCopydefault3.AuCTel()) == null || (c54536xMLFetchVPNInfo2 = c54536xMLAuCTel4.fetchVPNInfo()) == null || (c54536xMLDjBIcL4 = c54536xMLFetchVPNInfo2.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL4, false, 1, null)) == null) {
                return "--";
            }
        } else {
            C54536xML c54536xMLCopydefault4 = xmvKWHzl2.copydefault(str3);
            if (c54536xMLCopydefault4 == null || (c54536xMLAuCTel3 = c54536xMLCopydefault4.AuCTel()) == null || (c54536xMLDjBIcL3 = c54536xMLAuCTel3.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL3, false, 1, null)) == null) {
                return "--";
            }
        }
        return safeString$default;
    }

    public static /* synthetic */ java.lang.String getBotFeeUnit$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str5 = null;
        }
        return EZpvd(str, str2, str3, str4, str5);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5) {
        java.lang.String tradeSymbol;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String strEZpvd;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String strAEQbTJ = null;
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str, str2, null, null, 12, null) : null;
        if (suggestedInstrument$default != null) {
            java.lang.String displayQuoteSymbol = suggestedInstrument$default.getDisplayQuoteSymbol();
            if (str5 == null || str5.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str5)) {
                str5 = displayQuoteSymbol;
            }
            tradeSymbol = suggestedInstrument$default.getTradeSymbol();
        } else {
            str5 = "";
            tradeSymbol = str5;
        }
        java.lang.String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        if (instFamily == null || instFamily.length() == 0) {
            strAEQbTJ = xUW.KWHzl.AEQbTJ(str2);
        } else if (suggestedInstrument$default != null) {
            strAEQbTJ = suggestedInstrument$default.getInstFamily();
        }
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "FUTURES") && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SWAP") && Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) "buy")) {
            str5 = tradeSymbol;
        }
        if (interfaceC54581xNrOLrzqt != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str)) != null) {
            xMV xmvKWHzl = abstractC54531xLwOLrzqt.KWHzl(strAEQbTJ != null ? strAEQbTJ : "", str5);
            if (xmvKWHzl != null && (strEZpvd = xmvKWHzl.EZpvd()) != null) {
                return strEZpvd;
            }
        }
        return "--";
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(strategyOrderBillDetailsResponse, "");
        java.lang.String feeCcy = strategyOrderBillDetailsResponse.getFeeCcy();
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) feeCcy)) {
            feeCcy = null;
        }
        if (feeCcy != null) {
            return feeCcy;
        }
        java.lang.String ccy = strategyOrderBillDetailsResponse.getCcy();
        java.lang.String str5 = C33129mqd.OLrzqt((java.lang.CharSequence) ccy) ? ccy : null;
        if (str5 != null) {
            return str5;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 2552066) {
            return iHashCode != 2558355 ? getBotFeeUnit$default(str, str2, str3, str4, null, 16, null) : getBotFeeUnit$default(str, str2, str3, str4, null, 16, null);
        }
        if (str.equals("SPOT")) {
            return EZpvd(str, str2, str3, str4, strategyOrderBillDetailsResponse.getTradeQuoteCcy());
        }
        return getBotFeeUnit$default(str, str2, str3, str4, null, 16, null);
    }

    public static final int gEmmrt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        TradeCoinInfo tradeCoinInfoAhwBna;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        C56066xvm c56066xvm = C56066xvm.EZpvd;
        return java.lang.Math.max(C33129mqd.AhwBna((interfaceC54581xNrCopydefault == null || (tradeCoinInfoAhwBna = interfaceC54581xNrCopydefault.AhwBna(c56066xvm.KWHzl(str, str2, str3))) == null) ? null : tradeCoinInfoAhwBna.getSizeDig()), c56066xvm.AEQbTJ(str, str2));
    }

    public static final java.lang.String gEmmrt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        java.lang.String strAEQbTJ;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLCopydefault2;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        C54536xML c54536xMLCopydefault3;
        C54536xML c54536xMLCopydefault4;
        C54536xML c54536xMLDjBIcL2;
        java.lang.String safeString$default2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str, str2, null, null, 12, null) : null;
        java.lang.String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        if (instFamily == null || instFamily.length() == 0) {
            strAEQbTJ = xUW.KWHzl.AEQbTJ(str2);
        } else {
            strAEQbTJ = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "MARGIN")) {
            if (interfaceC54581xNrOLrzqt != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str)) != null) {
                xMV xmvKWHzl = abstractC54531xLwOLrzqt.KWHzl(strAEQbTJ != null ? strAEQbTJ : "", str4);
                if (xmvKWHzl != null && (c54536xMLCopydefault = xmvKWHzl.copydefault(str3)) != null && (c54536xMLCopydefault2 = c54536xMLCopydefault.copydefault()) != null && (c54536xMLDjBIcL = c54536xMLCopydefault2.djBIcL()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) != null) {
                    return safeString$default;
                }
            }
        } else if (interfaceC54581xNrOLrzqt != null && (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt.OLrzqt(str)) != null) {
            xMV xmvCreateFeeConverterWithIndex$default = AbstractC54531xLw.createFeeConverterWithIndex$default(abstractC54531xLwOLrzqt2, strAEQbTJ != null ? strAEQbTJ : "", null, 2, null);
            if (xmvCreateFeeConverterWithIndex$default != null && (c54536xMLCopydefault3 = xmvCreateFeeConverterWithIndex$default.copydefault(str3)) != null && (c54536xMLCopydefault4 = c54536xMLCopydefault3.copydefault()) != null && (c54536xMLDjBIcL2 = c54536xMLCopydefault4.djBIcL()) != null && (safeString$default2 = C54536xML.toSafeString$default(c54536xMLDjBIcL2, false, 1, null)) != null) {
                return safeString$default2;
            }
        }
        return "--";
    }

    public static /* synthetic */ java.lang.String getBotAmount$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str4 = "";
        }
        java.lang.String str6 = str4;
        if ((i & 16) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str5 = null;
        }
        return AEQbTJ(str, str2, str3, str6, z2, str5);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xML.toSafeString$default(o.xML, boolean, int, java.lang.Object):java.lang.String */
    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z, java.lang.String str5) {
        java.lang.String strAEQbTJ;
        C54571xNh c54571xNhOLrzqt;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLAEQbTJ;
        java.lang.String safeString$default;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str, str2, null, null, 12, null) : null;
        java.lang.String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        if (instFamily == null || instFamily.length() == 0) {
            strAEQbTJ = xUW.KWHzl.AEQbTJ(str2);
        } else {
            strAEQbTJ = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "FUTURES") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SWAP")) {
            c54571xNhOLrzqt = C54566xNc.OLrzqt(str, strAEQbTJ != null ? strAEQbTJ : "", str5);
        } else {
            C54571xNh c54571xNhOLrzqt2 = C54566xNc.OLrzqt(str, strAEQbTJ != null ? strAEQbTJ : "", str5);
            if (c54571xNhOLrzqt2 != null) {
                java.lang.String strOLrzqt = c54571xNhOLrzqt2.OLrzqt();
                java.lang.String strKWHzl = c54571xNhOLrzqt2.KWHzl();
                if (strKWHzl == null || strKWHzl.length() == 0) {
                    strKWHzl = "8";
                }
                c54571xNhOLrzqt = new xMY(strOLrzqt, strKWHzl);
            } else {
                c54571xNhOLrzqt = null;
            }
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "FUTURES") && C33129mqd.OLrzqt((java.lang.CharSequence) str4) && c54571xNhOLrzqt != null) {
            c54571xNhOLrzqt.valueOf(str4);
        }
        C54536xML c54536xMLDjBIcL2 = c54571xNhOLrzqt != null ? c54571xNhOLrzqt.djBIcL(str3) : null;
        if (z) {
            c54536xMLDjBIcL2 = c54536xMLDjBIcL2 != null ? c54536xMLDjBIcL2.fetchVPNInfo() : null;
        }
        return (c54536xMLDjBIcL2 == null || (c54536xMLCopydefault = c54536xMLDjBIcL2.copydefault()) == null || (c54536xMLDjBIcL = c54536xMLCopydefault.djBIcL()) == null || (c54536xMLAEQbTJ = c54536xMLDjBIcL.AEQbTJ()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAEQbTJ, false, 1, null)) == null) ? "--" : safeString$default;
    }

    public static /* synthetic */ java.lang.String getBotAmountUnit$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        return AEQbTJ(str, str2, str3, str4);
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4) {
        java.lang.String strAEQbTJ;
        C54536xML c54536xMLDjBIcL;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String strGEmmrt = null;
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str, str2, null, null, 12, null) : null;
        java.lang.String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        if (instFamily == null || instFamily.length() == 0) {
            strAEQbTJ = xUW.KWHzl.AEQbTJ(str2);
        } else {
            strAEQbTJ = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        }
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        C54571xNh c54571xNhOLrzqt = C54566xNc.OLrzqt(str, strAEQbTJ, str4);
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "FUTURES") && C33129mqd.OLrzqt((java.lang.CharSequence) str3) && c54571xNhOLrzqt != null) {
            c54571xNhOLrzqt.valueOf(str3);
        }
        if (c54571xNhOLrzqt != null && (c54536xMLDjBIcL = c54571xNhOLrzqt.djBIcL("0")) != null) {
            strGEmmrt = c54536xMLDjBIcL.gEmmrt();
        }
        return strGEmmrt == null ? "" : strGEmmrt;
    }

    public static /* synthetic */ java.lang.String getAmountSymbolWithFallback$default(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        return EZpvd(str, str2, str3);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.lang.String botAmountUnit$default = getBotAmountUnit$default(str, str2, str3, null, 8, null);
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SPOT") || !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) botAmountUnit$default)) {
            return ((Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "FUTURES")) && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) botAmountUnit$default)) ? C56078xvy.KWHzl(str2, str) : botAmountUnit$default;
        }
        java.lang.String strCopydefault = o.TaskDescription.AEQbTJ(str2).copydefault();
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = strCopydefault.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    public static final java.lang.String AEQbTJ(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        xMS xmsGEmmrt;
        BizInstrument bizInstrumentValueOf;
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "";
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String strDjBIcL = null;
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt(str2) : null;
        java.lang.String instFamily = (abstractC54531xLwOLrzqt == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(str3)) == null) ? null : bizInstrumentValueOf.getInstFamily();
        if (instFamily == null) {
            instFamily = "";
        }
        if (abstractC54531xLwOLrzqt != null && (xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instFamily)) != null) {
            strDjBIcL = xmsGEmmrt.djBIcL(str);
        }
        return strDjBIcL == null ? "" : strDjBIcL;
    }

    public static final java.lang.String KWHzl(java.lang.String str, BizInstrument bizInstrument) {
        java.lang.String instType = bizInstrument != null ? bizInstrument.getInstType() : null;
        if (instType == null) {
            instType = "";
        }
        java.lang.String instId = bizInstrument != null ? bizInstrument.getInstId() : null;
        return AEQbTJ(str, instType, instId != null ? instId : "");
    }

    public static final java.lang.String copydefault(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        xMS xmsGEmmrt;
        BizInstrument bizInstrumentValueOf;
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "";
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String strAhwBna = null;
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt(str2) : null;
        java.lang.String instFamily = (abstractC54531xLwOLrzqt == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(str3)) == null) ? null : bizInstrumentValueOf.getInstFamily();
        if (instFamily == null) {
            instFamily = "";
        }
        if (abstractC54531xLwOLrzqt != null && (xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instFamily)) != null) {
            strAhwBna = xmsGEmmrt.AhwBna(str);
        }
        return strAhwBna == null ? "" : strAhwBna;
    }

    public static final java.lang.String OLrzqt(java.lang.String str, BizInstrument bizInstrument) {
        java.lang.String instType = bizInstrument != null ? bizInstrument.getInstType() : null;
        if (instType == null) {
            instType = "";
        }
        java.lang.String instId = bizInstrument != null ? bizInstrument.getInstId() : null;
        return copydefault(str, instType, instId != null ? instId : "");
    }

    public static final java.lang.String EZpvd(BizInstrument bizInstrument) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String strDjBIcL = null;
        if (interfaceC54581xNrOLrzqt != null) {
            java.lang.String instType = bizInstrument != null ? bizInstrument.getInstType() : null;
            if (instType == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                strDjBIcL = abstractC54531xLwOLrzqt.djBIcL(bizInstrument);
            }
        }
        return strDjBIcL == null ? "" : strDjBIcL;
    }

    public static /* synthetic */ java.lang.String getBotPrice$default(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, RoundingMode roundingMode, java.lang.String str4, int i, java.lang.Object obj) {
        return copydefault(str, str2, str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? RoundingMode.DOWN : roundingMode, (i & 64) != 0 ? null : str4);
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, boolean z2, @NotNull RoundingMode roundingMode, java.lang.String str4) {
        java.lang.String safeString$default;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        xMS xmsGEmmrt;
        C54536xML c54536xMLAYXKKw;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3)) {
            java.lang.String strAEQbTJ = xUW.KWHzl.AEQbTJ(str2);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            java.lang.String safeString$default2 = null;
            C54536xML c54536xMLDjBIcL = (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str)) == null || (xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(strAEQbTJ)) == null || (c54536xMLAYXKKw = xmsGEmmrt.AYXKKw(str3)) == null) ? null : c54536xMLAYXKKw.djBIcL();
            int i = TaskDescription.KWHzl[roundingMode.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (c54536xMLDjBIcL != null) {
                            c54536xMLDjBIcL.valueOf();
                        }
                    } else if (c54536xMLDjBIcL != null) {
                        c54536xMLDjBIcL.isConnected();
                    }
                } else if (c54536xMLDjBIcL != null) {
                    c54536xMLDjBIcL.copydefault();
                }
            } else if (c54536xMLDjBIcL != null) {
                c54536xMLDjBIcL.AuCTel();
            }
            if (z2) {
                if (c54536xMLDjBIcL != null) {
                    c54536xMLDjBIcL.AkhnZx();
                }
            } else if (z && c54536xMLDjBIcL != null) {
                c54536xMLDjBIcL.fetchVPNInfo();
            }
            if (str4 != null) {
                if (c54536xMLDjBIcL != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) != null) {
                    safeString$default2 = safeString$default + " " + str4;
                }
            } else if (c54536xMLDjBIcL != null) {
                safeString$default2 = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null);
            }
            if (safeString$default2 != null) {
                return safeString$default2;
            }
        }
        return "--";
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String strAEQbTJ;
        xMS xmsGEmmrt;
        C54536xML c54536xMLAYXKKw;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String strGEmmrt = null;
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str, str2, null, null, 12, null) : null;
        java.lang.String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        if (instFamily == null || instFamily.length() == 0) {
            strAEQbTJ = xUW.KWHzl.AEQbTJ(str2);
        } else {
            strAEQbTJ = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        }
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str)) == null) {
            xmsGEmmrt = null;
        } else {
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(strAEQbTJ);
        }
        if (xmsGEmmrt != null && (c54536xMLAYXKKw = xmsGEmmrt.AYXKKw("0")) != null) {
            strGEmmrt = c54536xMLAYXKKw.gEmmrt();
        }
        return strGEmmrt == null ? "" : strGEmmrt;
    }

    public static final java.lang.String AhwBna(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        java.lang.String upperCase;
        ActionBar actionBarAEQbTJ;
        java.lang.String strAEQbTJ;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String strAEQbTJ2 = AEQbTJ(str, str2);
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SPOT") || !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ2)) {
            return ((Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "FUTURES")) && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ2)) ? C56078xvy.copydefault(str2, str) : strAEQbTJ2;
        }
        if (str3 == null || (actionBarAEQbTJ = o.TaskDescription.AEQbTJ(str3)) == null || (strAEQbTJ = actionBarAEQbTJ.AEQbTJ()) == null) {
            upperCase = null;
        } else {
            upperCase = strAEQbTJ.toUpperCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
        }
        java.lang.String str4 = upperCase;
        java.lang.String upperCase2 = o.TaskDescription.AEQbTJ(str2).AEQbTJ().toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        return (str4 == null || str4.length() == 0) ? upperCase2 : str4;
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        xMV xmvCreateSizeConverterWithIndex$default;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLCopydefault2;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        xMY xmyDbNXlk;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (str3.length() == 0) {
            return "--";
        }
        java.lang.String strAEQbTJ = xUW.KWHzl.AEQbTJ(str2);
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "MARGIN")) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            AbstractC54531xLw abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt(str) : null;
            xLD xld = abstractC54531xLwOLrzqt2 instanceof xLD ? (xLD) abstractC54531xLwOLrzqt2 : null;
            if (xld == null || (xmyDbNXlk = xld.DbNXlk(strAEQbTJ, str4)) == null || (safeString$default = xmyDbNXlk.copydefault(str3)) == null) {
                return "--";
            }
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(str)) == null || (xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, strAEQbTJ, null, 2, null)) == null || (c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default.copydefault(str3)) == null || (c54536xMLCopydefault2 = c54536xMLCopydefault.copydefault()) == null || (c54536xMLDjBIcL = c54536xMLCopydefault2.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) == null) {
                return "--";
            }
        }
        return safeString$default;
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        xMV xmvCreateSizeConverterWithIndex$default;
        java.lang.String strEZpvd;
        xMY xmyDbNXlk;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.lang.String strAEQbTJ = xUW.KWHzl.AEQbTJ(str2);
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "MARGIN")) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            AbstractC54531xLw abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt(str) : null;
            xLD xld = abstractC54531xLwOLrzqt2 instanceof xLD ? (xLD) abstractC54531xLwOLrzqt2 : null;
            if (xld == null || (xmyDbNXlk = xld.DbNXlk(strAEQbTJ, str3)) == null || (strEZpvd = xmyDbNXlk.OLrzqt()) == null) {
                return "";
            }
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(str)) == null || (xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, strAEQbTJ, null, 2, null)) == null || (strEZpvd = xmvCreateSizeConverterWithIndex$default.EZpvd()) == null) {
                return "";
            }
        }
        return strEZpvd;
    }

    public static /* synthetic */ java.lang.String fmtICUCompactAmountWithSymbol$default(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return copydefault(str, str2, z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        BizInstrument suggestedInstrument$default;
        java.lang.String str6 = str;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        TradeCoinInfo tradeCoinInfoAhwBna = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.AhwBna(str) : null;
        java.lang.String sizeDig = tradeCoinInfoAhwBna != null ? tradeCoinInfoAhwBna.getSizeDig() : null;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(4);
        if (sizeDig == null || sizeDig.length() == 0) {
            sizeDig = strGEmmrt;
        }
        java.lang.String iCUCompact$default = xMR.formatICUCompact$default(xMR.copydefault, str2, null, C38307pTy.Companion.AEQbTJ(C33129mqd.AhwBna(sizeDig)), null, null, 26, null);
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
            return "--";
        }
        if (!z) {
            return iCUCompact$default;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str3 == null ? "" : str3, str4, null, null, 12, null);
        } else {
            suggestedInstrument$default = null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "SPOT")) {
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null))) {
                java.lang.String displayQuoteSymbol = suggestedInstrument$default.getDisplayQuoteSymbol();
                if (str5 != null) {
                    displayQuoteSymbol = str5;
                }
                return iCUCompact$default + " " + displayQuoteSymbol;
            }
        }
        if (str5 != null) {
            str6 = str5;
        }
        return iCUCompact$default + " " + str6;
    }

    public static /* synthetic */ java.lang.String fmtBotValueBySymbol$default(java.lang.String str, java.lang.String str2, RoundingMode roundingMode, boolean z, java.lang.String str3, boolean z2, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Integer num, DisplaySign displaySign, int i, java.lang.Object obj) {
        return KWHzl(str, str2, (i & 4) != 0 ? RoundingMode.DOWN : roundingMode, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str3, (i & 32) == 0 ? z2 : false, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) == 0 ? num : null, (i & 1024) != 0 ? DisplaySign.AUTO : displaySign);
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull RoundingMode roundingMode, boolean z, java.lang.String str3, boolean z2, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Integer num, @NotNull DisplaySign displaySign) {
        java.lang.String sizeDig;
        C38307pTy c38307pTyKWHzl;
        java.lang.String iCUNumber$default;
        BizInstrument suggestedInstrument$default;
        java.lang.String str7 = str;
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        TradeCoinInfo tradeCoinInfoAhwBna = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.AhwBna(str7) : null;
        if (str3 == null) {
            sizeDig = tradeCoinInfoAhwBna != null ? tradeCoinInfoAhwBna.getSizeDig() : null;
        } else {
            sizeDig = str3;
        }
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(4);
        if (sizeDig == null || sizeDig.length() == 0) {
            sizeDig = strGEmmrt;
        }
        int iAhwBna = C33129mqd.AhwBna(sizeDig);
        if (z2) {
            if (roundingMode == RoundingMode.UP) {
                iCUNumber$default = xMR.copydefault.AYXKKw(str2, iAhwBna);
            } else {
                iCUNumber$default = xMR.copydefault.OLrzqt(str2, iAhwBna);
            }
        } else {
            if (num == null) {
                c38307pTyKWHzl = C38307pTy.Companion.AEQbTJ(iAhwBna);
            } else {
                c38307pTyKWHzl = C38307pTy.Companion.KWHzl(num.intValue(), iAhwBna);
            }
            iCUNumber$default = pTB.formatICUNumber$default(C33129mqd.EZpvd(str2), roundingMode, c38307pTyKWHzl, displaySign, null, 8, null);
        }
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
            return "--";
        }
        if (!z) {
            return iCUNumber$default;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str4 == null ? "" : str4, str5, null, null, 12, null);
        } else {
            suggestedInstrument$default = null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) "SPOT")) {
            if (Intrinsics.EZpvd((java.lang.Object) str7, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null))) {
                java.lang.String displayQuoteSymbol = suggestedInstrument$default.getDisplayQuoteSymbol();
                if (str6 != null) {
                    displayQuoteSymbol = str6;
                }
                return iCUNumber$default + " " + displayQuoteSymbol;
            }
        }
        if (str6 != null) {
            str7 = str6;
        }
        return iCUNumber$default + " " + str7;
    }

    public static /* synthetic */ java.lang.String fmtBotValueToFixedBySymbol$default(java.lang.String str, java.lang.String str2, RoundingMode roundingMode, boolean z, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        return copydefault(str, str2, roundingMode, z, num);
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull RoundingMode roundingMode, boolean z, java.lang.Integer num) {
        java.lang.String sizeDig;
        TradeCoinInfo tradeCoinInfoAhwBna;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (num == null || (sizeDig = C33129mqd.gEmmrt(num)) == null) {
            InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
            sizeDig = (interfaceC54581xNrCopydefault == null || (tradeCoinInfoAhwBna = interfaceC54581xNrCopydefault.AhwBna(str)) == null) ? null : tradeCoinInfoAhwBna.getSizeDig();
        }
        java.lang.String downToFixed$default = xMR.formatDownToFixed$default(xMR.copydefault, C33129mqd.formatS$default(str2, java.lang.Integer.valueOf((sizeDig == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) sizeDig)) ? 4 : C33129mqd.AhwBna(sizeDig)), null, roundingMode, 2, null), 0, 2, null);
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
            return "--";
        }
        if (!z) {
            return downToFixed$default;
        }
        return downToFixed$default + " " + str;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        xMV xmvValueOf;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLCopydefault2;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        BizInstrument suggestedInstrument$default;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (str.length() == 0) {
            return "--";
        }
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        java.lang.String instFamily = (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str3, str2, null, null, 12, null)) == null) ? null : suggestedInstrument$default.getInstFamily();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2 != null ? interfaceC54581xNrOLrzqt2.OLrzqt(str3) : null;
        if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "SPOT")) {
            xLL xll = abstractC54531xLwOLrzqt instanceof xLL ? (xLL) abstractC54531xLwOLrzqt : null;
            if (xll != null) {
                xmvValueOf = xll.valueOf(instFamily != null ? instFamily : "", str4);
            } else {
                xmvValueOf = null;
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "MARGIN")) {
            xLD xld = abstractC54531xLwOLrzqt instanceof xLD ? (xLD) abstractC54531xLwOLrzqt : null;
            if (xld != null) {
                xmvValueOf = xld.valueOf(instFamily != null ? instFamily : "", str4);
            }
        }
        return (xmvValueOf == null || (c54536xMLCopydefault = xmvValueOf.copydefault(str)) == null || (c54536xMLCopydefault2 = c54536xMLCopydefault.copydefault()) == null || (c54536xMLDjBIcL = c54536xMLCopydefault2.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) == null) ? "--" : safeString$default;
    }

    public static final int OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String strDjBIcL;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        IdxConfig idxConfigAkhnZx;
        java.lang.String contractDig;
        xOW newProxyInstance;
        AbstractC54531xLw abstractC54531xLwOLrzqt3;
        java.lang.String strDjBIcL2;
        AbstractC54531xLw abstractC54531xLwOLrzqt4;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String strAEQbTJ = xUW.KWHzl.AEQbTJ(str2);
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        java.lang.String strIwGUEr = null;
        BizInstrument bizInstrumentDbNXlk = (interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt4 = interfaceC54581xNrCopydefault.OLrzqt(str)) == null) ? null : abstractC54531xLwOLrzqt4.DbNXlk(strAEQbTJ);
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "FUTURES")) {
            if (bizInstrumentDbNXlk == null || !bizInstrumentDbNXlk.isPositiveContract()) {
                return 0;
            }
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null) {
                strIwGUEr = newProxyInstance.iwGUEr();
            }
            if (Intrinsics.EZpvd((java.lang.Object) strIwGUEr, (java.lang.Object) "2")) {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
                if (interfaceC54581xNrOLrzqt2 != null && (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt2.OLrzqt(str)) != null && (idxConfigAkhnZx = abstractC54531xLwOLrzqt2.AkhnZx(strAEQbTJ)) != null && (contractDig = idxConfigAkhnZx.getContractDig()) != null) {
                    return C33129mqd.AhwBna(contractDig);
                }
            } else {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = c54589xNz.OLrzqt();
                if (interfaceC54581xNrOLrzqt3 != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt3.OLrzqt(str)) != null && (strDjBIcL = abstractC54531xLwOLrzqt.djBIcL(strAEQbTJ)) != null) {
                    return C33129mqd.AhwBna(strDjBIcL);
                }
            }
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt4 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt4 != null && (abstractC54531xLwOLrzqt3 = interfaceC54581xNrOLrzqt4.OLrzqt(str)) != null && (strDjBIcL2 = abstractC54531xLwOLrzqt3.djBIcL(strAEQbTJ)) != null) {
                return C33129mqd.AhwBna(strDjBIcL2);
            }
        }
        return 8;
    }

    public static final int KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String strFIwbmz;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String strAEQbTJ = xUW.KWHzl.AEQbTJ(str2);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str)) == null || (strFIwbmz = abstractC54531xLwOLrzqt.fIwbmz(strAEQbTJ)) == null) {
            return 8;
        }
        return C33129mqd.AhwBna(strFIwbmz);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (o.C59449zhJ.gEmmrt(r6, "long", true) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (o.C59449zhJ.gEmmrt(r5, "buy", true) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (o.C59449zhJ.gEmmrt(r6, "short", true) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (o.C59449zhJ.gEmmrt(r5, "buy", true) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        if (o.C59449zhJ.gEmmrt(r5, "buy", true) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (r4.equals("SPOT") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        if (r4.equals("OPTION") != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b6, code lost:
    
        if (r4.equals("MARGIN") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bd, code lost:
    
        if (o.C59449zhJ.gEmmrt(r5, "buy", true) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return o.C56390yDp.OLrzqt(o.C33070mpX.AYXKKw(o.C55688xof.Application.withContextAvailable), java.lang.Boolean.TRUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return o.C56390yDp.OLrzqt(o.C33070mpX.AYXKKw(o.C55688xof.Application.LocalFullyDrawnReporterOwnerLocalFullyDrawnReporterOwner1), java.lang.Boolean.FALSE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return o.C56390yDp.OLrzqt(o.C33070mpX.AYXKKw(o.C55688xof.Application.getCREATORannotations), java.lang.Boolean.TRUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return o.C56390yDp.OLrzqt(o.C33070mpX.AYXKKw(o.C55688xof.Application.ContextAwareKtwithContextAvailable21), java.lang.Boolean.FALSE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return o.C56390yDp.OLrzqt(o.C33070mpX.AYXKKw(o.C55688xof.Application.BoolRes), java.lang.Boolean.TRUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return o.C56390yDp.OLrzqt(o.C33070mpX.AYXKKw(o.C55688xof.Application.AttrRes), java.lang.Boolean.FALSE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return o.C56390yDp.OLrzqt(o.C33070mpX.AYXKKw(o.C55688xof.Application.setPipParamsSourceRectHint), java.lang.Boolean.TRUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return o.C56390yDp.OLrzqt(o.C33070mpX.AYXKKw(o.C55688xof.Application.addMenuProvider), java.lang.Boolean.FALSE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r4.equals("FUTURES") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r4.equals("SWAP") == false) goto L40;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kotlin.Pair<java.lang.String, java.lang.Boolean> AYXKKw(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        switch (str.hashCode()) {
            case -2027980370:
                break;
            case -1956807563:
                break;
            case 2552066:
                break;
            case 2558355:
                break;
            case 214415088:
                break;
            default:
                return C56390yDp.OLrzqt("", java.lang.Boolean.FALSE);
        }
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Boolean> ejfBZ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C59449zhJ.gEmmrt(str, "buy", true)) {
            return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.setPipParamsSourceRectHint), java.lang.Boolean.TRUE);
        }
        return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.addMenuProvider), java.lang.Boolean.FALSE);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        xMR xmr = xMR.copydefault;
        java.lang.String strCopydefault = xmr.copydefault(C33129mqd.divS$default(str, "86400000", 0, null, null, 12, null));
        java.lang.String strRemS$default = C33129mqd.remS$default(str, "86400000", null, null, null, 14, null);
        return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityExternalSyntheticLambda3), C56424yEw.gEmmrt(C56390yDp.OLrzqt(MTPushConstants.NotificationTime.KEY_DAYS, strCopydefault), C56390yDp.OLrzqt("hour", xmr.copydefault(C33129mqd.divS$default(strRemS$default, "3600000", 0, null, null, 12, null))), C56390yDp.OLrzqt("minute", xmr.copydefault(C33129mqd.divS$default(C33129mqd.remS$default(strRemS$default, "3600000", null, null, null, 14, null), "60000", 0, null, null, 12, null)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "MARGIN")) {
            str4 = Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) str2) ? "netBuy" : "netSell";
        } else if (Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) "net")) {
            if (C33129mqd.AEQbTJ(str5) > AudioStats.AUDIO_AMPLITUDE_NONE) {
            }
        }
        return DbNXlk(str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1270=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final java.lang.String DbNXlk(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1048962135:
                return !str.equals("netBuy") ? "" : C33070mpX.AYXKKw(C55688xof.Application.getMaxVolume);
            case 3327612:
                return !str.equals("long") ? "" : C33070mpX.AYXKKw(C55688xof.Application.UeEOUB);
            case 109413500:
                return !str.equals("short") ? "" : C33070mpX.AYXKKw(C55688xof.Application.fFgQHt);
            case 1842402959:
                return !str.equals("netSell") ? "" : C33070mpX.AYXKKw(C55688xof.Application.getVolumeControl);
            case 1844321735:
                return !str.equals("neutral") ? "" : C33070mpX.AYXKKw(C55688xof.Application.fFgQHt);
            default:
                return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1294=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final java.lang.String AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case 3327612:
                return str.equals("long") ? C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2) : "";
            case 109413500:
                return !str.equals("short") ? "" : C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver_Parcel);
            case 798171554:
                return !str.equals("hedging") ? "" : C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatApi22);
            case 1844321735:
                return !str.equals("neutral") ? "" : C33070mpX.AYXKKw(C55688xof.Application.IResultReceiverStubProxy);
            default:
                return "";
        }
    }

    public static final java.lang.String fJNWhG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "cross") ? C33070mpX.AYXKKw(C55688xof.Application.gBtXYZ) : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "isolated") ? C33070mpX.AYXKKw(C55688xof.Application.pauseLocationServices) : "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1312=47] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0213, code lost:
    
        if (r1.equals("STRATEGY_SPOT_DCA_ADD_INVESTMENT") == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x021d, code lost:
    
        if (o.C56071xvr.gEmmrt.ejfBZ() == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:?, code lost:
    
        return o.C33070mpX.AYXKKw(o.C55688xof.Application.EZpvd);
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:?, code lost:
    
        return o.C33070mpX.AYXKKw(o.C55688xof.Application.MediaBrowserCompatSubscriptionCallback);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b3, code lost:
    
        if (r1.equals("STRATEGY_SPOT_GRID__ADD_INVESTMENT") == false) goto L200;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String OLrzqt(java.lang.String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1866204256:
                    if (str.equals("edit_name")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatCustomActionBuilder);
                    }
                    break;
                case -1859283487:
                    if (str.equals("strategy_button_starting")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.openOptionsMenu);
                    }
                    break;
                case -1773919395:
                    if (str.equals("strategy_button_adjust_margin")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.getCustomView);
                    }
                    break;
                case -1655491746:
                    if (str.equals("strategy_button_related_position")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.registerCallbackListener);
                    }
                    break;
                case -1460441579:
                    if (str.equals("strategy_button_stopping")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.skipToPrevious);
                    }
                    break;
                case -1411487333:
                    if (str.equals("recurring_modify_amount")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.DKr);
                    }
                    break;
                case -1366787209:
                    if (str.equals("strategy_modify_stop_condition")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.setShuffleModeEnabledRemoved);
                    }
                    break;
                case -1360252850:
                    if (str.equals("strategy_button_restart")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.GiPPlL);
                    }
                    break;
                case -1245996814:
                    if (str.equals("strategy_button_risking")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.getNotifyChildrenChangedOptions);
                    }
                    break;
                case -934426579:
                    if (str.equals("resume")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.GiPPlL);
                    }
                    break;
                case -918420701:
                    if (str.equals("strategy_button_trading_view_signal")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.onScrollStateChanged);
                    }
                    break;
                case -900037503:
                    if (str.equals("strategy_button_details")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi24Callback);
                    }
                    break;
                case -840828177:
                    if (str.equals("un_pin")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.createHandler);
                    }
                    break;
                case -702985433:
                    if (str.equals("strategy_button_edit_trading_pairs")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.wtf);
                    }
                    break;
                case -674762535:
                    if (str.equals("view_on_kline")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.Qsauvs);
                    }
                    break;
                case -266229020:
                    if (str.equals("strategy_button_adjust_withdrawal")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.setDisplayShowHomeEnabled);
                    }
                    break;
                case -213435403:
                    if (str.equals("strategy_button_pause")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.GhqvEQ);
                    }
                    break;
                case -210118047:
                    if (str.equals("strategy_button_start")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.parseResult);
                    }
                    break;
                case -53097185:
                    break;
                case 110997:
                    if (str.equals("pin")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityReportFullyDrawnExecutorApi1);
                    }
                    break;
                case 13978130:
                    if (str.equals("strategy_button_add_investment")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.getLocation);
                    }
                    break;
                case 36088676:
                    if (str.equals("recurring_modify_price_range")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.UimiPOhkCVbT);
                    }
                    break;
                case 78862271:
                    if (str.equals("SHARE")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.getSavedStateRegistry);
                    }
                    break;
                case 106440182:
                    if (str.equals("pause")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.GhqvEQ);
                    }
                    break;
                case 149470789:
                    if (str.equals("strategy_modify_start_condition")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.sendMediaButton);
                    }
                    break;
                case 270133622:
                    if (str.equals("strategy_button_more")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.rateWithExtras);
                    }
                    break;
                case 270317091:
                    if (str.equals("strategy_button_stop")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.addTab);
                    }
                    break;
                case 270343158:
                    if (str.equals("strategy_button_tpsl")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.addContentView);
                    }
                    break;
                case 322024080:
                    if (str.equals("strategy_button_recreate")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatMediaControllerImplBase);
                    }
                    break;
                case 334196078:
                    if (str.equals("MORE_FUNC")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.getDisplayOptions);
                    }
                    break;
                case 517247550:
                    if (str.equals("SMART_ARB_REDUCE_POSITION")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.onError);
                    }
                    break;
                case 569314151:
                    if (str.equals("strategy_button_tp_price")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.onBackPressed);
                    }
                    break;
                case 665232559:
                    if (str.equals("strategy_button_add_order")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.GiPPlLQAswws);
                    }
                    break;
                case 700833347:
                    if (str.equals("strategy_cancel_reserve")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.zSsVtY);
                    }
                    break;
                case 741106358:
                    if (str.equals("strategy_button_manual_order")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.fVBECu);
                    }
                    break;
                case 937102971:
                    if (str.equals("REINVEST_PROFIT")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.DcMfJKDSqxTE);
                    }
                    break;
                case 1085266328:
                    if (str.equals("modify_active_grid_range")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.build);
                    }
                    break;
                case 1228725827:
                    if (str.equals("strategy_edit_dca_parameter")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.fhwtiV);
                    }
                    break;
                case 1435023816:
                    break;
                case 1521663722:
                    if (str.equals("reverse_bot")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.GcnicV);
                    }
                    break;
                case 1590391209:
                    if (str.equals("lvf_early_fill_buy")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.gISBfG);
                    }
                    break;
                case 1605383006:
                    if (str.equals("strategy_edit_price_range")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.fhwtiV);
                    }
                    break;
                case 1654288125:
                    if (str.equals("recurring_invest_more")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatSubscriptionCallback);
                    }
                    break;
                case 1677034225:
                    if (str.equals("strategy_reserve_stop")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.gtCCJH);
                    }
                    break;
                case 1682788997:
                    if (str.equals("strategy_modify_auto_margin")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.DuXjdv);
                    }
                    break;
                case 1688944953:
                    if (str.equals("recurring_modify_frequency")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.svUkWZ);
                    }
                    break;
                case 1899963035:
                    if (str.equals("strategy_button_modify")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.setMediaTypeactivity_release);
                    }
                    break;
                case 2057977999:
                    if (str.equals("lvf_early_fill_sell")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.aRClCA);
                    }
                    break;
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1455=7] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        if (r2.equals("canceled") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        if (r2.equals("effective") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r2.equals("stopped") == false) goto L39;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kotlin.Pair<java.lang.String, java.lang.Integer> fetchVPNInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -2127938992:
                if (str.equals("pending_signal")) {
                    return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.hUfVAv), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq)));
                }
                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.collapseActionView), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
            case -1884319283:
                break;
            case -1821824562:
                if (str.equals("no_close_position")) {
                    return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.OnBackPressedDispatcher1), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq)));
                }
                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.collapseActionView), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
            case -1468651097:
                break;
            case -123173735:
                break;
            case 106440182:
                if (str.equals("pause")) {
                    return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.zzJhsT), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq)));
                }
                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.collapseActionView), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
            case 1316806720:
                if (str.equals("starting")) {
                    return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.openOptionsMenu), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq)));
                }
                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.collapseActionView), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
            case 1550783935:
                if (str.equals("running")) {
                    return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.collapseActionView), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
                }
                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.collapseActionView), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
            case 1715648628:
                if (str.equals("stopping")) {
                    return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.skipToPrevious), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq)));
                }
                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.collapseActionView), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
            default:
                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.collapseActionView), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
        }
        return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.getPlaybackType), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.aappFQ)));
    }

    public static /* synthetic */ kotlin.Pair getDcdBotState$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return copydefault(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1481=4, 1489=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final kotlin.Pair<java.lang.String, java.lang.Integer> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        switch (str.hashCode()) {
            case -1884319283:
                if (str.equals("stopped")) {
                    return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.getPlaybackType), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
                }
                break;
            case 1316806720:
                if (str.equals("starting")) {
                    return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.openOptionsMenu), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
                }
                break;
            case 1550783935:
                if (str.equals("running")) {
                    switch (str2.hashCode()) {
                        case -1884319283:
                            if (str2.equals("stopped")) {
                                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.getPlaybackType), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
                            }
                            break;
                        case -559731291:
                            if (str2.equals("pending_matching")) {
                                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.invokespecialatDTRm), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
                            }
                            break;
                        case 391699048:
                            if (str2.equals("dip_snipping")) {
                                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.invokespecialaKhcqp), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
                            }
                            break;
                        case 1198784719:
                            if (str2.equals("profit_snipping")) {
                                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.invokespecialhOMIpD), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
                            }
                            break;
                    }
                    return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.setScrollIndicators), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
                }
                break;
            case 1715648628:
                if (str.equals("stopping")) {
                    return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.skipToPrevious), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
                }
                break;
        }
        return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.setScrollIndicators), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int iHashCode = str.hashCode();
        if (iHashCode != -1468651097) {
            if (iHashCode != -123173735) {
                if (iHashCode == 651875918 && str.equals("order_failed")) {
                    return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.BackHandlerKtBackHandlerbackCallback11), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.aappFQ)));
                }
            } else if (str.equals("canceled")) {
                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.provides), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.aappFQ)));
            }
        } else if (str.equals("effective")) {
            return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.getContract), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.aappFQ)));
        }
        return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.setHideOnContentScrollEnabled), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.aappFQ)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1511=4] */
    public static final java.lang.String gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int iHashCode = str.hashCode();
        if (iHashCode != 49) {
            if (iHashCode != 50) {
                if (iHashCode != 52) {
                    if (iHashCode == 1601 && str.equals("23")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.zqTOFw);
                    }
                } else if (str.equals("4")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.getLabel);
                }
            } else if (str.equals("2")) {
                return C33070mpX.AYXKKw(C55688xof.Application.sVXHln);
            }
        } else if (str.equals("1")) {
            return C33070mpX.AYXKKw(C55688xof.Application.zlvcHA);
        }
        return "--";
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1521=6] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r2.equals("canceled") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        if (r2.equals("stopped") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r2.equals("all_done") == false) goto L34;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kotlin.Pair<java.lang.String, java.lang.Integer> isConnected(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -2127938992:
                if (str.equals("pending_signal")) {
                    return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.centerButton), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq)));
                }
                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.setScrollIndicators), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq)));
            case -1884319283:
                break;
            case -123173735:
                break;
            case 651875918:
                if (str.equals("order_failed")) {
                    return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.selectContentView), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
                }
                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.setScrollIndicators), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq)));
            case 1316806720:
                if (str.equals("starting")) {
                    return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.setScrollIndicators), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq)));
                }
                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.setScrollIndicators), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq)));
            case 1550783935:
                if (str.equals("running")) {
                    return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.collapseActionView), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
                }
                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.setScrollIndicators), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq)));
            case 1715648628:
                if (str.equals("stopping")) {
                    return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.manageScrollIndicators), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq)));
                }
                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.setScrollIndicators), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq)));
            case 1797799776:
                break;
            default:
                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.setScrollIndicators), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq)));
        }
        return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.setHideOnContentScrollEnabled), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.aappFQ)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1548=7] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final kotlin.Pair<java.lang.String, java.lang.Integer> AuCTel(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1884319283:
                if (str.equals("stopped")) {
                    return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.setHideOnContentScrollEnabled), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
                }
                break;
            case -1263184552:
                if (str.equals("opening")) {
                    return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.connect), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
                }
                break;
            case 866540725:
                if (str.equals("closing")) {
                    return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.AudioAttributesImplBaseParcelizer), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
                }
                break;
            case 1211762355:
                if (str.equals("risking")) {
                    return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.getNotifyChildrenChangedOptions), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
                }
                break;
            case 1316806720:
                if (str.equals("starting")) {
                    return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.setScrollIndicators), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
                }
                break;
            case 1550783935:
                if (str.equals("running")) {
                    return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.collapseActionView), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
                }
                break;
            case 1715648628:
                if (str.equals("stopping")) {
                    return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.manageScrollIndicators), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
                }
                break;
        }
        return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.setScrollIndicators), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DeEinT)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kotlin.Pair<java.lang.String, java.lang.Integer> AYXKKw(@NotNull java.lang.String str) {
        int i;
        Intrinsics.checkNotNullParameter(str, "");
        int iHashCode = str.hashCode();
        if (iHashCode != 1567) {
            if (iHashCode != 1568) {
                if (iHashCode != 1570) {
                    if (iHashCode != 1571) {
                        if (iHashCode != 1598) {
                            switch (iHashCode) {
                                case 49:
                                    i = !str.equals("1") ? C55688xof.Application.setHideOnContentScrollEnabled : C55688xof.Application.setDisplayHomeAsUpEnabled;
                                    break;
                                case 50:
                                    if (str.equals("2")) {
                                        i = C55688xof.Application.removeTabAt;
                                        break;
                                    }
                                    break;
                                case 51:
                                    if (str.equals("3")) {
                                        i = C55688xof.Application.setDisplayUseLogoEnabled;
                                        break;
                                    }
                                    break;
                                case 52:
                                    if (str.equals("4")) {
                                        i = C55688xof.Application.setDisplayOptions;
                                        break;
                                    }
                                    break;
                                case 53:
                                    if (str.equals("5")) {
                                        i = C55688xof.Application.ActivityResultCallback;
                                        break;
                                    }
                                    break;
                                case 54:
                                    if (str.equals(OrderDetailListItem.SLIP_OUT)) {
                                        i = C55688xof.Application.MediaBrowserCompatMediaItem;
                                        break;
                                    }
                                    break;
                                case 55:
                                    if (str.equals("7")) {
                                        i = C55688xof.Application.HJWChPOKBmQN;
                                        break;
                                    }
                                    break;
                                case 56:
                                    if (str.equals("8")) {
                                        i = C55688xof.Application.fDu;
                                        break;
                                    }
                                    break;
                            }
                        } else if (str.equals("20")) {
                            i = C55688xof.Application.MediaSessionCompat2;
                        }
                    } else if (str.equals("14")) {
                        i = C55688xof.Application.AxsJAYaxsJAY;
                    }
                } else if (str.equals("13")) {
                    i = C55688xof.Application.getActions;
                }
            } else if (str.equals("11")) {
                i = C55688xof.Application.getBufferedPosition;
            }
        } else if (str.equals("10")) {
            i = C55688xof.Application.getCustomActions;
        }
        return C56390yDp.OLrzqt(C33070mpX.AYXKKw(i), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.aappFQ)));
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> values(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "order_failed")) {
            return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.selectContentView), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.aappFQ)));
        }
        return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.setHideOnContentScrollEnabled), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.aappFQ)));
    }

    public static final android.content.Context EZpvd() {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        return activityAEQbTJ != null ? activityAEQbTJ : C43246rlf.OLrzqt.valueOf();
    }

    public static final int OLrzqt(boolean z) {
        if (z) {
            return C33512mxp.tradeRiseTagContent$default(C33512mxp.AEQbTJ, EZpvd(), 0.0f, 2, null);
        }
        return C33512mxp.tradeFallTagContent$default(C33512mxp.AEQbTJ, EZpvd(), 0.0f, 2, null);
    }

    public static final int EZpvd(boolean z) {
        if (z) {
            return C33512mxp.tradeRiseTagFill$default(C33512mxp.AEQbTJ, EZpvd(), 0.0f, 2, null);
        }
        return C33512mxp.tradeFallTagFill$default(C33512mxp.AEQbTJ, EZpvd(), 0.0f, 2, null);
    }

    public static /* synthetic */ int getTradeDefaultColor$default(java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = C52761wXj.Activity.fdOvFl;
        }
        return copydefault(str, i);
    }

    public static final int copydefault(@NotNull java.lang.String str, @androidx.annotation.ColorRes int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.AEQbTJ(str, 0) ? C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, EZpvd(), 0.0f, 2, null) : C33129mqd.gEmmrt(str, 0) ? C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, EZpvd(), 0.0f, 2, null) : C33070mpX.copydefault(i);
    }

    public static /* synthetic */ int getContractGridSideBgColor$default(java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return AEQbTJ(str, z);
    }

    public static final int AEQbTJ(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!z) {
            return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "long") ? C33512mxp.tradeRiseTagFill$default(C33512mxp.AEQbTJ, EZpvd(), 0.0f, 2, null) : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "short") ? C33512mxp.tradeFallTagFill$default(C33512mxp.AEQbTJ, EZpvd(), 0.0f, 2, null) : C33070mpX.copydefault(C52761wXj.Activity.DcMfJKDCKfqPDCfLja);
        }
        C55365xia c55365xia = new C55365xia(EZpvd(), 32);
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "long") ? C55366xib.KWHzl(C52761wXj.ActionBar.zlvcHA, c55365xia) : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "short") ? C55366xib.KWHzl(C52761wXj.ActionBar.hlkKmr, c55365xia) : C33070mpX.copydefault(C52761wXj.Activity.onComplete);
    }

    public static /* synthetic */ int getContractGridSideColor$default(java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return copydefault(str, z);
    }

    public static final int copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!z) {
            return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "long") ? C33512mxp.tradeRiseTagContent$default(C33512mxp.AEQbTJ, EZpvd(), 0.0f, 2, null) : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "short") ? C33512mxp.tradeFallTagContent$default(C33512mxp.AEQbTJ, EZpvd(), 0.0f, 2, null) : C33070mpX.copydefault(C32113mPz.ActionBar.hDKMBd);
        }
        C55365xia c55365xia = new C55365xia(EZpvd(), 32);
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "long") ? C55366xib.KWHzl(C52761wXj.ActionBar.zDUObI, c55365xia) : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "short") ? C55366xib.KWHzl(C52761wXj.ActionBar.gUEfcq, c55365xia) : C33070mpX.copydefault(C52761wXj.Activity.HJWChPHhYHK);
    }

    public static final int OLrzqt(java.lang.Object obj) {
        return C33129mqd.AEQbTJ(obj, 0) ? C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, EZpvd(), 0.0f, 2, null) : C33129mqd.gEmmrt(obj, 0) ? C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, EZpvd(), 0.0f, 2, null) : C33070mpX.copydefault(C32113mPz.ActionBar.zLjUOn);
    }

    public static /* synthetic */ int getPnlColor$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str4 = "";
        }
        return djBIcL(str, str2, str3, str4);
    }

    public static final int djBIcL(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return OLrzqt((java.lang.Object) AhwBna(str, str2, str3, str4));
    }

    public static /* synthetic */ int getBotHomePnlColor$default(java.lang.String str, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        return AEQbTJ(str, bool);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xvr.getRiseUpColor$default(o.xvr, float, int, java.lang.Object):int */
    public static final int AEQbTJ(java.lang.String str, java.lang.Boolean bool) {
        return Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) ? C33129mqd.AEQbTJ(str, 0) ? C56071xvr.gEmmrt.AuCTel() : C33129mqd.gEmmrt(str, 0) ? C56071xvr.gEmmrt.values() : C33070mpX.copydefault(C52761wXj.Activity.svhCHd) : C33129mqd.AEQbTJ(str, 0) ? C56071xvr.getRiseUpColor$default(C56071xvr.gEmmrt, 0.0f, 1, null) : C33129mqd.gEmmrt(str, 0) ? C56071xvr.getFallDownColor$default(C56071xvr.gEmmrt, 0.0f, 1, null) : C33070mpX.copydefault(C52761wXj.Activity.QwvEab);
    }

    public static final int valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "long")) {
            return 14;
        }
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "short") ? 13 : 0;
    }

    public static final java.lang.String iwGUEr(java.lang.String str) {
        java.lang.String strAYXKKw;
        java.util.ArrayList arrayList;
        xOR xorCopydefault;
        java.util.List<OrderCategory> listAEQbTJ;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "iceberg")) {
            InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
            if (interfaceC54581xNrCopydefault == null || (xorCopydefault = interfaceC54581xNrCopydefault.copydefault()) == null || (listAEQbTJ = xorCopydefault.AEQbTJ()) == null) {
                arrayList = null;
            } else {
                arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
                java.util.Iterator<T> it = listAEQbTJ.iterator();
                while (it.hasNext()) {
                    arrayList.add(((OrderCategory) it.next()).getStrategyType());
                }
            }
            if (arrayList != null && arrayList.contains("smart_iceberg") && arrayList.contains("iceberg")) {
                return C33070mpX.AYXKKw(C55688xof.Application.setupView);
            }
            return C33070mpX.AYXKKw(C55688xof.Application.ComponentActivity1);
        }
        TacticsType tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ(str);
        return (tacticsTypeAEQbTJ == null || (strAYXKKw = C33070mpX.AYXKKw(tacticsTypeAEQbTJ.getStgyName())) == null) ? C33070mpX.AYXKKw(C55688xof.Application.registerUser) : strAYXKKw;
    }

    public static final TacticsType uzCIH(java.lang.String str) {
        TacticsType tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ(str);
        return tacticsTypeAEQbTJ == null ? TacticsType.TACTICS_GRDE : tacticsTypeAEQbTJ;
    }

    public static /* synthetic */ java.lang.String getCoinTitle$default(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        return copydefault(str, str2, z, str3, str4);
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (z && C59449zhJ.gEmmrt(str, "FUTURES", true)) {
            return C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, str2, str, true, false, str3, false, null, 104, null);
        }
        return C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, str2, str, false, false, str3, false, str4, 40, null);
    }

    public static /* synthetic */ java.lang.String getCoinTitleTacticsItem$default(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        return AEQbTJ(str, str2, z, str3, str4);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4) {
        boolean z2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (z) {
            z2 = C59449zhJ.gEmmrt(str, "FUTURES", true);
        }
        return getTitleByIdAndType$default(str2, str, z2, false, str3, str4, 8, null);
    }

    public static /* synthetic */ java.lang.String getTitleByIdAndType$default(java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        boolean z3 = (i & 4) != 0 ? false : z;
        boolean z4 = (i & 8) != 0 ? false : z2;
        if ((i & 16) != 0) {
            str3 = "normal";
        }
        java.lang.String str5 = str3;
        if ((i & 32) != 0) {
            str4 = null;
        }
        return KWHzl(str, str2, z3, z4, str5, str4);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xVs.replaceWrapRtl$default(java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.Object):java.lang.String */
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1819=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String KWHzl(java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.lang.String str3, java.lang.String str4) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        BizInstrument suggestedInstrument$default;
        java.lang.String instFamily;
        java.lang.String strReplace$default;
        java.lang.String upperCase;
        BizInstrument suggestedInstrument$default2;
        java.lang.String strReplaceWrapRtl$default;
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        BizInstrument suggestedInstrument$default3;
        if (!z2 ? str2 == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null)) == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null : str2 == null || (interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault()) == null || (suggestedInstrument$default3 = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, str2, str, null, null, 12, null)) == null || (instFamily = suggestedInstrument$default3.getInstFamily()) == null) {
            instFamily = "";
        }
        if (instFamily.length() == 0) {
            xVE.copydefault.KWHzl(str == null ? "" : str);
        }
        if (str2 == null) {
            return "";
        }
        switch (str2.hashCode()) {
            case -2027980370:
                if (!str2.equals("MARGIN")) {
                    return "";
                }
                break;
            case -1956807563:
                return !str2.equals("OPTION") ? "" : C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, str, str2, z, false, 8, null);
            case 2552066:
                if (!str2.equals("SPOT")) {
                    return "";
                }
                InterfaceC54581xNr interfaceC54581xNrCopydefault2 = C54589xNz.EZpvd.copydefault();
                java.lang.String displayId = (interfaceC54581xNrCopydefault2 == null || (suggestedInstrument$default2 = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault2, str2, str, null, null, 12, null)) == null) ? null : suggestedInstrument$default2.getDisplayId();
                if (!Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "spot_normal")) {
                    if (!C33129mqd.OLrzqt((java.lang.CharSequence) displayId)) {
                        displayId = C33129mqd.OLrzqt((java.lang.CharSequence) str4) ? str4 : str;
                    }
                    if (displayId == null || (strReplace$default = C59449zhJ.replace$default(displayId, "-", "/", false, 4, (java.lang.Object) null)) == null) {
                        return "";
                    }
                    java.util.Locale locale = java.util.Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    upperCase = strReplace$default.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    if (upperCase == null) {
                        return "";
                    }
                }
                return upperCase;
            case 2558355:
                return !str2.equals("SWAP") ? "" : C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, str, str2, z, false, 8, null);
            case 214415088:
                return !str2.equals("FUTURES") ? "" : C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, str, str2, false, false, str3, false, null, 108, null);
            case 1669573011:
                if (!str2.equals("CONVERT")) {
                    return "";
                }
                break;
            default:
                return "";
        }
        if (str == null || (strReplaceWrapRtl$default = C54798xVs.replaceWrapRtl$default(str, "-", "/", false, 4, null)) == null) {
            return "";
        }
        java.util.Locale locale2 = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "");
        upperCase = strReplaceWrapRtl$default.toUpperCase(locale2);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        if (upperCase == null) {
            return "";
        }
        return upperCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kotlin.Pair<java.lang.String, java.lang.String> AEQbTJ(@NotNull MpStgyParam mpStgyParam, @NotNull java.lang.String str) {
        java.lang.String strKWHzl;
        SignParamItem signParamItem;
        java.lang.String strCopydefault;
        java.lang.Object next;
        strKWHzl = "";
        Intrinsics.checkNotNullParameter(mpStgyParam, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<SignParamItem> signParams = mpStgyParam.getSignParams();
        if (signParams != null) {
            java.util.Iterator<T> it = signParams.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((SignParamItem) next).getTriggerAction(), (java.lang.Object) str)) {
                    break;
                }
            }
            signParamItem = (SignParamItem) next;
        } else {
            signParamItem = null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "stop")) {
            if (Intrinsics.EZpvd((java.lang.Object) (signParamItem != null ? signParamItem.getIndicator() : null), (java.lang.Object) GridStartTriggerType.INSTANT.getMode())) {
                strCopydefault = C33070mpX.AYXKKw(GridStopTriggerType.MANUAL_STOP.getDesc());
            }
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) (signParamItem != null ? signParamItem.getIndicator() : null), (java.lang.Object) GridStartTriggerType.RSI_14.getMode())) {
                strCopydefault = C33070mpX.AYXKKw(C55688xof.Application.QVsKAR);
            } else {
                strCopydefault = GridStartTriggerType.Companion.copydefault(signParamItem != null ? signParamItem.getIndicator() : null);
            }
        }
        java.lang.String indicator = signParamItem != null ? signParamItem.getIndicator() : null;
        if (!Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) GridStartTriggerType.INSTANT.getMode())) {
            if (Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) GridStartTriggerType.PRICE.getMode())) {
                int i = C55688xof.Application.setSubtitle;
                java.lang.String instType = mpStgyParam.getInstType();
                java.lang.String instId = mpStgyParam.getInstId();
                java.lang.String triggerPx = signParamItem.getTriggerPx();
                java.lang.String strCopydefault2 = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, getBotPrice$default(instType, instId, triggerPx == null ? "" : triggerPx, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null))));
                int i2 = C55688xof.Application.MediaDescriptionCompatApi21;
                xMR xmr = xMR.copydefault;
                java.lang.String delaySeconds = signParamItem.getDelaySeconds();
                strKWHzl = strCopydefault2 + "\n" + C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("delaySec", xmr.copydefault(delaySeconds != null ? delaySeconds : ""))));
            } else if (Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) GridStartTriggerType.RSI_14.getMode())) {
                strKWHzl = KWHzl(signParamItem.getTimePeriod(), signParamItem.getTimeframe(), signParamItem.getTriggerCond(), signParamItem.getThold());
            }
        }
        return C56390yDp.OLrzqt(strCopydefault, strKWHzl);
    }

    public static final java.lang.String KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        int i = C55688xof.Application.setMediaUri;
        kotlin.Pair[] pairArr = new kotlin.Pair[4];
        if (str == null) {
            str = "";
        }
        pairArr[0] = C56390yDp.OLrzqt("periodNum", AkhnZx(str));
        if (str2 == null) {
            str2 = "";
        }
        pairArr[1] = C56390yDp.OLrzqt("chartTime", AEQbTJ(str2));
        if (str3 == null) {
            str3 = "";
        }
        pairArr[2] = C56390yDp.OLrzqt("triggerWhen", fIwbmz(str3));
        if (str4 == null) {
            str4 = "";
        }
        pairArr[3] = C56390yDp.OLrzqt("threshold", fARcdN(str4));
        return C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr));
    }

    public static final java.util.ArrayList<ItemData> EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.util.ArrayList<ItemData> arrayList = new java.util.ArrayList<>();
        arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.fromMediaItem), AkhnZx(str == null ? "" : str), false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null));
        arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.heceqZ), TimeFrame.Companion.copydefault(str2 == null ? "" : str2), false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null));
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.getACTION_SYSTEM_FALLBACK_PICK_IMAGESannotations);
        java.lang.String strFIwbmz = fIwbmz(str3 == null ? "" : str3);
        arrayList.add(new ItemData(strAYXKKw, strFIwbmz + " " + fARcdN(str4 != null ? str4 : ""), false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null));
        return arrayList;
    }

    public static final java.util.ArrayList<ItemData> OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        java.util.ArrayList<ItemData> arrayList = new java.util.ArrayList<>();
        arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.fromMediaItem), AkhnZx(str2 == null ? "" : str2), false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null));
        arrayList.add(new ItemData(C33070mpX.AYXKKw(C55688xof.Application.heceqZ), TimeFrame.Companion.copydefault(str3 == null ? "" : str3), false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null));
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.getACTION_SYSTEM_FALLBACK_PICK_IMAGESannotations);
        java.lang.String strFIwbmz = fIwbmz(str4 == null ? "" : str4);
        arrayList.add(new ItemData(strAYXKKw, strFIwbmz + " " + fARcdN(str5 == null ? "" : str5), false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null));
        arrayList.add(new ItemData(C33070mpX.AYXKKw(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) TtmlNode.START) ? C55688xof.Application.ActivityResultContractsGetContent : C55688xof.Application.ActivityResultContractsGetMultipleContentsCompanion), C33069mpW.copydefault(C55688xof.Application.onViewDetachedFromWindow, C56423yEv.EZpvd(C56390yDp.OLrzqt("second", xMR.copydefault.copydefault(str6 != null ? str6 : "")))), false, 0, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (ItemDataToggle) null, (TacticsUiConst.BotListSubItemType) null, (java.lang.String) null, (java.lang.String) null, 16777212, (DefaultConstructorMarker) null));
        return arrayList;
    }

    public static final java.lang.String AkhnZx(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ? "--" : xMR.copydefault.copydefault(str);
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ? "--" : TimeFrame.Companion.copydefault(str);
    }

    public static final java.lang.String fIwbmz(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ? "--" : TriggerCond.Companion.KWHzl(str);
    }

    public static final java.lang.String fARcdN(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ? "--" : xMR.copydefault.copydefault(str);
    }

    public static final java.lang.String EZpvd(@NotNull InterfaceC56538yJb<java.lang.String> interfaceC56538yJb, @NotNull EarnType earnType, @NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(interfaceC56538yJb, "");
        Intrinsics.checkNotNullParameter(earnType, "");
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        int i = TaskDescription.OLrzqt[earnType.ordinal()];
        if (i == 1) {
            return C33069mpW.copydefault(C55688xof.Application.hasHeart, C56424yEw.gEmmrt(C56390yDp.OLrzqt("gapPctBelow", pTB.formatICUPercent$default(C33129mqd.EZpvd(interfaceC56538yJb.getStart()), null, null, null, java.lang.Double.valueOf(100.0d), null, 23, null)), C56390yDp.OLrzqt("gapPctAbove", pTB.formatICUPercent$default(C33129mqd.EZpvd(interfaceC56538yJb.getEndInclusive()), null, null, null, java.lang.Double.valueOf(100.0d), null, 23, null))));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C33069mpW.copydefault(C55688xof.Application.hasHeart, C56424yEw.gEmmrt(C56390yDp.OLrzqt("gapPctBelow", getBotPrice$default(bizInstrument.getInstType(), bizInstrument.getInstId(), (java.lang.String) interfaceC56538yJb.getStart(), false, false, null, null, 120, null)), C56390yDp.OLrzqt("gapPctAbove", getBotPrice$default(bizInstrument.getInstType(), bizInstrument.getInstId(), (java.lang.String) interfaceC56538yJb.getEndInclusive(), false, false, null, null, 120, null))));
    }

    public static final java.util.ArrayList<AdvancedTriggerSign> EZpvd(java.util.List<SignParamItem> list) {
        java.util.ArrayList<AdvancedTriggerSign> arrayList;
        AdvancedTriggerSign advancedTriggerSign;
        if (list != null) {
            arrayList = new java.util.ArrayList<>(C56403yEb.AYXKKw(list, 10));
            for (SignParamItem signParamItem : list) {
                java.lang.String indicator = signParamItem.getIndicator();
                if (Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) GridStartTriggerType.PRICE.getMode())) {
                    advancedTriggerSign = new AdvancedTriggerSign(signParamItem.getTriggerAction(), signParamItem.getIndicator(), (java.lang.String) null, signParamItem.getTriggerPx(), signParamItem.getDelaySeconds(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, Intrinsics.EZpvd((java.lang.Object) signParamItem.getTriggerAction(), (java.lang.Object) "stop") ? signParamItem.getStopType() : null, (java.lang.String) null, 3044, (DefaultConstructorMarker) null);
                } else if (Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) GridStartTriggerType.RSI_14.getMode())) {
                    advancedTriggerSign = new AdvancedTriggerSign(signParamItem.getTriggerAction(), signParamItem.getIndicator(), (java.lang.String) null, (java.lang.String) null, signParamItem.getDelaySeconds(), signParamItem.getTimePeriod(), signParamItem.getTimeframe(), signParamItem.getTriggerCond(), signParamItem.getThold(), (java.lang.String) null, signParamItem.getStopType(), (java.lang.String) null, 2572, (DefaultConstructorMarker) null);
                } else {
                    advancedTriggerSign = new AdvancedTriggerSign(signParamItem.getTriggerAction(), signParamItem.getIndicator(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, Intrinsics.EZpvd((java.lang.Object) signParamItem.getTriggerAction(), (java.lang.Object) "stop") ? signParamItem.getStopType() : null, (java.lang.String) null, 3068, (DefaultConstructorMarker) null);
                }
                arrayList.add(advancedTriggerSign);
            }
        } else {
            arrayList = null;
        }
        java.util.ArrayList<AdvancedTriggerSign> arrayList2 = arrayList instanceof java.util.ArrayList ? arrayList : null;
        return arrayList2 == null ? new java.util.ArrayList<>() : arrayList2;
    }
}
