package o;

import com.okinc.market.search.features.navigation.futures.NavSearchFuturesListFragment;
import com.okinc.market.search.features.navigation.voucher.sub.ContractVoucherNavSearchFuturesListFragment;

/* JADX INFO: renamed from: o.qSl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC40346qSl extends NavSearchFuturesListFragment {
    public boolean AuCTel;
    public boolean ejfBZ = false;
    public android.content.ContextWrapper fARcdN;

    @Override // com.okinc.market.search.features.navigation.futures.NavSearchFuturesListFragment, o.AbstractC40152qLg, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AuCTel();
        EZpvd();
    }

    @Override // com.okinc.market.search.features.navigation.futures.NavSearchFuturesListFragment, o.AbstractC40152qLg, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.fARcdN;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AuCTel();
        EZpvd();
    }

    private void AuCTel() {
        if (this.fARcdN == null) {
            this.fARcdN = C58196ywi.EZpvd(super.getContext(), this);
            this.AuCTel = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // com.okinc.market.search.features.navigation.futures.NavSearchFuturesListFragment, o.AbstractC40152qLg, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AuCTel) {
            return null;
        }
        AuCTel();
        return this.fARcdN;
    }

    @Override // com.okinc.market.search.features.navigation.futures.NavSearchFuturesListFragment, o.AbstractC40152qLg, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.AbstractC40152qLg
    public void EZpvd() {
        if (this.ejfBZ) {
            return;
        }
        this.ejfBZ = true;
        ((InterfaceC40347qSm) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).OLrzqt((ContractVoucherNavSearchFuturesListFragment) C58163ywB.EZpvd(this));
    }
}
