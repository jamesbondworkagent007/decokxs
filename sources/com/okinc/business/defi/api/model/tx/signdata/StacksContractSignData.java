package com.okinc.business.defi.api.model.tx.signdata;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class StacksContractSignData extends ContractSignData {
    public static final int $stable = 0;
    private final String from;
    private final String to;
    private final String txOptions;
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StacksContractSignData() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StacksContractSignData copy$default(StacksContractSignData stacksContractSignData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stacksContractSignData.from;
        }
        if ((i & 2) != 0) {
            str2 = stacksContractSignData.to;
        }
        if ((i & 4) != 0) {
            str3 = stacksContractSignData.value;
        }
        if ((i & 8) != 0) {
            str4 = stacksContractSignData.txOptions;
        }
        return stacksContractSignData.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.txOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StacksContractSignData copy(String str, String str2, String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str4, "");
        return new StacksContractSignData(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StacksContractSignData)) {
            return false;
        }
        StacksContractSignData stacksContractSignData = (StacksContractSignData) obj;
        return Intrinsics.EZpvd((Object) this.from, (Object) stacksContractSignData.from) && Intrinsics.EZpvd((Object) this.to, (Object) stacksContractSignData.to) && Intrinsics.EZpvd((Object) this.value, (Object) stacksContractSignData.value) && Intrinsics.EZpvd((Object) this.txOptions, (Object) stacksContractSignData.txOptions);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxOptions() {
        return this.txOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.from;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.to;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.value;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.txOptions.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StacksContractSignData(from=" + this.from + ", to=" + this.to + ", value=" + this.value + ", txOptions=" + this.txOptions + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:350) call: com.okinc.business.defi.api.model.tx.signdata.StacksContractSignData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ StacksContractSignData(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StacksContractSignData(String str, String str2, String str3, @NotNull String str4) {
        super(null);
        Intrinsics.checkNotNullParameter(str4, "");
        this.from = str;
        this.to = str2;
        this.value = str3;
        this.txOptions = str4;
    }
}
