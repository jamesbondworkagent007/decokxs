package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.kwa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC29593kwa extends AbstractC26071jQw implements InterfaceC58208ywu {
    public android.content.ContextWrapper AEQbTJ;
    public volatile C58196ywi copydefault;
    public boolean valueOf;
    public final java.lang.Object AYXKKw = new java.lang.Object();
    public boolean djBIcL = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        valueOf();
        djBIcL();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AEQbTJ;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        valueOf();
        djBIcL();
    }

    private void valueOf() {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = C58196ywi.EZpvd(super.getContext(), this);
            this.valueOf = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.valueOf) {
            return null;
        }
        valueOf();
        return this.AEQbTJ;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return AYXKKw().aA_();
    }

    /* JADX DEBUG: Possible override for method o.jQw.AhwBna()V */
    public C58196ywi AhwBna() {
        return new C58196ywi(this);
    }

    /* JADX DEBUG: Possible override for method o.jQw.AYXKKw()V */
    public final C58196ywi AYXKKw() {
        if (this.copydefault == null) {
            synchronized (this.AYXKKw) {
                if (this.copydefault == null) {
                    this.copydefault = AhwBna();
                }
            }
        }
        return this.copydefault;
    }

    public void djBIcL() {
        if (this.djBIcL) {
            return;
        }
        this.djBIcL = true;
        ((InterfaceC29611kws) aA_()).KWHzl((C29610kwr) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
