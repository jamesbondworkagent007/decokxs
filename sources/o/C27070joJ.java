package o;

import androidx.lifecycle.SavedStateHandle;
import com.okinc.business.invest_biz.ui.viewmodel.InvestRedeemViewModel;

/* JADX INFO: renamed from: o.joJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27070joJ implements InterfaceC58162ywA<InvestRedeemViewModel> {
    public final InterfaceC58164ywC<iXN> AEQbTJ;
    public final InterfaceC58164ywC<InterfaceC23693iFv> EZpvd;
    public final InterfaceC58164ywC<SavedStateHandle> KWHzl;
    public final InterfaceC58164ywC<iXH> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public InvestRedeemViewModel get() {
        InvestRedeemViewModel investRedeemViewModelAEQbTJ = AEQbTJ(this.KWHzl.get());
        C27071joK.OLrzqt(investRedeemViewModelAEQbTJ, this.copydefault.get());
        C27071joK.OLrzqt(investRedeemViewModelAEQbTJ, this.AEQbTJ.get());
        C27071joK.EZpvd(investRedeemViewModelAEQbTJ, this.EZpvd.get());
        return investRedeemViewModelAEQbTJ;
    }

    public static InvestRedeemViewModel AEQbTJ(SavedStateHandle savedStateHandle) {
        return new InvestRedeemViewModel(savedStateHandle);
    }
}
