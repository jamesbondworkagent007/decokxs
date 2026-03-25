package o;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.buysell.ui.bsc.BaseBuySellFragment;

/* JADX INFO: loaded from: classes15.dex */
public abstract class lGP<T extends ViewDataBinding> extends BaseBuySellFragment<T> implements InterfaceC58208ywu {
    public android.content.ContextWrapper AuCTel;
    public volatile C58196ywi fIwbmz;
    public boolean getFieldNames;
    public boolean hDKMBd;
    public final java.lang.Object uzCIH;

    public lGP(int i) {
        super(i);
        this.uzCIH = new java.lang.Object();
        this.getFieldNames = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        sSMYrx();
        gHZMYf();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AuCTel;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        sSMYrx();
        gHZMYf();
    }

    private void sSMYrx() {
        if (this.AuCTel == null) {
            this.AuCTel = C58196ywi.EZpvd(super.getContext(), this);
            this.hDKMBd = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.hDKMBd) {
            return null;
        }
        sSMYrx();
        return this.AuCTel;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return AubY().aA_();
    }

    public C58196ywi zuBGHE() {
        return new C58196ywi(this);
    }

    /* JADX DEBUG: Possible override for method com.okinc.buysell.ui.bsc.BaseBuySellFragment.AubY()Lcom/okinc/buysell/ui/bsc/fragment/master/BSCMasterViewModel; */
    public final C58196ywi AubY() {
        if (this.fIwbmz == null) {
            synchronized (this.uzCIH) {
                if (this.fIwbmz == null) {
                    this.fIwbmz = zuBGHE();
                }
            }
        }
        return this.fIwbmz;
    }

    public void gHZMYf() {
        if (this.getFieldNames) {
            return;
        }
        this.getFieldNames = true;
        ((lHP) aA_()).KWHzl((lGL) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
