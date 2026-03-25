package o;

import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import com.okinc.market.search.features.favorite.ui.FavoriteSearchResultCoinFragment;

/* JADX INFO: renamed from: o.qyR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC41840qyR<T extends ViewBinding> extends AbstractC41852qyd<T> implements InterfaceC58208ywu {
    public android.content.ContextWrapper AYXKKw;
    public boolean fetchVPNInfo;
    public volatile C58196ywi values;
    public final java.lang.Object DbNXlk = new java.lang.Object();
    public boolean AkhnZx = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        valueOf();
        fIwbmz();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AYXKKw;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        valueOf();
        fIwbmz();
    }

    private void valueOf() {
        if (this.AYXKKw == null) {
            this.AYXKKw = C58196ywi.EZpvd(super.getContext(), this);
            this.fetchVPNInfo = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.fetchVPNInfo) {
            return null;
        }
        valueOf();
        return this.AYXKKw;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return fARcdN().aA_();
    }

    public C58196ywi fJNWhG() {
        return new C58196ywi(this);
    }

    public final C58196ywi fARcdN() {
        if (this.values == null) {
            synchronized (this.DbNXlk) {
                if (this.values == null) {
                    this.values = fJNWhG();
                }
            }
        }
        return this.values;
    }

    public void fIwbmz() {
        if (this.AkhnZx) {
            return;
        }
        this.AkhnZx = true;
        ((InterfaceC41823qyA) aA_()).EZpvd((FavoriteSearchResultCoinFragment) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
