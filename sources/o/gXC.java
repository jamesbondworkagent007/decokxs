package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gXC extends AbstractC20011gXp implements InterfaceC58208ywu {
    public volatile C58196ywi AYXKKw;
    public boolean AhwBna;
    public android.content.ContextWrapper KWHzl;
    public final java.lang.Object djBIcL = new java.lang.Object();
    public boolean gEmmrt = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        djBIcL();
        AhwBna();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.KWHzl;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        djBIcL();
        AhwBna();
    }

    private void djBIcL() {
        if (this.KWHzl == null) {
            this.KWHzl = C58196ywi.EZpvd(super.getContext(), this);
            this.AhwBna = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AhwBna) {
            return null;
        }
        djBIcL();
        return this.KWHzl;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return AYXKKw().aA_();
    }

    public C58196ywi gEmmrt() {
        return new C58196ywi(this);
    }

    public final C58196ywi AYXKKw() {
        if (this.AYXKKw == null) {
            synchronized (this.djBIcL) {
                if (this.AYXKKw == null) {
                    this.AYXKKw = gEmmrt();
                }
            }
        }
        return this.AYXKKw;
    }

    public void AhwBna() {
        if (this.gEmmrt) {
            return;
        }
        this.gEmmrt = true;
        ((InterfaceC20042gYt) aA_()).copydefault((C20037gYo) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
