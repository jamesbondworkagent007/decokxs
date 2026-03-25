package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.LiveData;
import com.okinc.business.market.bean.CoinQuote;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC27964kJw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kJC extends AbstractC27964kJw<C42669ral> {
    public final C54536xML copydefault;
    public final LiveData<java.lang.String> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public kJC() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:androidx.lifecycle.LiveData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null androidx.lifecycle.LiveData) : (r2v0 androidx.lifecycle.LiveData))
  (wrap:o.kJw$StateListAnimator:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.kJw$StateListAnimator) : (r3v0 o.kJw$StateListAnimator))
 A[MD:(androidx.lifecycle.LiveData<java.lang.String>, o.kJw$StateListAnimator):void (m)] (LINE:15) call: o.kJC.<init>(androidx.lifecycle.LiveData, o.kJw$StateListAnimator):void type: THIS */
    public /* synthetic */ kJC(LiveData liveData, AbstractC27964kJw.StateListAnimator stateListAnimator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : liveData, (i & 2) != 0 ? null : stateListAnimator);
    }

    public kJC(LiveData<java.lang.String> liveData, AbstractC27964kJw.StateListAnimator stateListAnimator) {
        super(stateListAnimator);
        this.djBIcL = liveData;
        this.copydefault = new C54536xML();
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.kLX
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
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
        return C56390yDp.OLrzqt(coinQuote.getBaseCurrency(), coinQuote.getQuoteCurrency());
    }

    @Override // o.AbstractC27964kJw
    public java.util.List<java.lang.CharSequence> AEQbTJ(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        java.lang.String strCopydefault = copydefault(coinQuote);
        if (strCopydefault.length() == 0) {
            return null;
        }
        return C56402yEa.EZpvd(strCopydefault);
    }

    @Override // o.AbstractC27964kJw
    public java.lang.CharSequence EZpvd(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        LiveData<java.lang.String> liveData = this.djBIcL;
        if (Intrinsics.EZpvd((java.lang.Object) (liveData != null ? liveData.getValue() : null), (java.lang.Object) "Volume")) {
            C54536xML c54536xML = this.copydefault;
            java.lang.String voulum = coinQuote.getVoulum();
            return c54536xML.OLrzqt(voulum != null ? voulum : "") + " " + coinQuote.getBaseCurrency();
        }
        return java.lang.String.valueOf(coinQuote.getTurnover());
    }

    private final java.lang.String copydefault(CoinQuote coinQuote) {
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) coinQuote.getLeverageRatio())) {
            return "";
        }
        return coinQuote.getLeverageRatio() + "x";
    }
}
