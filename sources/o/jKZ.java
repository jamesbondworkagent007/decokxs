package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes15.dex */
public abstract class jKZ extends AbstractC32996moC implements InterfaceC58208ywu {
    public boolean DbNXlk;
    public volatile C58196ywi gEmmrt;
    public android.content.ContextWrapper valueOf;
    public final java.lang.Object AYXKKw = new java.lang.Object();
    public boolean fetchVPNInfo = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        KWHzl();
        djBIcL();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.valueOf;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        KWHzl();
        djBIcL();
    }

    private void KWHzl() {
        if (this.valueOf == null) {
            this.valueOf = C58196ywi.EZpvd(super.getContext(), this);
            this.DbNXlk = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.DbNXlk) {
            return null;
        }
        KWHzl();
        return this.valueOf;
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

    public C58196ywi AhwBna() {
        return new C58196ywi(this);
    }

    public final C58196ywi EZpvd() {
        if (this.gEmmrt == null) {
            synchronized (this.AYXKKw) {
                if (this.gEmmrt == null) {
                    this.gEmmrt = AhwBna();
                }
            }
        }
        return this.gEmmrt;
    }

    public void djBIcL() {
        if (this.fetchVPNInfo) {
            return;
        }
        this.fetchVPNInfo = true;
        ((jKV) aA_()).EZpvd((jKQ) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
