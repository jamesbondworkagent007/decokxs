package o;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;

/* JADX INFO: loaded from: classes17.dex */
public abstract class wPB<Binding extends ViewDataBinding, Presenter extends AbsPresenter> extends AbstractC49945uyC<Binding, Presenter> implements InterfaceC58208ywu {
    public volatile C58196ywi AYXKKw;
    public android.content.ContextWrapper djBIcL;
    public boolean valueOf;
    public final java.lang.Object gEmmrt = new java.lang.Object();
    public boolean AhwBna = false;

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        isConnected();
        fJNWhG();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.djBIcL;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        isConnected();
        fJNWhG();
    }

    private void isConnected() {
        if (this.djBIcL == null) {
            this.djBIcL = C58196ywi.EZpvd(super.getContext(), this);
            this.valueOf = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.valueOf) {
            return null;
        }
        isConnected();
        return this.djBIcL;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return fIwbmz().aA_();
    }

    public C58196ywi fARcdN() {
        return new C58196ywi(this);
    }

    public final C58196ywi fIwbmz() {
        if (this.AYXKKw == null) {
            synchronized (this.gEmmrt) {
                if (this.AYXKKw == null) {
                    this.AYXKKw = fARcdN();
                }
            }
        }
        return this.AYXKKw;
    }

    public void fJNWhG() {
        if (this.AhwBna) {
            return;
        }
        this.AhwBna = true;
        ((wPA) aA_()).KWHzl((C52555wPt) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
