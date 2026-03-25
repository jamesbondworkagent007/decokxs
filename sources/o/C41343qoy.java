package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.okinc.market.discover.features.markets.viewmodel.OverviewTab;

/* JADX INFO: renamed from: o.qoy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41343qoy extends ViewModel {
    public final MutableLiveData<OverviewTab> AEQbTJ = new MutableLiveData<>(OverviewTab.NONE);
    public MutableLiveData<java.lang.Boolean> KWHzl = new MutableLiveData<>(java.lang.Boolean.TRUE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<OverviewTab> copydefault() {
        return this.AEQbTJ;
    }
}
