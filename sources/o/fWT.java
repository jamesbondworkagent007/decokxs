package o;

import com.okinc.business.defi.wallet.tee.review.viewmodel.usecase.ReNewEnableUseCaseModule;

/* JADX INFO: loaded from: classes5.dex */
public final class fWT implements InterfaceC58162ywA<fWU> {
    public final InterfaceC58164ywC<fWR> AEQbTJ;
    public final InterfaceC58164ywC<fVP> EZpvd;
    public final InterfaceC58164ywC<fVJ> OLrzqt;
    public final InterfaceC58164ywC<fVN> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public fWU get() {
        return copydefault(this.copydefault.get(), this.EZpvd.get(), this.AEQbTJ.get(), this.OLrzqt.get());
    }

    public static fWU copydefault(fVN fvn, fVP fvp, fWR fwr, fVJ fvj) {
        return (fWU) C58165ywD.KWHzl(ReNewEnableUseCaseModule.EZpvd.KWHzl(fvn, fvp, fwr, fvj));
    }
}
