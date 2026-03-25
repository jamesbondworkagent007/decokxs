package o;

import com.okinc.rxutils.RxBus;

/* JADX INFO: renamed from: o.uoI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49421uoI implements RxBus.Application {
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C49421uoI copy$default(C49421uoI c49421uoI, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c49421uoI.OLrzqt;
        }
        return c49421uoI.EZpvd(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C49421uoI EZpvd(boolean z) {
        return new C49421uoI(z);
    }

    @Override // com.okinc.rxutils.RxBus.Application
    public boolean check(java.lang.String str) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C49421uoI) && this.OLrzqt == ((C49421uoI) obj).OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PriceRemindDeleteEvent(isDelete=" + this.OLrzqt + ")";
    }

    public C49421uoI(boolean z) {
        this.OLrzqt = z;
    }
}
