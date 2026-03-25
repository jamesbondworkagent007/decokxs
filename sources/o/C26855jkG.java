package o;

import androidx.lifecycle.SavedStateHandle;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3FarmSubscribeViewModel;

/* JADX INFO: renamed from: o.jkG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26855jkG implements InterfaceC58162ywA<InvestUniv3FarmSubscribeViewModel> {
    public final InterfaceC58164ywC<SavedStateHandle> AEQbTJ;
    public final InterfaceC58164ywC<iXN> EZpvd;
    public final InterfaceC58164ywC<iXH> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public InvestUniv3FarmSubscribeViewModel get() {
        InvestUniv3FarmSubscribeViewModel investUniv3FarmSubscribeViewModelAEQbTJ = AEQbTJ(this.AEQbTJ.get());
        C26856jkH.KWHzl(investUniv3FarmSubscribeViewModelAEQbTJ, this.KWHzl.get());
        C26856jkH.EZpvd(investUniv3FarmSubscribeViewModelAEQbTJ, this.EZpvd.get());
        return investUniv3FarmSubscribeViewModelAEQbTJ;
    }

    public static InvestUniv3FarmSubscribeViewModel AEQbTJ(SavedStateHandle savedStateHandle) {
        return new InvestUniv3FarmSubscribeViewModel(savedStateHandle);
    }
}
