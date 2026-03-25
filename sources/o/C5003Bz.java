package o;

import aws.smithy.kotlin.runtime.http.middleware.RetryMiddleware$handle$$inlined$withSpan$default$1;
import aws.smithy.kotlin.runtime.http.middleware.RetryMiddleware$handle$1;
import aws.smithy.kotlin.runtime.http.middleware.RetryMiddleware$handle$result$outcome$1;
import aws.smithy.kotlin.runtime.http.middleware.RetryMiddleware$tryAttempt$1;
import aws.smithy.kotlin.runtime.telemetry.trace.SpanKind;
import aws.smithy.kotlin.runtime.telemetry.trace.SpanStatus;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Bz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5003Bz<I, O> implements InterfaceC5075Dt<BP<C5036Cg>, O> {
    public final C4706Bo<I, O> KWHzl;
    public final DW OLrzqt;
    public final InterfaceC5093El<O> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.El<? super O> */
    /* JADX WARN: Multi-variable type inference failed */
    public C5003Bz(@NotNull DW dw, @NotNull InterfaceC5093El<? super O> interfaceC5093El, @NotNull C4706Bo<I, O> c4706Bo) {
        Intrinsics.checkNotNullParameter(dw, "");
        Intrinsics.checkNotNullParameter(interfaceC5093El, "");
        Intrinsics.checkNotNullParameter(c4706Bo, "");
        this.OLrzqt = dw;
        this.copydefault = interfaceC5093El;
        this.KWHzl = c4706Bo;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lo/CG;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0173 A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:14:0x0033, B:62:0x016f, B:64:0x0173, B:66:0x0185, B:65:0x017d), top: B:72:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017d A[Catch: all -> 0x0038, TryCatch #2 {all -> 0x0038, blocks: (B:14:0x0033, B:62:0x016f, B:64:0x0173, B:66:0x0185, B:65:0x017d), top: B:72:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC5075Dt
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <H extends CG<? super BP<C5036Cg>, ? extends O>> java.lang.Object EZpvd(@NotNull BP<C5036Cg> bp, @NotNull H h, @NotNull Continuation<? super O> continuation) throws java.lang.Throwable {
        RetryMiddleware$handle$1 retryMiddleware$handle$1;
        BP<C5036Cg> bp2;
        C5003Bz<I, O> c5003Bz;
        CG cg;
        GU guEZpvd;
        GU gu;
        CoroutineContext c5140Gg;
        FZ fzAEQbTJ;
        InterfaceC5135Gb interfaceC5135GbOLrzqt;
        java.lang.Object objAEQbTJ;
        if (continuation instanceof RetryMiddleware$handle$1) {
            retryMiddleware$handle$1 = (RetryMiddleware$handle$1) continuation;
            int i = retryMiddleware$handle$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                retryMiddleware$handle$1.label = i - Integer.MIN_VALUE;
            } else {
                retryMiddleware$handle$1 = new RetryMiddleware$handle$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = retryMiddleware$handle$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = retryMiddleware$handle$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C4706Bo<I, O> c4706Bo = this.KWHzl;
            InterfaceC5037Ch interfaceC5037ChOLrzqt = C5034Ce.OLrzqt(bp.EZpvd(), true);
            retryMiddleware$handle$1.L$0 = this;
            bp2 = bp;
            retryMiddleware$handle$1.L$1 = bp2;
            retryMiddleware$handle$1.L$2 = h;
            retryMiddleware$handle$1.label = 1;
            objEZpvd = c4706Bo.EZpvd(interfaceC5037ChOLrzqt, (Continuation<? super InterfaceC5037Ch>) retryMiddleware$handle$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c5003Bz = this;
            cg = h;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objEZpvd);
                    objAEQbTJ = DX.AEQbTJ((DQ) objEZpvd);
                    C56391yDq.AEQbTJ(objAEQbTJ);
                    return objAEQbTJ;
                }
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gu = (GU) retryMiddleware$handle$1.L$0;
                try {
                    try {
                        C56391yDq.AEQbTJ(objEZpvd);
                        gu.close();
                        objAEQbTJ = ((Result) objEZpvd).m7386unboximpl();
                        C56391yDq.AEQbTJ(objAEQbTJ);
                        return objAEQbTJ;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        guEZpvd = gu;
                        guEZpvd.close();
                        throw th;
                    }
                } catch (java.lang.Exception e) {
                    e = e;
                    if (e instanceof CancellationException) {
                        gu.KWHzl(SpanStatus.ERROR);
                        GX.AEQbTJ(gu, e, true);
                    } else {
                        GX.OLrzqt(gu, "cancelled", C56443yFo.KWHzl(true));
                    }
                    throw e;
                }
            }
            CG cg2 = (CG) retryMiddleware$handle$1.L$2;
            bp2 = (BP) retryMiddleware$handle$1.L$1;
            C5003Bz<I, O> c5003Bz2 = (C5003Bz) retryMiddleware$handle$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            cg = cg2;
            c5003Bz = c5003Bz2;
        }
        BP bpCopy$default = BP.copy$default(bp2, null, C5043Cn.EZpvd((InterfaceC5037Ch) objEZpvd), 1, null);
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 1;
        if (C4976By.KWHzl((C5036Cg) bpCopy$default.EZpvd())) {
            C4922Bw c4922Bw = new C4922Bw(c5003Bz.copydefault, retryMiddleware$handle$1.getContext());
            DW dw = c5003Bz.OLrzqt;
            RetryMiddleware$handle$result$outcome$1 retryMiddleware$handle$result$outcome$1 = new RetryMiddleware$handle$result$outcome$1(intRef, bpCopy$default, c5003Bz, cg, null);
            retryMiddleware$handle$1.L$0 = null;
            retryMiddleware$handle$1.L$1 = null;
            retryMiddleware$handle$1.L$2 = null;
            retryMiddleware$handle$1.label = 2;
            objEZpvd = dw.KWHzl(c4922Bw, retryMiddleware$handle$result$outcome$1, retryMiddleware$handle$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            objAEQbTJ = DX.AEQbTJ((DQ) objEZpvd);
            C56391yDq.AEQbTJ(objAEQbTJ);
            return objAEQbTJ;
        }
        InterfaceC57843yq interfaceC57843yqCopydefault = C58108yv.copydefault();
        SpanKind spanKind = SpanKind.INTERNAL;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        java.lang.String strGEmmrt = C56524yIo.AEQbTJ(C5003Bz.class).gEmmrt();
        if (strGEmmrt == null) {
            throw new java.lang.IllegalArgumentException("withSpan<T> cannot be used on an anonymous object".toString());
        }
        guEZpvd = FX.KWHzl(retryMiddleware$handle$1.getContext()).copydefault().EZpvd(strGEmmrt).EZpvd("Non-retryable attempt", interfaceC57843yqCopydefault, spanKind, C5143Gj.EZpvd(retryMiddleware$handle$1.getContext()));
        try {
            FY fy = (FY) retryMiddleware$handle$1.getContext().get(FY.KWHzl);
            FW fwOLrzqt = (fy == null || (fzAEQbTJ = fy.AEQbTJ()) == null || (interfaceC5135GbOLrzqt = fzAEQbTJ.OLrzqt()) == null) ? null : interfaceC5135GbOLrzqt.OLrzqt();
            if (fwOLrzqt != null) {
                c5140Gg = new C5140Gg(fwOLrzqt);
            } else {
                c5140Gg = (C5140Gg) retryMiddleware$handle$1.getContext().get(C5140Gg.EZpvd);
                if (c5140Gg == null) {
                    c5140Gg = emptyCoroutineContext;
                }
            }
            CoroutineContext coroutineContextPlus = emptyCoroutineContext.plus(new GW(guEZpvd)).plus(c5140Gg);
            RetryMiddleware$handle$$inlined$withSpan$default$1 retryMiddleware$handle$$inlined$withSpan$default$1 = new RetryMiddleware$handle$$inlined$withSpan$default$1(guEZpvd, null, c5003Bz, bpCopy$default, cg, intRef);
            retryMiddleware$handle$1.L$0 = guEZpvd;
            retryMiddleware$handle$1.L$1 = null;
            retryMiddleware$handle$1.L$2 = null;
            retryMiddleware$handle$1.label = 3;
            objEZpvd = BuildersKt.withContext(coroutineContextPlus, retryMiddleware$handle$$inlined$withSpan$default$1, retryMiddleware$handle$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            gu = guEZpvd;
            gu.close();
            objAEQbTJ = ((Result) objEZpvd).m7386unboximpl();
            C56391yDq.AEQbTJ(objAEQbTJ);
            return objAEQbTJ;
        } catch (java.lang.Exception e2) {
            e = e2;
            gu = guEZpvd;
            if (e instanceof CancellationException) {
            }
            throw e;
        } catch (java.lang.Throwable th2) {
            th = th2;
            guEZpvd.close();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(BP<C5036Cg> bp, CG<? super BP<C5036Cg>, ? extends O> cg, int i, Continuation<? super Result<? extends O>> continuation) throws java.lang.Throwable {
        RetryMiddleware$tryAttempt$1 retryMiddleware$tryAttempt$1;
        java.lang.Throwable th;
        C5003Bz<I, O> c5003Bz;
        java.lang.Object objM7377constructorimpl;
        int i2;
        C5003Bz<I, O> c5003Bz2;
        java.util.List listAhwBna;
        C58859zS c58859zS;
        InterfaceC5037Ch interfaceC5037ChImmutableView$default;
        java.lang.Object objKWHzl;
        if (continuation instanceof RetryMiddleware$tryAttempt$1) {
            retryMiddleware$tryAttempt$1 = (RetryMiddleware$tryAttempt$1) continuation;
            int i3 = retryMiddleware$tryAttempt$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                retryMiddleware$tryAttempt$1.label = i3 - Integer.MIN_VALUE;
            } else {
                retryMiddleware$tryAttempt$1 = new RetryMiddleware$tryAttempt$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = retryMiddleware$tryAttempt$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = retryMiddleware$tryAttempt$1.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            java.lang.Object objCopydefault2 = this.KWHzl.copydefault(C5034Ce.immutableView$default(bp.EZpvd(), false, 1, null));
            if (Result.m7384isSuccessimpl(objCopydefault2)) {
                try {
                    Result.Application application = Result.Companion;
                    retryMiddleware$tryAttempt$1.L$0 = this;
                    retryMiddleware$tryAttempt$1.L$1 = bp;
                    retryMiddleware$tryAttempt$1.I$0 = i;
                    retryMiddleware$tryAttempt$1.label = 1;
                    objOLrzqt = cg.OLrzqt(bp, retryMiddleware$tryAttempt$1);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    c5003Bz = this;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    c5003Bz = this;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            } else {
                objM7377constructorimpl = Result.m7377constructorimpl(objCopydefault2);
                i2 = i;
                c5003Bz2 = this;
                listAhwBna = (java.util.List) bp.OLrzqt().OLrzqt(BC.copydefault.copydefault());
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
                c58859zS = (C58859zS) CollectionsKt___CollectionsKt.AkhnZx(listAhwBna, i2 - 1);
                interfaceC5037ChImmutableView$default = C5034Ce.immutableView$default(bp.EZpvd(), false, 1, null);
                C4706Bo<I, O> c4706Bo = c5003Bz2.KWHzl;
                InterfaceC5039Cj interfaceC5039CjAEQbTJ = c58859zS == null ? c58859zS.AEQbTJ() : null;
                retryMiddleware$tryAttempt$1.L$0 = c5003Bz2;
                retryMiddleware$tryAttempt$1.L$1 = c58859zS;
                retryMiddleware$tryAttempt$1.L$2 = interfaceC5037ChImmutableView$default;
                retryMiddleware$tryAttempt$1.label = 2;
                objKWHzl = c4706Bo.KWHzl(objM7377constructorimpl, interfaceC5037ChImmutableView$default, interfaceC5039CjAEQbTJ, retryMiddleware$tryAttempt$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                c5003Bz2.KWHzl.copydefault(objKWHzl, interfaceC5037ChImmutableView$default, c58859zS != null ? c58859zS.AEQbTJ() : null);
                return objKWHzl;
            }
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC5037ChImmutableView$default = (InterfaceC5037Ch) retryMiddleware$tryAttempt$1.L$2;
                c58859zS = (C58859zS) retryMiddleware$tryAttempt$1.L$1;
                c5003Bz2 = (C5003Bz) retryMiddleware$tryAttempt$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                objKWHzl = ((Result) objOLrzqt).m7386unboximpl();
                c5003Bz2.KWHzl.copydefault(objKWHzl, interfaceC5037ChImmutableView$default, c58859zS != null ? c58859zS.AEQbTJ() : null);
                return objKWHzl;
            }
            i = retryMiddleware$tryAttempt$1.I$0;
            bp = (BP) retryMiddleware$tryAttempt$1.L$1;
            c5003Bz = (C5003Bz) retryMiddleware$tryAttempt$1.L$0;
            try {
                C56391yDq.AEQbTJ(objOLrzqt);
            } catch (java.lang.Throwable th3) {
                th = th3;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl(objOLrzqt);
        int i5 = i;
        c5003Bz2 = c5003Bz;
        i2 = i5;
        listAhwBna = (java.util.List) bp.OLrzqt().OLrzqt(BC.copydefault.copydefault());
        if (listAhwBna == null) {
        }
        c58859zS = (C58859zS) CollectionsKt___CollectionsKt.AkhnZx(listAhwBna, i2 - 1);
        interfaceC5037ChImmutableView$default = C5034Ce.immutableView$default(bp.EZpvd(), false, 1, null);
        C4706Bo<I, O> c4706Bo2 = c5003Bz2.KWHzl;
        if (c58859zS == null) {
        }
        retryMiddleware$tryAttempt$1.L$0 = c5003Bz2;
        retryMiddleware$tryAttempt$1.L$1 = c58859zS;
        retryMiddleware$tryAttempt$1.L$2 = interfaceC5037ChImmutableView$default;
        retryMiddleware$tryAttempt$1.label = 2;
        objKWHzl = c4706Bo2.KWHzl(objM7377constructorimpl, interfaceC5037ChImmutableView$default, interfaceC5039CjAEQbTJ, retryMiddleware$tryAttempt$1);
        if (objKWHzl == objCopydefault) {
        }
        c5003Bz2.KWHzl.copydefault(objKWHzl, interfaceC5037ChImmutableView$default, c58859zS != null ? c58859zS.AEQbTJ() : null);
        return objKWHzl;
    }
}
