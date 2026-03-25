package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.qww, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC41765qww extends AbstractC32998moE implements InterfaceC58208ywu {
    public boolean fIwbmz;
    public android.content.ContextWrapper fetchVPNInfo;
    public volatile C58196ywi values;
    public final java.lang.Object fJNWhG = new java.lang.Object();
    public boolean AuCTel = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        EZpvd();
        AEQbTJ();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.fetchVPNInfo;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        EZpvd();
        AEQbTJ();
    }

    private void EZpvd() {
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
        EZpvd();
        return this.fetchVPNInfo;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return DbNXlk().aA_();
    }

    public C58196ywi fARcdN() {
        return new C58196ywi(this);
    }

    public final C58196ywi DbNXlk() {
        if (this.values == null) {
            synchronized (this.fJNWhG) {
                if (this.values == null) {
                    this.values = fARcdN();
                }
            }
        }
        return this.values;
    }

    public void AEQbTJ() {
        if (this.AuCTel) {
            return;
        }
        this.AuCTel = true;
        ((InterfaceC41764qwv) aA_()).OLrzqt((AbstractC41759qwq) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
