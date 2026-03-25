package o;

import androidx.lifecycle.ViewModel;

/* JADX INFO: renamed from: o.xop, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C55698xop extends ViewModel {
    public final C55700xor EZpvd = new C55700xor();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55700xor copydefault() {
        return this.EZpvd;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.EZpvd.OLrzqt();
    }
}
