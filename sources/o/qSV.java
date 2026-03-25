package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ViewKt;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.okinc.market.quotation.ui.model.OptionsDirection;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.search.features.navigation.widget.NavSearchOptionsFilterSorterView$1;
import com.okinc.market.search.features.navigation.widget.NavSearchOptionsFilterSorterView$setStrikeFilterData$1;
import com.okinc.market.search.features.navigation.widget.NavSearchOptionsFilterSorterView$setStrikeFilterData$2$1;
import com.okinc.uilab.view.OKSortTextView;
import com.okinc.widget.data.TradeMenuItemBean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C52761wXj;
import o.C55688xof;
import o.C57664ymg;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qSV extends ConstraintLayout {
    public final C42930rfh AEQbTJ;
    public yHO<? super java.lang.String, ? super OptionsDirection, ? super kotlin.Pair<? extends SortBy, ? extends SortOrder>, Unit> EZpvd;
    public kotlin.Pair<? extends SortBy, ? extends SortOrder> KWHzl;
    public TradeMenuItemBean OLrzqt;
    public TradeMenuItemBean copydefault;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

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
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qSV(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qSV(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:38) call: o.qSV.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ qSV(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qSV(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C42930rfh c42930rfhCopydefault = C42930rfh.copydefault(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c42930rfhCopydefault, "");
        this.AEQbTJ = c42930rfhCopydefault;
        this.KWHzl = new kotlin.Pair<>(SortBy.NONE, SortOrder.NONE);
        if (isInEditMode()) {
            return;
        }
        C41431qqg.EZpvd(this, new NavSearchOptionsFilterSorterView$1(context, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(TradeMenuItemBean tradeMenuItemBean) {
        java.lang.String strCopydefault;
        this.copydefault = tradeMenuItemBean;
        AppCompatTextView appCompatTextView = this.AEQbTJ.EZpvd;
        if (tradeMenuItemBean == null || (strCopydefault = tradeMenuItemBean.getTitle()) == null) {
            strCopydefault = C41431qqg.copydefault(this, qZH.PendingIntent.dxcTrN);
        }
        appCompatTextView.setText(strCopydefault);
        invokeCallback$default(this, tradeMenuItemBean, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(TradeMenuItemBean tradeMenuItemBean) {
        this.OLrzqt = tradeMenuItemBean;
        this.AEQbTJ.copydefault.setText((tradeMenuItemBean != null ? tradeMenuItemBean.getData() : null) == null ? C41431qqg.copydefault(this, C55688xof.Application.dNxZaP) : tradeMenuItemBean.getTitle());
        invokeCallback$default(this, null, tradeMenuItemBean, null, 5, null);
    }

    private final void KWHzl(kotlin.Pair<? extends SortBy, ? extends SortOrder> pair) {
        this.KWHzl = pair;
        invokeCallback$default(this, null, null, pair, 3, null);
    }

    private final SortOrder KWHzl(OKSortTextView.SortType sortType) {
        int i = Application.AEQbTJ[sortType.ordinal()];
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

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qSV */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void invokeCallback$default(qSV qsv, TradeMenuItemBean tradeMenuItemBean, TradeMenuItemBean tradeMenuItemBean2, kotlin.Pair pair, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            tradeMenuItemBean = qsv.copydefault;
        }
        if ((i & 2) != 0) {
            tradeMenuItemBean2 = qsv.OLrzqt;
        }
        if ((i & 4) != 0) {
            pair = qsv.KWHzl;
        }
        qsv.OLrzqt(tradeMenuItemBean, tradeMenuItemBean2, pair);
    }

    private final void OLrzqt(TradeMenuItemBean tradeMenuItemBean, TradeMenuItemBean tradeMenuItemBean2, kotlin.Pair<? extends SortBy, ? extends SortOrder> pair) {
        java.lang.Object data;
        yHO<? super java.lang.String, ? super OptionsDirection, ? super kotlin.Pair<? extends SortBy, ? extends SortOrder>, Unit> yho = this.EZpvd;
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

    public static final class Fragment implements C57664ymg.StateListAnimator {
        public Fragment() {
        }

        @Override // o.C57664ymg.StateListAnimator
        public void EZpvd(TradeMenuItemBean tradeMenuItemBean) {
            Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
            qSV qsv = qSV.this;
            AppCompatTextView appCompatTextView = qsv.AEQbTJ.EZpvd;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            qsv.EZpvd((android.widget.TextView) appCompatTextView, false);
            qSV.this.EZpvd(tradeMenuItemBean);
        }
    }

    public static final Unit EZpvd(qSV qsv) {
        AppCompatTextView appCompatTextView = qsv.AEQbTJ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        qsv.EZpvd((android.widget.TextView) appCompatTextView, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(android.widget.TextView textView, boolean z) {
        if (z) {
            C41426qqb.updateDrawable$default(textView, 0, 0, C52761wXj.TaskDescription.dUDNAs, 0, 11, null);
        } else {
            C41426qqb.updateDrawable$default(textView, 0, 0, C52761wXj.TaskDescription.QSLkRj, 0, 11, null);
        }
    }

    public static final class FragmentManager implements C57664ymg.StateListAnimator {
        public FragmentManager() {
        }

        @Override // o.C57664ymg.StateListAnimator
        public void EZpvd(TradeMenuItemBean tradeMenuItemBean) {
            Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
            qSV qsv = qSV.this;
            AppCompatTextView appCompatTextView = qsv.AEQbTJ.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            qsv.EZpvd((android.widget.TextView) appCompatTextView, false);
            qSV.this.KWHzl(tradeMenuItemBean);
        }
    }

    public static final Unit OLrzqt(qSV qsv) {
        AppCompatTextView appCompatTextView = qsv.AEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        qsv.EZpvd((android.widget.TextView) appCompatTextView, false);
        return Unit.INSTANCE;
    }

    public final void setListener(@NotNull yHO<? super java.lang.String, ? super OptionsDirection, ? super kotlin.Pair<? extends SortBy, ? extends SortOrder>, Unit> yho) {
        Intrinsics.checkNotNullParameter(yho, "");
        this.EZpvd = yho;
        final C42930rfh c42930rfh = this.AEQbTJ;
        OKSortTextView oKSortTextView = c42930rfh.KWHzl;
        oKSortTextView.setOnClickListener(new ActionBar(oKSortTextView, 200L, c42930rfh));
        c42930rfh.KWHzl.setOnSortTypeChangeListener(new Function2() { // from class: o.qSW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return qSV.KWHzl(c42930rfh, this, (OKSortTextView) obj, (OKSortTextView.SortType) obj2);
            }
        });
        OKSortTextView oKSortTextView2 = c42930rfh.AYXKKw;
        oKSortTextView2.setOnClickListener(new Activity(oKSortTextView2, 200L, c42930rfh));
        c42930rfh.AYXKKw.setOnSortTypeChangeListener(new Function2() { // from class: o.qSY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return qSV.copydefault(c42930rfh, this, (OKSortTextView) obj, (OKSortTextView.SortType) obj2);
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
        AppCompatTextView appCompatTextView = this.AEQbTJ.copydefault;
        appCompatTextView.setOnClickListener(new TaskDescription(appCompatTextView, 1000L, this, arrayList));
    }

    public static final Unit KWHzl(C42930rfh c42930rfh, qSV qsv, OKSortTextView oKSortTextView, OKSortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(oKSortTextView, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        c42930rfh.AYXKKw.setSortType(OKSortTextView.SortType.NONE, false);
        qsv.KWHzl(C56390yDp.OLrzqt(SortBy.PRICE, qsv.KWHzl(sortType)));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C42930rfh c42930rfh, qSV qsv, OKSortTextView oKSortTextView, OKSortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(oKSortTextView, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        c42930rfh.KWHzl.setSortType(OKSortTextView.SortType.NONE, false);
        qsv.KWHzl(C56390yDp.OLrzqt(SortBy.CHANGE, qsv.KWHzl(sortType)));
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C42930rfh AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C42930rfh c42930rfh) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = c42930rfh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.KWHzl.setNextSortType(true);
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C42930rfh OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C42930rfh c42930rfh) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = c42930rfh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.AYXKKw.setNextSortType(true);
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ Function1 AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ qSV KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, qSV qsv, Function1 function1) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = qsv;
            this.AEQbTJ = function1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            LifecycleCoroutineScope lifecycleScope;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this.KWHzl);
                if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
                    return;
                }
                BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new NavSearchOptionsFilterSorterView$setStrikeFilterData$2$1(this.KWHzl, this.AEQbTJ, null), 3, null);
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ java.util.List AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ qSV copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, qSV qsv, java.util.List list) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = qsv;
            this.AEQbTJ = list;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.copydefault((java.util.List<TradeMenuItemBean>) this.AEQbTJ);
            }
        }
    }

    public final void setStrikeFilterData(@NotNull java.util.List<? extends InterfaceC41642quf> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return;
        }
        setStrikeFilterData(new NavSearchOptionsFilterSorterView$setStrikeFilterData$1(list, null));
    }

    public final void setStrikeFilterData(@NotNull Function1<? super Continuation<? super java.util.List<? extends InterfaceC41642quf>>, ? extends java.lang.Object> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        AppCompatTextView appCompatTextView = this.AEQbTJ.EZpvd;
        appCompatTextView.setOnClickListener(new StateListAnimator(appCompatTextView, 1000L, this, function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(java.util.List<TradeMenuItemBean> list) {
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
            tradeMenuItemBean.setSelect(Intrinsics.EZpvd(tradeMenuItemBean, this.copydefault));
        }
        AppCompatTextView appCompatTextView = this.AEQbTJ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        EZpvd((android.widget.TextView) appCompatTextView, true);
        C57664ymg c57664ymgNewInstance$default = C57664ymg.Application.newInstance$default(C57664ymg.Companion, list, C41431qqg.copydefault(this, qZH.PendingIntent.AxsJAYaxsJAY), false, 4, null);
        androidx.fragment.app.FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c57664ymgNewInstance$default.show(childFragmentManager, "showStrikeFilterDialog");
        c57664ymgNewInstance$default.EZpvd(new Fragment());
        c57664ymgNewInstance$default.KWHzl(new Function0() { // from class: o.qSX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return qSV.EZpvd(this.KWHzl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
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
            tradeMenuItemBean.setSelect(Intrinsics.EZpvd(tradeMenuItemBean, this.OLrzqt));
        }
        AppCompatTextView appCompatTextView = this.AEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        EZpvd((android.widget.TextView) appCompatTextView, true);
        C57664ymg c57664ymgNewInstance$default = C57664ymg.Application.newInstance$default(C57664ymg.Companion, list, C41431qqg.copydefault(this, qZH.PendingIntent.ODWQjV), false, 4, null);
        androidx.fragment.app.FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c57664ymgNewInstance$default.show(childFragmentManager, "showTypeFilterDialog");
        c57664ymgNewInstance$default.EZpvd(new FragmentManager());
        c57664ymgNewInstance$default.KWHzl(new Function0() { // from class: o.qSU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return qSV.OLrzqt(this.OLrzqt);
            }
        });
    }
}
