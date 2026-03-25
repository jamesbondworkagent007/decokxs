package o;

import com.okinc.unify_trade.biz.subscribe.TickerCupReq;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xkX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55468xkX {

    /* JADX INFO: renamed from: o.xkX$TaskDescription */
    public static final class TaskDescription implements InterfaceC55701xos<java.util.List<? extends TickersData>> {
        public final /* synthetic */ CancellableContinuation<java.util.List<TickersData>> KWHzl;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.util.List<com.okinc.unify_trade.biz.subscribe.TickersData>> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(CancellableContinuation<? super java.util.List<TickersData>> cancellableContinuation) {
            this.KWHzl = cancellableContinuation;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<TickersData> list, java.lang.Exception exc) {
            if (this.KWHzl.isActive()) {
                if (z && C33129mqd.KWHzl((java.util.Collection) list)) {
                    CancellableContinuation<java.util.List<TickersData>> cancellableContinuation = this.KWHzl;
                    Result.Application application = Result.Companion;
                    Intrinsics.copydefault(list);
                    cancellableContinuation.resumeWith(Result.m7377constructorimpl(list));
                    return;
                }
                CancellableContinuation<java.util.List<TickersData>> cancellableContinuation2 = this.KWHzl;
                Result.Application application2 = Result.Companion;
                if (exc == null) {
                    exc = new java.lang.IllegalStateException("get cup ticker error");
                }
                cancellableContinuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(exc)));
            }
        }
    }

    /* JADX INFO: renamed from: o.xkX$Activity */
    public static final class Activity implements Function1<java.lang.Throwable, Unit> {
        public final /* synthetic */ InterfaceC58217yxC EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(InterfaceC58217yxC interfaceC58217yxC) {
            this.EZpvd = interfaceC58217yxC;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            AEQbTJ(th);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(java.lang.Throwable th) {
            this.EZpvd.dispose();
        }
    }

    public static final java.lang.Object AEQbTJ(@NotNull InterfaceC55702xot interfaceC55702xot, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.List<TickersData>> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new Activity(interfaceC55702xot.copydefault(new TickerCupReq(list), new TaskDescription(cancellableContinuationImpl))));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }
}
