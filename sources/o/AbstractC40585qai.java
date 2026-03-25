package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.qai, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC40585qai extends AbstractC40579qac implements InterfaceC58208ywu {
    public boolean AYXKKw;
    public final java.lang.Object AhwBna = new java.lang.Object();
    public boolean DbNXlk = false;
    public android.content.ContextWrapper djBIcL;
    public volatile C58196ywi valueOf;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        OLrzqt();
        djBIcL();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.djBIcL;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        OLrzqt();
        djBIcL();
    }

    private void OLrzqt() {
        if (this.djBIcL == null) {
            this.djBIcL = C58196ywi.EZpvd(super.getContext(), this);
            this.AYXKKw = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AYXKKw) {
            return null;
        }
        OLrzqt();
        return this.djBIcL;
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

    public C58196ywi gEmmrt() {
        return new C58196ywi(this);
    }

    public final C58196ywi valueOf() {
        if (this.valueOf == null) {
            synchronized (this.AhwBna) {
                if (this.valueOf == null) {
                    this.valueOf = gEmmrt();
                }
            }
        }
        return this.valueOf;
    }

    public void djBIcL() {
        if (this.DbNXlk) {
            return;
        }
        this.DbNXlk = true;
        ((InterfaceC40584qah) aA_()).EZpvd((pZZ) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
