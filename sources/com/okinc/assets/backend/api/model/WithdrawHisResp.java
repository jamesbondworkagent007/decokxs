package com.okinc.assets.backend.api.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class WithdrawHisResp {
    public static final int $stable = 8;
    private String currentPage;
    private String pageLength;
    private String total;
    private List<WithdrawHis> withdrawHistory;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WithdrawHisResp() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.backend.api.model.WithdrawHisResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WithdrawHisResp copy$default(WithdrawHisResp withdrawHisResp, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = withdrawHisResp.total;
        }
        if ((i & 2) != 0) {
            str2 = withdrawHisResp.pageLength;
        }
        if ((i & 4) != 0) {
            str3 = withdrawHisResp.currentPage;
        }
        if ((i & 8) != 0) {
            list = withdrawHisResp.withdrawHistory;
        }
        return withdrawHisResp.copy(str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pageLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currentPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WithdrawHis> component4() {
        return this.withdrawHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawHisResp copy(String str, String str2, String str3, List<WithdrawHis> list) {
        return new WithdrawHisResp(str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WithdrawHisResp)) {
            return false;
        }
        WithdrawHisResp withdrawHisResp = (WithdrawHisResp) obj;
        return Intrinsics.EZpvd((Object) this.total, (Object) withdrawHisResp.total) && Intrinsics.EZpvd((Object) this.pageLength, (Object) withdrawHisResp.pageLength) && Intrinsics.EZpvd((Object) this.currentPage, (Object) withdrawHisResp.currentPage) && Intrinsics.EZpvd(this.withdrawHistory, withdrawHisResp.withdrawHistory);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentPage() {
        return this.currentPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPageLength() {
        return this.pageLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotal() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WithdrawHis> getWithdrawHistory() {
        return this.withdrawHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.total;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.pageLength;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.currentPage;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        List<WithdrawHis> list = this.withdrawHistory;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentPage(String str) {
        this.currentPage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPageLength(String str) {
        this.pageLength = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotal(String str) {
        this.total = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWithdrawHistory(List<WithdrawHis> list) {
        this.withdrawHistory = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawHisResp(total=" + this.total + ", pageLength=" + this.pageLength + ", currentPage=" + this.currentPage + ", withdrawHistory=" + this.withdrawHistory + ")";
    }

    public WithdrawHisResp(String str, String str2, String str3, List<WithdrawHis> list) {
        this.total = str;
        this.pageLength = str2;
        this.currentPage = str3;
        this.withdrawHistory = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.assets.backend.api.model.WithdrawHis>):void (m)] (LINE:9) call: com.okinc.assets.backend.api.model.WithdrawHisResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ WithdrawHisResp(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list);
    }
}
