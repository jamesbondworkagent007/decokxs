package o;

import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.market.home.favorites.MarketFavQuoteFragment;

/* JADX INFO: renamed from: o.kEd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC27810kEd extends AbstractC27795kDq implements InterfaceC58208ywu {
    public boolean AYXKKw;
    public android.content.ContextWrapper gEmmrt;
    public volatile C58196ywi valueOf;
    public final java.lang.Object djBIcL = new java.lang.Object();
    public boolean AhwBna = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AEQbTJ();
        DbNXlk();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.gEmmrt;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AEQbTJ();
        DbNXlk();
    }

    private void AEQbTJ() {
        if (this.gEmmrt == null) {
            this.gEmmrt = C58196ywi.EZpvd(super.getContext(), this);
            this.AYXKKw = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AYXKKw) {
            return null;
        }
        AEQbTJ();
        return this.gEmmrt;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return djBIcL().aA_();
    }

    public C58196ywi isConnected() {
        return new C58196ywi(this);
    }

    public final C58196ywi djBIcL() {
        if (this.valueOf == null) {
            synchronized (this.djBIcL) {
                if (this.valueOf == null) {
                    this.valueOf = isConnected();
                }
            }
        }
        return this.valueOf;
    }

    public void DbNXlk() {
        if (this.AhwBna) {
            return;
        }
        this.AhwBna = true;
        ((InterfaceC27824kEr) aA_()).copydefault((MarketFavQuoteFragment) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
