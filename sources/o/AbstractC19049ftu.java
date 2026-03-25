package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.ftu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19049ftu extends AbstractC33042mow implements InterfaceC58208ywu {
    public volatile C58196ywi AYXKKw;
    public final java.lang.Object AhwBna = new java.lang.Object();
    public boolean AkhnZx = false;
    public boolean djBIcL;
    public android.content.ContextWrapper valueOf;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AEQbTJ();
        AhwBna();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.valueOf;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AEQbTJ();
        AhwBna();
    }

    private void AEQbTJ() {
        if (this.valueOf == null) {
            this.valueOf = C58196ywi.EZpvd(super.getContext(), this);
            this.djBIcL = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.djBIcL) {
            return null;
        }
        AEQbTJ();
        return this.valueOf;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return djBIcL().aA_();
    }

    public C58196ywi AYXKKw() {
        return new C58196ywi(this);
    }

    public final C58196ywi djBIcL() {
        if (this.AYXKKw == null) {
            synchronized (this.AhwBna) {
                if (this.AYXKKw == null) {
                    this.AYXKKw = AYXKKw();
                }
            }
        }
        return this.AYXKKw;
    }

    public void AhwBna() {
        if (this.AkhnZx) {
            return;
        }
        this.AkhnZx = true;
        ((InterfaceC19031ftc) aA_()).AEQbTJ((C18965fsP) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
