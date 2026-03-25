package o;

import com.okinc.rxutils.RxBus;

/* JADX INFO: loaded from: classes18.dex */
public final class nDF implements RxBus.Application {
    public final long EZpvd;
    public final java.lang.Long KWHzl;

    @Override // com.okinc.rxutils.RxBus.Application
    public boolean check(java.lang.String str) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.EZpvd;
    }

    public nDF(java.lang.Long l, long j) {
        this.KWHzl = l;
        this.EZpvd = j;
    }
}
