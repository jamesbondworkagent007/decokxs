package o;

/* JADX INFO: renamed from: o.lml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31054lml extends AbstractC30827liW {
    public android.content.ContextWrapper AkhnZx;
    public boolean AuCTel;
    public boolean getNewProxyInstance = false;

    @Override // o.AbstractC30896ljm, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        zLjUOn();
        zsXlph();
    }

    @Override // o.AbstractC30896ljm, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AkhnZx;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        zLjUOn();
        zsXlph();
    }

    private void zLjUOn() {
        if (this.AkhnZx == null) {
            this.AkhnZx = C58196ywi.EZpvd(super.getContext(), this);
            this.AuCTel = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // o.AbstractC30896ljm, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AuCTel) {
            return null;
        }
        zLjUOn();
        return this.AkhnZx;
    }

    @Override // o.AbstractC30896ljm, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.AbstractC30896ljm
    public void zsXlph() {
        if (this.getNewProxyInstance) {
            return;
        }
        this.getNewProxyInstance = true;
        ((InterfaceC31057lmo) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).copydefault((C31055lmm) C58163ywB.EZpvd(this));
    }
}
