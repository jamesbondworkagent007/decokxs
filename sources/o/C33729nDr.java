package o;

import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.rxutils.RxBus;

/* JADX INFO: renamed from: o.nDr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C33729nDr implements RxBus.Application {
    public static final int AEQbTJ = OKMessage.$stable;
    public final OKMessage copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKMessage EZpvd() {
        return this.copydefault;
    }

    @Override // com.okinc.rxutils.RxBus.Application
    public boolean check(java.lang.String str) {
        return true;
    }

    public C33729nDr(OKMessage oKMessage) {
        this.copydefault = oKMessage;
    }
}
