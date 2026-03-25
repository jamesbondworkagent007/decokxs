package o;

import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gVW<VB extends ViewBinding> extends hTH<VB> implements InterfaceC58208ywu {
    public volatile C58196ywi AEQbTJ;
    public boolean AhwBna;
    public android.content.ContextWrapper OLrzqt;
    public final java.lang.Object djBIcL = new java.lang.Object();
    public boolean valueOf = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        OLrzqt();
        gEmmrt();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.OLrzqt;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        OLrzqt();
        gEmmrt();
    }

    private void OLrzqt() {
        if (this.OLrzqt == null) {
            this.OLrzqt = C58196ywi.EZpvd(super.getContext(), this);
            this.AhwBna = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AhwBna) {
            return null;
        }
        OLrzqt();
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
        if (this.AEQbTJ == null) {
            synchronized (this.djBIcL) {
                if (this.AEQbTJ == null) {
                    this.AEQbTJ = AEQbTJ();
                }
            }
        }
        return this.AEQbTJ;
    }

    public void gEmmrt() {
        if (this.valueOf) {
            return;
        }
        this.valueOf = true;
        ((gUX) aA_()).copydefault((gUV) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
