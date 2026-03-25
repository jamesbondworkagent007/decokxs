package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.eWw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15830eWw extends AbstractC32996moC implements InterfaceC58208ywu {
    public android.content.ContextWrapper ORxRYg;
    public volatile C58196ywi QOLQEE;
    public boolean QbewEr;
    public final java.lang.Object QUSxYX = new java.lang.Object();
    public boolean QfsBiF = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        KWHzl();
        AubY();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.ORxRYg;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        KWHzl();
        AubY();
    }

    private void KWHzl() {
        if (this.ORxRYg == null) {
            this.ORxRYg = C58196ywi.EZpvd(super.getContext(), this);
            this.QbewEr = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.QbewEr) {
            return null;
        }
        KWHzl();
        return this.ORxRYg;
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
        if (this.QOLQEE == null) {
            synchronized (this.QUSxYX) {
                if (this.QOLQEE == null) {
                    this.QOLQEE = AuCTelauCTel();
                }
            }
        }
        return this.QOLQEE;
    }

    public void AubY() {
        if (this.QfsBiF) {
            return;
        }
        this.QfsBiF = true;
        ((InterfaceC15829eWv) aA_()).OLrzqt((eVR) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
