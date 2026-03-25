package com.okinc.wallet.core.sign.cosmos;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class CosmosFee {
    public static final int $stable = 8;
    private List<CosmosFeeAmount> amount;
    private String gas;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CosmosFee() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.wallet.core.sign.cosmos.CosmosFee */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CosmosFee copy$default(CosmosFee cosmosFee, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cosmosFee.gas;
        }
        if ((i & 2) != 0) {
            list = cosmosFee.amount;
        }
        return cosmosFee.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.gas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CosmosFeeAmount> component2() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CosmosFee copy(String str, List<CosmosFeeAmount> list) {
        return new CosmosFee(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CosmosFee)) {
            return false;
        }
        CosmosFee cosmosFee = (CosmosFee) obj;
        return Intrinsics.EZpvd((Object) this.gas, (Object) cosmosFee.gas) && Intrinsics.EZpvd(this.amount, cosmosFee.amount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CosmosFeeAmount> getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGas() {
        return this.gas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.gas;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<CosmosFeeAmount> list = this.amount;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(List<CosmosFeeAmount> list) {
        this.amount = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGas(String str) {
        this.gas = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CosmosFee(gas=" + this.gas + ", amount=" + this.amount + ")";
    }

    public CosmosFee(String str, List<CosmosFeeAmount> list) {
        this.gas = str;
        this.amount = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.wallet.core.sign.cosmos.CosmosFeeAmount>):void (m)] (LINE:55) call: com.okinc.wallet.core.sign.cosmos.CosmosFee.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ CosmosFee(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
