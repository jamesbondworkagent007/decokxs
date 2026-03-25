package o;

/* JADX INFO: renamed from: o.jAo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC25631jAo extends jWT {
    public android.content.ContextWrapper AEQbTJ;
    public boolean EZpvd = false;
    public boolean OLrzqt;

    @Override // o.AbstractC26242jXe, o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        KWHzl();
        EZpvd();
    }

    @Override // o.AbstractC26242jXe, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AEQbTJ;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        KWHzl();
        EZpvd();
    }

    private void KWHzl() {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = C58196ywi.EZpvd(super.getContext(), this);
            this.OLrzqt = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // o.AbstractC26242jXe, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.OLrzqt) {
            return null;
        }
        KWHzl();
        return this.AEQbTJ;
    }

    @Override // o.AbstractC26242jXe, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.AbstractC26242jXe
    public void EZpvd() {
        if (this.EZpvd) {
            return;
        }
        this.EZpvd = true;
        ((InterfaceC25641jAy) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).AEQbTJ((C25639jAw) C58163ywB.EZpvd(this));
    }
}
