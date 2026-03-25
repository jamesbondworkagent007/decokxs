package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.AwO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3987AwO {
    public static final int $stable = 8;
    public int AEQbTJ;
    public boolean AYXKKw;
    public boolean AhwBna;
    public byte AkhnZx;
    public int EZpvd;
    public int KWHzl;
    public boolean OLrzqt;
    public byte copydefault;
    public float djBIcL;
    public boolean gEmmrt;
    public byte isConnected;
    public int valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 byte)
  (r2v0 boolean)
  (r3v0 int)
  (r4v0 boolean)
  (r5v0 float)
  (r6v0 boolean)
  (r7v0 byte)
  (r8v0 byte)
  (r9v0 boolean)
  (r10v0 int)
  (r11v0 int)
  (r12v0 int)
 A[MD:(byte, boolean, int, boolean, float, boolean, byte, byte, boolean, int, int, int):void (m)] call: o.AwO.<init>(byte, boolean, int, boolean, float, boolean, byte, byte, boolean, int, int, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C3987AwO(byte b, boolean z, int i, boolean z2, float f, boolean z3, byte b2, byte b3, boolean z4, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(b, z, i, z2, f, z3, b2, b3, z4, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte AkhnZx() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte DbNXlk() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3987AwO OLrzqt(byte b, boolean z, int i, boolean z2, float f, boolean z3, byte b2, byte b3, boolean z4, int i2, int i3, int i4) {
        return new C3987AwO(b, z, i, z2, f, z3, b2, b3, z4, i2, i3, i4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3987AwO)) {
            return false;
        }
        C3987AwO c3987AwO = (C3987AwO) obj;
        return this.copydefault == c3987AwO.copydefault && this.OLrzqt == c3987AwO.OLrzqt && this.KWHzl == c3987AwO.KWHzl && this.AYXKKw == c3987AwO.AYXKKw && java.lang.Float.compare(this.djBIcL, c3987AwO.djBIcL) == 0 && this.AhwBna == c3987AwO.AhwBna && this.AkhnZx == c3987AwO.AkhnZx && this.isConnected == c3987AwO.isConnected && this.gEmmrt == c3987AwO.gEmmrt && this.AEQbTJ == c3987AwO.AEQbTJ && this.EZpvd == c3987AwO.EZpvd && this.valueOf == c3987AwO.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((C56393yDs.EZpvd(this.copydefault) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + C56395yDu.KWHzl(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.AYXKKw)) * 31) + java.lang.Float.hashCode(this.djBIcL)) * 31) + java.lang.Boolean.hashCode(this.AhwBna)) * 31) + C56393yDs.EZpvd(this.AkhnZx)) * 31) + C56393yDs.EZpvd(this.isConnected)) * 31) + java.lang.Boolean.hashCode(this.gEmmrt)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + C56395yDu.KWHzl(this.valueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GlareDetectionParams(brightnessThreshold=" + C56393yDs.AEQbTJ(this.copydefault) + ", blurEnabled=" + this.OLrzqt + ", blurKernelSize=" + C56395yDu.OLrzqt(this.KWHzl) + ", resizeEnabled=" + this.AYXKKw + ", resizeScale=" + this.djBIcL + ", saturationEnabled=" + this.AhwBna + ", saturationMin=" + C56393yDs.AEQbTJ(this.AkhnZx) + ", saturationMax=" + C56393yDs.AEQbTJ(this.isConnected) + ", morphologicalEnabled=" + this.gEmmrt + ", erosionSize=" + this.AEQbTJ + ", dilationSize=" + this.EZpvd + ", glareThreshold=" + C56395yDu.OLrzqt(this.valueOf) + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.AhwBna;
    }

    public C3987AwO(byte b, boolean z, int i, boolean z2, float f, boolean z3, byte b2, byte b3, boolean z4, int i2, int i3, int i4) {
        this.copydefault = b;
        this.OLrzqt = z;
        this.KWHzl = i;
        this.AYXKKw = z2;
        this.djBIcL = f;
        this.AhwBna = z3;
        this.AkhnZx = b2;
        this.isConnected = b3;
        this.gEmmrt = z4;
        this.AEQbTJ = i2;
        this.EZpvd = i3;
        this.valueOf = i4;
    }
}
