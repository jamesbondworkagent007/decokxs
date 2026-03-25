package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes7.dex */
public abstract class kIB extends AbstractC32998moE implements InterfaceC58208ywu {
    public boolean AubY;
    public android.content.ContextWrapper getFieldNames;
    public volatile C58196ywi uzCIH;
    public final java.lang.Object wlaJM = new java.lang.Object();
    public boolean zsXlph = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        OLrzqt();
        getNewProxyInstance();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.getFieldNames;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        OLrzqt();
        getNewProxyInstance();
    }

    private void OLrzqt() {
        if (this.getFieldNames == null) {
            this.getFieldNames = C58196ywi.EZpvd(super.getContext(), this);
            this.AubY = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AubY) {
            return null;
        }
        OLrzqt();
        return this.getFieldNames;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return fARcdN().aA_();
    }

    public C58196ywi fJNWhG() {
        return new C58196ywi(this);
    }

    public final C58196ywi fARcdN() {
        if (this.uzCIH == null) {
            synchronized (this.wlaJM) {
                if (this.uzCIH == null) {
                    this.uzCIH = fJNWhG();
                }
            }
        }
        return this.uzCIH;
    }

    public void getNewProxyInstance() {
        if (this.zsXlph) {
            return;
        }
        this.zsXlph = true;
        ((kIC) aA_()).OLrzqt((C27931kIq) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
