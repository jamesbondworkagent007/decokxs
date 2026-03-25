package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jBE {
    public static final int $stable = 8;

    @SerializedName("chain")
    private final java.util.List<jBG> chain;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public jBE() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jBE */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ jBE copy$default(jBE jbe, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = jbe.chain;
        }
        return jbe.AEQbTJ(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jBE AEQbTJ(@NotNull java.util.List<jBG> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new jBE(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<jBG> KWHzl() {
        return this.chain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jBE) && Intrinsics.EZpvd(this.chain, ((jBE) obj).chain);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.chain.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LeaderBoardMetaData(chain=" + this.chain + ")";
    }

    public jBE(@NotNull java.util.List<jBG> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.chain = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:21)) : (r1v0 java.util.List))
 A[MD:(java.util.List<o.jBG>):void (m)] (LINE:19) call: o.jBE.<init>(java.util.List):void type: THIS */
    public /* synthetic */ jBE(java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }
}
