package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes7.dex */
public abstract class kKW extends AbstractC32998moE implements InterfaceC58208ywu {
    public boolean AuCTelauCTel;
    public android.content.ContextWrapper getFieldNames;
    public volatile C58196ywi wlaJM;
    public final java.lang.Object zLjUOn = new java.lang.Object();
    public boolean AubY = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        OLrzqt();
        wlaJM();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.getFieldNames;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        OLrzqt();
        wlaJM();
    }

    private void OLrzqt() {
        if (this.getFieldNames == null) {
            this.getFieldNames = C58196ywi.EZpvd(super.getContext(), this);
            this.AuCTelauCTel = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AuCTelauCTel) {
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
        return iwGUEr().aA_();
    }

    public C58196ywi hDKMBd() {
        return new C58196ywi(this);
    }

    public final C58196ywi iwGUEr() {
        if (this.wlaJM == null) {
            synchronized (this.zLjUOn) {
                if (this.wlaJM == null) {
                    this.wlaJM = hDKMBd();
                }
            }
        }
        return this.wlaJM;
    }

    public void wlaJM() {
        if (this.AubY) {
            return;
        }
        this.AubY = true;
        ((kKZ) aA_()).KWHzl((kKI) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
