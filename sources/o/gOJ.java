package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dex.trade.common.expire.model.ExpireTimeData;

/* JADX INFO: loaded from: classes5.dex */
public abstract class gOJ extends AbstractC33073mpa {
    public final MutableLiveData<java.lang.Boolean> KWHzl = new MutableLiveData<>();
    public final MutableLiveData<ExpireTimeData> AEQbTJ = new MutableLiveData<>();
    public final MutableLiveData<kotlin.Pair<java.lang.Boolean, java.lang.Integer>> EZpvd = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<kotlin.Pair<java.lang.Boolean, java.lang.Integer>> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<ExpireTimeData> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> OLrzqt() {
        return this.KWHzl;
    }
}
