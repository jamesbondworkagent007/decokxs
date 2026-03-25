package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okex.common.ui.AutoDismissMessageDialogViewModel$1;
import kotlin.Unit;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: renamed from: o.snY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C45318snY extends AbstractC33073mpa {
    public final java.lang.Integer AEQbTJ;
    public final java.lang.Integer AhwBna;
    public final java.lang.String EZpvd;
    public final MutableLiveData<java.lang.Boolean> KWHzl;
    public final MutableLiveData<C32989mnw<Unit>> OLrzqt;
    public final MutableLiveData<java.lang.String> copydefault = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Boolean> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.String> copydefault() {
        return this.copydefault;
    }

    public C45318snY(java.lang.Integer num, java.lang.Integer num2, java.lang.String str) {
        this.AhwBna = num;
        this.AEQbTJ = num2;
        this.EZpvd = str;
        MutableLiveData<C32989mnw<Unit>> mutableLiveData = new MutableLiveData<>();
        this.OLrzqt = mutableLiveData;
        this.KWHzl = new MutableLiveData<>(java.lang.Boolean.FALSE);
        if (num != null && num2 != null && str != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AutoDismissMessageDialogViewModel$1(this, null), 3, null);
        } else {
            mutableLiveData.setValue(new C32989mnw<>(Unit.INSTANCE));
        }
    }

    public final void EZpvd() {
        this.KWHzl.setValue(java.lang.Boolean.TRUE);
        this.OLrzqt.setValue(new C32989mnw<>(Unit.INSTANCE));
    }
}
