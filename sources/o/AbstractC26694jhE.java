package o;

import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment;

/* JADX INFO: renamed from: o.jhE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC26694jhE extends BaseTransactionFragment implements InterfaceC58208ywu {
    public volatile C58196ywi EZpvd;
    public android.content.ContextWrapper OLrzqt;
    public boolean djBIcL;
    public final java.lang.Object gEmmrt = new java.lang.Object();
    public boolean AYXKKw = false;

    @Override // com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AhwBna();
        fARcdN();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.OLrzqt;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AhwBna();
        fARcdN();
    }

    private void AhwBna() {
        if (this.OLrzqt == null) {
            this.OLrzqt = C58196ywi.EZpvd(super.getContext(), this);
            this.djBIcL = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.djBIcL) {
            return null;
        }
        AhwBna();
        return this.OLrzqt;
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

    public C58196ywi AuCTel() {
        return new C58196ywi(this);
    }

    public final C58196ywi values() {
        if (this.EZpvd == null) {
            synchronized (this.gEmmrt) {
                if (this.EZpvd == null) {
                    this.EZpvd = AuCTel();
                }
            }
        }
        return this.EZpvd;
    }

    public void fARcdN() {
        if (this.AYXKKw) {
            return;
        }
        this.AYXKKw = true;
        ((InterfaceC26770jib) aA_()).AEQbTJ((C26707jhR) C58163ywB.EZpvd(this));
    }

    @Override // com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment, androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
