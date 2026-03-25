package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.kkP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC28946kkP extends androidx.fragment.app.Fragment implements InterfaceC58208ywu {
    public volatile C58196ywi AEQbTJ;
    public boolean EZpvd;
    public final java.lang.Object KWHzl = new java.lang.Object();
    public boolean OLrzqt = false;
    public android.content.ContextWrapper copydefault;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        OLrzqt();
        KWHzl();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.copydefault;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        OLrzqt();
        KWHzl();
    }

    private void OLrzqt() {
        if (this.copydefault == null) {
            this.copydefault = C58196ywi.EZpvd(super.getContext(), this);
            this.EZpvd = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.EZpvd) {
            return null;
        }
        OLrzqt();
        return this.copydefault;
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

    public C58196ywi AEQbTJ() {
        return new C58196ywi(this);
    }

    public final C58196ywi EZpvd() {
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
        if (this.OLrzqt) {
            return;
        }
        this.OLrzqt = true;
        ((InterfaceC29013kld) aA_()).copydefault((C28953kkW) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
