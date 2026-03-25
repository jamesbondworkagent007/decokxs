package o;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import com.okinc.okrisk.collection.sensors.SensorCollectionManager$startCollectSensors$job$2;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tiz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47067tiz {
    public static final C47067tiz KWHzl = new C47067tiz();
    public static final AtomicReference<C47017tiB> EZpvd = new AtomicReference<>();
    public static final AtomicReference<Job> OLrzqt = new AtomicReference<>();
    public static final int copydefault = 8;

    private C47067tiz() {
    }

    public final void copydefault(@NotNull CoroutineScope coroutineScope, @NotNull android.hardware.SensorManager sensorManager, @NotNull C47064tiw c47064tiw, @NotNull Function1<? super C47017tiB, Unit> function1) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(sensorManager, "");
        Intrinsics.checkNotNullParameter(c47064tiw, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AtomicReference<Job> atomicReference = OLrzqt;
        Job job = atomicReference.get();
        if (job != null && job.isActive()) {
            KWHzl();
        }
        C47017tiB c47017tiB = new C47017tiB();
        final Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO().plus(new TaskDescription(CoroutineExceptionHandler.Key, c47017tiB)), null, new SensorCollectionManager$startCollectSensors$job$2(c47064tiw, c47017tiB, sensorManager, function1, null), 2, null);
        atomicReference.set(jobLaunch$default);
        jobLaunch$default.invokeOnCompletion(new Function1() { // from class: o.tiy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47067tiz.EZpvd(jobLaunch$default, (java.lang.Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o.tiz$TaskDescription */
    public static final class TaskDescription extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public final /* synthetic */ C47017tiB EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(CoroutineExceptionHandler.Key key, C47017tiB c47017tiB) {
            super(key);
            this.EZpvd = c47017tiB;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            C47067tiz.KWHzl.KWHzl(this.EZpvd);
        }
    }

    public static final Unit EZpvd(Job job, java.lang.Throwable th) {
        PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(OLrzqt, job, null);
        if (th != null) {
            boolean z = th instanceof CancellationException;
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        Job andSet = OLrzqt.getAndSet(null);
        if (andSet != null && andSet.isActive()) {
            JobKt__JobKt.cancel$default(andSet, "Manual stop requested", null, 2, null);
        }
        C47017tiB andSet2 = EZpvd.getAndSet(null);
        if (andSet2 != null) {
            KWHzl.KWHzl(andSet2);
        }
    }

    public final void KWHzl(C47017tiB c47017tiB) {
        try {
            c47017tiB.copydefault();
            PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(EZpvd, c47017tiB, null);
        } catch (java.lang.Exception unused) {
        }
    }
}
