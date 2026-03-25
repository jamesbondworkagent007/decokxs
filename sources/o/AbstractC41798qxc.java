package o;

/* JADX INFO: renamed from: o.qxc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC41798qxc extends AbstractC41738qwV {
    public android.content.ContextWrapper AYXKKw;
    public boolean fetchVPNInfo = false;
    public boolean values;

    @Override // o.AbstractC41741qwY, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        isConnected();
        valueOf();
    }

    @Override // o.AbstractC41741qwY, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.AYXKKw;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        isConnected();
        valueOf();
    }

    private void isConnected() {
        if (this.AYXKKw == null) {
            this.AYXKKw = C58196ywi.EZpvd(super.getContext(), this);
            this.values = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // o.AbstractC41741qwY, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.values) {
            return null;
        }
        isConnected();
        return this.AYXKKw;
    }

    @Override // o.AbstractC41741qwY, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.AbstractC41741qwY
    public void valueOf() {
        if (this.fetchVPNInfo) {
            return;
        }
        this.fetchVPNInfo = true;
        ((InterfaceC41806qxk) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).OLrzqt((C41808qxm) C58163ywB.EZpvd(this));
    }
}
