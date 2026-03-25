package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eXG extends AbstractC32998moE implements InterfaceC58208ywu {
    public volatile C58196ywi ejfBZ;
    public android.content.ContextWrapper fARcdN;
    public boolean getFieldNames;
    public final java.lang.Object fIwbmz = new java.lang.Object();
    public boolean iwGUEr = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        OLrzqt();
        values();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.fARcdN;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        OLrzqt();
        values();
    }

    private void OLrzqt() {
        if (this.fARcdN == null) {
            this.fARcdN = C58196ywi.EZpvd(super.getContext(), this);
            this.getFieldNames = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.getFieldNames) {
            return null;
        }
        OLrzqt();
        return this.fARcdN;
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
        if (this.ejfBZ == null) {
            synchronized (this.fIwbmz) {
                if (this.ejfBZ == null) {
                    this.ejfBZ = djBIcL();
                }
            }
        }
        return this.ejfBZ;
    }

    public void values() {
        if (this.iwGUEr) {
            return;
        }
        this.iwGUEr = true;
        ((eXF) aA_()).AEQbTJ((C15852eXr) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
