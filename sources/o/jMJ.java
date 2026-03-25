package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes15.dex */
public abstract class jMJ extends AbstractC32996moC implements InterfaceC58208ywu {
    public boolean EZpvd;
    public android.content.ContextWrapper KWHzl;
    public volatile C58196ywi OLrzqt;
    public final java.lang.Object copydefault = new java.lang.Object();
    public boolean AEQbTJ = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        KWHzl();
        AEQbTJ();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.KWHzl;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        KWHzl();
        AEQbTJ();
    }

    private void KWHzl() {
        if (this.KWHzl == null) {
            this.KWHzl = C58196ywi.EZpvd(super.getContext(), this);
            this.EZpvd = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.EZpvd) {
            return null;
        }
        KWHzl();
        return this.KWHzl;
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

    public C58196ywi OLrzqt() {
        return new C58196ywi(this);
    }

    public final C58196ywi EZpvd() {
        if (this.OLrzqt == null) {
            synchronized (this.copydefault) {
                if (this.OLrzqt == null) {
                    this.OLrzqt = OLrzqt();
                }
            }
        }
        return this.OLrzqt;
    }

    public void AEQbTJ() {
        if (this.AEQbTJ) {
            return;
        }
        this.AEQbTJ = true;
        ((jMY) aA_()).copydefault((jMM) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
