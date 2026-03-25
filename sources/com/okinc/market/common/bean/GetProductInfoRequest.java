package com.okinc.market.common.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class GetProductInfoRequest {
    public static final int $stable = 8;
    private final String coinIds;
    private final List<DexTokenItemListRequest> dexCoinParams;
    private final int includeType;
    private final String instIds;
    private final boolean shouldRemoveMargin;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GetProductInfoRequest() {
        this(0, null, null, false, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.market.common.bean.GetProductInfoRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetProductInfoRequest copy$default(GetProductInfoRequest getProductInfoRequest, int i, String str, String str2, boolean z, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = getProductInfoRequest.includeType;
        }
        if ((i2 & 2) != 0) {
            str = getProductInfoRequest.coinIds;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = getProductInfoRequest.instIds;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            z = getProductInfoRequest.shouldRemoveMargin;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            list = getProductInfoRequest.dexCoinParams;
        }
        return getProductInfoRequest.copy(i, str3, str4, z2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.includeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.coinIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.shouldRemoveMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexTokenItemListRequest> component5() {
        return this.dexCoinParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetProductInfoRequest copy(int i, String str, String str2, boolean z, List<DexTokenItemListRequest> list) {
        return new GetProductInfoRequest(i, str, str2, z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetProductInfoRequest)) {
            return false;
        }
        GetProductInfoRequest getProductInfoRequest = (GetProductInfoRequest) obj;
        return this.includeType == getProductInfoRequest.includeType && Intrinsics.EZpvd((Object) this.coinIds, (Object) getProductInfoRequest.coinIds) && Intrinsics.EZpvd((Object) this.instIds, (Object) getProductInfoRequest.instIds) && this.shouldRemoveMargin == getProductInfoRequest.shouldRemoveMargin && Intrinsics.EZpvd(this.dexCoinParams, getProductInfoRequest.dexCoinParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinIds() {
        return this.coinIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexTokenItemListRequest> getDexCoinParams() {
        return this.dexCoinParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIncludeType() {
        return this.includeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstIds() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShouldRemoveMargin() {
        return this.shouldRemoveMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.includeType);
        String str = this.coinIds;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.instIds;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int iHashCode4 = Boolean.hashCode(this.shouldRemoveMargin);
        List<DexTokenItemListRequest> list = this.dexCoinParams;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetProductInfoRequest(includeType=" + this.includeType + ", coinIds=" + this.coinIds + ", instIds=" + this.instIds + ", shouldRemoveMargin=" + this.shouldRemoveMargin + ", dexCoinParams=" + this.dexCoinParams + ")";
    }

    public GetProductInfoRequest(int i, String str, String str2, boolean z, List<DexTokenItemListRequest> list) {
        this.includeType = i;
        this.coinIds = str;
        this.instIds = str2;
        this.shouldRemoveMargin = z;
        this.dexCoinParams = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r5v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r8v0 boolean) : true)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r9v0 java.util.List))
 A[MD:(int, java.lang.String, java.lang.String, boolean, java.util.List<com.okinc.market.common.bean.DexTokenItemListRequest>):void (m)] (LINE:17) call: com.okinc.market.common.bean.GetProductInfoRequest.<init>(int, java.lang.String, java.lang.String, boolean, java.util.List):void type: THIS */
    public /* synthetic */ GetProductInfoRequest(int i, String str, String str2, boolean z, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) == 0 ? z : true, (i2 & 16) != 0 ? null : list);
    }
}
