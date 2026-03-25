package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.nrh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C35246nrh {

    @SerializedName("isAutoReply")
    private final boolean isAutoReply;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C35246nrh() {
        this(false, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C35246nrh copy$default(C35246nrh c35246nrh, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c35246nrh.isAutoReply;
        }
        return c35246nrh.AEQbTJ(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35246nrh AEQbTJ(boolean z) {
        return new C35246nrh(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.isAutoReply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35246nrh) && this.isAutoReply == ((C35246nrh) obj).isAutoReply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return java.lang.Boolean.hashCode(this.isAutoReply);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OKTextAutomatedMessageBean(isAutoReply=" + this.isAutoReply + ")";
    }

    public C35246nrh(boolean z) {
        this.isAutoReply = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:5) call: o.nrh.<init>(boolean):void type: THIS */
    public /* synthetic */ C35246nrh(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
