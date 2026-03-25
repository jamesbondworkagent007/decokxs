package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ViewKt;
import com.okinc.market.search.features.main.root.ui.widget.OptionsStrikeFilterSorterView$setStrikeFilterData$1;
import com.okinc.market.search.features.main.root.ui.widget.OptionsStrikeFilterSorterView$setStrikeFilterData$strikeFilterMenuList$1;
import com.okinc.uilab.view.OKSortTextView;
import com.okinc.widget.data.TradeMenuItemBean;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import o.C55688xof;
import o.C57664ymg;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qIM extends ConstraintLayout {
    public TradeMenuItemBean AEQbTJ;
    public final C42932rfj EZpvd;
    public yHT<? super java.lang.String, ? super java.lang.String, ? super OKSortTextView.SortType, ? super OKSortTextView.SortType, Unit> KWHzl;
    public OKSortTextView.SortType OLrzqt;
    public OKSortTextView.SortType copydefault;
    public TradeMenuItemBean djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qIM(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qIM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:31) call: o.qIM.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ qIM(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qIM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C42932rfj c42932rfjEZpvd = C42932rfj.EZpvd(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c42932rfjEZpvd, "");
        this.EZpvd = c42932rfjEZpvd;
        OKSortTextView.SortType sortType = OKSortTextView.SortType.NONE;
        this.copydefault = sortType;
        this.OLrzqt = sortType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(TradeMenuItemBean tradeMenuItemBean) {
        java.lang.String strCopydefault;
        this.AEQbTJ = tradeMenuItemBean;
        AppCompatTextView appCompatTextView = this.EZpvd.EZpvd;
        if (tradeMenuItemBean == null || (strCopydefault = tradeMenuItemBean.getTitle()) == null) {
            strCopydefault = C41431qqg.copydefault(this, qZH.PendingIntent.dxcTrN);
        }
        appCompatTextView.setText(strCopydefault);
        invokeCallback$default(this, tradeMenuItemBean, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(TradeMenuItemBean tradeMenuItemBean) {
        this.djBIcL = tradeMenuItemBean;
        this.EZpvd.KWHzl.setText((tradeMenuItemBean != null ? tradeMenuItemBean.getData() : null) == null ? C41431qqg.copydefault(this, C55688xof.Application.dNxZaP) : tradeMenuItemBean.getTitle());
        invokeCallback$default(this, null, tradeMenuItemBean, null, null, 13, null);
    }

    private final void OLrzqt(OKSortTextView.SortType sortType) {
        this.copydefault = sortType;
        invokeCallback$default(this, null, null, sortType, null, 11, null);
    }

    private final void EZpvd(OKSortTextView.SortType sortType) {
        this.OLrzqt = sortType;
        invokeCallback$default(this, null, null, null, sortType, 7, null);
    }

    public static /* synthetic */ void invokeCallback$default(qIM qim, TradeMenuItemBean tradeMenuItemBean, TradeMenuItemBean tradeMenuItemBean2, OKSortTextView.SortType sortType, OKSortTextView.SortType sortType2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            tradeMenuItemBean = qim.AEQbTJ;
        }
        if ((i & 2) != 0) {
            tradeMenuItemBean2 = qim.djBIcL;
        }
        if ((i & 4) != 0) {
            sortType = qim.EZpvd.OLrzqt.AEQbTJ();
        }
        if ((i & 8) != 0) {
            sortType2 = qim.EZpvd.AEQbTJ.AEQbTJ();
        }
        qim.AEQbTJ(tradeMenuItemBean, tradeMenuItemBean2, sortType, sortType2);
    }

    public final void AEQbTJ(TradeMenuItemBean tradeMenuItemBean, TradeMenuItemBean tradeMenuItemBean2, OKSortTextView.SortType sortType, OKSortTextView.SortType sortType2) {
        java.lang.Object data;
        java.lang.Object data2;
        yHT<? super java.lang.String, ? super java.lang.String, ? super OKSortTextView.SortType, ? super OKSortTextView.SortType, Unit> yht = this.KWHzl;
        if (yht != null) {
            java.lang.String string = null;
            java.lang.String string2 = (tradeMenuItemBean == null || (data2 = tradeMenuItemBean.getData()) == null) ? null : data2.toString();
            if (tradeMenuItemBean2 != null && (data = tradeMenuItemBean2.getData()) != null) {
                string = data.toString();
            }
            yht.invoke(string2, string, sortType, sortType2);
        }
    }

    public static final class StateListAnimator implements C57664ymg.StateListAnimator {
        public StateListAnimator() {
        }

        @Override // o.C57664ymg.StateListAnimator
        public void EZpvd(TradeMenuItemBean tradeMenuItemBean) {
            Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
            qIM.this.KWHzl(tradeMenuItemBean);
        }
    }

    public static final class LoaderManager implements C57664ymg.StateListAnimator {
        public LoaderManager() {
        }

        @Override // o.C57664ymg.StateListAnimator
        public void EZpvd(TradeMenuItemBean tradeMenuItemBean) {
            Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
            qIM.this.EZpvd(tradeMenuItemBean);
        }
    }

    public final void setListener(@NotNull yHT<? super java.lang.String, ? super java.lang.String, ? super OKSortTextView.SortType, ? super OKSortTextView.SortType, Unit> yht) {
        Intrinsics.checkNotNullParameter(yht, "");
        this.KWHzl = yht;
        final C42932rfj c42932rfj = this.EZpvd;
        OKSortTextView oKSortTextView = c42932rfj.OLrzqt;
        oKSortTextView.setOnClickListener(new TaskDescription(oKSortTextView, 200L, c42932rfj));
        c42932rfj.OLrzqt.setOnSortTypeChangeListener(new Function2() { // from class: o.qIO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return qIM.EZpvd(c42932rfj, this, (OKSortTextView) obj, (OKSortTextView.SortType) obj2);
            }
        });
        OKSortTextView oKSortTextView2 = c42932rfj.AEQbTJ;
        oKSortTextView2.setOnClickListener(new Application(oKSortTextView2, 200L, c42932rfj));
        c42932rfj.AEQbTJ.setOnSortTypeChangeListener(new Function2() { // from class: o.qIK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return qIM.AEQbTJ(c42932rfj, this, (OKSortTextView) obj, (OKSortTextView.SortType) obj2);
            }
        });
        InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
        java.lang.String strCopydefault = C41431qqg.copydefault(this, (interfaceC46557tYt == null || interfaceC46557tYt.EZpvd() != 0) ? qZH.PendingIntent.zsXlph : qZH.PendingIntent.ihnvzI);
        c42932rfj.AEQbTJ.setText("/ " + strCopydefault);
        LinkedHashMap<java.lang.String, java.lang.String> linkedHashMapKWHzl = C40377qTp.KWHzl();
        java.util.List listGEmmrt = yDY.gEmmrt("option_market_all", "C", "P");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
        int i = 0;
        for (java.lang.Object obj : listGEmmrt) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str = (java.lang.String) obj;
            java.lang.String str2 = linkedHashMapKWHzl.get(str);
            java.lang.String str3 = str2 == null ? "" : str2;
            boolean z = i == 0;
            if (i == 0) {
                str = null;
            }
            arrayList.add(new TradeMenuItemBean(str3, z, str, null, false, null, 56, null));
            i++;
        }
        AppCompatTextView appCompatTextView = this.EZpvd.KWHzl;
        appCompatTextView.setOnClickListener(new Activity(appCompatTextView, 1000L, this, arrayList));
    }

    public static final Unit EZpvd(C42932rfj c42932rfj, qIM qim, OKSortTextView oKSortTextView, OKSortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(oKSortTextView, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        c42932rfj.AEQbTJ.setSortType(OKSortTextView.SortType.NONE, false);
        qim.OLrzqt(sortType);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C42932rfj c42932rfj, qIM qim, OKSortTextView oKSortTextView, OKSortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(oKSortTextView, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        c42932rfj.OLrzqt.setSortType(OKSortTextView.SortType.NONE, false);
        qim.EZpvd(sortType);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.util.Map<java.lang.Long, ? extends java.util.List<C40005qFv>> map, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OptionsStrikeFilterSorterView$setStrikeFilterData$1 optionsStrikeFilterSorterView$setStrikeFilterData$1;
        qIM qim;
        if (continuation instanceof OptionsStrikeFilterSorterView$setStrikeFilterData$1) {
            optionsStrikeFilterSorterView$setStrikeFilterData$1 = (OptionsStrikeFilterSorterView$setStrikeFilterData$1) continuation;
            int i = optionsStrikeFilterSorterView$setStrikeFilterData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                optionsStrikeFilterSorterView$setStrikeFilterData$1.label = i - Integer.MIN_VALUE;
            } else {
                optionsStrikeFilterSorterView$setStrikeFilterData$1 = new OptionsStrikeFilterSorterView$setStrikeFilterData$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = optionsStrikeFilterSorterView$setStrikeFilterData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = optionsStrikeFilterSorterView$setStrikeFilterData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
            OptionsStrikeFilterSorterView$setStrikeFilterData$strikeFilterMenuList$1 optionsStrikeFilterSorterView$setStrikeFilterData$strikeFilterMenuList$1 = new OptionsStrikeFilterSorterView$setStrikeFilterData$strikeFilterMenuList$1(map, null);
            optionsStrikeFilterSorterView$setStrikeFilterData$1.L$0 = this;
            optionsStrikeFilterSorterView$setStrikeFilterData$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, optionsStrikeFilterSorterView$setStrikeFilterData$strikeFilterMenuList$1, optionsStrikeFilterSorterView$setStrikeFilterData$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            qim = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qIM qim2 = (qIM) optionsStrikeFilterSorterView$setStrikeFilterData$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
            qim = qim2;
        }
        java.util.List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) C56402yEa.EZpvd(new TradeMenuItemBean(C41431qqg.copydefault(qim, C55688xof.Application.DuR), true, null, null, false, null, 60, null)), (java.lang.Iterable) objWithContext);
        AppCompatTextView appCompatTextView = qim.EZpvd.EZpvd;
        appCompatTextView.setOnClickListener(new ActionBar(appCompatTextView, 1000L, qim, listDjBIcL));
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ qIM AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ java.util.List OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, qIM qim, java.util.List list) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = qim;
            this.OLrzqt = list;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.OLrzqt((java.util.List<TradeMenuItemBean>) this.OLrzqt);
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ qIM EZpvd;
        public final /* synthetic */ java.util.List OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, qIM qim, java.util.List list) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = qim;
            this.OLrzqt = list;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.KWHzl((java.util.List<TradeMenuItemBean>) this.OLrzqt);
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C42932rfj KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C42932rfj c42932rfj) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = c42932rfj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.AEQbTJ.setUpDownSortType(true);
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C42932rfj EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C42932rfj c42932rfj) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c42932rfj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.OLrzqt.setUpDownSortType(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(java.util.List<TradeMenuItemBean> list) {
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
            tradeMenuItemBean.setSelect(Intrinsics.EZpvd(tradeMenuItemBean, this.AEQbTJ));
        }
        C57664ymg c57664ymgNewInstance$default = C57664ymg.Application.newInstance$default(C57664ymg.Companion, list, C41431qqg.copydefault(this, qZH.PendingIntent.AxsJAYaxsJAY), false, 4, null);
        androidx.fragment.app.FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c57664ymgNewInstance$default.show(childFragmentManager, "showTypeFilterDialog");
        c57664ymgNewInstance$default.EZpvd(new StateListAnimator());
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
            tradeMenuItemBean.setSelect(Intrinsics.EZpvd(tradeMenuItemBean, this.djBIcL));
        }
        C57664ymg c57664ymgNewInstance$default = C57664ymg.Application.newInstance$default(C57664ymg.Companion, list, C41431qqg.copydefault(this, qZH.PendingIntent.ODWQjV), false, 4, null);
        androidx.fragment.app.FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c57664ymgNewInstance$default.show(childFragmentManager, "showTypeFilterDialog");
        c57664ymgNewInstance$default.EZpvd(new LoaderManager());
    }
}
