package o;

import com.okinc.business.defi.biz.database.extra.ExtraDatabase;
import com.okinc.business.defi.wallet.home.addressDetail.di.SupportPnlChainListDIProvideModule;

/* JADX INFO: loaded from: classes5.dex */
public final class eWN implements InterfaceC58162ywA<cHZ> {
    public final InterfaceC58164ywC<ExtraDatabase> AEQbTJ;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public cHZ get() {
        return KWHzl(this.AEQbTJ.get());
    }

    public static cHZ KWHzl(ExtraDatabase extraDatabase) {
        return (cHZ) C58165ywD.KWHzl(SupportPnlChainListDIProvideModule.EZpvd.AEQbTJ(extraDatabase));
    }
}
