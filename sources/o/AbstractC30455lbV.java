package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.lbV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC30455lbV extends AbstractC31214lpm implements InterfaceC58208ywu {
    public android.content.ContextWrapper AYXKKw;
    public boolean AhwBna;
    public volatile C58196ywi gEmmrt;
    public final java.lang.Object valueOf = new java.lang.Object();
    public boolean AkhnZx = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        EZpvd();
        AhwBna();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AYXKKw;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        EZpvd();
        AhwBna();
    }

    private void EZpvd() {
        if (this.AYXKKw == null) {
            this.AYXKKw = C58196ywi.EZpvd(super.getContext(), this);
            this.AhwBna = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AhwBna) {
            return null;
        }
        EZpvd();
        return this.AYXKKw;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return djBIcL().aA_();
    }

    public C58196ywi valueOf() {
        return new C58196ywi(this);
    }

    public final C58196ywi djBIcL() {
        if (this.gEmmrt == null) {
            synchronized (this.valueOf) {
                if (this.gEmmrt == null) {
                    this.gEmmrt = valueOf();
                }
            }
        }
        return this.gEmmrt;
    }

    public void AhwBna() {
        if (this.AkhnZx) {
            return;
        }
        this.AkhnZx = true;
        ((InterfaceC30444lbK) aA_()).KWHzl((C30484lby) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
