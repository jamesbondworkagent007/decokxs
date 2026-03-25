package o;

import com.okinc.business.defi.wallet.tee.review.viewmodel.repository.ObtainWalletRepositoryModule;

/* JADX INFO: loaded from: classes5.dex */
public final class fWS implements InterfaceC58162ywA<fWR> {
    public final InterfaceC58164ywC<C12827cuN> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public fWR get() {
        return AEQbTJ(this.OLrzqt.get());
    }

    public static fWR AEQbTJ(C12827cuN c12827cuN) {
        return (fWR) C58165ywD.KWHzl(ObtainWalletRepositoryModule.AEQbTJ.KWHzl(c12827cuN));
    }
}
