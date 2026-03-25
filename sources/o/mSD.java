package o;

import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import com.okinc.dexkline.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment;

/* JADX INFO: loaded from: classes15.dex */
public abstract class mSD<VB extends ViewBinding> extends mRH<VB> implements InterfaceC58208ywu {
    public final java.lang.Object AEQbTJ = new java.lang.Object();
    public boolean AYXKKw = false;
    public volatile C58196ywi EZpvd;
    public android.content.ContextWrapper OLrzqt;
    public boolean copydefault;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        djBIcL();
        valueOf();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.OLrzqt;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        djBIcL();
        valueOf();
    }

    private void djBIcL() {
        if (this.OLrzqt == null) {
            this.OLrzqt = C58196ywi.EZpvd(super.getContext(), this);
            this.copydefault = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.copydefault) {
            return null;
        }
        djBIcL();
        return this.OLrzqt;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return OLrzqt().aA_();
    }

    public C58196ywi AEQbTJ() {
        return new C58196ywi(this);
    }

    public final C58196ywi OLrzqt() {
        if (this.EZpvd == null) {
            synchronized (this.AEQbTJ) {
                if (this.EZpvd == null) {
                    this.EZpvd = AEQbTJ();
                }
            }
        }
        return this.EZpvd;
    }

    public void valueOf() {
        if (this.AYXKKw) {
            return;
        }
        this.AYXKKw = true;
        ((InterfaceC32221mTz) aA_()).OLrzqt((MarketLandscapeFragment) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
