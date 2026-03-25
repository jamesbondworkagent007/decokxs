package o;

/* JADX INFO: loaded from: classes16.dex */
public abstract class qBN extends AbstractC40285qQe {
    public boolean EZpvd = false;
    public boolean OLrzqt;
    public android.content.ContextWrapper copydefault;

    @Override // o.AbstractC40285qQe, o.qPV, o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        KWHzl();
        AEQbTJ();
    }

    @Override // o.AbstractC40285qQe, o.qPV, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.copydefault;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        KWHzl();
        AEQbTJ();
    }

    private void KWHzl() {
        if (this.copydefault == null) {
            this.copydefault = C58196ywi.EZpvd(super.getContext(), this);
            this.OLrzqt = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // o.AbstractC40285qQe, o.qPV, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.OLrzqt) {
            return null;
        }
        KWHzl();
        return this.copydefault;
    }

    @Override // o.AbstractC40285qQe, o.qPV, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.qPV
    public void AEQbTJ() {
        if (this.EZpvd) {
            return;
        }
        this.EZpvd = true;
        ((qBK) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).OLrzqt((qBJ) C58163ywB.EZpvd(this));
    }
}
