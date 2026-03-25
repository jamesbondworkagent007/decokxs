package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.lPg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC30192lPg extends AbstractC32998moE implements InterfaceC58208ywu {
    public volatile C58196ywi AYXKKw;
    public android.content.ContextWrapper gEmmrt;
    public boolean values;
    public final java.lang.Object valueOf = new java.lang.Object();
    public boolean fetchVPNInfo = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        OLrzqt();
        gEmmrt();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.gEmmrt;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        OLrzqt();
        gEmmrt();
    }

    private void OLrzqt() {
        if (this.gEmmrt == null) {
            this.gEmmrt = C58196ywi.EZpvd(super.getContext(), this);
            this.values = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.values) {
            return null;
        }
        OLrzqt();
        return this.gEmmrt;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return AEQbTJ().aA_();
    }

    public C58196ywi valueOf() {
        return new C58196ywi(this);
    }

    public final C58196ywi AEQbTJ() {
        if (this.AYXKKw == null) {
            synchronized (this.valueOf) {
                if (this.AYXKKw == null) {
                    this.AYXKKw = valueOf();
                }
            }
        }
        return this.AYXKKw;
    }

    public void gEmmrt() {
        if (this.fetchVPNInfo) {
            return;
        }
        this.fetchVPNInfo = true;
        ((lOU) aA_()).OLrzqt((lOR) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
