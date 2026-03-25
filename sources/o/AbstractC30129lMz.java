package o;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.lMz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC30129lMz<T extends ViewDataBinding> extends lzN<T> implements InterfaceC58208ywu {
    public android.content.ContextWrapper AYXKKw;
    public boolean DbNXlk;
    public final java.lang.Object djBIcL;
    public volatile C58196ywi gEmmrt;
    public boolean values;

    public AbstractC30129lMz(int i) {
        super(i);
        this.djBIcL = new java.lang.Object();
        this.values = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AuCTel();
        isConnected();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AYXKKw;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AuCTel();
        isConnected();
    }

    private void AuCTel() {
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
        AuCTel();
        return this.AYXKKw;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return fetchVPNInfo().aA_();
    }

    public C58196ywi AkhnZx() {
        return new C58196ywi(this);
    }

    public final C58196ywi fetchVPNInfo() {
        if (this.gEmmrt == null) {
            synchronized (this.djBIcL) {
                if (this.gEmmrt == null) {
                    this.gEmmrt = AkhnZx();
                }
            }
        }
        return this.gEmmrt;
    }

    public void isConnected() {
        if (this.values) {
            return;
        }
        this.values = true;
        ((lMR) aA_()).copydefault((lME) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
