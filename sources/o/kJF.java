package o;

import androidx.appcompat.widget.AppCompatImageView;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.CountDownType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC27964kJw;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kJF extends AbstractC27964kJw<C42873red> {
    public final boolean copydefault;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CountDownType.values().length];
            try {
                iArr[CountDownType.SHOW_COUNT_DOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public kJF() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:o.kJw$StateListAnimator:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.kJw$StateListAnimator) : (r1v0 o.kJw$StateListAnimator))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(o.kJw$StateListAnimator, boolean):void (m)] (LINE:18) call: o.kJF.<init>(o.kJw$StateListAnimator, boolean):void type: THIS */
    public /* synthetic */ kJF(AbstractC27964kJw.StateListAnimator stateListAnimator, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : stateListAnimator, (i & 2) != 0 ? false : z);
    }

    public kJF(AbstractC27964kJw.StateListAnimator stateListAnimator, boolean z) {
        super(stateListAnimator);
        this.copydefault = z;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.kLX
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C42873red copydefault(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42873red c42873redCopydefault = C42873red.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42873redCopydefault, "");
        return c42873redCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroidx/viewbinding/ViewBinding;)Lo/rgg; */
    @Override // o.AbstractC27964kJw
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
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
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull C42873red c42873red, @NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(c42873red, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        Intrinsics.checkNotNullExpressionValue(c42873red.KWHzl, "");
        c42873red.AEQbTJ.copydefault.setPriceLayoutVisible(!C41310qoR.AEQbTJ(r4, coinQuote.getCountDownInfo(), coinQuote.getInstId(), coinQuote.getInstType()));
        c42873red.AEQbTJ.AEQbTJ.setForeground(null);
    }

    @Override // o.AbstractC27964kJw
    public kotlin.Pair<java.lang.String, java.lang.String> OLrzqt(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        java.lang.String titleByIdAndType$default = C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, coinQuote.getInstId(), coinQuote.getInstType(), false, false, false, 28, null);
        java.lang.String string = context.getResources().getString(qZH.PendingIntent.dvKsVJ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return C56390yDp.OLrzqt(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) C59449zhJ.replace$default(titleByIdAndType$default, string, "", false, 4, (java.lang.Object) null)).toString(), "");
    }

    @Override // o.AbstractC27964kJw
    public java.util.List<java.lang.CharSequence> AEQbTJ(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        java.lang.String string = context.getResources().getString(qZH.PendingIntent.dvKsVJ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (coinQuote.isPreMarket()) {
            return yDY.gEmmrt(string, C33070mpX.AYXKKw(qZH.PendingIntent.hbZCHz));
        }
        return coinQuote.isRebase() ? yDY.gEmmrt(string, C33070mpX.AYXKKw(qZH.PendingIntent.HJWChPRGtXKCDKRTZD)) : C56402yEa.EZpvd(string);
    }

    @Override // o.AbstractC27964kJw
    public java.lang.CharSequence EZpvd(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        CountDownInfo countDownInfo = coinQuote.getCountDownInfo();
        if (countDownInfo != null) {
            CountDownInfo countDownInfo2 = (!countDownInfo.countDownTimeExpire() || countDownInfo.getShowType() == CountDownType.SHOW_EXPECT) ? countDownInfo : null;
            CountDownType showType = countDownInfo2 != null ? countDownInfo2.getShowType() : null;
            if (showType == null || StateListAnimator.AEQbTJ[showType.ordinal()] != 1) {
                return "";
            }
            java.lang.String strOLrzqt = pXE.OLrzqt(C33129mqd.valueOf(countDownInfo.getOnlineTime()));
            Intrinsics.copydefault((java.lang.Object) strOLrzqt);
            return strOLrzqt;
        }
        java.lang.String turnover = coinQuote.getTurnover();
        return turnover != null ? turnover : "";
    }

    @Override // o.AbstractC27964kJw
    public kotlin.Pair<java.lang.Integer, java.lang.Integer> EZpvd() {
        return C56390yDp.OLrzqt(java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialhOMIpD), java.lang.Integer.valueOf(qZH.TaskDescription.AEQbTJ));
    }
}
