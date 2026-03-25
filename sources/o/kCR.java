package o;

/* JADX INFO: loaded from: classes7.dex */
public abstract class kCR extends jWT {
    public boolean AEQbTJ = false;
    public android.content.ContextWrapper EZpvd;
    public boolean copydefault;

    @Override // o.AbstractC26242jXe, o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        KWHzl();
        EZpvd();
    }

    @Override // o.AbstractC26242jXe, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.EZpvd;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        KWHzl();
        EZpvd();
    }

    private void KWHzl() {
        if (this.EZpvd == null) {
            this.EZpvd = C58196ywi.EZpvd(super.getContext(), this);
            this.copydefault = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // o.AbstractC26242jXe, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.copydefault) {
            return null;
        }
        KWHzl();
        return this.EZpvd;
    }

    @Override // o.AbstractC26242jXe, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.AbstractC26242jXe
    public void EZpvd() {
        if (this.AEQbTJ) {
            return;
        }
        this.AEQbTJ = true;
        ((kCL) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).KWHzl((kCI) C58163ywB.EZpvd(this));
    }
}
