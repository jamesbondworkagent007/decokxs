package o;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import o.lKH;

/* JADX INFO: renamed from: o.lOj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC30168lOj<BINDING extends ViewDataBinding, VM extends lKH> extends AbstractC30075lKz<BINDING, VM> implements InterfaceC58208ywu {
    public volatile C58196ywi fARcdN;
    public android.content.ContextWrapper fJNWhG;
    public boolean getFieldNames;
    public final java.lang.Object hDKMBd;
    public boolean uzCIH;

    public AbstractC30168lOj(int i) {
        super(i);
        this.hDKMBd = new java.lang.Object();
        this.uzCIH = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        getNewProxyInstance();
        zsXlph();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.fJNWhG;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        getNewProxyInstance();
        zsXlph();
    }

    private void getNewProxyInstance() {
        if (this.fJNWhG == null) {
            this.fJNWhG = C58196ywi.EZpvd(super.getContext(), this);
            this.getFieldNames = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.getFieldNames) {
            return null;
        }
        getNewProxyInstance();
        return this.fJNWhG;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return zLjUOn().aA_();
    }

    public C58196ywi AubY() {
        return new C58196ywi(this);
    }

    public final C58196ywi zLjUOn() {
        if (this.fARcdN == null) {
            synchronized (this.hDKMBd) {
                if (this.fARcdN == null) {
                    this.fARcdN = AubY();
                }
            }
        }
        return this.fARcdN;
    }

    public void zsXlph() {
        if (this.uzCIH) {
            return;
        }
        this.uzCIH = true;
        ((InterfaceC30164lOf) aA_()).EZpvd((lNN) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
