package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xqp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55804xqp<T> {
    public final java.lang.String EZpvd;
    public final T KWHzl;
    public final java.lang.Boolean OLrzqt;
    public final InterfaceC55705xow copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC55705xow KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T copydefault() {
        return this.KWHzl;
    }

    public C55804xqp(@NotNull java.lang.String str, T t, InterfaceC55705xow interfaceC55705xow, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        this.KWHzl = t;
        this.copydefault = interfaceC55705xow;
        this.OLrzqt = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.Object)
  (wrap:o.xow:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.xow) : (r3v0 o.xow))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0009: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r4v0 java.lang.Boolean))
 A[MD:(java.lang.String, T, o.xow, java.lang.Boolean):void (m)] (LINE:5) call: o.xqp.<init>(java.lang.String, java.lang.Object, o.xow, java.lang.Boolean):void type: THIS */
    public /* synthetic */ C55804xqp(java.lang.String str, java.lang.Object obj, InterfaceC55705xow interfaceC55705xow, java.lang.Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, obj, (i & 4) != 0 ? null : interfaceC55705xow, (i & 8) != 0 ? java.lang.Boolean.FALSE : bool);
    }
}
