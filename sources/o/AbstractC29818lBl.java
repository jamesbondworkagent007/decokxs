package o;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.lBl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC29818lBl<T extends ViewDataBinding> extends lzN<T> implements InterfaceC58208ywu {
    public android.content.ContextWrapper AYXKKw;
    public boolean DbNXlk;
    public volatile C58196ywi djBIcL;
    public final java.lang.Object gEmmrt;
    public boolean values;

    public AbstractC29818lBl(int i) {
        super(i);
        this.gEmmrt = new java.lang.Object();
        this.values = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        fIwbmz();
        AkhnZx();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AYXKKw;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        fIwbmz();
        AkhnZx();
    }

    private void fIwbmz() {
        if (this.AYXKKw == null) {
            this.AYXKKw = C58196ywi.EZpvd(super.getContext(), this);
            this.DbNXlk = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.DbNXlk) {
            return null;
        }
        fIwbmz();
        return this.AYXKKw;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return isConnected().aA_();
    }

    public C58196ywi fetchVPNInfo() {
        return new C58196ywi(this);
    }

    public final C58196ywi isConnected() {
        if (this.djBIcL == null) {
            synchronized (this.gEmmrt) {
                if (this.djBIcL == null) {
                    this.djBIcL = fetchVPNInfo();
                }
            }
        }
        return this.djBIcL;
    }

    public void AkhnZx() {
        if (this.values) {
            return;
        }
        this.values = true;
        ((InterfaceC29844lCk) aA_()).KWHzl((lBI) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
