package o;

import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: o.lkQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC30927lkQ<VB extends ViewBinding> extends AbstractC7000aZw<VB> implements InterfaceC58208ywu {
    public boolean AEQbTJ;
    public volatile C58196ywi EZpvd;
    public android.content.ContextWrapper KWHzl;
    public final java.lang.Object copydefault = new java.lang.Object();
    public boolean AhwBna = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AYXKKw();
        djBIcL();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.KWHzl;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AYXKKw();
        djBIcL();
    }

    private void AYXKKw() {
        if (this.KWHzl == null) {
            this.KWHzl = C58196ywi.EZpvd(super.getContext(), this);
            this.AEQbTJ = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AEQbTJ) {
            return null;
        }
        AYXKKw();
        return this.KWHzl;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return OLrzqt().aA_();
    }

    public C58196ywi EZpvd() {
        return new C58196ywi(this);
    }

    public final C58196ywi OLrzqt() {
        if (this.EZpvd == null) {
            synchronized (this.copydefault) {
                if (this.EZpvd == null) {
                    this.EZpvd = EZpvd();
                }
            }
        }
        return this.EZpvd;
    }

    public void djBIcL() {
        if (this.AhwBna) {
            return;
        }
        this.AhwBna = true;
        ((InterfaceC30971llH) aA_()).OLrzqt((C31008lls) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
