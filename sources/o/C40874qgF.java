package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.qgF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40874qgF {
    public boolean AhwBna;
    public boolean OLrzqt;
    public boolean copydefault;
    public boolean djBIcL;
    public boolean valueOf;
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public static final C40874qgF KWHzl = new C40874qgF(false, false, false, false, true);
    public static final C40874qgF AEQbTJ = new C40874qgF(true, true, true, true, true);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C40874qgF copy$default(C40874qgF c40874qgF, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c40874qgF.valueOf;
        }
        if ((i & 2) != 0) {
            z2 = c40874qgF.AhwBna;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = c40874qgF.OLrzqt;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = c40874qgF.copydefault;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            z5 = c40874qgF.djBIcL;
        }
        return c40874qgF.KWHzl(z, z6, z7, z8, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40874qgF KWHzl(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new C40874qgF(z, z2, z3, z4, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40874qgF)) {
            return false;
        }
        C40874qgF c40874qgF = (C40874qgF) obj;
        return this.valueOf == c40874qgF.valueOf && this.AhwBna == c40874qgF.AhwBna && this.OLrzqt == c40874qgF.OLrzqt && this.copydefault == c40874qgF.copydefault && this.djBIcL == c40874qgF.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((java.lang.Boolean.hashCode(this.valueOf) * 31) + java.lang.Boolean.hashCode(this.AhwBna)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SmartRefreshVo(isNoMoreData=" + this.valueOf + ", isEnableRefresh=" + this.AhwBna + ", isEnableAutoLoadMore=" + this.OLrzqt + ", isEnableLoadMore=" + this.copydefault + ", isFinishRefresh=" + this.djBIcL + ")";
    }

    public C40874qgF(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.valueOf = z;
        this.AhwBna = z2;
        this.OLrzqt = z3;
        this.copydefault = z4;
        this.djBIcL = z5;
    }

    /* JADX INFO: renamed from: o.qgF$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qgF.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C40874qgF EZpvd() {
            return C40874qgF.KWHzl;
        }

        public final C40874qgF KWHzl() {
            return C40874qgF.AEQbTJ;
        }
    }
}
