package o;

import com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment;

/* JADX INFO: renamed from: o.qnv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC41287qnv extends MarketDiscoverSpotListFragment {
    public boolean AkhnZx = false;
    public android.content.ContextWrapper fetchVPNInfo;
    public boolean values;

    @Override // com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment, o.AbstractC41286qnu, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AEQbTJ();
        KWHzl();
    }

    @Override // com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment, o.AbstractC41286qnu, androidx.fragment.app.Fragment
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
            this.values = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment, o.AbstractC41286qnu, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.values) {
            return null;
        }
        AEQbTJ();
        return this.fetchVPNInfo;
    }

    @Override // com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment, o.AbstractC41286qnu, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.AbstractC41286qnu
    public void KWHzl() {
        if (this.AkhnZx) {
            return;
        }
        this.AkhnZx = true;
        ((InterfaceC41252qnM) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).EZpvd((C41255qnP) C58163ywB.EZpvd(this));
    }
}
