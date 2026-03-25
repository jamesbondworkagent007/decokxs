package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.kqI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC29257kqI extends AbstractC26071jQw implements InterfaceC58208ywu {
    public volatile C58196ywi AEQbTJ;
    public android.content.ContextWrapper copydefault;
    public boolean valueOf;
    public final java.lang.Object AhwBna = new java.lang.Object();
    public boolean AYXKKw = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AhwBna();
        djBIcL();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.copydefault;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AhwBna();
        djBIcL();
    }

    private void AhwBna() {
        if (this.copydefault == null) {
            this.copydefault = C58196ywi.EZpvd(super.getContext(), this);
            this.valueOf = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.valueOf) {
            return null;
        }
        AhwBna();
        return this.copydefault;
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

    /* JADX DEBUG: Possible override for method o.jQw.AYXKKw()V */
    public C58196ywi AYXKKw() {
        return new C58196ywi(this);
    }

    /* JADX DEBUG: Possible override for method o.jQw.valueOf()V */
    public final C58196ywi valueOf() {
        if (this.AEQbTJ == null) {
            synchronized (this.AhwBna) {
                if (this.AEQbTJ == null) {
                    this.AEQbTJ = AYXKKw();
                }
            }
        }
        return this.AEQbTJ;
    }

    public void djBIcL() {
        if (this.AYXKKw) {
            return;
        }
        this.AYXKKw = true;
        ((InterfaceC29330krc) aA_()).AEQbTJ((C29333krf) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
