package o;

/* JADX INFO: renamed from: o.qmw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC41235qmw extends C41255qnP {
    public android.content.ContextWrapper KWHzl;
    public boolean OLrzqt = false;
    public boolean copydefault;

    @Override // o.C41255qnP, o.AbstractC41287qnv, com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment, o.AbstractC41286qnu, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AEQbTJ();
        KWHzl();
    }

    @Override // o.C41255qnP, o.AbstractC41287qnv, com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment, o.AbstractC41286qnu, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.KWHzl;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AEQbTJ();
        KWHzl();
    }

    private void AEQbTJ() {
        if (this.KWHzl == null) {
            this.KWHzl = C58196ywi.EZpvd(super.getContext(), this);
            this.copydefault = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // o.C41255qnP, o.AbstractC41287qnv, com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment, o.AbstractC41286qnu, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.copydefault) {
            return null;
        }
        AEQbTJ();
        return this.KWHzl;
    }

    @Override // o.C41255qnP, o.AbstractC41287qnv, com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment, o.AbstractC41286qnu, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.AbstractC41287qnv, o.AbstractC41286qnu
    public void KWHzl() {
        if (this.OLrzqt) {
            return;
        }
        this.OLrzqt = true;
        ((InterfaceC41191qmE) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).OLrzqt((C41195qmI) C58163ywB.EZpvd(this));
    }
}
