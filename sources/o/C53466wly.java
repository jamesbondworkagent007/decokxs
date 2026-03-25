package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.biz.TradeType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.manager.MarginModeManager;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wly, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53466wly {
    public static final C53466wly AEQbTJ = new C53466wly();

    private C53466wly() {
    }

    public final boolean KWHzl(BizInstrument bizInstrument, java.util.ArrayList<java.lang.String> arrayList, TradeType tradeType) {
        return C53685wqE.copydefault.OLrzqt().EZpvd(bizInstrument, arrayList, tradeType);
    }

    public static /* synthetic */ java.util.ArrayList getCollateralCoinMarginList$default(C53466wly c53466wly, BizInstrument bizInstrument, java.lang.String str, TradeType tradeType, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return c53466wly.AEQbTJ(bizInstrument, str, tradeType);
    }

    public final java.util.ArrayList<java.lang.String> AEQbTJ(BizInstrument bizInstrument, java.lang.String str, TradeType tradeType) {
        return C53685wqE.copydefault.OLrzqt().AEQbTJ(bizInstrument, str, tradeType);
    }

    public final void EZpvd(@NotNull FragmentActivity fragmentActivity, BizInstrument bizInstrument, java.lang.String str, TradeType tradeType, Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        java.util.ArrayList<java.lang.String> arrayListAEQbTJ = AEQbTJ(bizInstrument, str, tradeType);
        java.lang.String strAEQbTJ = AEQbTJ(bizInstrument, tradeType);
        pUU.KWHzl("CollateralApiHelper", "instType:" + (bizInstrument != null ? bizInstrument.getInstType() : null) + " instId:" + (bizInstrument != null ? bizInstrument.getInstId() : null) + " marginSymbol:" + str + " tradeType:" + (tradeType != null ? tradeType.name() : null));
        OLrzqt(fragmentActivity, arrayListAEQbTJ, strAEQbTJ, function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.wly */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void openCollateralCoinFragment$default(C53466wly c53466wly, FragmentActivity fragmentActivity, java.util.ArrayList arrayList, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        c53466wly.OLrzqt(fragmentActivity, (java.util.ArrayList<java.lang.String>) arrayList, str, (Function1<? super java.lang.Boolean, Unit>) function1);
    }

    public final void OLrzqt(FragmentActivity fragmentActivity, java.util.ArrayList<java.lang.String> arrayList, java.lang.String str, Function1<? super java.lang.Boolean, Unit> function1) {
        C53685wqE.copydefault.OLrzqt().AEQbTJ(fragmentActivity, arrayList, str, function1);
    }

    public final java.lang.String AEQbTJ(BizInstrument bizInstrument, TradeType tradeType) {
        return C53685wqE.copydefault.OLrzqt().OLrzqt(bizInstrument, tradeType);
    }

    public final void KWHzl(@NotNull C52794wYp c52794wYp, java.util.ArrayList<java.lang.String> arrayList) {
        Intrinsics.checkNotNullParameter(c52794wYp, "");
        if (!C33129mqd.AEQbTJ(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null, 1)) {
            if (arrayList != null && arrayList.size() == 1) {
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                android.text.style.StyleSpan styleSpan = new android.text.style.StyleSpan(1);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((java.lang.CharSequence) C33069mpW.copydefault(C48033uCm.Fragment.isTimeProfileEmpty, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", C33129mqd.gEmmrt(arrayList.get(0))))));
                spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
                c52794wYp.setText(new android.text.SpannedString(spannableStringBuilder));
                return;
            }
            android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder();
            android.text.style.StyleSpan styleSpan2 = new android.text.style.StyleSpan(1);
            int length2 = spannableStringBuilder2.length();
            spannableStringBuilder2.append((java.lang.CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.gCiISl));
            spannableStringBuilder2.setSpan(styleSpan2, length2, spannableStringBuilder2.length(), 17);
            c52794wYp.setText(new android.text.SpannedString(spannableStringBuilder2));
            return;
        }
        android.text.SpannableStringBuilder spannableStringBuilder3 = new android.text.SpannableStringBuilder();
        android.text.style.StyleSpan styleSpan3 = new android.text.style.StyleSpan(1);
        int length3 = spannableStringBuilder3.length();
        spannableStringBuilder3.append((java.lang.CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.gCiISl));
        spannableStringBuilder3.setSpan(styleSpan3, length3, spannableStringBuilder3.length(), 17);
        c52794wYp.setText(new android.text.SpannedString(spannableStringBuilder3));
    }

    public static /* synthetic */ void clickSetCollateralBtnEvent$default(C53466wly c53466wly, BizInstrument bizInstrument, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        c53466wly.OLrzqt(bizInstrument, str);
    }

    public final void OLrzqt(final BizInstrument bizInstrument, java.lang.String str) {
        final java.lang.String str2;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SMART_ICEBERG")) {
            str2 = "iceberg";
        } else {
            str2 = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "TWAP") ? "twap" : null;
        }
        C32866mlf.onEvent$default("Trade_Placeorder_CollateralSetting_Click", (TrackChannel[]) null, new Function1() { // from class: o.wlB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53466wly.AEQbTJ(bizInstrument, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(BizInstrument bizInstrument, java.lang.String str, EventParamsList eventParamsList) {
        MarginModeManager marginModeManagerIsConnected;
        java.lang.String currentMarginMode$default;
        java.lang.String instType;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "biz_type", (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) ? "" : instType, false, 4, null);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        EventParamsList.put$default(eventParamsList, "margin_mode", (interfaceC54581xNrOLrzqt == null || (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt.isConnected()) == null || (currentMarginMode$default = MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected, false, bizInstrument, 1, null)) == null) ? "" : currentMarginMode$default, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_PAGE_TYPE, "bot", false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.CRYPTO_ORDER_TYPE, str == null ? "" : str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void clickOpenCollateralBtnEvent$default(C53466wly c53466wly, BizInstrument bizInstrument, java.util.ArrayList arrayList, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        c53466wly.KWHzl(bizInstrument, (java.util.ArrayList<java.lang.String>) arrayList, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(final BizInstrument bizInstrument, java.util.ArrayList<java.lang.String> arrayList, java.lang.String str) {
        final java.lang.String str2;
        java.lang.String str3;
        java.lang.String strJoinToString$default;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SMART_ICEBERG")) {
            str3 = "iceberg";
        } else {
            if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "TWAP")) {
                str2 = null;
                final java.lang.String str4 = "";
                if (C33129mqd.AEQbTJ(arrayList == null ? java.lang.Integer.valueOf(arrayList.size()) : null, 1)) {
                    if (arrayList != null && arrayList.size() == 1) {
                        java.lang.String str5 = arrayList.get(0);
                        Intrinsics.checkNotNullExpressionValue(str5, "");
                        str4 = str5;
                    }
                } else if (arrayList != null && (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null)) != null) {
                    str4 = strJoinToString$default;
                }
                C32866mlf.onEvent$default("CollateralSetting_Bottomsheet_Confirm_Click", (TrackChannel[]) null, new Function1() { // from class: o.wlA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C53466wly.OLrzqt(bizInstrument, str4, str2, (EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
            }
            str3 = "twap";
        }
        str2 = str3;
        final java.lang.String str42 = "";
        if (C33129mqd.AEQbTJ(arrayList == null ? java.lang.Integer.valueOf(arrayList.size()) : null, 1)) {
        }
        C32866mlf.onEvent$default("CollateralSetting_Bottomsheet_Confirm_Click", (TrackChannel[]) null, new Function1() { // from class: o.wlA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53466wly.OLrzqt(bizInstrument, str42, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(BizInstrument bizInstrument, java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        MarginModeManager marginModeManagerIsConnected;
        java.lang.String currentMarginMode$default;
        java.lang.String instType;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "biz_type", (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) ? "" : instType, false, 4, null);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        EventParamsList.put$default(eventParamsList, "margin_mode", (interfaceC54581xNrOLrzqt == null || (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt.isConnected()) == null || (currentMarginMode$default = MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected, false, bizInstrument, 1, null)) == null) ? "" : currentMarginMode$default, false, 4, null);
        EventParamsList.put$default(eventParamsList, "margin_token", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_PAGE_TYPE, "bot", false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.CRYPTO_ORDER_TYPE, str2 == null ? "" : str2, false, 4, null);
        return Unit.INSTANCE;
    }
}
