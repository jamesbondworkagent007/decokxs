package o;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;

/* JADX INFO: renamed from: o.wuT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC53912wuT<Binding extends ViewDataBinding, Presenter extends AbsPresenter> extends AbstractC49945uyC<Binding, Presenter> implements InterfaceC58208ywu {
    public android.content.ContextWrapper AkhnZx;
    public boolean fJNWhG;
    public volatile C58196ywi isConnected;
    public final java.lang.Object values = new java.lang.Object();
    public boolean fIwbmz = false;

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        isConnected();
        AuCTel();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AkhnZx;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        isConnected();
        AuCTel();
    }

    private void isConnected() {
        if (this.AkhnZx == null) {
            this.AkhnZx = C58196ywi.EZpvd(super.getContext(), this);
            this.fJNWhG = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.fJNWhG) {
            return null;
        }
        isConnected();
        return this.AkhnZx;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return fARcdN().aA_();
    }

    public C58196ywi ejfBZ() {
        return new C58196ywi(this);
    }

    public final C58196ywi fARcdN() {
        if (this.isConnected == null) {
            synchronized (this.values) {
                if (this.isConnected == null) {
                    this.isConnected = ejfBZ();
                }
            }
        }
        return this.isConnected;
    }

    public void AuCTel() {
        if (this.fIwbmz) {
            return;
        }
        this.fIwbmz = true;
        ((InterfaceC53844wtE) aA_()).copydefault((C53883wtr) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
