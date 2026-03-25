package o;

import com.okinc.market.search.features.navigation.favorites.NavSearchFavoritesListFragment;

/* JADX INFO: renamed from: o.qBp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC39891qBp extends NavSearchFavoritesListFragment {
    public android.content.ContextWrapper EZpvd;
    public boolean OLrzqt = false;
    public boolean copydefault;

    @Override // com.okinc.market.search.features.navigation.favorites.NavSearchFavoritesListFragment, o.AbstractC40140qKv, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        EZpvd();
        AEQbTJ();
    }

    @Override // com.okinc.market.search.features.navigation.favorites.NavSearchFavoritesListFragment, o.AbstractC40140qKv, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.EZpvd;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        EZpvd();
        AEQbTJ();
    }

    private void EZpvd() {
        if (this.EZpvd == null) {
            this.EZpvd = C58196ywi.EZpvd(super.getContext(), this);
            this.copydefault = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // com.okinc.market.search.features.navigation.favorites.NavSearchFavoritesListFragment, o.AbstractC40140qKv, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.copydefault) {
            return null;
        }
        EZpvd();
        return this.EZpvd;
    }

    @Override // com.okinc.market.search.features.navigation.favorites.NavSearchFavoritesListFragment, o.AbstractC40140qKv, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.AbstractC40140qKv
    public void AEQbTJ() {
        if (this.OLrzqt) {
            return;
        }
        this.OLrzqt = true;
        ((InterfaceC39901qBz) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).EZpvd((C39898qBw) C58163ywB.EZpvd(this));
    }
}
