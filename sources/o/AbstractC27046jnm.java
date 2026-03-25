package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.jnm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC27046jnm extends AbstractC32996moC implements InterfaceC58208ywu {
    public volatile C58196ywi AkhnZx;
    public final java.lang.Object DbNXlk = new java.lang.Object();
    public boolean fIwbmz = false;
    public android.content.ContextWrapper fetchVPNInfo;
    public boolean values;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        EZpvd();
        djBIcL();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.fetchVPNInfo;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        EZpvd();
        djBIcL();
    }

    private void EZpvd() {
        if (this.fetchVPNInfo == null) {
            this.fetchVPNInfo = C58196ywi.EZpvd(super.getContext(), this);
            this.values = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.values) {
            return null;
        }
        EZpvd();
        return this.fetchVPNInfo;
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

    public C58196ywi AhwBna() {
        return new C58196ywi(this);
    }

    public final C58196ywi OLrzqt() {
        if (this.AkhnZx == null) {
            synchronized (this.DbNXlk) {
                if (this.AkhnZx == null) {
                    this.AkhnZx = AhwBna();
                }
            }
        }
        return this.AkhnZx;
    }

    public void djBIcL() {
        if (this.fIwbmz) {
            return;
        }
        this.fIwbmz = true;
        ((InterfaceC27015jnH) aA_()).AEQbTJ((AbstractC27017jnJ) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
