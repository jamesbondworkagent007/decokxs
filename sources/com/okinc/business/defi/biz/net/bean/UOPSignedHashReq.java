package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class UOPSignedHashReq {
    public static final int $stable = 8;
    private String aaAddress;
    private Long chainId;
    private Integer sigType;
    private UserOperation uop;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UOPSignedHashReq() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UOPSignedHashReq copy$default(UOPSignedHashReq uOPSignedHashReq, Long l, String str, Integer num, UserOperation userOperation, int i, Object obj) {
        if ((i & 1) != 0) {
            l = uOPSignedHashReq.chainId;
        }
        if ((i & 2) != 0) {
            str = uOPSignedHashReq.aaAddress;
        }
        if ((i & 4) != 0) {
            num = uOPSignedHashReq.sigType;
        }
        if ((i & 8) != 0) {
            userOperation = uOPSignedHashReq.uop;
        }
        return uOPSignedHashReq.copy(l, str, num, userOperation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.aaAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.sigType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserOperation component4() {
        return this.uop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UOPSignedHashReq copy(Long l, String str, Integer num, UserOperation userOperation) {
        return new UOPSignedHashReq(l, str, num, userOperation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UOPSignedHashReq)) {
            return false;
        }
        UOPSignedHashReq uOPSignedHashReq = (UOPSignedHashReq) obj;
        return Intrinsics.EZpvd(this.chainId, uOPSignedHashReq.chainId) && Intrinsics.EZpvd((Object) this.aaAddress, (Object) uOPSignedHashReq.aaAddress) && Intrinsics.EZpvd(this.sigType, uOPSignedHashReq.sigType) && Intrinsics.EZpvd(this.uop, uOPSignedHashReq.uop);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAaAddress() {
        return this.aaAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSigType() {
        return this.sigType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserOperation getUop() {
        return this.uop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.chainId;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.aaAddress;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.sigType;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        UserOperation userOperation = this.uop;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (userOperation != null ? userOperation.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAaAddress(String str) {
        this.aaAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(Long l) {
        this.chainId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSigType(Integer num) {
        this.sigType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUop(UserOperation userOperation) {
        this.uop = userOperation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UOPSignedHashReq(chainId=" + this.chainId + ", aaAddress=" + this.aaAddress + ", sigType=" + this.sigType + ", uop=" + this.uop + ")";
    }

    public UOPSignedHashReq(Long l, String str, Integer num, UserOperation userOperation) {
        this.chainId = l;
        this.aaAddress = str;
        this.sigType = num;
        this.uop = userOperation;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
  (wrap:com.okinc.business.defi.biz.net.bean.UserOperation:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.UserOperation) : (r5v0 com.okinc.business.defi.biz.net.bean.UserOperation))
 A[MD:(java.lang.Long, java.lang.String, java.lang.Integer, com.okinc.business.defi.biz.net.bean.UserOperation):void (m)] (LINE:1373) call: com.okinc.business.defi.biz.net.bean.UOPSignedHashReq.<init>(java.lang.Long, java.lang.String, java.lang.Integer, com.okinc.business.defi.biz.net.bean.UserOperation):void type: THIS */
    public /* synthetic */ UOPSignedHashReq(Long l, String str, Integer num, UserOperation userOperation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : userOperation);
    }
}
