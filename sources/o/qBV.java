package o;

/* JADX INFO: loaded from: classes16.dex */
public abstract class qBV extends qBX {
    public boolean AYXKKw;
    public boolean AhwBna = false;
    public android.content.ContextWrapper valueOf;

    @Override // o.qBU, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        fARcdN();
        AEQbTJ();
    }

    @Override // o.qBU, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.valueOf;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        fARcdN();
        AEQbTJ();
    }

    private void fARcdN() {
        if (this.valueOf == null) {
            this.valueOf = C58196ywi.EZpvd(super.getContext(), this);
            this.AYXKKw = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // o.qBU, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AYXKKw) {
            return null;
        }
        fARcdN();
        return this.valueOf;
    }

    @Override // o.qBU, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.qBU
    public void AEQbTJ() {
        if (this.AhwBna) {
            return;
        }
        this.AhwBna = true;
        ((InterfaceC39905qCc) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).copydefault((qBY) C58163ywB.EZpvd(this));
    }
}
