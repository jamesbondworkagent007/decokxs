package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.nxp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC35570nxp extends AbstractC32996moC implements InterfaceC58208ywu {
    public android.content.ContextWrapper AYXKKw;
    public final java.lang.Object AhwBna = new java.lang.Object();
    public boolean djBIcL = false;
    public boolean gEmmrt;
    public volatile C58196ywi valueOf;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        KWHzl();
        AYXKKw();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AYXKKw;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        KWHzl();
        AYXKKw();
    }

    private void KWHzl() {
        if (this.AYXKKw == null) {
            this.AYXKKw = C58196ywi.EZpvd(super.getContext(), this);
            this.gEmmrt = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.gEmmrt) {
            return null;
        }
        KWHzl();
        return this.AYXKKw;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return valueOf().aA_();
    }

    public C58196ywi djBIcL() {
        return new C58196ywi(this);
    }

    public final C58196ywi valueOf() {
        if (this.valueOf == null) {
            synchronized (this.AhwBna) {
                if (this.valueOf == null) {
                    this.valueOf = djBIcL();
                }
            }
        }
        return this.valueOf;
    }

    public void AYXKKw() {
        if (this.djBIcL) {
            return;
        }
        this.djBIcL = true;
        ((InterfaceC35571nxq) aA_()).AEQbTJ((C35563nxi) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
