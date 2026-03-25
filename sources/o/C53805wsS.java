package o;

import com.okinc.unify_trade.biz.BotParamTickerData;
import com.okinc.unify_trade.biz.bot.StgyParam;
import com.okinc.unify_trade.bot.data.BotParamColorItemData;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C55688xof;

/* JADX INFO: renamed from: o.wsS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C53805wsS implements InterfaceC54501xKt<StgyParam, java.util.List<? extends java.lang.Object>> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.util.List<java.lang.Object> KWHzl(StgyParam stgyParam) {
        java.lang.String maxSafetyOrds;
        java.lang.String pxSteps;
        C56059xvf c56059xvf = C56059xvf.EZpvd;
        java.lang.String strDjBIcL = c56059xvf.djBIcL();
        java.lang.String str = "";
        if (strDjBIcL == null) {
            strDjBIcL = "";
        }
        java.lang.String strAYXKKw = c56059xvf.AYXKKw();
        if (strAYXKKw == null) {
            strAYXKKw = "";
        }
        java.lang.String coinTitle$default = C56033xvF.getCoinTitle$default(strAYXKKw, strDjBIcL, false, null, null, 28, null);
        android.os.Parcelable[] parcelableArr = new android.os.Parcelable[3];
        java.lang.String strAYXKKw2 = Intrinsics.EZpvd((java.lang.Object) (stgyParam != null ? stgyParam.getDirection() : null), (java.lang.Object) "short") ? C33070mpX.AYXKKw(C55688xof.Application.hfdhUn) : C33070mpX.AYXKKw(C55688xof.Application.gqOnQv);
        xMR xmr = xMR.copydefault;
        parcelableArr[0] = new BotParamColorItemData(strAYXKKw2, xMR.formatPercent$default(xmr, (stgyParam == null || (pxSteps = stgyParam.getPxSteps()) == null) ? "" : pxSteps, 0, null, 6, null), C33070mpX.copydefault(C52761wXj.Activity.DeEinT), 0, 0.0f, 1, C33070mpX.AYXKKw(C55688xof.Application.gqOnQv), C33070mpX.AYXKKw(C55688xof.Application.v), 24, null);
        java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.OijiEz);
        if (stgyParam != null && (maxSafetyOrds = stgyParam.getMaxSafetyOrds()) != null) {
            str = maxSafetyOrds;
        }
        parcelableArr[1] = new BotParamColorItemData(strAYXKKw3, xmr.copydefault(str), C33070mpX.copydefault(C52761wXj.Activity.DeEinT), 0, 0.0f, 1, null, null, 216, null);
        parcelableArr[2] = new BotParamTickerData(coinTitle$default, strDjBIcL, strAYXKKw, null, false, 0, 0, 104, null);
        return yDY.gEmmrt(parcelableArr);
    }
}
