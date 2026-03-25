package o;

import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment;
import o.AbstractC22977hpY;

/* JADX INFO: renamed from: o.isJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC25201isJ<VM extends AbstractC22977hpY> extends TransactionPageFragment<VM> implements InterfaceC58208ywu {
    public boolean ejfBZ;
    public android.content.ContextWrapper fIwbmz;
    public volatile C58196ywi fJNWhG;
    public final java.lang.Object AuCTel = new java.lang.Object();
    public boolean uzCIH = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        UeEOUB();
        djSkpj();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.fIwbmz;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        UeEOUB();
        djSkpj();
    }

    private void UeEOUB() {
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
        UeEOUB();
        return this.fIwbmz;
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

    /* JADX DEBUG: Possible override for method com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment.aKErDB()V */
    public C58196ywi aKErDB() {
        return new C58196ywi(this);
    }

    /* JADX DEBUG: Possible override for method com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment.dNCPSb()Z */
    public final C58196ywi dNCPSb() {
        if (this.fJNWhG == null) {
            synchronized (this.AuCTel) {
                if (this.fJNWhG == null) {
                    this.fJNWhG = aKErDB();
                }
            }
        }
        return this.fJNWhG;
    }

    public void djSkpj() {
        if (this.uzCIH) {
            return;
        }
        this.uzCIH = true;
        ((InterfaceC25283itm) aA_()).AEQbTJ((C25277itg) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
