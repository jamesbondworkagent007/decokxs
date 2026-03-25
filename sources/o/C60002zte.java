package o;

import androidx.lifecycle.ViewModel;

/* JADX INFO: renamed from: o.zte, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C60002zte extends ViewModel {
    public C60060zuj OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(C60060zuj c60060zuj) {
        this.OLrzqt = c60060zuj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C60060zuj copydefault() {
        return this.OLrzqt;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        C60060zuj c60060zuj = this.OLrzqt;
        if (c60060zuj != null && c60060zuj.djBIcL()) {
            c60060zuj.EZpvd().EZpvd("Closing scope " + this.OLrzqt);
            c60060zuj.KWHzl();
        }
        this.OLrzqt = null;
    }
}
