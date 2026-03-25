package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.nvD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC35426nvD extends AbstractC32996moC implements InterfaceC58208ywu {
    public boolean AkhnZx;
    public volatile C58196ywi DbNXlk;
    public android.content.ContextWrapper isConnected;
    public final java.lang.Object fetchVPNInfo = new java.lang.Object();
    public boolean fARcdN = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        EZpvd();
        AkhnZx();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.isConnected;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        EZpvd();
        AkhnZx();
    }

    private void EZpvd() {
        if (this.isConnected == null) {
            this.isConnected = C58196ywi.EZpvd(super.getContext(), this);
            this.AkhnZx = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AkhnZx) {
            return null;
        }
        EZpvd();
        return this.isConnected;
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

    public C58196ywi fetchVPNInfo() {
        return new C58196ywi(this);
    }

    public final C58196ywi values() {
        if (this.DbNXlk == null) {
            synchronized (this.fetchVPNInfo) {
                if (this.DbNXlk == null) {
                    this.DbNXlk = fetchVPNInfo();
                }
            }
        }
        return this.DbNXlk;
    }

    public void AkhnZx() {
        if (this.fARcdN) {
            return;
        }
        this.fARcdN = true;
        ((InterfaceC35429nvG) aA_()).copydefault((C35467nvs) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
