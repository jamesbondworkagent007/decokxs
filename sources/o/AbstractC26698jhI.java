package o;

import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment;

/* JADX INFO: renamed from: o.jhI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC26698jhI extends BaseTransactionFragment implements InterfaceC58208ywu {
    public boolean AYXKKw;
    public android.content.ContextWrapper EZpvd;
    public volatile C58196ywi OLrzqt;
    public final java.lang.Object valueOf = new java.lang.Object();
    public boolean gEmmrt = false;

    @Override // com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AhwBna();
        fJNWhG();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.EZpvd;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AhwBna();
        fJNWhG();
    }

    private void AhwBna() {
        if (this.EZpvd == null) {
            this.EZpvd = C58196ywi.EZpvd(super.getContext(), this);
            this.AYXKKw = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AYXKKw) {
            return null;
        }
        AhwBna();
        return this.EZpvd;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return values().aA_();
    }

    public C58196ywi fIwbmz() {
        return new C58196ywi(this);
    }

    public final C58196ywi values() {
        if (this.OLrzqt == null) {
            synchronized (this.valueOf) {
                if (this.OLrzqt == null) {
                    this.OLrzqt = fIwbmz();
                }
            }
        }
        return this.OLrzqt;
    }

    public void fJNWhG() {
        if (this.gEmmrt) {
            return;
        }
        this.gEmmrt = true;
        ((InterfaceC26751jiI) aA_()).copydefault((C26782jin) C58163ywB.EZpvd(this));
    }

    @Override // com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment, androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
