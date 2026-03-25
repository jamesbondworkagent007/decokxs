package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Serializable {
    public final java.lang.String AEQbTJ;
    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Serializable() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.Serializable */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Serializable copy$default(Serializable serializable, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = serializable.AEQbTJ;
        }
        if ((i & 2) != 0) {
            map = serializable.OLrzqt;
        }
        return serializable.KWHzl(str, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Serializable KWHzl(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new Serializable(str, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Serializable)) {
            return false;
        }
        Serializable serializable = (Serializable) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) serializable.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, serializable.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    public Serializable(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.AEQbTJ = str;
        this.OLrzqt = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0006: INVOKE (wrap:o.yDk:0x0004: SGET  A[WRAPPED] (LINE:169) o.yDk.KWHzl o.yDk) VIRTUAL call: o.yDk.toString():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:169)) : (r1v0 java.lang.String))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x000a: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x000e: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:171)) : (r2v0 java.util.Map))
 A[MD:(java.lang.String, java.util.Map<java.lang.String, java.lang.String>):void (m)] (LINE:168) call: o.Serializable.<init>(java.lang.String, java.util.Map):void type: THIS */
    public /* synthetic */ Serializable(java.lang.String str, java.util.Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C56385yDk.KWHzl.toString() : str, (i & 2) != 0 ? C56424yEw.KWHzl() : map);
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: 32, (wrap:java.lang.Object:CAST) */
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(Reader.AEQbTJ("lang", "kotlin", this.AEQbTJ));
        if (!this.OLrzqt.isEmpty()) {
            java.util.Map<java.lang.String, ? extends java.lang.String> mapAEQbTJ = PipedWriter.AEQbTJ(this.OLrzqt);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(' ');
            sb2.append((java.lang.Object) PipedWriter.copydefault(mapAEQbTJ));
            sb.append(sb2.toString());
        }
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
