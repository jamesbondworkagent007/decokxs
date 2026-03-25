package o;

import androidx.lifecycle.ViewModelProvider;
import com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheet;

/* JADX INFO: loaded from: classes15.dex */
public abstract class lEI extends wXX implements InterfaceC58208ywu {
    public android.content.ContextWrapper AuCTel;
    public boolean fARcdN;
    public volatile C58196ywi fJNWhG;
    public final java.lang.Object fIwbmz = new java.lang.Object();
    public boolean getNewProxyInstance = false;

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        KWHzl();
        djBIcL();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AuCTel;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        KWHzl();
        djBIcL();
    }

    private void KWHzl() {
        if (this.AuCTel == null) {
            this.AuCTel = C58196ywi.EZpvd(super.getContext(), this);
            this.fARcdN = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.fARcdN) {
            return null;
        }
        KWHzl();
        return this.AuCTel;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return AEQbTJ().aA_();
    }

    public C58196ywi valueOf() {
        return new C58196ywi(this);
    }

    public final C58196ywi AEQbTJ() {
        if (this.fJNWhG == null) {
            synchronized (this.fIwbmz) {
                if (this.fJNWhG == null) {
                    this.fJNWhG = valueOf();
                }
            }
        }
        return this.fJNWhG;
    }

    public void djBIcL() {
        if (this.getNewProxyInstance) {
            return;
        }
        this.getNewProxyInstance = true;
        ((InterfaceC29913lEz) aA_()).EZpvd((CryptoListBottomSheet) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
