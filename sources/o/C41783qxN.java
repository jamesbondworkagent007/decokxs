package o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qxN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41783qxN implements CoroutineContext.Element {
    public final CoroutineContext.TaskDescription<?> EZpvd = Application.KWHzl;
    public final ConcurrentHashMap<java.lang.String, Job> copydefault = new ConcurrentHashMap<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.TaskDescription<?> getKey() {
        return this.EZpvd;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.ActionBar.KWHzl(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.TaskDescription<E> taskDescription) {
        return (E) CoroutineContext.Element.ActionBar.AEQbTJ(this, taskDescription);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(@NotNull CoroutineContext.TaskDescription<?> taskDescription) {
        return CoroutineContext.Element.ActionBar.KWHzl(this, taskDescription);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.Element.ActionBar.AEQbTJ(this, coroutineContext);
    }

    /* JADX INFO: renamed from: o.qxN$Application */
    public static final class Application implements CoroutineContext.TaskDescription<C41783qxN> {
        public static final Application KWHzl = new Application();

        private Application() {
        }
    }

    public final Job OLrzqt(@NotNull final java.lang.String str, @NotNull final Job job) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(job, "");
        Job job2 = this.copydefault.get(str);
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.copydefault.put(str, job);
        job.invokeOnCompletion(new Function1() { // from class: o.qxM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41783qxN.OLrzqt(this.copydefault, str, job, (java.lang.Throwable) obj);
            }
        });
        return job;
    }

    public static final Unit OLrzqt(C41783qxN c41783qxN, java.lang.String str, Job job, java.lang.Throwable th) {
        c41783qxN.copydefault.remove(str, job);
        return Unit.INSTANCE;
    }

    public final Unit OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Job jobRemove = this.copydefault.remove(str);
        if (jobRemove == null) {
            return null;
        }
        Job.DefaultImpls.cancel$default(jobRemove, (CancellationException) null, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        java.util.Set<java.lang.String> setKeySet = this.copydefault.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "");
        java.util.Iterator it = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(setKeySet).iterator();
        while (it.hasNext()) {
            OLrzqt((java.lang.String) it.next());
        }
    }
}
