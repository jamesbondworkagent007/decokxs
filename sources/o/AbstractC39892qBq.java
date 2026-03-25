package o;

/* JADX INFO: renamed from: o.qBq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC39892qBq extends C40196qMx {
    public android.content.ContextWrapper AEQbTJ;
    public boolean KWHzl = false;
    public boolean copydefault;

    @Override // o.C40196qMx, o.AbstractC40183qMk, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AhwBna();
        OLrzqt();
    }

    @Override // o.C40196qMx, o.AbstractC40183qMk, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AEQbTJ;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AhwBna();
        OLrzqt();
    }

    private void AhwBna() {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = C58196ywi.EZpvd(super.getContext(), this);
            this.copydefault = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // o.C40196qMx, o.AbstractC40183qMk, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.copydefault) {
            return null;
        }
        AhwBna();
        return this.AEQbTJ;
    }

    @Override // o.C40196qMx, o.AbstractC40183qMk, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.AbstractC40183qMk
    public void OLrzqt() {
        if (this.KWHzl) {
            return;
        }
        this.KWHzl = true;
        ((qBF) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).OLrzqt((qBA) C58163ywB.EZpvd(this));
    }
}
