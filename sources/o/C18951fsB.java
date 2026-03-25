package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.fsB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18951fsB {
    public final float EZpvd;
    public final float copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C18951fsB copy$default(C18951fsB c18951fsB, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = c18951fsB.copydefault;
        }
        if ((i & 2) != 0) {
            f2 = c18951fsB.EZpvd;
        }
        return c18951fsB.EZpvd(f, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18951fsB EZpvd(float f, float f2) {
        return new C18951fsB(f, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18951fsB)) {
            return false;
        }
        C18951fsB c18951fsB = (C18951fsB) obj;
        return java.lang.Float.compare(this.copydefault, c18951fsB.copydefault) == 0 && java.lang.Float.compare(this.EZpvd, c18951fsB.EZpvd) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Float.hashCode(this.copydefault) * 31) + java.lang.Float.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WalletSearchSpaceUiModel(spaceHeight=" + this.copydefault + ", spaceWidth=" + this.EZpvd + ")";
    }

    public C18951fsB(float f, float f2) {
        this.copydefault = f;
        this.EZpvd = f2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 float)
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (20.0f float) : (r2v0 float))
 A[MD:(float, float):void (m)] (LINE:3) call: o.fsB.<init>(float, float):void type: THIS */
    public /* synthetic */ C18951fsB(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, (i & 2) != 0 ? 20.0f : f2);
    }
}
