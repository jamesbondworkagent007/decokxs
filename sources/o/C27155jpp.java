package o;

import androidx.lifecycle.SavedStateHandle;
import com.okinc.business.invest_biz.ui.viewmodel.InvestSubscriptionNewViewModel;

/* JADX INFO: renamed from: o.jpp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27155jpp implements InterfaceC58162ywA<InvestSubscriptionNewViewModel> {
    public final InterfaceC58164ywC<iXN> EZpvd;
    public final InterfaceC58164ywC<SavedStateHandle> KWHzl;
    public final InterfaceC58164ywC<iXH> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public InvestSubscriptionNewViewModel get() {
        InvestSubscriptionNewViewModel investSubscriptionNewViewModelKWHzl = KWHzl(this.KWHzl.get());
        C27159jpt.copydefault(investSubscriptionNewViewModelKWHzl, this.copydefault.get());
        C27159jpt.AEQbTJ(investSubscriptionNewViewModelKWHzl, this.EZpvd.get());
        return investSubscriptionNewViewModelKWHzl;
    }

    public static InvestSubscriptionNewViewModel KWHzl(SavedStateHandle savedStateHandle) {
        return new InvestSubscriptionNewViewModel(savedStateHandle);
    }
}
