package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.keD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC28616keD extends wXX implements InterfaceC58208ywu {
    public android.content.ContextWrapper AEQbTJ;
    public volatile C58196ywi AYXKKw;
    public final java.lang.Object AhwBna = new java.lang.Object();
    public boolean djBIcL = false;
    public boolean gEmmrt;

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        EZpvd();
        valueOf();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AEQbTJ;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        EZpvd();
        valueOf();
    }

    private void EZpvd() {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = C58196ywi.EZpvd(super.getContext(), this);
            this.gEmmrt = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.gEmmrt) {
            return null;
        }
        EZpvd();
        return this.AEQbTJ;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return AhwBna().aA_();
    }

    public C58196ywi gEmmrt() {
        return new C58196ywi(this);
    }

    public final C58196ywi AhwBna() {
        if (this.AYXKKw == null) {
            synchronized (this.AhwBna) {
                if (this.AYXKKw == null) {
                    this.AYXKKw = gEmmrt();
                }
            }
        }
        return this.AYXKKw;
    }

    public void valueOf() {
        if (this.djBIcL) {
            return;
        }
        this.djBIcL = true;
        ((InterfaceC28615keC) aA_()).EZpvd((C28663key) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
