package o;

import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyBasicInfoFragment;

/* JADX INFO: renamed from: o.gXy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20020gXy<VB extends ViewBinding> extends hTH<VB> implements InterfaceC58208ywu {
    public volatile C58196ywi AEQbTJ;
    public android.content.ContextWrapper EZpvd;
    public final java.lang.Object KWHzl = new java.lang.Object();
    public boolean OLrzqt = false;
    public boolean copydefault;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AEQbTJ();
        EZpvd();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.EZpvd;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AEQbTJ();
        EZpvd();
    }

    private void AEQbTJ() {
        if (this.EZpvd == null) {
            this.EZpvd = C58196ywi.EZpvd(super.getContext(), this);
            this.copydefault = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.copydefault) {
            return null;
        }
        AEQbTJ();
        return this.EZpvd;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return OLrzqt().aA_();
    }

    public C58196ywi KWHzl() {
        return new C58196ywi(this);
    }

    public final C58196ywi OLrzqt() {
        if (this.AEQbTJ == null) {
            synchronized (this.KWHzl) {
                if (this.AEQbTJ == null) {
                    this.AEQbTJ = KWHzl();
                }
            }
        }
        return this.AEQbTJ;
    }

    public void EZpvd() {
        if (this.OLrzqt) {
            return;
        }
        this.OLrzqt = true;
        ((gXQ) aA_()).KWHzl((StrategyBasicInfoFragment) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
