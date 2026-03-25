package o;

import com.okinc.planet.biz_plugin.ChartTimeframeConfig;
import com.okinc.planet.biz_plugin.domain.GetSpotChatDataUseCase$invoke$1;
import com.okinc.tradeshare.api.TradeKLineBar;
import com.okinc.tradeshare.api.TradeTickerChartEntry;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tCa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45944tCa {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Continuation<? super kotlin.Pair<? extends java.util.List<TradeTickerChartEntry>, java.lang.Boolean>> continuation) throws java.lang.Throwable {
        GetSpotChatDataUseCase$invoke$1 getSpotChatDataUseCase$invoke$1;
        java.lang.Object objEZpvd;
        if (continuation instanceof GetSpotChatDataUseCase$invoke$1) {
            getSpotChatDataUseCase$invoke$1 = (GetSpotChatDataUseCase$invoke$1) continuation;
            int i = getSpotChatDataUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSpotChatDataUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getSpotChatDataUseCase$invoke$1 = new GetSpotChatDataUseCase$invoke$1(this, continuation);
            }
        }
        GetSpotChatDataUseCase$invoke$1 getSpotChatDataUseCase$invoke$12 = getSpotChatDataUseCase$invoke$1;
        java.lang.Object obj = getSpotChatDataUseCase$invoke$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSpotChatDataUseCase$invoke$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            ChartTimeframeConfig chartTimeframeConfigCopydefault = tBO.copydefault.copydefault(C33129mqd.valueOf(str3), C33129mqd.valueOf(str4));
            InterfaceC49513upv interfaceC49513upv = (InterfaceC49513upv) C43248rlh.KWHzl.AEQbTJ(InterfaceC49513upv.class);
            int approximateDataPoints = chartTimeframeConfigCopydefault.getApproximateDataPoints();
            TradeKLineBar intervalMinutes = chartTimeframeConfigCopydefault.getIntervalMinutes();
            getSpotChatDataUseCase$invoke$12.label = 1;
            objEZpvd = interfaceC49513upv.EZpvd(str, str2, approximateDataPoints, intervalMinutes, getSpotChatDataUseCase$invoke$12);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            try {
                C56391yDq.AEQbTJ(objEZpvd);
                return C56390yDp.OLrzqt((java.util.List) objEZpvd, C56443yFo.KWHzl(true));
            } catch (java.lang.Exception unused) {
                return C56390yDp.OLrzqt(yDY.AhwBna(), C56443yFo.KWHzl(false));
            }
        }
        return C56390yDp.OLrzqt(yDY.AhwBna(), C56443yFo.KWHzl(false));
    }
}
