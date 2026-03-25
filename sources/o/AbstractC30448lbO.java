package o;

import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: o.lbO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC30448lbO<VB extends ViewBinding> extends hTH<VB> implements InterfaceC58208ywu {
    public final java.lang.Object AEQbTJ = new java.lang.Object();
    public boolean EZpvd = false;
    public boolean KWHzl;
    public android.content.ContextWrapper OLrzqt;
    public volatile C58196ywi copydefault;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        KWHzl();
        OLrzqt();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.OLrzqt;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        KWHzl();
        OLrzqt();
    }

    private void KWHzl() {
        if (this.OLrzqt == null) {
            this.OLrzqt = C58196ywi.EZpvd(super.getContext(), this);
            this.KWHzl = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.KWHzl) {
            return null;
        }
        KWHzl();
        return this.OLrzqt;
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
        if (this.copydefault == null) {
            synchronized (this.AEQbTJ) {
                if (this.copydefault == null) {
                    this.copydefault = AEQbTJ();
                }
            }
        }
        return this.copydefault;
    }

    public void OLrzqt() {
        if (this.EZpvd) {
            return;
        }
        this.EZpvd = true;
        ((InterfaceC30392laL) aA_()).OLrzqt((C30393laM) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
