package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.business.market.features.module.domain.model.MarketSortBy;
import com.okinc.uilab.view.OKSortTextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kNh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C28057kNh extends android.widget.LinearLayout {
    public OKSortTextView AEQbTJ;
    public LinearLayoutCompat EZpvd;
    public OKSortTextView KWHzl;
    public java.util.List<OKSortTextView> OLrzqt;
    public OKSortTextView copydefault;
    public OKSortTextView djBIcL;
    public OKSortTextView gEmmrt;

    /* JADX INFO: renamed from: o.kNh$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MarketSortBy.values().length];
            try {
                iArr[MarketSortBy.VOLUME.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[MarketSortBy.MCAP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[MarketSortBy.PRICE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[MarketSortBy.CHANGE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[MarketSortBy.RANK.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[MarketSortBy.NONE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28057kNh(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:13) call: o.kNh.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C28057kNh(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28057kNh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        android.view.LayoutInflater.from(context).inflate(C23274hvD.Activity.iRgjgR, (android.view.ViewGroup) this, true);
        this.gEmmrt = (OKSortTextView) findViewById(C23274hvD.Application.WindowDecorActionBar);
        this.copydefault = (OKSortTextView) findViewById(C23274hvD.Application.TwilightManagerTwilightState);
        this.KWHzl = (OKSortTextView) findViewById(C23274hvD.Application.setInstance);
        this.AEQbTJ = (OKSortTextView) findViewById(C23274hvD.Application.isNight);
        this.djBIcL = (OKSortTextView) findViewById(C23274hvD.Application.ensureTabsExist);
        this.EZpvd = (LinearLayoutCompat) findViewById(C23274hvD.Application.QKDJJA);
        this.OLrzqt = yDY.gEmmrt(this.gEmmrt, this.copydefault, this.KWHzl, this.AEQbTJ, this.djBIcL);
    }

    public final void setDefaultSort(@NotNull MarketSortBy marketSortBy, @NotNull OKSortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(marketSortBy, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        int i = Application.KWHzl[marketSortBy.ordinal()];
        if (i == 1) {
            OKSortTextView.setSortType$default(this.gEmmrt, sortType, false, 2, null);
            return;
        }
        if (i == 2) {
            OKSortTextView.setSortType$default(this.copydefault, sortType, false, 2, null);
            return;
        }
        if (i == 3) {
            OKSortTextView.setSortType$default(this.KWHzl, sortType, false, 2, null);
        } else if (i == 4) {
            OKSortTextView.setSortType$default(this.AEQbTJ, sortType, false, 2, null);
        } else {
            if (i != 5) {
                return;
            }
            OKSortTextView.setSortType$default(this.djBIcL, sortType, false, 2, null);
        }
    }

    public final void AEQbTJ() {
        OKSortTextView oKSortTextView = this.gEmmrt;
        OKSortTextView.SortType sortType = OKSortTextView.SortType.NONE;
        oKSortTextView.setSortType(sortType, false);
        this.copydefault.setSortType(sortType, false);
        this.KWHzl.setSortType(sortType, false);
        this.AEQbTJ.setSortType(sortType, false);
        this.djBIcL.setSortType(sortType, false);
    }

    public final void setSortChangedListener(@NotNull final Function2<? super OKSortTextView.SortType, ? super MarketSortBy, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.gEmmrt.setOnSortTypeChangeListener(new Function2() { // from class: o.kNm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C28057kNh.gEmmrt(function2, (OKSortTextView) obj, (OKSortTextView.SortType) obj2);
            }
        });
        this.copydefault.setOnSortTypeChangeListener(new Function2() { // from class: o.kNn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C28057kNh.AhwBna(function2, (OKSortTextView) obj, (OKSortTextView.SortType) obj2);
            }
        });
        this.KWHzl.setOnSortTypeChangeListener(new Function2() { // from class: o.kNp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C28057kNh.valueOf(function2, (OKSortTextView) obj, (OKSortTextView.SortType) obj2);
            }
        });
        this.AEQbTJ.setOnSortTypeChangeListener(new Function2() { // from class: o.kNq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C28057kNh.djBIcL(function2, (OKSortTextView) obj, (OKSortTextView.SortType) obj2);
            }
        });
        this.djBIcL.setOnSortTypeChangeListener(new Function2() { // from class: o.kNo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C28057kNh.AYXKKw(function2, (OKSortTextView) obj, (OKSortTextView.SortType) obj2);
            }
        });
    }

    public static final Unit gEmmrt(Function2 function2, OKSortTextView oKSortTextView, OKSortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(oKSortTextView, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        function2.invoke(sortType, MarketSortBy.VOLUME);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(Function2 function2, OKSortTextView oKSortTextView, OKSortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(oKSortTextView, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        function2.invoke(sortType, MarketSortBy.MCAP);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(Function2 function2, OKSortTextView oKSortTextView, OKSortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(oKSortTextView, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        function2.invoke(sortType, MarketSortBy.PRICE);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(Function2 function2, OKSortTextView oKSortTextView, OKSortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(oKSortTextView, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        function2.invoke(sortType, MarketSortBy.CHANGE);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(Function2 function2, OKSortTextView oKSortTextView, OKSortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(oKSortTextView, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        function2.invoke(sortType, MarketSortBy.RANK);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void setSortClickListener$default(C28057kNh c28057kNh, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c28057kNh.setSortClickListener(z);
    }

    public static final void setSortClickListener$lambda$7$lambda$6(C28057kNh c28057kNh, boolean z, OKSortTextView oKSortTextView, android.view.View view) {
        java.util.List<OKSortTextView> list = c28057kNh.OLrzqt;
        if (list != null) {
            for (OKSortTextView oKSortTextView2 : list) {
                if (!Intrinsics.EZpvd(oKSortTextView, oKSortTextView2)) {
                    oKSortTextView2.setSortType(OKSortTextView.SortType.NONE, false);
                }
            }
        }
        if (z) {
            OKSortTextView.setSortType$default(oKSortTextView, c28057kNh.KWHzl(oKSortTextView.OLrzqt()), false, 2, null);
        } else {
            OKSortTextView.setUpDownSortType$default(oKSortTextView, false, 1, null);
        }
    }

    public final void EZpvd(@NotNull OKSortTextView.SortType sortType, @NotNull MarketSortBy marketSortBy) {
        Intrinsics.checkNotNullParameter(sortType, "");
        Intrinsics.checkNotNullParameter(marketSortBy, "");
        AEQbTJ();
        switch (Application.KWHzl[marketSortBy.ordinal()]) {
            case 1:
                this.gEmmrt.setSortType(sortType, false);
                return;
            case 2:
                this.copydefault.setSortType(sortType, false);
                return;
            case 3:
                this.KWHzl.setSortType(sortType, false);
                return;
            case 4:
                this.AEQbTJ.setSortType(sortType, false);
                return;
            case 5:
                this.djBIcL.setSortType(sortType, false);
                return;
            case 6:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final OKSortTextView.SortType KWHzl(OKSortTextView.SortType sortType) {
        OKSortTextView.SortType sortType2 = OKSortTextView.SortType.DOWN;
        return sortType == sortType2 ? OKSortTextView.SortType.UP : sortType2;
    }

    public final void setSortClickListener(final boolean z) {
        java.util.List<OKSortTextView> list = this.OLrzqt;
        if (list != null) {
            for (final OKSortTextView oKSortTextView : list) {
                oKSortTextView.setOnClickListener(new View.OnClickListener() { // from class: o.kNu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C28057kNh.setSortClickListener$lambda$7$lambda$6(this.KWHzl, z, oKSortTextView, view);
                    }
                });
            }
        }
    }

    public final void setRankSortVisible(boolean z) {
        this.EZpvd.setVisibility(z ? 0 : 8);
    }
}
