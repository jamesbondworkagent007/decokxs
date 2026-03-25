package o;

import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC27554jxQ;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class kJH extends AbstractC27554jxQ {
    public boolean AkhnZx;
    public java.lang.String fetchVPNInfo;
    public boolean values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public kJH() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fetchVPNInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27554jxQ
    public boolean AYXKKw(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        return !this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.AkhnZx = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt() {
        this.values = true;
    }

    public kJH(AbstractC27554jxQ.ActionBar actionBar) {
        super(actionBar);
        this.fetchVPNInfo = "";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.jxQ$ActionBar:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.jxQ$ActionBar) : (r1v0 o.jxQ$ActionBar))
 A[MD:(o.jxQ$ActionBar):void (m)] (LINE:21) call: o.kJH.<init>(o.jxQ$ActionBar):void type: THIS */
    public /* synthetic */ kJH(AbstractC27554jxQ.ActionBar actionBar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : actionBar);
    }

    @Override // o.AbstractC27554jxQ
    public java.lang.CharSequence gEmmrt(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        return StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) coinQuote.getBaseCurrency()).toString();
    }

    @Override // o.AbstractC27554jxQ
    public java.lang.CharSequence djBIcL(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        if (!this.AkhnZx) {
            return null;
        }
        java.lang.String string = context.getResources().getString(qZH.PendingIntent.gkJEwt);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.AbstractC27554jxQ
    public java.lang.CharSequence copydefault(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        return coinQuote.getQuoteCurrency();
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/View;ILjava/lang/Object;)V */
    @Override // o.AbstractC27554jxQ, o.InterfaceC33543myT
    public void copydefault(@NotNull android.view.View view, int i, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        java.lang.String instId = coinQuote.getInstId();
        Intrinsics.copydefault((java.lang.Object) instId);
        KWHzl(instId);
        java.lang.String baseCurrency = coinQuote.getBaseCurrency();
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = baseCurrency.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        xUO xuo = xUO.AEQbTJ;
        BizInstrument bizInstrumentCopydefault = xuo.copydefault(upperCase);
        java.lang.String strOLrzqt = xuo.OLrzqt(bizInstrumentCopydefault != null ? bizInstrumentCopydefault.getInstId() : null);
        oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
        if (oka != null) {
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            oka.AEQbTJ(context, upperCase, strOLrzqt, this.fetchVPNInfo);
        }
        Function1<CoinQuote, Unit> function1EZpvd = EZpvd();
        if (function1EZpvd != null) {
            function1EZpvd.invoke(coinQuote);
        }
    }

    public final void KWHzl(final java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) KWHzl(), (java.lang.Object) "favorites")) {
            C32866mlf.onEvent$default("Favorites_List_Token_Click", (TrackChannel[]) null, new Function1() { // from class: o.kJI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kJH.KWHzl(this.EZpvd, str, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        if (Intrinsics.EZpvd((java.lang.Object) KWHzl(), (java.lang.Object) C27989kKu.Companion.AEQbTJ())) {
            C32866mlf.onEvent$default("Markets_List_Token_Click", (TrackChannel[]) null, new Function1() { // from class: o.kJK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kJH.OLrzqt(this.KWHzl, str, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        } else {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("app_type_detail_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.kJJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kJH.KWHzl(str, (EventParamsList) obj);
                }
            });
        }
    }

    public static final Unit KWHzl(kJH kjh, java.lang.String str, EventParamsList eventParamsList) {
        java.lang.String strEZpvd;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String strOLrzqt = kjh.OLrzqt();
        if (strOLrzqt == null || (strEZpvd = C27993kKy.EZpvd(strOLrzqt)) == null) {
            strEZpvd = "all";
        }
        EventParamsList.put$default(eventParamsList, "tab_type", strEZpvd, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_PAGE_TYPE, Intrinsics.EZpvd((java.lang.Object) kjh.copydefault(), (java.lang.Object) "home") ? "homepage" : WalletSearchRequest.SEARCH_SOURCE_DISCOVER, false, 4, null);
        EventParamsList.put$default(eventParamsList, "currency_pair", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(kJH kjh, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String strKWHzl = kjh.KWHzl();
        Intrinsics.copydefault((java.lang.Object) strKWHzl);
        eventParamsList.put("sub_tab", strKWHzl, false);
        eventParamsList.put("deal_name", str, false);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("sub_tab", "spot", false);
        eventParamsList.put("dealname", str, false);
        return Unit.INSTANCE;
    }
}
