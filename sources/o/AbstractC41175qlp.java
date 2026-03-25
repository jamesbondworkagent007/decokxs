package o;

/* JADX INFO: renamed from: o.qlp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC41175qlp extends C40680qcX {
    public boolean AuCTel = false;
    public boolean fARcdN;
    public android.content.ContextWrapper fJNWhG;

    @Override // o.C40680qcX, o.AbstractC40661qcE, com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment, o.AbstractC40708qcz, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AuCTel();
        KWHzl();
    }

    @Override // o.C40680qcX, o.AbstractC40661qcE, com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment, o.AbstractC40708qcz, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.fJNWhG;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AuCTel();
        KWHzl();
    }

    private void AuCTel() {
        if (this.fJNWhG == null) {
            this.fJNWhG = C58196ywi.EZpvd(super.getContext(), this);
            this.fARcdN = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // o.C40680qcX, o.AbstractC40661qcE, com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment, o.AbstractC40708qcz, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.fARcdN) {
            return null;
        }
        AuCTel();
        return this.fJNWhG;
    }

    @Override // o.C40680qcX, o.AbstractC40661qcE, com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment, o.AbstractC40708qcz, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.AbstractC40661qcE, o.AbstractC40708qcz
    public void KWHzl() {
        if (this.AuCTel) {
            return;
        }
        this.AuCTel = true;
        ((InterfaceC41143qlJ) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).KWHzl((C41142qlI) C58163ywB.EZpvd(this));
    }
}
