package o;

import com.okinc.business.invest_biz.di.InvestTransactionRepositoryModule;

/* JADX INFO: loaded from: classes6.dex */
public final class iNE implements InterfaceC58162ywA<InterfaceC23643iDz> {
    public final InterfaceC58164ywC<iDD> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public InterfaceC23643iDz get() {
        return EZpvd(this.OLrzqt.get());
    }

    public static InterfaceC23643iDz EZpvd(iDD idd) {
        return (InterfaceC23643iDz) C58165ywD.KWHzl(InvestTransactionRepositoryModule.copydefault(idd));
    }
}
