package o;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import o.lKH;

/* JADX INFO: renamed from: o.lOk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC30169lOk<BINDING extends ViewDataBinding, VM extends lKH> extends AbstractC30075lKz<BINDING, VM> implements InterfaceC58208ywu {
    public boolean AkhnZx;
    public android.content.ContextWrapper DbNXlk;
    public boolean fIwbmz;
    public volatile C58196ywi fetchVPNInfo;
    public final java.lang.Object values;

    public AbstractC30169lOk(int i) {
        super(i);
        this.values = new java.lang.Object();
        this.fIwbmz = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        iwGUEr();
        hDKMBd();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.DbNXlk;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        iwGUEr();
        hDKMBd();
    }

    private void iwGUEr() {
        if (this.DbNXlk == null) {
            this.DbNXlk = C58196ywi.EZpvd(super.getContext(), this);
            this.AkhnZx = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AkhnZx) {
            return null;
        }
        iwGUEr();
        return this.DbNXlk;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return getNewProxyInstance().aA_();
    }

    public C58196ywi getFieldNames() {
        return new C58196ywi(this);
    }

    /* JADX DEBUG: Possible override for method o.lKz.getNewProxyInstance()V */
    public final C58196ywi getNewProxyInstance() {
        if (this.fetchVPNInfo == null) {
            synchronized (this.values) {
                if (this.fetchVPNInfo == null) {
                    this.fetchVPNInfo = getFieldNames();
                }
            }
        }
        return this.fetchVPNInfo;
    }

    public void hDKMBd() {
        if (this.fIwbmz) {
            return;
        }
        this.fIwbmz = true;
        ((lOE) aA_()).EZpvd((C30172lOn) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
