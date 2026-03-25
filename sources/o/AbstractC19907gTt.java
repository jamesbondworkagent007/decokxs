package o;

import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: o.gTt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC19907gTt<VB extends ViewBinding> extends AbstractC7000aZw<VB> implements InterfaceC58208ywu {
    public boolean AhwBna;
    public volatile C58196ywi djBIcL;
    public android.content.ContextWrapper valueOf;
    public final java.lang.Object AYXKKw = new java.lang.Object();
    public boolean gEmmrt = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AYXKKw();
        djBIcL();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.valueOf;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AYXKKw();
        djBIcL();
    }

    private void AYXKKw() {
        if (this.valueOf == null) {
            this.valueOf = C58196ywi.EZpvd(super.getContext(), this);
            this.AhwBna = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AhwBna) {
            return null;
        }
        AYXKKw();
        return this.valueOf;
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

    public C58196ywi OLrzqt() {
        return new C58196ywi(this);
    }

    public final C58196ywi EZpvd() {
        if (this.djBIcL == null) {
            synchronized (this.AYXKKw) {
                if (this.djBIcL == null) {
                    this.djBIcL = OLrzqt();
                }
            }
        }
        return this.djBIcL;
    }

    public void djBIcL() {
        if (this.gEmmrt) {
            return;
        }
        this.gEmmrt = true;
        ((InterfaceC19891gTd) aA_()).OLrzqt((C19888gTa) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
