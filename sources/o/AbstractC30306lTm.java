package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.lTm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC30306lTm extends AbstractC32998moE implements InterfaceC58208ywu {
    public android.content.ContextWrapper djBIcL;
    public volatile C58196ywi gEmmrt;
    public boolean values;
    public final java.lang.Object fetchVPNInfo = new java.lang.Object();
    public boolean DbNXlk = false;

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
            this.values = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.values) {
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
        return AhwBna().aA_();
    }

    public C58196ywi AYXKKw() {
        return new C58196ywi(this);
    }

    public final C58196ywi AhwBna() {
        if (this.gEmmrt == null) {
            synchronized (this.fetchVPNInfo) {
                if (this.gEmmrt == null) {
                    this.gEmmrt = AYXKKw();
                }
            }
        }
        return this.gEmmrt;
    }

    public void djBIcL() {
        if (this.DbNXlk) {
            return;
        }
        this.DbNXlk = true;
        ((InterfaceC30302lTi) aA_()).copydefault((lSZ) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
