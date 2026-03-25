package o;

import androidx.lifecycle.ViewModelProvider;
import com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment;

/* JADX INFO: renamed from: o.mXi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC32312mXi extends androidx.fragment.app.Fragment implements InterfaceC58208ywu {
    public android.content.ContextWrapper getNewProxyInstance;
    public volatile C58196ywi iwGUEr;
    public boolean wlaJM;
    public final java.lang.Object getFieldNames = new java.lang.Object();
    public boolean zLjUOn = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        KWHzl();
        fIwbmz();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.getNewProxyInstance;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        KWHzl();
        fIwbmz();
    }

    private void KWHzl() {
        if (this.getNewProxyInstance == null) {
            this.getNewProxyInstance = C58196ywi.EZpvd(super.getContext(), this);
            this.wlaJM = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.wlaJM) {
            return null;
        }
        KWHzl();
        return this.getNewProxyInstance;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return values().aA_();
    }

    public C58196ywi isConnected() {
        return new C58196ywi(this);
    }

    public final C58196ywi values() {
        if (this.iwGUEr == null) {
            synchronized (this.getFieldNames) {
                if (this.iwGUEr == null) {
                    this.iwGUEr = isConnected();
                }
            }
        }
        return this.iwGUEr;
    }

    public void fIwbmz() {
        if (this.zLjUOn) {
            return;
        }
        this.zLjUOn = true;
        ((InterfaceC32304mXa) aA_()).AEQbTJ((ChartDetailFragment) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
