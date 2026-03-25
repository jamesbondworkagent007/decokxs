package o;

import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.dexui.main.dappredirect.DexDappRedirectTxDetailsFragment;

/* JADX INFO: renamed from: o.hIu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC21692hIu extends wXX implements InterfaceC58208ywu {
    public boolean DbNXlk;
    public volatile C58196ywi isConnected;
    public android.content.ContextWrapper values;
    public final java.lang.Object fetchVPNInfo = new java.lang.Object();
    public boolean ejfBZ = false;

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        EZpvd();
        valueOf();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.values;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        EZpvd();
        valueOf();
    }

    private void EZpvd() {
        if (this.values == null) {
            this.values = C58196ywi.EZpvd(super.getContext(), this);
            this.DbNXlk = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.DbNXlk) {
            return null;
        }
        EZpvd();
        return this.values;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return AYXKKw().aA_();
    }

    public C58196ywi djBIcL() {
        return new C58196ywi(this);
    }

    public final C58196ywi AYXKKw() {
        if (this.isConnected == null) {
            synchronized (this.fetchVPNInfo) {
                if (this.isConnected == null) {
                    this.isConnected = djBIcL();
                }
            }
        }
        return this.isConnected;
    }

    public void valueOf() {
        if (this.ejfBZ) {
            return;
        }
        this.ejfBZ = true;
        ((InterfaceC21682hIk) aA_()).AEQbTJ((DexDappRedirectTxDetailsFragment) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
