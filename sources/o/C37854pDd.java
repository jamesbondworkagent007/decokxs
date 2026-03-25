package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.okinc.kline.data.KlineStartTimeVo;
import com.okinc.kline.news.data.vo.KlineFlashItem;

/* JADX INFO: renamed from: o.pDd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37854pDd extends ViewModel {
    public final MutableLiveData<java.lang.Boolean> djBIcL = new MutableLiveData<>();
    public final MutableLiveData<java.lang.Boolean> AEQbTJ = new MutableLiveData<>();
    public MutableLiveData<java.lang.Boolean> valueOf = new MutableLiveData<>();
    public MutableLiveData<java.lang.Boolean> EZpvd = new MutableLiveData<>();
    public MutableLiveData<java.lang.Boolean> copydefault = new MutableLiveData<>();
    public MutableLiveData<java.lang.Boolean> OLrzqt = new MutableLiveData<>(java.lang.Boolean.FALSE);
    public final MutableLiveData<kotlin.Pair<java.lang.Boolean, java.util.List<KlineFlashItem>>> KWHzl = new MutableLiveData<>();
    public final MutableLiveData<java.util.List<KlineStartTimeVo>> gEmmrt = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.List<KlineStartTimeVo>> AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> AYXKKw() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> AhwBna() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<kotlin.Pair<java.lang.Boolean, java.util.List<KlineFlashItem>>> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> valueOf() {
        return this.valueOf;
    }

    public final void EZpvd() {
        this.gEmmrt.setValue(yDY.AhwBna());
    }
}
