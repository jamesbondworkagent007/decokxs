package com.okinc.assets.backend.api.model.tax.receivedasset;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;

/* JADX INFO: loaded from: classes22.dex */
public final class ReceivedAssetFilterResponse {
    public static final int $stable = 8;
    private final List<ReceivedAssetItem> assets;
    private final Integer totalAssets;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ReceivedAssetFilterResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.backend.api.model.tax.receivedasset.ReceivedAssetFilterResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReceivedAssetFilterResponse copy$default(ReceivedAssetFilterResponse receivedAssetFilterResponse, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = receivedAssetFilterResponse.assets;
        }
        if ((i & 2) != 0) {
            num = receivedAssetFilterResponse.totalAssets;
        }
        return receivedAssetFilterResponse.copy(list, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReceivedAssetItem> component1() {
        return this.assets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.totalAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReceivedAssetFilterResponse copy(List<ReceivedAssetItem> list, Integer num) {
        return new ReceivedAssetFilterResponse(list, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReceivedAssetFilterResponse)) {
            return false;
        }
        ReceivedAssetFilterResponse receivedAssetFilterResponse = (ReceivedAssetFilterResponse) obj;
        return Intrinsics.EZpvd(this.assets, receivedAssetFilterResponse.assets) && Intrinsics.EZpvd(this.totalAssets, receivedAssetFilterResponse.totalAssets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReceivedAssetItem> getAssets() {
        return this.assets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTotalAssets() {
        return this.totalAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<ReceivedAssetItem> list = this.assets;
        int iHashCode = list == null ? 0 : list.hashCode();
        Integer num = this.totalAssets;
        return (iHashCode * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReceivedAssetFilterResponse(assets=" + this.assets + ", totalAssets=" + this.totalAssets + ")";
    }

    public ReceivedAssetFilterResponse(List<ReceivedAssetItem> list, Integer num) {
        this.assets = list;
        this.totalAssets = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r1v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 java.lang.Integer))
 A[MD:(java.util.List<com.okinc.assets.backend.api.model.tax.receivedasset.ReceivedAssetItem>, java.lang.Integer):void (m)] (LINE:12) call: com.okinc.assets.backend.api.model.tax.receivedasset.ReceivedAssetFilterResponse.<init>(java.util.List, java.lang.Integer):void type: THIS */
    public /* synthetic */ ReceivedAssetFilterResponse(List list, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? 0 : num);
    }
}
