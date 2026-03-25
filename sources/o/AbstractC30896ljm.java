package o;

import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: o.ljm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC30896ljm<VB extends ViewBinding> extends hTH<VB> implements InterfaceC58208ywu {
    public boolean DbNXlk;
    public volatile C58196ywi fetchVPNInfo;
    public android.content.ContextWrapper gEmmrt;
    public final java.lang.Object values = new java.lang.Object();
    public boolean isConnected = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        EZpvd();
        zsXlph();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.gEmmrt;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        EZpvd();
        zsXlph();
    }

    private void EZpvd() {
        if (this.gEmmrt == null) {
            this.gEmmrt = C58196ywi.EZpvd(super.getContext(), this);
            this.DbNXlk = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.DbNXlk) {
            return null;
        }
        EZpvd();
        return this.gEmmrt;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return hDKMBd().aA_();
    }

    public C58196ywi getNewProxyInstance() {
        return new C58196ywi(this);
    }

    public final C58196ywi hDKMBd() {
        if (this.fetchVPNInfo == null) {
            synchronized (this.values) {
                if (this.fetchVPNInfo == null) {
                    this.fetchVPNInfo = getNewProxyInstance();
                }
            }
        }
        return this.fetchVPNInfo;
    }

    public void zsXlph() {
        if (this.isConnected) {
            return;
        }
        this.isConnected = true;
        ((InterfaceC30894ljk) aA_()).KWHzl((AbstractC30827liW) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
