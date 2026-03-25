package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes15.dex */
public abstract class jIG extends AbstractC32996moC implements InterfaceC58208ywu {
    public volatile C58196ywi AhwBna;
    public android.content.ContextWrapper djBIcL;
    public boolean fetchVPNInfo;
    public final java.lang.Object isConnected = new java.lang.Object();
    public boolean DbNXlk = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        OLrzqt();
        fetchVPNInfo();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.djBIcL;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        OLrzqt();
        fetchVPNInfo();
    }

    private void OLrzqt() {
        if (this.djBIcL == null) {
            this.djBIcL = C58196ywi.EZpvd(super.getContext(), this);
            this.fetchVPNInfo = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.fetchVPNInfo) {
            return null;
        }
        OLrzqt();
        return this.djBIcL;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return DbNXlk().aA_();
    }

    public C58196ywi values() {
        return new C58196ywi(this);
    }

    public final C58196ywi DbNXlk() {
        if (this.AhwBna == null) {
            synchronized (this.isConnected) {
                if (this.AhwBna == null) {
                    this.AhwBna = values();
                }
            }
        }
        return this.AhwBna;
    }

    public void fetchVPNInfo() {
        if (this.DbNXlk) {
            return;
        }
        this.DbNXlk = true;
        ((jID) aA_()).EZpvd((C25852jIt) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
