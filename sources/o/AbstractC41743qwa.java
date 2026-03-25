package o;

/* JADX INFO: renamed from: o.qwa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC41743qwa extends AbstractC41678qvO {
    public android.content.ContextWrapper AkhnZx;
    public boolean DbNXlk = false;
    public boolean values;

    @Override // o.AbstractC41689qvZ, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        fetchVPNInfo();
        AkhnZx();
    }

    @Override // o.AbstractC41689qvZ, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AkhnZx;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        fetchVPNInfo();
        AkhnZx();
    }

    private void fetchVPNInfo() {
        if (this.AkhnZx == null) {
            this.AkhnZx = C58196ywi.EZpvd(super.getContext(), this);
            this.values = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // o.AbstractC41689qvZ, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.values) {
            return null;
        }
        fetchVPNInfo();
        return this.AkhnZx;
    }

    @Override // o.AbstractC41689qvZ, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.AbstractC41689qvZ
    public void AkhnZx() {
        if (this.DbNXlk) {
            return;
        }
        this.DbNXlk = true;
        ((InterfaceC41756qwn) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).EZpvd((C41753qwk) C58163ywB.EZpvd(this));
    }
}
