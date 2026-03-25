package o;

import androidx.viewbinding.ViewBinding;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.market.watch.data.UserGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C52761wXj;
import o.oKA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kKa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC27969kKa<T extends ViewBinding> extends AbstractC42977rgb<CoinQuote, T> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public java.lang.String AYXKKw = "market";
    public final StateListAnimator EZpvd;
    public Function2<? super CoinQuote, ? super java.lang.Integer, Unit> KWHzl;
    public Function0<java.lang.String> copydefault;
    public java.lang.String djBIcL;
    public java.lang.String valueOf;

    /* JADX INFO: renamed from: o.kKa$StateListAnimator */
    public interface StateListAnimator {
        boolean copydefault(@NotNull android.view.View view, int i, CoinQuote coinQuote);
    }

    public abstract android.widget.ImageView AEQbTJ(@NotNull T t);

    public abstract java.lang.CharSequence AEQbTJ(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.lang.String str) {
        this.AYXKKw = str;
    }

    public abstract kotlin.Pair<java.lang.String, java.lang.String> EZpvd(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote);

    public abstract C42989rgn EZpvd(@NotNull T t);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.String str) {
        this.valueOf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super com.okinc.business.market.bean.CoinQuote, ? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.Function2<com.okinc.business.market.bean.CoinQuote, java.lang.Integer, kotlin.Unit> */
    public final Function2<CoinQuote, java.lang.Integer, Unit> KWHzl() {
        return this.KWHzl;
    }

    public abstract C55071xcy KWHzl(@NotNull T t);

    public abstract void KWHzl(@NotNull T t, @NotNull android.content.Context context, @NotNull CoinQuote coinQuote);

    public abstract java.util.List<java.lang.CharSequence> OLrzqt(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function2<? super CoinQuote, ? super java.lang.Integer, Unit> function2) {
        this.KWHzl = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.String str) {
        this.djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function0<java.lang.String> function0) {
        this.copydefault = function0;
    }

    /* JADX INFO: renamed from: o.kKa$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kKa.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public AbstractC27969kKa(StateListAnimator stateListAnimator) {
        this.EZpvd = stateListAnimator;
    }

    public kotlin.Pair<java.lang.Integer, java.lang.Integer> copydefault() {
        return C56390yDp.OLrzqt(null, null);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/kLV;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Multi-variable search result rejected for r22v0, resolved type: o.kLV<T extends androidx.viewbinding.ViewBinding> */
    /* JADX DEBUG: Multi-variable search result rejected for r23v0, resolved type: com.okinc.business.market.bean.CoinQuote */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC42977rgb, o.kLX, o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull kLV<T> klv, @NotNull CoinQuote coinQuote) {
        java.util.ArrayList arrayList;
        int i;
        java.lang.String strValueOf;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(klv, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        super.onBindViewHolder(klv, coinQuote);
        ViewBinding viewBindingEZpvd = klv.EZpvd();
        android.content.Context context = klv.itemView.getContext();
        java.lang.String icon = coinQuote.getIcon();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (strValueOf = interfaceC54581xNrOLrzqt.valueOf(coinQuote.getBaseCurrency())) != null) {
            str = strValueOf;
        }
        if (icon == null || icon.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) icon)) {
            icon = str;
        }
        C46742tcs.AEQbTJ(AEQbTJ(viewBindingEZpvd), icon);
        Intrinsics.copydefault(context);
        KWHzl(viewBindingEZpvd, context, coinQuote);
        java.util.List<java.lang.CharSequence> listOLrzqt = OLrzqt(context, coinQuote);
        kotlin.Pair<java.lang.Integer, java.lang.Integer> pairCopydefault = copydefault();
        java.lang.Integer numComponent1 = pairCopydefault.component1();
        java.lang.Integer numComponent2 = pairCopydefault.component2();
        C42989rgn c42989rgnEZpvd = EZpvd(viewBindingEZpvd);
        kotlin.Pair<java.lang.String, java.lang.String> pairEZpvd = EZpvd(context, coinQuote);
        if (listOLrzqt != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
            java.util.Iterator<T> it = listOLrzqt.iterator();
            while (it.hasNext()) {
                arrayList2.add(((java.lang.CharSequence) it.next()).toString());
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        c42989rgnEZpvd.setData(pairEZpvd, arrayList, C33129mqd.gEmmrt(AEQbTJ(context, coinQuote)), C33129mqd.gEmmrt(AYXKKw(context, coinQuote)), C33129mqd.gEmmrt(AhwBna(context, coinQuote)), (1920 & 32) != 0 ? null : numComponent1, (1920 & 64) != 0 ? null : numComponent2, (1920 & 128) != 0 ? false : false, (1920 & 256) != 0 ? java.lang.Boolean.FALSE : null, (1920 & 512) != 0 ? "" : null, (1920 & 1024) != 0 ? null : null);
        C55071xcy c55071xcyKWHzl = KWHzl(viewBindingEZpvd);
        double dKWHzl = KWHzl(context, coinQuote);
        if (C33129mqd.AEQbTJ(java.lang.Double.valueOf(dKWHzl), 0)) {
            i = 3;
        } else {
            i = C33129mqd.gEmmrt(java.lang.Double.valueOf(dKWHzl), 0) ? 4 : 5;
        }
        c55071xcyKWHzl.setStyleWithTheme(i);
        c55071xcyKWHzl.setText(pTF.KWHzl.AEQbTJ(copydefault(context, coinQuote)));
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/View;ILjava/lang/Object;)V */
    @Override // o.InterfaceC33543myT
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull android.view.View view, int i, @NotNull CoinQuote coinQuote) {
        java.lang.String str;
        java.lang.String strInvoke;
        UserGroup userGroupEZpvd;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        MarketCoinInfo marketCoinInfo = new MarketCoinInfo(coinQuote.getInstId(), coinQuote.getInstType(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
        java.lang.String str2 = this.AYXKKw;
        if (str2 != null) {
            str = Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "home") ? "page_home" : "page_info";
        } else {
            str = null;
        }
        java.lang.String str3 = str;
        if (!Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) "Home_Fav") || (userGroupEZpvd = C27984kKp.copydefault.EZpvd()) == null || userGroupEZpvd.isPreset()) {
            Function0<java.lang.String> function0 = this.copydefault;
            if (function0 == null || (strInvoke = function0.invoke()) == null) {
                strInvoke = this.djBIcL;
            }
        } else {
            strInvoke = "Home_Fav_Custom";
        }
        java.lang.String str4 = strInvoke;
        oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
        if (oka != null) {
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            oKA.TaskDescription.gotoNewKlinePage$default(oka, context, marketCoinInfo, null, null, str3, null, null, null, str4, null, null, 1772, null);
        }
        Function2<? super CoinQuote, ? super java.lang.Integer, Unit> function2 = this.KWHzl;
        if (function2 != null) {
            function2.invoke(coinQuote, java.lang.Integer.valueOf(i));
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILjava/lang/Object;)Z */
    @Override // o.AbstractC42977rgb
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        StateListAnimator stateListAnimator = this.EZpvd;
        if (stateListAnimator != null) {
            return stateListAnimator.copydefault(view, i, coinQuote);
        }
        return false;
    }

    private final java.lang.CharSequence AYXKKw(final android.content.Context context, CoinQuote coinQuote) {
        return C33061mpO.setupSpanStyles$default(coinQuote.getPrice(), new java.lang.String[]{coinQuote.getPrice()}, 0, null, false, new Function1() { // from class: o.kJZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC27969kKa.copydefault(context, (java.util.List) obj);
            }
        }, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(context, C32113mPz.Dialog.gHZMYf));
        return Unit.INSTANCE;
    }

    public java.lang.CharSequence AhwBna(@NotNull final android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        if (coinQuote.getShowSubPrice()) {
            return C33061mpO.setupSpanStyles$default(coinQuote.getSubPrice(), new java.lang.String[]{coinQuote.getSubPrice()}, 0, null, false, new Function1() { // from class: o.kKh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC27969kKa.EZpvd(context, (java.util.List) obj);
                }
            }, 14, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(context, C52761wXj.LoaderManager.QSBOWP));
        return Unit.INSTANCE;
    }

    public double KWHzl(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        return C33129mqd.mulD$default(java.lang.Double.valueOf(coinQuote.getChangePercent()), 100, null, null, null, 14, null);
    }

    public java.lang.String copydefault(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        return coinQuote.getChangePercentDisplay();
    }

    /* JADX DEBUG: Method merged with bridge method: getItemId(Ljava/lang/Object;)J */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public long getItemId(@NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(coinQuote, "");
        return coinQuote.getInstId().hashCode();
    }
}
