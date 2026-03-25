package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class PayMasterSignatureReq {
    public static final int $stable = 8;
    private Long chainId;
    private String paymaster;
    private String token;
    private UserOperation uop;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PayMasterSignatureReq() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PayMasterSignatureReq copy$default(PayMasterSignatureReq payMasterSignatureReq, Long l, String str, String str2, UserOperation userOperation, int i, Object obj) {
        if ((i & 1) != 0) {
            l = payMasterSignatureReq.chainId;
        }
        if ((i & 2) != 0) {
            str = payMasterSignatureReq.paymaster;
        }
        if ((i & 4) != 0) {
            str2 = payMasterSignatureReq.token;
        }
        if ((i & 8) != 0) {
            userOperation = payMasterSignatureReq.uop;
        }
        return payMasterSignatureReq.copy(l, str, str2, userOperation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.paymaster;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserOperation component4() {
        return this.uop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PayMasterSignatureReq copy(Long l, String str, String str2, UserOperation userOperation) {
        return new PayMasterSignatureReq(l, str, str2, userOperation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayMasterSignatureReq)) {
            return false;
        }
        PayMasterSignatureReq payMasterSignatureReq = (PayMasterSignatureReq) obj;
        return Intrinsics.EZpvd(this.chainId, payMasterSignatureReq.chainId) && Intrinsics.EZpvd((Object) this.paymaster, (Object) payMasterSignatureReq.paymaster) && Intrinsics.EZpvd((Object) this.token, (Object) payMasterSignatureReq.token) && Intrinsics.EZpvd(this.uop, payMasterSignatureReq.uop);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymaster() {
        return this.paymaster;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserOperation getUop() {
        return this.uop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.chainId;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.paymaster;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.token;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        UserOperation userOperation = this.uop;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (userOperation != null ? userOperation.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(Long l) {
        this.chainId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymaster(String str) {
        this.paymaster = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToken(String str) {
        this.token = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUop(UserOperation userOperation) {
        this.uop = userOperation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PayMasterSignatureReq(chainId=" + this.chainId + ", paymaster=" + this.paymaster + ", token=" + this.token + ", uop=" + this.uop + ")";
    }

    public PayMasterSignatureReq(Long l, String str, String str2, UserOperation userOperation) {
        this.chainId = l;
        this.paymaster = str;
        this.token = str2;
        this.uop = userOperation;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:com.okinc.business.defi.biz.net.bean.UserOperation:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.UserOperation) : (r5v0 com.okinc.business.defi.biz.net.bean.UserOperation))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, com.okinc.business.defi.biz.net.bean.UserOperation):void (m)] (LINE:1365) call: com.okinc.business.defi.biz.net.bean.PayMasterSignatureReq.<init>(java.lang.Long, java.lang.String, java.lang.String, com.okinc.business.defi.biz.net.bean.UserOperation):void type: THIS */
    public /* synthetic */ PayMasterSignatureReq(Long l, String str, String str2, UserOperation userOperation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : userOperation);
    }
}
