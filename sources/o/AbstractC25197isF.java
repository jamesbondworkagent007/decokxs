package o;

import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment;
import o.AbstractC22977hpY;

/* JADX INFO: renamed from: o.isF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC25197isF<VM extends AbstractC22977hpY> extends TransactionPageFragment<VM> implements InterfaceC58208ywu {
    public boolean AuCTel;
    public android.content.ContextWrapper ejfBZ;
    public volatile C58196ywi fIwbmz;
    public final java.lang.Object fJNWhG = new java.lang.Object();
    public boolean uzCIH = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        aKErDB();
        djSkpj();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.ejfBZ;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        aKErDB();
        djSkpj();
    }

    private void aKErDB() {
        if (this.ejfBZ == null) {
            this.ejfBZ = C58196ywi.EZpvd(super.getContext(), this);
            this.AuCTel = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AuCTel) {
            return null;
        }
        aKErDB();
        return this.ejfBZ;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return dNCPSb().aA_();
    }

    public C58196ywi RcXXUw() {
        return new C58196ywi(this);
    }

    /* JADX DEBUG: Possible override for method com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment.dNCPSb()Z */
    public final C58196ywi dNCPSb() {
        if (this.fIwbmz == null) {
            synchronized (this.fJNWhG) {
                if (this.fIwbmz == null) {
                    this.fIwbmz = RcXXUw();
                }
            }
        }
        return this.fIwbmz;
    }

    public void djSkpj() {
        if (this.uzCIH) {
            return;
        }
        this.uzCIH = true;
        ((InterfaceC25204isM) aA_()).OLrzqt((C25199isH) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
