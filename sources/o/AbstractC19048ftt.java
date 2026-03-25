package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.ftt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19048ftt extends AbstractC32998moE implements InterfaceC58208ywu {
    public boolean AkhnZx;
    public final java.lang.Object DbNXlk = new java.lang.Object();
    public boolean fJNWhG = false;
    public android.content.ContextWrapper isConnected;
    public volatile C58196ywi values;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        OLrzqt();
        valueOf();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.isConnected;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        OLrzqt();
        valueOf();
    }

    private void OLrzqt() {
        if (this.isConnected == null) {
            this.isConnected = C58196ywi.EZpvd(super.getContext(), this);
            this.AkhnZx = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AkhnZx) {
            return null;
        }
        OLrzqt();
        return this.isConnected;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return djBIcL().aA_();
    }

    public C58196ywi AYXKKw() {
        return new C58196ywi(this);
    }

    public final C58196ywi djBIcL() {
        if (this.values == null) {
            synchronized (this.DbNXlk) {
                if (this.values == null) {
                    this.values = AYXKKw();
                }
            }
        }
        return this.values;
    }

    public void valueOf() {
        if (this.fJNWhG) {
            return;
        }
        this.fJNWhG = true;
        ((InterfaceC19045ftq) aA_()).AEQbTJ((C19033fte) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
