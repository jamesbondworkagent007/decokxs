package o;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.lBg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC29813lBg<T extends ViewDataBinding> extends lzN<T> implements InterfaceC58208ywu {
    public volatile C58196ywi AYXKKw;
    public android.content.ContextWrapper djBIcL;
    public final java.lang.Object gEmmrt;
    public boolean isConnected;
    public boolean values;

    public AbstractC29813lBg(int i) {
        super(i);
        this.gEmmrt = new java.lang.Object();
        this.isConnected = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        ejfBZ();
        fetchVPNInfo();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.djBIcL;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        ejfBZ();
        fetchVPNInfo();
    }

    private void ejfBZ() {
        if (this.djBIcL == null) {
            this.djBIcL = C58196ywi.EZpvd(super.getContext(), this);
            this.values = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.values) {
            return null;
        }
        ejfBZ();
        return this.djBIcL;
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
        if (this.AYXKKw == null) {
            synchronized (this.gEmmrt) {
                if (this.AYXKKw == null) {
                    this.AYXKKw = isConnected();
                }
            }
        }
        return this.AYXKKw;
    }

    public void fetchVPNInfo() {
        if (this.isConnected) {
            return;
        }
        this.isConnected = true;
        ((InterfaceC29824lBr) aA_()).AEQbTJ((C29827lBu) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
