package o;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes15.dex */
public abstract class lRS<T extends ViewDataBinding> extends AbstractC31907mIi<T> implements InterfaceC58208ywu {
    public final java.lang.Object AEQbTJ;
    public boolean EZpvd;
    public boolean KWHzl;
    public volatile C58196ywi OLrzqt;
    public android.content.ContextWrapper copydefault;

    public lRS(int i) {
        super(i);
        this.AEQbTJ = new java.lang.Object();
        this.EZpvd = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        OLrzqt();
        valueOf();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.copydefault;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        OLrzqt();
        valueOf();
    }

    private void OLrzqt() {
        if (this.copydefault == null) {
            this.copydefault = C58196ywi.EZpvd(super.getContext(), this);
            this.KWHzl = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.KWHzl) {
            return null;
        }
        OLrzqt();
        return this.copydefault;
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

    public C58196ywi AhwBna() {
        return new C58196ywi(this);
    }

    public final C58196ywi AEQbTJ() {
        if (this.OLrzqt == null) {
            synchronized (this.AEQbTJ) {
                if (this.OLrzqt == null) {
                    this.OLrzqt = AhwBna();
                }
            }
        }
        return this.OLrzqt;
    }

    public void valueOf() {
        if (this.EZpvd) {
            return;
        }
        this.EZpvd = true;
        ((InterfaceC30267lSa) aA_()).OLrzqt((lRV) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
