package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.nlp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC34936nlp extends AbstractC43061riF implements InterfaceC58208ywu {
    public volatile C58196ywi AEQbTJ;
    public android.content.ContextWrapper OLrzqt;
    public boolean djBIcL;
    public final java.lang.Object AhwBna = new java.lang.Object();
    public boolean gEmmrt = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        KWHzl();
        valueOf();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.OLrzqt;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        KWHzl();
        valueOf();
    }

    private void KWHzl() {
        if (this.OLrzqt == null) {
            this.OLrzqt = C58196ywi.EZpvd(super.getContext(), this);
            this.djBIcL = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.djBIcL) {
            return null;
        }
        KWHzl();
        return this.OLrzqt;
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

    public C58196ywi AhwBna() {
        return new C58196ywi(this);
    }

    public final C58196ywi djBIcL() {
        if (this.AEQbTJ == null) {
            synchronized (this.AhwBna) {
                if (this.AEQbTJ == null) {
                    this.AEQbTJ = AhwBna();
                }
            }
        }
        return this.AEQbTJ;
    }

    public void valueOf() {
        if (this.gEmmrt) {
            return;
        }
        this.gEmmrt = true;
        ((InterfaceC34931nlk) aA_()).OLrzqt((C34927nlg) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
