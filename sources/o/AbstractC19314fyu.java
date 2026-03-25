package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.fyu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC19314fyu extends AbstractC19318fyy implements InterfaceC58208ywu {
    public android.content.ContextWrapper AEQbTJ;
    public volatile C58196ywi OLrzqt;
    public boolean copydefault;
    public final java.lang.Object KWHzl = new java.lang.Object();
    public boolean EZpvd = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        EZpvd();
        KWHzl();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AEQbTJ;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        EZpvd();
        KWHzl();
    }

    private void EZpvd() {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = C58196ywi.EZpvd(super.getContext(), this);
            this.copydefault = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.copydefault) {
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
        if (this.OLrzqt == null) {
            synchronized (this.KWHzl) {
                if (this.OLrzqt == null) {
                    this.OLrzqt = AEQbTJ();
                }
            }
        }
        return this.OLrzqt;
    }

    public void KWHzl() {
        if (this.EZpvd) {
            return;
        }
        this.EZpvd = true;
        ((InterfaceC19363fzq) aA_()).OLrzqt((C19352fzf) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
