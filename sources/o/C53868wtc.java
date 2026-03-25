package o;

import com.okinc.unify_trade.biz.BotAggregatedInfoBean;
import com.okinc.unify_trade.biz.BotParamTickerData;
import com.okinc.unify_trade.biz.bot.StgyParam;
import com.okinc.unify_trade.bot.data.BotParamColorItemData;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wtc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C53868wtc implements InterfaceC54501xKt<BotAggregatedInfoBean, java.util.List<? extends java.lang.Object>> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    @Override // o.InterfaceC54501xKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.List<java.lang.Object> KWHzl(@NotNull BotAggregatedInfoBean botAggregatedInfoBean) {
        java.lang.String safeString$default;
        java.lang.String safeString$default2;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLDjBIcL2;
        Intrinsics.checkNotNullParameter(botAggregatedInfoBean, "");
        C56059xvf c56059xvf = C56059xvf.EZpvd;
        java.lang.String strDjBIcL = c56059xvf.djBIcL();
        if (strDjBIcL == null) {
            strDjBIcL = "";
        }
        java.lang.String strAYXKKw = c56059xvf.AYXKKw();
        java.lang.String str = strAYXKKw == null ? "" : strAYXKKw;
        xMS xmsOLrzqt = c56059xvf.OLrzqt();
        if (xmsOLrzqt == null) {
            safeString$default = null;
        } else {
            StgyParam botParam = botAggregatedInfoBean.getBotParam();
            java.lang.String maxPx = botParam != null ? botParam.getMaxPx() : null;
            if (maxPx == null) {
                maxPx = "";
            }
            C54536xML c54536xMLAYXKKw = xmsOLrzqt.AYXKKw(maxPx);
            if (c54536xMLAYXKKw != null && (c54536xMLDjBIcL2 = c54536xMLAYXKKw.djBIcL()) != null) {
                safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL2, false, 1, null);
            }
        }
        if (xmsOLrzqt == null) {
            safeString$default2 = null;
        } else {
            StgyParam botParam2 = botAggregatedInfoBean.getBotParam();
            java.lang.String minPx = botParam2 != null ? botParam2.getMinPx() : null;
            if (minPx == null) {
                minPx = "";
            }
            C54536xML c54536xMLAYXKKw2 = xmsOLrzqt.AYXKKw(minPx);
            if (c54536xMLAYXKKw2 != null && (c54536xMLDjBIcL = c54536xMLAYXKKw2.djBIcL()) != null) {
                safeString$default2 = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null);
            }
        }
        java.lang.String strAEQbTJ = C56033xvF.AEQbTJ(str, strDjBIcL);
        java.lang.String coinTitle$default = C56033xvF.getCoinTitle$default(str, strDjBIcL, false, null, null, 28, null);
        android.os.Parcelable[] parcelableArr = new android.os.Parcelable[3];
        parcelableArr[0] = new BotParamColorItemData(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompat), safeString$default2 + " - " + safeString$default + " " + strAEQbTJ, C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), 0, 0.0f, 1, null, null, 216, null);
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.createCallback);
        xMR xmr = xMR.copydefault;
        StgyParam botParam3 = botAggregatedInfoBean.getBotParam();
        java.lang.String gridNum = botParam3 != null ? botParam3.getGridNum() : null;
        parcelableArr[1] = new BotParamColorItemData(strAYXKKw2, xmr.copydefault(gridNum != null ? gridNum : ""), C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), 0, 0.0f, 1, null, null, 216, null);
        parcelableArr[2] = new BotParamTickerData(coinTitle$default, strDjBIcL, str, null, false, 0, 0, 104, null);
        return yDY.gEmmrt(parcelableArr);
    }
}
