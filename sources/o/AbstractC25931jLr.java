package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.jLr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC25931jLr extends AbstractC32996moC implements InterfaceC58208ywu {
    public volatile C58196ywi AkhnZx;
    public android.content.ContextWrapper djBIcL;
    public boolean fetchVPNInfo;
    public final java.lang.Object isConnected = new java.lang.Object();
    public boolean values = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        KWHzl();
        djBIcL();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.djBIcL;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        KWHzl();
        djBIcL();
    }

    private void KWHzl() {
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
        KWHzl();
        return this.djBIcL;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return gEmmrt().aA_();
    }

    public C58196ywi AhwBna() {
        return new C58196ywi(this);
    }

    public final C58196ywi gEmmrt() {
        if (this.AkhnZx == null) {
            synchronized (this.isConnected) {
                if (this.AkhnZx == null) {
                    this.AkhnZx = AhwBna();
                }
            }
        }
        return this.AkhnZx;
    }

    public void djBIcL() {
        if (this.values) {
            return;
        }
        this.values = true;
        ((InterfaceC25929jLp) aA_()).OLrzqt((C25925jLl) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
