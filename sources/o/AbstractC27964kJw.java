package o;

import androidx.camera.video.AudioStats;
import androidx.viewbinding.ViewBinding;
import com.bumptech.glide.Glide;
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

/* JADX INFO: renamed from: o.kJw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC27964kJw<T extends ViewBinding> extends AbstractC42977rgb<CoinQuote, T> {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public Function2<? super CoinQuote, ? super java.lang.Integer, Unit> AEQbTJ;
    public java.lang.String AYXKKw;
    public Function0<java.lang.String> EZpvd;
    public final StateListAnimator OLrzqt;
    public java.lang.String gEmmrt;
    public java.lang.String valueOf = "market";

    /* JADX INFO: renamed from: o.kJw$StateListAnimator */
    public interface StateListAnimator {
        boolean OLrzqt(@NotNull android.view.View view, int i, CoinQuote coinQuote);
    }

    public abstract java.util.List<java.lang.CharSequence> AEQbTJ(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote);

    public abstract android.widget.ImageView EZpvd(@NotNull T t);

    public abstract java.lang.CharSequence EZpvd(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote);

    public kotlin.Pair<java.lang.Integer, java.lang.Integer> EZpvd() {
        return null;
    }

    public abstract void EZpvd(@NotNull T t, @NotNull android.content.Context context, @NotNull CoinQuote coinQuote);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.String str) {
        this.valueOf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function2<? super CoinQuote, ? super java.lang.Integer, Unit> function2) {
        this.AEQbTJ = function2;
    }

    public abstract kotlin.Pair<java.lang.String, java.lang.String> OLrzqt(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super com.okinc.business.market.bean.CoinQuote, ? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.Function2<com.okinc.business.market.bean.CoinQuote, java.lang.Integer, kotlin.Unit> */
    public final Function2<CoinQuote, java.lang.Integer, Unit> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.String str) {
        this.AYXKKw = str;
    }

    public abstract C42982rgg copydefault(@NotNull T t);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.String str) {
        this.gEmmrt = str;
    }

    /* JADX INFO: renamed from: o.kJw$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kJw.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public AbstractC27964kJw(StateListAnimator stateListAnimator) {
        this.OLrzqt = stateListAnimator;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/kLV;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Multi-variable search result rejected for r25v0, resolved type: o.kLV<T extends androidx.viewbinding.ViewBinding> */
    /* JADX DEBUG: Multi-variable search result rejected for r26v0, resolved type: com.okinc.business.market.bean.CoinQuote */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC42977rgb, o.kLX, o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull kLV<T> klv, @NotNull CoinQuote coinQuote) {
        java.util.ArrayList arrayList;
        int iKWHzl;
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
        Glide.KWHzl(klv.itemView).EZpvd(icon).KWHzl(C52761wXj.TaskDescription.aHXSQp).EZpvd((NN<android.graphics.Bitmap>) new C5401Qh()).EZpvd(EZpvd(viewBindingEZpvd));
        Intrinsics.copydefault(context);
        EZpvd(viewBindingEZpvd, context, coinQuote);
        kotlin.Pair<java.lang.Integer, java.lang.Integer> pairEZpvd = EZpvd();
        java.util.List<java.lang.CharSequence> listAEQbTJ = AEQbTJ(context, coinQuote);
        if (listAEQbTJ != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            java.util.Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                arrayList2.add(((java.lang.CharSequence) it.next()).toString());
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        C42982rgg c42982rggCopydefault = copydefault(viewBindingEZpvd);
        c42982rggCopydefault.setData(OLrzqt(context, coinQuote), arrayList, C33129mqd.gEmmrt(EZpvd(context, coinQuote)), C33129mqd.gEmmrt(copydefault(context, coinQuote)), C33129mqd.gEmmrt(KWHzl(context, coinQuote)), (352 & 32) != 0 ? null : pairEZpvd != null ? pairEZpvd.getFirst() : null, (352 & 64) != 0 ? null : pairEZpvd != null ? pairEZpvd.getSecond() : null, (352 & 128) != 0 ? java.lang.Boolean.FALSE : null, (352 & 256) != 0 ? java.lang.Boolean.FALSE : java.lang.Boolean.valueOf(this instanceof kJG), (352 & 512) != 0 ? java.lang.Boolean.FALSE : null, (352 & 1024) != 0 ? "" : null, (352 & 2048) != 0 ? null : null);
        if (C33129mqd.AEQbTJ(java.lang.Double.valueOf(coinQuote.getChangePercent()), java.lang.Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE))) {
            iKWHzl = C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
        } else if (C33129mqd.gEmmrt(java.lang.Double.valueOf(coinQuote.getChangePercent()), java.lang.Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE))) {
            iKWHzl = C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
        } else {
            iKWHzl = C55366xib.KWHzl(C52761wXj.ActionBar.getPostValueLengthLimit, context);
        }
        c42982rggCopydefault.setSubPriceColor(iKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/View;ILjava/lang/Object;)V */
    @Override // o.InterfaceC33543myT
    public void copydefault(@NotNull android.view.View view, int i, @NotNull CoinQuote coinQuote) {
        java.lang.String str;
        java.lang.String strInvoke;
        UserGroup userGroupEZpvd;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        MarketCoinInfo marketCoinInfo = new MarketCoinInfo(coinQuote.getInstId(), coinQuote.getInstType(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
        java.lang.String str2 = this.valueOf;
        if (str2 != null) {
            str = Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "home") ? "page_home" : "page_info";
        } else {
            str = null;
        }
        java.lang.String str3 = str;
        if (!Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) "Home_Fav") || (userGroupEZpvd = C27984kKp.copydefault.EZpvd()) == null || userGroupEZpvd.isPreset()) {
            Function0<java.lang.String> function0 = this.EZpvd;
            if (function0 == null || (strInvoke = function0.invoke()) == null) {
                strInvoke = this.gEmmrt;
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
        Function2<? super CoinQuote, ? super java.lang.Integer, Unit> function2 = this.AEQbTJ;
        if (function2 != null) {
            function2.invoke(coinQuote, java.lang.Integer.valueOf(i));
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/View;ILjava/lang/Object;)Z */
    @Override // o.AbstractC42977rgb
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@NotNull android.view.View view, int i, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        StateListAnimator stateListAnimator = this.OLrzqt;
        if (stateListAnimator != null) {
            return stateListAnimator.OLrzqt(view, i, coinQuote);
        }
        return false;
    }

    private final java.lang.CharSequence copydefault(final android.content.Context context, CoinQuote coinQuote) {
        return C33061mpO.setupSpanStyles$default(coinQuote.getPrice(), new java.lang.String[]{coinQuote.getPrice()}, 0, null, false, new Function1() { // from class: o.kJx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC27964kJw.copydefault(context, (java.util.List) obj);
            }
        }, 14, null);
    }

    public static final Unit copydefault(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(context, C32113mPz.Dialog.QOLQEE));
        return Unit.INSTANCE;
    }

    public java.lang.CharSequence KWHzl(@NotNull final android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        return C33061mpO.setupSpanStyles$default(coinQuote.getChangePercentDisplay(), new java.lang.String[]{coinQuote.getChangePercentDisplay()}, 0, null, false, new Function1() { // from class: o.kJv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC27964kJw.AEQbTJ(context, (java.util.List) obj);
            }
        }, 14, null);
    }

    public static final Unit AEQbTJ(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(context, C52761wXj.LoaderManager.QSBOWP));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: getItemId(Ljava/lang/Object;)J */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public long getItemId(@NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(coinQuote, "");
        return coinQuote.getInstId().hashCode();
    }
}
