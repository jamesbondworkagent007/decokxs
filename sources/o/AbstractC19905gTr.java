package o;

import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import com.okinc.business.dex.trade.copytrading.edit.ui.fragment.CopyTradingBuyInputPanelFragment;

/* JADX INFO: renamed from: o.gTr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC19905gTr<VB extends ViewBinding> extends AbstractC7000aZw<VB> implements InterfaceC58208ywu {
    public android.content.ContextWrapper AYXKKw;
    public boolean djBIcL;
    public volatile C58196ywi valueOf;
    public final java.lang.Object AhwBna = new java.lang.Object();
    public boolean fetchVPNInfo = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        OLrzqt();
        fetchVPNInfo();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AYXKKw;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        OLrzqt();
        fetchVPNInfo();
    }

    private void OLrzqt() {
        if (this.AYXKKw == null) {
            this.AYXKKw = C58196ywi.EZpvd(super.getContext(), this);
            this.djBIcL = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.djBIcL) {
            return null;
        }
        OLrzqt();
        return this.AYXKKw;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return AkhnZx().aA_();
    }

    public C58196ywi values() {
        return new C58196ywi(this);
    }

    public final C58196ywi AkhnZx() {
        if (this.valueOf == null) {
            synchronized (this.AhwBna) {
                if (this.valueOf == null) {
                    this.valueOf = values();
                }
            }
        }
        return this.valueOf;
    }

    public void fetchVPNInfo() {
        if (this.fetchVPNInfo) {
            return;
        }
        this.fetchVPNInfo = true;
        ((gST) aA_()).EZpvd((CopyTradingBuyInputPanelFragment) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
