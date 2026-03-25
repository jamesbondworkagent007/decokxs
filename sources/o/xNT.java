package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.HiddenCurrencyBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xNT extends xNW {
    public final xBH copydefault = new xBH();
    public final C54273xCh KWHzl = new C54273xCh();
    public java.util.HashMap<java.lang.String, HiddenCurrencyBean> OLrzqt = new java.util.HashMap<>();

    @Override // o.xNW
    public boolean AhwBna() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xNW
    public java.lang.String EZpvd() {
        return "HiddenCurrencyProvider";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashMap<java.lang.String, HiddenCurrencyBean> OLrzqt() {
        return this.OLrzqt;
    }

    @Override // o.xNW
    public boolean bE_() {
        return true;
    }

    @Override // o.xNW
    public void gEmmrt() {
        final xKL<java.util.ArrayList<HiddenCurrencyBean>> xklCopydefault = copydefault();
        xklCopydefault.AYXKKw();
        xklCopydefault.KWHzl(new Function1() { // from class: o.xNX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xNT.EZpvd(this.copydefault, xklCopydefault, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xklCopydefault, 0L, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(xNT xnt, xKL xkl, ResponseData responseData) {
        java.lang.String upperCase;
        Intrinsics.checkNotNullParameter(responseData, "");
        java.lang.String strFJNWhG = xnt.fJNWhG();
        java.lang.String strEZpvd = xnt.EZpvd();
        boolean z = responseData.getCode() == 0 && responseData.getData() != null;
        java.lang.String msg = (responseData.getCode() != 0 || responseData.getData() == null) ? responseData.getMsg() : "";
        pUU.KWHzl(strFJNWhG, "task " + strEZpvd + " loadHttp requestCoinStatus:" + z + ";" + msg + "; costTime: " + (java.lang.System.currentTimeMillis() - xnt.AuCTel()));
        if (responseData.getCode() != 0 || responseData.getData() == null) {
            pUU.KWHzl(xnt.fJNWhG(), xnt.EZpvd() + " failed, isDowngrade = " + xnt.bE_() + ", 降级处理");
            xnt.AEQbTJ(false, xnt.AEQbTJ(xkl.AhwBna().getValue()));
        } else {
            java.util.ArrayList<HiddenCurrencyBean> arrayList = (java.util.ArrayList) responseData.getData();
            if (arrayList != null) {
                for (HiddenCurrencyBean hiddenCurrencyBean : arrayList) {
                    java.util.HashMap<java.lang.String, HiddenCurrencyBean> map = xnt.OLrzqt;
                    java.lang.String symbol = hiddenCurrencyBean.getSymbol();
                    if (symbol != null) {
                        upperCase = symbol.toUpperCase(java.util.Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "");
                        if (upperCase == null) {
                            upperCase = "";
                        }
                    }
                    map.put(upperCase, hiddenCurrencyBean);
                }
            }
            xNW.notifyResult$default(xnt, true, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.xNW
    public java.util.List<xKK> djBIcL() {
        return yDY.copydefault(this.copydefault, this.KWHzl);
    }

    public final boolean OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.OLrzqt.get(str) == null;
    }

    public final boolean EZpvd(@NotNull java.lang.String str) {
        HiddenCurrencyBean hiddenCurrencyBean;
        Intrinsics.checkNotNullParameter(str, "");
        return this.OLrzqt.get(str) == null || (hiddenCurrencyBean = this.OLrzqt.get(str)) == null || !Intrinsics.EZpvd(hiddenCurrencyBean.getSearchLimit(), java.lang.Boolean.TRUE);
    }

    private final xKL<java.util.ArrayList<HiddenCurrencyBean>> copydefault() {
        return hDKMBd() ? this.KWHzl : this.copydefault;
    }
}
