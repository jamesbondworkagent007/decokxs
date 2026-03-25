package o;

import com.okinc.planet.biz_plugin.domain.GetFutureHistoryUseCase$invoke$1;
import com.okinc.tradeshare.api.TradeHisPositionPlanetBean;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import o.InterfaceC49513upv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tBU {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Continuation<? super kotlin.Pair<? extends kotlin.Pair<? extends java.util.List<TradeHisPositionPlanetBean>, java.lang.String>, java.lang.Boolean>> continuation) throws java.lang.Throwable {
        GetFutureHistoryUseCase$invoke$1 getFutureHistoryUseCase$invoke$1;
        java.lang.Object objM8778historyPositionToPlanet0E7RQCE$default;
        if (continuation instanceof GetFutureHistoryUseCase$invoke$1) {
            getFutureHistoryUseCase$invoke$1 = (GetFutureHistoryUseCase$invoke$1) continuation;
            int i = getFutureHistoryUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getFutureHistoryUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getFutureHistoryUseCase$invoke$1 = new GetFutureHistoryUseCase$invoke$1(this, continuation);
            }
        }
        GetFutureHistoryUseCase$invoke$1 getFutureHistoryUseCase$invoke$12 = getFutureHistoryUseCase$invoke$1;
        java.lang.Object obj = getFutureHistoryUseCase$invoke$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getFutureHistoryUseCase$invoke$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC49513upv interfaceC49513upv = (InterfaceC49513upv) C43248rlh.KWHzl.AEQbTJ(InterfaceC49513upv.class);
            getFutureHistoryUseCase$invoke$12.label = 1;
            objM8778historyPositionToPlanet0E7RQCE$default = InterfaceC49513upv.Application.m8778historyPositionToPlanet0E7RQCE$default(interfaceC49513upv, 30, null, getFutureHistoryUseCase$invoke$12, 2, null);
            if (objM8778historyPositionToPlanet0E7RQCE$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM8778historyPositionToPlanet0E7RQCE$default = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objM8778historyPositionToPlanet0E7RQCE$default)) {
            try {
                C56391yDq.AEQbTJ(objM8778historyPositionToPlanet0E7RQCE$default);
                return C56390yDp.OLrzqt(objM8778historyPositionToPlanet0E7RQCE$default, C56443yFo.KWHzl(true));
            } catch (java.lang.Exception unused) {
                return C56390yDp.OLrzqt(new kotlin.Pair(yDY.AhwBna(), ""), C56443yFo.KWHzl(false));
            }
        }
        return C56390yDp.OLrzqt(new kotlin.Pair(yDY.AhwBna(), ""), C56443yFo.KWHzl(false));
    }
}
