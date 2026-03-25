package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class NotOptionTitle {
    public static final int $stable = 8;
    private SortPair isSort;
    private final String title;
    private final String typeId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotOptionTitle() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NotOptionTitle copy$default(NotOptionTitle notOptionTitle, String str, SortPair sortPair, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notOptionTitle.title;
        }
        if ((i & 2) != 0) {
            sortPair = notOptionTitle.isSort;
        }
        if ((i & 4) != 0) {
            str2 = notOptionTitle.typeId;
        }
        return notOptionTitle.copy(str, sortPair, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SortPair component2() {
        return this.isSort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.typeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotOptionTitle copy(@NotNull String str, @NotNull SortPair sortPair, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(sortPair, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new NotOptionTitle(str, sortPair, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotOptionTitle)) {
            return false;
        }
        NotOptionTitle notOptionTitle = (NotOptionTitle) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) notOptionTitle.title) && Intrinsics.EZpvd(this.isSort, notOptionTitle.isSort) && Intrinsics.EZpvd((Object) this.typeId, (Object) notOptionTitle.typeId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTypeId() {
        return this.typeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.isSort.hashCode()) * 31) + this.typeId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SortPair isSort() {
        return this.isSort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSort(@NotNull SortPair sortPair) {
        Intrinsics.checkNotNullParameter(sortPair, "");
        this.isSort = sortPair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NotOptionTitle(title=" + this.title + ", isSort=" + this.isSort + ", typeId=" + this.typeId + ")";
    }

    public NotOptionTitle(@NotNull String str, @NotNull SortPair sortPair, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(sortPair, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.title = str;
        this.isSort = sortPair;
        this.typeId = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.SortPair:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.unify_trade.biz.SortPair:0x000f: CONSTRUCTOR 
  (null com.okinc.core.widget.SortTextView$SortType)
  (null com.okinc.core.widget.SortTextView$SortType)
  (3 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(com.okinc.core.widget.SortTextView$SortType, com.okinc.core.widget.SortTextView$SortType, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:53) call: com.okinc.unify_trade.biz.SortPair.<init>(com.okinc.core.widget.SortTextView$SortType, com.okinc.core.widget.SortTextView$SortType, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r4v0 com.okinc.unify_trade.biz.SortPair))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.unify_trade.biz.SortPair, java.lang.String):void (m)] (LINE:53) call: com.okinc.unify_trade.biz.NotOptionTitle.<init>(java.lang.String, com.okinc.unify_trade.biz.SortPair, java.lang.String):void type: THIS */
    public /* synthetic */ NotOptionTitle(String str, SortPair sortPair, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new SortPair(null, null, 3, null) : sortPair, (i & 4) != 0 ? "" : str2);
    }
}
