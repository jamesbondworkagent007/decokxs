package o;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.buysell.ui.bsc.BaseBuySellFragment;

/* JADX INFO: renamed from: o.lGg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC29948lGg<T extends ViewDataBinding> extends BaseBuySellFragment<T> implements InterfaceC58208ywu {
    public volatile C58196ywi AuCTelauCTel;
    public final java.lang.Object AubY;
    public boolean gHZMYf;
    public android.content.ContextWrapper wlaJM;
    public boolean zuBGHE;

    public AbstractC29948lGg(int i) {
        super(i);
        this.AubY = new java.lang.Object();
        this.zuBGHE = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AubY();
        gGvvIC();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.wlaJM;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AubY();
        gGvvIC();
    }

    private void AubY() {
        if (this.wlaJM == null) {
            this.wlaJM = C58196ywi.EZpvd(super.getContext(), this);
            this.gHZMYf = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.gHZMYf) {
            return null;
        }
        AubY();
        return this.wlaJM;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return flVtFt().aA_();
    }

    public C58196ywi fvQaOB() {
        return new C58196ywi(this);
    }

    public final C58196ywi flVtFt() {
        if (this.AuCTelauCTel == null) {
            synchronized (this.AubY) {
                if (this.AuCTelauCTel == null) {
                    this.AuCTelauCTel = fvQaOB();
                }
            }
        }
        return this.AuCTelauCTel;
    }

    public void gGvvIC() {
        if (this.zuBGHE) {
            return;
        }
        this.zuBGHE = true;
        ((InterfaceC29942lGa) aA_()).copydefault((lEN) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
