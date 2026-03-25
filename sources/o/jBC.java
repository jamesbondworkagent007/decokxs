package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jBC {
    public static final int $stable = 8;

    @SerializedName("chains")
    private final java.util.List<java.lang.Integer> chains;

    @SerializedName("labels")
    private final java.util.Map<java.lang.String, java.util.List<jBA>> labels;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public jBC() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jBC */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ jBC copy$default(jBC jbc, java.util.List list, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = jbc.chains;
        }
        if ((i & 2) != 0) {
            map = jbc.labels;
        }
        return jbc.EZpvd(list, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jBC EZpvd(@NotNull java.util.List<java.lang.Integer> list, @NotNull java.util.Map<java.lang.String, ? extends java.util.List<jBA>> map) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new jBC(list, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.Integer> OLrzqt() {
        return this.chains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.util.List<jBA>> copydefault() {
        return this.labels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jBC)) {
            return false;
        }
        jBC jbc = (jBC) obj;
        return Intrinsics.EZpvd(this.chains, jbc.chains) && Intrinsics.EZpvd(this.labels, jbc.labels);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.chains.hashCode() * 31) + this.labels.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LeaderBoardConfigResponse(chains=" + this.chains + ", labels=" + this.labels + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.List<o.jBA>> */
    /* JADX WARN: Multi-variable type inference failed */
    public jBC(@NotNull java.util.List<java.lang.Integer> list, @NotNull java.util.Map<java.lang.String, ? extends java.util.List<jBA>> map) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.chains = list;
        this.labels = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:12)) : (r1v0 java.util.List))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x000c: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:14)) : (r2v0 java.util.Map))
 A[MD:(java.util.List<java.lang.Integer>, java.util.Map<java.lang.String, ? extends java.util.List<o.jBA>>):void (m)] (LINE:10) call: o.jBC.<init>(java.util.List, java.util.Map):void type: THIS */
    public /* synthetic */ jBC(java.util.List list, java.util.Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? C56424yEw.KWHzl() : map);
    }
}
