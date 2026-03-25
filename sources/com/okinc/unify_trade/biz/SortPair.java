package com.okinc.unify_trade.biz;

import com.okinc.core.widget.SortTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class SortPair {
    public static final int $stable = 8;
    private SortTextView.SortType changeSort;
    private SortTextView.SortType priceSort;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SortPair() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final SortTextView.SortType component1() {
        return this.priceSort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final SortTextView.SortType component2() {
        return this.changeSort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SortPair copy$default(SortPair sortPair, SortTextView.SortType sortType, SortTextView.SortType sortType2, int i, Object obj) {
        if ((i & 1) != 0) {
            sortType = sortPair.priceSort;
        }
        if ((i & 2) != 0) {
            sortType2 = sortPair.changeSort;
        }
        return sortPair.copy(sortType, sortType2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SortPair copy(@NotNull SortTextView.SortType sortType, @NotNull SortTextView.SortType sortType2) {
        Intrinsics.checkNotNullParameter(sortType, "");
        Intrinsics.checkNotNullParameter(sortType2, "");
        return new SortPair(sortType, sortType2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SortPair)) {
            return false;
        }
        SortPair sortPair = (SortPair) obj;
        return this.priceSort == sortPair.priceSort && this.changeSort == sortPair.changeSort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SortTextView.SortType getChangeSort() {
        return this.changeSort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SortTextView.SortType getPriceSort() {
        return this.priceSort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.priceSort.hashCode() * 31) + this.changeSort.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SortPair(priceSort=" + this.priceSort + ", changeSort=" + this.changeSort + ")";
    }

    public SortPair(@NotNull SortTextView.SortType sortType, @NotNull SortTextView.SortType sortType2) {
        Intrinsics.checkNotNullParameter(sortType, "");
        Intrinsics.checkNotNullParameter(sortType2, "");
        this.priceSort = sortType;
        this.changeSort = sortType2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:com.okinc.core.widget.SortTextView$SortType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.core.widget.SortTextView$SortType:0x0004: SGET  A[WRAPPED] (LINE:17) com.okinc.core.widget.SortTextView.SortType.NONE com.okinc.core.widget.SortTextView$SortType) : (r1v0 com.okinc.core.widget.SortTextView$SortType))
  (wrap:com.okinc.core.widget.SortTextView$SortType:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.core.widget.SortTextView$SortType:0x000a: SGET  A[WRAPPED] com.okinc.core.widget.SortTextView.SortType.NONE com.okinc.core.widget.SortTextView$SortType) : (r2v0 com.okinc.core.widget.SortTextView$SortType))
 A[MD:(com.okinc.core.widget.SortTextView$SortType, com.okinc.core.widget.SortTextView$SortType):void (m)] (LINE:17) call: com.okinc.unify_trade.biz.SortPair.<init>(com.okinc.core.widget.SortTextView$SortType, com.okinc.core.widget.SortTextView$SortType):void type: THIS */
    public /* synthetic */ SortPair(SortTextView.SortType sortType, SortTextView.SortType sortType2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SortTextView.SortType.NONE : sortType, (i & 2) != 0 ? SortTextView.SortType.NONE : sortType2);
    }

    private final void initPair() {
        SortTextView.SortType sortType = SortTextView.SortType.NONE;
        this.priceSort = sortType;
        this.changeSort = sortType;
    }

    public final void setPriceSort(@NotNull SortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(sortType, "");
        initPair();
        this.priceSort = sortType;
    }

    public final void setChangeSort(@NotNull SortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(sortType, "");
        initPair();
        this.changeSort = sortType;
    }

    public final boolean needSort() {
        SortTextView.SortType sortType = this.priceSort;
        SortTextView.SortType sortType2 = SortTextView.SortType.NONE;
        return (sortType == sortType2 && this.changeSort == sortType2) ? false : true;
    }

    public final boolean isPriceSort() {
        return this.priceSort != SortTextView.SortType.NONE;
    }
}
