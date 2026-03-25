package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.eRr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15690eRr extends AbstractC32998moE implements InterfaceC58208ywu {
    public boolean QOLQEE;
    public volatile C58196ywi gHZMYf;
    public android.content.ContextWrapper sSMYrx;
    public final java.lang.Object zuBGHE = new java.lang.Object();
    public boolean QKVWgx = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        OLrzqt();
        QKVWgx();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.sSMYrx;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        OLrzqt();
        QKVWgx();
    }

    private void OLrzqt() {
        if (this.sSMYrx == null) {
            this.sSMYrx = C58196ywi.EZpvd(super.getContext(), this);
            this.QOLQEE = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.QOLQEE) {
            return null;
        }
        OLrzqt();
        return this.sSMYrx;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return OcIXYQ().aA_();
    }

    public C58196ywi DTwDnp() {
        return new C58196ywi(this);
    }

    public final C58196ywi OcIXYQ() {
        if (this.gHZMYf == null) {
            synchronized (this.zuBGHE) {
                if (this.gHZMYf == null) {
                    this.gHZMYf = DTwDnp();
                }
            }
        }
        return this.gHZMYf;
    }

    public void QKVWgx() {
        if (this.QKVWgx) {
            return;
        }
        this.QKVWgx = true;
        ((eQT) aA_()).copydefault((ePI) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
