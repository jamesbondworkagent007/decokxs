package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.gBm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19414gBm {
    public static final Application Companion = new Application(null);
    public final int EZpvd;
    public final int KWHzl;
    public final int OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C19414gBm copy$default(C19414gBm c19414gBm, int i, int i2, int i3, boolean z, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = c19414gBm.OLrzqt;
        }
        if ((i4 & 2) != 0) {
            i2 = c19414gBm.KWHzl;
        }
        if ((i4 & 4) != 0) {
            i3 = c19414gBm.EZpvd;
        }
        if ((i4 & 8) != 0) {
            z = c19414gBm.copydefault;
        }
        return c19414gBm.EZpvd(i, i2, i3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C19414gBm EZpvd(int i, int i2, int i3, boolean z) {
        return new C19414gBm(i, i2, i3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19414gBm)) {
            return false;
        }
        C19414gBm c19414gBm = (C19414gBm) obj;
        return this.OLrzqt == c19414gBm.OLrzqt && this.KWHzl == c19414gBm.KWHzl && this.EZpvd == c19414gBm.EZpvd && this.copydefault == c19414gBm.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.OLrzqt) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DefiCoinDetailEllipsisUiModel(icon=" + this.OLrzqt + ", title=" + this.KWHzl + ", index=" + this.EZpvd + ", isEnable=" + this.copydefault + ")";
    }

    public C19414gBm(int i, int i2, int i3, boolean z) {
        this.OLrzqt = i;
        this.KWHzl = i2;
        this.EZpvd = i3;
        this.copydefault = z;
    }

    /* JADX INFO: renamed from: o.gBm$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gBm.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
