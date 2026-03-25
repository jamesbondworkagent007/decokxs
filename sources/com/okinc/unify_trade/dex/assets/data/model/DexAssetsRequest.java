package com.okinc.unify_trade.dex.assets.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class DexAssetsRequest {
    public static final int $stable = 8;
    private boolean hideSmallBalance;
    private int pageNumber;
    private int pageSize;
    private String valuationUnit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexAssetsRequest copy$default(DexAssetsRequest dexAssetsRequest, boolean z, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = dexAssetsRequest.hideSmallBalance;
        }
        if ((i3 & 2) != 0) {
            i = dexAssetsRequest.pageNumber;
        }
        if ((i3 & 4) != 0) {
            i2 = dexAssetsRequest.pageSize;
        }
        if ((i3 & 8) != 0) {
            str = dexAssetsRequest.valuationUnit;
        }
        return dexAssetsRequest.copy(z, i, i2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.hideSmallBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.pageNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.valuationUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexAssetsRequest copy(boolean z, int i, int i2, String str) {
        return new DexAssetsRequest(z, i, i2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DexAssetsRequest)) {
            return false;
        }
        DexAssetsRequest dexAssetsRequest = (DexAssetsRequest) obj;
        return this.hideSmallBalance == dexAssetsRequest.hideSmallBalance && this.pageNumber == dexAssetsRequest.pageNumber && this.pageSize == dexAssetsRequest.pageSize && Intrinsics.EZpvd((Object) this.valuationUnit, (Object) dexAssetsRequest.valuationUnit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHideSmallBalance() {
        return this.hideSmallBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageNumber() {
        return this.pageNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuationUnit() {
        return this.valuationUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.hideSmallBalance);
        int iHashCode2 = Integer.hashCode(this.pageNumber);
        int iHashCode3 = Integer.hashCode(this.pageSize);
        String str = this.valuationUnit;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHideSmallBalance(boolean z) {
        this.hideSmallBalance = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPageNumber(int i) {
        this.pageNumber = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPageSize(int i) {
        this.pageSize = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValuationUnit(String str) {
        this.valuationUnit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexAssetsRequest(hideSmallBalance=" + this.hideSmallBalance + ", pageNumber=" + this.pageNumber + ", pageSize=" + this.pageSize + ", valuationUnit=" + this.valuationUnit + ")";
    }

    public DexAssetsRequest(boolean z, int i, int i2, String str) {
        this.hideSmallBalance = z;
        this.pageNumber = i;
        this.pageSize = i2;
        this.valuationUnit = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0011: INVOKE ("20") STATIC call: java.lang.Integer.parseInt(java.lang.String):int A[MD:(java.lang.String):int throws java.lang.NumberFormatException (c), WRAPPED] (LINE:13)) : (r4v0 int))
  (r5v0 java.lang.String)
 A[MD:(boolean, int, int, java.lang.String):void (m)] (LINE:9) call: com.okinc.unify_trade.dex.assets.data.model.DexAssetsRequest.<init>(boolean, int, int, java.lang.String):void type: THIS */
    public /* synthetic */ DexAssetsRequest(boolean z, int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? Integer.parseInt("20") : i2, str);
    }
}
