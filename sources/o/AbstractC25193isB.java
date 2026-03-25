package o;

import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment;
import o.AbstractC22977hpY;

/* JADX INFO: renamed from: o.isB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC25193isB<VM extends AbstractC22977hpY> extends TransactionPageFragment<VM> implements InterfaceC58208ywu {
    public boolean ejfBZ;
    public android.content.ContextWrapper fIwbmz;
    public volatile C58196ywi fJNWhG;
    public final java.lang.Object AuCTel = new java.lang.Object();
    public boolean hDKMBd = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        dNCPSb();
        djSkpj();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.fIwbmz;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        dNCPSb();
        djSkpj();
    }

    private void dNCPSb() {
        if (this.fIwbmz == null) {
            this.fIwbmz = C58196ywi.EZpvd(super.getContext(), this);
            this.ejfBZ = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.ejfBZ) {
            return null;
        }
        dNCPSb();
        return this.fIwbmz;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return RcXXUw().aA_();
    }

    /* JADX DEBUG: Possible override for method com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment.UeEOUB()V */
    public C58196ywi UeEOUB() {
        return new C58196ywi(this);
    }

    public final C58196ywi RcXXUw() {
        if (this.fJNWhG == null) {
            synchronized (this.AuCTel) {
                if (this.fJNWhG == null) {
                    this.fJNWhG = UeEOUB();
                }
            }
        }
        return this.fJNWhG;
    }

    public void djSkpj() {
        if (this.hDKMBd) {
            return;
        }
        this.hDKMBd = true;
        ((InterfaceC25273itc) aA_()).copydefault((C25212isU) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
