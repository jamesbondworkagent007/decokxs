package o;

import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.dex.trade.order.ui.OrdersPagerFragment;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gZV extends AbstractC31214lpm implements InterfaceC58208ywu {
    public boolean AEQbTJ;
    public volatile C58196ywi EZpvd;
    public android.content.ContextWrapper copydefault;
    public final java.lang.Object OLrzqt = new java.lang.Object();
    public boolean KWHzl = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AhwBna();
        djBIcL();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.copydefault;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AhwBna();
        djBIcL();
    }

    private void AhwBna() {
        if (this.copydefault == null) {
            this.copydefault = C58196ywi.EZpvd(super.getContext(), this);
            this.AEQbTJ = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AEQbTJ) {
            return null;
        }
        AhwBna();
        return this.copydefault;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return EZpvd().aA_();
    }

    public C58196ywi AEQbTJ() {
        return new C58196ywi(this);
    }

    public final C58196ywi EZpvd() {
        if (this.EZpvd == null) {
            synchronized (this.OLrzqt) {
                if (this.EZpvd == null) {
                    this.EZpvd = AEQbTJ();
                }
            }
        }
        return this.EZpvd;
    }

    public void djBIcL() {
        if (this.KWHzl) {
            return;
        }
        this.KWHzl = true;
        ((InterfaceC22181haX) aA_()).AEQbTJ((OrdersPagerFragment) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
