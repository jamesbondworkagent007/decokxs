package o;

import androidx.lifecycle.ViewModelProvider;
import com.okinc.unified.fragment.DeFiKlineFragment;

/* JADX INFO: renamed from: o.xkp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC55486xkp extends AbstractC32996moC implements InterfaceC58208ywu {
    public boolean getFieldNames;
    public volatile C58196ywi hDKMBd;
    public android.content.ContextWrapper iwGUEr;
    public final java.lang.Object uzCIH = new java.lang.Object();
    public boolean AuCTelauCTel = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        EZpvd();
        iwGUEr();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.iwGUEr;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        EZpvd();
        iwGUEr();
    }

    private void EZpvd() {
        if (this.iwGUEr == null) {
            this.iwGUEr = C58196ywi.EZpvd(super.getContext(), this);
            this.getFieldNames = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.getFieldNames) {
            return null;
        }
        EZpvd();
        return this.iwGUEr;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return hDKMBd().aA_();
    }

    public C58196ywi getFieldNames() {
        return new C58196ywi(this);
    }

    public final C58196ywi hDKMBd() {
        if (this.hDKMBd == null) {
            synchronized (this.uzCIH) {
                if (this.hDKMBd == null) {
                    this.hDKMBd = getFieldNames();
                }
            }
        }
        return this.hDKMBd;
    }

    public void iwGUEr() {
        if (this.AuCTelauCTel) {
            return;
        }
        this.AuCTelauCTel = true;
        ((InterfaceC55481xkk) aA_()).AEQbTJ((DeFiKlineFragment) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
