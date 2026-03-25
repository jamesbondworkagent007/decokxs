package o;

/* JADX INFO: renamed from: o.qvY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC41688qvY extends AbstractC41678qvO {
    public android.content.ContextWrapper fetchVPNInfo;
    public boolean isConnected = false;
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
        android.content.ContextWrapper contextWrapper = this.fetchVPNInfo;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        fetchVPNInfo();
        AkhnZx();
    }

    private void fetchVPNInfo() {
        if (this.fetchVPNInfo == null) {
            this.fetchVPNInfo = C58196ywi.EZpvd(super.getContext(), this);
            this.values = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // o.AbstractC41689qvZ, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.values) {
            return null;
        }
        fetchVPNInfo();
        return this.fetchVPNInfo;
    }

    @Override // o.AbstractC41689qvZ, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.AbstractC41689qvZ
    public void AkhnZx() {
        if (this.isConnected) {
            return;
        }
        this.isConnected = true;
        ((InterfaceC41750qwh) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).OLrzqt((C41751qwi) C58163ywB.EZpvd(this));
    }
}
