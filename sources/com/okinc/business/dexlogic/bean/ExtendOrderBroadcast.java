package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class ExtendOrderBroadcast {
    public static final int $stable = 8;
    private final String bizType;
    private final String orderId;
    private final UpdateMultiOrderInfo updateMultiOrderInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ExtendOrderBroadcast() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ExtendOrderBroadcast copy$default(ExtendOrderBroadcast extendOrderBroadcast, String str, UpdateMultiOrderInfo updateMultiOrderInfo, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = extendOrderBroadcast.orderId;
        }
        if ((i & 2) != 0) {
            updateMultiOrderInfo = extendOrderBroadcast.updateMultiOrderInfo;
        }
        if ((i & 4) != 0) {
            str2 = extendOrderBroadcast.bizType;
        }
        return extendOrderBroadcast.copy(str, updateMultiOrderInfo, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpdateMultiOrderInfo component2() {
        return this.updateMultiOrderInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExtendOrderBroadcast copy(@NotNull String str, UpdateMultiOrderInfo updateMultiOrderInfo, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ExtendOrderBroadcast(str, updateMultiOrderInfo, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendOrderBroadcast)) {
            return false;
        }
        ExtendOrderBroadcast extendOrderBroadcast = (ExtendOrderBroadcast) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) extendOrderBroadcast.orderId) && Intrinsics.EZpvd(this.updateMultiOrderInfo, extendOrderBroadcast.updateMultiOrderInfo) && Intrinsics.EZpvd((Object) this.bizType, (Object) extendOrderBroadcast.bizType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpdateMultiOrderInfo getUpdateMultiOrderInfo() {
        return this.updateMultiOrderInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.orderId.hashCode();
        UpdateMultiOrderInfo updateMultiOrderInfo = this.updateMultiOrderInfo;
        int iHashCode2 = updateMultiOrderInfo == null ? 0 : updateMultiOrderInfo.hashCode();
        String str = this.bizType;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ExtendOrderBroadcast(orderId=" + this.orderId + ", updateMultiOrderInfo=" + this.updateMultiOrderInfo + ", bizType=" + this.bizType + ")";
    }

    public ExtendOrderBroadcast(@NotNull String str, UpdateMultiOrderInfo updateMultiOrderInfo, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderId = str;
        this.updateMultiOrderInfo = updateMultiOrderInfo;
        this.bizType = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.UpdateMultiOrderInfo:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.UpdateMultiOrderInfo) : (r3v0 com.okinc.business.dexlogic.bean.UpdateMultiOrderInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.business.dexlogic.bean.UpdateMultiOrderInfo, java.lang.String):void (m)] (LINE:2290) call: com.okinc.business.dexlogic.bean.ExtendOrderBroadcast.<init>(java.lang.String, com.okinc.business.dexlogic.bean.UpdateMultiOrderInfo, java.lang.String):void type: THIS */
    public /* synthetic */ ExtendOrderBroadcast(String str, UpdateMultiOrderInfo updateMultiOrderInfo, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : updateMultiOrderInfo, (i & 4) != 0 ? null : str2);
    }
}
