package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class AAApprovalInfo {
    public static final int $stable = 8;
    private String approvalAddress;
    private String approvalNum;
    private Integer status;
    private String tokenAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AAApprovalInfo() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AAApprovalInfo copy$default(AAApprovalInfo aAApprovalInfo, Integer num, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = aAApprovalInfo.status;
        }
        if ((i & 2) != 0) {
            str = aAApprovalInfo.approvalNum;
        }
        if ((i & 4) != 0) {
            str2 = aAApprovalInfo.tokenAddress;
        }
        if ((i & 8) != 0) {
            str3 = aAApprovalInfo.approvalAddress;
        }
        return aAApprovalInfo.copy(num, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.approvalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.approvalAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AAApprovalInfo copy(Integer num, String str, String str2, String str3) {
        return new AAApprovalInfo(num, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AAApprovalInfo)) {
            return false;
        }
        AAApprovalInfo aAApprovalInfo = (AAApprovalInfo) obj;
        return Intrinsics.EZpvd(this.status, aAApprovalInfo.status) && Intrinsics.EZpvd((Object) this.approvalNum, (Object) aAApprovalInfo.approvalNum) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) aAApprovalInfo.tokenAddress) && Intrinsics.EZpvd((Object) this.approvalAddress, (Object) aAApprovalInfo.approvalAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApprovalAddress() {
        return this.approvalAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApprovalNum() {
        return this.approvalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.status;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.approvalNum;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.tokenAddress;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.approvalAddress;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApprovalAddress(String str) {
        this.approvalAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApprovalNum(String str) {
        this.approvalNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(Integer num) {
        this.status = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenAddress(String str) {
        this.tokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AAApprovalInfo(status=" + this.status + ", approvalNum=" + this.approvalNum + ", tokenAddress=" + this.tokenAddress + ", approvalAddress=" + this.approvalAddress + ")";
    }

    public AAApprovalInfo(Integer num, String str, String str2, String str3) {
        this.status = num;
        this.approvalNum = str;
        this.tokenAddress = str2;
        this.approvalAddress = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1318) call: com.okinc.business.defi.biz.net.bean.AAApprovalInfo.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AAApprovalInfo(Integer num, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
