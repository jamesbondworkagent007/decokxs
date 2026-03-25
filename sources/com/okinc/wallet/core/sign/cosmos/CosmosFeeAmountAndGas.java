package com.okinc.wallet.core.sign.cosmos;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class CosmosFeeAmountAndGas {
    public static final int $stable = 8;
    private String amount;
    private String denom;
    private String gasLimit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CosmosFeeAmountAndGas() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CosmosFeeAmountAndGas copy$default(CosmosFeeAmountAndGas cosmosFeeAmountAndGas, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cosmosFeeAmountAndGas.denom;
        }
        if ((i & 2) != 0) {
            str2 = cosmosFeeAmountAndGas.amount;
        }
        if ((i & 4) != 0) {
            str3 = cosmosFeeAmountAndGas.gasLimit;
        }
        return cosmosFeeAmountAndGas.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.denom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CosmosFeeAmountAndGas copy(String str, String str2, String str3) {
        return new CosmosFeeAmountAndGas(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CosmosFeeAmountAndGas)) {
            return false;
        }
        CosmosFeeAmountAndGas cosmosFeeAmountAndGas = (CosmosFeeAmountAndGas) obj;
        return Intrinsics.EZpvd((Object) this.denom, (Object) cosmosFeeAmountAndGas.denom) && Intrinsics.EZpvd((Object) this.amount, (Object) cosmosFeeAmountAndGas.amount) && Intrinsics.EZpvd((Object) this.gasLimit, (Object) cosmosFeeAmountAndGas.gasLimit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDenom() {
        return this.denom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasLimit() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.denom;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.amount;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.gasLimit;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(String str) {
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDenom(String str) {
        this.denom = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasLimit(String str) {
        this.gasLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CosmosFeeAmountAndGas(denom=" + this.denom + ", amount=" + this.amount + ", gasLimit=" + this.gasLimit + ")";
    }

    public CosmosFeeAmountAndGas(String str, String str2, String str3) {
        this.denom = str;
        this.amount = str2;
        this.gasLimit = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:67) call: com.okinc.wallet.core.sign.cosmos.CosmosFeeAmountAndGas.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CosmosFeeAmountAndGas(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
