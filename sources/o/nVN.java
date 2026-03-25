package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes16.dex */
public abstract class nVN extends C37576owT implements InterfaceC58208ywu {
    public android.content.ContextWrapper AEQbTJ;
    public boolean AhwBna;
    public volatile C58196ywi KWHzl;
    public final java.lang.Object EZpvd = new java.lang.Object();
    public boolean djBIcL = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        EZpvd();
        valueOf();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AEQbTJ;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        EZpvd();
        valueOf();
    }

    private void EZpvd() {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = C58196ywi.EZpvd(super.getContext(), this);
            this.AhwBna = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AhwBna) {
            return null;
        }
        EZpvd();
        return this.AEQbTJ;
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

    public C58196ywi AEQbTJ() {
        return new C58196ywi(this);
    }

    public final C58196ywi OLrzqt() {
        if (this.KWHzl == null) {
            synchronized (this.EZpvd) {
                if (this.KWHzl == null) {
                    this.KWHzl = AEQbTJ();
                }
            }
        }
        return this.KWHzl;
    }

    public void valueOf() {
        if (this.djBIcL) {
            return;
        }
        this.djBIcL = true;
        ((nVL) aA_()).copydefault((C34214nVr) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
