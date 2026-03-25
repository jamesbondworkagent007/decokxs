package o;

import androidx.appcompat.widget.AppCompatImageView;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC27964kJw;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kJy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27966kJy extends AbstractC27964kJw<C42669ral> {
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C27966kJy() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.kJw$StateListAnimator:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.kJw$StateListAnimator) : (r1v0 o.kJw$StateListAnimator))
 A[MD:(o.kJw$StateListAnimator):void (m)] (LINE:17) call: o.kJy.<init>(o.kJw$StateListAnimator):void type: THIS */
    public /* synthetic */ C27966kJy(AbstractC27964kJw.StateListAnimator stateListAnimator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : stateListAnimator);
    }

    public C27966kJy(AbstractC27964kJw.StateListAnimator stateListAnimator) {
        super(stateListAnimator);
        this.copydefault = "";
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.kLX
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42669ral copydefault(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42669ral c42669ralOLrzqt = C42669ral.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42669ralOLrzqt, "");
        return c42669ralOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroidx/viewbinding/ViewBinding;)Lo/rgg; */
    @Override // o.AbstractC27964kJw
    public C42982rgg copydefault(@NotNull C42669ral c42669ral) {
        Intrinsics.checkNotNullParameter(c42669ral, "");
        C42982rgg c42982rgg = c42669ral.copydefault;
        Intrinsics.checkNotNullExpressionValue(c42982rgg, "");
        return c42982rgg;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;)Landroid/widget/ImageView; */
    @Override // o.AbstractC27964kJw
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.ImageView EZpvd(@NotNull C42669ral c42669ral) {
        Intrinsics.checkNotNullParameter(c42669ral, "");
        AppCompatImageView appCompatImageView = c42669ral.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        return appCompatImageView;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;Landroid/content/Context;Lcom/okinc/business/market/bean/CoinQuote;)V */
    @Override // o.AbstractC27964kJw
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull C42669ral c42669ral, @NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(c42669ral, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        c42669ral.copydefault.setPriceLayoutVisible(true);
    }

    @Override // o.AbstractC27964kJw
    public kotlin.Pair<java.lang.String, java.lang.String> OLrzqt(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        return C56390yDp.OLrzqt(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) coinQuote.getBaseCurrency()).toString(), "");
    }

    @Override // o.AbstractC27964kJw
    public java.util.List<java.lang.CharSequence> AEQbTJ(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        return C56402yEa.EZpvd(context.getResources().getString(qZH.PendingIntent.gkJEwt));
    }

    @Override // o.AbstractC27964kJw
    public java.lang.CharSequence EZpvd(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        return coinQuote.getQuoteCurrency();
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/View;ILjava/lang/Object;)V */
    @Override // o.AbstractC27964kJw, o.InterfaceC33543myT
    public void copydefault(@NotNull android.view.View view, int i, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
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
            oka.AEQbTJ(context, upperCase, strOLrzqt, this.copydefault);
        }
        Function2<CoinQuote, java.lang.Integer, Unit> function2OLrzqt = OLrzqt();
        if (function2OLrzqt != null) {
            function2OLrzqt.invoke(coinQuote, java.lang.Integer.valueOf(i));
        }
    }
}
