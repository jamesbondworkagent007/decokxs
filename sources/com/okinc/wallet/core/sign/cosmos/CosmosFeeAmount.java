package com.okinc.wallet.core.sign.cosmos;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class CosmosFeeAmount {
    public static final int $stable = 8;
    private String amount;
    private String denom;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CosmosFeeAmount() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CosmosFeeAmount copy$default(CosmosFeeAmount cosmosFeeAmount, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cosmosFeeAmount.denom;
        }
        if ((i & 2) != 0) {
            str2 = cosmosFeeAmount.amount;
        }
        return cosmosFeeAmount.copy(str, str2);
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
    public final CosmosFeeAmount copy(String str, String str2) {
        return new CosmosFeeAmount(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CosmosFeeAmount)) {
            return false;
        }
        CosmosFeeAmount cosmosFeeAmount = (CosmosFeeAmount) obj;
        return Intrinsics.EZpvd((Object) this.denom, (Object) cosmosFeeAmount.denom) && Intrinsics.EZpvd((Object) this.amount, (Object) cosmosFeeAmount.amount);
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
    public int hashCode() {
        String str = this.denom;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.amount;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
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
    public String toString() {
        return "CosmosFeeAmount(denom=" + this.denom + ", amount=" + this.amount + ")";
    }

    public CosmosFeeAmount(String str, String str2) {
        this.denom = str;
        this.amount = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:61) call: com.okinc.wallet.core.sign.cosmos.CosmosFeeAmount.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CosmosFeeAmount(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
