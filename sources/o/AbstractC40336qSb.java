package o;

/* JADX INFO: renamed from: o.qSb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC40336qSb extends AbstractC40285qQe {
    public android.content.ContextWrapper EZpvd;
    public boolean djBIcL = false;
    public boolean gEmmrt;

    @Override // o.AbstractC40285qQe, o.qPV, o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        KWHzl();
        AEQbTJ();
    }

    @Override // o.AbstractC40285qQe, o.qPV, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.EZpvd;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        KWHzl();
        AEQbTJ();
    }

    private void KWHzl() {
        if (this.EZpvd == null) {
            this.EZpvd = C58196ywi.EZpvd(super.getContext(), this);
            this.gEmmrt = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // o.AbstractC40285qQe, o.qPV, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.gEmmrt) {
            return null;
        }
        KWHzl();
        return this.EZpvd;
    }

    @Override // o.AbstractC40285qQe, o.qPV, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.qPV
    public void AEQbTJ() {
        if (this.djBIcL) {
            return;
        }
        this.djBIcL = true;
        ((InterfaceC40337qSc) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).copydefault((C40340qSf) C58163ywB.EZpvd(this));
    }
}
