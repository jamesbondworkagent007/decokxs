package o;

/* JADX INFO: renamed from: o.qmu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC41233qmu extends C41255qnP {
    public boolean AEQbTJ;
    public boolean EZpvd = false;
    public android.content.ContextWrapper copydefault;

    @Override // o.C41255qnP, o.AbstractC41287qnv, com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment, o.AbstractC41286qnu, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AEQbTJ();
        KWHzl();
    }

    @Override // o.C41255qnP, o.AbstractC41287qnv, com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment, o.AbstractC41286qnu, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.copydefault;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AEQbTJ();
        KWHzl();
    }

    private void AEQbTJ() {
        if (this.copydefault == null) {
            this.copydefault = C58196ywi.EZpvd(super.getContext(), this);
            this.AEQbTJ = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // o.C41255qnP, o.AbstractC41287qnv, com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment, o.AbstractC41286qnu, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AEQbTJ) {
            return null;
        }
        AEQbTJ();
        return this.copydefault;
    }

    @Override // o.C41255qnP, o.AbstractC41287qnv, com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment, o.AbstractC41286qnu, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.AbstractC41287qnv, o.AbstractC41286qnu
    public void KWHzl() {
        if (this.EZpvd) {
            return;
        }
        this.EZpvd = true;
        ((InterfaceC41198qmL) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).copydefault((C41199qmM) C58163ywB.EZpvd(this));
    }
}
