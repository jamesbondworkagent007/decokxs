package o;

import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import com.okinc.market.search.features.favorite.ui.FavoriteSearchResultOptionsFragment;

/* JADX INFO: renamed from: o.qyS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC41841qyS<T extends ViewBinding> extends AbstractC41852qyd<T> implements InterfaceC58208ywu {
    public volatile C58196ywi AhwBna;
    public android.content.ContextWrapper gEmmrt;
    public boolean values;
    public final java.lang.Object fetchVPNInfo = new java.lang.Object();
    public boolean AkhnZx = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        valueOf();
        ejfBZ();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.gEmmrt;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        valueOf();
        ejfBZ();
    }

    private void valueOf() {
        if (this.gEmmrt == null) {
            this.gEmmrt = C58196ywi.EZpvd(super.getContext(), this);
            this.values = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.values) {
            return null;
        }
        valueOf();
        return this.gEmmrt;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return isConnected().aA_();
    }

    public C58196ywi DbNXlk() {
        return new C58196ywi(this);
    }

    public final C58196ywi isConnected() {
        if (this.AhwBna == null) {
            synchronized (this.fetchVPNInfo) {
                if (this.AhwBna == null) {
                    this.AhwBna = DbNXlk();
                }
            }
        }
        return this.AhwBna;
    }

    public void ejfBZ() {
        if (this.AkhnZx) {
            return;
        }
        this.AkhnZx = true;
        ((InterfaceC41828qyF) aA_()).EZpvd((FavoriteSearchResultOptionsFragment) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
