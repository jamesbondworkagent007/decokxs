package o;

import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.domain.usecase.ConvertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarHeadVo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarTokenUnlockTypeVo;
import java.math.RoundingMode;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C40892qgX;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qgY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40893qgY extends AbstractC49400uno<C40885qgQ, TradingCalendarTokenUnlockTypeVo> {
    public final C40891qgW AEQbTJ;
    public final C40952qhe EZpvd;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((C40885qgQ) obj, (Continuation<? super TradingCalendarTokenUnlockTypeVo>) continuation);
    }

    @yCM
    public C40893qgY(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C40952qhe c40952qhe, @NotNull C40891qgW c40891qgW) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c40952qhe, "");
        Intrinsics.checkNotNullParameter(c40891qgW, "");
        this.copydefault = coroutineDispatcher;
        this.EZpvd = c40952qhe;
        this.AEQbTJ = c40891qgW;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull C40885qgQ c40885qgQ, @NotNull Continuation<? super TradingCalendarTokenUnlockTypeVo> continuation) throws java.lang.Throwable {
        ConvertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1 convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1;
        java.lang.String strOLrzqt;
        java.lang.String strKWHzl;
        C40885qgQ c40885qgQ2;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        float f;
        java.lang.String str8;
        float f2;
        if (continuation instanceof ConvertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1) {
            convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1 = (ConvertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1) continuation;
            int i = convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1 = new ConvertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C40892qgX.Application application = C40892qgX.Companion;
            java.lang.String strAYXKKw = c40885qgQ.AYXKKw();
            java.lang.Long lKWHzl = strAYXKKw != null ? C56443yFo.KWHzl(java.lang.Long.parseLong(strAYXKKw)) : null;
            Intrinsics.copydefault(lKWHzl);
            strOLrzqt = application.OLrzqt(lKWHzl.longValue());
            java.lang.String strAEQbTJ = c40885qgQ.AEQbTJ();
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            java.lang.String str9 = strAEQbTJ;
            java.lang.String strOLrzqt2 = c40885qgQ.OLrzqt();
            java.lang.String strCopydefault = (strOLrzqt2 == null || strOLrzqt2.length() == 0) ? "--" : C33069mpW.copydefault(qZH.PendingIntent.DcMfJKDGTeJD, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", c40885qgQ.OLrzqt())));
            java.lang.String strOLrzqt3 = OLrzqt(c40885qgQ.valueOf());
            java.lang.String strAEQbTJ2 = AEQbTJ(c40885qgQ.gEmmrt());
            float fEZpvd = EZpvd(c40885qgQ.gEmmrt());
            java.lang.String strOLrzqt4 = OLrzqt(c40885qgQ.copydefault());
            java.lang.String strAEQbTJ3 = AEQbTJ(c40885qgQ.AhwBna());
            float fEZpvd2 = EZpvd(c40885qgQ.gEmmrt()) + EZpvd(c40885qgQ.AhwBna());
            java.lang.String strOLrzqt5 = OLrzqt(c40885qgQ.EZpvd());
            java.lang.String strAEQbTJ4 = AEQbTJ(c40885qgQ.KWHzl());
            strKWHzl = application.KWHzl(java.lang.Long.parseLong(c40885qgQ.AYXKKw()), this.AEQbTJ);
            C40952qhe c40952qhe = this.EZpvd;
            java.lang.Long lKWHzl2 = C56443yFo.KWHzl(java.lang.Long.parseLong(c40885qgQ.AYXKKw()));
            convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.L$0 = c40885qgQ;
            convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.L$1 = str9;
            convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.L$2 = strOLrzqt;
            convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.L$3 = strCopydefault;
            convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.L$4 = strOLrzqt3;
            convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.L$5 = strAEQbTJ2;
            convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.L$6 = strOLrzqt4;
            convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.L$7 = strAEQbTJ3;
            convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.L$8 = strOLrzqt5;
            convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.L$9 = strAEQbTJ4;
            convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.L$10 = strKWHzl;
            convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.F$0 = fEZpvd;
            convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.F$1 = fEZpvd2;
            convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.label = 1;
            objEZpvd = c40952qhe.EZpvd(lKWHzl2, convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c40885qgQ2 = c40885qgQ;
            str = strOLrzqt5;
            str2 = strOLrzqt3;
            str3 = str9;
            str4 = strAEQbTJ4;
            str5 = strAEQbTJ3;
            str6 = strAEQbTJ2;
            str7 = strOLrzqt4;
            f = fEZpvd;
            str8 = strCopydefault;
            f2 = fEZpvd2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            float f3 = convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.F$1;
            float f4 = convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.F$0;
            strKWHzl = (java.lang.String) convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.L$10;
            java.lang.String str10 = (java.lang.String) convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.L$9;
            java.lang.String str11 = (java.lang.String) convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.L$8;
            java.lang.String str12 = (java.lang.String) convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.L$7;
            java.lang.String str13 = (java.lang.String) convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.L$6;
            java.lang.String str14 = (java.lang.String) convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.L$5;
            java.lang.String str15 = (java.lang.String) convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.L$4;
            java.lang.String str16 = (java.lang.String) convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.L$3;
            strOLrzqt = (java.lang.String) convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.L$2;
            java.lang.String str17 = (java.lang.String) convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.L$1;
            c40885qgQ2 = (C40885qgQ) convertTradingCalendarTokenUnlockTypePoToVoUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            str = str11;
            str2 = str15;
            str5 = str12;
            str6 = str14;
            str7 = str13;
            f = f4;
            str8 = str16;
            f2 = f3;
            str4 = str10;
            str3 = str17;
        }
        return new TradingCalendarTokenUnlockTypeVo(str8, strOLrzqt, str3, str2, str6, f, str7, str5, f2, str, str4, new TradingCalendarHeadVo(strKWHzl, ((java.lang.Number) objEZpvd).longValue()), java.lang.Long.parseLong(c40885qgQ2.AYXKKw()));
    }

    private final java.lang.String OLrzqt(java.lang.String str) {
        return (str == null || str.length() == 0) ? "--" : pTB.formatICUCompact$default(C33129mqd.EZpvd(str), RoundingMode.HALF_UP, null, null, null, 14, null);
    }

    private final java.lang.String AEQbTJ(java.lang.String str) {
        return (str == null || str.length() == 0) ? "--" : xMR.formatICUPercent$default(xMR.copydefault, C33129mqd.EZpvd(str), null, null, null, java.lang.Double.valueOf(100.0d), null, 46, null);
    }

    private final float EZpvd(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return 0.0f;
        }
        return C33129mqd.djBIcL(java.lang.Integer.valueOf(C33570myu.AEQbTJ() - C55298xhM.dp2px$default(111.0f, null, 1, null))) * C33129mqd.djBIcL(str);
    }
}
