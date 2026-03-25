package o;

import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.unify_trade.biz.DcdOrderReq;
import com.okinc.unify_trade.bot.data.BotRemindData;
import com.okinc.unify_trade.bot.data.LabelData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TacticsInsideLineItemData;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xrn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55855xrn implements InterfaceC54501xKt<DcdOrderReq, java.util.List<? extends java.lang.Object>> {
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;

    public C55855xrn(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.copydefault = str;
        this.KWHzl = str2;
        this.EZpvd = str3;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x026b  */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.List<java.lang.Object> KWHzl(DcdOrderReq dcdOrderReq) {
        java.lang.String str;
        java.lang.String strikePercentage;
        java.lang.String strCopydefault;
        java.lang.String strAYXKKw;
        java.lang.String stopPrice;
        java.lang.String apr;
        java.lang.String apr2;
        java.lang.String currentStrike;
        java.lang.String stopPercentage;
        java.lang.String strike;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new LabelData(C33070mpX.AYXKKw(C55688xof.Application.invokespecialROgMPW), 0.0f, 0.0f, 0, 0, 16, 24, (DefaultConstructorMarker) null));
        java.lang.String str2 = "";
        if (C33129mqd.AEQbTJ(dcdOrderReq != null ? dcdOrderReq.getStrike() : null, 0)) {
            strCopydefault = C56033xvF.getBotPrice$default(this.KWHzl, this.copydefault, (dcdOrderReq == null || (strike = dcdOrderReq.getStrike()) == null) ? "" : strike, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
        } else {
            if (C33129mqd.AEQbTJ(dcdOrderReq != null ? dcdOrderReq.getStrikePercentage() : null, 0)) {
                int i = C55688xof.Application.ggKfIT;
                xMR xmr = xMR.copydefault;
                if (dcdOrderReq == null || (strikePercentage = dcdOrderReq.getStrikePercentage()) == null) {
                    strikePercentage = "";
                }
                strCopydefault = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", xMR.formatPercent$default(xmr, strikePercentage, 0, null, 6, null))));
            } else {
                str = "";
                arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DQzvGNdrmXxudrmXxu), str, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                if (C33129mqd.AEQbTJ(dcdOrderReq == null ? dcdOrderReq.getStopPercentage() : null, 0)) {
                    if (C33129mqd.AEQbTJ(dcdOrderReq != null ? dcdOrderReq.getStopPrice() : null, 0)) {
                        strAYXKKw = C56033xvF.getBotPrice$default(this.KWHzl, this.copydefault, (dcdOrderReq == null || (stopPrice = dcdOrderReq.getStopPrice()) == null) ? "" : stopPrice, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
                    } else {
                        strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.invokespecialRuDPQV);
                    }
                } else {
                    strAYXKKw = C33069mpW.copydefault(C55688xof.Application.invokespecialaVhqwO, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", xMR.formatPercent$default(xMR.copydefault, (dcdOrderReq == null || (stopPercentage = dcdOrderReq.getStopPercentage()) == null) ? "" : stopPercentage, 0, null, 6, null))));
                }
                arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.invokespecialDPHOMC), strAYXKKw, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.iqMDAV), C33070mpX.AYXKKw(C55688xof.Application.RqmePg), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                arrayList.add(new TacticsInsideLineItemData(C55298xhM.dp2px$default(8.0f, null, 1, null), C55298xhM.dp2px$default(8.0f, null, 1, null), 0, 4, null));
                arrayList.add(new LabelData(C33070mpX.AYXKKw(C55688xof.Application.invokespecialODCBUN), 0.0f, 0.0f, 0, 0, 16, 24, (DefaultConstructorMarker) null));
                arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DQzvGNdrmXxudrmXxu), C56033xvF.getBotPrice$default(this.KWHzl, this.copydefault, (dcdOrderReq != null || (currentStrike = dcdOrderReq.getCurrentStrike()) == null) ? "" : currentStrike, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.invokespecialDaTmkG), C55861xrt.OLrzqt.EZpvd(dcdOrderReq == null ? dcdOrderReq.getTerm() : null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.zLAIeZ), pTA.format$default(new Date(C33129mqd.valueOf(dcdOrderReq != null ? dcdOrderReq.getExpiryTime() : null)), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.Swccd);
                java.lang.String percentWithSymbol$default = xMR.formatPercentWithSymbol$default(xMR.copydefault, (dcdOrderReq != null || (apr2 = dcdOrderReq.getApr()) == null) ? "" : apr2, 0, 0, null, 14, null);
                if (dcdOrderReq != null && (apr = dcdOrderReq.getApr()) != null) {
                    str2 = apr;
                }
                arrayList.add(new TacticsInsideItemData(strAYXKKw2, percentWithSymbol$default, null, 0, 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C56033xvF.OLrzqt((java.lang.Object) str2)), null, null, null, null, null, null, 130044, null));
                arrayList.add(new BotRemindData(null, 0, 0, C33069mpW.copydefault(C55688xof.Application.UccSpe, C56423yEv.EZpvd(C56390yDp.OLrzqt("dateTime", pTA.format$default(new Date(C33129mqd.valueOf(this.EZpvd)), OKDateEnum.DATE_FORMAT_SIMPLE_MD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null)))), 7, null));
                return arrayList;
            }
        }
        str = strCopydefault;
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DQzvGNdrmXxudrmXxu), str, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        if (C33129mqd.AEQbTJ(dcdOrderReq == null ? dcdOrderReq.getStopPercentage() : null, 0)) {
        }
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.invokespecialDPHOMC), strAYXKKw, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.iqMDAV), C33070mpX.AYXKKw(C55688xof.Application.RqmePg), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        arrayList.add(new TacticsInsideLineItemData(C55298xhM.dp2px$default(8.0f, null, 1, null), C55298xhM.dp2px$default(8.0f, null, 1, null), 0, 4, null));
        arrayList.add(new LabelData(C33070mpX.AYXKKw(C55688xof.Application.invokespecialODCBUN), 0.0f, 0.0f, 0, 0, 16, 24, (DefaultConstructorMarker) null));
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DQzvGNdrmXxudrmXxu), C56033xvF.getBotPrice$default(this.KWHzl, this.copydefault, (dcdOrderReq != null || (currentStrike = dcdOrderReq.getCurrentStrike()) == null) ? "" : currentStrike, true, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.invokespecialDaTmkG), C55861xrt.OLrzqt.EZpvd(dcdOrderReq == null ? dcdOrderReq.getTerm() : null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.zLAIeZ), pTA.format$default(new Date(C33129mqd.valueOf(dcdOrderReq != null ? dcdOrderReq.getExpiryTime() : null)), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        java.lang.String strAYXKKw22 = C33070mpX.AYXKKw(C55688xof.Application.Swccd);
        java.lang.String percentWithSymbol$default2 = xMR.formatPercentWithSymbol$default(xMR.copydefault, (dcdOrderReq != null || (apr2 = dcdOrderReq.getApr()) == null) ? "" : apr2, 0, 0, null, 14, null);
        if (dcdOrderReq != null) {
            str2 = apr;
        }
        arrayList.add(new TacticsInsideItemData(strAYXKKw22, percentWithSymbol$default2, null, 0, 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C56033xvF.OLrzqt((java.lang.Object) str2)), null, null, null, null, null, null, 130044, null));
        arrayList.add(new BotRemindData(null, 0, 0, C33069mpW.copydefault(C55688xof.Application.UccSpe, C56423yEv.EZpvd(C56390yDp.OLrzqt("dateTime", pTA.format$default(new Date(C33129mqd.valueOf(this.EZpvd)), OKDateEnum.DATE_FORMAT_SIMPLE_MD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null)))), 7, null));
        return arrayList;
    }
}
