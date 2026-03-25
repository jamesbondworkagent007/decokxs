package o;

/* JADX INFO: renamed from: o.qxe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC41800qxe extends AbstractC41738qwV {
    public android.content.ContextWrapper AYXKKw;
    public boolean AkhnZx;
    public boolean DbNXlk = false;

    @Override // o.AbstractC41741qwY, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        fetchVPNInfo();
        valueOf();
    }

    @Override // o.AbstractC41741qwY, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AYXKKw;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        fetchVPNInfo();
        valueOf();
    }

    private void fetchVPNInfo() {
        if (this.AYXKKw == null) {
            this.AYXKKw = C58196ywi.EZpvd(super.getContext(), this);
            this.AkhnZx = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // o.AbstractC41741qwY, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AkhnZx) {
            return null;
        }
        fetchVPNInfo();
        return this.AYXKKw;
    }

    @Override // o.AbstractC41741qwY, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.AbstractC41741qwY
    public void valueOf() {
        if (this.DbNXlk) {
            return;
        }
        this.DbNXlk = true;
        ((InterfaceC41807qxl) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).KWHzl((C41805qxj) C58163ywB.EZpvd(this));
    }
}
