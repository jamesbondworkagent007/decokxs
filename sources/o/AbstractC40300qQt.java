package o;

/* JADX INFO: renamed from: o.qQt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC40300qQt extends C40321qRn {
    public boolean AEQbTJ = false;
    public android.content.ContextWrapper EZpvd;
    public boolean copydefault;

    @Override // o.C40321qRn, o.AbstractC40319qRl, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        KWHzl();
        OLrzqt();
    }

    @Override // o.C40321qRn, o.AbstractC40319qRl, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        android.content.ContextWrapper contextWrapper = this.EZpvd;
        C58209ywv.copydefault(contextWrapper == null || C58196ywi.OLrzqt(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        KWHzl();
        OLrzqt();
    }

    private void KWHzl() {
        if (this.EZpvd == null) {
            this.EZpvd = C58196ywi.EZpvd(super.getContext(), this);
            this.copydefault = C58125yvQ.copydefault(super.getContext());
        }
    }

    @Override // o.C40321qRn, o.AbstractC40319qRl, androidx.fragment.app.Fragment
    public android.content.Context getContext() {
        if (super.getContext() == null && !this.copydefault) {
            return null;
        }
        KWHzl();
        return this.EZpvd;
    }

    @Override // o.C40321qRn, o.AbstractC40319qRl, androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C58196ywi.copydefault(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // o.AbstractC40319qRl
    public void OLrzqt() {
        if (this.AEQbTJ) {
            return;
        }
        this.AEQbTJ = true;
        ((qQF) ((InterfaceC58208ywu) C58163ywB.EZpvd(this)).aA_()).EZpvd((qQI) C58163ywB.EZpvd(this));
    }
}
