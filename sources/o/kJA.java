package o;

import androidx.appcompat.widget.AppCompatImageView;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC27964kJw;
import o.C35966oKh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kJA extends AbstractC27964kJw<C42873red> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public kJA() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27964kJw
    public java.util.List<java.lang.CharSequence> AEQbTJ(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        return null;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.kJw$StateListAnimator:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.kJw$StateListAnimator) : (r1v0 o.kJw$StateListAnimator))
 A[MD:(o.kJw$StateListAnimator):void (m)] (LINE:15) call: o.kJA.<init>(o.kJw$StateListAnimator):void type: THIS */
    public /* synthetic */ kJA(AbstractC27964kJw.StateListAnimator stateListAnimator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : stateListAnimator);
    }

    public kJA(AbstractC27964kJw.StateListAnimator stateListAnimator) {
        super(stateListAnimator);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.kLX
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42873red copydefault(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42873red c42873redCopydefault = C42873red.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42873redCopydefault, "");
        return c42873redCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroidx/viewbinding/ViewBinding;)Lo/rgg; */
    @Override // o.AbstractC27964kJw
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C42982rgg copydefault(@NotNull C42873red c42873red) {
        Intrinsics.checkNotNullParameter(c42873red, "");
        C42982rgg c42982rgg = c42873red.AEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(c42982rgg, "");
        return c42982rgg;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;)Landroid/widget/ImageView; */
    @Override // o.AbstractC27964kJw
    public android.widget.ImageView EZpvd(@NotNull C42873red c42873red) {
        Intrinsics.checkNotNullParameter(c42873red, "");
        AppCompatImageView appCompatImageView = c42873red.AEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        return appCompatImageView;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;Landroid/content/Context;Lcom/okinc/business/market/bean/CoinQuote;)V */
    @Override // o.AbstractC27964kJw
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull C42873red c42873red, @NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(c42873red, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        c42873red.AEQbTJ.copydefault.setPriceLayoutVisible(true);
    }

    @Override // o.AbstractC27964kJw
    public kotlin.Pair<java.lang.String, java.lang.String> OLrzqt(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        AbstractC54531xLw abstractC54531xLwKWHzl = xUD.KWHzl("FUTURES");
        BizInstrument bizInstrumentValueOf = abstractC54531xLwKWHzl != null ? abstractC54531xLwKWHzl.valueOf(coinQuote.getInstId()) : null;
        if (bizInstrumentValueOf != null && bizInstrumentValueOf.isPreMarketPair()) {
            return C56390yDp.OLrzqt(C33069mpW.copydefault(C35966oKh.TaskDescription.gEmmrt, C56423yEv.EZpvd(C56390yDp.OLrzqt("uly", C59449zhJ.replace$default(bizInstrumentValueOf.getInstFamily(), "-", "", false, 4, (java.lang.Object) null)))), "");
        }
        return C56390yDp.OLrzqt(C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, coinQuote.getInstId(), coinQuote.getInstType(), false, false, false, 28, null), "");
    }

    @Override // o.AbstractC27964kJw
    public java.lang.CharSequence EZpvd(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        java.lang.String turnover = coinQuote.getTurnover();
        return turnover != null ? turnover : "";
    }
}
