package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.aEz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC5892aEz extends AbstractC32996moC implements InterfaceC58208ywu {
    public boolean AhwBna;
    public android.content.ContextWrapper KWHzl;
    public volatile C58196ywi djBIcL;
    public final java.lang.Object AYXKKw = new java.lang.Object();
    public boolean valueOf = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        KWHzl();
        gEmmrt();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.KWHzl;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        KWHzl();
        gEmmrt();
    }

    private void KWHzl() {
        if (this.KWHzl == null) {
            this.KWHzl = C58196ywi.EZpvd(super.getContext(), this);
            this.AhwBna = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AhwBna) {
            return null;
        }
        KWHzl();
        return this.KWHzl;
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

    public C58196ywi AhwBna() {
        return new C58196ywi(this);
    }

    public final C58196ywi EZpvd() {
        if (this.djBIcL == null) {
            synchronized (this.AYXKKw) {
                if (this.djBIcL == null) {
                    this.djBIcL = AhwBna();
                }
            }
        }
        return this.djBIcL;
    }

    public void gEmmrt() {
        if (this.valueOf) {
            return;
        }
        this.valueOf = true;
        ((InterfaceC5888aEv) aA_()).KWHzl((C5887aEu) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
