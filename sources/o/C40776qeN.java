package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ViewKt;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.okinc.market.discover.features.markets.sub.options.widget.OptionsFilterSorterView$1;
import com.okinc.market.discover.features.markets.sub.options.widget.OptionsFilterSorterView$setStrikeFilterData$1$1;
import com.okinc.market.quotation.ui.model.OptionsDirection;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.uilab.view.OKSortTextView;
import com.okinc.widget.data.TradeMenuItemBean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C52761wXj;
import o.C55688xof;
import o.C57664ymg;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qeN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40776qeN extends ConstraintLayout {
    public yHO<? super java.lang.String, ? super OptionsDirection, ? super kotlin.Pair<? extends SortBy, ? extends SortOrder>, Unit> AEQbTJ;
    public TradeMenuItemBean EZpvd;
    public TradeMenuItemBean KWHzl;
    public final C42924rfb OLrzqt;
    public kotlin.Pair<? extends SortBy, ? extends SortOrder> copydefault;

    /* JADX INFO: renamed from: o.qeN$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKSortTextView.SortType.values().length];
            try {
                iArr[OKSortTextView.SortType.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKSortTextView.SortType.UP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OKSortTextView.SortType.DOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C40776qeN(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C40776qeN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:35) call: o.qeN.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C40776qeN(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40776qeN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C42924rfb c42924rfbAEQbTJ = C42924rfb.AEQbTJ(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c42924rfbAEQbTJ, "");
        this.OLrzqt = c42924rfbAEQbTJ;
        this.copydefault = new kotlin.Pair<>(SortBy.NONE, SortOrder.NONE);
        if (isInEditMode()) {
            return;
        }
        C41431qqg.EZpvd(this, new OptionsFilterSorterView$1(context, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(TradeMenuItemBean tradeMenuItemBean) {
        java.lang.String strCopydefault;
        this.EZpvd = tradeMenuItemBean;
        AppCompatTextView appCompatTextView = this.OLrzqt.EZpvd;
        if (tradeMenuItemBean == null || (strCopydefault = tradeMenuItemBean.getTitle()) == null) {
            strCopydefault = C41431qqg.copydefault(this, qZH.PendingIntent.dxcTrN);
        }
        appCompatTextView.setText(strCopydefault);
        invokeCallback$default(this, tradeMenuItemBean, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(TradeMenuItemBean tradeMenuItemBean) {
        this.KWHzl = tradeMenuItemBean;
        this.OLrzqt.KWHzl.setText((tradeMenuItemBean != null ? tradeMenuItemBean.getData() : null) == null ? C41431qqg.copydefault(this, C55688xof.Application.dNxZaP) : tradeMenuItemBean.getTitle());
        invokeCallback$default(this, null, tradeMenuItemBean, null, 5, null);
    }

    private final void EZpvd(kotlin.Pair<? extends SortBy, ? extends SortOrder> pair) {
        this.copydefault = pair;
        invokeCallback$default(this, null, null, pair, 3, null);
    }

    public final SortOrder KWHzl(OKSortTextView.SortType sortType) {
        int i = Activity.EZpvd[sortType.ordinal()];
        if (i == 1) {
            return SortOrder.NONE;
        }
        if (i == 2) {
            return SortOrder.DESC;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return SortOrder.ASC;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qeN */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void invokeCallback$default(C40776qeN c40776qeN, TradeMenuItemBean tradeMenuItemBean, TradeMenuItemBean tradeMenuItemBean2, kotlin.Pair pair, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            tradeMenuItemBean = c40776qeN.EZpvd;
        }
        if ((i & 2) != 0) {
            tradeMenuItemBean2 = c40776qeN.KWHzl;
        }
        if ((i & 4) != 0) {
            pair = c40776qeN.copydefault;
        }
        c40776qeN.copydefault(tradeMenuItemBean, tradeMenuItemBean2, (kotlin.Pair<? extends SortBy, ? extends SortOrder>) pair);
    }

    public final void copydefault(TradeMenuItemBean tradeMenuItemBean, TradeMenuItemBean tradeMenuItemBean2, kotlin.Pair<? extends SortBy, ? extends SortOrder> pair) {
        java.lang.Object data;
        yHO<? super java.lang.String, ? super OptionsDirection, ? super kotlin.Pair<? extends SortBy, ? extends SortOrder>, Unit> yho = this.AEQbTJ;
        if (yho != null) {
            java.lang.String string = (tradeMenuItemBean == null || (data = tradeMenuItemBean.getData()) == null) ? null : data.toString();
            java.lang.Object data2 = tradeMenuItemBean2 != null ? tradeMenuItemBean2.getData() : null;
            OptionsDirection optionsDirection = data2 instanceof OptionsDirection ? (OptionsDirection) data2 : null;
            if (optionsDirection == null) {
                optionsDirection = OptionsDirection.ALL;
            }
            yho.invoke(string, optionsDirection, pair);
        }
    }

    /* JADX INFO: renamed from: o.qeN$Dialog */
    public static final class Dialog implements C57664ymg.StateListAnimator {
        public Dialog() {
        }

        @Override // o.C57664ymg.StateListAnimator
        public void EZpvd(TradeMenuItemBean tradeMenuItemBean) {
            Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
            C40776qeN c40776qeN = C40776qeN.this;
            AppCompatTextView appCompatTextView = c40776qeN.OLrzqt.EZpvd;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            c40776qeN.copydefault((android.widget.TextView) appCompatTextView, false);
            C40776qeN.this.KWHzl(tradeMenuItemBean);
        }
    }

    public static final Unit copydefault(C40776qeN c40776qeN) {
        AppCompatTextView appCompatTextView = c40776qeN.OLrzqt.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        c40776qeN.copydefault((android.widget.TextView) appCompatTextView, false);
        return Unit.INSTANCE;
    }

    public final void copydefault(android.widget.TextView textView, boolean z) {
        if (z) {
            C41426qqb.updateDrawable$default(textView, 0, 0, C52761wXj.TaskDescription.dUDNAs, 0, 11, null);
        } else {
            C41426qqb.updateDrawable$default(textView, 0, 0, C52761wXj.TaskDescription.QSLkRj, 0, 11, null);
        }
    }

    /* JADX INFO: renamed from: o.qeN$PendingIntent */
    public static final class PendingIntent implements C57664ymg.StateListAnimator {
        public PendingIntent() {
        }

        @Override // o.C57664ymg.StateListAnimator
        public void EZpvd(TradeMenuItemBean tradeMenuItemBean) {
            Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
            C40776qeN c40776qeN = C40776qeN.this;
            AppCompatTextView appCompatTextView = c40776qeN.OLrzqt.KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            c40776qeN.copydefault((android.widget.TextView) appCompatTextView, false);
            C40776qeN.this.AEQbTJ(tradeMenuItemBean);
        }
    }

    public static final Unit OLrzqt(C40776qeN c40776qeN) {
        AppCompatTextView appCompatTextView = c40776qeN.OLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        c40776qeN.copydefault((android.widget.TextView) appCompatTextView, false);
        return Unit.INSTANCE;
    }

    public final void setListener(@NotNull yHO<? super java.lang.String, ? super OptionsDirection, ? super kotlin.Pair<? extends SortBy, ? extends SortOrder>, Unit> yho) {
        Intrinsics.checkNotNullParameter(yho, "");
        this.AEQbTJ = yho;
        final C42924rfb c42924rfb = this.OLrzqt;
        OKSortTextView oKSortTextView = c42924rfb.AEQbTJ;
        oKSortTextView.setOnClickListener(new Application(oKSortTextView, 200L, c42924rfb));
        c42924rfb.AEQbTJ.setOnSortTypeChangeListener(new Function2() { // from class: o.qeL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C40776qeN.OLrzqt(c42924rfb, this, (OKSortTextView) obj, (OKSortTextView.SortType) obj2);
            }
        });
        OKSortTextView oKSortTextView2 = c42924rfb.djBIcL;
        oKSortTextView2.setOnClickListener(new ActionBar(oKSortTextView2, 200L, c42924rfb));
        c42924rfb.djBIcL.setOnSortTypeChangeListener(new Function2() { // from class: o.qeK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C40776qeN.copydefault(c42924rfb, this, (OKSortTextView) obj, (OKSortTextView.SortType) obj2);
            }
        });
        OptionsDirection[] optionsDirectionArrValues = OptionsDirection.values();
        java.util.ArrayList arrayList = new java.util.ArrayList(optionsDirectionArrValues.length);
        int length = optionsDirectionArrValues.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            OptionsDirection optionsDirection = optionsDirectionArrValues[i];
            java.lang.String string = getContext().getString(optionsDirection.getStringResId());
            Intrinsics.checkNotNullExpressionValue(string, "");
            arrayList.add(new TradeMenuItemBean(string, i2 == 0, optionsDirection, null, false, null, 56, null));
            i++;
            i2++;
        }
        AppCompatTextView appCompatTextView = this.OLrzqt.KWHzl;
        appCompatTextView.setOnClickListener(new TaskDescription(appCompatTextView, 1000L, this, arrayList));
    }

    public static final Unit OLrzqt(C42924rfb c42924rfb, C40776qeN c40776qeN, OKSortTextView oKSortTextView, OKSortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(oKSortTextView, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        c42924rfb.djBIcL.setSortType(OKSortTextView.SortType.NONE, false);
        c40776qeN.EZpvd(C56390yDp.OLrzqt(SortBy.PRICE, c40776qeN.KWHzl(sortType)));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C42924rfb c42924rfb, C40776qeN c40776qeN, OKSortTextView oKSortTextView, OKSortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(oKSortTextView, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        c42924rfb.AEQbTJ.setSortType(OKSortTextView.SortType.NONE, false);
        c40776qeN.EZpvd(C56390yDp.OLrzqt(SortBy.CHANGE, c40776qeN.KWHzl(sortType)));
        return Unit.INSTANCE;
    }

    public final void setStrikeFilterData(@NotNull java.util.List<? extends InterfaceC41642quf> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return;
        }
        AppCompatTextView appCompatTextView = this.OLrzqt.EZpvd;
        appCompatTextView.setOnClickListener(new StateListAnimator(appCompatTextView, 1000L, this, list));
    }

    /* JADX INFO: renamed from: o.qeN$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C42924rfb AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C42924rfb c42924rfb) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = c42924rfb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.djBIcL.setNextSortType(true);
            }
        }
    }

    /* JADX INFO: renamed from: o.qeN$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C42924rfb EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C42924rfb c42924rfb) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c42924rfb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.AEQbTJ.setNextSortType(true);
            }
        }
    }

    /* JADX INFO: renamed from: o.qeN$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ java.util.List EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C40776qeN copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C40776qeN c40776qeN, java.util.List list) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = c40776qeN;
            this.EZpvd = list;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            LifecycleCoroutineScope lifecycleScope;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this.copydefault);
                if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
                    return;
                }
                BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new OptionsFilterSorterView$setStrikeFilterData$1$1(this.copydefault, this.EZpvd, null), 3, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.qeN$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C40776qeN EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ java.util.List copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C40776qeN c40776qeN, java.util.List list) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = c40776qeN;
            this.copydefault = list;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.copydefault((java.util.List<TradeMenuItemBean>) this.copydefault);
            }
        }
    }

    public final void EZpvd(java.util.List<TradeMenuItemBean> list) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(ViewKt.findFragment(this));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) objM7377constructorimpl;
        if (fragment == null) {
            return;
        }
        for (TradeMenuItemBean tradeMenuItemBean : list) {
            tradeMenuItemBean.setSelect(Intrinsics.EZpvd(tradeMenuItemBean, this.EZpvd));
        }
        AppCompatTextView appCompatTextView = this.OLrzqt.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        copydefault((android.widget.TextView) appCompatTextView, true);
        C57664ymg c57664ymgNewInstance$default = C57664ymg.Application.newInstance$default(C57664ymg.Companion, list, C41431qqg.copydefault(this, qZH.PendingIntent.AxsJAYaxsJAY), false, 4, null);
        androidx.fragment.app.FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c57664ymgNewInstance$default.show(childFragmentManager, "showTypeFilterDialog");
        c57664ymgNewInstance$default.EZpvd(new Dialog());
        c57664ymgNewInstance$default.KWHzl(new Function0() { // from class: o.qeM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C40776qeN.copydefault(this.KWHzl);
            }
        });
    }

    public final void copydefault(java.util.List<TradeMenuItemBean> list) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(ViewKt.findFragment(this));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) objM7377constructorimpl;
        if (fragment == null) {
            return;
        }
        for (TradeMenuItemBean tradeMenuItemBean : list) {
            tradeMenuItemBean.setSelect(Intrinsics.EZpvd(tradeMenuItemBean, this.KWHzl));
        }
        AppCompatTextView appCompatTextView = this.OLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        copydefault((android.widget.TextView) appCompatTextView, true);
        C57664ymg c57664ymgNewInstance$default = C57664ymg.Application.newInstance$default(C57664ymg.Companion, list, C41431qqg.copydefault(this, qZH.PendingIntent.ODWQjV), false, 4, null);
        androidx.fragment.app.FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c57664ymgNewInstance$default.show(childFragmentManager, "showTypeFilterDialog");
        c57664ymgNewInstance$default.EZpvd(new PendingIntent());
        c57664ymgNewInstance$default.KWHzl(new Function0() { // from class: o.qeO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C40776qeN.OLrzqt(this.KWHzl);
            }
        });
    }
}
