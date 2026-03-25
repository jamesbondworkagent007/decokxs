package o;

import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedSolSettingFragment;

/* JADX INFO: renamed from: o.liz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC30856liz<VB extends ViewBinding> extends hTH<VB> implements InterfaceC58208ywu {
    public final java.lang.Object djBIcL = new java.lang.Object();
    public boolean fetchVPNInfo = false;
    public volatile C58196ywi gEmmrt;
    public android.content.ContextWrapper valueOf;
    public boolean values;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AEQbTJ();
        valueOf();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.valueOf;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AEQbTJ();
        valueOf();
    }

    private void AEQbTJ() {
        if (this.valueOf == null) {
            this.valueOf = C58196ywi.EZpvd(super.getContext(), this);
            this.values = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.values) {
            return null;
        }
        AEQbTJ();
        return this.valueOf;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return AhwBna().aA_();
    }

    public C58196ywi gEmmrt() {
        return new C58196ywi(this);
    }

    public final C58196ywi AhwBna() {
        if (this.gEmmrt == null) {
            synchronized (this.djBIcL) {
                if (this.gEmmrt == null) {
                    this.gEmmrt = gEmmrt();
                }
            }
        }
        return this.gEmmrt;
    }

    public void valueOf() {
        if (this.fetchVPNInfo) {
            return;
        }
        this.fetchVPNInfo = true;
        ((InterfaceC30847liq) aA_()).OLrzqt((AdvancedSolSettingFragment) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
