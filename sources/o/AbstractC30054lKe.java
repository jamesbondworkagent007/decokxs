package o;

import androidx.lifecycle.ViewModelProvider;
import com.okinc.buysell.ui.entrance.BSCSelectorBottomSheet;

/* JADX INFO: renamed from: o.lKe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC30054lKe extends AbstractC52792wYn implements InterfaceC58208ywu {
    public volatile C58196ywi AhwBna;
    public boolean djBIcL;
    public android.content.ContextWrapper gEmmrt;
    public final java.lang.Object valueOf = new java.lang.Object();
    public boolean AYXKKw = false;

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AEQbTJ();
        EZpvd();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.gEmmrt;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AEQbTJ();
        EZpvd();
    }

    private void AEQbTJ() {
        if (this.gEmmrt == null) {
            this.gEmmrt = C58196ywi.EZpvd(super.getContext(), this);
            this.djBIcL = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.djBIcL) {
            return null;
        }
        AEQbTJ();
        return this.gEmmrt;
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

    public C58196ywi KWHzl() {
        return new C58196ywi(this);
    }

    public final C58196ywi OLrzqt() {
        if (this.AhwBna == null) {
            synchronized (this.valueOf) {
                if (this.AhwBna == null) {
                    this.AhwBna = KWHzl();
                }
            }
        }
        return this.AhwBna;
    }

    public void EZpvd() {
        if (this.AYXKKw) {
            return;
        }
        this.AYXKKw = true;
        ((InterfaceC30050lKa) aA_()).AEQbTJ((BSCSelectorBottomSheet) C58163ywB.EZpvd(this));
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return C58134yvZ.OLrzqt(this, super.getDefaultViewModelProviderFactory());
    }
}
