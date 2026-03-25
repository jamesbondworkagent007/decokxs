package o;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;

/* JADX INFO: renamed from: o.vxU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC51991vxU<Binding extends ViewDataBinding, Presenter extends AbsPresenter> extends AbstractC54505xKx<Binding, Presenter> implements InterfaceC58208ywu {
    public volatile C58196ywi AEQbTJ;
    public final java.lang.Object EZpvd = new java.lang.Object();
    public boolean KWHzl = false;
    public boolean OLrzqt;
    public android.content.ContextWrapper copydefault;

    @Override // o.AbstractC56129xww, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        djBIcL();
        KWHzl();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.copydefault;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        djBIcL();
        KWHzl();
    }

    private void djBIcL() {
        if (this.copydefault == null) {
            this.copydefault = C58196ywi.EZpvd(super.getContext(), this);
            this.OLrzqt = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.OLrzqt) {
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
        return AEQbTJ().aA_();
    }

    public C58196ywi EZpvd() {
        return new C58196ywi(this);
    }

    public final C58196ywi AEQbTJ() {
        if (this.AEQbTJ == null) {
            synchronized (this.EZpvd) {
                if (this.AEQbTJ == null) {
                    this.AEQbTJ = EZpvd();
                }
            }
        }
        return this.AEQbTJ;
    }

    public void KWHzl() {
        if (this.KWHzl) {
            return;
        }
        this.KWHzl = true;
        ((InterfaceC52065vyp) aA_()).OLrzqt((C51995vxY) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
