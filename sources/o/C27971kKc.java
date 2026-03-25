package o;

import androidx.appcompat.widget.AppCompatImageView;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC27969kKa;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kKc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27971kKc extends AbstractC27969kKa<C42672rao> {
    public java.lang.String AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C27971kKc() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.kKa$StateListAnimator:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.kKa$StateListAnimator) : (r1v0 o.kKa$StateListAnimator))
 A[MD:(o.kKa$StateListAnimator):void (m)] (LINE:18) call: o.kKc.<init>(o.kKa$StateListAnimator):void type: THIS */
    public /* synthetic */ C27971kKc(AbstractC27969kKa.StateListAnimator stateListAnimator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : stateListAnimator);
    }

    public C27971kKc(AbstractC27969kKa.StateListAnimator stateListAnimator) {
        super(stateListAnimator);
        this.AEQbTJ = "";
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.kLX
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C42672rao copydefault(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42672rao c42672raoKWHzl = C42672rao.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42672raoKWHzl, "");
        return c42672raoKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;)Lo/xcy; */
    @Override // o.AbstractC27969kKa
    public C55071xcy KWHzl(@NotNull C42672rao c42672rao) {
        Intrinsics.checkNotNullParameter(c42672rao, "");
        C55071xcy c55071xcy = c42672rao.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55071xcy, "");
        return c55071xcy;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;)Lo/rgn; */
    @Override // o.AbstractC27969kKa
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C42989rgn EZpvd(@NotNull C42672rao c42672rao) {
        Intrinsics.checkNotNullParameter(c42672rao, "");
        C42989rgn c42989rgn = c42672rao.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c42989rgn, "");
        return c42989rgn;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;)Landroid/widget/ImageView; */
    @Override // o.AbstractC27969kKa
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.ImageView AEQbTJ(@NotNull C42672rao c42672rao) {
        Intrinsics.checkNotNullParameter(c42672rao, "");
        AppCompatImageView appCompatImageView = c42672rao.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        return appCompatImageView;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/content/Context;Lcom/okinc/business/market/bean/CoinQuote;)V */
    @Override // o.AbstractC27969kKa
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C42672rao c42672rao, @NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(c42672rao, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        c42672rao.EZpvd.setPriceLayoutVisible(true);
    }

    @Override // o.AbstractC27969kKa
    public kotlin.Pair<java.lang.String, java.lang.String> EZpvd(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        return C56390yDp.OLrzqt(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) coinQuote.getBaseCurrency()).toString(), "");
    }

    @Override // o.AbstractC27969kKa
    public java.util.List<java.lang.CharSequence> OLrzqt(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        return C56402yEa.EZpvd(context.getResources().getString(qZH.PendingIntent.gkJEwt));
    }

    @Override // o.AbstractC27969kKa
    public java.lang.CharSequence AEQbTJ(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        return coinQuote.getQuoteCurrency();
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/View;ILjava/lang/Object;)V */
    @Override // o.AbstractC27969kKa, o.InterfaceC33543myT
    /* JADX INFO: renamed from: AEQbTJ */
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
            oka.AEQbTJ(context, upperCase, strOLrzqt, this.AEQbTJ);
        }
        Function2<CoinQuote, java.lang.Integer, Unit> function2KWHzl = KWHzl();
        if (function2KWHzl != null) {
            function2KWHzl.invoke(coinQuote, java.lang.Integer.valueOf(i));
        }
    }
}
