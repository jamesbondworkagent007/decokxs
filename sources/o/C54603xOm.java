package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.TradeBehaviorBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.xKK;

/* JADX INFO: renamed from: o.xOm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54603xOm extends xNW {
    public final C54272xCg AEQbTJ = new C54272xCg();
    public final C54266xCa OLrzqt = new C54266xCa();
    public java.lang.Boolean copydefault;

    @Override // o.xNW
    public boolean AhwBna() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xNW
    public java.lang.String EZpvd() {
        return "TradeBehaviorProvider";
    }

    @Override // o.xNW
    public boolean bE_() {
        return true;
    }

    public final java.lang.Boolean OLrzqt() {
        java.lang.Boolean bool = this.copydefault;
        return java.lang.Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }

    @Override // o.xNW
    public void gEmmrt() {
        final xKL<TradeBehaviorBean> xklAEQbTJ = AEQbTJ();
        xklAEQbTJ.AYXKKw();
        xklAEQbTJ.KWHzl(new Function1() { // from class: o.xOo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54603xOm.OLrzqt(this.AEQbTJ, xklAEQbTJ, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xklAEQbTJ, 0L, 1, null);
    }

    public static final Unit OLrzqt(C54603xOm c54603xOm, xKL xkl, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        java.lang.String strFJNWhG = c54603xOm.fJNWhG();
        java.lang.String strEZpvd = c54603xOm.EZpvd();
        boolean z = responseData.getCode() == 0 && responseData.getData() != null;
        pUU.KWHzl(strFJNWhG, strEZpvd + "  loadHttp 网络resp= " + z + " costTime: " + (java.lang.System.currentTimeMillis() - c54603xOm.AuCTel()));
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c54603xOm.KWHzl((TradeBehaviorBean) data);
            xNW.notifyResult$default(c54603xOm, true, null, 2, null);
        } else {
            c54603xOm.AEQbTJ(false, c54603xOm.AEQbTJ(xkl.AhwBna().getValue()));
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(TradeBehaviorBean tradeBehaviorBean) {
        if (OLrzqt() == null) {
            this.copydefault = java.lang.Boolean.valueOf(tradeBehaviorBean.getResult());
        } else {
            if (Intrinsics.EZpvd(OLrzqt(), java.lang.Boolean.valueOf(tradeBehaviorBean.getResult()))) {
                return;
            }
            this.copydefault = java.lang.Boolean.valueOf(tradeBehaviorBean.getResult());
        }
    }

    @Override // o.xNW
    public java.util.List<xKK> djBIcL() {
        return yDY.copydefault(this.AEQbTJ, this.OLrzqt);
    }

    private final xKL<TradeBehaviorBean> AEQbTJ() {
        return hDKMBd() ? this.OLrzqt : this.AEQbTJ;
    }
}
