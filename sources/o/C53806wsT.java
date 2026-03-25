package o;

import com.okinc.unify_trade.biz.BotParamTickerData;
import com.okinc.unify_trade.biz.bot.StgyParam;
import com.okinc.unify_trade.bot.data.BotParamColorItemData;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wsT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C53806wsT implements InterfaceC54501xKt<StgyParam, java.util.List<? extends java.lang.Object>> {
    public final java.lang.String AEQbTJ;
    public final java.lang.String copydefault;

    public C53806wsT(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = str;
        this.copydefault = str2;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.List<java.lang.Object> KWHzl(StgyParam stgyParam) {
        java.lang.String safeString$default;
        java.lang.String safeString$default2;
        java.lang.String gridNum;
        java.lang.String minPx;
        C54536xML c54536xMLDjBIcL;
        java.lang.String maxPx;
        C54536xML c54536xMLDjBIcL2;
        xMS xmsCopydefault = new C55887xsS(this.copydefault, this.AEQbTJ).copydefault();
        if (xmsCopydefault == null) {
            safeString$default = null;
        } else {
            if (stgyParam == null || (maxPx = stgyParam.getMaxPx()) == null) {
                maxPx = "";
            }
            C54536xML c54536xMLAYXKKw = xmsCopydefault.AYXKKw(maxPx);
            if (c54536xMLAYXKKw != null && (c54536xMLDjBIcL2 = c54536xMLAYXKKw.djBIcL()) != null) {
                safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL2, false, 1, null);
            }
        }
        if (xmsCopydefault == null) {
            safeString$default2 = null;
        } else {
            if (stgyParam == null || (minPx = stgyParam.getMinPx()) == null) {
                minPx = "";
            }
            C54536xML c54536xMLAYXKKw2 = xmsCopydefault.AYXKKw(minPx);
            if (c54536xMLAYXKKw2 != null && (c54536xMLDjBIcL = c54536xMLAYXKKw2.djBIcL()) != null) {
                safeString$default2 = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null);
            }
        }
        java.lang.String strAEQbTJ = C56033xvF.AEQbTJ(this.copydefault, this.AEQbTJ);
        java.lang.String coinTitle$default = C56033xvF.getCoinTitle$default(this.copydefault, this.AEQbTJ, false, null, null, 28, null);
        android.os.Parcelable[] parcelableArr = new android.os.Parcelable[4];
        parcelableArr[0] = new BotParamColorItemData(C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatTransportControlsApi24), safeString$default2 + " - " + safeString$default + " " + strAEQbTJ, C33070mpX.copydefault(C52761wXj.Activity.DeEinT), 0, 0.0f, 1, null, null, 216, null);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.createCallback);
        xMR xmr = xMR.copydefault;
        if (stgyParam == null || (gridNum = stgyParam.getGridNum()) == null) {
            gridNum = "";
        }
        parcelableArr[1] = new BotParamColorItemData(strAYXKKw, xmr.copydefault(gridNum), C33070mpX.copydefault(C52761wXj.Activity.DeEinT), 0, 0.0f, 1, null, null, 216, null);
        parcelableArr[2] = new BotParamTickerData(coinTitle$default, this.AEQbTJ, this.copydefault, null, false, 0, 0, 104, null);
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.aBDePw);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String direction = stgyParam != null ? stgyParam.getDirection() : null;
        if (direction == null) {
            direction = "";
        }
        sb.append(C56033xvF.AhwBna(direction));
        sb.append(" | ");
        java.lang.String lever = stgyParam != null ? stgyParam.getLever() : null;
        sb.append(C56033xvF.getBotLever$default(lever != null ? lever : "", false, 2, null));
        Unit unit = Unit.INSTANCE;
        parcelableArr[3] = new BotParamColorItemData(strAYXKKw2, sb.toString(), C33070mpX.copydefault(C52761wXj.Activity.QHmsKR), 0, 14.0f, 1, null, null, 200, null);
        return yDY.gEmmrt(parcelableArr);
    }
}
