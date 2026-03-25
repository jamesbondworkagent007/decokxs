package o;

import com.okinc.market.time.TimeExtKt$launchCountDown$3;
import com.okinc.market.time.TimeExtKt$launchCountDown$4;
import com.okinc.market.time.TimeExtKt$launchCountDown$5;
import com.okinc.market.time.TimeExtKt$launchCountDown$6;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.pVX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qVr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C40433qVr {
    public static final java.lang.String EZpvd(long j) {
        long jCurrentTimeMillis = j - java.lang.System.currentTimeMillis();
        if (jCurrentTimeMillis <= 0) {
            return "";
        }
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        long days = timeUnit.toDays(jCurrentTimeMillis);
        long hours = timeUnit.toHours(jCurrentTimeMillis) % ((long) 24);
        long j2 = 60;
        long minutes = timeUnit.toMinutes(jCurrentTimeMillis) % j2;
        long seconds = timeUnit.toSeconds(jCurrentTimeMillis) % j2;
        java.lang.String strValueOf = minutes == 0 ? "0" : java.lang.String.valueOf(minutes);
        java.lang.String strValueOf2 = seconds != 0 ? java.lang.String.valueOf(seconds) : "0";
        if (days > 0) {
            return C33069mpW.copydefault(pVX.LoaderManager.KWHzl, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(days)))) + " " + C33069mpW.copydefault(pVX.LoaderManager.valueOf, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(hours))));
        }
        if (hours > 0) {
            return C33069mpW.copydefault(pVX.LoaderManager.valueOf, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(hours)))) + " " + C33069mpW.copydefault(pVX.LoaderManager.AYXKKw, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(strValueOf))));
        }
        return C33069mpW.copydefault(pVX.LoaderManager.AYXKKw, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(java.lang.Long.valueOf(minutes))))) + " " + C33069mpW.copydefault(pVX.LoaderManager.AhwBna, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(strValueOf2))));
    }

    public static final int KWHzl(long j) {
        return C33129mqd.AhwBna(java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(j - java.lang.System.currentTimeMillis())));
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object launchCountDown$default(long j, Function0 function0, Function0 function02, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function02 = new Function0() { // from class: o.qVt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C40433qVr.copydefault();
                }
            };
        }
        return copydefault(j, function0, function02, continuation);
    }

    public static final java.lang.Object copydefault(long j, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objCollect = FlowKt.m7441catch(FlowKt.flowOn(FlowKt.onStart(FlowKt.onCompletion(FlowKt.onEach(FlowKt.asFlow(C56548yJl.AYXKKw(KWHzl(j), 0)), new TimeExtKt$launchCountDown$3(null)), new TimeExtKt$launchCountDown$4(null)), new TimeExtKt$launchCountDown$5(function0, null)), Dispatchers.getDefault()), new TimeExtKt$launchCountDown$6(null)).collect(new TaskDescription(function02, function0), continuation);
        return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.qVr$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        public final /* synthetic */ Function0<Unit> EZpvd;
        public final /* synthetic */ Function0<Unit> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function0<Unit> function0, Function0<Unit> function02) {
            this.EZpvd = function0;
            this.KWHzl = function02;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return KWHzl(((java.lang.Number) obj).intValue(), continuation);
        }

        public final java.lang.Object KWHzl(int i, Continuation<? super Unit> continuation) {
            if (i <= 0) {
                this.EZpvd.invoke();
            } else {
                this.KWHzl.invoke();
            }
            return Unit.INSTANCE;
        }
    }
}
