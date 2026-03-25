package o;

import com.okinc.market.search.features.navigation.futures.NavSearchFuturesListFragment;
import com.okinc.market.search.features.navigation.selection.ui.sub.SelectionSearchFuturesListFragment;

/* JADX INFO: renamed from: o.qQy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC40305qQy extends NavSearchFuturesListFragment {
    public boolean AEQbTJ;
    public boolean KWHzl = false;
    public android.content.ContextWrapper copydefault;

    @Override // com.okinc.market.search.features.navigation.futures.NavSearchFuturesListFragment, o.AbstractC40152qLg, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        fARcdN();
        EZpvd();
    }

    @Override // com.okinc.market.search.features.navigation.futures.NavSearchFuturesListFragment, o.AbstractC40152qLg, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.copydefault;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        fARcdN();
        EZpvd();
    }

    private void fARcdN() {
        if (this.copydefault == null) {
            this.copydefault = C58196ywi.EZpvd(super.getContext(), this);
            this.AEQbTJ = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // com.okinc.market.search.features.navigation.futures.NavSearchFuturesListFragment, o.AbstractC40152qLg, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AEQbTJ) {
            return null;
        }
        fARcdN();
        return this.copydefault;
    }

    @Override // com.okinc.market.search.features.navigation.futures.NavSearchFuturesListFragment, o.AbstractC40152qLg, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.AbstractC40152qLg
    public void EZpvd() {
        if (this.KWHzl) {
            return;
        }
        this.KWHzl = true;
        ((qQL) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).KWHzl((SelectionSearchFuturesListFragment) C58163ywB.EZpvd(this));
    }
}
