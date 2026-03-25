package o;

import com.okinc.business.invest_biz.di.TransactionRepositoryModule;

/* JADX INFO: loaded from: classes6.dex */
public final class iNS implements InterfaceC58162ywA<iDH> {
    public final InterfaceC58164ywC<C23629iDl> AEQbTJ;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public iDH get() {
        return EZpvd(this.AEQbTJ.get());
    }

    public static iDH EZpvd(C23629iDl c23629iDl) {
        return (iDH) C58165ywD.KWHzl(TransactionRepositoryModule.EZpvd(c23629iDl));
    }
}
