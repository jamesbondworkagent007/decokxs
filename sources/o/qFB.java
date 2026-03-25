package o;

import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class qFB<T extends ViewBinding> extends AbstractC40007qFx<T> implements InterfaceC58208ywu {
    public boolean AhwBna;
    public android.content.ContextWrapper EZpvd;
    public volatile C58196ywi copydefault;
    public final java.lang.Object AYXKKw = new java.lang.Object();
    public boolean valueOf = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        gEmmrt();
        djBIcL();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.EZpvd;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        gEmmrt();
        djBIcL();
    }

    private void gEmmrt() {
        if (this.EZpvd == null) {
            this.EZpvd = C58196ywi.EZpvd(super.getContext(), this);
            this.AhwBna = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AhwBna) {
            return null;
        }
        gEmmrt();
        return this.EZpvd;
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

    /* JADX DEBUG: Possible override for method o.qFx.AhwBna()V */
    public C58196ywi AhwBna() {
        return new C58196ywi(this);
    }

    public final C58196ywi valueOf() {
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
        if (this.valueOf) {
            return;
        }
        this.valueOf = true;
        ((qFZ) aA_()).EZpvd((qFU) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
