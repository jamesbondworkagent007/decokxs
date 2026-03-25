package o;

import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment;

/* JADX INFO: renamed from: o.ldU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC30560ldU<VB extends ViewBinding> extends hTH<VB> implements InterfaceC58208ywu {
    public android.content.ContextWrapper getFieldNames;
    public volatile C58196ywi getNewProxyInstance;
    public boolean uzCIH;
    public final java.lang.Object iwGUEr = new java.lang.Object();
    public boolean AuCTelauCTel = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        OLrzqt();
        gHZMYf();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.getFieldNames;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        OLrzqt();
        gHZMYf();
    }

    private void OLrzqt() {
        if (this.getFieldNames == null) {
            this.getFieldNames = C58196ywi.EZpvd(super.getContext(), this);
            this.uzCIH = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.uzCIH) {
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
        return zLjUOn().aA_();
    }

    public C58196ywi zsXlph() {
        return new C58196ywi(this);
    }

    public final C58196ywi zLjUOn() {
        if (this.getNewProxyInstance == null) {
            synchronized (this.iwGUEr) {
                if (this.getNewProxyInstance == null) {
                    this.getNewProxyInstance = zsXlph();
                }
            }
        }
        return this.getNewProxyInstance;
    }

    public void gHZMYf() {
        if (this.AuCTelauCTel) {
            return;
        }
        this.AuCTelauCTel = true;
        ((InterfaceC30562ldW) aA_()).KWHzl((AdvancedMainFragment) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
