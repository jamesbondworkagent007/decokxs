package o;

import com.okinc.rxutils.RxBus;

/* JADX INFO: renamed from: o.nDw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33734nDw implements RxBus.Application {
    public final java.lang.String EZpvd;
    public final java.lang.Long KWHzl;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    @Override // com.okinc.rxutils.RxBus.Application
    public boolean check(java.lang.String str) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long copydefault() {
        return this.KWHzl;
    }

    public C33734nDw(java.lang.Long l, boolean z, java.lang.String str) {
        this.KWHzl = l;
        this.OLrzqt = z;
        this.EZpvd = str;
    }
}
