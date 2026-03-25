package o;

import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsBottomSheet;

/* JADX INFO: loaded from: classes15.dex */
public abstract class iYT extends wXX implements InterfaceC58208ywu {
    public android.content.ContextWrapper AhwBna;
    public volatile C58196ywi DbNXlk;
    public boolean values;
    public final java.lang.Object fetchVPNInfo = new java.lang.Object();
    public boolean AkhnZx = false;

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        OLrzqt();
        fARcdN();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AhwBna;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        OLrzqt();
        fARcdN();
    }

    private void OLrzqt() {
        if (this.AhwBna == null) {
            this.AhwBna = C58196ywi.EZpvd(super.getContext(), this);
            this.values = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.values) {
            return null;
        }
        OLrzqt();
        return this.AhwBna;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return AkhnZx().aA_();
    }

    public C58196ywi ejfBZ() {
        return new C58196ywi(this);
    }

    public final C58196ywi AkhnZx() {
        if (this.DbNXlk == null) {
            synchronized (this.fetchVPNInfo) {
                if (this.DbNXlk == null) {
                    this.DbNXlk = ejfBZ();
                }
            }
        }
        return this.DbNXlk;
    }

    public void fARcdN() {
        if (this.AkhnZx) {
            return;
        }
        this.AkhnZx = true;
        ((iYM) aA_()).OLrzqt((AssetDetailsBottomSheet) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
