package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C52761wXj;

/* JADX INFO: renamed from: o.fgX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C18338fgX {
    public final int KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C18338fgX() {
        this(0, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C18338fgX copy$default(C18338fgX c18338fgX, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c18338fgX.KWHzl;
        }
        return c18338fgX.OLrzqt(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18338fgX OLrzqt(@androidx.annotation.ColorRes int i) {
        return new C18338fgX(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18338fgX) && this.KWHzl == ((C18338fgX) obj).KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return java.lang.Integer.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CloudBackupLineBean(color=" + this.KWHzl + ")";
    }

    public C18338fgX(@androidx.annotation.ColorRes int i) {
        this.KWHzl = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.wXj.Activity.zuBGHE int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:9) call: o.fgX.<init>(int):void type: THIS */
    public /* synthetic */ C18338fgX(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C52761wXj.Activity.zuBGHE : i);
    }
}
