package o;

import com.okinc.trade.arch.util.ITimeMeasurable$measureCoroutineTimeCost$1;
import java.util.Objects;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.unQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC49376unQ {
    <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1);

    boolean EZpvd();

    <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation);

    /* JADX INFO: renamed from: o.unQ$Application */
    public static final class Application {
        public static boolean copydefault(@NotNull InterfaceC49376unQ interfaceC49376unQ) {
            return false;
        }

        public static <Input, Output> Output copydefault(@NotNull InterfaceC49376unQ interfaceC49376unQ, Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            if (!interfaceC49376unQ.EZpvd()) {
                return function1.invoke(input);
            }
            return (Output) EZpvd(interfaceC49376unQ, C56390yDp.OLrzqt(function1.invoke(input), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - java.lang.System.currentTimeMillis())));
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static <Input, Output> java.lang.Object EZpvd(@NotNull InterfaceC49376unQ interfaceC49376unQ, Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) throws java.lang.Throwable {
            ITimeMeasurable$measureCoroutineTimeCost$1 iTimeMeasurable$measureCoroutineTimeCost$1;
            InterfaceC49376unQ interfaceC49376unQ2;
            long j;
            if (continuation instanceof ITimeMeasurable$measureCoroutineTimeCost$1) {
                iTimeMeasurable$measureCoroutineTimeCost$1 = (ITimeMeasurable$measureCoroutineTimeCost$1) continuation;
                int i = iTimeMeasurable$measureCoroutineTimeCost$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iTimeMeasurable$measureCoroutineTimeCost$1.label = i - Integer.MIN_VALUE;
                } else {
                    iTimeMeasurable$measureCoroutineTimeCost$1 = new ITimeMeasurable$measureCoroutineTimeCost$1(continuation);
                }
            }
            java.lang.Object objInvoke = iTimeMeasurable$measureCoroutineTimeCost$1.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = iTimeMeasurable$measureCoroutineTimeCost$1.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        C56391yDq.AEQbTJ(objInvoke);
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = iTimeMeasurable$measureCoroutineTimeCost$1.J$0;
                interfaceC49376unQ2 = (InterfaceC49376unQ) iTimeMeasurable$measureCoroutineTimeCost$1.L$0;
                C56391yDq.AEQbTJ(objInvoke);
                return EZpvd(interfaceC49376unQ2, C56390yDp.OLrzqt(objInvoke, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j)));
            }
            C56391yDq.AEQbTJ(objInvoke);
            if (!interfaceC49376unQ.EZpvd()) {
                iTimeMeasurable$measureCoroutineTimeCost$1.label = 2;
                objInvoke = function2.invoke(input, iTimeMeasurable$measureCoroutineTimeCost$1);
                return objInvoke == objCopydefault ? objCopydefault : objInvoke;
            }
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            iTimeMeasurable$measureCoroutineTimeCost$1.L$0 = interfaceC49376unQ;
            iTimeMeasurable$measureCoroutineTimeCost$1.J$0 = jCurrentTimeMillis;
            iTimeMeasurable$measureCoroutineTimeCost$1.label = 1;
            objInvoke = function2.invoke(input, iTimeMeasurable$measureCoroutineTimeCost$1);
            if (objInvoke == objCopydefault) {
                return objCopydefault;
            }
            interfaceC49376unQ2 = interfaceC49376unQ;
            j = jCurrentTimeMillis;
            return EZpvd(interfaceC49376unQ2, C56390yDp.OLrzqt(objInvoke, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j)));
        }

        public static <R> R EZpvd(InterfaceC49376unQ interfaceC49376unQ, kotlin.Pair<? extends R, java.lang.Long> pair) {
            if (C49372unM.AEQbTJ.copydefault()) {
                interfaceC49376unQ.getClass().getSimpleName();
                Objects.toString(pair.getSecond());
            }
            return pair.getFirst();
        }
    }
}
