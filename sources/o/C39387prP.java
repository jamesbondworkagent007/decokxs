package o;

import com.okinc.rxutils.RxBus;

/* JADX INFO: renamed from: o.prP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39387prP implements RxBus.Application {
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C39387prP copy$default(C39387prP c39387prP, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c39387prP.copydefault;
        }
        return c39387prP.copydefault(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    @Override // com.okinc.rxutils.RxBus.Application
    public boolean check(java.lang.String str) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39387prP copydefault(boolean z) {
        return new C39387prP(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39387prP) && this.copydefault == ((C39387prP) obj).copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PortraitFullScreenSwitchEvent(isFullScreen=" + this.copydefault + ")";
    }

    public C39387prP(boolean z) {
        this.copydefault = z;
    }
}
