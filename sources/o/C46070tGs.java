package o;

import com.okinc.localization.util.format.DisplaySign;
import com.okinc.planet.biz_positions.data.ClosePositionType;
import com.okinc.planet.biz_positions.data.HistoryPosType;
import com.okinc.planet.biz_positions.data.ProfilePositionHistoryDto;
import com.okinc.planet.biz_positions.data.YieldDetails;
import com.okinc.planet.biz_userprofile.data.PlanetTradeTypes;
import com.okinc.planet.serializer.PlanetNumericString;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C55688xof;
import o.InterfaceC46066tGo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tGs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46070tGs implements InterfaceC46066tGo {
    @Override // o.InterfaceC46066tGo
    public InterfaceC46066tGo.Application KWHzl(@NotNull InterfaceC46073tGv interfaceC46073tGv, boolean z) {
        return InterfaceC46066tGo.StateListAnimator.copydefault(this, interfaceC46073tGv, z);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.tRS.formatPosition-Knr709k$default(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.planet.format.TargetUnit, java.lang.String, int, java.lang.Object):kotlin.Pair */
    public C46068tGq AEQbTJ(@NotNull InterfaceC46073tGv interfaceC46073tGv) {
        java.lang.String str;
        kotlin.Pair pairOLrzqt;
        java.lang.String str2;
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(interfaceC46073tGv, "");
        ProfilePositionHistoryDto profilePositionHistoryDto = (ProfilePositionHistoryDto) interfaceC46073tGv;
        InterfaceC46066tGo.Application applicationKWHzl = KWHzl(profilePositionHistoryDto, true);
        kotlin.Pair pairOLrzqt2 = tRS.OLrzqt(profilePositionHistoryDto.m7037getOpenMaxAmount8XBoXJE(), profilePositionHistoryDto.getInstType(), profilePositionHistoryDto.mo7032getInstIdy_k7uyA(), profilePositionHistoryDto.mo7036getOpenAvgPx8XBoXJE(), (48 & 8) != 0 ? PlanetNumericString.Companion.EZpvd() : profilePositionHistoryDto.mo7029getContractVal8XBoXJE(), (48 & 16) != 0 ? false : false, (48 & 32) != 0 ? null : null, (48 & 64) != 0 ? null : profilePositionHistoryDto.mo7035getMarginCcyFeEHGxI());
        kotlin.Pair pairOLrzqt3 = tRS.OLrzqt(profilePositionHistoryDto.m7024getCloseAmount8XBoXJE(), profilePositionHistoryDto.getInstType(), profilePositionHistoryDto.mo7032getInstIdy_k7uyA(), profilePositionHistoryDto.mo7025getCloseAvgPx8XBoXJE(), (48 & 8) != 0 ? PlanetNumericString.Companion.EZpvd() : profilePositionHistoryDto.mo7029getContractVal8XBoXJE(), (48 & 16) != 0 ? false : false, (48 & 32) != 0 ? null : null, (48 & 64) != 0 ? null : profilePositionHistoryDto.mo7035getMarginCcyFeEHGxI());
        java.lang.String id = profilePositionHistoryDto.getId();
        java.lang.String strMo7032getInstIdy_k7uyA = profilePositionHistoryDto.mo7032getInstIdy_k7uyA();
        PlanetTradeTypes planetTradeTypesDbNXlk = applicationKWHzl.DbNXlk();
        java.lang.String strAEQbTJ = applicationKWHzl.AEQbTJ();
        java.lang.String strOLrzqt = tIX.KWHzl.OLrzqt(profilePositionHistoryDto.m7033getLever8XBoXJE());
        tRU truDjBIcL = applicationKWHzl.djBIcL();
        java.lang.String strCopydefault = tTN.Companion.copydefault(profilePositionHistoryDto.getMgnMode());
        java.lang.String strOLrzqt2 = applicationKWHzl.OLrzqt();
        java.lang.String strCopydefault2 = applicationKWHzl.copydefault();
        if (!C46064tGm.AEQbTJ(profilePositionHistoryDto.getClosePositionType())) {
            strCopydefault2 = null;
        }
        if (strCopydefault2 == null) {
            strCopydefault2 = "--";
        }
        java.lang.String str3 = strCopydefault2;
        kotlin.Pair pairOLrzqt4 = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C47501trL.Fragment.QKVWgx), applicationKWHzl.KWHzl());
        kotlin.Pair pairOLrzqt5 = C56390yDp.OLrzqt(C33069mpW.copydefault(C47501trL.Fragment.UeEOUB, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", applicationKWHzl.AYXKKw()))), applicationKWHzl.valueOf().getFirst());
        int iIntValue = applicationKWHzl.valueOf().getSecond().intValue();
        kotlin.Pair pairOLrzqt6 = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.UUsvzU) + " (" + pairOLrzqt2.getSecond() + ")", pairOLrzqt2.getFirst());
        if (C33129mqd.OLrzqt(profilePositionHistoryDto.getLiquidationStatus(), "1")) {
            str = "";
            pairOLrzqt = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C47501trL.Fragment.fkESqH), applicationKWHzl.EZpvd());
        } else {
            str = "";
            pairOLrzqt = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C47501trL.Fragment.giSNqX), applicationKWHzl.EZpvd());
        }
        kotlin.Pair pair = pairOLrzqt;
        kotlin.Pair pairOLrzqt7 = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C47501trL.Fragment.fZBcTu), pTB.formatICUPercent$default(java.lang.Float.valueOf(profilePositionHistoryDto.getPnlRatio()), RoundingMode.DOWN, C38307pTy.Companion.EZpvd(2), DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 16, null));
        int percentColor$default = C46368tRt.getPercentColor$default(C33129mqd.djBIcL(java.lang.Float.valueOf(profilePositionHistoryDto.getPnlRatio())), 0, 1, null);
        kotlin.Pair pairOLrzqt8 = C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.sanitizeSessionIdIgnoreCase) + " (" + pairOLrzqt3.getSecond() + ")", pairOLrzqt3.getFirst());
        float pnlRatio = profilePositionHistoryDto.getPnlRatio();
        java.lang.String strGEmmrt = applicationKWHzl.gEmmrt();
        ClosePositionType closePositionType = profilePositionHistoryDto.getClosePositionType();
        HistoryPosType posType = profilePositionHistoryDto.getPosType();
        YieldDetails yieldDetailsMapPnlYieldData = profilePositionHistoryDto.mapPnlYieldData();
        java.lang.String strAhwBna = applicationKWHzl.AhwBna();
        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(java.lang.Long.valueOf(profilePositionHistoryDto.getUTime()));
        boolean zOLrzqt = C33129mqd.OLrzqt(profilePositionHistoryDto.getLiquidationStatus(), "1");
        java.lang.String mgnMode = profilePositionHistoryDto.getMgnMode();
        if (Intrinsics.EZpvd((java.lang.Object) mgnMode, (java.lang.Object) "cross")) {
            strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.RAQtXZ);
        } else {
            if (!Intrinsics.EZpvd((java.lang.Object) mgnMode, (java.lang.Object) "isolated")) {
                str2 = str;
                return new C46068tGq(id, false, strMo7032getInstIdy_k7uyA, planetTradeTypesDbNXlk, strAEQbTJ, strOLrzqt, strCopydefault, truDjBIcL, false, null, null, null, null, strOLrzqt2, str3, pairOLrzqt4, pairOLrzqt5, pairOLrzqt6, pair, pairOLrzqt7, pairOLrzqt8, iIntValue, percentColor$default, strGEmmrt, pnlRatio, strAhwBna, closePositionType, posType, yieldDetailsMapPnlYieldData, zOLrzqt, str2, strGEmmrt2, 7936, null);
            }
            strAYXKKw = C33070mpX.AYXKKw(C47501trL.Fragment.Swccd);
        }
        str2 = strAYXKKw;
        return new C46068tGq(id, false, strMo7032getInstIdy_k7uyA, planetTradeTypesDbNXlk, strAEQbTJ, strOLrzqt, strCopydefault, truDjBIcL, false, null, null, null, null, strOLrzqt2, str3, pairOLrzqt4, pairOLrzqt5, pairOLrzqt6, pair, pairOLrzqt7, pairOLrzqt8, iIntValue, percentColor$default, strGEmmrt, pnlRatio, strAhwBna, closePositionType, posType, yieldDetailsMapPnlYieldData, zOLrzqt, str2, strGEmmrt2, 7936, null);
    }
}
