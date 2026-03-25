package o;

import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import com.okinc.business.dex.trade.component.orderandposition.position.ui.PositionComponentFragment;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gQU<VB extends ViewBinding> extends gPW<VB> implements InterfaceC58208ywu {
    public boolean AEQbTJ;
    public volatile C58196ywi OLrzqt;
    public android.content.ContextWrapper copydefault;
    public final java.lang.Object KWHzl = new java.lang.Object();
    public boolean djBIcL = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        djBIcL();
        gEmmrt();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.copydefault;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        djBIcL();
        gEmmrt();
    }

    private void djBIcL() {
        if (this.copydefault == null) {
            this.copydefault = C58196ywi.EZpvd(super.getContext(), this);
            this.AEQbTJ = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AEQbTJ) {
            return null;
        }
        djBIcL();
        return this.copydefault;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return valueOf().aA_();
    }

    public C58196ywi AYXKKw() {
        return new C58196ywi(this);
    }

    public final C58196ywi valueOf() {
        if (this.OLrzqt == null) {
            synchronized (this.KWHzl) {
                if (this.OLrzqt == null) {
                    this.OLrzqt = AYXKKw();
                }
            }
        }
        return this.OLrzqt;
    }

    public void gEmmrt() {
        if (this.djBIcL) {
            return;
        }
        this.djBIcL = true;
        ((InterfaceC19848gRo) aA_()).OLrzqt((PositionComponentFragment) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
