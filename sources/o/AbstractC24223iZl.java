package o;

import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: o.iZl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC24223iZl extends wXX implements InterfaceC58208ywu {
    public android.content.ContextWrapper AkhnZx;
    public boolean fJNWhG;
    public volatile C58196ywi isConnected;
    public final java.lang.Object ejfBZ = new java.lang.Object();
    public boolean AuCTel = false;

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        EZpvd();
        gEmmrt();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AkhnZx;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        EZpvd();
        gEmmrt();
    }

    private void EZpvd() {
        if (this.AkhnZx == null) {
            this.AkhnZx = C58196ywi.EZpvd(super.getContext(), this);
            this.fJNWhG = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.fJNWhG) {
            return null;
        }
        EZpvd();
        return this.AkhnZx;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return OLrzqt().aA_();
    }

    public C58196ywi valueOf() {
        return new C58196ywi(this);
    }

    public final C58196ywi OLrzqt() {
        if (this.isConnected == null) {
            synchronized (this.ejfBZ) {
                if (this.isConnected == null) {
                    this.isConnected = valueOf();
                }
            }
        }
        return this.isConnected;
    }

    public void gEmmrt() {
        if (this.AuCTel) {
            return;
        }
        this.AuCTel = true;
        ((InterfaceC24222iZk) aA_()).AEQbTJ((C24214iZc) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
