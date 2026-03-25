package o;

import aws.smithy.kotlin.runtime.util.SingleFlightGroup$singleFlight$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class HQ<T> {
    public int EZpvd;
    public final Mutex KWHzl = MutexKt.Mutex$default(false, 1, null);
    public CompletableDeferred<Result<T>> OLrzqt;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7 A[Catch: all -> 0x00d8, TryCatch #1 {all -> 0x00d8, blocks: (B:35:0x00b0, B:37:0x00b7, B:38:0x00b9), top: B:64:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Function1<? super Continuation<? super T>, ? extends java.lang.Object> function1, @NotNull Continuation<? super T> continuation) throws java.lang.Throwable {
        SingleFlightGroup$singleFlight$1 singleFlightGroup$singleFlight$1;
        HQ<T> hq;
        CompletableDeferred<Result<T>> completableDeferred;
        java.lang.Throwable th;
        CompletableDeferred<Result<T>> completableDeferred2;
        java.lang.Object objInvoke;
        HQ<T> hq2;
        CompletableDeferred<Result<T>> completableDeferred3;
        Mutex mutex;
        int i;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof SingleFlightGroup$singleFlight$1) {
            singleFlightGroup$singleFlight$1 = (SingleFlightGroup$singleFlight$1) continuation;
            int i2 = singleFlightGroup$singleFlight$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleFlightGroup$singleFlight$1.label = i2 - Integer.MIN_VALUE;
            } else {
                singleFlightGroup$singleFlight$1 = new SingleFlightGroup$singleFlight$1(this, continuation);
            }
        }
        java.lang.Object objAwait = singleFlightGroup$singleFlight$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        switch (singleFlightGroup$singleFlight$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objAwait);
                Mutex mutex2 = this.KWHzl;
                singleFlightGroup$singleFlight$1.L$0 = this;
                singleFlightGroup$singleFlight$1.L$1 = function1;
                singleFlightGroup$singleFlight$1.label = 1;
                if (Mutex.DefaultImpls.lock$default(mutex2, null, singleFlightGroup$singleFlight$1, 1, null) == objCopydefault) {
                    return objCopydefault;
                }
                hq = this;
                completableDeferred = hq.OLrzqt;
                if (completableDeferred == null) {
                    hq.EZpvd++;
                    Mutex.DefaultImpls.unlock$default(hq.KWHzl, null, 1, null);
                    singleFlightGroup$singleFlight$1.L$0 = hq;
                    singleFlightGroup$singleFlight$1.L$1 = completableDeferred;
                    singleFlightGroup$singleFlight$1.label = 2;
                    if (completableDeferred.join(singleFlightGroup$singleFlight$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    hq2 = hq;
                    completableDeferred3 = completableDeferred;
                    mutex = hq2.KWHzl;
                    singleFlightGroup$singleFlight$1.L$0 = hq2;
                    singleFlightGroup$singleFlight$1.L$1 = completableDeferred3;
                    singleFlightGroup$singleFlight$1.L$2 = mutex;
                    singleFlightGroup$singleFlight$1.label = 3;
                    if (mutex.lock(null, singleFlightGroup$singleFlight$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    try {
                        i = hq2.EZpvd - 1;
                        hq2.EZpvd = i;
                        if (i == 0) {
                            hq2.OLrzqt = null;
                        }
                        Unit unit = Unit.INSTANCE;
                        mutex.unlock(null);
                        singleFlightGroup$singleFlight$1.L$0 = null;
                        singleFlightGroup$singleFlight$1.L$1 = null;
                        singleFlightGroup$singleFlight$1.L$2 = null;
                        singleFlightGroup$singleFlight$1.label = 4;
                        objAwait = completableDeferred3.await(singleFlightGroup$singleFlight$1);
                        if (objAwait == objCopydefault) {
                            return objCopydefault;
                        }
                        java.lang.Object objM7386unboximpl = ((Result) objAwait).m7386unboximpl();
                        C56391yDq.AEQbTJ(objM7386unboximpl);
                        return objM7386unboximpl;
                    } catch (java.lang.Throwable th2) {
                        mutex.unlock(null);
                        throw th2;
                    }
                }
                CompletableDeferred<Result<T>> completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                hq.OLrzqt = completableDeferredCompletableDeferred$default;
                Mutex.DefaultImpls.unlock$default(hq.KWHzl, null, 1, null);
                try {
                    Result.Application application = Result.Companion;
                    singleFlightGroup$singleFlight$1.L$0 = completableDeferredCompletableDeferred$default;
                    singleFlightGroup$singleFlight$1.L$1 = null;
                    singleFlightGroup$singleFlight$1.label = 5;
                    objInvoke = function1.invoke(singleFlightGroup$singleFlight$1);
                    break;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    completableDeferred2 = completableDeferredCompletableDeferred$default;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (objInvoke == objCopydefault) {
                    return objCopydefault;
                }
                objAwait = objInvoke;
                completableDeferred2 = completableDeferredCompletableDeferred$default;
                objM7377constructorimpl = Result.m7377constructorimpl(objAwait);
                completableDeferred2.complete(Result.m7376boximpl(objM7377constructorimpl));
                singleFlightGroup$singleFlight$1.L$0 = null;
                singleFlightGroup$singleFlight$1.L$1 = null;
                singleFlightGroup$singleFlight$1.label = 6;
                objAwait = completableDeferred2.await(singleFlightGroup$singleFlight$1);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                java.lang.Object objM7386unboximpl2 = ((Result) objAwait).m7386unboximpl();
                C56391yDq.AEQbTJ(objM7386unboximpl2);
                return objM7386unboximpl2;
            case 1:
                function1 = (Function1) singleFlightGroup$singleFlight$1.L$1;
                hq = (HQ) singleFlightGroup$singleFlight$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
                completableDeferred = hq.OLrzqt;
                if (completableDeferred == null) {
                }
                break;
            case 2:
                CompletableDeferred<Result<T>> completableDeferred4 = (CompletableDeferred) singleFlightGroup$singleFlight$1.L$1;
                HQ<T> hq3 = (HQ) singleFlightGroup$singleFlight$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
                hq2 = hq3;
                completableDeferred3 = completableDeferred4;
                mutex = hq2.KWHzl;
                singleFlightGroup$singleFlight$1.L$0 = hq2;
                singleFlightGroup$singleFlight$1.L$1 = completableDeferred3;
                singleFlightGroup$singleFlight$1.L$2 = mutex;
                singleFlightGroup$singleFlight$1.label = 3;
                if (mutex.lock(null, singleFlightGroup$singleFlight$1) == objCopydefault) {
                }
                i = hq2.EZpvd - 1;
                hq2.EZpvd = i;
                if (i == 0) {
                }
                Unit unit2 = Unit.INSTANCE;
                mutex.unlock(null);
                singleFlightGroup$singleFlight$1.L$0 = null;
                singleFlightGroup$singleFlight$1.L$1 = null;
                singleFlightGroup$singleFlight$1.L$2 = null;
                singleFlightGroup$singleFlight$1.label = 4;
                objAwait = completableDeferred3.await(singleFlightGroup$singleFlight$1);
                if (objAwait == objCopydefault) {
                }
                java.lang.Object objM7386unboximpl3 = ((Result) objAwait).m7386unboximpl();
                C56391yDq.AEQbTJ(objM7386unboximpl3);
                return objM7386unboximpl3;
            case 3:
                mutex = (Mutex) singleFlightGroup$singleFlight$1.L$2;
                completableDeferred3 = (CompletableDeferred) singleFlightGroup$singleFlight$1.L$1;
                hq2 = (HQ) singleFlightGroup$singleFlight$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
                i = hq2.EZpvd - 1;
                hq2.EZpvd = i;
                if (i == 0) {
                }
                Unit unit22 = Unit.INSTANCE;
                mutex.unlock(null);
                singleFlightGroup$singleFlight$1.L$0 = null;
                singleFlightGroup$singleFlight$1.L$1 = null;
                singleFlightGroup$singleFlight$1.L$2 = null;
                singleFlightGroup$singleFlight$1.label = 4;
                objAwait = completableDeferred3.await(singleFlightGroup$singleFlight$1);
                if (objAwait == objCopydefault) {
                }
                java.lang.Object objM7386unboximpl32 = ((Result) objAwait).m7386unboximpl();
                C56391yDq.AEQbTJ(objM7386unboximpl32);
                return objM7386unboximpl32;
            case 4:
                C56391yDq.AEQbTJ(objAwait);
                java.lang.Object objM7386unboximpl322 = ((Result) objAwait).m7386unboximpl();
                C56391yDq.AEQbTJ(objM7386unboximpl322);
                return objM7386unboximpl322;
            case 5:
                completableDeferred2 = (CompletableDeferred) singleFlightGroup$singleFlight$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objAwait);
                    objM7377constructorimpl = Result.m7377constructorimpl(objAwait);
                    break;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    Result.Application application22 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                completableDeferred2.complete(Result.m7376boximpl(objM7377constructorimpl));
                singleFlightGroup$singleFlight$1.L$0 = null;
                singleFlightGroup$singleFlight$1.L$1 = null;
                singleFlightGroup$singleFlight$1.label = 6;
                objAwait = completableDeferred2.await(singleFlightGroup$singleFlight$1);
                if (objAwait == objCopydefault) {
                }
                java.lang.Object objM7386unboximpl22 = ((Result) objAwait).m7386unboximpl();
                C56391yDq.AEQbTJ(objM7386unboximpl22);
                return objM7386unboximpl22;
            case 6:
                C56391yDq.AEQbTJ(objAwait);
                java.lang.Object objM7386unboximpl222 = ((Result) objAwait).m7386unboximpl();
                C56391yDq.AEQbTJ(objM7386unboximpl222);
                return objM7386unboximpl222;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
