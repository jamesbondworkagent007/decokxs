package aws.smithy.kotlin.runtime.http.middleware;

import aws.smithy.kotlin.runtime.telemetry.trace.SpanKind;
import aws.smithy.kotlin.runtime.telemetry.trace.SpanStatus;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import o.BP;
import o.C5003Bz;
import o.C5036Cg;
import o.C5140Gg;
import o.C5143Gj;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C56524yIo;
import o.C58108yv;
import o.CG;
import o.FW;
import o.FX;
import o.FY;
import o.FZ;
import o.GU;
import o.GW;
import o.GX;
import o.InterfaceC5135Gb;
import o.InterfaceC57843yq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [O] */
/* JADX INFO: loaded from: classes2.dex */
public final class RetryMiddleware$handle$result$outcome$1<O> extends SuspendLambda implements Function1<Continuation<? super O>, Object> {
    final /* synthetic */ Ref.IntRef $attempt;
    final /* synthetic */ BP<C5036Cg> $modified;

    /* JADX INFO: Incorrect field signature: TH; */
    final /* synthetic */ CG $next;
    Object L$0;
    int label;
    final /* synthetic */ C5003Bz<I, O> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/internal/Ref$IntRef;Lo/BP<Lo/Cg;>;Lo/Bz<TI;TO;>;TH;Lkotlin/coroutines/Continuation<-Laws/smithy/kotlin/runtime/http/middleware/RetryMiddleware$handle$result$outcome$1;>;)V */
    public RetryMiddleware$handle$result$outcome$1(Ref.IntRef intRef, BP bp, C5003Bz c5003Bz, CG cg, Continuation continuation) {
        super(1, continuation);
        this.$attempt = intRef;
        this.$modified = bp;
        this.this$0 = c5003Bz;
        this.$next = cg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new RetryMiddleware$handle$result$outcome$1(this.$attempt, this.$modified, this.this$0, this.$next, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super O> continuation) {
        return ((RetryMiddleware$handle$result$outcome$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:10:0x0017 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:37:0x00d1 */
    /* JADX DEBUG: Type inference failed for r8v0. Raw type applied. Possible types: o.Bz<I, O>, o.Bz */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db A[Catch: all -> 0x0014, TryCatch #1 {all -> 0x0014, blocks: (B:6:0x000f, B:41:0x00d7, B:43:0x00db, B:45:0x00ed, B:44:0x00e5), top: B:51:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5 A[Catch: all -> 0x0014, TryCatch #1 {all -> 0x0014, blocks: (B:6:0x000f, B:41:0x00d7, B:43:0x00db, B:45:0x00ed, B:44:0x00e5), top: B:51:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [o.GU] */
    /* JADX WARN: Type inference failed for: r0v13, types: [o.GU] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [o.GU] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [o.GU] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object, o.GU] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Throwable th;
        ?? EZpvd;
        ?? r0;
        Exception e;
        CoroutineContext c5140Gg;
        ?? r02;
        FZ fzAEQbTJ;
        InterfaceC5135Gb interfaceC5135GbOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r0 = (GU) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    r02 = r0;
                    r02.close();
                    return obj;
                } catch (Exception e2) {
                    e = e2;
                    if (e instanceof CancellationException) {
                        r0.KWHzl(SpanStatus.ERROR);
                        GX.AEQbTJ(r0, e, true);
                    } else {
                        GX.OLrzqt(r0, "cancelled", C56443yFo.KWHzl(true));
                    }
                    throw e;
                }
            }
            C56391yDq.AEQbTJ(obj);
            String str = "Attempt-" + this.$attempt.element;
            Ref.IntRef intRef = this.$attempt;
            BP<C5036Cg> bp = this.$modified;
            C5003Bz c5003Bz = this.this$0;
            CG cg = this.$next;
            InterfaceC57843yq interfaceC57843yqCopydefault = C58108yv.copydefault();
            SpanKind spanKind = SpanKind.INTERNAL;
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
            String strGEmmrt = C56524yIo.AEQbTJ(C5003Bz.class).gEmmrt();
            if (strGEmmrt == null) {
                throw new IllegalArgumentException("withSpan<T> cannot be used on an anonymous object".toString());
            }
            EZpvd = FX.KWHzl(getContext()).copydefault().EZpvd(strGEmmrt).EZpvd(str, interfaceC57843yqCopydefault, spanKind, C5143Gj.EZpvd(getContext()));
            try {
                FY fy = (FY) getContext().get(FY.KWHzl);
                FW fwOLrzqt = (fy == null || (fzAEQbTJ = fy.AEQbTJ()) == null || (interfaceC5135GbOLrzqt = fzAEQbTJ.OLrzqt()) == null) ? null : interfaceC5135GbOLrzqt.OLrzqt();
                if (fwOLrzqt != null) {
                    c5140Gg = new C5140Gg(fwOLrzqt);
                } else {
                    c5140Gg = (C5140Gg) getContext().get(C5140Gg.EZpvd);
                    if (c5140Gg == null) {
                        c5140Gg = emptyCoroutineContext;
                    }
                }
                CoroutineContext coroutineContextPlus = emptyCoroutineContext.plus(new GW(EZpvd)).plus(c5140Gg);
                RetryMiddleware$handle$result$outcome$1$invokeSuspend$$inlined$withSpan$default$1 retryMiddleware$handle$result$outcome$1$invokeSuspend$$inlined$withSpan$default$1 = new RetryMiddleware$handle$result$outcome$1$invokeSuspend$$inlined$withSpan$default$1(EZpvd, null, intRef, bp, c5003Bz, cg);
                this.L$0 = EZpvd;
                this.label = 1;
                Object objWithContext = BuildersKt.withContext(coroutineContextPlus, retryMiddleware$handle$result$outcome$1$invokeSuspend$$inlined$withSpan$default$1, this);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                r02 = EZpvd;
                obj = objWithContext;
                r02.close();
                return obj;
            } catch (Exception e3) {
                r0 = EZpvd;
                e = e3;
                if (e instanceof CancellationException) {
                }
                throw e;
            } catch (Throwable th2) {
                th = th2;
                EZpvd.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            EZpvd = objCopydefault;
        }
    }
}
