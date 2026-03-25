package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.pbf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC38556pbf extends AbstractC32998moE implements InterfaceC58208ywu {
    public final java.lang.Object AkhnZx = new java.lang.Object();
    public boolean fJNWhG = false;
    public volatile C58196ywi fetchVPNInfo;
    public android.content.ContextWrapper isConnected;
    public boolean values;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        OLrzqt();
        AYXKKw();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.isConnected;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        OLrzqt();
        AYXKKw();
    }

    private void OLrzqt() {
        if (this.isConnected == null) {
            this.isConnected = C58196ywi.EZpvd(super.getContext(), this);
            this.values = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.values) {
            return null;
        }
        OLrzqt();
        return this.isConnected;
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
        if (this.fetchVPNInfo == null) {
            synchronized (this.AkhnZx) {
                if (this.fetchVPNInfo == null) {
                    this.fetchVPNInfo = AhwBna();
                }
            }
        }
        return this.fetchVPNInfo;
    }

    public void AYXKKw() {
        if (this.fJNWhG) {
            return;
        }
        this.fJNWhG = true;
        ((InterfaceC38483paL) aA_()).KWHzl((C38516pas) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
