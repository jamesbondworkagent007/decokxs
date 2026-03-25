package com.okinc.assets.backend.api.model;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class DepositHisResp {
    public static final int $stable = 8;
    private int currentPage;
    private int pageLength;
    private ArrayList<HistoryItem> rechargeHistory;
    private int total;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DepositHisResp() {
        this(0, 0, 0, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.backend.api.model.DepositHisResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DepositHisResp copy$default(DepositHisResp depositHisResp, int i, int i2, int i3, ArrayList arrayList, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = depositHisResp.total;
        }
        if ((i4 & 2) != 0) {
            i2 = depositHisResp.currentPage;
        }
        if ((i4 & 4) != 0) {
            i3 = depositHisResp.pageLength;
        }
        if ((i4 & 8) != 0) {
            arrayList = depositHisResp.rechargeHistory;
        }
        return depositHisResp.copy(i, i2, i3, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.currentPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.pageLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<HistoryItem> component4() {
        return this.rechargeHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DepositHisResp copy(int i, int i2, int i3, ArrayList<HistoryItem> arrayList) {
        return new DepositHisResp(i, i2, i3, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositHisResp)) {
            return false;
        }
        DepositHisResp depositHisResp = (DepositHisResp) obj;
        return this.total == depositHisResp.total && this.currentPage == depositHisResp.currentPage && this.pageLength == depositHisResp.pageLength && Intrinsics.EZpvd(this.rechargeHistory, depositHisResp.rechargeHistory);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageLength() {
        return this.pageLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<HistoryItem> getRechargeHistory() {
        return this.rechargeHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTotal() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.total);
        int iHashCode2 = Integer.hashCode(this.currentPage);
        int iHashCode3 = Integer.hashCode(this.pageLength);
        ArrayList<HistoryItem> arrayList = this.rechargeHistory;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (arrayList == null ? 0 : arrayList.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentPage(int i) {
        this.currentPage = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPageLength(int i) {
        this.pageLength = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRechargeHistory(ArrayList<HistoryItem> arrayList) {
        this.rechargeHistory = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotal(int i) {
        this.total = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DepositHisResp(total=" + this.total + ", currentPage=" + this.currentPage + ", pageLength=" + this.pageLength + ", rechargeHistory=" + this.rechargeHistory + ")";
    }

    public DepositHisResp(int i, int i2, int i3, ArrayList<HistoryItem> arrayList) {
        this.total = i;
        this.currentPage = i2;
        this.pageLength = i3;
        this.rechargeHistory = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r5v0 java.util.ArrayList))
 A[MD:(int, int, int, java.util.ArrayList<com.okinc.assets.backend.api.model.HistoryItem>):void (m)] (LINE:9) call: com.okinc.assets.backend.api.model.DepositHisResp.<init>(int, int, int, java.util.ArrayList):void type: THIS */
    public /* synthetic */ DepositHisResp(int i, int i2, int i3, ArrayList arrayList, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? null : arrayList);
    }
}
