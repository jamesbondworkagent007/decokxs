package o;

import androidx.lifecycle.ViewModelProvider;
import com.okinc.im.imui.contacts.ContactProfileFragment;

/* JADX INFO: renamed from: o.nzj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC35670nzj extends AbstractC32996moC implements InterfaceC58208ywu {
    public boolean AkhnZx;
    public volatile C58196ywi gEmmrt;
    public android.content.ContextWrapper valueOf;
    public final java.lang.Object djBIcL = new java.lang.Object();
    public boolean DbNXlk = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        KWHzl();
        valueOf();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.valueOf;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        KWHzl();
        valueOf();
    }

    private void KWHzl() {
        if (this.valueOf == null) {
            this.valueOf = C58196ywi.EZpvd(super.getContext(), this);
            this.AkhnZx = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AkhnZx) {
            return null;
        }
        KWHzl();
        return this.valueOf;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return djBIcL().aA_();
    }

    public C58196ywi gEmmrt() {
        return new C58196ywi(this);
    }

    public final C58196ywi djBIcL() {
        if (this.gEmmrt == null) {
            synchronized (this.djBIcL) {
                if (this.gEmmrt == null) {
                    this.gEmmrt = gEmmrt();
                }
            }
        }
        return this.gEmmrt;
    }

    public void valueOf() {
        if (this.DbNXlk) {
            return;
        }
        this.DbNXlk = true;
        ((InterfaceC35606nyY) aA_()).copydefault((ContactProfileFragment) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
