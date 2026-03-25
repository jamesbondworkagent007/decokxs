package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.wwj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC54034wwj extends AbstractC32996moC implements InterfaceC58208ywu {
    public volatile C58196ywi AYXKKw;
    public boolean DbNXlk;
    public android.content.ContextWrapper djBIcL;
    public final java.lang.Object isConnected = new java.lang.Object();
    public boolean values = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        KWHzl();
        gEmmrt();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.djBIcL;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        KWHzl();
        gEmmrt();
    }

    private void KWHzl() {
        if (this.djBIcL == null) {
            this.djBIcL = C58196ywi.EZpvd(super.getContext(), this);
            this.DbNXlk = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.DbNXlk) {
            return null;
        }
        KWHzl();
        return this.djBIcL;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return AhwBna().aA_();
    }

    public C58196ywi AYXKKw() {
        return new C58196ywi(this);
    }

    public final C58196ywi AhwBna() {
        if (this.AYXKKw == null) {
            synchronized (this.isConnected) {
                if (this.AYXKKw == null) {
                    this.AYXKKw = AYXKKw();
                }
            }
        }
        return this.AYXKKw;
    }

    public void gEmmrt() {
        if (this.values) {
            return;
        }
        this.values = true;
        ((InterfaceC54030wwf) aA_()).EZpvd((C53970wvY) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
