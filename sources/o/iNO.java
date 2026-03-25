package o;

import com.okinc.business.invest_biz.di.TransactionRepositoryModule;

/* JADX INFO: loaded from: classes6.dex */
public final class iNO implements InterfaceC58162ywA<iDH> {
    public final InterfaceC58164ywC<iDH> AEQbTJ;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public iDH get() {
        return copydefault(this.AEQbTJ.get());
    }

    public static iDH copydefault(iDH idh) {
        return (iDH) C58165ywD.KWHzl(TransactionRepositoryModule.KWHzl(idh));
    }
}
