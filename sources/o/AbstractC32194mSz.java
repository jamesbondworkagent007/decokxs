package o;

import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import com.okinc.dexkline.dexui.main.market.detail.fragment.DexMarketDetailFragment;

/* JADX INFO: renamed from: o.mSz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC32194mSz<VB extends ViewBinding> extends mRH<VB> implements InterfaceC58208ywu {
    public android.content.ContextWrapper getNewProxyInstance;
    public boolean hDKMBd;
    public volatile C58196ywi uzCIH;
    public final java.lang.Object getFieldNames = new java.lang.Object();
    public boolean wlaJM = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AEQbTJ();
        fARcdN();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.getNewProxyInstance;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AEQbTJ();
        fARcdN();
    }

    private void AEQbTJ() {
        if (this.getNewProxyInstance == null) {
            this.getNewProxyInstance = C58196ywi.EZpvd(super.getContext(), this);
            this.hDKMBd = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.hDKMBd) {
            return null;
        }
        AEQbTJ();
        return this.getNewProxyInstance;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return ejfBZ().aA_();
    }

    public C58196ywi fJNWhG() {
        return new C58196ywi(this);
    }

    public final C58196ywi ejfBZ() {
        if (this.uzCIH == null) {
            synchronized (this.getFieldNames) {
                if (this.uzCIH == null) {
                    this.uzCIH = fJNWhG();
                }
            }
        }
        return this.uzCIH;
    }

    public void fARcdN() {
        if (this.wlaJM) {
            return;
        }
        this.wlaJM = true;
        ((InterfaceC32191mSw) aA_()).EZpvd((DexMarketDetailFragment) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
