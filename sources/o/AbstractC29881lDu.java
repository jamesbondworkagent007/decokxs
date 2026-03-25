package o;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.lDu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC29881lDu<T extends ViewDataBinding> extends lzR<T> implements InterfaceC58208ywu {
    public final java.lang.Object AkhnZx;
    public boolean AuCTel;
    public android.content.ContextWrapper DbNXlk;
    public boolean fARcdN;
    public volatile C58196ywi isConnected;

    public AbstractC29881lDu(int i) {
        super(i);
        this.AkhnZx = new java.lang.Object();
        this.fARcdN = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        fJNWhG();
        QVAiDq();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.DbNXlk;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        fJNWhG();
        QVAiDq();
    }

    private void fJNWhG() {
        if (this.DbNXlk == null) {
            this.DbNXlk = C58196ywi.EZpvd(super.getContext(), this);
            this.AuCTel = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AuCTel) {
            return null;
        }
        fJNWhG();
        return this.DbNXlk;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return DTwDnp().aA_();
    }

    public C58196ywi QKVWgx() {
        return new C58196ywi(this);
    }

    public final C58196ywi DTwDnp() {
        if (this.isConnected == null) {
            synchronized (this.AkhnZx) {
                if (this.isConnected == null) {
                    this.isConnected = QKVWgx();
                }
            }
        }
        return this.isConnected;
    }

    public void QVAiDq() {
        if (this.fARcdN) {
            return;
        }
        this.fARcdN = true;
        ((InterfaceC29876lDp) aA_()).AEQbTJ((C29848lCo) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
