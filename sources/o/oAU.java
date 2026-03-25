package o;

import com.okinc.rxutils.RxBus;

/* JADX INFO: loaded from: classes16.dex */
public final class oAU implements RxBus.Application {
    public final int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.OLrzqt;
    }

    @Override // com.okinc.rxutils.RxBus.Application
    public boolean check(java.lang.String str) {
        return true;
    }

    public oAU(int i) {
        this.OLrzqt = i;
    }
}
