package o;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.viewmodel.CreationExtras;

/* JADX INFO: renamed from: o.ywm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58200ywm {
    public SavedStateHandle EZpvd;
    public final boolean KWHzl;
    public CreationExtras copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ() {
        this.copydefault = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(CreationExtras creationExtras) {
        if (this.EZpvd != null) {
            return;
        }
        this.copydefault = creationExtras;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd() {
        return this.EZpvd == null && this.copydefault == null;
    }

    public C58200ywm(@androidx.annotation.Nullable CreationExtras creationExtras) {
        this.KWHzl = creationExtras == null;
        this.copydefault = creationExtras;
    }
}
