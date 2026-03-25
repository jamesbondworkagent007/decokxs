package o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jBB {
    public static final int $stable = 8;

    @SerializedName(TtmlNode.END)
    private final int end;

    @SerializedName("meta")
    private final jBE meta;

    @SerializedName("rows")
    private final java.util.List<C25669jBz> rows;

    @SerializedName(TtmlNode.START)
    private final int start;

    @SerializedName("total")
    private final int total;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public jBB() {
        this(0, 0, 0, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.jBB */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ jBB copy$default(jBB jbb, int i, int i2, int i3, jBE jbe, java.util.List list, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = jbb.start;
        }
        if ((i4 & 2) != 0) {
            i2 = jbb.end;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = jbb.total;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            jbe = jbb.meta;
        }
        jBE jbe2 = jbe;
        if ((i4 & 16) != 0) {
            list = jbb.rows;
        }
        return jbb.OLrzqt(i, i5, i6, jbe2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.start;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C25669jBz> EZpvd() {
        return this.rows;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.end;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jBB OLrzqt(int i, int i2, int i3, jBE jbe, @NotNull java.util.List<C25669jBz> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new jBB(i, i2, i3, jbe, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jBE copydefault() {
        return this.meta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jBB)) {
            return false;
        }
        jBB jbb = (jBB) obj;
        return this.start == jbb.start && this.end == jbb.end && this.total == jbb.total && Intrinsics.EZpvd(this.meta, jbb.meta) && Intrinsics.EZpvd(this.rows, jbb.rows);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.start);
        int iHashCode2 = java.lang.Integer.hashCode(this.end);
        int iHashCode3 = java.lang.Integer.hashCode(this.total);
        jBE jbe = this.meta;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (jbe == null ? 0 : jbe.hashCode())) * 31) + this.rows.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LeaderBoardContent(start=" + this.start + ", end=" + this.end + ", total=" + this.total + ", meta=" + this.meta + ", rows=" + this.rows + ")";
    }

    public jBB(int i, int i2, int i3, jBE jbe, @NotNull java.util.List<C25669jBz> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.start = i;
        this.end = i2;
        this.total = i3;
        this.meta = jbe;
        this.rows = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r6v0 int) : (0 int))
  (wrap:o.jBE:0x001a: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null o.jBE) : (r7v0 o.jBE))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001b: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x001f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:16)) : (r8v0 java.util.List))
 A[MD:(int, int, int, o.jBE, java.util.List<o.jBz>):void (m)] (LINE:6) call: o.jBB.<init>(int, int, int, o.jBE, java.util.List):void type: THIS */
    public /* synthetic */ jBB(int i, int i2, int i3, jBE jbe, java.util.List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) == 0 ? i3 : 0, (i4 & 8) != 0 ? null : jbe, (i4 & 16) != 0 ? yDY.AhwBna() : list);
    }
}
