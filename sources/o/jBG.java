package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jBG {
    public static final int $stable = 0;

    @SerializedName("cid")
    private final int cid;

    @SerializedName("ntp")
    private final java.lang.String ntp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public jBG() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ jBG copy$default(jBG jbg, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = jbg.cid;
        }
        if ((i2 & 2) != 0) {
            str = jbg.ntp;
        }
        return jbg.copydefault(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.ntp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jBG copydefault(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new jBG(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jBG)) {
            return false;
        }
        jBG jbg = (jBG) obj;
        return this.cid == jbg.cid && Intrinsics.EZpvd((java.lang.Object) this.ntp, (java.lang.Object) jbg.ntp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Integer.hashCode(this.cid) * 31) + this.ntp.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LeaderBoardMetadataChain(cid=" + this.cid + ", ntp=" + this.ntp + ")";
    }

    public jBG(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cid = i;
        this.ntp = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("0") : (r2v0 java.lang.String))
 A[MD:(int, java.lang.String):void (m)] (LINE:24) call: o.jBG.<init>(int, java.lang.String):void type: THIS */
    public /* synthetic */ jBG(int i, java.lang.String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "0" : str);
    }
}
