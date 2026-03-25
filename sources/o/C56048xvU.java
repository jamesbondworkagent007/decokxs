package o;

import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.core.ktx.MatchPattern;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.bot.util.signalBot.SignalBotAdvancedData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xvU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56048xvU {
    public static final C56048xvU EZpvd = new C56048xvU();

    private C56048xvU() {
    }

    public final java.lang.String EZpvd(@NotNull SignalBotAdvancedData signalBotAdvancedData) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(signalBotAdvancedData, "");
        java.lang.String subOrdType = signalBotAdvancedData.getSubOrdType();
        if (Intrinsics.EZpvd((java.lang.Object) subOrdType, (java.lang.Object) "1")) {
            xMR xmr = xMR.copydefault;
            java.lang.String ratio = signalBotAdvancedData.getRatio();
            java.lang.String percent$default = xMR.formatPercent$default(xmr, ratio == null ? "" : ratio, 2, 0, null, 8, null);
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.jNexW) + ", " + percent$default;
        } else if (Intrinsics.EZpvd((java.lang.Object) subOrdType, (java.lang.Object) "2")) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ExKek);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.onScrollStateChanged);
        }
        return C33129mqd.gEmmrt(C33061mpO.setupSpanStyles$default(strAYXKKw, new java.lang.String[]{" | "}, 0, MatchPattern.CONTAINS, false, new Function1() { // from class: o.xvW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C56048xvU.valueOf((java.util.List) obj);
            }
        }, 10, null));
    }

    public static final Unit valueOf(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.aappFQ)));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [64=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String OLrzqt(@NotNull SignalBotAdvancedData signalBotAdvancedData) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(signalBotAdvancedData, "");
        java.lang.String strAYXKKw = signalBotAdvancedData.getAllowMultipleEntry() ? C33070mpX.AYXKKw(C55688xof.Application.getDefaultImpl) : C33070mpX.AYXKKw(C55688xof.Application.ICustomTabsService);
        EntrySignalOrderAmtParam signalOrderAmtParam = signalBotAdvancedData.getSignalOrderAmtParam();
        java.lang.String deleType = signalOrderAmtParam != null ? signalOrderAmtParam.getDeleType() : null;
        if (deleType != null) {
            switch (deleType.hashCode()) {
                case 50:
                    if (!deleType.equals("2")) {
                        str = C33070mpX.AYXKKw(C55688xof.Application.onScrollStateChanged) + " | " + strAYXKKw;
                    } else {
                        xMR xmr = xMR.copydefault;
                        java.lang.String amt = signalBotAdvancedData.getSignalOrderAmtParam().getAmt();
                        str = C33069mpW.copydefault(C55688xof.Application.asBinder, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, xmr.copydefault(amt != null ? amt : "", 2) + " USDT"))) + " | " + strAYXKKw;
                    }
                    break;
                case 51:
                    if (deleType.equals("3")) {
                        xMR xmr2 = xMR.copydefault;
                        java.lang.String amt2 = signalBotAdvancedData.getSignalOrderAmtParam().getAmt();
                        str = C33069mpW.copydefault(C55688xof.Application.ICustomTabsCallbackDefault, C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, xmr2.copydefault(amt2 != null ? amt2 : "", 2)))) + " | " + strAYXKKw;
                        break;
                    }
                    break;
                case 52:
                    if (deleType.equals("4")) {
                        xMR xmr3 = xMR.copydefault;
                        java.lang.String amtRatio = signalBotAdvancedData.getSignalOrderAmtParam().getAmtRatio();
                        str = C33069mpW.copydefault(C55688xof.Application.setDefaultImpl, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", xMR.formatPercent$default(xmr3, amtRatio == null ? "" : amtRatio, 2, 0, null, 8, null)))) + " | " + strAYXKKw;
                        break;
                    }
                    break;
                case 53:
                    if (deleType.equals("5")) {
                        xMR xmr4 = xMR.copydefault;
                        java.lang.String amtRatio2 = signalBotAdvancedData.getSignalOrderAmtParam().getAmtRatio();
                        str = C33069mpW.copydefault(C55688xof.Application.getInterfaceDescriptor, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", xMR.formatPercent$default(xmr4, amtRatio2 == null ? "" : amtRatio2, 2, 0, null, 8, null)))) + " | " + strAYXKKw;
                        break;
                    }
                    break;
            }
        }
        return C33129mqd.gEmmrt(C33061mpO.setupSpanStyles$default(str, new java.lang.String[]{" | "}, 0, MatchPattern.CONTAINS, false, new Function1() { // from class: o.xvZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C56048xvU.AEQbTJ((java.util.List) obj);
            }
        }, 10, null));
    }

    public static final Unit AEQbTJ(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.aappFQ)));
        return Unit.INSTANCE;
    }

    public final java.lang.String copydefault(@NotNull SignalBotAdvancedData signalBotAdvancedData) {
        java.lang.String percent$default;
        java.lang.String strAYXKKw;
        java.lang.String slPercentage;
        java.lang.String tpPercentage;
        Intrinsics.checkNotNullParameter(signalBotAdvancedData, "");
        ExitSignalOrderAmtParam signalBotOrderStopParam = signalBotAdvancedData.getSignalBotOrderStopParam();
        java.lang.String tpPercentage2 = signalBotOrderStopParam != null ? signalBotOrderStopParam.getTpPercentage() : null;
        if (tpPercentage2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tpPercentage2)) {
            java.lang.String slPercentage2 = signalBotOrderStopParam != null ? signalBotOrderStopParam.getSlPercentage() : null;
            if (slPercentage2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) slPercentage2)) {
                return C33070mpX.AYXKKw(C55688xof.Application.StyleableRes);
            }
        }
        java.lang.String tpPercentage3 = signalBotOrderStopParam != null ? signalBotOrderStopParam.getTpPercentage() : null;
        java.lang.String percent$default2 = "--";
        if (tpPercentage3 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tpPercentage3)) {
            percent$default = "--";
        } else {
            percent$default = xMR.formatPercent$default(xMR.copydefault, (signalBotOrderStopParam == null || (tpPercentage = signalBotOrderStopParam.getTpPercentage()) == null) ? "" : tpPercentage, 2, 0, null, 8, null);
        }
        java.lang.String slPercentage3 = signalBotOrderStopParam != null ? signalBotOrderStopParam.getSlPercentage() : null;
        if (slPercentage3 != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) slPercentage3)) {
            percent$default2 = xMR.formatPercent$default(xMR.copydefault, (signalBotOrderStopParam == null || (slPercentage = signalBotOrderStopParam.getSlPercentage()) == null) ? "" : slPercentage, 2, 0, null, 8, null);
        }
        if (Intrinsics.EZpvd((java.lang.Object) (signalBotOrderStopParam != null ? signalBotOrderStopParam.getTpSlType() : null), (java.lang.Object) "1")) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.AnimatorRes);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.dispatchMediaButtonEvent);
        }
        return strAYXKKw + " | " + C33129mqd.gEmmrt(C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(C55688xof.Application.onTransact, C56424yEw.gEmmrt(C56390yDp.OLrzqt("percent1", percent$default), C56390yDp.OLrzqt("percent2", percent$default2))), new java.lang.String[]{" | "}, 0, MatchPattern.CONTAINS, false, new Function1() { // from class: o.xvT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C56048xvU.OLrzqt((java.util.List) obj);
            }
        }, 10, null));
    }

    public static final Unit OLrzqt(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.aappFQ)));
        return Unit.INSTANCE;
    }
}
