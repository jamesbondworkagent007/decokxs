package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.eIr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15447eIr extends eHM implements InterfaceC58208ywu {
    public volatile C58196ywi AEQbTJ;
    public android.content.ContextWrapper EZpvd;
    public final java.lang.Object djBIcL = new java.lang.Object();
    public boolean gEmmrt = false;
    public boolean valueOf;

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AEQbTJ();
        AhwBna();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.EZpvd;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AEQbTJ();
        AhwBna();
    }

    private void AEQbTJ() {
        if (this.EZpvd == null) {
            this.EZpvd = C58196ywi.EZpvd(super.getContext(), this);
            this.valueOf = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.valueOf) {
            return null;
        }
        AEQbTJ();
        return this.EZpvd;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return AYXKKw().aA_();
    }

    public C58196ywi valueOf() {
        return new C58196ywi(this);
    }

    public final C58196ywi AYXKKw() {
        if (this.AEQbTJ == null) {
            synchronized (this.djBIcL) {
                if (this.AEQbTJ == null) {
                    this.AEQbTJ = valueOf();
                }
            }
        }
        return this.AEQbTJ;
    }

    public void AhwBna() {
        if (this.gEmmrt) {
            return;
        }
        this.gEmmrt = true;
        ((eHW) aA_()).KWHzl((eHZ) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
