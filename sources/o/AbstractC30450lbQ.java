package o;

import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.trade.features.home.ui.DexHomeFragment;

/* JADX INFO: renamed from: o.lbQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC30450lbQ extends AbstractC31214lpm implements InterfaceC58208ywu {
    public boolean DbNXlk;
    public volatile C58196ywi fetchVPNInfo;
    public android.content.ContextWrapper isConnected;
    public final java.lang.Object AkhnZx = new java.lang.Object();
    public boolean values = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AEQbTJ();
        fetchVPNInfo();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.isConnected;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AEQbTJ();
        fetchVPNInfo();
    }

    private void AEQbTJ() {
        if (this.isConnected == null) {
            this.isConnected = C58196ywi.EZpvd(super.getContext(), this);
            this.DbNXlk = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.DbNXlk) {
            return null;
        }
        AEQbTJ();
        return this.isConnected;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return AYXKKw().aA_();
    }

    public C58196ywi AkhnZx() {
        return new C58196ywi(this);
    }

    public final C58196ywi AYXKKw() {
        if (this.fetchVPNInfo == null) {
            synchronized (this.AkhnZx) {
                if (this.fetchVPNInfo == null) {
                    this.fetchVPNInfo = AkhnZx();
                }
            }
        }
        return this.fetchVPNInfo;
    }

    public void fetchVPNInfo() {
        if (this.values) {
            return;
        }
        this.values = true;
        ((InterfaceC30436lbC) aA_()).OLrzqt((DexHomeFragment) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
