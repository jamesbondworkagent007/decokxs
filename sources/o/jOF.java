package o;

import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jOF extends androidx.fragment.app.Fragment implements InterfaceC58208ywu {
    public android.content.ContextWrapper AuCTel;
    public boolean getNewProxyInstance;
    public volatile C58196ywi uzCIH;
    public final java.lang.Object getFieldNames = new java.lang.Object();
    public boolean iwGUEr = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        OLrzqt();
        DbNXlk();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AuCTel;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        OLrzqt();
        DbNXlk();
    }

    private void OLrzqt() {
        if (this.AuCTel == null) {
            this.AuCTel = C58196ywi.EZpvd(super.getContext(), this);
            this.getNewProxyInstance = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.getNewProxyInstance) {
            return null;
        }
        OLrzqt();
        return this.AuCTel;
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
        if (this.uzCIH == null) {
            synchronized (this.getFieldNames) {
                if (this.uzCIH == null) {
                    this.uzCIH = isConnected();
                }
            }
        }
        return this.uzCIH;
    }

    public void DbNXlk() {
        if (this.iwGUEr) {
            return;
        }
        this.iwGUEr = true;
        ((jOE) aA_()).copydefault((ChartDetailFragment) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
