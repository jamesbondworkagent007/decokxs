package o;

import android.view.View;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.quotation.ui.model.dex.DexSortByEnum;
import com.okinc.market.search.features.navigation.widget.NavSearchDexSorterView$1;
import com.okinc.uilab.view.OKSortTextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qSA extends C40499qYc {
    public final C42865reV AEQbTJ;
    public kotlin.Pair<? extends DexSortByEnum, ? extends SortOrder> EZpvd;
    public Function2<? super DexSortByEnum, ? super SortOrder, Unit> KWHzl;
    public final boolean copydefault;

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

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
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qSA(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qSA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setListener(@NotNull Function2<? super DexSortByEnum, ? super SortOrder, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.KWHzl = function2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:21) call: o.qSA.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ qSA(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qSA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = true;
        C42865reV c42865reVOLrzqt = C42865reV.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c42865reVOLrzqt, "");
        this.AEQbTJ = c42865reVOLrzqt;
        OKSortTextView oKSortTextView = c42865reVOLrzqt.valueOf;
        Intrinsics.checkNotNullExpressionValue(oKSortTextView, "");
        AEQbTJ(oKSortTextView, qZH.PendingIntent.cBPFI, DexSortByEnum.TURNOVER);
        OKSortTextView oKSortTextView2 = c42865reVOLrzqt.copydefault;
        Intrinsics.checkNotNullExpressionValue(oKSortTextView2, "");
        AEQbTJ(oKSortTextView2, qZH.PendingIntent.QfJbVf, DexSortByEnum.MARKET_CAP);
        OKSortTextView oKSortTextView3 = c42865reVOLrzqt.AhwBna;
        Intrinsics.checkNotNullExpressionValue(oKSortTextView3, "");
        AEQbTJ(oKSortTextView3, qZH.PendingIntent.gdmIOq, DexSortByEnum.PRICE);
        OKSortTextView oKSortTextView4 = c42865reVOLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(oKSortTextView4, "");
        AEQbTJ(oKSortTextView4, qZH.PendingIntent.DrqXHJ, DexSortByEnum.CHANGE);
        this.EZpvd = new kotlin.Pair<>(DexSortByEnum.NONE, SortOrder.NONE);
        if (isInEditMode()) {
            return;
        }
        C41431qqg.EZpvd(this, new NavSearchDexSorterView$1(context, this, null));
    }

    private final void AEQbTJ(OKSortTextView oKSortTextView, @androidx.annotation.StringRes int i, DexSortByEnum dexSortByEnum) {
        oKSortTextView.setText(i);
        oKSortTextView.setOnClickListener(new Application(oKSortTextView, 200L, this, oKSortTextView, dexSortByEnum));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(kotlin.Pair<? extends DexSortByEnum, ? extends SortOrder> pair) {
        SortOrder second = pair.getSecond();
        SortOrder sortOrder = SortOrder.NONE;
        if (second == sortOrder) {
            pair = C56390yDp.OLrzqt(DexSortByEnum.NONE, sortOrder);
        }
        this.EZpvd = pair;
        EZpvd(pair);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SortOrder EZpvd(OKSortTextView.SortType sortType) {
        int i = TaskDescription.copydefault[sortType.ordinal()];
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

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qSA */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void invokeCallback$default(qSA qsa, kotlin.Pair pair, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            pair = qsa.EZpvd;
        }
        qsa.EZpvd((kotlin.Pair<? extends DexSortByEnum, ? extends SortOrder>) pair);
    }

    private final void EZpvd(kotlin.Pair<? extends DexSortByEnum, ? extends SortOrder> pair) {
        Function2<? super DexSortByEnum, ? super SortOrder, Unit> function2 = this.KWHzl;
        if (function2 != null) {
            function2.invoke(pair.getFirst(), pair.getSecond());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(android.view.View view) {
        if (!Intrinsics.EZpvd(this.AEQbTJ.valueOf, view)) {
            OKSortTextView.setSortType$default(this.AEQbTJ.valueOf, OKSortTextView.SortType.NONE, false, 2, null);
        }
        if (!Intrinsics.EZpvd(this.AEQbTJ.copydefault, view)) {
            OKSortTextView.setSortType$default(this.AEQbTJ.copydefault, OKSortTextView.SortType.NONE, false, 2, null);
        }
        if (!Intrinsics.EZpvd(this.AEQbTJ.AhwBna, view)) {
            OKSortTextView.setSortType$default(this.AEQbTJ.AhwBna, OKSortTextView.SortType.NONE, false, 2, null);
        }
        if (Intrinsics.EZpvd(this.AEQbTJ.AEQbTJ, view)) {
            return;
        }
        OKSortTextView.setSortType$default(this.AEQbTJ.AEQbTJ, OKSortTextView.SortType.NONE, false, 2, null);
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ qSA EZpvd;
        public final /* synthetic */ OKSortTextView KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ DexSortByEnum copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, qSA qsa, OKSortTextView oKSortTextView, DexSortByEnum dexSortByEnum) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = qsa;
            this.KWHzl = oKSortTextView;
            this.copydefault = dexSortByEnum;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.copydefault((OKSortTextView) this.OLrzqt);
                OKSortTextView.setNextSortType$default(this.KWHzl, false, 1, null);
                qSA qsa = this.EZpvd;
                qsa.copydefault((kotlin.Pair<? extends DexSortByEnum, ? extends SortOrder>) C56390yDp.OLrzqt(this.copydefault, qsa.EZpvd(this.KWHzl.AEQbTJ())));
            }
        }
    }
}
