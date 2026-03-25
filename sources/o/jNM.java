package o;

import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes15.dex */
public abstract class jNM<VB extends ViewBinding> extends AbstractC21846hOm<VB> implements InterfaceC58208ywu {
    public android.content.ContextWrapper AYXKKw;
    public volatile C58196ywi gEmmrt;
    public boolean values;
    public final java.lang.Object djBIcL = new java.lang.Object();
    public boolean AkhnZx = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        OLrzqt();
        DbNXlk();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AYXKKw;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        OLrzqt();
        DbNXlk();
    }

    private void OLrzqt() {
        if (this.AYXKKw == null) {
            this.AYXKKw = C58196ywi.EZpvd(super.getContext(), this);
            this.values = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.values) {
            return null;
        }
        OLrzqt();
        return this.AYXKKw;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return AkhnZx().aA_();
    }

    public C58196ywi isConnected() {
        return new C58196ywi(this);
    }

    public final C58196ywi AkhnZx() {
        if (this.gEmmrt == null) {
            synchronized (this.djBIcL) {
                if (this.gEmmrt == null) {
                    this.gEmmrt = isConnected();
                }
            }
        }
        return this.gEmmrt;
    }

    public void DbNXlk() {
        if (this.AkhnZx) {
            return;
        }
        this.AkhnZx = true;
        ((jNH) aA_()).EZpvd((jND) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
