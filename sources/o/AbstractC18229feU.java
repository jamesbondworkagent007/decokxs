package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.feU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC18229feU extends AbstractC32996moC implements InterfaceC58208ywu {
    public volatile C58196ywi AuCTel;
    public boolean fARcdN;
    public android.content.ContextWrapper fJNWhG;
    public final java.lang.Object fIwbmz = new java.lang.Object();
    public boolean hDKMBd = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AEQbTJ();
        RJOkX();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.fJNWhG;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AEQbTJ();
        RJOkX();
    }

    private void AEQbTJ() {
        if (this.fJNWhG == null) {
            this.fJNWhG = C58196ywi.EZpvd(super.getContext(), this);
            this.fARcdN = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.fARcdN) {
            return null;
        }
        AEQbTJ();
        return this.fJNWhG;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return OcIXYQ().aA_();
    }

    public C58196ywi QVAiDq() {
        return new C58196ywi(this);
    }

    public final C58196ywi OcIXYQ() {
        if (this.AuCTel == null) {
            synchronized (this.fIwbmz) {
                if (this.AuCTel == null) {
                    this.AuCTel = QVAiDq();
                }
            }
        }
        return this.AuCTel;
    }

    public void RJOkX() {
        if (this.hDKMBd) {
            return;
        }
        this.hDKMBd = true;
        ((InterfaceC18220feL) aA_()).OLrzqt((C18254fet) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
