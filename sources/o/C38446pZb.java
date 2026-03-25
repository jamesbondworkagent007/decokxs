package o;

import com.okinc.dexkline.dex.api.enums.KlineDexPageFromType;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DexInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.oKA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pZb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38446pZb implements InterfaceC38465pZu {
    private static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public androidx.fragment.app.Fragment KWHzl;
    public android.content.Context OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt() {
        this.KWHzl = null;
        this.OLrzqt = null;
    }

    /* JADX INFO: renamed from: o.pZb$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pZb.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public void OLrzqt(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.KWHzl = fragment;
        this.OLrzqt = fragment.getContext();
    }

    @Override // o.InterfaceC38465pZu
    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull BizInstrument bizInstrument, int i, java.lang.String str3) {
        InterfaceC38466pZv interfaceC38466pZvCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        C41298qoF.AEQbTJ.EZpvd("DefaultMarketsNavToDetail", "navigateInstrumentDetailPage [instrument: " + bizInstrument + ", position: " + i);
        MarketCoinInfo marketCoinInfo = new MarketCoinInfo(bizInstrument.getInstId(), bizInstrument.getInstType(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
        oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
        if (oka != null) {
            android.content.Context context = this.OLrzqt;
            if (context == null) {
                return;
            } else {
                oKA.TaskDescription.gotoNewKlinePage$default(oka, context, marketCoinInfo, null, null, "page_info", null, null, null, str3 == null ? "Discover_Market" : str3, null, null, 1772, null);
            }
        }
        androidx.fragment.app.Fragment fragment = this.KWHzl;
        if (fragment != null && (interfaceC38466pZvCopydefault = C38470pZz.copydefault(fragment)) != null) {
            interfaceC38466pZvCopydefault.copydefault(bizInstrument.getInstId(), bizInstrument.getInstType(), i, str, str2);
        }
        C46688tbr.KWHzl.KWHzl("market_discover_" + str + "_" + str2, C56424yEw.gEmmrt(C56390yDp.OLrzqt("deal_type", bizInstrument.getInstType()), C56390yDp.OLrzqt("deal_name", bizInstrument.getInstId())));
    }

    @Override // o.InterfaceC38465pZu
    public void AEQbTJ(@NotNull TradeCoinInfo tradeCoinInfo, int i, @NotNull java.lang.String str) {
        InterfaceC38466pZv interfaceC38466pZvCopydefault;
        Intrinsics.checkNotNullParameter(tradeCoinInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        C41298qoF.AEQbTJ.EZpvd("DefaultMarketsNavToDetail", "navigateCoinDetailPage [tradeCoinInfo: " + tradeCoinInfo + ", position: " + i);
        java.lang.String upperCase = tradeCoinInfo.getSymbol().toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        xUO xuo = xUO.AEQbTJ;
        BizInstrument bizInstrumentCopydefault = xuo.copydefault(upperCase);
        java.lang.String strOLrzqt = xuo.OLrzqt(bizInstrumentCopydefault != null ? bizInstrumentCopydefault.getInstId() : null);
        oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
        if (oka != null) {
            android.content.Context context = this.OLrzqt;
            if (context == null) {
                return;
            } else {
                oka.AEQbTJ(context, upperCase, strOLrzqt, "markets");
            }
        }
        androidx.fragment.app.Fragment fragment = this.KWHzl;
        if (fragment != null && (interfaceC38466pZvCopydefault = C38470pZz.copydefault(fragment)) != null) {
            interfaceC38466pZvCopydefault.AEQbTJ(tradeCoinInfo, i, str);
        }
        C46688tbr c46688tbr = C46688tbr.KWHzl;
        java.lang.String str2 = "market_discover_" + str;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = C56390yDp.OLrzqt("deal_type", OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK);
        pairArr[1] = C56390yDp.OLrzqt("deal_name", strOLrzqt != null ? strOLrzqt : "");
        c46688tbr.KWHzl(str2, C56424yEw.gEmmrt(pairArr));
    }

    @Override // o.InterfaceC38465pZu
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull DexInstrument dexInstrument, int i, java.lang.String str3, java.lang.String str4, java.lang.Boolean bool) {
        android.content.Context context;
        InterfaceC38466pZv interfaceC38466pZvCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        C35968oKj c35968oKj = new C35968oKj(dexInstrument.getChainId(), dexInstrument.getTokenContractAddress(), dexInstrument.getChainName(), dexInstrument.getTokenSymbol(), dexInstrument.getChainLogoUrl(), dexInstrument.getTokenLogoUrl(), "");
        androidx.fragment.app.Fragment fragment = this.KWHzl;
        if (fragment != null && (interfaceC38466pZvCopydefault = C38470pZz.copydefault(fragment)) != null) {
            interfaceC38466pZvCopydefault.copydefault(dexInstrument, i, str, str2, java.lang.Boolean.valueOf(bool != null ? bool.booleanValue() : false));
        }
        oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
        if (oka == null || (context = this.OLrzqt) == null) {
            return;
        }
        oKA.TaskDescription.gotoNewKlinePage$default(oka, context, null, null, null, str4 == null ? KlineDexPageFromType.MARKET_DEX_LIST.getValue() : str4, null, null, null, str3 == null ? "Discover_Market" : str3, c35968oKj, null, 1262, null);
    }
}
