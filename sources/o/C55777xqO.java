package o;

import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.GridOrderTpSlReq;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import kotlin.jvm.internal.Intrinsics;
import o.xKK;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xqO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55777xqO {
    public boolean OLrzqt;
    public GridOrderTpSlReq gEmmrt;
    public final TradeLiveData<xMJ.Application> AhwBna = new TradeLiveData<>();
    public final C54308xDp djBIcL = new C54308xDp();
    public final TradeLiveData<kotlin.Pair<java.lang.String, java.lang.Integer>> AYXKKw = new TradeLiveData<>();
    public final C54301xDi valueOf = new C54301xDi(false, 1, null);
    public final TradeLiveData<C55853xrl> KWHzl = new TradeLiveData<>();
    public final C56235xyw EZpvd = new C56235xyw();
    public final C56156xxW copydefault = new C56156xxW();
    public final TradeLiveData<java.util.List<C56157xxX>> AEQbTJ = new TradeLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54308xDp AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56156xxW AhwBna() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridOrderTpSlReq AkhnZx() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54301xDi DbNXlk() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<C55853xrl> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(GridOrderTpSlReq gridOrderTpSlReq) {
        this.gEmmrt = gridOrderTpSlReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56235xyw copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<xMJ.Application> fetchVPNInfo() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<kotlin.Pair<java.lang.String, java.lang.Integer>> gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<java.util.List<C56157xxX>> valueOf() {
        return this.AEQbTJ;
    }

    public final void OLrzqt() {
        GridOrderTpSlReq gridOrderTpSlReq = this.gEmmrt;
        if (gridOrderTpSlReq != null) {
            gridOrderTpSlReq.setTpTriggerPx("");
        }
        GridOrderTpSlReq gridOrderTpSlReq2 = this.gEmmrt;
        if (gridOrderTpSlReq2 != null) {
            gridOrderTpSlReq2.setTpRatio("");
        }
    }

    public final void AEQbTJ() {
        GridOrderTpSlReq gridOrderTpSlReq = this.gEmmrt;
        if (gridOrderTpSlReq != null) {
            gridOrderTpSlReq.setSlTriggerPx("");
        }
        GridOrderTpSlReq gridOrderTpSlReq2 = this.gEmmrt;
        if (gridOrderTpSlReq2 != null) {
            gridOrderTpSlReq2.setSlRatio("");
        }
    }

    public final void values() {
        java.lang.String instId;
        C54308xDp c54308xDp = this.djBIcL;
        c54308xDp.OLrzqt(this.AhwBna, new C55773xqK());
        GridOrderTpSlReq gridOrderTpSlReq = this.gEmmrt;
        if (gridOrderTpSlReq == null || (instId = gridOrderTpSlReq.getInstId()) == null) {
            instId = "";
        }
        c54308xDp.KWHzl(instId);
        xKK.Activity.execute$default(c54308xDp, 0L, 1, null);
    }

    public final void isConnected() {
        java.lang.String algoId;
        C54301xDi c54301xDi = this.valueOf;
        c54301xDi.OLrzqt(this.AYXKKw, new C55766xqD());
        GridOrderTpSlReq gridOrderTpSlReq = this.gEmmrt;
        if (gridOrderTpSlReq == null || (algoId = gridOrderTpSlReq.getAlgoId()) == null) {
            algoId = "";
        }
        c54301xDi.AEQbTJ(algoId);
        xKK.Activity.execute$default(c54301xDi, 0L, 1, null);
    }

    public final void EZpvd(@NotNull TradeLiveData<C55804xqp<StrategyDetailsResponse>> tradeLiveData) {
        java.lang.String algoId;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(tradeLiveData, "");
        C54301xDi c54301xDi = this.valueOf;
        c54301xDi.AEQbTJ(tradeLiveData);
        GridOrderTpSlReq gridOrderTpSlReq = this.gEmmrt;
        if (gridOrderTpSlReq != null && (algoId = gridOrderTpSlReq.getAlgoId()) != null) {
            str = algoId;
        }
        c54301xDi.AEQbTJ(str);
        xKK.Activity.execute$default(c54301xDi, 0L, 1, null);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C56235xyw c56235xyw = this.EZpvd;
        c56235xyw.KWHzl(str);
        c56235xyw.AEQbTJ(str2);
        c56235xyw.djBIcL();
        c56235xyw.OLrzqt(this.KWHzl, new C55767xqE());
        xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
    }

    public final void EZpvd() {
        if (this.gEmmrt == null) {
            return;
        }
        C56156xxW c56156xxW = this.copydefault;
        c56156xxW.AEQbTJ(this.AEQbTJ);
        GridOrderTpSlReq gridOrderTpSlReq = this.gEmmrt;
        Intrinsics.copydefault(gridOrderTpSlReq);
        c56156xxW.OLrzqt(gridOrderTpSlReq);
        xKK.Activity.execute$default(c56156xxW, 0L, 1, null);
    }
}
