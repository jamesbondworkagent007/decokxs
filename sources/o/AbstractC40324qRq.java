package o;

import androidx.lifecycle.ViewModelProvider;
import com.okinc.market.quotation.ui.AbsQuotationFragment;
import com.okinc.market.search.features.navigation.spot.NavSearchSpotListFragment;

/* JADX INFO: renamed from: o.qRq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC40324qRq extends AbsQuotationFragment implements InterfaceC58208ywu {
    public android.content.ContextWrapper fetchVPNInfo;
    public boolean isConnected;
    public volatile C58196ywi values;
    public final java.lang.Object DbNXlk = new java.lang.Object();
    public boolean AkhnZx = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AEQbTJ();
        KWHzl();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.fetchVPNInfo;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AEQbTJ();
        KWHzl();
    }

    private void AEQbTJ() {
        if (this.fetchVPNInfo == null) {
            this.fetchVPNInfo = C58196ywi.EZpvd(super.getContext(), this);
            this.isConnected = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.isConnected) {
            return null;
        }
        AEQbTJ();
        return this.fetchVPNInfo;
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

    public C58196ywi valueOf() {
        return new C58196ywi(this);
    }

    public final C58196ywi AYXKKw() {
        if (this.values == null) {
            synchronized (this.DbNXlk) {
                if (this.values == null) {
                    this.values = valueOf();
                }
            }
        }
        return this.values;
    }

    public void KWHzl() {
        if (this.AkhnZx) {
            return;
        }
        this.AkhnZx = true;
        ((qRG) aA_()).OLrzqt((NavSearchSpotListFragment) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
