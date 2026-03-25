package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class AAGasLimit {
    public static final int $stable = 8;
    private String callGasLimit;
    private String initGas;
    private String l1GasLimit;
    private String l1GasPrice;
    private String maxCallGasLimit;
    private final String paymasterPostOpGasLimit;
    private final String paymasterVerificationGasLimit;
    private String pmVerificationGasLimit;
    private String preVerificationGas;
    private String verificationGasLimit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AAGasLimit() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.initGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.l1GasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.preVerificationGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.verificationGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.pmVerificationGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.paymasterVerificationGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.paymasterPostOpGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.callGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.maxCallGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.l1GasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AAGasLimit copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        return new AAGasLimit(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AAGasLimit)) {
            return false;
        }
        AAGasLimit aAGasLimit = (AAGasLimit) obj;
        return Intrinsics.EZpvd((Object) this.initGas, (Object) aAGasLimit.initGas) && Intrinsics.EZpvd((Object) this.preVerificationGas, (Object) aAGasLimit.preVerificationGas) && Intrinsics.EZpvd((Object) this.verificationGasLimit, (Object) aAGasLimit.verificationGasLimit) && Intrinsics.EZpvd((Object) this.pmVerificationGasLimit, (Object) aAGasLimit.pmVerificationGasLimit) && Intrinsics.EZpvd((Object) this.paymasterVerificationGasLimit, (Object) aAGasLimit.paymasterVerificationGasLimit) && Intrinsics.EZpvd((Object) this.paymasterPostOpGasLimit, (Object) aAGasLimit.paymasterPostOpGasLimit) && Intrinsics.EZpvd((Object) this.callGasLimit, (Object) aAGasLimit.callGasLimit) && Intrinsics.EZpvd((Object) this.maxCallGasLimit, (Object) aAGasLimit.maxCallGasLimit) && Intrinsics.EZpvd((Object) this.l1GasLimit, (Object) aAGasLimit.l1GasLimit) && Intrinsics.EZpvd((Object) this.l1GasPrice, (Object) aAGasLimit.l1GasPrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallGasLimit() {
        return this.callGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitGas() {
        return this.initGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getL1GasLimit() {
        return this.l1GasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getL1GasPrice() {
        return this.l1GasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxCallGasLimit() {
        return this.maxCallGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymasterPostOpGasLimit() {
        return this.paymasterPostOpGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymasterVerificationGasLimit() {
        return this.paymasterVerificationGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPmVerificationGasLimit() {
        return this.pmVerificationGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreVerificationGas() {
        return this.preVerificationGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVerificationGasLimit() {
        return this.verificationGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.initGas;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.preVerificationGas;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.verificationGasLimit;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.pmVerificationGasLimit;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.paymasterVerificationGasLimit;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.paymasterPostOpGasLimit;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.callGasLimit;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.maxCallGasLimit;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.l1GasLimit;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.l1GasPrice;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str10 != null ? str10.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallGasLimit(String str) {
        this.callGasLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInitGas(String str) {
        this.initGas = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setL1GasLimit(String str) {
        this.l1GasLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setL1GasPrice(String str) {
        this.l1GasPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxCallGasLimit(String str) {
        this.maxCallGasLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPmVerificationGasLimit(String str) {
        this.pmVerificationGasLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPreVerificationGas(String str) {
        this.preVerificationGas = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVerificationGasLimit(String str) {
        this.verificationGasLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AAGasLimit(initGas=" + this.initGas + ", preVerificationGas=" + this.preVerificationGas + ", verificationGasLimit=" + this.verificationGasLimit + ", pmVerificationGasLimit=" + this.pmVerificationGasLimit + ", paymasterVerificationGasLimit=" + this.paymasterVerificationGasLimit + ", paymasterPostOpGasLimit=" + this.paymasterPostOpGasLimit + ", callGasLimit=" + this.callGasLimit + ", maxCallGasLimit=" + this.maxCallGasLimit + ", l1GasLimit=" + this.l1GasLimit + ", l1GasPrice=" + this.l1GasPrice + ")";
    }

    public AAGasLimit(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.initGas = str;
        this.preVerificationGas = str2;
        this.verificationGasLimit = str3;
        this.pmVerificationGasLimit = str4;
        this.paymasterVerificationGasLimit = str5;
        this.paymasterPostOpGasLimit = str6;
        this.callGasLimit = str7;
        this.maxCallGasLimit = str8;
        this.l1GasLimit = str9;
        this.l1GasPrice = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1351) call: com.okinc.business.defi.biz.net.bean.AAGasLimit.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AAGasLimit(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) == 0 ? str10 : null);
    }
}
