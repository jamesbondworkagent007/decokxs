package o;

import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedEvmSettingFragment;

/* JADX INFO: renamed from: o.liy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC30855liy<VB extends ViewBinding> extends hTH<VB> implements InterfaceC58208ywu {
    public volatile C58196ywi AYXKKw;
    public android.content.ContextWrapper AhwBna;
    public boolean AkhnZx;
    public final java.lang.Object isConnected = new java.lang.Object();
    public boolean DbNXlk = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        KWHzl();
        getFieldNames();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AhwBna;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        KWHzl();
        getFieldNames();
    }

    private void KWHzl() {
        if (this.AhwBna == null) {
            this.AhwBna = C58196ywi.EZpvd(super.getContext(), this);
            this.AkhnZx = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AkhnZx) {
            return null;
        }
        KWHzl();
        return this.AhwBna;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return fJNWhG().aA_();
    }

    public C58196ywi hDKMBd() {
        return new C58196ywi(this);
    }

    public final C58196ywi fJNWhG() {
        if (this.AYXKKw == null) {
            synchronized (this.isConnected) {
                if (this.AYXKKw == null) {
                    this.AYXKKw = hDKMBd();
                }
            }
        }
        return this.AYXKKw;
    }

    public void getFieldNames() {
        if (this.DbNXlk) {
            return;
        }
        this.DbNXlk = true;
        ((InterfaceC30776lhY) aA_()).copydefault((AdvancedEvmSettingFragment) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
