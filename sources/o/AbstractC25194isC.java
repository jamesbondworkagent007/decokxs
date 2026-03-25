package o;

import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment;
import o.AbstractC22977hpY;

/* JADX INFO: renamed from: o.isC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC25194isC<VM extends AbstractC22977hpY> extends TransactionPageFragment<VM> implements InterfaceC58208ywu {
    public boolean AuCTel;
    public android.content.ContextWrapper fIwbmz;
    public volatile C58196ywi fJNWhG;
    public final java.lang.Object ejfBZ = new java.lang.Object();
    public boolean getFieldNames = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        aKErDB();
        UeEOUB();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.fIwbmz;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        aKErDB();
        UeEOUB();
    }

    private void aKErDB() {
        if (this.fIwbmz == null) {
            this.fIwbmz = C58196ywi.EZpvd(super.getContext(), this);
            this.AuCTel = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AuCTel) {
            return null;
        }
        aKErDB();
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

    /* JADX DEBUG: Possible override for method com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment.dNCPSb()Z */
    public C58196ywi dNCPSb() {
        return new C58196ywi(this);
    }

    public final C58196ywi RcXXUw() {
        if (this.fJNWhG == null) {
            synchronized (this.ejfBZ) {
                if (this.fJNWhG == null) {
                    this.fJNWhG = dNCPSb();
                }
            }
        }
        return this.fJNWhG;
    }

    public void UeEOUB() {
        if (this.getFieldNames) {
            return;
        }
        this.getFieldNames = true;
        ((InterfaceC25209isR) aA_()).AEQbTJ((C25205isN) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
