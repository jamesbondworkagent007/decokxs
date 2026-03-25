package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.market.discover.widgets.DiscoverSorterView$5;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.uilab.view.OKSortTextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qpk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41382qpk extends ConstraintLayout {
    public Function2<? super SortBy, ? super SortOrder, Unit> AEQbTJ;
    public boolean EZpvd;
    public final C42869reZ OLrzqt;
    public kotlin.Pair<? extends SortBy, ? extends SortOrder> copydefault;

    /* JADX INFO: renamed from: o.qpk$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;

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
            int[] iArr2 = new int[SortOrder.values().length];
            try {
                iArr2[SortOrder.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[SortOrder.DESC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[SortOrder.ASC.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            AEQbTJ = iArr2;
            int[] iArr3 = new int[SortBy.values().length];
            try {
                iArr3[SortBy.PRICE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr3[SortBy.CHANGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr3[SortBy.VOLUME.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr3[SortBy.TURNOVER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr3[SortBy.NAME.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr3[SortBy.NONE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            OLrzqt = iArr3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41382qpk(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41382qpk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCustomChangePercentText(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setListener(@NotNull Function2<? super SortBy, ? super SortOrder, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.AEQbTJ = function2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:23) call: o.qpk.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C41382qpk(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41382qpk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C42869reZ c42869reZEZpvd = C42869reZ.EZpvd(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c42869reZEZpvd, "");
        this.OLrzqt = c42869reZEZpvd;
        OKSortTextView oKSortTextView = c42869reZEZpvd.copydefault;
        oKSortTextView.setOnClickListener(new Application(oKSortTextView, 200L, this));
        OKSortTextView oKSortTextView2 = c42869reZEZpvd.AhwBna;
        oKSortTextView2.setOnClickListener(new StateListAnimator(oKSortTextView2, 200L, this));
        OKSortTextView oKSortTextView3 = c42869reZEZpvd.OLrzqt;
        oKSortTextView3.setOnClickListener(new Activity(oKSortTextView3, 200L, this));
        OKSortTextView oKSortTextView4 = c42869reZEZpvd.AEQbTJ;
        oKSortTextView4.setOnClickListener(new TaskDescription(oKSortTextView4, 200L, this));
        this.copydefault = new kotlin.Pair<>(SortBy.NONE, SortOrder.NONE);
        if (isInEditMode()) {
            return;
        }
        C41431qqg.EZpvd(this, new DiscoverSorterView$5(this, context, null));
    }

    public final void OLrzqt(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.OLrzqt.AEQbTJ.setText(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(kotlin.Pair<? extends SortBy, ? extends SortOrder> pair) {
        this.copydefault = pair;
        KWHzl(pair);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SortOrder KWHzl(OKSortTextView.SortType sortType) {
        int i = ActionBar.KWHzl[sortType.ordinal()];
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

    public final OKSortTextView.SortType AEQbTJ(SortOrder sortOrder) {
        int i = ActionBar.AEQbTJ[sortOrder.ordinal()];
        if (i == 1) {
            return OKSortTextView.SortType.NONE;
        }
        if (i == 2) {
            return OKSortTextView.SortType.UP;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return OKSortTextView.SortType.DOWN;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qpk */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void invokeCallback$default(C41382qpk c41382qpk, kotlin.Pair pair, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            pair = c41382qpk.copydefault;
        }
        c41382qpk.KWHzl((kotlin.Pair<? extends SortBy, ? extends SortOrder>) pair);
    }

    public final void KWHzl(kotlin.Pair<? extends SortBy, ? extends SortOrder> pair) {
        Function2<? super SortBy, ? super SortOrder, Unit> function2 = this.AEQbTJ;
        if (function2 != null) {
            function2.invoke(pair.getFirst(), pair.getSecond());
        }
    }

    public final void setPreferenceSort(@NotNull SortBy sortBy, @NotNull SortOrder sortOrder) {
        Intrinsics.checkNotNullParameter(sortBy, "");
        Intrinsics.checkNotNullParameter(sortOrder, "");
        pUU.KWHzl("MarketDiscoverFuturesListFragment", "SortView: sortBy= " + sortBy + " sortOrder= " + sortOrder);
        EZpvd(C56390yDp.OLrzqt(sortBy, sortOrder));
        switch (ActionBar.OLrzqt[sortBy.ordinal()]) {
            case 1:
                OKSortTextView oKSortTextView = this.OLrzqt.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(oKSortTextView, "");
                copydefault(oKSortTextView);
                this.OLrzqt.OLrzqt.setSortType(AEQbTJ(sortOrder), false);
                return;
            case 2:
                OKSortTextView oKSortTextView2 = this.OLrzqt.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(oKSortTextView2, "");
                copydefault(oKSortTextView2);
                this.OLrzqt.AEQbTJ.setSortType(AEQbTJ(sortOrder), false);
                return;
            case 3:
                OKSortTextView oKSortTextView3 = this.OLrzqt.AhwBna;
                Intrinsics.checkNotNullExpressionValue(oKSortTextView3, "");
                copydefault(oKSortTextView3);
                this.OLrzqt.AhwBna.setSortType(AEQbTJ(sortOrder), false);
                return;
            case 4:
                OKSortTextView oKSortTextView4 = this.OLrzqt.AhwBna;
                Intrinsics.checkNotNullExpressionValue(oKSortTextView4, "");
                copydefault(oKSortTextView4);
                this.OLrzqt.AhwBna.setSortType(AEQbTJ(sortOrder), false);
                return;
            case 5:
                OKSortTextView oKSortTextView5 = this.OLrzqt.copydefault;
                Intrinsics.checkNotNullExpressionValue(oKSortTextView5, "");
                copydefault(oKSortTextView5);
                this.OLrzqt.copydefault.setSortType(AEQbTJ(sortOrder), false);
                return;
            case 6:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void EZpvd(boolean z) {
        AppCompatTextView appCompatTextView = this.OLrzqt.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(z ? 0 : 8);
        OKSortTextView oKSortTextView = this.OLrzqt.AhwBna;
        Intrinsics.checkNotNullExpressionValue(oKSortTextView, "");
        oKSortTextView.setVisibility(z ? 0 : 8);
    }

    public final void setSubTitle(java.lang.String str) {
        this.OLrzqt.AhwBna.setText(str);
    }

    public final void OLrzqt() {
        OKSortTextView oKSortTextView = this.OLrzqt.copydefault;
        oKSortTextView.setUpIndicator(null);
        oKSortTextView.setDownIndicator(null);
        oKSortTextView.setDefaultIndicator(null);
        OKSortTextView oKSortTextView2 = this.OLrzqt.AhwBna;
        oKSortTextView2.setUpIndicator(null);
        oKSortTextView2.setDownIndicator(null);
        oKSortTextView2.setDefaultIndicator(null);
        OKSortTextView oKSortTextView3 = this.OLrzqt.OLrzqt;
        oKSortTextView3.setUpIndicator(null);
        oKSortTextView3.setDownIndicator(null);
        oKSortTextView3.setDefaultIndicator(null);
        OKSortTextView oKSortTextView4 = this.OLrzqt.AEQbTJ;
        oKSortTextView4.setUpIndicator(null);
        oKSortTextView4.setDownIndicator(null);
        oKSortTextView4.setDefaultIndicator(null);
        setListener(new Function2() { // from class: o.qpn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C41382qpk.OLrzqt((SortBy) obj, (SortOrder) obj2);
            }
        });
    }

    public static final Unit OLrzqt(SortBy sortBy, SortOrder sortOrder) {
        Intrinsics.checkNotNullParameter(sortBy, "");
        Intrinsics.checkNotNullParameter(sortOrder, "");
        return Unit.INSTANCE;
    }

    public final void copydefault(android.view.View view) {
        if (!Intrinsics.EZpvd(this.OLrzqt.copydefault, view)) {
            OKSortTextView.setSortType$default(this.OLrzqt.copydefault, OKSortTextView.SortType.NONE, false, 2, null);
        }
        if (!Intrinsics.EZpvd(this.OLrzqt.AhwBna, view)) {
            OKSortTextView.setSortType$default(this.OLrzqt.AhwBna, OKSortTextView.SortType.NONE, false, 2, null);
        }
        if (!Intrinsics.EZpvd(this.OLrzqt.OLrzqt, view)) {
            OKSortTextView.setSortType$default(this.OLrzqt.OLrzqt, OKSortTextView.SortType.NONE, false, 2, null);
        }
        if (Intrinsics.EZpvd(this.OLrzqt.AEQbTJ, view)) {
            return;
        }
        OKSortTextView.setSortType$default(this.OLrzqt.AEQbTJ, OKSortTextView.SortType.NONE, false, 2, null);
    }

    /* JADX INFO: renamed from: o.qpk$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C41382qpk copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C41382qpk c41382qpk) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c41382qpk;
        }

        /* JADX DEBUG: Class process forced to load method for inline: com.okinc.uilab.view.OKSortTextView.setNextSortType$default(com.okinc.uilab.view.OKSortTextView, boolean, int, java.lang.Object):void */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                OKSortTextView oKSortTextView = (OKSortTextView) this.EZpvd;
                C41382qpk c41382qpk = this.copydefault;
                Intrinsics.copydefault(oKSortTextView);
                c41382qpk.copydefault(oKSortTextView);
                OKSortTextView.setNextSortType$default(this.copydefault.OLrzqt.OLrzqt, false, 1, null);
                C41382qpk c41382qpk2 = this.copydefault;
                c41382qpk2.EZpvd((kotlin.Pair<? extends SortBy, ? extends SortOrder>) C56390yDp.OLrzqt(SortBy.PRICE, c41382qpk2.KWHzl(c41382qpk2.OLrzqt.OLrzqt.AEQbTJ())));
            }
        }
    }

    /* JADX INFO: renamed from: o.qpk$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C41382qpk EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C41382qpk c41382qpk) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c41382qpk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                OKSortTextView oKSortTextView = (OKSortTextView) this.KWHzl;
                C41382qpk c41382qpk = this.EZpvd;
                Intrinsics.copydefault(oKSortTextView);
                c41382qpk.copydefault(oKSortTextView);
                OKSortTextView.setUpDownSortType$default(this.EZpvd.OLrzqt.copydefault, false, 1, null);
                C41382qpk c41382qpk2 = this.EZpvd;
                c41382qpk2.EZpvd((kotlin.Pair<? extends SortBy, ? extends SortOrder>) C56390yDp.OLrzqt(SortBy.NAME, c41382qpk2.KWHzl(c41382qpk2.OLrzqt.copydefault.AEQbTJ())));
            }
        }
    }

    /* JADX INFO: renamed from: o.qpk$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C41382qpk copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C41382qpk c41382qpk) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = c41382qpk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                OKSortTextView oKSortTextView = (OKSortTextView) this.OLrzqt;
                C41382qpk c41382qpk = this.copydefault;
                Intrinsics.copydefault(oKSortTextView);
                c41382qpk.copydefault(oKSortTextView);
                OKSortTextView.setNextSortType$default(this.copydefault.OLrzqt.AhwBna, false, 1, null);
                C41382qpk c41382qpk2 = this.copydefault;
                c41382qpk2.EZpvd((kotlin.Pair<? extends SortBy, ? extends SortOrder>) C56390yDp.OLrzqt(SortBy.TURNOVER, c41382qpk2.KWHzl(c41382qpk2.OLrzqt.AhwBna.AEQbTJ())));
            }
        }
    }

    /* JADX INFO: renamed from: o.qpk$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C41382qpk EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C41382qpk c41382qpk) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = c41382qpk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                OKSortTextView oKSortTextView = (OKSortTextView) this.KWHzl;
                C41382qpk c41382qpk = this.EZpvd;
                Intrinsics.copydefault(oKSortTextView);
                c41382qpk.copydefault(oKSortTextView);
                OKSortTextView.setNextSortType$default(this.EZpvd.OLrzqt.AEQbTJ, false, 1, null);
                C41382qpk c41382qpk2 = this.EZpvd;
                c41382qpk2.EZpvd((kotlin.Pair<? extends SortBy, ? extends SortOrder>) C56390yDp.OLrzqt(SortBy.CHANGE, c41382qpk2.KWHzl(c41382qpk2.OLrzqt.AEQbTJ.AEQbTJ())));
            }
        }
    }
}
