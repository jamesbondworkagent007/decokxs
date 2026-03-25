package o;

/* JADX INFO: renamed from: o.qoz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC41344qoz extends C41341qow {
    public android.content.ContextWrapper AhwBna;
    public boolean gEmmrt = false;
    public boolean valueOf;

    @Override // o.C41341qow, o.AbstractC41342qox, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        gEmmrt();
        valueOf();
    }

    @Override // o.AbstractC41342qox, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AhwBna;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        gEmmrt();
        valueOf();
    }

    private void gEmmrt() {
        if (this.AhwBna == null) {
            this.AhwBna = C58196ywi.EZpvd(super.getContext(), this);
            this.valueOf = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // o.AbstractC41342qox, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.valueOf) {
            return null;
        }
        gEmmrt();
        return this.AhwBna;
    }

    @Override // o.AbstractC41342qox, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.AbstractC41342qox
    public void valueOf() {
        if (this.gEmmrt) {
            return;
        }
        this.gEmmrt = true;
        ((InterfaceC41300qoH) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).AEQbTJ((C41296qoD) C58163ywB.EZpvd(this));
    }
}
