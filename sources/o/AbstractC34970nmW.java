package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.nmW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC34970nmW extends AbstractC34904nlJ implements InterfaceC58208ywu {
    public android.content.ContextWrapper AuCTel;
    public volatile C58196ywi fIwbmz;
    public boolean iwGUEr;
    public final java.lang.Object getNewProxyInstance = new java.lang.Object();
    public boolean uzCIH = false;

    @Override // o.AbstractC34904nlJ, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AEQbTJ();
        AuCTelauCTel();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AuCTel;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AEQbTJ();
        AuCTelauCTel();
    }

    private void AEQbTJ() {
        if (this.AuCTel == null) {
            this.AuCTel = C58196ywi.EZpvd(super.getContext(), this);
            this.iwGUEr = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.iwGUEr) {
            return null;
        }
        AEQbTJ();
        return this.AuCTel;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return wlaJM().aA_();
    }

    public C58196ywi zsXlph() {
        return new C58196ywi(this);
    }

    public final C58196ywi wlaJM() {
        if (this.fIwbmz == null) {
            synchronized (this.getNewProxyInstance) {
                if (this.fIwbmz == null) {
                    this.fIwbmz = zsXlph();
                }
            }
        }
        return this.fIwbmz;
    }

    public void AuCTelauCTel() {
        if (this.uzCIH) {
            return;
        }
        this.uzCIH = true;
        ((InterfaceC35030nnd) aA_()).KWHzl((C34971nmX) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
