package o;

import com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment;

/* JADX INFO: renamed from: o.qlk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC41170qlk extends MarketDiscoverFuturesListFragment {
    public boolean AYXKKw = false;
    public boolean djBIcL;
    public android.content.ContextWrapper valueOf;

    @Override // com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment, o.AbstractC40708qcz, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AuCTel();
        KWHzl();
    }

    @Override // com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment, o.AbstractC40708qcz, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.valueOf;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AuCTel();
        KWHzl();
    }

    private void AuCTel() {
        if (this.valueOf == null) {
            this.valueOf = C58196ywi.EZpvd(super.getContext(), this);
            this.djBIcL = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment, o.AbstractC40708qcz, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.djBIcL) {
            return null;
        }
        AuCTel();
        return this.valueOf;
    }

    @Override // com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment, o.AbstractC40708qcz, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.AbstractC40708qcz
    public void KWHzl() {
        if (this.AYXKKw) {
            return;
        }
        this.AYXKKw = true;
        ((InterfaceC41182qlw) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).EZpvd((C41179qlt) C58163ywB.EZpvd(this));
    }
}
