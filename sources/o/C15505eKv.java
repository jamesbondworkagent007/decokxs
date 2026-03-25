package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eKv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C15505eKv {
    public java.lang.String EZpvd;
    public int KWHzl;
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C15505eKv copy$default(C15505eKv c15505eKv, int i, java.lang.String str, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c15505eKv.KWHzl;
        }
        if ((i2 & 2) != 0) {
            str = c15505eKv.EZpvd;
        }
        if ((i2 & 4) != 0) {
            z = c15505eKv.OLrzqt;
        }
        return c15505eKv.AEQbTJ(i, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C15505eKv AEQbTJ(int i, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C15505eKv(i, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15505eKv)) {
            return false;
        }
        C15505eKv c15505eKv = (C15505eKv) obj;
        return this.KWHzl == c15505eKv.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c15505eKv.EZpvd) && this.OLrzqt == c15505eKv.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.KWHzl) * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TradeType(index=" + this.KWHzl + ", title=" + this.EZpvd + ", isSelected=" + this.OLrzqt + ")";
    }

    public C15505eKv(int i, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = i;
        this.EZpvd = str;
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(int, java.lang.String, boolean):void (m)] (LINE:3) call: o.eKv.<init>(int, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ C15505eKv(int i, java.lang.String str, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? false : z);
    }
}
