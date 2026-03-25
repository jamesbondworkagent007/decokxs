package o;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.lBe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC29811lBe<T extends ViewDataBinding> extends lzN<T> implements InterfaceC58208ywu {
    public volatile C58196ywi AkhnZx;
    public final java.lang.Object AuCTel;
    public boolean fARcdN;
    public boolean fIwbmz;
    public android.content.ContextWrapper fetchVPNInfo;

    public AbstractC29811lBe(int i) {
        super(i);
        this.AuCTel = new java.lang.Object();
        this.fARcdN = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        fetchVPNInfo();
        fIwbmz();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.fetchVPNInfo;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        fetchVPNInfo();
        fIwbmz();
    }

    private void fetchVPNInfo() {
        if (this.fetchVPNInfo == null) {
            this.fetchVPNInfo = C58196ywi.EZpvd(super.getContext(), this);
            this.fIwbmz = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.fIwbmz) {
            return null;
        }
        fetchVPNInfo();
        return this.fetchVPNInfo;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return AkhnZx().aA_();
    }

    public C58196ywi AuCTel() {
        return new C58196ywi(this);
    }

    public final C58196ywi AkhnZx() {
        if (this.AkhnZx == null) {
            synchronized (this.AuCTel) {
                if (this.AkhnZx == null) {
                    this.AkhnZx = AuCTel();
                }
            }
        }
        return this.AkhnZx;
    }

    public void fIwbmz() {
        if (this.fARcdN) {
            return;
        }
        this.fARcdN = true;
        ((lAV) aA_()).copydefault((lAQ) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
