package o;

import androidx.lifecycle.SavedStateHandle;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3FarmRedeemViewModel;

/* JADX INFO: renamed from: o.jjT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26815jjT implements InterfaceC58162ywA<InvestUniv3FarmRedeemViewModel> {
    public final InterfaceC58164ywC<iXN> AEQbTJ;
    public final InterfaceC58164ywC<iXH> EZpvd;
    public final InterfaceC58164ywC<SavedStateHandle> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public InvestUniv3FarmRedeemViewModel get() {
        InvestUniv3FarmRedeemViewModel investUniv3FarmRedeemViewModelKWHzl = KWHzl(this.KWHzl.get());
        C26817jjV.AEQbTJ(investUniv3FarmRedeemViewModelKWHzl, this.EZpvd.get());
        C26817jjV.KWHzl(investUniv3FarmRedeemViewModelKWHzl, this.AEQbTJ.get());
        return investUniv3FarmRedeemViewModelKWHzl;
    }

    public static InvestUniv3FarmRedeemViewModel KWHzl(SavedStateHandle savedStateHandle) {
        return new InvestUniv3FarmRedeemViewModel(savedStateHandle);
    }
}
