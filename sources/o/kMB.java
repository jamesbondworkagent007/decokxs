package o;

import android.view.View;
import com.okinc.business.market.common.constants.RankingType;
import com.okinc.uilab.view.OKSortTextView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kMB extends android.widget.FrameLayout {
    public final InterfaceC56387yDm EZpvd;
    public InterfaceC28047kMy KWHzl;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kMB(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kMB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback(@NotNull InterfaceC28047kMy interfaceC28047kMy) {
        Intrinsics.checkNotNullParameter(interfaceC28047kMy, "");
        this.KWHzl = interfaceC28047kMy;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:22) call: o.kMB.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ kMB(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kMB(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.kMG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kMB.KWHzl(context, this);
            }
        });
        this.copydefault = true;
    }

    private final C21653hHi EZpvd() {
        return (C21653hHi) this.EZpvd.getValue();
    }

    public static final C21653hHi KWHzl(android.content.Context context, kMB kmb) {
        return C21653hHi.OLrzqt(android.view.LayoutInflater.from(context), kmb, true);
    }

    public static /* synthetic */ void setData$default(kMB kmb, kMC kmc, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        kmb.setData(kmc, z);
    }

    public final void setData(@NotNull kMC kmc, boolean z) {
        Intrinsics.checkNotNullParameter(kmc, "");
        OKSortTextView oKSortTextView = EZpvd().djBIcL;
        Intrinsics.checkNotNullExpressionValue(oKSortTextView, "");
        setUpRankingView(oKSortTextView, RankingType.TURNOVER, z);
        OKSortTextView oKSortTextView2 = EZpvd().KWHzl;
        Intrinsics.checkNotNullExpressionValue(oKSortTextView2, "");
        setUpRankingView(oKSortTextView2, RankingType.MARKET_CAP, z);
        OKSortTextView oKSortTextView3 = EZpvd().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(oKSortTextView3, "");
        setUpRankingView(oKSortTextView3, RankingType.PRICE, z);
        OKSortTextView oKSortTextView4 = EZpvd().EZpvd;
        Intrinsics.checkNotNullExpressionValue(oKSortTextView4, "");
        setUpRankingView(oKSortTextView4, RankingType.CHANGE, z);
        copydefault(kmc);
    }

    public final void copydefault(kMC kmc) {
        OKSortTextView oKSortTextView = EZpvd().djBIcL;
        Intrinsics.checkNotNullExpressionValue(oKSortTextView, "");
        EZpvd(oKSortTextView, RankingType.TURNOVER, kmc);
        OKSortTextView oKSortTextView2 = EZpvd().KWHzl;
        Intrinsics.checkNotNullExpressionValue(oKSortTextView2, "");
        EZpvd(oKSortTextView2, RankingType.MARKET_CAP, kmc);
        OKSortTextView oKSortTextView3 = EZpvd().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(oKSortTextView3, "");
        EZpvd(oKSortTextView3, RankingType.PRICE, kmc);
        OKSortTextView oKSortTextView4 = EZpvd().EZpvd;
        Intrinsics.checkNotNullExpressionValue(oKSortTextView4, "");
        EZpvd(oKSortTextView4, RankingType.CHANGE, kmc);
    }

    public final void OLrzqt(OKSortTextView oKSortTextView, RankingType rankingType) {
        OKSortTextView.SortType sortTypeOLrzqt = OLrzqt(oKSortTextView.AEQbTJ());
        oKSortTextView.setSortType(sortTypeOLrzqt, false);
        if (sortTypeOLrzqt == OKSortTextView.SortType.NONE) {
            rankingType = null;
        }
        kMC kmc = new kMC(rankingType, sortTypeOLrzqt == OKSortTextView.SortType.DOWN);
        copydefault(kmc);
        InterfaceC28047kMy interfaceC28047kMy = this.KWHzl;
        if (interfaceC28047kMy != null) {
            interfaceC28047kMy.KWHzl(kmc);
        }
    }

    public final void EZpvd(OKSortTextView oKSortTextView, RankingType rankingType, kMC kmc) {
        OKSortTextView.SortType sortType;
        if (rankingType != kmc.EZpvd()) {
            sortType = OKSortTextView.SortType.NONE;
        } else {
            sortType = kmc.AEQbTJ() ? OKSortTextView.SortType.DOWN : OKSortTextView.SortType.UP;
        }
        oKSortTextView.setSortType(sortType, false);
    }

    public final OKSortTextView.SortType OLrzqt(OKSortTextView.SortType sortType) {
        OKSortTextView.SortType sortType2 = OKSortTextView.SortType.NONE;
        if (sortType == sortType2) {
            return OKSortTextView.SortType.DOWN;
        }
        OKSortTextView.SortType sortType3 = OKSortTextView.SortType.DOWN;
        return sortType == sortType3 ? OKSortTextView.SortType.UP : (sortType == OKSortTextView.SortType.UP && this.copydefault) ? sortType2 : sortType3;
    }

    public final void setUpRankingView(final OKSortTextView oKSortTextView, final RankingType rankingType, boolean z) {
        if (!z) {
            oKSortTextView.setOnClickListener(new View.OnClickListener() { // from class: o.kMA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    this.AEQbTJ.OLrzqt(oKSortTextView, rankingType);
                }
            });
        } else {
            oKSortTextView.setOnClickListener(new ActionBar(oKSortTextView, 1000L, this, oKSortTextView, rankingType));
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ kMB AEQbTJ;
        public final /* synthetic */ RankingType EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ OKSortTextView OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, kMB kmb, OKSortTextView oKSortTextView, RankingType rankingType) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = kmb;
            this.OLrzqt = oKSortTextView;
            this.EZpvd = rankingType;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.OLrzqt(this.OLrzqt, this.EZpvd);
            }
        }
    }
}
