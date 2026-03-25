package o;

import androidx.lifecycle.SavedStateHandle;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3RedeemViewModel;

/* JADX INFO: renamed from: o.jlq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26944jlq implements InterfaceC58162ywA<InvestUniv3RedeemViewModel> {
    public final InterfaceC58164ywC<SavedStateHandle> AEQbTJ;
    public final InterfaceC58164ywC<iXH> EZpvd;
    public final InterfaceC58164ywC<iXN> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public InvestUniv3RedeemViewModel get() {
        InvestUniv3RedeemViewModel investUniv3RedeemViewModelAEQbTJ = AEQbTJ(this.AEQbTJ.get());
        C26943jlp.EZpvd(investUniv3RedeemViewModelAEQbTJ, this.EZpvd.get());
        C26943jlp.KWHzl(investUniv3RedeemViewModelAEQbTJ, this.OLrzqt.get());
        return investUniv3RedeemViewModelAEQbTJ;
    }

    public static InvestUniv3RedeemViewModel AEQbTJ(SavedStateHandle savedStateHandle) {
        return new InvestUniv3RedeemViewModel(savedStateHandle);
    }
}
