package o;

import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gVY<VB extends ViewBinding> extends hTH<VB> implements InterfaceC58208ywu {
    public volatile C58196ywi AYXKKw;
    public boolean DbNXlk;
    public final java.lang.Object gEmmrt = new java.lang.Object();
    public boolean isConnected = false;
    public android.content.ContextWrapper valueOf;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AEQbTJ();
        AYXKKw();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.valueOf;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AEQbTJ();
        AYXKKw();
    }

    private void AEQbTJ() {
        if (this.valueOf == null) {
            this.valueOf = C58196ywi.EZpvd(super.getContext(), this);
            this.DbNXlk = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.DbNXlk) {
            return null;
        }
        AEQbTJ();
        return this.valueOf;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return gEmmrt().aA_();
    }

    public C58196ywi AhwBna() {
        return new C58196ywi(this);
    }

    public final C58196ywi gEmmrt() {
        if (this.AYXKKw == null) {
            synchronized (this.gEmmrt) {
                if (this.AYXKKw == null) {
                    this.AYXKKw = AhwBna();
                }
            }
        }
        return this.AYXKKw;
    }

    public void AYXKKw() {
        if (this.isConnected) {
            return;
        }
        this.isConnected = true;
        ((gVP) aA_()).OLrzqt((C19965gVx) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
