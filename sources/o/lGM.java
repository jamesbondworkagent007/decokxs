package o;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.buysell.ui.bsc.fragment.master.BSCMasterFragmentV3;

/* JADX INFO: loaded from: classes15.dex */
public abstract class lGM<T extends ViewDataBinding> extends lzN<T> implements InterfaceC58208ywu {
    public boolean AuCTelauCTel;
    public android.content.ContextWrapper AubY;
    public final java.lang.Object wlaJM;
    public boolean zLjUOn;
    public volatile C58196ywi zsXlph;

    public lGM(int i) {
        super(i);
        this.wlaJM = new java.lang.Object();
        this.zLjUOn = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        isConnected();
        AuCTelauCTel();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AubY;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        isConnected();
        AuCTelauCTel();
    }

    private void isConnected() {
        if (this.AubY == null) {
            this.AubY = C58196ywi.EZpvd(super.getContext(), this);
            this.AuCTelauCTel = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AuCTelauCTel) {
            return null;
        }
        isConnected();
        return this.AubY;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return wlaJM().aA_();
    }

    public C58196ywi zLjUOn() {
        return new C58196ywi(this);
    }

    public final C58196ywi wlaJM() {
        if (this.zsXlph == null) {
            synchronized (this.wlaJM) {
                if (this.zsXlph == null) {
                    this.zsXlph = zLjUOn();
                }
            }
        }
        return this.zsXlph;
    }

    public void AuCTelauCTel() {
        if (this.zLjUOn) {
            return;
        }
        this.zLjUOn = true;
        ((lGH) aA_()).OLrzqt((BSCMasterFragmentV3) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
