package o;

import android.view.View;
import androidx.constraintlayout.widget.Group;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarEconomicTypeVo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC40510qYn;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qiR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C40992qiR extends AbstractC40510qYn<TradingCalendarEconomicTypeVo, C42692rbH> {
    public static final Application Companion = new Application(null);
    public final Function2<java.lang.Integer, TradingCalendarEconomicTypeVo, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C40992qiR() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function2) : (r1v0 kotlin.jvm.functions.Function2))
 A[MD:(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarEconomicTypeVo, kotlin.Unit>):void (m)] (LINE:20) call: o.qiR.<init>(kotlin.jvm.functions.Function2):void type: THIS */
    public /* synthetic */ C40992qiR(Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarEconomicTypeVo, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C40992qiR(Function2<? super java.lang.Integer, ? super TradingCalendarEconomicTypeVo, Unit> function2) {
        this.copydefault = function2;
    }

    /* JADX INFO: renamed from: o.qiR$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qiR.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void OLrzqt(@NotNull android.widget.ImageView imageView, java.lang.String str) {
            Intrinsics.checkNotNullParameter(imageView, "");
            imageView.setImageDrawable(null);
            if (str == null || str.length() == 0) {
                C33054mpH.AEQbTJ(imageView, java.lang.Integer.valueOf(qZH.Activity.AhwBna));
            } else {
                C46742tcs.AEQbTJ(imageView, str);
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C42692rbH AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42692rbH c42692rbHAEQbTJ = C42692rbH.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42692rbHAEQbTJ, "");
        return c42692rbHAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42692rbH c42692rbH, int i, @NotNull TradingCalendarEconomicTypeVo tradingCalendarEconomicTypeVo) {
        Intrinsics.checkNotNullParameter(c42692rbH, "");
        Intrinsics.checkNotNullParameter(tradingCalendarEconomicTypeVo, "");
        c42692rbH.AkhnZx.setText(tradingCalendarEconomicTypeVo.AYXKKw());
        c42692rbH.values.setText(tradingCalendarEconomicTypeVo.gEmmrt());
        c42692rbH.EZpvd.setText(tradingCalendarEconomicTypeVo.EZpvd());
        c42692rbH.gEmmrt.setText(tradingCalendarEconomicTypeVo.valueOf());
        c42692rbH.KWHzl.setText(tradingCalendarEconomicTypeVo.KWHzl());
        boolean z = Intrinsics.EZpvd((java.lang.Object) tradingCalendarEconomicTypeVo.EZpvd(), (java.lang.Object) "-") && Intrinsics.EZpvd((java.lang.Object) tradingCalendarEconomicTypeVo.valueOf(), (java.lang.Object) "-") && Intrinsics.EZpvd((java.lang.Object) tradingCalendarEconomicTypeVo.KWHzl(), (java.lang.Object) "-");
        Group group = c42692rbH.djBIcL;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(z ^ true ? 0 : 8);
        EZpvd(c42692rbH, i, tradingCalendarEconomicTypeVo);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;Ljava/util/List;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull AbstractC40510qYn.Application<C42692rbH> application, @NotNull TradingCalendarEconomicTypeVo tradingCalendarEconomicTypeVo, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(tradingCalendarEconomicTypeVo, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            AEQbTJ((C42692rbH) application.KWHzl(), application.getBindingAdapterPosition(), tradingCalendarEconomicTypeVo);
            return;
        }
        for (java.lang.Object obj : list) {
            if ((obj instanceof java.lang.String) && Intrinsics.EZpvd(obj, (java.lang.Object) "update_reminder_status")) {
                EZpvd((C42692rbH) application.KWHzl(), application.getBindingAdapterPosition(), tradingCalendarEconomicTypeVo);
            }
        }
    }

    public final void EZpvd(C42692rbH c42692rbH, int i, TradingCalendarEconomicTypeVo tradingCalendarEconomicTypeVo) {
        pGS pgs = c42692rbH.AhwBna;
        Intrinsics.copydefault(pgs);
        pgs.setVisibility(tradingCalendarEconomicTypeVo.AhwBna() > java.lang.System.currentTimeMillis() ? 0 : 8);
        if (pgs.getVisibility() == 0) {
            pgs.setOnClickListener(new StateListAnimator(pgs, 1000L, this, i, tradingCalendarEconomicTypeVo));
            pgs.EZpvd(tradingCalendarEconomicTypeVo.AkhnZx(), C33492mxV.OLrzqt());
        }
    }

    /* JADX INFO: renamed from: o.qiR$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ C40992qiR EZpvd;
        public final /* synthetic */ TradingCalendarEconomicTypeVo KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C40992qiR c40992qiR, int i, TradingCalendarEconomicTypeVo tradingCalendarEconomicTypeVo) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = c40992qiR;
            this.AEQbTJ = i;
            this.KWHzl = tradingCalendarEconomicTypeVo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function2 function2 = this.EZpvd.copydefault;
                if (function2 != null) {
                    function2.invoke(java.lang.Integer.valueOf(this.AEQbTJ), this.KWHzl);
                }
            }
        }
    }
}
