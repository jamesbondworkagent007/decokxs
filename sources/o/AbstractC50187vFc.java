package o;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.unify_trade.bot.main.base.BaseBotOrderPresenter;

/* JADX INFO: renamed from: o.vFc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC50187vFc<Binding extends ViewDataBinding, Presenter extends BaseBotOrderPresenter> extends AbstractC48165uHj<Binding, Presenter> implements InterfaceC58208ywu {
    public android.content.ContextWrapper fetchVPNInfo;
    public volatile C58196ywi isConnected;
    public boolean values;
    public final java.lang.Object DbNXlk = new java.lang.Object();
    public boolean AkhnZx = false;

    @Override // o.AbstractC56129xww, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AEQbTJ();
        AwvSrB();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.fetchVPNInfo;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AEQbTJ();
        AwvSrB();
    }

    private void AEQbTJ() {
        if (this.fetchVPNInfo == null) {
            this.fetchVPNInfo = C58196ywi.EZpvd(super.getContext(), this);
            this.values = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.values) {
            return null;
        }
        AEQbTJ();
        return this.fetchVPNInfo;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return zLjUOn().aA_();
    }

    public C58196ywi AuCTelauCTel() {
        return new C58196ywi(this);
    }

    public final C58196ywi zLjUOn() {
        if (this.isConnected == null) {
            synchronized (this.DbNXlk) {
                if (this.isConnected == null) {
                    this.isConnected = AuCTelauCTel();
                }
            }
        }
        return this.isConnected;
    }

    public void AwvSrB() {
        if (this.AkhnZx) {
            return;
        }
        this.AkhnZx = true;
        ((InterfaceC50185vFa) aA_()).AEQbTJ((C50170vEm) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
