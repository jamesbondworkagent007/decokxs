package o;

import com.okinc.market.search.features.navigation.selection.ui.sub.SelectionSearchSpotListFragment;

/* JADX INFO: renamed from: o.qQv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC40302qQv extends SelectionSearchSpotListFragment {
    public boolean KWHzl = false;
    public boolean OLrzqt;
    public android.content.ContextWrapper copydefault;

    @Override // o.AbstractC40301qQu, com.okinc.market.search.features.navigation.spot.NavSearchSpotListFragment, o.AbstractC40324qRq, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        DbNXlk();
        KWHzl();
    }

    @Override // o.AbstractC40301qQu, com.okinc.market.search.features.navigation.spot.NavSearchSpotListFragment, o.AbstractC40324qRq, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.copydefault;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        DbNXlk();
        KWHzl();
    }

    private void DbNXlk() {
        if (this.copydefault == null) {
            this.copydefault = C58196ywi.EZpvd(super.getContext(), this);
            this.OLrzqt = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // o.AbstractC40301qQu, com.okinc.market.search.features.navigation.spot.NavSearchSpotListFragment, o.AbstractC40324qRq, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.OLrzqt) {
            return null;
        }
        DbNXlk();
        return this.copydefault;
    }

    @Override // o.AbstractC40301qQu, com.okinc.market.search.features.navigation.spot.NavSearchSpotListFragment, o.AbstractC40324qRq, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.AbstractC40301qQu, o.AbstractC40324qRq
    public void KWHzl() {
        if (this.KWHzl) {
            return;
        }
        this.KWHzl = true;
        ((qQJ) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).AEQbTJ((qQM) C58163ywB.EZpvd(this));
    }
}
