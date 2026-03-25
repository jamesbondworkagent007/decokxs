package o;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.ui.view.model.MarketTopInfo;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pCT extends AndroidViewModel {
    public int AEQbTJ;
    public boolean AYXKKw;
    public final MutableLiveData<Unit> AhwBna;
    public final MutableLiveData<java.lang.Boolean> AkhnZx;
    public java.lang.String DbNXlk;
    public final MutableLiveData<java.lang.Integer> EZpvd;
    public int KWHzl;
    public boolean OLrzqt;
    public final MutableLiveData<java.lang.Boolean> copydefault;
    public ChartViewOutSideConfig djBIcL;
    public MarketTopInfo fetchVPNInfo;
    public java.util.List<? extends TradeAllOrderApi> gEmmrt;
    public java.util.List<? extends TradePositionManager.PositionItem> isConnected;
    public MutableLiveData<java.lang.Boolean> valueOf;
    public final MutableLiveData<Unit> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.KWHzl = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull MarketTopInfo marketTopInfo) {
        Intrinsics.checkNotNullParameter(marketTopInfo, "");
        this.fetchVPNInfo = marketTopInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi>, java.util.List<com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi> */
    public final java.util.List<TradeAllOrderApi> AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Unit> AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketTopInfo AkhnZx() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.trade.manager.common.position.TradePositionManager$PositionItem>, java.util.List<com.okinc.trade.manager.common.position.TradePositionManager$PositionItem> */
    public final java.util.List<TradePositionManager.PositionItem> DbNXlk() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(int i) {
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(ChartViewOutSideConfig chartViewOutSideConfig) {
        this.djBIcL = chartViewOutSideConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.DbNXlk = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.util.List<? extends TradeAllOrderApi> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.gEmmrt = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Integer> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.util.List<? extends TradePositionManager.PositionItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.isConnected = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Unit> djBIcL() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> fetchVPNInfo() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> isConnected() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChartViewOutSideConfig valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> values() {
        return this.valueOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pCT(@NotNull android.app.Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "");
        this.fetchVPNInfo = new MarketTopInfo(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554431, null);
        this.DbNXlk = "TYPE_KLINE";
        this.AkhnZx = new MutableLiveData<>();
        this.isConnected = yDY.AhwBna();
        this.gEmmrt = yDY.AhwBna();
        this.AhwBna = new MutableLiveData<>();
        this.EZpvd = new MutableLiveData<>();
        this.values = new MutableLiveData<>();
        this.valueOf = new MutableLiveData<>();
        this.copydefault = new MutableLiveData<>();
    }

    public final void fIwbmz() {
        this.AkhnZx.setValue(java.lang.Boolean.TRUE);
    }
}
