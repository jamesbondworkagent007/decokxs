package o;

import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment;
import o.AbstractC22977hpY;

/* JADX INFO: renamed from: o.isI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC25200isI<VM extends AbstractC22977hpY> extends TransactionPageFragment<VM> implements InterfaceC58208ywu {
    public volatile C58196ywi ejfBZ;
    public boolean fIwbmz;
    public android.content.ContextWrapper fJNWhG;
    public final java.lang.Object AuCTel = new java.lang.Object();
    public boolean getNewProxyInstance = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        RcXXUw();
        aKErDB();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.fJNWhG;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        RcXXUw();
        aKErDB();
    }

    private void RcXXUw() {
        if (this.fJNWhG == null) {
            this.fJNWhG = C58196ywi.EZpvd(super.getContext(), this);
            this.fIwbmz = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.fIwbmz) {
            return null;
        }
        RcXXUw();
        return this.fJNWhG;
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

    /* JADX DEBUG: Possible override for method com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment.UeEOUB()V */
    public C58196ywi UeEOUB() {
        return new C58196ywi(this);
    }

    /* JADX DEBUG: Possible override for method com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment.dNCPSb()Z */
    public final C58196ywi dNCPSb() {
        if (this.ejfBZ == null) {
            synchronized (this.AuCTel) {
                if (this.ejfBZ == null) {
                    this.ejfBZ = UeEOUB();
                }
            }
        }
        return this.ejfBZ;
    }

    public void aKErDB() {
        if (this.getNewProxyInstance) {
            return;
        }
        this.getNewProxyInstance = true;
        ((InterfaceC25276itf) aA_()).KWHzl((C25275ite) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
