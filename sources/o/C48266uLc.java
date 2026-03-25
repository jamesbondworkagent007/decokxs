package o;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.uLc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48266uLc {
    public final long AEQbTJ;
    public final long AYXKKw;
    public final long EZpvd;
    public final long KWHzl;
    public final long OLrzqt;
    public final long copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 long), (r3v0 long), (r5v0 long), (r7v0 long), (r9v0 long), (r11v0 long) A[MD:(long, long, long, long, long, long):void (m)] call: o.uLc.<init>(long, long, long, long, long, long):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C48266uLc(long j, long j2, long j3, long j4, long j5, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48266uLc OLrzqt(long j, long j2, long j3, long j4, long j5, long j6) {
        return new C48266uLc(j, j2, j3, j4, j5, j6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48266uLc)) {
            return false;
        }
        C48266uLc c48266uLc = (C48266uLc) obj;
        return Color.m3150equalsimpl0(this.EZpvd, c48266uLc.EZpvd) && Color.m3150equalsimpl0(this.copydefault, c48266uLc.copydefault) && Color.m3150equalsimpl0(this.KWHzl, c48266uLc.KWHzl) && Color.m3150equalsimpl0(this.OLrzqt, c48266uLc.OLrzqt) && Color.m3150equalsimpl0(this.AEQbTJ, c48266uLc.AEQbTJ) && Color.m3150equalsimpl0(this.AYXKKw, c48266uLc.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((Color.m3156hashCodeimpl(this.EZpvd) * 31) + Color.m3156hashCodeimpl(this.copydefault)) * 31) + Color.m3156hashCodeimpl(this.KWHzl)) * 31) + Color.m3156hashCodeimpl(this.OLrzqt)) * 31) + Color.m3156hashCodeimpl(this.AEQbTJ)) * 31) + Color.m3156hashCodeimpl(this.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MetricsColors(realizedProfitColor=" + Color.m3157toStringimpl(this.EZpvd) + ", realizedProfitPercentColor=" + Color.m3157toStringimpl(this.copydefault) + ", floatingPnlColor=" + Color.m3157toStringimpl(this.KWHzl) + ", floatingPnlPercentColor=" + Color.m3157toStringimpl(this.OLrzqt) + ", totalApyColor=" + Color.m3157toStringimpl(this.AEQbTJ) + ", totalPnlColor=" + Color.m3157toStringimpl(this.AYXKKw) + ")";
    }

    public C48266uLc(long j, long j2, long j3, long j4, long j5, long j6) {
        this.EZpvd = j;
        this.copydefault = j2;
        this.KWHzl = j3;
        this.OLrzqt = j4;
        this.AEQbTJ = j5;
        this.AYXKKw = j6;
    }
}
