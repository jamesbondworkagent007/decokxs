package o;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;

/* JADX INFO: loaded from: classes17.dex */
public abstract class wGF<Binding extends ViewDataBinding, Presenter extends AbsPresenter> extends AbstractC54505xKx<Binding, Presenter> implements InterfaceC58208ywu {
    public android.content.ContextWrapper AEQbTJ;
    public boolean EZpvd;
    public volatile C58196ywi copydefault;
    public final java.lang.Object OLrzqt = new java.lang.Object();
    public boolean KWHzl = false;

    @Override // o.AbstractC56129xww, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        gEmmrt();
        AYXKKw();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AEQbTJ;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        gEmmrt();
        AYXKKw();
    }

    private void gEmmrt() {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = C58196ywi.EZpvd(super.getContext(), this);
            this.EZpvd = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.EZpvd) {
            return null;
        }
        gEmmrt();
        return this.AEQbTJ;
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

    public C58196ywi KWHzl() {
        return new C58196ywi(this);
    }

    public final C58196ywi AEQbTJ() {
        if (this.copydefault == null) {
            synchronized (this.OLrzqt) {
                if (this.copydefault == null) {
                    this.copydefault = KWHzl();
                }
            }
        }
        return this.copydefault;
    }

    public void AYXKKw() {
        if (this.KWHzl) {
            return;
        }
        this.KWHzl = true;
        ((wGM) aA_()).copydefault((wGK) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
