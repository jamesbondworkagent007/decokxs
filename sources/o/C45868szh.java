package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.Unit;

/* JADX INFO: renamed from: o.szh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45868szh extends ViewModel {
    public final MutableLiveData<C32989mnw<Unit>> AEQbTJ;
    public final MutableLiveData<C32989mnw<Unit>> EZpvd;
    public final MutableLiveData<C32989mnw<Unit>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> copydefault() {
        return this.AEQbTJ;
    }

    public C45868szh() {
        MutableLiveData<C32989mnw<Unit>> mutableLiveData = new MutableLiveData<>();
        this.AEQbTJ = mutableLiveData;
        this.EZpvd = new MutableLiveData<>();
        this.copydefault = new MutableLiveData<>();
        mutableLiveData.setValue(new C32989mnw<>(Unit.INSTANCE));
    }

    public final void AEQbTJ() {
        this.EZpvd.setValue(new C32989mnw<>(Unit.INSTANCE));
    }

    public final void OLrzqt() {
        this.copydefault.setValue(new C32989mnw<>(Unit.INSTANCE));
    }
}
