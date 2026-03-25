package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.bot.data.ShareData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xtl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55959xtl implements InterfaceC54501xKt<StrategyDetailsResponse, ShareData> {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX INFO: renamed from: o.xtl$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xtl.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ kotlin.Pair getTitleOne$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            return actionBar.KWHzl(str, str2);
        }

        public final kotlin.Pair<java.lang.String, java.lang.String> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ^ true ? copydefault(str) : AEQbTJ(str2);
        }

        public final kotlin.Pair<java.lang.String, java.lang.String> copydefault(java.lang.String str) {
            return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.getTabCount), xMR.copydefault.copydefault(str));
        }

        public final kotlin.Pair<java.lang.String, java.lang.String> AEQbTJ(java.lang.String str) {
            return C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.createIntentactivity_release), str);
        }

        public final kotlin.Pair<java.lang.String, java.lang.String> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt;
            xMS xmsGEmmrt;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt = C56390yDp.OLrzqt("", null);
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str4) || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str5) || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
                return pairOLrzqt;
            }
            BizInstrument suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str3, null, null, 12, null);
            java.lang.String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
            java.lang.String strAEQbTJ = xUW.KWHzl.AEQbTJ(str3);
            if (instFamily == null || instFamily.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) instFamily)) {
                instFamily = strAEQbTJ;
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str2);
            if (abstractC54531xLwOLrzqt != null && (xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instFamily)) != null) {
                java.lang.String safeString$default = C54536xML.toSafeString$default(xmsGEmmrt.AYXKKw(str4).isConnected().djBIcL(), false, 1, null);
                java.lang.String safeString$default2 = C54536xML.toSafeString$default(xmsGEmmrt.AYXKKw(str5).isConnected().djBIcL(), false, 1, null);
                return C56390yDp.OLrzqt(C33069mpW.copydefault(C55688xof.Application.getStateWithUpdatedPosition, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", str))), safeString$default + "-" + safeString$default2);
            }
            return pairOLrzqt;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ShareData KWHzl(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
        java.lang.String pnlRatio;
        java.lang.String str;
        java.lang.String totalPnl = "";
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String strEZpvd = C56033xvF.EZpvd(interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), null, null, 12, null) : null);
        java.lang.String strValueOf = C56033xvF.valueOf(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), strategyDetailsResponse.getSourceCcy());
        ActionBar actionBar = Companion;
        kotlin.Pair pairCopydefault = actionBar.copydefault(strategyDetailsResponse.getArbitrageNum());
        java.lang.String str2 = (java.lang.String) pairCopydefault.component1();
        java.lang.String str3 = (java.lang.String) pairCopydefault.component2();
        kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault2 = actionBar.copydefault(strEZpvd, strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), strategyDetailsResponse.getMinPx(), strategyDetailsResponse.getMaxPx());
        java.lang.String strComponent1 = pairCopydefault2.component1();
        java.lang.String strComponent2 = pairCopydefault2.component2();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strategyDetailsResponse.getSourceCcy())) {
            pnlRatio = strategyDetailsResponse.getPnlRatioInSourceCcy();
            if (pnlRatio == null) {
                str = "";
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strategyDetailsResponse.getSourceCcy())) {
                totalPnl = strategyDetailsResponse.getTotalPnl();
            } else {
                java.lang.String totalPnlInSourceCcy = strategyDetailsResponse.getTotalPnlInSourceCcy();
                if (totalPnlInSourceCcy != null) {
                    totalPnl = totalPnlInSourceCcy;
                }
            }
            java.lang.String str4 = totalPnl;
            java.lang.String sourceCcy = strategyDetailsResponse.getSourceCcy();
            return new ShareData(null, str, null, str4, (sourceCcy != null || sourceCcy.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) sourceCcy)) ? strValueOf : sourceCcy, str2, str3, strComponent1, strComponent2, null, null, null, null, null, C56066xvm.getPnlUnit$default(C56066xvm.EZpvd, strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), null, 4, null), 15877, null);
        }
        pnlRatio = strategyDetailsResponse.getPnlRatio();
        str = pnlRatio;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strategyDetailsResponse.getSourceCcy())) {
        }
        java.lang.String str42 = totalPnl;
        java.lang.String sourceCcy2 = strategyDetailsResponse.getSourceCcy();
        return new ShareData(null, str, null, str42, (sourceCcy2 != null || sourceCcy2.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) sourceCcy2)) ? strValueOf : sourceCcy2, str2, str3, strComponent1, strComponent2, null, null, null, null, null, C56066xvm.getPnlUnit$default(C56066xvm.EZpvd, strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), null, 4, null), 15877, null);
    }
}
