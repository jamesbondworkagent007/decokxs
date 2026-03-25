package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.ljo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC30898ljo extends AbstractC52792wYn implements InterfaceC58208ywu {
    public boolean EZpvd;
    public android.content.ContextWrapper OLrzqt;
    public volatile C58196ywi copydefault;
    public final java.lang.Object KWHzl = new java.lang.Object();
    public boolean AEQbTJ = false;

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        EZpvd();
        OLrzqt();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.OLrzqt;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        EZpvd();
        OLrzqt();
    }

    private void EZpvd() {
        if (this.OLrzqt == null) {
            this.OLrzqt = C58196ywi.EZpvd(super.getContext(), this);
            this.EZpvd = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.EZpvd) {
            return null;
        }
        EZpvd();
        return this.OLrzqt;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return AEQbTJ().aA_();
    }

    public C58196ywi KWHzl() {
        return new C58196ywi(this);
    }

    public final C58196ywi AEQbTJ() {
        if (this.copydefault == null) {
            synchronized (this.KWHzl) {
                if (this.copydefault == null) {
                    this.copydefault = KWHzl();
                }
            }
        }
        return this.copydefault;
    }

    public void OLrzqt() {
        if (this.AEQbTJ) {
            return;
        }
        this.AEQbTJ = true;
        ((InterfaceC30949lkm) aA_()).copydefault((C30943lkg) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
