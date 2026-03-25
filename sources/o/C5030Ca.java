package o;

import aws.smithy.kotlin.runtime.http.operation.SdkHttpOperationKt$cleanup$1;
import aws.smithy.kotlin.runtime.http.operation.SdkHttpOperationKt$execute$$inlined$withSpan$1;
import aws.smithy.kotlin.runtime.http.operation.SdkHttpOperationKt$execute$1;
import aws.smithy.kotlin.runtime.http.operation.SdkHttpOperationKt$roundTrip$2;
import aws.smithy.kotlin.runtime.telemetry.trace.SpanStatus;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5030Ca {
    public static final java.lang.String OLrzqt(@NotNull DT dt) {
        Intrinsics.checkNotNullParameter(dt, "");
        return (java.lang.String) C58108yv.OLrzqt(dt, BC.copydefault.valueOf());
    }

    public static final <I, O> java.lang.Object EZpvd(@NotNull BY<I, O> by, @NotNull CG<? super BP<C5036Cg>, ? extends C58859zS> cg, I i, @NotNull Continuation<? super O> continuation) {
        return AEQbTJ(by, cg, i, new SdkHttpOperationKt$roundTrip$2(null), continuation);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:20:0x005a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:0x0106 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010b A[Catch: all -> 0x0104, TryCatch #2 {all -> 0x0104, blocks: (B:53:0x0107, B:55:0x010b, B:57:0x011d, B:56:0x0115, B:25:0x008d, B:27:0x009b, B:29:0x00a1, B:31:0x00a7, B:34:0x00af, B:39:0x00c7, B:35:0x00b5, B:38:0x00c5), top: B:68:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0115 A[Catch: all -> 0x0104, TryCatch #2 {all -> 0x0104, blocks: (B:53:0x0107, B:55:0x010b, B:57:0x011d, B:56:0x0115, B:25:0x008d, B:27:0x009b, B:29:0x00a1, B:31:0x00a7, B:34:0x00af, B:39:0x00c7, B:35:0x00b5, B:38:0x00c5), top: B:68:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [o.GU] */
    /* JADX WARN: Type inference failed for: r1v9, types: [o.GU] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, o.GU] */
    /* JADX WARN: Type inference failed for: r4v8, types: [o.GU] */
    /* JADX WARN: Type inference failed for: r4v9, types: [o.GU] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <I, O, R> java.lang.Object AEQbTJ(@NotNull BY<I, O> by, @NotNull CG<? super BP<C5036Cg>, ? extends C58859zS> cg, I i, @NotNull Function2<? super O, ? super Continuation<? super R>, ? extends java.lang.Object> function2, @NotNull Continuation<? super R> continuation) throws java.lang.Throwable {
        SdkHttpOperationKt$execute$1 sdkHttpOperationKt$execute$1;
        BY<I, O> by2;
        ?? r1;
        GU guComponent1;
        CoroutineContext c5140Gg;
        FZ fzAEQbTJ;
        InterfaceC5135Gb interfaceC5135GbOLrzqt;
        ?? r4;
        BY<I, O> by3 = by;
        if (continuation instanceof SdkHttpOperationKt$execute$1) {
            sdkHttpOperationKt$execute$1 = (SdkHttpOperationKt$execute$1) continuation;
            int i2 = sdkHttpOperationKt$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdkHttpOperationKt$execute$1.label = i2 - Integer.MIN_VALUE;
            } else {
                sdkHttpOperationKt$execute$1 = new SdkHttpOperationKt$execute$1(continuation);
            }
        }
        java.lang.Object objWithContext = sdkHttpOperationKt$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        ?? r42 = sdkHttpOperationKt$execute$1.label;
        try {
            if (r42 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CG cgKWHzl = C5031Cb.KWHzl(by.copydefault(), cg, by3);
                BP bp = new BP(by.KWHzl(), i);
                kotlin.Pair<GU, CoroutineContext> pairOLrzqt = BQ.OLrzqt(by);
                guComponent1 = pairOLrzqt.component1();
                CoroutineContext coroutineContextComponent2 = pairOLrzqt.component2();
                try {
                    FY fy = (FY) sdkHttpOperationKt$execute$1.getContext().get(FY.KWHzl);
                    FW fwOLrzqt = (fy == null || (fzAEQbTJ = fy.AEQbTJ()) == null || (interfaceC5135GbOLrzqt = fzAEQbTJ.OLrzqt()) == null) ? null : interfaceC5135GbOLrzqt.OLrzqt();
                    if (fwOLrzqt != null) {
                        c5140Gg = new C5140Gg(fwOLrzqt);
                    } else {
                        c5140Gg = (C5140Gg) sdkHttpOperationKt$execute$1.getContext().get(C5140Gg.EZpvd);
                        if (c5140Gg == null) {
                            c5140Gg = EmptyCoroutineContext.INSTANCE;
                        }
                    }
                    CoroutineContext coroutineContextPlus = coroutineContextComponent2.plus(new GW(guComponent1)).plus(c5140Gg);
                    SdkHttpOperationKt$execute$$inlined$withSpan$1 sdkHttpOperationKt$execute$$inlined$withSpan$1 = new SdkHttpOperationKt$execute$$inlined$withSpan$1(guComponent1, null, cgKWHzl, bp, function2);
                    sdkHttpOperationKt$execute$1.L$0 = by3;
                    sdkHttpOperationKt$execute$1.L$1 = guComponent1;
                    sdkHttpOperationKt$execute$1.label = 1;
                    objWithContext = BuildersKt.withContext(coroutineContextPlus, sdkHttpOperationKt$execute$$inlined$withSpan$1, sdkHttpOperationKt$execute$1);
                    r4 = guComponent1;
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                    r4.close();
                    DT dtKWHzl = by3.KWHzl();
                    sdkHttpOperationKt$execute$1.L$0 = objWithContext;
                    sdkHttpOperationKt$execute$1.L$1 = null;
                    sdkHttpOperationKt$execute$1.label = 2;
                    if (EZpvd(dtKWHzl, sdkHttpOperationKt$execute$1) != objCopydefault) {
                    }
                } catch (java.lang.Exception e) {
                    e = e;
                    if (e instanceof CancellationException) {
                        guComponent1.KWHzl(SpanStatus.ERROR);
                        GX.AEQbTJ(guComponent1, e, true);
                    } else {
                        GX.OLrzqt(guComponent1, "cancelled", C56443yFo.KWHzl(true));
                    }
                    throw e;
                }
            } else {
                if (r42 != 1) {
                    if (r42 == 2) {
                        java.lang.Object obj = sdkHttpOperationKt$execute$1.L$0;
                        C56391yDq.AEQbTJ(objWithContext);
                        return obj;
                    }
                    if (r42 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Throwable th = (java.lang.Throwable) sdkHttpOperationKt$execute$1.L$0;
                    C56391yDq.AEQbTJ(objWithContext);
                    throw th;
                }
                r1 = (GU) sdkHttpOperationKt$execute$1.L$1;
                by2 = (BY) sdkHttpOperationKt$execute$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objWithContext);
                    r4 = r1;
                    by3 = by2;
                    try {
                        r4.close();
                        DT dtKWHzl2 = by3.KWHzl();
                        sdkHttpOperationKt$execute$1.L$0 = objWithContext;
                        sdkHttpOperationKt$execute$1.L$1 = null;
                        sdkHttpOperationKt$execute$1.label = 2;
                        return EZpvd(dtKWHzl2, sdkHttpOperationKt$execute$1) != objCopydefault ? objCopydefault : objWithContext;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        by2 = by3;
                    }
                } catch (java.lang.Exception e2) {
                    e = e2;
                    guComponent1 = r1;
                    if (e instanceof CancellationException) {
                    }
                    throw e;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    try {
                        r1.close();
                        throw th;
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                    }
                }
            }
            java.lang.Throwable th5 = th;
            DT dtKWHzl3 = by2.KWHzl();
            sdkHttpOperationKt$execute$1.L$0 = th5;
            sdkHttpOperationKt$execute$1.L$1 = null;
            sdkHttpOperationKt$execute$1.label = 3;
            if (EZpvd(dtKWHzl3, sdkHttpOperationKt$execute$1) == objCopydefault) {
                return objCopydefault;
            }
            throw th5;
        } catch (java.lang.Throwable th6) {
            th = th6;
            by2 = by3;
            r1 = r42;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(DT dt, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        SdkHttpOperationKt$cleanup$1 sdkHttpOperationKt$cleanup$1;
        DT dt2;
        java.util.Iterator it;
        Job job;
        if (continuation instanceof SdkHttpOperationKt$cleanup$1) {
            sdkHttpOperationKt$cleanup$1 = (SdkHttpOperationKt$cleanup$1) continuation;
            int i = sdkHttpOperationKt$cleanup$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sdkHttpOperationKt$cleanup$1.label = i - Integer.MIN_VALUE;
            } else {
                sdkHttpOperationKt$cleanup$1 = new SdkHttpOperationKt$cleanup$1(continuation);
            }
        }
        java.lang.Object obj = sdkHttpOperationKt$cleanup$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = sdkHttpOperationKt$cleanup$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.List list = (java.util.List) dt.OLrzqt(BC.copydefault.copydefault());
            if (list != null) {
                dt2 = dt;
                it = list.iterator();
            }
            job = JobKt.getJob(dt.getCoroutineContext());
            sdkHttpOperationKt$cleanup$1.L$0 = null;
            sdkHttpOperationKt$cleanup$1.L$1 = null;
            sdkHttpOperationKt$cleanup$1.label = 2;
            if (JobKt.cancelAndJoin(job, sdkHttpOperationKt$cleanup$1) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return Unit.INSTANCE;
        }
        it = (java.util.Iterator) sdkHttpOperationKt$cleanup$1.L$1;
        dt2 = (DT) sdkHttpOperationKt$cleanup$1.L$0;
        C56391yDq.AEQbTJ(obj);
        while (it.hasNext()) {
            C58859zS c58859zS = (C58859zS) it.next();
            sdkHttpOperationKt$cleanup$1.L$0 = dt2;
            sdkHttpOperationKt$cleanup$1.L$1 = it;
            sdkHttpOperationKt$cleanup$1.label = 1;
            if (C58805zQ.EZpvd(c58859zS, sdkHttpOperationKt$cleanup$1) == objCopydefault) {
                return objCopydefault;
            }
        }
        dt = dt2;
        job = JobKt.getJob(dt.getCoroutineContext());
        sdkHttpOperationKt$cleanup$1.L$0 = null;
        sdkHttpOperationKt$cleanup$1.L$1 = null;
        sdkHttpOperationKt$cleanup$1.label = 2;
        if (JobKt.cancelAndJoin(job, sdkHttpOperationKt$cleanup$1) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
