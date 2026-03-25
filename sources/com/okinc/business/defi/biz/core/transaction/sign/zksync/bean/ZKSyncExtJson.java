package com.okinc.business.defi.biz.core.transaction.sign.zksync.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ZKSyncExtJson {
    public static final int $stable = 0;
    private final Long serviceChargeCoinId;
    private final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ZKSyncExtJson copy$default(ZKSyncExtJson zKSyncExtJson, Long l, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            l = zKSyncExtJson.serviceChargeCoinId;
        }
        if ((i & 2) != 0) {
            str = zKSyncExtJson.type;
        }
        return zKSyncExtJson.copy(l, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.serviceChargeCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ZKSyncExtJson copy(Long l, String str) {
        return new ZKSyncExtJson(l, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZKSyncExtJson)) {
            return false;
        }
        ZKSyncExtJson zKSyncExtJson = (ZKSyncExtJson) obj;
        return Intrinsics.EZpvd(this.serviceChargeCoinId, zKSyncExtJson.serviceChargeCoinId) && Intrinsics.EZpvd((Object) this.type, (Object) zKSyncExtJson.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getServiceChargeCoinId() {
        return this.serviceChargeCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.serviceChargeCoinId;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.type;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ZKSyncExtJson(serviceChargeCoinId=" + this.serviceChargeCoinId + ", type=" + this.type + ")";
    }

    public ZKSyncExtJson(Long l, String str) {
        this.serviceChargeCoinId = l;
        this.type = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.Long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.String):void (m)] (LINE:37) call: com.okinc.business.defi.biz.core.transaction.sign.zksync.bean.ZKSyncExtJson.<init>(java.lang.Long, java.lang.String):void type: THIS */
    public /* synthetic */ ZKSyncExtJson(Long l, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, (i & 2) != 0 ? null : str);
    }
}
