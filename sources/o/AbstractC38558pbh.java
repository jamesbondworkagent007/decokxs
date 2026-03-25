package o;

/* JADX INFO: renamed from: o.pbh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC38558pbh extends oYA {
    public boolean RdAHlO = false;
    public boolean dHguZz;
    public android.content.ContextWrapper gwTjWJ;

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
            this.dHguZz = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // o.AbstractC38554pbd, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.dHguZz) {
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
        if (this.RdAHlO) {
            return;
        }
        this.RdAHlO = true;
        ((InterfaceC38735pez) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).EZpvd((ViewOnClickListenerC38659pdc) C58163ywB.EZpvd(this));
    }
}
