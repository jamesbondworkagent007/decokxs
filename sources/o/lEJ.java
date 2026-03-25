package o;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListFragment;

/* JADX INFO: loaded from: classes7.dex */
public abstract class lEJ<T extends ViewDataBinding> extends AbstractC31907mIi<T> implements InterfaceC58208ywu {
    public android.content.ContextWrapper AhwBna;
    public volatile C58196ywi AkhnZx;
    public boolean DbNXlk;
    public final java.lang.Object fetchVPNInfo;
    public boolean values;

    public lEJ(int i) {
        super(i);
        this.fetchVPNInfo = new java.lang.Object();
        this.DbNXlk = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        KWHzl();
        DbNXlk();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AhwBna;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        KWHzl();
        DbNXlk();
    }

    private void KWHzl() {
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
        return fetchVPNInfo().aA_();
    }

    public C58196ywi AkhnZx() {
        return new C58196ywi(this);
    }

    public final C58196ywi fetchVPNInfo() {
        if (this.AkhnZx == null) {
            synchronized (this.fetchVPNInfo) {
                if (this.AkhnZx == null) {
                    this.AkhnZx = AkhnZx();
                }
            }
        }
        return this.AkhnZx;
    }

    public void DbNXlk() {
        if (this.DbNXlk) {
            return;
        }
        this.DbNXlk = true;
        ((lDS) aA_()).OLrzqt((BuySellCryptoListFragment) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
