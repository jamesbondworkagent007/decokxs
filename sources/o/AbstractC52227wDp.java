package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.wDp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC52227wDp extends AbstractC32996moC implements InterfaceC58208ywu {
    public volatile C58196ywi fARcdN;
    public boolean fIwbmz;
    public android.content.ContextWrapper fetchVPNInfo;
    public final java.lang.Object AuCTel = new java.lang.Object();
    public boolean fJNWhG = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AEQbTJ();
        fIwbmz();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.fetchVPNInfo;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AEQbTJ();
        fIwbmz();
    }

    private void AEQbTJ() {
        if (this.fetchVPNInfo == null) {
            this.fetchVPNInfo = C58196ywi.EZpvd(super.getContext(), this);
            this.fIwbmz = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.fIwbmz) {
            return null;
        }
        AEQbTJ();
        return this.fetchVPNInfo;
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

    public C58196ywi isConnected() {
        return new C58196ywi(this);
    }

    public final C58196ywi fetchVPNInfo() {
        if (this.fARcdN == null) {
            synchronized (this.AuCTel) {
                if (this.fARcdN == null) {
                    this.fARcdN = isConnected();
                }
            }
        }
        return this.fARcdN;
    }

    public void fIwbmz() {
        if (this.fJNWhG) {
            return;
        }
        this.fJNWhG = true;
        ((InterfaceC52192wCh) aA_()).copydefault((C52179wBv) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
