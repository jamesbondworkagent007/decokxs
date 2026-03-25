package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.nnR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC35018nnR extends AbstractC27793kDo implements InterfaceC58208ywu {
    public boolean AEQbTJ;
    public volatile C58196ywi KWHzl;
    public android.content.ContextWrapper OLrzqt;
    public final java.lang.Object copydefault = new java.lang.Object();
    public boolean EZpvd = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AEQbTJ();
        DbNXlk();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.OLrzqt;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AEQbTJ();
        DbNXlk();
    }

    private void AEQbTJ() {
        if (this.OLrzqt == null) {
            this.OLrzqt = C58196ywi.EZpvd(super.getContext(), this);
            this.AEQbTJ = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AEQbTJ) {
            return null;
        }
        AEQbTJ();
        return this.OLrzqt;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return AkhnZx().aA_();
    }

    public C58196ywi fetchVPNInfo() {
        return new C58196ywi(this);
    }

    public final C58196ywi AkhnZx() {
        if (this.KWHzl == null) {
            synchronized (this.copydefault) {
                if (this.KWHzl == null) {
                    this.KWHzl = fetchVPNInfo();
                }
            }
        }
        return this.KWHzl;
    }

    public void DbNXlk() {
        if (this.EZpvd) {
            return;
        }
        this.EZpvd = true;
        ((InterfaceC35023nnW) aA_()).AEQbTJ((C35025nnY) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
