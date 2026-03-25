package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes15.dex */
public abstract class jQY extends androidx.fragment.app.Fragment implements InterfaceC58208ywu {
    public android.content.ContextWrapper AkhnZx;
    public volatile C58196ywi fetchVPNInfo;
    public boolean values;
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
        android.content.ContextWrapper contextWrapper = this.AkhnZx;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        OLrzqt();
        fetchVPNInfo();
    }

    private void OLrzqt() {
        if (this.AkhnZx == null) {
            this.AkhnZx = C58196ywi.EZpvd(super.getContext(), this);
            this.values = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.values) {
            return null;
        }
        OLrzqt();
        return this.AkhnZx;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return values().aA_();
    }

    public C58196ywi isConnected() {
        return new C58196ywi(this);
    }

    public final C58196ywi values() {
        if (this.fetchVPNInfo == null) {
            synchronized (this.isConnected) {
                if (this.fetchVPNInfo == null) {
                    this.fetchVPNInfo = isConnected();
                }
            }
        }
        return this.fetchVPNInfo;
    }

    public void fetchVPNInfo() {
        if (this.DbNXlk) {
            return;
        }
        this.DbNXlk = true;
        ((jQV) aA_()).OLrzqt((jQQ) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
