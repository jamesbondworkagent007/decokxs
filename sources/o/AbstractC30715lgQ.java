package o;

import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import com.okinc.business.trade.features.home.ui.cefi.placeorder.AdvancedPlaceOrderFragment;

/* JADX INFO: renamed from: o.lgQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC30715lgQ<VB extends ViewBinding> extends hTH<VB> implements InterfaceC58208ywu {
    public boolean getFieldNames;
    public android.content.ContextWrapper hDKMBd;
    public volatile C58196ywi uzCIH;
    public final java.lang.Object getNewProxyInstance = new java.lang.Object();
    public boolean zsXlph = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        OLrzqt();
        getFieldNames();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.hDKMBd;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        OLrzqt();
        getFieldNames();
    }

    private void OLrzqt() {
        if (this.hDKMBd == null) {
            this.hDKMBd = C58196ywi.EZpvd(super.getContext(), this);
            this.getFieldNames = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.getFieldNames) {
            return null;
        }
        OLrzqt();
        return this.hDKMBd;
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

    public C58196ywi getNewProxyInstance() {
        return new C58196ywi(this);
    }

    public final C58196ywi iwGUEr() {
        if (this.uzCIH == null) {
            synchronized (this.getNewProxyInstance) {
                if (this.uzCIH == null) {
                    this.uzCIH = getNewProxyInstance();
                }
            }
        }
        return this.uzCIH;
    }

    public void getFieldNames() {
        if (this.zsXlph) {
            return;
        }
        this.zsXlph = true;
        ((InterfaceC30708lgJ) aA_()).AEQbTJ((AdvancedPlaceOrderFragment) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
