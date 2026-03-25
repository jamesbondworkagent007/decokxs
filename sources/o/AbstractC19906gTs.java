package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.gTs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC19906gTs extends AbstractC52792wYn implements InterfaceC58208ywu {
    public android.content.ContextWrapper AEQbTJ;
    public boolean AYXKKw;
    public volatile C58196ywi OLrzqt;
    public final java.lang.Object KWHzl = new java.lang.Object();
    public boolean valueOf = false;

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        KWHzl();
        EZpvd();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AEQbTJ;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        KWHzl();
        EZpvd();
    }

    private void KWHzl() {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = C58196ywi.EZpvd(super.getContext(), this);
            this.AYXKKw = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AYXKKw) {
            return null;
        }
        KWHzl();
        return this.AEQbTJ;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
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
        if (this.OLrzqt == null) {
            synchronized (this.KWHzl) {
                if (this.OLrzqt == null) {
                    this.OLrzqt = AEQbTJ();
                }
            }
        }
        return this.OLrzqt;
    }

    public void EZpvd() {
        if (this.valueOf) {
            return;
        }
        this.valueOf = true;
        ((InterfaceC19901gTn) aA_()).copydefault((C19903gTp) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
