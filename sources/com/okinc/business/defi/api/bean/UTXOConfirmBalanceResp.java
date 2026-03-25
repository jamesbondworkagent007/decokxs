package com.okinc.business.defi.api.bean;

import java.math.BigInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class UTXOConfirmBalanceResp {
    public static final int $stable = 8;
    private BigInteger confirmed;
    private BigInteger total;
    private BigInteger unconfirmed;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UTXOConfirmBalanceResp() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UTXOConfirmBalanceResp copy$default(UTXOConfirmBalanceResp uTXOConfirmBalanceResp, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, Object obj) {
        if ((i & 1) != 0) {
            bigInteger = uTXOConfirmBalanceResp.confirmed;
        }
        if ((i & 2) != 0) {
            bigInteger2 = uTXOConfirmBalanceResp.unconfirmed;
        }
        if ((i & 4) != 0) {
            bigInteger3 = uTXOConfirmBalanceResp.total;
        }
        return uTXOConfirmBalanceResp.copy(bigInteger, bigInteger2, bigInteger3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigInteger component1() {
        return this.confirmed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigInteger component2() {
        return this.unconfirmed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigInteger component3() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UTXOConfirmBalanceResp copy(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return new UTXOConfirmBalanceResp(bigInteger, bigInteger2, bigInteger3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UTXOConfirmBalanceResp)) {
            return false;
        }
        UTXOConfirmBalanceResp uTXOConfirmBalanceResp = (UTXOConfirmBalanceResp) obj;
        return Intrinsics.EZpvd(this.confirmed, uTXOConfirmBalanceResp.confirmed) && Intrinsics.EZpvd(this.unconfirmed, uTXOConfirmBalanceResp.unconfirmed) && Intrinsics.EZpvd(this.total, uTXOConfirmBalanceResp.total);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigInteger getConfirmed() {
        return this.confirmed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigInteger getTotal() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigInteger getUnconfirmed() {
        return this.unconfirmed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        BigInteger bigInteger = this.confirmed;
        int iHashCode = bigInteger == null ? 0 : bigInteger.hashCode();
        BigInteger bigInteger2 = this.unconfirmed;
        int iHashCode2 = bigInteger2 == null ? 0 : bigInteger2.hashCode();
        BigInteger bigInteger3 = this.total;
        return (((iHashCode * 31) + iHashCode2) * 31) + (bigInteger3 != null ? bigInteger3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConfirmed(BigInteger bigInteger) {
        this.confirmed = bigInteger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotal(BigInteger bigInteger) {
        this.total = bigInteger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnconfirmed(BigInteger bigInteger) {
        this.unconfirmed = bigInteger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UTXOConfirmBalanceResp(confirmed=" + this.confirmed + ", unconfirmed=" + this.unconfirmed + ", total=" + this.total + ")";
    }

    public UTXOConfirmBalanceResp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.confirmed = bigInteger;
        this.unconfirmed = bigInteger2;
        this.total = bigInteger3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.math.BigInteger:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigInteger) : (r2v0 java.math.BigInteger))
  (wrap:java.math.BigInteger:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigInteger) : (r3v0 java.math.BigInteger))
  (wrap:java.math.BigInteger:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.math.BigInteger) : (r4v0 java.math.BigInteger))
 A[MD:(java.math.BigInteger, java.math.BigInteger, java.math.BigInteger):void (m)] (LINE:485) call: com.okinc.business.defi.api.bean.UTXOConfirmBalanceResp.<init>(java.math.BigInteger, java.math.BigInteger, java.math.BigInteger):void type: THIS */
    public /* synthetic */ UTXOConfirmBalanceResp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bigInteger, (i & 2) != 0 ? null : bigInteger2, (i & 4) != 0 ? null : bigInteger3);
    }
}
