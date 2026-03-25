package o;

import android.view.View;
import com.okinc.market.discover.features.markets.sub.dex.widget.DiscoverDexSorterView$1;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.quotation.ui.model.dex.DexPeriodEnum;
import com.okinc.market.quotation.ui.model.dex.DexSortByEnum;
import com.okinc.uilab.view.OKSortTextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qbD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40607qbD extends C40499qYc {
    public final boolean AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public DexPeriodEnum EZpvd;
    public kotlin.Pair<? extends DexSortByEnum, ? extends SortOrder> KWHzl;
    public final C42869reZ OLrzqt;
    public Function2<? super DexSortByEnum, ? super SortOrder, Unit> copydefault;

    /* JADX INFO: renamed from: o.qbD$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;
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
            OLrzqt = iArr2;
            int[] iArr3 = new int[DexSortByEnum.values().length];
            try {
                iArr3[DexSortByEnum.TURNOVER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr3[DexSortByEnum.MARKET_CAP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr3[DexSortByEnum.PRICE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr3[DexSortByEnum.CHANGE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr3[DexSortByEnum.NONE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            AEQbTJ = iArr3;
            int[] iArr4 = new int[DexPeriodEnum.values().length];
            try {
                iArr4[DexPeriodEnum.FIVE_MINUTES.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr4[DexPeriodEnum.ONE_HOUR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr4[DexPeriodEnum.FOUR_HOURS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr4[DexPeriodEnum.HOUR_24.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr4[DexPeriodEnum.ONE_DAY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            copydefault = iArr4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C40607qbD(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C40607qbD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setListener(@NotNull Function2<? super DexSortByEnum, ? super SortOrder, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.copydefault = function2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:26) call: o.qbD.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C40607qbD(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40607qbD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = true;
        C42869reZ c42869reZEZpvd = C42869reZ.EZpvd(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c42869reZEZpvd, "");
        this.OLrzqt = c42869reZEZpvd;
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.qbB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C40607qbD.KWHzl();
            }
        });
        OKSortTextView oKSortTextView = c42869reZEZpvd.copydefault;
        Intrinsics.checkNotNullExpressionValue(oKSortTextView, "");
        copydefault(oKSortTextView, qZH.PendingIntent.cBPFI, DexSortByEnum.TURNOVER);
        OKSortTextView oKSortTextView2 = c42869reZEZpvd.AhwBna;
        Intrinsics.checkNotNullExpressionValue(oKSortTextView2, "");
        copydefault(oKSortTextView2, qZH.PendingIntent.QfJbVf, DexSortByEnum.MARKET_CAP);
        OKSortTextView oKSortTextView3 = c42869reZEZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(oKSortTextView3, "");
        copydefault(oKSortTextView3, qZH.PendingIntent.gdmIOq, DexSortByEnum.PRICE);
        OKSortTextView oKSortTextView4 = c42869reZEZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(oKSortTextView4, "");
        copydefault(oKSortTextView4, qZH.PendingIntent.DrqXHJ, DexSortByEnum.CHANGE);
        this.KWHzl = new kotlin.Pair<>(DexSortByEnum.NONE, SortOrder.NONE);
        this.EZpvd = DexPeriodEnum.ONE_DAY;
        if (isInEditMode()) {
            return;
        }
        C41431qqg.EZpvd(this, new DiscoverDexSorterView$1(this, null));
    }

    private final InterfaceC46557tYt AEQbTJ() {
        return (InterfaceC46557tYt) this.AYXKKw.getValue();
    }

    public static final InterfaceC46557tYt KWHzl() {
        return (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
    }

    public final void copydefault(OKSortTextView oKSortTextView, @androidx.annotation.StringRes int i, DexSortByEnum dexSortByEnum) {
        oKSortTextView.setText(i);
        oKSortTextView.setOnClickListener(new Activity(oKSortTextView, 200L, this, oKSortTextView, dexSortByEnum));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(kotlin.Pair<? extends DexSortByEnum, ? extends SortOrder> pair) {
        SortOrder second = pair.getSecond();
        SortOrder sortOrder = SortOrder.NONE;
        if (second == sortOrder) {
            pair = C56390yDp.OLrzqt(DexSortByEnum.NONE, sortOrder);
        }
        this.KWHzl = pair;
        KWHzl(pair);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SortOrder KWHzl(OKSortTextView.SortType sortType) {
        int i = StateListAnimator.KWHzl[sortType.ordinal()];
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

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qbD */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void invokeCallback$default(C40607qbD c40607qbD, kotlin.Pair pair, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            pair = c40607qbD.KWHzl;
        }
        c40607qbD.KWHzl((kotlin.Pair<? extends DexSortByEnum, ? extends SortOrder>) pair);
    }

    private final void KWHzl(kotlin.Pair<? extends DexSortByEnum, ? extends SortOrder> pair) {
        Function2<? super DexSortByEnum, ? super SortOrder, Unit> function2 = this.copydefault;
        if (function2 != null) {
            function2.invoke(pair.getFirst(), pair.getSecond());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(android.view.View view) {
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

    private final OKSortTextView.SortType KWHzl(SortOrder sortOrder) {
        int i = StateListAnimator.OLrzqt[sortOrder.ordinal()];
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

    public final void setPreferenceSort(@NotNull DexSortByEnum dexSortByEnum, @NotNull SortOrder sortOrder) {
        Intrinsics.checkNotNullParameter(dexSortByEnum, "");
        Intrinsics.checkNotNullParameter(sortOrder, "");
        pUU.KWHzl("MarketDiscoverFuturesListFragment", "SortView: sortBy= " + dexSortByEnum + " sortOrder= " + sortOrder);
        AEQbTJ(C56390yDp.OLrzqt(dexSortByEnum, sortOrder));
        int i = StateListAnimator.AEQbTJ[dexSortByEnum.ordinal()];
        if (i == 1) {
            OKSortTextView oKSortTextView = this.OLrzqt.copydefault;
            Intrinsics.checkNotNullExpressionValue(oKSortTextView, "");
            OLrzqt(oKSortTextView);
            this.OLrzqt.copydefault.setSortType(KWHzl(sortOrder), false);
            return;
        }
        if (i == 2) {
            OKSortTextView oKSortTextView2 = this.OLrzqt.AhwBna;
            Intrinsics.checkNotNullExpressionValue(oKSortTextView2, "");
            OLrzqt(oKSortTextView2);
            this.OLrzqt.AhwBna.setSortType(KWHzl(sortOrder), false);
            return;
        }
        if (i == 3) {
            OKSortTextView oKSortTextView3 = this.OLrzqt.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(oKSortTextView3, "");
            OLrzqt(oKSortTextView3);
            this.OLrzqt.OLrzqt.setSortType(KWHzl(sortOrder), false);
            return;
        }
        if (i != 4) {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            OKSortTextView oKSortTextView4 = this.OLrzqt.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(oKSortTextView4, "");
            OLrzqt(oKSortTextView4);
            this.OLrzqt.AEQbTJ.setSortType(KWHzl(sortOrder), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(DexPeriodEnum dexPeriodEnum) {
        int i;
        this.EZpvd = dexPeriodEnum;
        int i2 = StateListAnimator.copydefault[dexPeriodEnum.ordinal()];
        if (i2 == 1) {
            i = qZH.PendingIntent.DUUtXg;
        } else if (i2 == 2) {
            i = qZH.PendingIntent.DGUQLIdZmdUa;
        } else if (i2 == 3) {
            i = qZH.PendingIntent.DIIpTV;
        } else if (i2 == 4) {
            i = qZH.PendingIntent.DrqXHJ;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC46557tYt interfaceC46557tYtAEQbTJ = AEQbTJ();
            java.lang.Integer numValueOf = interfaceC46557tYtAEQbTJ != null ? java.lang.Integer.valueOf(interfaceC46557tYtAEQbTJ.EZpvd()) : null;
            i = ((numValueOf != null && numValueOf.intValue() == 1) || (numValueOf != null && numValueOf.intValue() == 2)) ? qZH.PendingIntent.zsXlph : qZH.PendingIntent.DrqXHJ;
        }
        this.OLrzqt.AEQbTJ.setText(i);
    }

    public final void EZpvd(@NotNull DexPeriodEnum dexPeriodEnum) {
        Intrinsics.checkNotNullParameter(dexPeriodEnum, "");
        AEQbTJ(dexPeriodEnum);
    }

    /* JADX INFO: renamed from: o.qbD$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ OKSortTextView AEQbTJ;
        public final /* synthetic */ DexSortByEnum EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C40607qbD copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C40607qbD c40607qbD, OKSortTextView oKSortTextView, DexSortByEnum dexSortByEnum) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = c40607qbD;
            this.AEQbTJ = oKSortTextView;
            this.EZpvd = dexSortByEnum;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.OLrzqt((OKSortTextView) this.OLrzqt);
                OKSortTextView.setNextSortType$default(this.AEQbTJ, false, 1, null);
                C40607qbD c40607qbD = this.copydefault;
                c40607qbD.AEQbTJ((kotlin.Pair<? extends DexSortByEnum, ? extends SortOrder>) C56390yDp.OLrzqt(this.EZpvd, c40607qbD.KWHzl(this.AEQbTJ.AEQbTJ())));
            }
        }
    }
}
