package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes16.dex */
public abstract class pYA extends wXX implements InterfaceC58208ywu {
    public android.content.ContextWrapper AhwBna;
    public volatile C58196ywi DbNXlk;
    public boolean fetchVPNInfo;
    public final java.lang.Object AkhnZx = new java.lang.Object();
    public boolean isConnected = false;

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AEQbTJ();
        valueOf();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AhwBna;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AEQbTJ();
        valueOf();
    }

    private void AEQbTJ() {
        if (this.AhwBna == null) {
            this.AhwBna = C58196ywi.EZpvd(super.getContext(), this);
            this.fetchVPNInfo = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.fetchVPNInfo) {
            return null;
        }
        AEQbTJ();
        return this.AhwBna;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return gEmmrt().aA_();
    }

    public C58196ywi djBIcL() {
        return new C58196ywi(this);
    }

    public final C58196ywi gEmmrt() {
        if (this.DbNXlk == null) {
            synchronized (this.AkhnZx) {
                if (this.DbNXlk == null) {
                    this.DbNXlk = djBIcL();
                }
            }
        }
        return this.DbNXlk;
    }

    public void valueOf() {
        if (this.isConnected) {
            return;
        }
        this.isConnected = true;
        ((InterfaceC38441pYx) aA_()).AEQbTJ((C38436pYs) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
