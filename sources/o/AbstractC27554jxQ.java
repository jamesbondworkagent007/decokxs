package o;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C27989kKu;
import o.C32113mPz;
import o.C52761wXj;
import o.oKA;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jxQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC27554jxQ extends AbstractC42977rgb<CoinQuote, C42670ram> {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final ActionBar AEQbTJ;
    public java.lang.String AYXKKw;
    public Function1<? super CoinQuote, Unit> OLrzqt;
    public java.lang.String djBIcL;
    public java.lang.String gEmmrt;
    public final boolean EZpvd = C27550jxM.KWHzl.OLrzqt();
    public java.lang.String KWHzl = "market";
    public final int valueOf = C33070mpX.copydefault(C52761wXj.Activity.Dmq);
    public final int AhwBna = C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC);

    /* JADX INFO: renamed from: o.jxQ$ActionBar */
    public interface ActionBar {
        boolean OLrzqt(@NotNull android.view.View view, int i, CoinQuote coinQuote);
    }

    public java.lang.Integer AEQbTJ() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.business.market.bean.CoinQuote, kotlin.Unit>, kotlin.jvm.functions.Function1<com.okinc.business.market.bean.CoinQuote, kotlin.Unit> */
    public final Function1<CoinQuote, Unit> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.String str) {
        this.gEmmrt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.String str) {
        this.djBIcL = str;
    }

    public abstract java.lang.CharSequence copydefault(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.String str) {
        this.AYXKKw = str;
    }

    public abstract java.lang.CharSequence djBIcL(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote);

    public abstract java.lang.CharSequence gEmmrt(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int valueOf() {
        return this.valueOf;
    }

    @Override // o.AbstractC42977rgb, o.kLX
    /* JADX INFO: renamed from: EZpvd */
    public /* synthetic */ void onBindViewHolder(kLV klv, java.lang.Object obj) {
        onBindViewHolder((kLV<C42670ram>) klv, (CoinQuote) obj);
    }

    /* JADX INFO: renamed from: o.jxQ$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jxQ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public AbstractC27554jxQ(ActionBar actionBar) {
        this.AEQbTJ = actionBar;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.kLX
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C42670ram copydefault(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42670ram c42670ramCopydefault = C42670ram.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42670ramCopydefault, "");
        java.lang.Integer numAEQbTJ = AEQbTJ();
        if (numAEQbTJ != null) {
            int iIntValue = numAEQbTJ.intValue();
            LinearLayoutCompat linearLayoutCompat = c42670ramCopydefault.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            ViewGroup.LayoutParams layoutParams = linearLayoutCompat.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginEnd(iIntValue);
                linearLayoutCompat.setLayoutParams(layoutParams2);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
        return c42670ramCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC42977rgb, o.kLX, o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull kLV<C42670ram> klv, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(klv, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        super.onBindViewHolder(klv, coinQuote);
        C42670ram c42670ram = (C42670ram) klv.EZpvd();
        android.content.Context context = klv.itemView.getContext();
        Intrinsics.copydefault(context);
        if (AYXKKw(context, coinQuote)) {
            c42670ram.OLrzqt.setVisibility(0);
            android.widget.ImageView imageView = c42670ram.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            java.lang.String icon = coinQuote.getIcon();
            C57659ymb.EZpvd(imageView, icon != null ? icon : "", qZH.Activity.AhwBna);
        } else {
            c42670ram.OLrzqt.setVisibility(8);
        }
        c42670ram.gEmmrt.setText(gEmmrt(context, coinQuote));
        java.lang.CharSequence charSequenceDjBIcL = djBIcL(context, coinQuote);
        c42670ram.djBIcL.setText(charSequenceDjBIcL);
        c42670ram.djBIcL.setTextColor(valueOf());
        c42670ram.djBIcL.setBackgroundTintList(android.content.res.ColorStateList.valueOf(AhwBna()));
        c42670ram.djBIcL.setVisibility((charSequenceDjBIcL == null || charSequenceDjBIcL.length() == 0) ? 8 : 0);
        c42670ram.AYXKKw.setText(copydefault(context, coinQuote));
        OLrzqt(c42670ram, context, coinQuote);
        c42670ram.copydefault.setChangePercentAndShow(java.lang.Double.valueOf(EZpvd(context, coinQuote)), OLrzqt(context, coinQuote), this.EZpvd);
        c42670ram.copydefault.setTypeface(C55051xce.OLrzqt.AEQbTJ("harmony_sans_medium.ttf"));
        klv.itemView.requestLayout();
    }

    public void OLrzqt(@NotNull C42670ram c42670ram, @NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(c42670ram, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        c42670ram.AhwBna.setText(KWHzl(context, coinQuote));
        java.lang.CharSequence charSequenceAEQbTJ = AEQbTJ(context, coinQuote);
        if (charSequenceAEQbTJ == null || charSequenceAEQbTJ.length() == 0) {
            c42670ram.AkhnZx.setVisibility(8);
        } else {
            c42670ram.AkhnZx.setVisibility(0);
            c42670ram.AkhnZx.setText(charSequenceAEQbTJ);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/View;ILjava/lang/Object;)V */
    @Override // o.InterfaceC33543myT
    public void copydefault(@NotNull android.view.View view, int i, @NotNull final CoinQuote coinQuote) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        C32866mlf.EZpvd("secondary_list_coin_click", new EventParam("name", "", false));
        MarketCoinInfo marketCoinInfo = new MarketCoinInfo(coinQuote.getInstId(), coinQuote.getInstType(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
        java.lang.String str2 = this.KWHzl;
        if (str2 != null) {
            str = Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "home") ? "page_home" : "page_info";
        } else {
            str = null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) "favorites")) {
            C32866mlf.onEvent$default("Favorites_List_Token_Click", (TrackChannel[]) null, new Function1() { // from class: o.jxN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC27554jxQ.OLrzqt(this.EZpvd, coinQuote, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        if (Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) "home")) {
            C32866mlf.onEvent$default("HomePage_Ranking_TradingPair_Click", (TrackChannel[]) null, new Function1() { // from class: o.jxO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC27554jxQ.copydefault(coinQuote, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        } else if (C41307qoO.EZpvd.OLrzqt()) {
            C32866mlf.onEvent$default("Markets_List_Token_Click", (TrackChannel[]) null, new Function1() { // from class: o.jxS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC27554jxQ.copydefault(coinQuote, this, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        } else {
            C32866mlf.onEvent$default("Markets_List_Token_Click", (TrackChannel[]) null, new Function1() { // from class: o.jxT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC27554jxQ.AEQbTJ(coinQuote, this, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
        if (oka != null) {
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            oKA.TaskDescription.gotoNewKlinePage$default(oka, context, marketCoinInfo, null, null, str, null, null, null, this.AYXKKw, null, null, 1772, null);
        }
        Function1<? super CoinQuote, Unit> function1 = this.OLrzqt;
        if (function1 != null) {
            function1.invoke(coinQuote);
        }
    }

    public static final Unit OLrzqt(AbstractC27554jxQ abstractC27554jxQ, CoinQuote coinQuote, EventParamsList eventParamsList) {
        java.lang.String strEZpvd;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String str = abstractC27554jxQ.gEmmrt;
        if (str == null || (strEZpvd = C27993kKy.EZpvd(str)) == null) {
            strEZpvd = "all";
        }
        EventParamsList.put$default(eventParamsList, "tab_type", strEZpvd, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_PAGE_TYPE, Intrinsics.EZpvd((java.lang.Object) abstractC27554jxQ.KWHzl, (java.lang.Object) "home") ? "homepage" : WalletSearchRequest.SEARCH_SOURCE_DISCOVER, false, 4, null);
        EventParamsList.put$default(eventParamsList, "currency_pair", coinQuote.getInstId(), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(CoinQuote coinQuote, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String instType = coinQuote.isPreMarket() ? "pre_market" : coinQuote.getInstType();
        eventParamsList.put("deal_name", coinQuote.getInstId(), false);
        java.lang.String str = C27989kKu.Companion.AkhnZx().get(instType);
        eventParamsList.put("biz_type", str != null ? str : "", false);
        eventParamsList.put("tab", "favorites", false);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(CoinQuote coinQuote, AbstractC27554jxQ abstractC27554jxQ, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String instType = coinQuote.isPreMarket() ? "pre_market" : coinQuote.getInstType();
        eventParamsList.put("deal_name", coinQuote.getInstId(), false);
        C27989kKu.Activity activity = C27989kKu.Companion;
        java.lang.String str = activity.AkhnZx().get(instType);
        if (str == null) {
            str = "";
        }
        eventParamsList.put("deal_type", str, false);
        eventParamsList.put("tab", "markets", false);
        eventParamsList.put(activity.AhwBna(), "favorites", false);
        java.lang.String str2 = abstractC27554jxQ.gEmmrt;
        eventParamsList.put("l3_tab", str2 != null ? str2 : "", false);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(CoinQuote coinQuote, AbstractC27554jxQ abstractC27554jxQ, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String instType = coinQuote.isPreMarket() ? "pre_market" : coinQuote.getInstType();
        eventParamsList.put("deal_name", coinQuote.getInstId(), false);
        C27989kKu.Activity activity = C27989kKu.Companion;
        java.lang.String str = activity.AkhnZx().get(instType);
        if (str == null) {
            str = "";
        }
        eventParamsList.put("deal_type", str, false);
        java.lang.String str2 = abstractC27554jxQ.djBIcL;
        if (str2 == null) {
            str2 = "";
        }
        eventParamsList.put("tab", str2, false);
        java.lang.String strAhwBna = activity.AhwBna();
        java.lang.String str3 = activity.fetchVPNInfo().get(abstractC27554jxQ.gEmmrt);
        eventParamsList.put(strAhwBna, str3 != null ? str3 : "", false);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILjava/lang/Object;)Z */
    @Override // o.AbstractC42977rgb
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        ActionBar actionBar = this.AEQbTJ;
        if (actionBar != null) {
            return actionBar.OLrzqt(view, i, coinQuote);
        }
        return false;
    }

    public boolean AYXKKw(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        return C33129mqd.OLrzqt((java.lang.CharSequence) coinQuote.getIcon());
    }

    public final java.lang.CharSequence KWHzl(final android.content.Context context, CoinQuote coinQuote) {
        return C33061mpO.setupSpanStyles$default(coinQuote.getPrice(), new java.lang.String[]{coinQuote.getPrice()}, 0, null, false, new Function1() { // from class: o.jxU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC27554jxQ.AEQbTJ(context, (java.util.List) obj);
            }
        }, 14, null);
    }

    public static final Unit AEQbTJ(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(context, C32113mPz.Dialog.gHZMYf));
        return Unit.INSTANCE;
    }

    public java.lang.CharSequence AEQbTJ(@NotNull final android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        if (coinQuote.getShowSubPrice()) {
            return C33061mpO.setupSpanStyles$default(coinQuote.getSubPrice(), new java.lang.String[]{coinQuote.getSubPrice()}, 0, null, false, new Function1() { // from class: o.jxV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC27554jxQ.OLrzqt(context, (java.util.List) obj);
                }
            }, 14, null);
        }
        return null;
    }

    public static final Unit OLrzqt(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(context, C52761wXj.LoaderManager.QSBOWP));
        return Unit.INSTANCE;
    }

    public double EZpvd(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        return C33129mqd.mulD$default(java.lang.Double.valueOf(coinQuote.getChangePercent()), 100, null, null, null, 14, null);
    }

    public java.lang.String OLrzqt(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        return coinQuote.getChangePercentDisplay();
    }

    /* JADX DEBUG: Method merged with bridge method: getItemId(Ljava/lang/Object;)J */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public long getItemId(@NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(coinQuote, "");
        return coinQuote.getInstId().hashCode();
    }
}
