package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes16.dex */
public abstract class uIK extends AbstractC32996moC implements InterfaceC58208ywu {
    public android.content.ContextWrapper AhwBna;
    public final java.lang.Object DbNXlk = new java.lang.Object();
    public boolean fetchVPNInfo = false;
    public volatile C58196ywi isConnected;
    public boolean values;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        KWHzl();
        AYXKKw();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AhwBna;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        KWHzl();
        AYXKKw();
    }

    private void KWHzl() {
        if (this.AhwBna == null) {
            this.AhwBna = C58196ywi.EZpvd(super.getContext(), this);
            this.values = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.values) {
            return null;
        }
        KWHzl();
        return this.AhwBna;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return valueOf().aA_();
    }

    public C58196ywi AhwBna() {
        return new C58196ywi(this);
    }

    public final C58196ywi valueOf() {
        if (this.isConnected == null) {
            synchronized (this.DbNXlk) {
                if (this.isConnected == null) {
                    this.isConnected = AhwBna();
                }
            }
        }
        return this.isConnected;
    }

    public void AYXKKw() {
        if (this.fetchVPNInfo) {
            return;
        }
        this.fetchVPNInfo = true;
        ((uIH) aA_()).KWHzl((uIG) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
