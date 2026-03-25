package o;

import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.dexlogic.bean.track.TrackPageName;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gWP {
    public final java.util.List<java.lang.String> AEQbTJ;
    public final kYC copydefault;

    @yCM
    public gWP(@NotNull kYC kyc) {
        Intrinsics.checkNotNullParameter(kyc, "");
        this.copydefault = kyc;
        this.AEQbTJ = yDY.gEmmrt(EopTrackEvent.KEY_BUTTON_NAME, "button_type", "popup_source");
    }

    public final java.lang.String KWHzl() {
        InterfaceC9738bbJ interfaceC9738bbJCopydefault = this.copydefault.copydefault();
        return (interfaceC9738bbJCopydefault == null || !interfaceC9738bbJCopydefault.RJOkX()) ? "no" : "yes";
    }

    public static /* synthetic */ C22402heg buildCommonProperty$default(gWP gwp, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = TrackButtonName.COPY_TRADE.getButtonName();
        }
        return gwp.KWHzl(str, str2, str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }

    public final C22402heg KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return new C22402heg(this.copydefault.OLrzqt(C33129mqd.valueOf(str)), "no", AbstractC22421hez.Companion.KWHzl(), str3, str4, str5, str2, KWHzl());
    }

    public final java.util.Map<java.lang.String, java.lang.String> EZpvd() {
        TrackButtonName trackButtonName = TrackButtonName.COPY_TRADE;
        return C56424yEw.gEmmrt(C56390yDp.OLrzqt("module", trackButtonName.getButtonName()), C56390yDp.OLrzqt("product_type", trackButtonName.getButtonName()));
    }

    public final java.lang.String AEQbTJ(boolean z) {
        if (z) {
            return DexTrackEventParameter.ButtonName.ON.getValue();
        }
        return DexTrackEventParameter.ButtonName.OFF.getValue();
    }

    public final void AEQbTJ() {
        C25437iwh.KWHzl("DEXMarket_CopyTrade_Dashboard_View", buildCommonProperty$default(this, "all", TrackPageName.COPY_TRADE_DASHBOARD.getPageName(), null, null, null, 28, null), EZpvd(), this.AEQbTJ);
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C25437iwh.KWHzl("DEXMarket_CopyTrade_Dashboard_Click", buildCommonProperty$default(this, "all", TrackPageName.COPY_TRADE_DASHBOARD.getPageName(), null, null, null, 28, null), (java.util.Map<java.lang.String, java.lang.String>) C56424yEw.OLrzqt(EZpvd(), C56423yEv.EZpvd(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, str))), this.AEQbTJ);
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C25437iwh.KWHzl("DEXMarket_CopyTrade_Dashboard_Click", buildCommonProperty$default(this, "all", TrackPageName.HOME.getPageName(), null, null, null, 28, null), (java.util.Map<java.lang.String, java.lang.String>) C56424yEw.OLrzqt(EZpvd(), C56423yEv.EZpvd(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, str))), this.AEQbTJ);
    }

    public final void OLrzqt() {
        C25437iwh.KWHzl("DEXMarket_CopyTrade_StrategyDetailsPage_View", buildCommonProperty$default(this, "all", TrackPageName.COPY_TRADE_DETAILS.getPageName(), null, null, null, 28, null), EZpvd(), this.AEQbTJ);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C25437iwh.KWHzl("DEXMarket_CopyTrade_StrategyDetailsPage_Click", buildCommonProperty$default(this, "all", TrackPageName.COPY_TRADE_DETAILS.getPageName(), null, null, null, 28, null), (java.util.Map<java.lang.String, java.lang.String>) C56424yEw.OLrzqt(EZpvd(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("module", TrackButtonName.COPY_TRADE.getButtonName()), C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, str), C56390yDp.OLrzqt("strategy_type", str2))), this.AEQbTJ);
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C25437iwh.KWHzl("DEXTrade_CopyTrade_StrategyEditPage_View", buildCommonProperty$default(this, str, TrackPageName.COPY_TRADE_STRATEGY_FORM.getPageName(), null, null, null, 28, null), (java.util.Map<java.lang.String, java.lang.String>) C56424yEw.OLrzqt(EZpvd(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("strategy_type", str2), C56390yDp.OLrzqt("page_from", str3))), this.AEQbTJ);
    }

    public static /* synthetic */ void trackStrategyEditPageClickEvent$default(gWP gwp, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str4 = "";
        }
        gwp.EZpvd(str, str2, str3, str4);
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        C25437iwh.KWHzl("DEXTrade_CopyTrade_StrategyEditPage_Click", buildCommonProperty$default(this, str, TrackPageName.STRATEGY_EDIT_PAGE.getPageName(), null, null, null, 28, null), (java.util.Map<java.lang.String, java.lang.String>) C56424yEw.OLrzqt(C56424yEw.OLrzqt(EZpvd(), C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, str2), C56390yDp.OLrzqt("strategy_type", str3))), OLrzqt(str2, str4)), this.AEQbTJ);
    }

    public static /* synthetic */ java.util.Map checkAdditional$default(gWP gwp, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return gwp.OLrzqt(str, str2);
    }

    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt(java.lang.String str, java.lang.String str2) {
        TrackButtonName trackButtonName = TrackButtonName.MIN_TOKEN_AGE_UNIT;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) trackButtonName.getButtonName())) {
            return C56423yEv.EZpvd(C56390yDp.OLrzqt(trackButtonName.getButtonName(), str2));
        }
        TrackButtonName trackButtonName2 = TrackButtonName.MAX_TOKEN_AGE_UNIT;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) trackButtonName2.getButtonName())) {
            return C56423yEv.EZpvd(C56390yDp.OLrzqt(trackButtonName2.getButtonName(), str2));
        }
        TrackButtonName trackButtonName3 = TrackButtonName.CHANGE_NETWORK;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) trackButtonName3.getButtonName())) {
            return C56423yEv.EZpvd(C56390yDp.OLrzqt(trackButtonName3.getButtonName(), str2));
        }
        TrackButtonName trackButtonName4 = TrackButtonName.QUOTE_TOKEN;
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) trackButtonName4.getButtonName()) ? C56423yEv.EZpvd(C56390yDp.OLrzqt(trackButtonName4.getButtonName(), str2)) : C56424yEw.KWHzl();
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11, @NotNull java.lang.String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        C25437iwh.KWHzl("DEXTrade_CopyTrade_CopyTradeSubmit_Click", buildCommonProperty$default(this, str, TrackPageName.STRATEGY_EDIT_PAGE.getPageName(), null, null, null, 28, null), (java.util.Map<java.lang.String, java.lang.String>) C56424yEw.OLrzqt(EZpvd(), C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, Web3SecurityTrackEvent.VALUE_CONFIRM), C56390yDp.OLrzqt("buy_settings", str2), C56390yDp.OLrzqt("max_buy", AEQbTJ(z)), C56390yDp.OLrzqt("skip_holdings", AEQbTJ(z2)), C56390yDp.OLrzqt("copy_sell", AEQbTJ(z3)), C56390yDp.OLrzqt("auto_sell", AEQbTJ(z4)), C56390yDp.OLrzqt("target_amount_min", str3), C56390yDp.OLrzqt("target_amount_max", str4), C56390yDp.OLrzqt("target_market_cap_min", str5), C56390yDp.OLrzqt("target_market_cap_max", str6), C56390yDp.OLrzqt("target_liquidity_min", str7), C56390yDp.OLrzqt("target_liquidity_max", str8), C56390yDp.OLrzqt("target_token_age_min", str9), C56390yDp.OLrzqt("target_token_age_max", str10), C56390yDp.OLrzqt("token_blocklist", str11), C56390yDp.OLrzqt("expiration", str12))), this.AEQbTJ);
    }
}
