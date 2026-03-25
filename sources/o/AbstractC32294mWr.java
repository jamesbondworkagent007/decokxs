package o;

import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: o.mWr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC32294mWr<VB extends ViewBinding> extends mRH<VB> implements InterfaceC58208ywu {
    public volatile C58196ywi djBIcL;
    public android.content.ContextWrapper gEmmrt;
    public boolean isConnected;
    public final java.lang.Object values = new java.lang.Object();
    public boolean AkhnZx = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AEQbTJ();
        AYXKKw();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.gEmmrt;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AEQbTJ();
        AYXKKw();
    }

    private void AEQbTJ() {
        if (this.gEmmrt == null) {
            this.gEmmrt = C58196ywi.EZpvd(super.getContext(), this);
            this.isConnected = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.isConnected) {
            return null;
        }
        AEQbTJ();
        return this.gEmmrt;
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

    public C58196ywi valueOf() {
        return new C58196ywi(this);
    }

    public final C58196ywi gEmmrt() {
        if (this.djBIcL == null) {
            synchronized (this.values) {
                if (this.djBIcL == null) {
                    this.djBIcL = valueOf();
                }
            }
        }
        return this.djBIcL;
    }

    public void AYXKKw() {
        if (this.AkhnZx) {
            return;
        }
        this.AkhnZx = true;
        ((InterfaceC32293mWq) aA_()).OLrzqt((C32283mWg) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
