package o;

/* JADX INFO: renamed from: o.qnn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC41279qnn extends C41285qnt {
    public boolean AYXKKw;
    public boolean djBIcL = false;
    public android.content.ContextWrapper gEmmrt;

    @Override // o.AbstractC41282qnq, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        DbNXlk();
        AEQbTJ();
    }

    @Override // o.AbstractC41282qnq, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.gEmmrt;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        DbNXlk();
        AEQbTJ();
    }

    private void DbNXlk() {
        if (this.gEmmrt == null) {
            this.gEmmrt = C58196ywi.EZpvd(super.getContext(), this);
            this.AYXKKw = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // o.AbstractC41282qnq, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.AYXKKw) {
            return null;
        }
        DbNXlk();
        return this.gEmmrt;
    }

    @Override // o.AbstractC41282qnq, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.AbstractC41282qnq
    public void AEQbTJ() {
        if (this.djBIcL) {
            return;
        }
        this.djBIcL = true;
        ((InterfaceC41244qnE) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).copydefault((C41242qnC) C58163ywB.EZpvd(this));
    }
}
