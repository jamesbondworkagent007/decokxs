package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.LiveData;
import com.okinc.business.market.bean.CoinQuote;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC27969kKa;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kKd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27972kKd extends AbstractC27969kKa<C42872rec> {
    public final LiveData<java.lang.String> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C27972kKd() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:androidx.lifecycle.LiveData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null androidx.lifecycle.LiveData) : (r2v0 androidx.lifecycle.LiveData))
  (wrap:o.kKa$StateListAnimator:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.kKa$StateListAnimator) : (r3v0 o.kKa$StateListAnimator))
 A[MD:(androidx.lifecycle.LiveData<java.lang.String>, o.kKa$StateListAnimator):void (m)] (LINE:18) call: o.kKd.<init>(androidx.lifecycle.LiveData, o.kKa$StateListAnimator):void type: THIS */
    public /* synthetic */ C27972kKd(LiveData liveData, AbstractC27969kKa.StateListAnimator stateListAnimator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : liveData, (i & 2) != 0 ? null : stateListAnimator);
    }

    public C27972kKd(LiveData<java.lang.String> liveData, AbstractC27969kKa.StateListAnimator stateListAnimator) {
        super(stateListAnimator);
        this.AEQbTJ = liveData;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.kLX
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C42872rec copydefault(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42872rec c42872recCopydefault = C42872rec.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42872recCopydefault, "");
        return c42872recCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;)Lo/xcy; */
    @Override // o.AbstractC27969kKa
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C55071xcy KWHzl(@NotNull C42872rec c42872rec) {
        Intrinsics.checkNotNullParameter(c42872rec, "");
        C55071xcy c55071xcy = c42872rec.EZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55071xcy, "");
        return c55071xcy;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;)Lo/rgn; */
    @Override // o.AbstractC27969kKa
    public C42989rgn EZpvd(@NotNull C42872rec c42872rec) {
        Intrinsics.checkNotNullParameter(c42872rec, "");
        C42989rgn c42989rgn = c42872rec.EZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c42989rgn, "");
        return c42989rgn;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;)Landroid/widget/ImageView; */
    @Override // o.AbstractC27969kKa
    public android.widget.ImageView AEQbTJ(@NotNull C42872rec c42872rec) {
        Intrinsics.checkNotNullParameter(c42872rec, "");
        AppCompatImageView appCompatImageView = c42872rec.EZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        return appCompatImageView;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/content/Context;Lcom/okinc/business/market/bean/CoinQuote;)V */
    @Override // o.AbstractC27969kKa
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C42872rec c42872rec, @NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(c42872rec, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        C40492qXw c40492qXw = c42872rec.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c40492qXw, "");
        boolean z = !C41310qoR.AEQbTJ(c40492qXw, coinQuote.getCountDownInfo(), coinQuote.getInstId(), coinQuote.getInstType());
        c42872rec.EZpvd.EZpvd.setPriceLayoutVisible(z);
        C55071xcy c55071xcy = c42872rec.EZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55071xcy, "");
        c55071xcy.setVisibility(z ? 0 : 8);
        c42872rec.EZpvd.KWHzl.setForeground(null);
    }

    @Override // o.AbstractC27969kKa
    public kotlin.Pair<java.lang.String, java.lang.String> EZpvd(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        java.lang.String titleByIdAndType$default = C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, coinQuote.getInstId(), coinQuote.getInstType(), false, false, false, 28, null);
        java.lang.String string = context.getResources().getString(qZH.PendingIntent.dvKsVJ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return C56390yDp.OLrzqt(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) C59449zhJ.replace$default(titleByIdAndType$default, string, "", false, 4, (java.lang.Object) null)).toString(), "");
    }

    @Override // o.AbstractC27969kKa
    public java.util.List<java.lang.CharSequence> OLrzqt(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        java.lang.String string = context.getResources().getString(qZH.PendingIntent.dvKsVJ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return coinQuote.isPreMarket() ? yDY.gEmmrt(string, C33070mpX.AYXKKw(qZH.PendingIntent.hbZCHz)) : coinQuote.isRebase() ? yDY.gEmmrt(string, C33070mpX.AYXKKw(qZH.PendingIntent.HJWChPRGtXKCDKRTZD)) : C56402yEa.EZpvd(string);
    }

    @Override // o.AbstractC27969kKa
    public java.lang.CharSequence AEQbTJ(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        return java.lang.String.valueOf(coinQuote.getTurnover());
    }

    @Override // o.AbstractC27969kKa
    public kotlin.Pair<java.lang.Integer, java.lang.Integer> copydefault() {
        return C56390yDp.OLrzqt(java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialhOMIpD), java.lang.Integer.valueOf(qZH.TaskDescription.AEQbTJ));
    }
}
