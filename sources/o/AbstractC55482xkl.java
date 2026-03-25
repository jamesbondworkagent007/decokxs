package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.xkl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55482xkl extends AbstractC32996moC implements InterfaceC58208ywu {
    public android.content.ContextWrapper QVAiDq;
    public volatile C58196ywi QbewEr;
    public final java.lang.Object RJOkX = new java.lang.Object();
    public boolean aKErDB = false;
    public boolean dNCPSb;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        KWHzl();
        zsXlph();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.QVAiDq;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        KWHzl();
        zsXlph();
    }

    private void KWHzl() {
        if (this.QVAiDq == null) {
            this.QVAiDq = C58196ywi.EZpvd(super.getContext(), this);
            this.dNCPSb = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.dNCPSb) {
            return null;
        }
        KWHzl();
        return this.QVAiDq;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return iwGUEr().aA_();
    }

    public C58196ywi AubY() {
        return new C58196ywi(this);
    }

    public final C58196ywi iwGUEr() {
        if (this.QbewEr == null) {
            synchronized (this.RJOkX) {
                if (this.QbewEr == null) {
                    this.QbewEr = AubY();
                }
            }
        }
        return this.QbewEr;
    }

    public void zsXlph() {
        if (this.aKErDB) {
            return;
        }
        this.aKErDB = true;
        ((InterfaceC55399xjH) aA_()).KWHzl((C55427xjj) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
