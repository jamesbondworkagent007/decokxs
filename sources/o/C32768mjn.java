package o;

import com.okinc.rxutils.RxBus;

/* JADX INFO: renamed from: o.mjn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32768mjn implements RxBus.Application {
    public final int EZpvd;
    public final int OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C32768mjn copy$default(C32768mjn c32768mjn, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i = c32768mjn.OLrzqt;
        }
        if ((i4 & 2) != 0) {
            i2 = c32768mjn.copydefault;
        }
        if ((i4 & 4) != 0) {
            i3 = c32768mjn.EZpvd;
        }
        return c32768mjn.EZpvd(i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C32768mjn EZpvd(int i, int i2, int i3) {
        return new C32768mjn(i, i2, i3);
    }

    @Override // com.okinc.rxutils.RxBus.Application
    public boolean check(java.lang.String str) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32768mjn)) {
            return false;
        }
        C32768mjn c32768mjn = (C32768mjn) obj;
        return this.OLrzqt == c32768mjn.OLrzqt && this.copydefault == c32768mjn.copydefault && this.EZpvd == c32768mjn.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.OLrzqt) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ScanProgressEvent(currentProgress=" + this.OLrzqt + ", totalCount=" + this.copydefault + ", percentage=" + this.EZpvd + ")";
    }

    public C32768mjn(int i, int i2, int i3) {
        this.OLrzqt = i;
        this.copydefault = i2;
        this.EZpvd = i3;
    }
}
