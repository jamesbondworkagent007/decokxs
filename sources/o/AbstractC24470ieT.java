package o;

import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.dexui.main.swap.trade.SwapTradeFragment;

/* JADX INFO: renamed from: o.ieT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC24470ieT extends AbstractC23346hwW implements InterfaceC58208ywu {
    public volatile C58196ywi EZpvd;
    public android.content.ContextWrapper copydefault;
    public boolean djBIcL;
    public final java.lang.Object KWHzl = new java.lang.Object();
    public boolean valueOf = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AhwBna();
        gEmmrt();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.copydefault;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AhwBna();
        gEmmrt();
    }

    private void AhwBna() {
        if (this.copydefault == null) {
            this.copydefault = C58196ywi.EZpvd(super.getContext(), this);
            this.djBIcL = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.djBIcL) {
            return null;
        }
        AhwBna();
        return this.copydefault;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return KWHzl().aA_();
    }

    public C58196ywi OLrzqt() {
        return new C58196ywi(this);
    }

    public final C58196ywi KWHzl() {
        if (this.EZpvd == null) {
            synchronized (this.KWHzl) {
                if (this.EZpvd == null) {
                    this.EZpvd = OLrzqt();
                }
            }
        }
        return this.EZpvd;
    }

    public void gEmmrt() {
        if (this.valueOf) {
            return;
        }
        this.valueOf = true;
        ((InterfaceC24616ihG) aA_()).KWHzl((SwapTradeFragment) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
