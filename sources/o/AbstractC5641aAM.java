package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.aAM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC5641aAM extends AbstractC5926aFg implements InterfaceC58208ywu {
    public android.content.ContextWrapper AEQbTJ;
    public boolean EZpvd;
    public volatile C58196ywi copydefault;
    public final java.lang.Object OLrzqt = new java.lang.Object();
    public boolean KWHzl = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        EZpvd();
        AEQbTJ();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AEQbTJ;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        EZpvd();
        AEQbTJ();
    }

    private void EZpvd() {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = C58196ywi.EZpvd(super.getContext(), this);
            this.EZpvd = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.EZpvd) {
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
        return KWHzl().aA_();
    }

    public C58196ywi OLrzqt() {
        return new C58196ywi(this);
    }

    public final C58196ywi KWHzl() {
        if (this.copydefault == null) {
            synchronized (this.OLrzqt) {
                if (this.copydefault == null) {
                    this.copydefault = OLrzqt();
                }
            }
        }
        return this.copydefault;
    }

    public void AEQbTJ() {
        if (this.KWHzl) {
            return;
        }
        this.KWHzl = true;
        ((InterfaceC5654aAZ) aA_()).EZpvd((C5643aAO) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
