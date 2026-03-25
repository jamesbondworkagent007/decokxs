package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.unify_trade.biz.FundingRateArbCoin;
import com.okinc.unify_trade.biz.HighestApyOverview;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C55770xqH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wcT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52958wcT extends AbstractC59533zio<FundingRateArbCoin, Activity> {
    public final Function1<java.lang.String, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C52958wcT(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        uSP uspCopydefault = uSP.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(uspCopydefault, "");
        return new Activity(this, uspCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull FundingRateArbCoin fundingRateArbCoin) {
        java.lang.String period;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(fundingRateArbCoin, "");
        uSP uspEZpvd = activity.EZpvd();
        LinearLayoutCompat root = uspEZpvd.getRoot();
        root.setOnClickListener(new TaskDescription(root, 1000L, this, fundingRateArbCoin));
        android.content.Context context = uspEZpvd.getRoot().getContext();
        Intrinsics.copydefault(context);
        C55379xio c55379xio = uspEZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55379xio, "");
        java.lang.String ccy = fundingRateArbCoin.getCcy();
        EZpvd(context, c55379xio, ccy == null ? "" : ccy, 32, 32);
        C55379xio c55379xio2 = uspEZpvd.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c55379xio2, "");
        java.lang.String upperCase = o.TaskDescription.AEQbTJ(fundingRateArbCoin.getInstId()).AEQbTJ().toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        EZpvd(context, c55379xio2, upperCase, 18, 18);
        android.widget.TextView textView = uspEZpvd.KWHzl;
        int i = C48033uCm.Fragment.DfrfUJ;
        java.lang.String ccy2 = fundingRateArbCoin.getCcy();
        if (ccy2 == null) {
            ccy2 = "";
        }
        textView.setText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("cryptoPair", ccy2))));
        HighestApyOverview highestApyOverview = fundingRateArbCoin.getHighestApyOverview();
        C55251xgS c55251xgS = uspEZpvd.gEmmrt;
        Intrinsics.copydefault(c55251xgS);
        c55251xgS.setVisibility(C55770xqH.Activity.copydefault.OLrzqt(highestApyOverview != null ? highestApyOverview.getLeveragePrincipal() : null) ? 0 : 8);
        c55251xgS.setText(C33069mpW.copydefault(C48033uCm.Fragment.hGuIrQ, C56423yEv.EZpvd(C56390yDp.OLrzqt("leverage", C56033xvF.EZpvd(highestApyOverview != null ? highestApyOverview.getLeveragePrincipal() : null, "")))));
        uspEZpvd.OLrzqt.setText(C33069mpW.copydefault(C48033uCm.Fragment.zXhzOT, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.AYXKKw((highestApyOverview == null || (period = highestApyOverview.getPeriod()) == null) ? null : StringsKt__StringsKt.EZpvd(period, (java.lang.CharSequence) com.ibm.icu.text.DateFormat.DAY))))));
        android.widget.TextView textView2 = uspEZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        AEQbTJ(textView2, highestApyOverview != null ? highestApyOverview.getEstimatedTotalApy() : null);
        android.widget.TextView textView3 = uspEZpvd.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        AEQbTJ(textView3, highestApyOverview != null ? highestApyOverview.getNextEstimatedTotalApy() : null);
    }

    public final void AEQbTJ(android.widget.TextView textView, java.lang.String str) {
        java.lang.String percentWithSymbol$default;
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(str);
        RoundingMode roundingMode = RoundingMode.DOWN;
        BigDecimal scale = bigDecimalEZpvd.setScale(2, roundingMode);
        if (C33129mqd.OLrzqt((java.lang.Object) scale, (java.lang.Object) 0)) {
            percentWithSymbol$default = "--";
        } else {
            xMR xmr = xMR.copydefault;
            if (str == null) {
                str = "";
            }
            percentWithSymbol$default = xMR.formatPercentWithSymbol$default(xmr, str, 0, 0, roundingMode, 6, null);
        }
        textView.setText(percentWithSymbol$default);
        textView.setTextColor(C56033xvF.OLrzqt(scale));
    }

    public final void EZpvd(android.content.Context context, android.widget.ImageView imageView, java.lang.String str, int i, int i2) {
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(context);
        Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String strValueOf = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.valueOf(str) : null;
        C55297xhL.AEQbTJ(componentCallbacks2C5333NrAEQbTJ, strValueOf != null ? strValueOf : "", "lfit", i, i2).KWHzl(C52761wXj.TaskDescription.aHXSQp).EZpvd(imageView);
    }

    /* JADX INFO: renamed from: o.wcT$Activity */
    public final class Activity extends RecyclerView.ViewHolder {
        public final /* synthetic */ C52958wcT EZpvd;
        public final uSP KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final uSP EZpvd() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C52958wcT c52958wcT, uSP usp) {
            super(usp.getRoot());
            Intrinsics.checkNotNullParameter(usp, "");
            this.EZpvd = c52958wcT;
            this.KWHzl = usp;
        }
    }

    /* JADX INFO: renamed from: o.wcT$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C52958wcT KWHzl;
        public final /* synthetic */ FundingRateArbCoin OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C52958wcT c52958wcT, FundingRateArbCoin fundingRateArbCoin) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c52958wcT;
            this.OLrzqt = fundingRateArbCoin;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.KWHzl.invoke(this.OLrzqt.getInstId());
            }
        }
    }
}
