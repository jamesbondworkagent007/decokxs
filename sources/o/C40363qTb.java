package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.search.features.navigation.widget.NavSearchSorterView$4;
import com.okinc.uilab.view.OKSortTextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qTb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40363qTb extends ConstraintLayout {
    public kotlin.Pair<? extends SortBy, ? extends SortOrder> AEQbTJ;
    public Function2<? super SortBy, ? super SortOrder, Unit> KWHzl;
    public final C42927rfe OLrzqt;
    public boolean copydefault;

    /* JADX INFO: renamed from: o.qTb$Application */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

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
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C40363qTb(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C40363qTb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setListener(@NotNull Function2<? super SortBy, ? super SortOrder, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.KWHzl = function2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:19) call: o.qTb.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C40363qTb(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40363qTb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = true;
        C42927rfe c42927rfeOLrzqt = C42927rfe.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c42927rfeOLrzqt, "");
        this.OLrzqt = c42927rfeOLrzqt;
        OKSortTextView oKSortTextView = c42927rfeOLrzqt.AYXKKw;
        oKSortTextView.setOnClickListener(new Activity(oKSortTextView, 200L, this));
        OKSortTextView oKSortTextView2 = c42927rfeOLrzqt.valueOf;
        oKSortTextView2.setOnClickListener(new ActionBar(oKSortTextView2, 200L, this));
        OKSortTextView oKSortTextView3 = c42927rfeOLrzqt.copydefault;
        oKSortTextView3.setOnClickListener(new StateListAnimator(oKSortTextView3, 200L, this));
        this.AEQbTJ = new kotlin.Pair<>(SortBy.NONE, SortOrder.NONE);
        if (isInEditMode()) {
            return;
        }
        C41431qqg.EZpvd(this, new NavSearchSorterView$4(context, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(kotlin.Pair<? extends SortBy, ? extends SortOrder> pair) {
        this.AEQbTJ = pair;
        copydefault(pair);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SortOrder KWHzl(OKSortTextView.SortType sortType) {
        int i = Application.KWHzl[sortType.ordinal()];
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

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qTb */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void invokeCallback$default(C40363qTb c40363qTb, kotlin.Pair pair, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            pair = c40363qTb.AEQbTJ;
        }
        c40363qTb.copydefault(pair);
    }

    private final void copydefault(kotlin.Pair<? extends SortBy, ? extends SortOrder> pair) {
        Function2<? super SortBy, ? super SortOrder, Unit> function2 = this.KWHzl;
        if (function2 != null) {
            function2.invoke(pair.getFirst(), pair.getSecond());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(android.view.View view) {
        if (!Intrinsics.EZpvd(this.OLrzqt.AYXKKw, view)) {
            OKSortTextView.setSortType$default(this.OLrzqt.AYXKKw, OKSortTextView.SortType.NONE, false, 2, null);
        }
        if (!Intrinsics.EZpvd(this.OLrzqt.valueOf, view)) {
            OKSortTextView.setSortType$default(this.OLrzqt.valueOf, OKSortTextView.SortType.NONE, false, 2, null);
        }
        if (Intrinsics.EZpvd(this.OLrzqt.copydefault, view)) {
            return;
        }
        OKSortTextView.setSortType$default(this.OLrzqt.copydefault, OKSortTextView.SortType.NONE, false, 2, null);
    }

    public final void setTurnoverVisible(boolean z) {
        int i = z ? 0 : 8;
        this.OLrzqt.AEQbTJ.setVisibility(i);
        this.OLrzqt.valueOf.setVisibility(i);
        if (z) {
            return;
        }
        OKSortTextView.setSortType$default(this.OLrzqt.valueOf, OKSortTextView.SortType.NONE, false, 2, null);
    }

    public final void setAvailable$OKMarket_market_impl(boolean z) {
        this.copydefault = z;
        setVisibility(getVisibility());
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (this.copydefault) {
            super.setVisibility(i);
        } else {
            super.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: o.qTb$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C40363qTb KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C40363qTb c40363qTb) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = c40363qTb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                OKSortTextView oKSortTextView = (OKSortTextView) this.EZpvd;
                C40363qTb c40363qTb = this.KWHzl;
                Intrinsics.copydefault(oKSortTextView);
                c40363qTb.AEQbTJ(oKSortTextView);
                OKSortTextView.setNextSortType$default(this.KWHzl.OLrzqt.valueOf, false, 1, null);
                C40363qTb c40363qTb2 = this.KWHzl;
                c40363qTb2.EZpvd(C56390yDp.OLrzqt(SortBy.TURNOVER, c40363qTb2.KWHzl(c40363qTb2.OLrzqt.valueOf.AEQbTJ())));
            }
        }
    }

    /* JADX INFO: renamed from: o.qTb$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C40363qTb EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C40363qTb c40363qTb) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c40363qTb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                OKSortTextView oKSortTextView = (OKSortTextView) this.AEQbTJ;
                C40363qTb c40363qTb = this.EZpvd;
                Intrinsics.copydefault(oKSortTextView);
                c40363qTb.AEQbTJ(oKSortTextView);
                OKSortTextView.setNextSortType$default(this.EZpvd.OLrzqt.AYXKKw, false, 1, null);
                C40363qTb c40363qTb2 = this.EZpvd;
                c40363qTb2.EZpvd(C56390yDp.OLrzqt(SortBy.PRICE, c40363qTb2.KWHzl(c40363qTb2.OLrzqt.AYXKKw.AEQbTJ())));
            }
        }
    }

    /* JADX INFO: renamed from: o.qTb$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C40363qTb EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C40363qTb c40363qTb) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = c40363qTb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                OKSortTextView oKSortTextView = (OKSortTextView) this.OLrzqt;
                C40363qTb c40363qTb = this.EZpvd;
                Intrinsics.copydefault(oKSortTextView);
                c40363qTb.AEQbTJ(oKSortTextView);
                OKSortTextView.setNextSortType$default(this.EZpvd.OLrzqt.copydefault, false, 1, null);
                C40363qTb c40363qTb2 = this.EZpvd;
                c40363qTb2.EZpvd(C56390yDp.OLrzqt(SortBy.CHANGE, c40363qTb2.KWHzl(c40363qTb2.OLrzqt.copydefault.AEQbTJ())));
            }
        }
    }
}
