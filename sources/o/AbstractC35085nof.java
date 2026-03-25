package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.nof, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC35085nof extends AbstractC34904nlJ implements InterfaceC58208ywu {
    public volatile C58196ywi AuCTel;
    public android.content.ContextWrapper fIwbmz;
    public boolean getNewProxyInstance;
    public final java.lang.Object uzCIH = new java.lang.Object();
    public boolean hDKMBd = false;

    @Override // o.AbstractC34904nlJ, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        KWHzl();
        AuCTelauCTel();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.fIwbmz;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        KWHzl();
        AuCTelauCTel();
    }

    private void KWHzl() {
        if (this.fIwbmz == null) {
            this.fIwbmz = C58196ywi.EZpvd(super.getContext(), this);
            this.getNewProxyInstance = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.getNewProxyInstance) {
            return null;
        }
        KWHzl();
        return this.fIwbmz;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return AubY().aA_();
    }

    public C58196ywi wlaJM() {
        return new C58196ywi(this);
    }

    public final C58196ywi AubY() {
        if (this.AuCTel == null) {
            synchronized (this.uzCIH) {
                if (this.AuCTel == null) {
                    this.AuCTel = wlaJM();
                }
            }
        }
        return this.AuCTel;
    }

    public void AuCTelauCTel() {
        if (this.hDKMBd) {
            return;
        }
        this.hDKMBd = true;
        ((InterfaceC35097nor) aA_()).EZpvd((C35094noo) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
