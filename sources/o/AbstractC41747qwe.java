package o;

/* JADX INFO: renamed from: o.qwe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC41747qwe extends AbstractC41759qwq {
    public boolean EZpvd = false;
    public android.content.ContextWrapper OLrzqt;
    public boolean copydefault;

    @Override // o.AbstractC41759qwq, o.AbstractC41765qww, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        EZpvd();
        AEQbTJ();
    }

    @Override // o.AbstractC41759qwq, o.AbstractC41765qww, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.OLrzqt;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        EZpvd();
        AEQbTJ();
    }

    private void EZpvd() {
        if (this.OLrzqt == null) {
            this.OLrzqt = C58196ywi.EZpvd(super.getContext(), this);
            this.copydefault = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // o.AbstractC41759qwq, o.AbstractC41765qww, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.copydefault) {
            return null;
        }
        EZpvd();
        return this.OLrzqt;
    }

    @Override // o.AbstractC41759qwq, o.AbstractC41765qww, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.AbstractC41765qww
    public void AEQbTJ() {
        if (this.EZpvd) {
            return;
        }
        this.EZpvd = true;
        ((InterfaceC41758qwp) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).EZpvd((C41755qwm) C58163ywB.EZpvd(this));
    }
}
