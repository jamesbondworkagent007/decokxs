package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jPY extends AbstractC32996moC implements InterfaceC58208ywu {
    public volatile C58196ywi AEQbTJ;
    public boolean EZpvd;
    public android.content.ContextWrapper OLrzqt;
    public final java.lang.Object KWHzl = new java.lang.Object();
    public boolean copydefault = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        EZpvd();
        KWHzl();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.OLrzqt;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        EZpvd();
        KWHzl();
    }

    private void EZpvd() {
        if (this.OLrzqt == null) {
            this.OLrzqt = C58196ywi.EZpvd(super.getContext(), this);
            this.EZpvd = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.EZpvd) {
            return null;
        }
        EZpvd();
        return this.OLrzqt;
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
        if (this.AEQbTJ == null) {
            synchronized (this.KWHzl) {
                if (this.AEQbTJ == null) {
                    this.AEQbTJ = AEQbTJ();
                }
            }
        }
        return this.AEQbTJ;
    }

    public void KWHzl() {
        if (this.copydefault) {
            return;
        }
        this.copydefault = true;
        ((InterfaceC26049jQa) aA_()).OLrzqt((jPV) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
