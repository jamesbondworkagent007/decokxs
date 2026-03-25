package o;

import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: o.kwB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC29568kwB<VB extends ViewBinding> extends AbstractC21846hOm<VB> implements InterfaceC58208ywu {
    public boolean AEQbTJ;
    public volatile C58196ywi KWHzl;
    public android.content.ContextWrapper copydefault;
    public final java.lang.Object EZpvd = new java.lang.Object();
    public boolean djBIcL = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AhwBna();
        djBIcL();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.copydefault;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AhwBna();
        djBIcL();
    }

    private void AhwBna() {
        if (this.copydefault == null) {
            this.copydefault = C58196ywi.EZpvd(super.getContext(), this);
            this.AEQbTJ = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AEQbTJ) {
            return null;
        }
        AhwBna();
        return this.copydefault;
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

    public C58196ywi AEQbTJ() {
        return new C58196ywi(this);
    }

    public final C58196ywi OLrzqt() {
        if (this.KWHzl == null) {
            synchronized (this.EZpvd) {
                if (this.KWHzl == null) {
                    this.KWHzl = AEQbTJ();
                }
            }
        }
        return this.KWHzl;
    }

    public void djBIcL() {
        if (this.djBIcL) {
            return;
        }
        this.djBIcL = true;
        ((InterfaceC29575kwI) aA_()).EZpvd((C29571kwE) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
