package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.jVc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC26186jVc extends wXX implements InterfaceC58208ywu {
    public final java.lang.Object AEQbTJ = new java.lang.Object();
    public boolean EZpvd = false;
    public boolean KWHzl;
    public volatile C58196ywi OLrzqt;
    public android.content.ContextWrapper copydefault;

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        EZpvd();
        OLrzqt();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.copydefault;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        EZpvd();
        OLrzqt();
    }

    private void EZpvd() {
        if (this.copydefault == null) {
            this.copydefault = C58196ywi.EZpvd(super.getContext(), this);
            this.KWHzl = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.KWHzl) {
            return null;
        }
        EZpvd();
        return this.copydefault;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return AEQbTJ().aA_();
    }

    public C58196ywi KWHzl() {
        return new C58196ywi(this);
    }

    public final C58196ywi AEQbTJ() {
        if (this.OLrzqt == null) {
            synchronized (this.AEQbTJ) {
                if (this.OLrzqt == null) {
                    this.OLrzqt = KWHzl();
                }
            }
        }
        return this.OLrzqt;
    }

    public void OLrzqt() {
        if (this.EZpvd) {
            return;
        }
        this.EZpvd = true;
        ((InterfaceC26195jVl) aA_()).EZpvd((C26191jVh) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
