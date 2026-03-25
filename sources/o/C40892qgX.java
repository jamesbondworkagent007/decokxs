package o;

import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.domain.usecase.ConvertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarEconomicTypeVo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarHeadVo;
import java.util.Date;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qgX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40892qgX extends AbstractC49400uno<C40888qgT, TradingCalendarEconomicTypeVo> {
    public final C40952qhe EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final C40891qgW OLrzqt;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @yCM
    public C40892qgX(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C40952qhe c40952qhe, @NotNull C40891qgW c40891qgW) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c40952qhe, "");
        Intrinsics.checkNotNullParameter(c40891qgW, "");
        this.KWHzl = coroutineDispatcher;
        this.EZpvd = c40952qhe;
        this.OLrzqt = c40891qgW;
    }

    /* JADX INFO: renamed from: o.qgX$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qgX.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final java.lang.String AEQbTJ(java.lang.String str) {
            return (str == null || str.length() == 0) ? "-" : pTF.KWHzl.AEQbTJ(str);
        }

        public final java.lang.String OLrzqt(long j) {
            return pTA.formatTime$default(new Date(j), OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null);
        }

        public final java.lang.String KWHzl(long j, @NotNull C40891qgW c40891qgW) {
            Intrinsics.checkNotNullParameter(c40891qgW, "");
            boolean zBooleanValue = ((java.lang.Boolean) c40891qgW.OLrzqt(java.lang.Long.valueOf(j))).booleanValue();
            java.lang.String date$default = pTA.formatDate$default(new Date(j), OKDateEnum.DATE_FORMAT_SIMPLE, null, null, 6, null);
            return zBooleanValue ? C33069mpW.copydefault(qZH.PendingIntent.DcMfJKDIADVb, C56423yEv.EZpvd(C56390yDp.OLrzqt("date", date$default))) : date$default;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C40888qgT c40888qgT, @NotNull Continuation<? super TradingCalendarEconomicTypeVo> continuation) throws java.lang.Throwable {
        ConvertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1 convertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1;
        C40888qgT c40888qgT2;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        if (continuation instanceof ConvertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1) {
            convertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1 = (ConvertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1) continuation;
            int i = convertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                convertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                convertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1 = new ConvertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = convertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = convertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Application application = Companion;
            java.lang.String strValueOf = c40888qgT.valueOf();
            java.lang.Long lKWHzl = strValueOf != null ? C56443yFo.KWHzl(java.lang.Long.parseLong(strValueOf)) : null;
            Intrinsics.copydefault(lKWHzl);
            java.lang.String strOLrzqt = application.OLrzqt(lKWHzl.longValue());
            java.lang.String strAEQbTJ = c40888qgT.AEQbTJ();
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            java.lang.String strEZpvd = c40888qgT.EZpvd();
            if (strEZpvd == null) {
                strEZpvd = "-";
            }
            java.lang.String strAEQbTJ2 = application.AEQbTJ(c40888qgT.OLrzqt());
            java.lang.String strAEQbTJ3 = application.AEQbTJ(c40888qgT.AYXKKw());
            java.lang.String strAEQbTJ4 = application.AEQbTJ(c40888qgT.copydefault());
            java.lang.String strKWHzl = application.KWHzl(java.lang.Long.parseLong(c40888qgT.valueOf()), this.OLrzqt);
            C40952qhe c40952qhe = this.EZpvd;
            java.lang.Long lKWHzl2 = C56443yFo.KWHzl(java.lang.Long.parseLong(c40888qgT.valueOf()));
            c40888qgT2 = c40888qgT;
            convertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1.L$0 = c40888qgT2;
            convertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1.L$1 = strKWHzl;
            convertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1.L$2 = strAEQbTJ4;
            convertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1.L$3 = strAEQbTJ3;
            convertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1.L$4 = strAEQbTJ2;
            convertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1.L$5 = strEZpvd;
            convertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1.L$6 = strAEQbTJ;
            convertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1.L$7 = strOLrzqt;
            convertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1.label = 1;
            java.lang.Object objEZpvd = c40952qhe.EZpvd(lKWHzl2, convertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            str = strOLrzqt;
            str2 = strAEQbTJ;
            str3 = strEZpvd;
            str4 = strAEQbTJ2;
            str5 = strAEQbTJ3;
            str6 = strAEQbTJ4;
            str7 = strKWHzl;
            obj = objEZpvd;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.String str8 = (java.lang.String) convertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1.L$7;
            java.lang.String str9 = (java.lang.String) convertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1.L$6;
            java.lang.String str10 = (java.lang.String) convertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1.L$5;
            java.lang.String str11 = (java.lang.String) convertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1.L$4;
            java.lang.String str12 = (java.lang.String) convertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1.L$3;
            java.lang.String str13 = (java.lang.String) convertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1.L$2;
            str7 = (java.lang.String) convertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1.L$1;
            C40888qgT c40888qgT3 = (C40888qgT) convertTradingCalendarEconomicTypePoToVoUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            c40888qgT2 = c40888qgT3;
            str = str8;
            str2 = str9;
            str3 = str10;
            str4 = str11;
            str5 = str12;
            str6 = str13;
        }
        TradingCalendarHeadVo tradingCalendarHeadVo = new TradingCalendarHeadVo(str7, ((java.lang.Number) obj).longValue());
        long j = java.lang.Long.parseLong(c40888qgT2.valueOf());
        java.lang.String strKWHzl2 = c40888qgT2.KWHzl();
        return new TradingCalendarEconomicTypeVo(str, str2, str3, str4, str5, str6, tradingCalendarHeadVo, j, strKWHzl2 == null ? "" : strKWHzl2, false, 0L, 1536, null);
    }
}
