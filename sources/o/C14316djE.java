package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.djE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14316djE {
    public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ;
    public final int KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt() {
        return this.AEQbTJ;
    }

    public C14316djE(java.util.Map<java.lang.String, java.lang.String> map, int i) {
        this.AEQbTJ = map;
        this.KWHzl = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.util.Map)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
 A[MD:(java.util.Map<java.lang.String, java.lang.String>, int):void (m)] (LINE:8) call: o.djE.<init>(java.util.Map, int):void type: THIS */
    public /* synthetic */ C14316djE(java.util.Map map, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i2 & 2) != 0 ? 0 : i);
    }
}
