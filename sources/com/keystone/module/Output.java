package com.keystone.module;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class Output {
    private final String address;
    private final String changeAddressPath;
    private final boolean isChange;
    private final long value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Output copy$default(Output output, String str, long j, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = output.address;
        }
        if ((i & 2) != 0) {
            j = output.value;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            z = output.isChange;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str2 = output.changeAddressPath;
        }
        return output.copy(str, j2, z2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.changeAddressPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Output copy(@NotNull String str, long j, boolean z, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new Output(str, j, z, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Output)) {
            return false;
        }
        Output output = (Output) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) output.address) && this.value == output.value && this.isChange == output.isChange && Intrinsics.EZpvd((Object) this.changeAddressPath, (Object) output.changeAddressPath);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeAddressPath() {
        return this.changeAddressPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public int hashCode() {
        int iHashCode = this.address.hashCode();
        int iHashCode2 = Long.hashCode(this.value);
        boolean z = this.isChange;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + r2) * 31) + this.changeAddressPath.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isChange() {
        return this.isChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Output(address=" + this.address + ", value=" + this.value + ", isChange=" + this.isChange + ", changeAddressPath=" + this.changeAddressPath + ')';
    }

    public Output(@NotNull String str, long j, boolean z, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.address = str;
        this.value = j;
        this.isChange = z;
        this.changeAddressPath = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 long)
  (wrap:boolean:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, long, boolean, java.lang.String):void (m)] (LINE:16) call: com.keystone.module.Output.<init>(java.lang.String, long, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ Output(String str, long j, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str2);
    }
}
