package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import o.InterfaceC5148Go;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C58805zQ {
    public static final java.lang.Object EZpvd(@NotNull C58859zS c58859zS, @NotNull Continuation<? super Unit> continuation) {
        CoroutineContext.Element element = c58859zS.getCoroutineContext().get(Job.Key);
        CompletableJob completableJob = element instanceof CompletableJob ? (CompletableJob) element : null;
        if (completableJob == null) {
            return Unit.INSTANCE;
        }
        completableJob.complete();
        if (!completableJob.isCompleted()) {
            CoroutineContext coroutineContext = c58859zS.getCoroutineContext();
            java.lang.String strGEmmrt = C56524yIo.AEQbTJ(C58859zS.class).gEmmrt();
            if (strGEmmrt != null) {
                InterfaceC5148Go.TaskDescription.trace$default(C5141Gh.OLrzqt(coroutineContext, strGEmmrt), null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.http.HttpCallKt$complete$2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "cancelling in-flight call";
                    }
                }, 1, null);
                c58859zS.EZpvd();
            } else {
                throw new java.lang.IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
            }
        }
        java.lang.Object objJoin = completableJob.join(continuation);
        return objJoin == C56442yFn.copydefault() ? objJoin : Unit.INSTANCE;
    }
}
