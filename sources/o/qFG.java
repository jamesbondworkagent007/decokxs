package o;

import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import com.okinc.market.search.features.main.result.ui.page.SearchResultOverviewFragment;

/* JADX INFO: loaded from: classes9.dex */
public abstract class qFG<T extends ViewBinding> extends AbstractC40007qFx<T> implements InterfaceC58208ywu {
    public volatile C58196ywi EZpvd;
    public android.content.ContextWrapper copydefault;
    public boolean djBIcL;
    public final java.lang.Object gEmmrt = new java.lang.Object();
    public boolean valueOf = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        djBIcL();
        AhwBna();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.copydefault;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        djBIcL();
        AhwBna();
    }

    private void djBIcL() {
        if (this.copydefault == null) {
            this.copydefault = C58196ywi.EZpvd(super.getContext(), this);
            this.djBIcL = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.djBIcL) {
            return null;
        }
        djBIcL();
        return this.copydefault;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return gEmmrt().aA_();
    }

    public C58196ywi valueOf() {
        return new C58196ywi(this);
    }

    public final C58196ywi gEmmrt() {
        if (this.EZpvd == null) {
            synchronized (this.gEmmrt) {
                if (this.EZpvd == null) {
                    this.EZpvd = valueOf();
                }
            }
        }
        return this.EZpvd;
    }

    public void AhwBna() {
        if (this.valueOf) {
            return;
        }
        this.valueOf = true;
        ((InterfaceC40031qGu) aA_()).copydefault((SearchResultOverviewFragment) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
