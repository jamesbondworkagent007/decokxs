package o;

import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bBp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8392bBp {
    public static final C8392bBp copydefault = new C8392bBp();
    public static final java.util.HashMap<java.lang.Long, OKWBaseMultiTransfer<?, ?>> EZpvd = new java.util.HashMap<>();
    public static final int OLrzqt = 8;

    private C8392bBp() {
    }

    public final boolean EZpvd(long j) {
        return EZpvd.containsKey(java.lang.Long.valueOf(j));
    }

    public final void copydefault(@NotNull OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransfer) {
        Intrinsics.checkNotNullParameter(oKWBaseMultiTransfer, "");
        long jFetchVPNInfo = oKWBaseMultiTransfer.dHguZz().fetchVPNInfo();
        if (EZpvd(jFetchVPNInfo)) {
            return;
        }
        oKWBaseMultiTransfer.copydefault((OKWBaseMultiTransfer.Application) new ActionBar(jFetchVPNInfo));
        EZpvd.put(java.lang.Long.valueOf(jFetchVPNInfo), oKWBaseMultiTransfer);
    }

    /* JADX INFO: renamed from: o.bBp$ActionBar */
    public static final class ActionBar implements OKWBaseMultiTransfer.Application {
        public final /* synthetic */ long OLrzqt;

        @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer.Application
        public void AEQbTJ() {
        }

        @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer.Application
        public void KWHzl(int i) {
        }

        public ActionBar(long j) {
            this.OLrzqt = j;
        }

        @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer.Application
        public void KWHzl() {
            C8392bBp.copydefault.KWHzl(this.OLrzqt);
        }
    }

    public final void KWHzl(long j) {
        EZpvd.remove(java.lang.Long.valueOf(j));
    }

    public final void copydefault() {
        java.util.Iterator<Map.Entry<java.lang.Long, OKWBaseMultiTransfer<?, ?>>> it = EZpvd.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().fFgQHt();
        }
        EZpvd.clear();
    }
}
