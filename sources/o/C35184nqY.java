package o;

import com.google.gson.annotations.SerializedName;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.nqY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C35184nqY {

    @SerializedName(OtcExtraKeys.AUTOMATED_MESSAGE)
    private final boolean automatedMessage;

    @SerializedName("c2cOrderId")
    private final long c2cOrderId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C35184nqY() {
        this(false, 0L, 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C35184nqY copy$default(C35184nqY c35184nqY, boolean z, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c35184nqY.automatedMessage;
        }
        if ((i & 2) != 0) {
            j = c35184nqY.c2cOrderId;
        }
        return c35184nqY.KWHzl(z, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35184nqY KWHzl(boolean z, long j) {
        return new C35184nqY(z, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.automatedMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35184nqY)) {
            return false;
        }
        C35184nqY c35184nqY = (C35184nqY) obj;
        return this.automatedMessage == c35184nqY.automatedMessage && this.c2cOrderId == c35184nqY.c2cOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.automatedMessage) * 31) + java.lang.Long.hashCode(this.c2cOrderId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AutomatedMessageBean(automatedMessage=" + this.automatedMessage + ", c2cOrderId=" + this.c2cOrderId + ")";
    }

    public C35184nqY(boolean z, long j) {
        this.automatedMessage = z;
        this.c2cOrderId = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r2v0 long))
 A[MD:(boolean, long):void (m)] (LINE:5) call: o.nqY.<init>(boolean, long):void type: THIS */
    public /* synthetic */ C35184nqY(boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0L : j);
    }
}
