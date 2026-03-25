package o;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import o.lKH;

/* JADX INFO: loaded from: classes15.dex */
public abstract class lLT<BINDING extends ViewDataBinding, VM extends lKH> extends AbstractC30075lKz<BINDING, VM> implements InterfaceC58208ywu {
    public volatile C58196ywi ejfBZ;
    public android.content.ContextWrapper fARcdN;
    public boolean getFieldNames;
    public boolean iwGUEr;
    public final java.lang.Object uzCIH;

    public lLT(int i) {
        super(i);
        this.uzCIH = new java.lang.Object();
        this.getFieldNames = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        iwGUEr();
        zuBGHE();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.fARcdN;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        iwGUEr();
        zuBGHE();
    }

    private void iwGUEr() {
        if (this.fARcdN == null) {
            this.fARcdN = C58196ywi.EZpvd(super.getContext(), this);
            this.iwGUEr = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.iwGUEr) {
            return null;
        }
        iwGUEr();
        return this.fARcdN;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return AuCTelauCTel().aA_();
    }

    public C58196ywi zsXlph() {
        return new C58196ywi(this);
    }

    public final C58196ywi AuCTelauCTel() {
        if (this.ejfBZ == null) {
            synchronized (this.uzCIH) {
                if (this.ejfBZ == null) {
                    this.ejfBZ = zsXlph();
                }
            }
        }
        return this.ejfBZ;
    }

    public void zuBGHE() {
        if (this.getFieldNames) {
            return;
        }
        this.getFieldNames = true;
        ((InterfaceC30090lLn) aA_()).EZpvd((C30077lLa) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
