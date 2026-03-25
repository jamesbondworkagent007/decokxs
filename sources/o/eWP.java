package o;

import com.okinc.business.defi.biz.database.extra.ExtraDatabase;
import com.okinc.business.defi.wallet.home.addressDetail.di.SupportPnlChainListDIProvideModule;

/* JADX INFO: loaded from: classes5.dex */
public final class eWP implements InterfaceC58162ywA<ExtraDatabase> {
    public final InterfaceC58164ywC<android.content.Context> AEQbTJ;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ExtraDatabase get() {
        return AEQbTJ(this.AEQbTJ.get());
    }

    public static ExtraDatabase AEQbTJ(android.content.Context context) {
        return (ExtraDatabase) C58165ywD.KWHzl(SupportPnlChainListDIProvideModule.EZpvd.copydefault(context));
    }
}
