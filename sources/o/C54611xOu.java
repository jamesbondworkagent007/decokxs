package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.trade.core.init.access.RefreshCoinsTask$refresh$1;
import com.okinc.unify_trade.trade.core.init.access.RefreshCoinsTask$refresh$2;
import com.okinc.unify_trade.trade.core.init.access.RefreshCoinsTask$refreshInternal$1;
import com.okinc.unify_trade.trade.core.init.access.RefreshCoinsTask$refreshInternal$3$2$1$1;
import com.okinc.unify_trade.trade.utils.TradeAbTestManager;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import o.xKK;
import o.xNQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xOu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54611xOu {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public volatile Deferred<java.lang.Boolean> OLrzqt;
    public final xBN KWHzl = new xBN();
    public final xBS AYXKKw = new xBS();
    public final xNQ.TaskDescription EZpvd = new xNQ.TaskDescription();
    public final Mutex AEQbTJ = MutexKt.Mutex$default(false, 1, null);

    /* JADX INFO: renamed from: o.xOu$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xOu.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final xKL<java.util.ArrayList<TradeCoinInfo>> AEQbTJ() {
        return TradeAbTestManager.copydefault.copydefault() ? new xBN() : new xBS();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull xNQ xnq, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        RefreshCoinsTask$refresh$1 refreshCoinsTask$refresh$1;
        TimeoutCancellationException e;
        C54611xOu c54611xOu;
        Deferred<java.lang.Boolean> deferred;
        boolean zBooleanValue;
        if (continuation instanceof RefreshCoinsTask$refresh$1) {
            refreshCoinsTask$refresh$1 = (RefreshCoinsTask$refresh$1) continuation;
            int i = refreshCoinsTask$refresh$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                refreshCoinsTask$refresh$1.label = i - Integer.MIN_VALUE;
            } else {
                refreshCoinsTask$refresh$1 = new RefreshCoinsTask$refresh$1(this, continuation);
            }
        }
        java.lang.Object objWithTimeout = refreshCoinsTask$refresh$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = refreshCoinsTask$refresh$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithTimeout);
            try {
                RefreshCoinsTask$refresh$2 refreshCoinsTask$refresh$2 = new RefreshCoinsTask$refresh$2(this, xnq, null);
                refreshCoinsTask$refresh$1.L$0 = this;
                refreshCoinsTask$refresh$1.label = 1;
                objWithTimeout = TimeoutKt.withTimeout(30000L, refreshCoinsTask$refresh$2, refreshCoinsTask$refresh$1);
                if (objWithTimeout == objCopydefault) {
                    return objCopydefault;
                }
            } catch (TimeoutCancellationException e2) {
                e = e2;
                c54611xOu = this;
                pUU.AEQbTJ("RefreshCoinsTask", "refresh: timeout after 30000ms", e);
                deferred = c54611xOu.OLrzqt;
                if (deferred != null) {
                }
                c54611xOu.OLrzqt = null;
                zBooleanValue = false;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c54611xOu = (C54611xOu) refreshCoinsTask$refresh$1.L$0;
            try {
                C56391yDq.AEQbTJ(objWithTimeout);
            } catch (TimeoutCancellationException e3) {
                e = e3;
                pUU.AEQbTJ("RefreshCoinsTask", "refresh: timeout after 30000ms", e);
                deferred = c54611xOu.OLrzqt;
                if (deferred != null) {
                    Job.DefaultImpls.cancel$default((Job) deferred, (CancellationException) null, 1, (java.lang.Object) null);
                }
                c54611xOu.OLrzqt = null;
                zBooleanValue = false;
            }
        }
        zBooleanValue = ((java.lang.Boolean) objWithTimeout).booleanValue();
        return C56443yFo.KWHzl(zBooleanValue);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:63:0x0028 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a3 A[Catch: all -> 0x00fd, TRY_LEAVE, TryCatch #2 {all -> 0x00fd, blocks: (B:15:0x0036, B:56:0x00ef, B:57:0x00f5, B:20:0x0047, B:50:0x00b7, B:52:0x00be, B:44:0x009f, B:46:0x00a3, B:47:0x00a8, B:53:0x00c4), top: B:63:0x0028, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c4 A[Catch: all -> 0x00fd, TryCatch #2 {all -> 0x00fd, blocks: (B:15:0x0036, B:56:0x00ef, B:57:0x00f5, B:20:0x0047, B:50:0x00b7, B:52:0x00be, B:44:0x009f, B:46:0x00a3, B:47:0x00a8, B:53:0x00c4), top: B:63:0x0028, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, o.xNQ] */
    /* JADX WARN: Type inference failed for: r11v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [o.xNQ] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(xNQ xnq, Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        RefreshCoinsTask$refreshInternal$1 refreshCoinsTask$refreshInternal$1;
        final C54611xOu c54611xOu;
        final ?? r2;
        Mutex mutex;
        Deferred<java.lang.Boolean> deferred;
        Mutex mutex2;
        if (continuation instanceof RefreshCoinsTask$refreshInternal$1) {
            refreshCoinsTask$refreshInternal$1 = (RefreshCoinsTask$refreshInternal$1) continuation;
            int i = refreshCoinsTask$refreshInternal$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                refreshCoinsTask$refreshInternal$1.label = i - Integer.MIN_VALUE;
            } else {
                refreshCoinsTask$refreshInternal$1 = new RefreshCoinsTask$refreshInternal$1(this, continuation);
            }
        }
        java.lang.Object objAwait = refreshCoinsTask$refreshInternal$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = refreshCoinsTask$refreshInternal$1.label;
        boolean zBooleanValue = false;
        try {
            try {
                try {
                } finally {
                    xnq.unlock(null);
                }
            } catch (CancellationException e) {
                pUU.AEQbTJ("RefreshCoinsTask", "refresh: ongoing refresh was cancelled", e);
            }
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                Deferred<java.lang.Boolean> deferred2 = this.OLrzqt;
                if (deferred2 != null) {
                    pUU.KWHzl("RefreshCoinsTask", "refresh: reusing ongoing refresh");
                    refreshCoinsTask$refreshInternal$1.label = 1;
                    objAwait = deferred2.await(refreshCoinsTask$refreshInternal$1);
                    if (objAwait == objCopydefault) {
                        return objCopydefault;
                    }
                    zBooleanValue = ((java.lang.Boolean) objAwait).booleanValue();
                    return C56443yFo.KWHzl(zBooleanValue);
                }
                Mutex mutex3 = this.AEQbTJ;
                refreshCoinsTask$refreshInternal$1.L$0 = this;
                refreshCoinsTask$refreshInternal$1.L$1 = xnq;
                refreshCoinsTask$refreshInternal$1.L$2 = mutex3;
                refreshCoinsTask$refreshInternal$1.label = 2;
                if (mutex3.lock(null, refreshCoinsTask$refreshInternal$1) == objCopydefault) {
                    return objCopydefault;
                }
                c54611xOu = this;
                r2 = xnq;
                mutex = mutex3;
                deferred = c54611xOu.OLrzqt;
                if (deferred == null) {
                }
            } else {
                if (i2 == 1) {
                    C56391yDq.AEQbTJ(objAwait);
                    zBooleanValue = ((java.lang.Boolean) objAwait).booleanValue();
                    return C56443yFo.KWHzl(zBooleanValue);
                }
                if (i2 == 2) {
                    Mutex mutex4 = (Mutex) refreshCoinsTask$refreshInternal$1.L$2;
                    xNQ xnq2 = (xNQ) refreshCoinsTask$refreshInternal$1.L$1;
                    c54611xOu = (C54611xOu) refreshCoinsTask$refreshInternal$1.L$0;
                    C56391yDq.AEQbTJ(objAwait);
                    r2 = xnq2;
                    mutex = mutex4;
                    deferred = c54611xOu.OLrzqt;
                    if (deferred == null) {
                        pUU.KWHzl("RefreshCoinsTask", "refresh: another coroutine created refresh, reusing it");
                        refreshCoinsTask$refreshInternal$1.L$0 = mutex;
                        refreshCoinsTask$refreshInternal$1.L$1 = null;
                        refreshCoinsTask$refreshInternal$1.L$2 = null;
                        refreshCoinsTask$refreshInternal$1.label = 3;
                        objAwait = deferred.await(refreshCoinsTask$refreshInternal$1);
                        xnq = mutex;
                        if (objAwait == objCopydefault) {
                            return objCopydefault;
                        }
                        zBooleanValue = ((java.lang.Boolean) objAwait).booleanValue();
                        xnq = xnq;
                    } else {
                        pUU.KWHzl("RefreshCoinsTask", "refresh: starting new refresh");
                        final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                        c54611xOu.OLrzqt = completableDeferredCompletableDeferred$default;
                        xKL<java.util.ArrayList<TradeCoinInfo>> xklAEQbTJ = c54611xOu.AEQbTJ();
                        xklAEQbTJ.KWHzl(new Function1() { // from class: o.xOr
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C54611xOu.KWHzl(completableDeferredCompletableDeferred$default, c54611xOu, r2, (ResponseData) obj);
                            }
                        });
                        xKK.Activity.execute$default(xklAEQbTJ, 0L, 1, null);
                        refreshCoinsTask$refreshInternal$1.L$0 = mutex;
                        refreshCoinsTask$refreshInternal$1.L$1 = null;
                        refreshCoinsTask$refreshInternal$1.L$2 = null;
                        refreshCoinsTask$refreshInternal$1.label = 4;
                        objAwait = completableDeferredCompletableDeferred$default.await(refreshCoinsTask$refreshInternal$1);
                        mutex2 = mutex;
                        if (objAwait == objCopydefault) {
                            return objCopydefault;
                        }
                        zBooleanValue = ((java.lang.Boolean) objAwait).booleanValue();
                        xnq = mutex2;
                    }
                } else if (i2 == 3) {
                    Mutex mutex5 = (Mutex) refreshCoinsTask$refreshInternal$1.L$0;
                    C56391yDq.AEQbTJ(objAwait);
                    xnq = mutex5;
                    zBooleanValue = ((java.lang.Boolean) objAwait).booleanValue();
                    xnq = xnq;
                } else {
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Mutex mutex6 = (Mutex) refreshCoinsTask$refreshInternal$1.L$0;
                    C56391yDq.AEQbTJ(objAwait);
                    mutex2 = mutex6;
                    zBooleanValue = ((java.lang.Boolean) objAwait).booleanValue();
                    xnq = mutex2;
                }
            }
        } catch (CancellationException e2) {
            pUU.AEQbTJ("RefreshCoinsTask", "refresh: double-check refresh was cancelled", e2);
            xnq = xnq;
        }
        return C56443yFo.KWHzl(zBooleanValue);
    }

    public static final Unit KWHzl(CompletableDeferred completableDeferred, C54611xOu c54611xOu, xNQ xnq, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        pUU.KWHzl("RefreshCoinsTask", "refresh requestCoinsInfo: " + (responseData.getCode() == 0 && responseData.getData() != null) + "; " + ((responseData.getCode() != 0 || responseData.getData() == null) ? responseData.getMsg() : ""));
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            BuildersKt__Builders_commonKt.launch$default(C54585xNv.KWHzl.AhwBna(), null, null, new RefreshCoinsTask$refreshInternal$3$2$1$1(c54611xOu, responseData, xnq, completableDeferred, null), 3, null);
        } else {
            pUU.copydefault("RefreshCoinsTask", "withResp error: " + responseData.getMsg());
            completableDeferred.complete(java.lang.Boolean.FALSE);
            c54611xOu.OLrzqt = null;
        }
        return Unit.INSTANCE;
    }
}
