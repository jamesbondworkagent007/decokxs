package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.nnj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC35036nnj extends AbstractC34904nlJ implements InterfaceC58208ywu {
    public android.content.ContextWrapper AuCTel;
    public volatile C58196ywi fIwbmz;
    public boolean hDKMBd;
    public final java.lang.Object getFieldNames = new java.lang.Object();
    public boolean iwGUEr = false;

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
            this.hDKMBd = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.hDKMBd) {
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
        return zsXlph().aA_();
    }

    public C58196ywi wlaJM() {
        return new C58196ywi(this);
    }

    public final C58196ywi zsXlph() {
        if (this.fIwbmz == null) {
            synchronized (this.getFieldNames) {
                if (this.fIwbmz == null) {
                    this.fIwbmz = wlaJM();
                }
            }
        }
        return this.fIwbmz;
    }

    public void AubY() {
        if (this.iwGUEr) {
            return;
        }
        this.iwGUEr = true;
        ((InterfaceC35043nnq) aA_()).EZpvd((C35034nnh) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
