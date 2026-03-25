package o;

import com.okinc.market.search.features.navigation.result.NavSearchResultFragment;

/* JADX INFO: renamed from: o.qBt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC39895qBt extends NavSearchResultFragment {
    public android.content.ContextWrapper AEQbTJ;
    public boolean OLrzqt;
    public boolean copydefault = false;

    @Override // com.okinc.market.search.features.navigation.result.NavSearchResultFragment, o.qNC, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        values();
        AEQbTJ();
    }

    @Override // com.okinc.market.search.features.navigation.result.NavSearchResultFragment, o.qNC, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AEQbTJ;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        values();
        AEQbTJ();
    }

    private void values() {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = C58196ywi.EZpvd(super.getContext(), this);
            this.OLrzqt = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // com.okinc.market.search.features.navigation.result.NavSearchResultFragment, o.qNC, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.OLrzqt) {
            return null;
        }
        values();
        return this.AEQbTJ;
    }

    @Override // com.okinc.market.search.features.navigation.result.NavSearchResultFragment, o.qNC, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.qNC
    public void AEQbTJ() {
        if (this.copydefault) {
            return;
        }
        this.copydefault = true;
        ((InterfaceC39900qBy) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).copydefault((C39899qBx) C58163ywB.EZpvd(this));
    }
}
