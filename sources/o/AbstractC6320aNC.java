package o;

/* JADX INFO: renamed from: o.aNC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC6320aNC extends C6268aMD {
    public android.content.ContextWrapper AkhnZx;
    public boolean fARcdN;
    public boolean getFieldNames = false;

    @Override // o.C6268aMD, o.AbstractC6314aMx, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        AkhnZx();
        EZpvd();
    }

    @Override // o.AbstractC6314aMx, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AkhnZx;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        AkhnZx();
        EZpvd();
    }

    private void AkhnZx() {
        if (this.AkhnZx == null) {
            this.AkhnZx = C58196ywi.EZpvd(super.getContext(), this);
            this.fARcdN = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // o.AbstractC6314aMx, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.fARcdN) {
            return null;
        }
        AkhnZx();
        return this.AkhnZx;
    }

    @Override // o.AbstractC6314aMx, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.AbstractC6314aMx
    public void EZpvd() {
        if (this.getFieldNames) {
            return;
        }
        this.getFieldNames = true;
        ((InterfaceC6326aNI) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).EZpvd((C6319aNB) C58163ywB.EZpvd(this));
    }
}
