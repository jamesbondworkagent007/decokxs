package com.keystone.module;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class CashTx {
    private final int dustThreshold;
    private final long fee;
    private final ArrayList<CashInput> inputs;
    private final String memo;
    private final ArrayList<Output> outputs;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final int component5() {
        return this.dustThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.keystone.module.CashTx */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashTx copy$default(CashTx cashTx, ArrayList arrayList, ArrayList arrayList2, long j, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            arrayList = cashTx.inputs;
        }
        if ((i2 & 2) != 0) {
            arrayList2 = cashTx.outputs;
        }
        ArrayList arrayList3 = arrayList2;
        if ((i2 & 4) != 0) {
            j = cashTx.fee;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            str = cashTx.memo;
        }
        String str2 = str;
        if ((i2 & 16) != 0) {
            i = cashTx.dustThreshold;
        }
        return cashTx.copy(arrayList, arrayList3, j2, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<CashInput> component1() {
        return this.inputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Output> component2() {
        return this.outputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CashTx copy(@NotNull ArrayList<CashInput> arrayList, @NotNull ArrayList<Output> arrayList2, long j, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new CashTx(arrayList, arrayList2, j, str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashTx)) {
            return false;
        }
        CashTx cashTx = (CashTx) obj;
        return Intrinsics.EZpvd(this.inputs, cashTx.inputs) && Intrinsics.EZpvd(this.outputs, cashTx.outputs) && this.fee == cashTx.fee && Intrinsics.EZpvd((Object) this.memo, (Object) cashTx.memo) && this.dustThreshold == cashTx.dustThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<CashInput> getInputs() {
        return this.inputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMemo() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Output> getOutputs() {
        return this.outputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.inputs.hashCode() * 31) + this.outputs.hashCode()) * 31) + Long.hashCode(this.fee)) * 31) + this.memo.hashCode()) * 31) + Integer.hashCode(this.dustThreshold);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CashTx(inputs=" + this.inputs + ", outputs=" + this.outputs + ", fee=" + this.fee + ", memo=" + this.memo + ", dustThreshold=" + this.dustThreshold + ')';
    }

    public CashTx(@NotNull ArrayList<CashInput> arrayList, @NotNull ArrayList<Output> arrayList2, long j, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.inputs = arrayList;
        this.outputs = arrayList2;
        this.fee = j;
        this.memo = str;
        this.dustThreshold = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r8v0 java.util.ArrayList)
  (r9v0 java.util.ArrayList)
  (r10v0 long)
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0007: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (546 int) : (r13v0 int))
 A[MD:(java.util.ArrayList<com.keystone.module.CashInput>, java.util.ArrayList<com.keystone.module.Output>, long, java.lang.String, int):void (m)] (LINE:39) call: com.keystone.module.CashTx.<init>(java.util.ArrayList, java.util.ArrayList, long, java.lang.String, int):void type: THIS */
    public /* synthetic */ CashTx(ArrayList arrayList, ArrayList arrayList2, long j, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(arrayList, arrayList2, j, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? 546 : i);
    }
}
