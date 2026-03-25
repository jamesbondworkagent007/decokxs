package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.An, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3497An {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [30=5] */
    public static final CoroutineContext copydefault(@NotNull InterfaceC3972Aw interfaceC3972Aw, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(interfaceC3972Aw, "");
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        CompletableJob completableJobJob = JobKt.Job((Job) interfaceC3972Aw.getCoroutineContext().get(Job.Key));
        CoroutineContext coroutineContextPlus = interfaceC3972Aw.getCoroutineContext().plus(completableJobJob).plus(new CoroutineName("call-context")).plus(new FY(FX.KWHzl(coroutineContext))).plus(new C5145Gl((java.util.Map<java.lang.String, ? extends java.lang.Object>) C5141Gh.AEQbTJ(coroutineContext)));
        FW fwEZpvd = C5143Gj.EZpvd(coroutineContext);
        CoroutineContext coroutineContextPlus2 = coroutineContextPlus.plus(fwEZpvd != null ? new C5140Gg(fwEZpvd) : EmptyCoroutineContext.INSTANCE);
        AEQbTJ(coroutineContext, completableJobJob);
        return coroutineContextPlus2;
    }

    public static final void AEQbTJ(CoroutineContext coroutineContext, final Job job) {
        Job job2 = (Job) coroutineContext.get(Job.Key);
        if (job2 == null) {
            return;
        }
        final DisposableHandle disposableHandleInvokeOnCompletion$default = Job.DefaultImpls.invokeOnCompletion$default(job2, true, false, new Function1<java.lang.Throwable, Unit>() { // from class: aws.smithy.kotlin.runtime.http.engine.CoroutineUtilsKt$attachToOuterJob$cleanupHandler$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                if (th == null) {
                    return;
                }
                job.cancel(ExceptionsKt.CancellationException(th.getMessage(), th));
            }
        }, 2, null);
        job.invokeOnCompletion(new Function1<java.lang.Throwable, Unit>() { // from class: aws.smithy.kotlin.runtime.http.engine.CoroutineUtilsKt$attachToOuterJob$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                disposableHandleInvokeOnCompletion$default.dispose();
            }
        });
    }

    public static final java.lang.Object EZpvd(@NotNull Continuation<? super CoroutineContext> continuation) {
        CoroutineContext.Element element = continuation.getContext().get(AF.OLrzqt);
        Intrinsics.copydefault(element);
        return ((AF) element).copydefault();
    }
}
