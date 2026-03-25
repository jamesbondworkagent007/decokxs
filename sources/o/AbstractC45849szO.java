package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.szO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC45849szO extends AbstractC32996moC implements InterfaceC58208ywu {
    public boolean EZpvd;
    public android.content.ContextWrapper KWHzl;
    public volatile C58196ywi copydefault;
    public final java.lang.Object OLrzqt = new java.lang.Object();
    public boolean AEQbTJ = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        EZpvd();
        OLrzqt();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.KWHzl;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        EZpvd();
        OLrzqt();
    }

    private void EZpvd() {
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
        EZpvd();
        return this.KWHzl;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return KWHzl().aA_();
    }

    public C58196ywi AEQbTJ() {
        return new C58196ywi(this);
    }

    public final C58196ywi KWHzl() {
        if (this.copydefault == null) {
            synchronized (this.OLrzqt) {
                if (this.copydefault == null) {
                    this.copydefault = AEQbTJ();
                }
            }
        }
        return this.copydefault;
    }

    public void OLrzqt() {
        if (this.AEQbTJ) {
            return;
        }
        this.AEQbTJ = true;
        ((sAI) aA_()).OLrzqt((C44026sAp) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
