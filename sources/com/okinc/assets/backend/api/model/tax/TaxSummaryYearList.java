package com.okinc.assets.backend.api.model.tax;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class TaxSummaryYearList {
    public static final int $stable = 8;
    private final List<Integer> yearList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TaxSummaryYearList() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.backend.api.model.tax.TaxSummaryYearList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaxSummaryYearList copy$default(TaxSummaryYearList taxSummaryYearList, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = taxSummaryYearList.yearList;
        }
        return taxSummaryYearList.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component1() {
        return this.yearList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TaxSummaryYearList copy(List<Integer> list) {
        return new TaxSummaryYearList(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TaxSummaryYearList) && Intrinsics.EZpvd(this.yearList, ((TaxSummaryYearList) obj).yearList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getYearList() {
        return this.yearList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<Integer> list = this.yearList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TaxSummaryYearList(yearList=" + this.yearList + ")";
    }

    public TaxSummaryYearList(List<Integer> list) {
        this.yearList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
 A[MD:(java.util.List<java.lang.Integer>):void (m)] (LINE:13) call: com.okinc.assets.backend.api.model.tax.TaxSummaryYearList.<init>(java.util.List):void type: THIS */
    public /* synthetic */ TaxSummaryYearList(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
