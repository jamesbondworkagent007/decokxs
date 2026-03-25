package o;

import androidx.lifecycle.SavedStateHandle;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeViewModel;

/* JADX INFO: renamed from: o.jmF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26960jmF implements InterfaceC58162ywA<InvestUniv3SubscribeViewModel> {
    public final InterfaceC58164ywC<SavedStateHandle> AEQbTJ;
    public final InterfaceC58164ywC<iXH> KWHzl;
    public final InterfaceC58164ywC<InterfaceC23916iOb> OLrzqt;
    public final InterfaceC58164ywC<iXN> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public InvestUniv3SubscribeViewModel get() {
        InvestUniv3SubscribeViewModel investUniv3SubscribeViewModelEZpvd = EZpvd(this.AEQbTJ.get(), this.OLrzqt.get());
        C26966jmL.EZpvd(investUniv3SubscribeViewModelEZpvd, this.KWHzl.get());
        C26966jmL.AEQbTJ(investUniv3SubscribeViewModelEZpvd, this.copydefault.get());
        return investUniv3SubscribeViewModelEZpvd;
    }

    public static InvestUniv3SubscribeViewModel EZpvd(SavedStateHandle savedStateHandle, InterfaceC23916iOb interfaceC23916iOb) {
        return new InvestUniv3SubscribeViewModel(savedStateHandle, interfaceC23916iOb);
    }
}
