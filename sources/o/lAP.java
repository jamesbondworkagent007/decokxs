package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class lAP extends C31940mJo {
    public final MutableLiveData<C32989mnw<Unit>> AEQbTJ = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> copydefault() {
        return this.AEQbTJ;
    }

    public final void EZpvd() {
        this.AEQbTJ.setValue(new C32989mnw<>(Unit.INSTANCE));
    }
}
