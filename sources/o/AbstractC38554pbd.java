package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.pbd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC38554pbd extends AbstractC32998moE implements InterfaceC58208ywu {
    public android.content.ContextWrapper QSBOWP;
    public volatile C58196ywi QkdxfA;
    public boolean RKDWNf;
    public final java.lang.Object QHmsKR = new java.lang.Object();
    public boolean dmfpNf = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        OLrzqt();
        hrNTAI();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.QSBOWP;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        OLrzqt();
        hrNTAI();
    }

    private void OLrzqt() {
        if (this.QSBOWP == null) {
            this.QSBOWP = C58196ywi.EZpvd(super.getContext(), this);
            this.RKDWNf = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.RKDWNf) {
            return null;
        }
        OLrzqt();
        return this.QSBOWP;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return DLWbHP().aA_();
    }

    public C58196ywi OHqIaq() {
        return new C58196ywi(this);
    }

    public final C58196ywi DLWbHP() {
        if (this.QkdxfA == null) {
            synchronized (this.QHmsKR) {
                if (this.QkdxfA == null) {
                    this.QkdxfA = OHqIaq();
                }
            }
        }
        return this.QkdxfA;
    }

    public void hrNTAI() {
        if (this.dmfpNf) {
            return;
        }
        this.dmfpNf = true;
        ((oZD) aA_()).AEQbTJ((oYA) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
