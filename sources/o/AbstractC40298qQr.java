package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.qQr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC40298qQr extends C40151qLf implements InterfaceC58208ywu {
    public volatile C58196ywi AYXKKw;
    public boolean AhwBna;
    public android.content.ContextWrapper gEmmrt;
    public final java.lang.Object djBIcL = new java.lang.Object();
    public boolean valueOf = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AkhnZx();
        values();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.gEmmrt;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AkhnZx();
        values();
    }

    private void AkhnZx() {
        if (this.gEmmrt == null) {
            this.gEmmrt = C58196ywi.EZpvd(super.getContext(), this);
            this.AhwBna = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AhwBna) {
            return null;
        }
        AkhnZx();
        return this.gEmmrt;
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

    public C58196ywi AYXKKw() {
        return new C58196ywi(this);
    }

    /* JADX DEBUG: Possible override for method o.qLf.valueOf()V */
    public final C58196ywi valueOf() {
        if (this.AYXKKw == null) {
            synchronized (this.djBIcL) {
                if (this.AYXKKw == null) {
                    this.AYXKKw = AYXKKw();
                }
            }
        }
        return this.AYXKKw;
    }

    public void values() {
        if (this.valueOf) {
            return;
        }
        this.valueOf = true;
        ((qQC) aA_()).OLrzqt((qQB) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
