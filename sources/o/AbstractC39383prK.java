package o;

import com.okinc.kline.ui.formula.ui.KLineFormulaFragment;

/* JADX INFO: renamed from: o.prK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC39383prK extends oYA {
    public boolean dHguZz = false;
    public android.content.ContextWrapper gwTjWJ;
    public boolean hBpjJd;

    @Override // o.oYA, o.AbstractC38554pbd, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        OLrzqt();
        hrNTAI();
    }

    @Override // o.AbstractC38554pbd, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.gwTjWJ;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        OLrzqt();
        hrNTAI();
    }

    private void OLrzqt() {
        if (this.gwTjWJ == null) {
            this.gwTjWJ = C58196ywi.EZpvd(super.getContext(), this);
            this.hBpjJd = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // o.AbstractC38554pbd, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.hBpjJd) {
            return null;
        }
        OLrzqt();
        return this.gwTjWJ;
    }

    @Override // o.AbstractC38554pbd, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.AbstractC38554pbd
    public void hrNTAI() {
        if (this.dHguZz) {
            return;
        }
        this.dHguZz = true;
        ((InterfaceC39438psO) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).copydefault((KLineFormulaFragment) C58163ywB.EZpvd(this));
    }
}
