package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.model.TradingCalendarGridVo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.ITradingCalendarEventVo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarEconomicTypeVo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C40992qiR;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qhg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C40954qhg extends AbstractC40515qYs<TradingCalendarGridVo, C42690rbF> {
    public final int AEQbTJ;
    public final int EZpvd;
    public final int KWHzl;
    public int OLrzqt;
    public final Function1<TradingCalendarGridVo, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.model.TradingCalendarGridVo, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C40954qhg(int i, @NotNull Function1<? super TradingCalendarGridVo, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
        int iDp2px$default = C55298xhM.dp2px$default(4.0f, null, 1, null);
        this.EZpvd = iDp2px$default;
        int iDp2px$default2 = C55298xhM.dp2px$default(6.0f, null, 1, null);
        this.KWHzl = iDp2px$default2;
        int iDp2px$default3 = C55298xhM.dp2px$default(4.0f, null, 1, null);
        this.AEQbTJ = iDp2px$default3;
        this.OLrzqt = (((i - iDp2px$default) - iDp2px$default2) - iDp2px$default3) / 2;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40515qYs
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C42690rbF AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42690rbF c42690rbFKWHzl = C42690rbF.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42690rbFKWHzl, "");
        return c42690rbFKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40515qYs
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull C42690rbF c42690rbF, int i, @NotNull final TradingCalendarGridVo tradingCalendarGridVo) {
        Intrinsics.checkNotNullParameter(c42690rbF, "");
        Intrinsics.checkNotNullParameter(tradingCalendarGridVo, "");
        android.view.View view = c42690rbF.KWHzl;
        view.setOnClickListener(new StateListAnimator(view, 1000L, tradingCalendarGridVo, this));
        c42690rbF.AEQbTJ.setText(tradingCalendarGridVo.KWHzl());
        if (tradingCalendarGridVo.djBIcL()) {
            c42690rbF.AEQbTJ.setTextSize(0, C55298xhM.dp2px$default(16.0f, null, 1, null));
            android.widget.TextView textView = c42690rbF.AEQbTJ;
            textView.setTypeface(textView.getTypeface(), 1);
            c42690rbF.AEQbTJ.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        } else {
            c42690rbF.AEQbTJ.setTextSize(0, C55298xhM.dp2px$default(12.0f, null, 1, null));
            android.widget.TextView textView2 = c42690rbF.AEQbTJ;
            textView2.setTypeface(textView2.getTypeface(), 0);
            if (tradingCalendarGridVo.AYXKKw()) {
                c42690rbF.AEQbTJ.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG));
            } else {
                c42690rbF.AEQbTJ.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
            }
        }
        if (!tradingCalendarGridVo.OLrzqt().isEmpty()) {
            RecyclerView recyclerView = c42690rbF.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(0);
            RecyclerView recyclerView2 = c42690rbF.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
            KWHzl(recyclerView2, tradingCalendarGridVo.OLrzqt(), new Function0() { // from class: o.qhm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C40954qhg.KWHzl(this.AEQbTJ, tradingCalendarGridVo);
                }
            });
        } else {
            RecyclerView recyclerView3 = c42690rbF.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(recyclerView3, "");
            recyclerView3.setVisibility(8);
        }
        if (tradingCalendarGridVo.EZpvd().length() == 0) {
            android.widget.TextView textView3 = c42690rbF.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(8);
            return;
        }
        android.widget.TextView textView4 = c42690rbF.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        textView4.setVisibility(0);
        c42690rbF.copydefault.setText(tradingCalendarGridVo.EZpvd());
        android.widget.TextView textView5 = c42690rbF.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        ViewGroup.LayoutParams layoutParams = textView5.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.OLrzqt;
            layoutParams.width = AEQbTJ(tradingCalendarGridVo.EZpvd());
            textView5.setLayoutParams(layoutParams);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final Unit KWHzl(C40954qhg c40954qhg, TradingCalendarGridVo tradingCalendarGridVo) {
        c40954qhg.copydefault.invoke(tradingCalendarGridVo);
        return Unit.INSTANCE;
    }

    public final int AEQbTJ(java.lang.String str) {
        if (str.length() > 2) {
            return -2;
        }
        return this.OLrzqt;
    }

    public final void KWHzl(RecyclerView recyclerView, java.util.List<? extends ITradingCalendarEventVo> list, Function0<Unit> function0) {
        C40512qYp c40512qYp = new C40512qYp();
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2));
        int i = this.EZpvd;
        recyclerView.addItemDecoration(new C55370xif(i, i, 2));
        c40512qYp.register(ITradingCalendarEventVo.class, new Activity(this.OLrzqt));
        recyclerView.setAdapter(c40512qYp);
        AbstractC40521qYy.submitList$default(c40512qYp, list, null, 2, null);
        recyclerView.setOnClickListener(new Application(recyclerView, 1000L, function0));
    }

    /* JADX INFO: renamed from: o.qhg$Activity */
    public static final class Activity extends AbstractC40510qYn<ITradingCalendarEventVo, C42688rbD> {
        public final int AEQbTJ;

        public Activity(int i) {
            this.AEQbTJ = i;
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
        @Override // o.AbstractC40510qYn
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public C42688rbD AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C42688rbD c42688rbDCopydefault = C42688rbD.copydefault(layoutInflater, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c42688rbDCopydefault, "");
            return c42688rbDCopydefault;
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
        @Override // o.AbstractC40510qYn
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void AEQbTJ(@NotNull C42688rbD c42688rbD, int i, @NotNull ITradingCalendarEventVo iTradingCalendarEventVo) {
            Intrinsics.checkNotNullParameter(c42688rbD, "");
            Intrinsics.checkNotNullParameter(iTradingCalendarEventVo, "");
            android.widget.ImageView imageView = c42688rbD.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                int i2 = this.AEQbTJ;
                layoutParams.width = i2;
                layoutParams.height = i2;
                imageView.setLayoutParams(layoutParams);
                if (iTradingCalendarEventVo instanceof TradingCalendarEconomicTypeVo) {
                    android.widget.ImageView imageView2 = c42688rbD.copydefault;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "");
                    C33054mpH.AEQbTJ(imageView2, java.lang.Integer.valueOf(C52761wXj.TaskDescription.ihnvzI));
                    return;
                } else {
                    C40992qiR.Application application = C40992qiR.Companion;
                    android.widget.ImageView imageView3 = c42688rbD.copydefault;
                    Intrinsics.checkNotNullExpressionValue(imageView3, "");
                    application.OLrzqt(imageView3, iTradingCalendarEventVo.AEQbTJ());
                    return;
                }
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    /* JADX INFO: renamed from: o.qhg$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ Function0 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, Function0 function0) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: o.qhg$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ TradingCalendarGridVo OLrzqt;
        public final /* synthetic */ C40954qhg copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, TradingCalendarGridVo tradingCalendarGridVo, C40954qhg c40954qhg) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = tradingCalendarGridVo;
            this.copydefault = c40954qhg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (this.OLrzqt.gEmmrt()) {
                    this.copydefault.copydefault.invoke(this.OLrzqt);
                }
            }
        }
    }
}
