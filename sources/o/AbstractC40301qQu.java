package o;

import com.okinc.market.search.features.navigation.selection.ui.sub.SelectionSearchSpotListFragment;
import com.okinc.market.search.features.navigation.spot.NavSearchSpotListFragment;

/* JADX INFO: renamed from: o.qQu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC40301qQu extends NavSearchSpotListFragment {
    public android.content.ContextWrapper AEQbTJ;
    public boolean EZpvd;
    public boolean gEmmrt = false;

    @Override // com.okinc.market.search.features.navigation.spot.NavSearchSpotListFragment, o.AbstractC40324qRq, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AhwBna();
        KWHzl();
    }

    @Override // com.okinc.market.search.features.navigation.spot.NavSearchSpotListFragment, o.AbstractC40324qRq, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AEQbTJ;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AhwBna();
        KWHzl();
    }

    private void AhwBna() {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = C58196ywi.EZpvd(super.getContext(), this);
            this.EZpvd = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // com.okinc.market.search.features.navigation.spot.NavSearchSpotListFragment, o.AbstractC40324qRq, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.EZpvd) {
            return null;
        }
        AhwBna();
        return this.AEQbTJ;
    }

    @Override // com.okinc.market.search.features.navigation.spot.NavSearchSpotListFragment, o.AbstractC40324qRq, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.AbstractC40324qRq
    public void KWHzl() {
        if (this.gEmmrt) {
            return;
        }
        this.gEmmrt = true;
        ((qQS) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).KWHzl((SelectionSearchSpotListFragment) C58163ywB.EZpvd(this));
    }
}
