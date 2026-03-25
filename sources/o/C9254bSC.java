package o;

import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.model.ChainAddress;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC9217bRS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bSC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9254bSC extends C9035bNw implements InterfaceC9217bRS {
    public final OKWBaseTransaction<?> AhwBna = this;
    public boolean gEmmrt;
    public boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C9035bNw, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AYXKKw(boolean z) {
        this.gEmmrt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C9035bNw, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void AhwBna(boolean z) {
        this.valueOf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C9035bNw, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean ODXsMY() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9217bRS
    public OKWBaseTransaction<?> fetchVPNInfo() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C9035bNw, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean gwTjWJ() {
        return this.gEmmrt;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public ChainAddress OLrzqt(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(str, "");
        return InterfaceC9217bRS.TaskDescription.KWHzl(this, abstractC12782ctV, str);
    }

    @Override // o.C9035bNw, o.AbstractC8610bFv, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.util.ArrayList<java.lang.Integer> getNewProxyInstance() {
        return new java.util.ArrayList<>();
    }
}
