package o;

import com.okinc.business.invest_biz.di.RedeemTransactionRepositoryModule;

/* JADX INFO: loaded from: classes6.dex */
public final class iNJ implements InterfaceC58162ywA<iDF> {
    public final InterfaceC58164ywC<iDI> EZpvd;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public iDF get() {
        return AEQbTJ(this.EZpvd.get());
    }

    public static iDF AEQbTJ(iDI idi) {
        return (iDF) C58165ywD.KWHzl(RedeemTransactionRepositoryModule.KWHzl(idi));
    }
}
