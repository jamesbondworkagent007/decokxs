package com.okinc.business.defi.biz.core.scan;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class EnCodeResult {
    public static final int $stable = 8;
    private final Object data;
    private String msg;
    private final boolean parsed;
    private boolean success;
    private final int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EnCodeResult copy$default(EnCodeResult enCodeResult, boolean z, boolean z2, String str, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            z = enCodeResult.parsed;
        }
        if ((i2 & 2) != 0) {
            z2 = enCodeResult.success;
        }
        boolean z3 = z2;
        if ((i2 & 4) != 0) {
            str = enCodeResult.msg;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            i = enCodeResult.type;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            obj = enCodeResult.data;
        }
        return enCodeResult.copy(z, z3, str2, i3, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.parsed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.success;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object component5() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EnCodeResult copy(boolean z, boolean z2, @NotNull String str, int i, Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        return new EnCodeResult(z, z2, str, i, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnCodeResult)) {
            return false;
        }
        EnCodeResult enCodeResult = (EnCodeResult) obj;
        return this.parsed == enCodeResult.parsed && this.success == enCodeResult.success && Intrinsics.EZpvd((Object) this.msg, (Object) enCodeResult.msg) && this.type == enCodeResult.type && Intrinsics.EZpvd(this.data, enCodeResult.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getParsed() {
        return this.parsed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.parsed);
        int iHashCode2 = Boolean.hashCode(this.success);
        int iHashCode3 = this.msg.hashCode();
        int iHashCode4 = Integer.hashCode(this.type);
        Object obj = this.data;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (obj == null ? 0 : obj.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.msg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSuccess(boolean z) {
        this.success = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EnCodeResult(parsed=" + this.parsed + ", success=" + this.success + ", msg=" + this.msg + ", type=" + this.type + ", data=" + this.data + ")";
    }

    public EnCodeResult(boolean z, boolean z2, @NotNull String str, int i, Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        this.parsed = z;
        this.success = z2;
        this.msg = str;
        this.type = i;
        this.data = obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (r7v0 boolean)
  (wrap:boolean:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:java.lang.String:0x000c: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:int:0x0012: TERNARY null = ((wrap:int:0x000d: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r10v0 int))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0013: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r11v0 java.lang.Object))
 A[MD:(boolean, boolean, java.lang.String, int, java.lang.Object):void (m)] (LINE:12) call: com.okinc.business.defi.biz.core.scan.EnCodeResult.<init>(boolean, boolean, java.lang.String, int, java.lang.Object):void type: THIS */
    public /* synthetic */ EnCodeResult(boolean z, boolean z2, String str, int i, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? null : obj);
    }
}
