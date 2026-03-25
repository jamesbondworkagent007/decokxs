package o;

import com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment;

/* JADX INFO: renamed from: o.qli, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC41168qli extends MarketDiscoverFuturesListFragment {
    public boolean AYXKKw;
    public android.content.ContextWrapper djBIcL;
    public boolean valueOf = false;

    @Override // com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment, o.AbstractC40708qcz, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        fIwbmz();
        KWHzl();
    }

    @Override // com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment, o.AbstractC40708qcz, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.djBIcL;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        fIwbmz();
        KWHzl();
    }

    private void fIwbmz() {
        if (this.djBIcL == null) {
            this.djBIcL = C58196ywi.EZpvd(super.getContext(), this);
            this.AYXKKw = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment, o.AbstractC40708qcz, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AYXKKw) {
            return null;
        }
        fIwbmz();
        return this.djBIcL;
    }

    @Override // com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment, o.AbstractC40708qcz, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.AbstractC40708qcz
    public void KWHzl() {
        if (this.valueOf) {
            return;
        }
        this.valueOf = true;
        ((InterfaceC41138qlE) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).OLrzqt((C41137qlD) C58163ywB.EZpvd(this));
    }
}
