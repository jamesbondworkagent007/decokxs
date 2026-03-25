package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.LiveData;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.CountDownType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC27964kJw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kJE extends AbstractC27964kJw<C42859reP> {
    public final boolean AhwBna;
    public boolean AkhnZx;
    public final LiveData<java.lang.String> copydefault;
    public final C54536xML djBIcL;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CountDownType.values().length];
            try {
                iArr[CountDownType.SHOW_COUNT_DOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public kJE() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:androidx.lifecycle.LiveData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null androidx.lifecycle.LiveData) : (r2v0 androidx.lifecycle.LiveData))
  (wrap:o.kJw$StateListAnimator:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.kJw$StateListAnimator) : (r3v0 o.kJw$StateListAnimator))
 A[MD:(androidx.lifecycle.LiveData<java.lang.String>, o.kJw$StateListAnimator):void (m)] (LINE:22) call: o.kJE.<init>(androidx.lifecycle.LiveData, o.kJw$StateListAnimator):void type: THIS */
    public /* synthetic */ kJE(LiveData liveData, AbstractC27964kJw.StateListAnimator stateListAnimator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : liveData, (i & 2) != 0 ? null : stateListAnimator);
    }

    public kJE(LiveData<java.lang.String> liveData, AbstractC27964kJw.StateListAnimator stateListAnimator) {
        super(stateListAnimator);
        this.copydefault = liveData;
        this.AkhnZx = C55608xnE.EZpvd();
        this.AhwBna = !C27550jxM.KWHzl.OLrzqt();
        this.djBIcL = new C54536xML();
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.kLX
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C42859reP copydefault(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42859reP c42859rePEZpvd = C42859reP.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42859rePEZpvd, "");
        return c42859rePEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroidx/viewbinding/ViewBinding;)Lo/rgg; */
    @Override // o.AbstractC27964kJw
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C42982rgg copydefault(@NotNull C42859reP c42859reP) {
        Intrinsics.checkNotNullParameter(c42859reP, "");
        C42982rgg c42982rgg = c42859reP.KWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(c42982rgg, "");
        return c42982rgg;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;)Landroid/widget/ImageView; */
    @Override // o.AbstractC27964kJw
    public android.widget.ImageView EZpvd(@NotNull C42859reP c42859reP) {
        Intrinsics.checkNotNullParameter(c42859reP, "");
        AppCompatImageView appCompatImageView = c42859reP.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        return appCompatImageView;
    }

    @Override // o.AbstractC27964kJw
    public kotlin.Pair<java.lang.String, java.lang.String> OLrzqt(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        java.lang.String baseCurrency = coinQuote.getBaseCurrency();
        java.lang.String displayQuoteSymbol = coinQuote.getDisplayQuoteSymbol();
        if (displayQuoteSymbol == null) {
            displayQuoteSymbol = coinQuote.getQuoteCurrency();
        }
        return C56390yDp.OLrzqt(baseCurrency, displayQuoteSymbol);
    }

    @Override // o.AbstractC27964kJw
    public java.util.List<java.lang.CharSequence> AEQbTJ(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        java.lang.String strAEQbTJ = AEQbTJ(coinQuote);
        if (strAEQbTJ.length() == 0) {
            return null;
        }
        return C56402yEa.EZpvd(strAEQbTJ);
    }

    @Override // o.AbstractC27964kJw
    public java.lang.CharSequence EZpvd(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        CountDownInfo countDownInfo = coinQuote.getCountDownInfo();
        if (countDownInfo != null) {
            CountDownInfo countDownInfo2 = (!countDownInfo.countDownTimeExpire() || countDownInfo.getShowType() == CountDownType.SHOW_EXPECT) ? countDownInfo : null;
            CountDownType showType = countDownInfo2 != null ? countDownInfo2.getShowType() : null;
            if (showType == null || Application.KWHzl[showType.ordinal()] != 1) {
                return "";
            }
            java.lang.String strOLrzqt = pXE.OLrzqt(C33129mqd.valueOf(countDownInfo.getOnlineTime()));
            Intrinsics.copydefault((java.lang.Object) strOLrzqt);
            return strOLrzqt;
        }
        LiveData<java.lang.String> liveData = this.copydefault;
        if (Intrinsics.EZpvd((java.lang.Object) (liveData != null ? liveData.getValue() : null), (java.lang.Object) "Volume")) {
            C54536xML c54536xML = this.djBIcL;
            java.lang.String voulum = coinQuote.getVoulum();
            return c54536xML.OLrzqt(voulum != null ? voulum : "") + " " + coinQuote.getBaseCurrency();
        }
        return java.lang.String.valueOf(coinQuote.getTurnover());
    }

    private final java.lang.String AEQbTJ(CoinQuote coinQuote) {
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) coinQuote.getLeverageRatio()) || !this.AkhnZx || !this.AhwBna) {
            return "";
        }
        return coinQuote.getLeverageRatio() + "x";
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;Landroid/content/Context;Lcom/okinc/business/market/bean/CoinQuote;)V */
    @Override // o.AbstractC27964kJw
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull C42859reP c42859reP, @NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(c42859reP, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        Intrinsics.checkNotNullExpressionValue(c42859reP.AEQbTJ, "");
        c42859reP.KWHzl.copydefault.setPriceLayoutVisible(!C41310qoR.AEQbTJ(r4, coinQuote.getCountDownInfo(), coinQuote.getInstId(), coinQuote.getInstType()));
        c42859reP.KWHzl.AEQbTJ.setForeground(null);
    }
}
