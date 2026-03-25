package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.nnQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC35017nnQ extends AbstractC34904nlJ implements InterfaceC58208ywu {
    public android.content.ContextWrapper AuCTel;
    public volatile C58196ywi fIwbmz;
    public boolean uzCIH;
    public final java.lang.Object iwGUEr = new java.lang.Object();
    public boolean getFieldNames = false;

    @Override // o.AbstractC34904nlJ, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AEQbTJ();
        AubY();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AuCTel;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AEQbTJ();
        AubY();
    }

    private void AEQbTJ() {
        if (this.AuCTel == null) {
            this.AuCTel = C58196ywi.EZpvd(super.getContext(), this);
            this.uzCIH = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.uzCIH) {
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
        return zLjUOn().aA_();
    }

    public C58196ywi AuCTelauCTel() {
        return new C58196ywi(this);
    }

    public final C58196ywi zLjUOn() {
        if (this.fIwbmz == null) {
            synchronized (this.iwGUEr) {
                if (this.fIwbmz == null) {
                    this.fIwbmz = AuCTelauCTel();
                }
            }
        }
        return this.fIwbmz;
    }

    public void AubY() {
        if (this.getFieldNames) {
            return;
        }
        this.getFieldNames = true;
        ((InterfaceC35081nob) aA_()).OLrzqt((C35022nnV) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
