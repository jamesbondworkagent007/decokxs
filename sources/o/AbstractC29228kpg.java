package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.kpg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC29228kpg extends AbstractC23346hwW implements InterfaceC58208ywu {
    public android.content.ContextWrapper EZpvd;
    public volatile C58196ywi copydefault;
    public boolean djBIcL;
    public final java.lang.Object KWHzl = new java.lang.Object();
    public boolean AhwBna = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        gEmmrt();
        AYXKKw();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.EZpvd;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        gEmmrt();
        AYXKKw();
    }

    private void gEmmrt() {
        if (this.EZpvd == null) {
            this.EZpvd = C58196ywi.EZpvd(super.getContext(), this);
            this.djBIcL = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.djBIcL) {
            return null;
        }
        gEmmrt();
        return this.EZpvd;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return KWHzl().aA_();
    }

    public C58196ywi OLrzqt() {
        return new C58196ywi(this);
    }

    public final C58196ywi KWHzl() {
        if (this.copydefault == null) {
            synchronized (this.KWHzl) {
                if (this.copydefault == null) {
                    this.copydefault = OLrzqt();
                }
            }
        }
        return this.copydefault;
    }

    public void AYXKKw() {
        if (this.AhwBna) {
            return;
        }
        this.AhwBna = true;
        ((InterfaceC29285kqk) aA_()).KWHzl((C29280kqf) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
