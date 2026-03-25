package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.pkI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC39010pkI extends AbstractC39028pka implements InterfaceC58208ywu {
    public volatile C58196ywi AkhnZx;
    public boolean fetchVPNInfo;
    public android.content.ContextWrapper values;
    public final java.lang.Object DbNXlk = new java.lang.Object();
    public boolean isConnected = false;

    @Override // o.AbstractC39028pka, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AhwBna();
        AYXKKw();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.values;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AhwBna();
        AYXKKw();
    }

    private void AhwBna() {
        if (this.values == null) {
            this.values = C58196ywi.EZpvd(super.getContext(), this);
            this.fetchVPNInfo = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.fetchVPNInfo) {
            return null;
        }
        AhwBna();
        return this.values;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return valueOf().aA_();
    }

    public C58196ywi djBIcL() {
        return new C58196ywi(this);
    }

    public final C58196ywi valueOf() {
        if (this.AkhnZx == null) {
            synchronized (this.DbNXlk) {
                if (this.AkhnZx == null) {
                    this.AkhnZx = djBIcL();
                }
            }
        }
        return this.AkhnZx;
    }

    public void AYXKKw() {
        if (this.isConnected) {
            return;
        }
        this.isConnected = true;
        ((InterfaceC39026pkY) aA_()).AEQbTJ((C39014pkM) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
