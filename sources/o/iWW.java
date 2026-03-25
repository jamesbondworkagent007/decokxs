package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes15.dex */
public abstract class iWW extends AbstractC32996moC implements InterfaceC58208ywu {
    public volatile C58196ywi DbNXlk;
    public boolean fJNWhG;
    public android.content.ContextWrapper isConnected;
    public final java.lang.Object fetchVPNInfo = new java.lang.Object();
    public boolean fARcdN = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        KWHzl();
        isConnected();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.isConnected;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        KWHzl();
        isConnected();
    }

    private void KWHzl() {
        if (this.isConnected == null) {
            this.isConnected = C58196ywi.EZpvd(super.getContext(), this);
            this.fJNWhG = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.fJNWhG) {
            return null;
        }
        KWHzl();
        return this.isConnected;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return fetchVPNInfo().aA_();
    }

    public C58196ywi AkhnZx() {
        return new C58196ywi(this);
    }

    public final C58196ywi fetchVPNInfo() {
        if (this.DbNXlk == null) {
            synchronized (this.fetchVPNInfo) {
                if (this.DbNXlk == null) {
                    this.DbNXlk = AkhnZx();
                }
            }
        }
        return this.DbNXlk;
    }

    public void isConnected() {
        if (this.fARcdN) {
            return;
        }
        this.fARcdN = true;
        ((iWL) aA_()).AEQbTJ((iWF) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
