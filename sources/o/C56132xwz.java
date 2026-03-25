package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.tradeapi.bean.ParamBuilder;
import com.okinc.tradeapi.bean.SwitchCoinBean;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.OrderPositionData;
import com.okinc.unify_trade.constants.MarketTypeEnum;
import kotlin.Triple;
import kotlin.Unit;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: renamed from: o.xwz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56132xwz extends ViewModel {
    public final C56111xwe<java.lang.String> AEQbTJ;
    public final C56126xwt<Unit> AkhnZx;
    public final C56126xwt<java.lang.String> OLrzqt;
    public final C56111xwe<java.lang.String> QKVWgx;
    public final MutableSharedFlow<InterfaceC55735xpZ> copydefault;
    public final C56111xwe<android.os.Bundle> fetchVPNInfo;
    public final SharedFlow<InterfaceC55735xpZ> getFieldNames;
    public final C56111xwe<java.lang.Boolean> valueOf;
    public final C56111xwe<ParamBuilder> hDKMBd = new C56111xwe<>();
    public final C56126xwt<ParamBuilder> DTwDnp = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56126xwt<BizInstrument> values = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56126xwt<java.lang.Boolean> AhwBna = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56126xwt<java.lang.Boolean> ORxRYg = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56126xwt<Unit> AwvSrB = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56126xwt<Unit> zuBGHE = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56126xwt<java.lang.String> gEmmrt = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56126xwt<java.lang.String> AYXKKw = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56126xwt<kotlin.Pair<java.lang.String, java.lang.String>> QOLQEE = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56126xwt<java.lang.String> fJNWhG = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56111xwe<java.lang.Integer> OcIXYQ = new C56111xwe<>();
    public final C56126xwt<ParamBuilder> getNewProxyInstance = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56126xwt<SwitchCoinBean> gHZMYf = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56126xwt<MarketTypeEnum> DbNXlk = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56126xwt<Unit> uzCIH = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56126xwt<Unit> iwGUEr = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56126xwt<java.lang.Boolean> AuCTel = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56126xwt<java.lang.Long> KWHzl = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56126xwt<java.lang.String> AxsJAY = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56126xwt<Unit> AubY = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56126xwt<java.lang.String> ejfBZ = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56126xwt<Triple<java.lang.Integer, java.util.HashMap<java.lang.Integer, android.view.View>, java.lang.String>> djBIcL = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56126xwt<java.lang.String> zLjUOn = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56126xwt<java.lang.String> fIwbmz = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56126xwt<java.lang.String> wlaJM = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56126xwt<java.lang.String> sSMYrx = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56126xwt<kotlin.Pair<java.lang.String, android.view.View>> EZpvd = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56126xwt<Unit> zsXlph = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56126xwt<OrderPositionData> fARcdN = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56126xwt<java.lang.String> AuCTelauCTel = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
    public final C56126xwt<java.lang.Boolean> isConnected = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56126xwt<kotlin.Pair<java.lang.String, android.view.View>> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56126xwt<java.lang.String> AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56126xwt<java.lang.Boolean> AhwBna() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56126xwt<ParamBuilder> AkhnZx() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56126xwt<kotlin.Pair<java.lang.String, java.lang.String>> AuCTel() {
        return this.QOLQEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56126xwt<java.lang.String> DbNXlk() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<java.lang.Boolean> EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56126xwt<java.lang.String> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56126xwt<java.lang.Boolean> OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56126xwt<Triple<java.lang.Integer, java.util.HashMap<java.lang.Integer, android.view.View>, java.lang.String>> copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56126xwt<BizInstrument> djBIcL() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56126xwt<Unit> ejfBZ() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56126xwt<Unit> fARcdN() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56126xwt<Unit> fIwbmz() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56126xwt<Unit> fJNWhG() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56126xwt<java.lang.String> fetchVPNInfo() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56126xwt<Unit> gEmmrt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<java.lang.Integer> getFieldNames() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<java.lang.String> getNewProxyInstance() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56126xwt<java.lang.String> isConnected() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56126xwt<java.lang.Boolean> iwGUEr() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<android.os.Bundle> valueOf() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<ParamBuilder> values() {
        return this.hDKMBd;
    }

    public C56132xwz() {
        MutableSharedFlow<InterfaceC55735xpZ> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.getFieldNames = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.OLrzqt = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
        this.QKVWgx = new C56111xwe<>();
        this.fetchVPNInfo = new C56111xwe<>();
        this.AkhnZx = new C56126xwt<>(ViewModelKt.getViewModelScope(this), null, null, false, 0, null, 62, null);
        this.valueOf = new C56111xwe<>();
        this.AEQbTJ = new C56111xwe<>();
    }
}
