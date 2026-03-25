package o;

import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: o.jVf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC26189jVf<VB extends ViewBinding> extends AbstractC21846hOm<VB> implements InterfaceC58208ywu {
    public volatile C58196ywi AEQbTJ;
    public boolean EZpvd;
    public android.content.ContextWrapper copydefault;
    public final java.lang.Object KWHzl = new java.lang.Object();
    public boolean gEmmrt = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        gEmmrt();
        valueOf();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.copydefault;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        gEmmrt();
        valueOf();
    }

    private void gEmmrt() {
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
        gEmmrt();
        return this.copydefault;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return aY_().aA_();
    }

    public C58196ywi OLrzqt() {
        return new C58196ywi(this);
    }

    public final C58196ywi aY_() {
        if (this.AEQbTJ == null) {
            synchronized (this.KWHzl) {
                if (this.AEQbTJ == null) {
                    this.AEQbTJ = OLrzqt();
                }
            }
        }
        return this.AEQbTJ;
    }

    public void valueOf() {
        if (this.gEmmrt) {
            return;
        }
        this.gEmmrt = true;
        ((jVC) aA_()).copydefault((C26205jVv) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
