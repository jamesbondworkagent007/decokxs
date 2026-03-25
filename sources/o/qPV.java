package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes9.dex */
public abstract class qPV extends wXX implements InterfaceC58208ywu {
    public android.content.ContextWrapper DbNXlk;
    public boolean fJNWhG;
    public volatile C58196ywi values;
    public final java.lang.Object isConnected = new java.lang.Object();
    public boolean fIwbmz = false;

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        KWHzl();
        AEQbTJ();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.DbNXlk;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        KWHzl();
        AEQbTJ();
    }

    private void KWHzl() {
        if (this.DbNXlk == null) {
            this.DbNXlk = C58196ywi.EZpvd(super.getContext(), this);
            this.fJNWhG = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.fJNWhG) {
            return null;
        }
        KWHzl();
        return this.DbNXlk;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return gEmmrt().aA_();
    }

    public C58196ywi AhwBna() {
        return new C58196ywi(this);
    }

    public final C58196ywi gEmmrt() {
        if (this.values == null) {
            synchronized (this.isConnected) {
                if (this.values == null) {
                    this.values = AhwBna();
                }
            }
        }
        return this.values;
    }

    public void AEQbTJ() {
        if (this.fIwbmz) {
            return;
        }
        this.fIwbmz = true;
        ((InterfaceC40281qQa) aA_()).AEQbTJ((AbstractC40285qQe) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
