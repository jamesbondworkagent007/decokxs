package o;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import o.lKH;

/* JADX INFO: loaded from: classes15.dex */
public abstract class lLU<BINDING extends ViewDataBinding, VM extends lKH> extends AbstractC30075lKz<BINDING, VM> implements InterfaceC58208ywu {
    public volatile C58196ywi ejfBZ;
    public android.content.ContextWrapper fIwbmz;
    public boolean getFieldNames;
    public final java.lang.Object getNewProxyInstance;
    public boolean uzCIH;

    public lLU(int i) {
        super(i);
        this.getNewProxyInstance = new java.lang.Object();
        this.uzCIH = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        getFieldNames();
        zLjUOn();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.fIwbmz;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        getFieldNames();
        zLjUOn();
    }

    private void getFieldNames() {
        if (this.fIwbmz == null) {
            this.fIwbmz = C58196ywi.EZpvd(super.getContext(), this);
            this.getFieldNames = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.getFieldNames) {
            return null;
        }
        getFieldNames();
        return this.fIwbmz;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return wlaJM().aA_();
    }

    public C58196ywi AubY() {
        return new C58196ywi(this);
    }

    public final C58196ywi wlaJM() {
        if (this.ejfBZ == null) {
            synchronized (this.getNewProxyInstance) {
                if (this.ejfBZ == null) {
                    this.ejfBZ = AubY();
                }
            }
        }
        return this.ejfBZ;
    }

    public void zLjUOn() {
        if (this.uzCIH) {
            return;
        }
        this.uzCIH = true;
        ((lLM) aA_()).KWHzl((C30094lLr) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
