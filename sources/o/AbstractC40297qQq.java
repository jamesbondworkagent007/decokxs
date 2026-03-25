package o;

import com.okinc.market.search.features.navigation.favorites.NavSearchFavoritesListFragment;
import com.okinc.market.search.features.navigation.selection.ui.sub.SelectionNavSearchFavoriteFragments;

/* JADX INFO: renamed from: o.qQq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC40297qQq extends NavSearchFavoritesListFragment {
    public boolean EZpvd;
    public boolean KWHzl = false;
    public android.content.ContextWrapper copydefault;

    @Override // com.okinc.market.search.features.navigation.favorites.NavSearchFavoritesListFragment, o.AbstractC40140qKv, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        EZpvd();
        AEQbTJ();
    }

    @Override // com.okinc.market.search.features.navigation.favorites.NavSearchFavoritesListFragment, o.AbstractC40140qKv, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.copydefault;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        EZpvd();
        AEQbTJ();
    }

    private void EZpvd() {
        if (this.copydefault == null) {
            this.copydefault = C58196ywi.EZpvd(super.getContext(), this);
            this.EZpvd = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // com.okinc.market.search.features.navigation.favorites.NavSearchFavoritesListFragment, o.AbstractC40140qKv, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.EZpvd) {
            return null;
        }
        EZpvd();
        return this.copydefault;
    }

    @Override // com.okinc.market.search.features.navigation.favorites.NavSearchFavoritesListFragment, o.AbstractC40140qKv, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.AbstractC40140qKv
    public void AEQbTJ() {
        if (this.KWHzl) {
            return;
        }
        this.KWHzl = true;
        ((InterfaceC40306qQz) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).KWHzl((SelectionNavSearchFavoriteFragments) C58163ywB.EZpvd(this));
    }
}
