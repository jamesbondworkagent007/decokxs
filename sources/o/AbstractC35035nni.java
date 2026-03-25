package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.nni, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC35035nni extends AbstractC34904nlJ implements InterfaceC58208ywu {
    public volatile C58196ywi AuCTel;
    public android.content.ContextWrapper fIwbmz;
    public boolean getFieldNames;
    public final java.lang.Object hDKMBd = new java.lang.Object();
    public boolean getNewProxyInstance = false;

    @Override // o.AbstractC34904nlJ, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AEQbTJ();
        zLjUOn();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.fIwbmz;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AEQbTJ();
        zLjUOn();
    }

    private void AEQbTJ() {
        if (this.fIwbmz == null) {
            this.fIwbmz = C58196ywi.EZpvd(super.getContext(), this);
            this.getFieldNames = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.getFieldNames) {
            return null;
        }
        AEQbTJ();
        return this.fIwbmz;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return AuCTelauCTel().aA_();
    }

    public C58196ywi wlaJM() {
        return new C58196ywi(this);
    }

    public final C58196ywi AuCTelauCTel() {
        if (this.AuCTel == null) {
            synchronized (this.hDKMBd) {
                if (this.AuCTel == null) {
                    this.AuCTel = wlaJM();
                }
            }
        }
        return this.AuCTel;
    }

    public void zLjUOn() {
        if (this.getNewProxyInstance) {
            return;
        }
        this.getNewProxyInstance = true;
        ((InterfaceC35044nnr) aA_()).KWHzl((C35041nno) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
