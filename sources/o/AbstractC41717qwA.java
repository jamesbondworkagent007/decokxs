package o;

/* JADX INFO: renamed from: o.qwA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC41717qwA extends AbstractC41759qwq {
    public boolean KWHzl;
    public boolean OLrzqt = false;
    public android.content.ContextWrapper copydefault;

    @Override // o.AbstractC41759qwq, o.AbstractC41765qww, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        EZpvd();
        AEQbTJ();
    }

    @Override // o.AbstractC41759qwq, o.AbstractC41765qww, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.copydefault;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        EZpvd();
        AEQbTJ();
    }

    private void EZpvd() {
        if (this.copydefault == null) {
            this.copydefault = C58196ywi.EZpvd(super.getContext(), this);
            this.KWHzl = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // o.AbstractC41759qwq, o.AbstractC41765qww, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.KWHzl) {
            return null;
        }
        EZpvd();
        return this.copydefault;
    }

    @Override // o.AbstractC41759qwq, o.AbstractC41765qww, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.AbstractC41765qww
    public void AEQbTJ() {
        if (this.OLrzqt) {
            return;
        }
        this.OLrzqt = true;
        ((InterfaceC41730qwN) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).AEQbTJ((C41729qwM) C58163ywB.EZpvd(this));
    }
}
