package o;

import androidx.lifecycle.ViewModelProvider;
import com.okinc.im.imui.conversationlist.ConversationListFragment;

/* JADX INFO: loaded from: classes16.dex */
public abstract class nFQ extends AbstractC32998moE implements InterfaceC58208ywu {
    public android.content.ContextWrapper ejfBZ;
    public volatile C58196ywi fARcdN;
    public boolean fJNWhG;
    public final java.lang.Object AuCTel = new java.lang.Object();
    public boolean getFieldNames = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        OLrzqt();
        fJNWhG();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.ejfBZ;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        OLrzqt();
        fJNWhG();
    }

    private void OLrzqt() {
        if (this.ejfBZ == null) {
            this.ejfBZ = C58196ywi.EZpvd(super.getContext(), this);
            this.fJNWhG = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.fJNWhG) {
            return null;
        }
        OLrzqt();
        return this.ejfBZ;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return DbNXlk().aA_();
    }

    public C58196ywi AuCTel() {
        return new C58196ywi(this);
    }

    public final C58196ywi DbNXlk() {
        if (this.fARcdN == null) {
            synchronized (this.AuCTel) {
                if (this.fARcdN == null) {
                    this.fARcdN = AuCTel();
                }
            }
        }
        return this.fARcdN;
    }

    public void fJNWhG() {
        if (this.getFieldNames) {
            return;
        }
        this.getFieldNames = true;
        ((InterfaceC33789nFx) aA_()).OLrzqt((ConversationListFragment) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
