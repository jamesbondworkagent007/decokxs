package o;

import com.bumptech.glide.Glide;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.api.bean.MarketCoinInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.oKA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kJn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27955kJn extends AbstractC42977rgb<CoinQuote, C42668rak> {
    public java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C27955kJn() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C27955kJn(java.lang.String str) {
        this.KWHzl = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:45) call: o.kJn.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ C27955kJn(java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    @Override // o.AbstractC42977rgb, o.kLX
    /* JADX INFO: renamed from: EZpvd */
    public /* synthetic */ void onBindViewHolder(kLV klv, java.lang.Object obj) {
        onBindViewHolder((kLV<C42668rak>) klv, (CoinQuote) obj);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.kLX
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42668rak copydefault(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42668rak c42668rakEZpvd = C42668rak.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42668rakEZpvd, "");
        return c42668rakEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC42977rgb, o.kLX, o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull kLV<C42668rak> klv, @NotNull CoinQuote coinQuote) {
        java.lang.String strCopydefault;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(klv, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        super.onBindViewHolder(klv, coinQuote);
        C42668rak c42668rak = (C42668rak) klv.EZpvd();
        android.content.Context context = klv.itemView.getContext();
        c42668rak.AEQbTJ.setVisibility(0);
        Glide.AEQbTJ(context).EZpvd(coinQuote.getIcon()).EZpvd(c42668rak.AEQbTJ);
        java.lang.String strCopydefault2 = TaskDescription.AEQbTJ(coinQuote.getBaseCurrency()).copydefault();
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = strCopydefault2.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        c42668rak.AhwBna.setText(upperCase);
        android.widget.TextView textView = c42668rak.OLrzqt;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
        if (interfaceC54581xNrCopydefault != null && (strCopydefault = interfaceC54581xNrCopydefault.copydefault(upperCase)) != null) {
            str = strCopydefault;
        }
        textView.setText(str);
        android.widget.TextView textView2 = c42668rak.valueOf;
        Intrinsics.copydefault(context);
        textView2.setText(AEQbTJ(context, coinQuote));
        C42920rfX.setChangePercentAndShow$default(c42668rak.KWHzl, java.lang.Double.valueOf(OLrzqt(context, coinQuote)), KWHzl(context, coinQuote), false, 4, null);
    }

    private final java.lang.CharSequence AEQbTJ(final android.content.Context context, CoinQuote coinQuote) {
        return C33061mpO.setupSpanStyles$default(java.lang.String.valueOf(coinQuote.getSubPrice()), new java.lang.String[]{java.lang.String.valueOf(coinQuote.getSubPrice())}, 0, null, false, new Function1() { // from class: o.kJq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27955kJn.KWHzl(context, (java.util.List) obj);
            }
        }, 14, null);
    }

    public static final Unit KWHzl(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(context, C32113mPz.Dialog.gHZMYf));
        return Unit.INSTANCE;
    }

    private final double OLrzqt(android.content.Context context, CoinQuote coinQuote) {
        return C33129mqd.mulD$default(java.lang.Double.valueOf(coinQuote.getChangePercent()), 100, null, null, null, 14, null);
    }

    private final java.lang.String KWHzl(android.content.Context context, CoinQuote coinQuote) {
        return coinQuote.getChangePercentDisplay();
    }

    public final java.lang.String copydefault() {
        return !kKA.isLogin$default(kKA.EZpvd, null, 1, null) ? "USDT" : qTC.copydefault.AEQbTJ();
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/View;ILjava/lang/Object;)V */
    @Override // o.InterfaceC33543myT
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull android.view.View view, final int i, @NotNull final CoinQuote coinQuote) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        C32866mlf.EZpvd("secondary_list_coin_click", new EventParam("name", "", false));
        MarketCoinInfo marketCoinInfo = new MarketCoinInfo(C59449zhJ.replace$default(coinQuote.getBaseCurrency(), "USD", copydefault(), false, 4, (java.lang.Object) null), "SPOT", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt("SPOT") : null;
        if (abstractC54531xLwOLrzqt != null && AbstractC54531xLw.isInitFun$default(abstractC54531xLwOLrzqt, false, 1, null) && abstractC54531xLwOLrzqt.valueOf(marketCoinInfo.getInstrumentId()) == null) {
            marketCoinInfo = null;
        }
        if (marketCoinInfo == null) {
            marketCoinInfo = new MarketCoinInfo(C59449zhJ.replace$default(coinQuote.getBaseCurrency(), "USD", copydefault(), false, 4, (java.lang.Object) null), "SPOT", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
        }
        MarketCoinInfo marketCoinInfo2 = marketCoinInfo;
        java.lang.String str2 = this.KWHzl;
        if (str2 != null) {
            str = Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "home") ? "page_home" : "page_info";
        } else {
            str = null;
        }
        oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
        if (oka != null) {
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            oKA.TaskDescription.gotoNewKlinePage$default(oka, context, marketCoinInfo2, null, null, str, null, null, null, "Home_Main_Coin", null, null, 1772, null);
        }
        if (pWO.KWHzl().EZpvd()) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("app_demo_trading_home_coin_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.kJt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C27955kJn.AhwBna(coinQuote, (EventParamsList) obj);
                }
            });
        } else if (((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).ejfBZ()) {
            TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.AEQbTJ("app_home_lite_popular_crypto_coin_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.kJr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C27955kJn.copydefault(coinQuote, (EventParamsList) obj);
                }
            });
        }
        C32869mli.onNewOKexEventWithParams$default("HomePage_MarketList_Button_Click", null, new Function1() { // from class: o.kJp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27955kJn.OLrzqt(coinQuote, (EventParamsList) obj);
            }
        }, 1, null);
        C32866mlf.onEvent$default("HomePage_Ranking_TradingPair_Click", (TrackChannel[]) null, new Function1() { // from class: o.kJs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27955kJn.KWHzl(coinQuote, i, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AhwBna(CoinQuote coinQuote, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("symbol", coinQuote.getInstId(), false);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(CoinQuote coinQuote, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("coin", coinQuote.getInstId(), false);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(CoinQuote coinQuote, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("deal_name", coinQuote.getInstId(), false);
        eventParamsList.put("sub_tab", "top", false);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(CoinQuote coinQuote, int i, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("deal_name", coinQuote.getInstId(), false);
        eventParamsList.put("tab", "top", false);
        EventParamsList.put$default(eventParamsList, "token_pair", coinQuote.getInstId(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "biz_type", "SPOT", false, 4, null);
        EventParamsList.put$default(eventParamsList, "rank_order", java.lang.String.valueOf(i + 1), false, 4, null);
        return Unit.INSTANCE;
    }
}
