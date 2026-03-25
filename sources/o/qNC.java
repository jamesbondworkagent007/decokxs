package o;

import androidx.lifecycle.ViewModelProvider;
import com.okinc.market.quotation.ui.AbsQuotationFragment;
import com.okinc.market.search.features.navigation.result.NavSearchResultFragment;

/* JADX INFO: loaded from: classes9.dex */
public abstract class qNC extends AbsQuotationFragment implements InterfaceC58208ywu {
    public volatile C58196ywi AYXKKw;
    public boolean djBIcL;
    public android.content.ContextWrapper gEmmrt;
    public final java.lang.Object valueOf = new java.lang.Object();
    public boolean values = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        EZpvd();
        AEQbTJ();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.gEmmrt;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        EZpvd();
        AEQbTJ();
    }

    private void EZpvd() {
        if (this.gEmmrt == null) {
            this.gEmmrt = C58196ywi.EZpvd(super.getContext(), this);
            this.djBIcL = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.djBIcL) {
            return null;
        }
        EZpvd();
        return this.gEmmrt;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return valueOf().aA_();
    }

    public C58196ywi gEmmrt() {
        return new C58196ywi(this);
    }

    public final C58196ywi valueOf() {
        if (this.AYXKKw == null) {
            synchronized (this.valueOf) {
                if (this.AYXKKw == null) {
                    this.AYXKKw = gEmmrt();
                }
            }
        }
        return this.AYXKKw;
    }

    public void AEQbTJ() {
        if (this.values) {
            return;
        }
        this.values = true;
        ((qNI) aA_()).AEQbTJ((NavSearchResultFragment) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
