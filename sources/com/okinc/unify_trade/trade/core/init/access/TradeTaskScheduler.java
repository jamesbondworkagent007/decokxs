package com.okinc.unify_trade.trade.core.init.access;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutKt;
import o.AbstractC54602xOl;
import o.AbstractC54610xOt;
import o.C33129mqd;
import o.C54515xLg;
import o.C54588xNy;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;
import o.pUU;
import o.xNE;
import o.xNF;
import o.xNG;
import o.xNW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class TradeTaskScheduler {
    public final String KWHzl = "trade_init";

    public Object OLrzqt(@NotNull C54588xNy c54588xNy, @NotNull List<? extends xNW> list, boolean z, @NotNull String str, @NotNull Continuation<? super AbstractC54610xOt> continuation) {
        return SupervisorKt.supervisorScope(new TradeTaskScheduler$initializeDataSources$2(list, this, str, z, c54588xNy, null), continuation);
    }

    public final Object EZpvd(List<? extends Deferred<Unit>> list, String str, Continuation<? super Unit> continuation) {
        Object objWithTimeout = TimeoutKt.withTimeout(30000L, new TradeTaskScheduler$waitAll$2(this, str, list, null), continuation);
        return objWithTimeout == C56442yFn.copydefault() ? objWithTimeout : Unit.INSTANCE;
    }

    public final void copydefault(boolean z, C54588xNy c54588xNy, long j, String str) {
        if (!z || (c54588xNy instanceof xNF) || (c54588xNy instanceof xNE) || (c54588xNy instanceof xNG)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        pUU.KWHzl(this.KWHzl, "[" + str + "] TradeTaskScheduler, all tasks success, total time: " + jCurrentTimeMillis + " ms");
        C54515xLg.OLrzqt.EZpvd("success", C33129mqd.gEmmrt(Long.valueOf(jCurrentTimeMillis)), "", "");
    }

    public static final class Activity extends AbstractC54602xOl {
        public final /* synthetic */ CancellableContinuation<StateListAnimator> AEQbTJ;
        public final /* synthetic */ xNW KWHzl;
        public final /* synthetic */ AtomicBoolean OLrzqt;
        public final /* synthetic */ String copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super com.okinc.unify_trade.trade.core.init.access.TradeTaskScheduler$StateListAnimator> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(String str, CancellableContinuation<? super StateListAnimator> cancellableContinuation, xNW xnw, AtomicBoolean atomicBoolean) {
            this.copydefault = str;
            this.AEQbTJ = cancellableContinuation;
            this.KWHzl = xnw;
            this.OLrzqt = atomicBoolean;
        }

        @Override // o.AbstractC54602xOl
        public void KWHzl(boolean z, boolean z2, boolean z3, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            pUU.KWHzl(TradeTaskScheduler.this.KWHzl, "[" + this.copydefault + "] Coroutine isActive=" + this.AEQbTJ.isActive() + " ,task " + this.KWHzl.EZpvd() + " result=" + z + ",msg=" + str);
            if (this.AEQbTJ.isActive()) {
                if (!z && str.length() > 0) {
                    C54515xLg.OLrzqt.EZpvd("fail", "", this.KWHzl.EZpvd(), str);
                }
                if (this.OLrzqt.getAndSet(true)) {
                    return;
                }
                CancellableContinuation<StateListAnimator> cancellableContinuation = this.AEQbTJ;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(new StateListAnimator(this.KWHzl, z, z2, z3, str)));
            }
        }
    }

    public static final class TaskDescription implements Function1<Throwable, Unit> {
        public final /* synthetic */ String AEQbTJ;
        public final /* synthetic */ AtomicBoolean EZpvd;
        public final /* synthetic */ TradeTaskScheduler KWHzl;
        public final /* synthetic */ xNW OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(AtomicBoolean atomicBoolean, TradeTaskScheduler tradeTaskScheduler, String str, xNW xnw) {
            this.EZpvd = atomicBoolean;
            this.KWHzl = tradeTaskScheduler;
            this.AEQbTJ = str;
            this.OLrzqt = xnw;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Throwable th) {
            AEQbTJ(th);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(Throwable th) {
            if (this.EZpvd.get()) {
                return;
            }
            String str = this.KWHzl.KWHzl;
            String str2 = this.AEQbTJ;
            xNW xnw = this.OLrzqt;
            pUU.valueOf(str, "[" + str2 + "] 任务 " + (xnw != null ? xnw.EZpvd() : null) + " 协程被取消");
        }
    }

    public static final class StateListAnimator {
        public final boolean AEQbTJ;
        public final String EZpvd;
        public final boolean KWHzl;
        public final boolean OLrzqt;
        public final xNW copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, xNW xnw, boolean z, boolean z2, boolean z3, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                xnw = stateListAnimator.copydefault;
            }
            if ((i & 2) != 0) {
                z = stateListAnimator.KWHzl;
            }
            boolean z4 = z;
            if ((i & 4) != 0) {
                z2 = stateListAnimator.AEQbTJ;
            }
            boolean z5 = z2;
            if ((i & 8) != 0) {
                z3 = stateListAnimator.OLrzqt;
            }
            boolean z6 = z3;
            if ((i & 16) != 0) {
                str = stateListAnimator.EZpvd;
            }
            return stateListAnimator.EZpvd(xnw, z4, z5, z6, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(xNW xnw, boolean z, boolean z2, boolean z3, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(xnw, z, z2, z3, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final xNW EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault) && this.KWHzl == stateListAnimator.KWHzl && this.AEQbTJ == stateListAnimator.AEQbTJ && this.OLrzqt == stateListAnimator.OLrzqt && Intrinsics.EZpvd((Object) this.EZpvd, (Object) stateListAnimator.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            xNW xnw = this.copydefault;
            return ((((((((xnw == null ? 0 : xnw.hashCode()) * 31) + Boolean.hashCode(this.KWHzl)) * 31) + Boolean.hashCode(this.AEQbTJ)) * 31) + Boolean.hashCode(this.OLrzqt)) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "LoadResult(task=" + this.copydefault + ", isSuccess=" + this.KWHzl + ", useCache=" + this.AEQbTJ + ", fromApi=" + this.OLrzqt + ", msg=" + this.EZpvd + ")";
        }

        public StateListAnimator(xNW xnw, boolean z, boolean z2, boolean z3, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = xnw;
            this.KWHzl = z;
            this.AEQbTJ = z2;
            this.OLrzqt = z3;
            this.EZpvd = str;
        }
    }

    public static final class TradeTaskException extends Exception {
        private final StateListAnimator result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator getResult() {
            return this.result;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TradeTaskException(@NotNull StateListAnimator stateListAnimator) {
            super(stateListAnimator.KWHzl());
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            this.result = stateListAnimator;
        }
    }

    public final Object KWHzl(xNW xnw, boolean z, String str, Continuation<? super StateListAnimator> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        if (xnw != null) {
            xnw.OLrzqt(z, new Activity(str, cancellableContinuationImpl, xnw, atomicBoolean));
        }
        cancellableContinuationImpl.invokeOnCancellation(new TaskDescription(atomicBoolean, this, str, xnw));
        Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }
}
