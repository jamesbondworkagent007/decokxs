package o;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;

/* JADX INFO: renamed from: o.waW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC52855waW<Binding extends ViewDataBinding, Presenter extends AbsPresenter> extends AbstractC49945uyC<Binding, Presenter> implements InterfaceC58208ywu {
    public android.content.ContextWrapper AEQbTJ;
    public boolean KWHzl;
    public volatile C58196ywi copydefault;
    public final java.lang.Object OLrzqt = new java.lang.Object();
    public boolean djBIcL = false;

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        ejfBZ();
        AuCTel();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AEQbTJ;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        ejfBZ();
        AuCTel();
    }

    private void ejfBZ() {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = C58196ywi.EZpvd(super.getContext(), this);
            this.KWHzl = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.KWHzl) {
            return null;
        }
        ejfBZ();
        return this.AEQbTJ;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return isConnected().aA_();
    }

    public C58196ywi fIwbmz() {
        return new C58196ywi(this);
    }

    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    public final C58196ywi isConnected() {
        if (this.copydefault == null) {
            synchronized (this.OLrzqt) {
                if (this.copydefault == null) {
                    this.copydefault = fIwbmz();
                }
            }
        }
        return this.copydefault;
    }

    public void AuCTel() {
        if (this.djBIcL) {
            return;
        }
        this.djBIcL = true;
        ((InterfaceC52897wbL) aA_()).AEQbTJ((C52937wbz) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
