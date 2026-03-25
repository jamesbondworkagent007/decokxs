package o;

import com.okinc.market.search.features.navigation.futures.NavSearchFuturesListFragment;

/* JADX INFO: renamed from: o.qBr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC39893qBr extends NavSearchFuturesListFragment {
    public boolean AEQbTJ = false;
    public android.content.ContextWrapper KWHzl;
    public boolean copydefault;

    @Override // com.okinc.market.search.features.navigation.futures.NavSearchFuturesListFragment, o.AbstractC40152qLg, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        fIwbmz();
        EZpvd();
    }

    @Override // com.okinc.market.search.features.navigation.futures.NavSearchFuturesListFragment, o.AbstractC40152qLg, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.KWHzl;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        fIwbmz();
        EZpvd();
    }

    private void fIwbmz() {
        if (this.KWHzl == null) {
            this.KWHzl = C58196ywi.EZpvd(super.getContext(), this);
            this.copydefault = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // com.okinc.market.search.features.navigation.futures.NavSearchFuturesListFragment, o.AbstractC40152qLg, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.copydefault) {
            return null;
        }
        fIwbmz();
        return this.KWHzl;
    }

    @Override // com.okinc.market.search.features.navigation.futures.NavSearchFuturesListFragment, o.AbstractC40152qLg, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.AbstractC40152qLg
    public void EZpvd() {
        if (this.AEQbTJ) {
            return;
        }
        this.AEQbTJ = true;
        ((qBC) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).copydefault((qBD) C58163ywB.EZpvd(this));
    }
}
