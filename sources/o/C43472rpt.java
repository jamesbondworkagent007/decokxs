package o;

import com.okinc.network.util.SimpleTicker$startTimer$1;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rpt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43472rpt {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public Job OLrzqt;
    public final CoroutineScope copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C43472rpt() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C43472rpt(@NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.copydefault = coroutineScope;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:kotlinx.coroutines.CoroutineScope:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineScope:0x0011: INVOKE 
  (wrap:kotlin.coroutines.CoroutineContext:0x000d: INVOKE 
  (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0004: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getIO():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:18))
  (wrap:kotlinx.coroutines.CompletableJob:0x0009: INVOKE 
  (wrap:kotlinx.coroutines.Job:?: CAST (kotlinx.coroutines.Job) (null kotlinx.coroutines.Job))
  (1 int)
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (null java.lang.Object))
 STATIC call: kotlinx.coroutines.SupervisorKt.SupervisorJob$default(kotlinx.coroutines.Job, int, java.lang.Object):kotlinx.coroutines.CompletableJob A[MD:(kotlinx.coroutines.Job, int, java.lang.Object):kotlinx.coroutines.CompletableJob (m), WRAPPED])
 VIRTUAL call: o.yFa.plus(kotlin.coroutines.CoroutineContext):kotlin.coroutines.CoroutineContext A[MD:(kotlin.coroutines.CoroutineContext):kotlin.coroutines.CoroutineContext (m), WRAPPED] (LINE:18))
 STATIC call: kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlin.coroutines.CoroutineContext):kotlinx.coroutines.CoroutineScope A[MD:(kotlin.coroutines.CoroutineContext):kotlinx.coroutines.CoroutineScope (m), WRAPPED] (LINE:18)) : (r1v0 kotlinx.coroutines.CoroutineScope))
 A[MD:(kotlinx.coroutines.CoroutineScope):void (m)] (LINE:17) call: o.rpt.<init>(kotlinx.coroutines.CoroutineScope):void type: THIS */
    public /* synthetic */ C43472rpt(CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null))) : coroutineScope);
    }

    /* JADX INFO: renamed from: o.rpt$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rpt.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void KWHzl(long j, @NotNull Function1<? super Continuation<? super Unit>, ? extends java.lang.Object> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (!OLrzqt()) {
            this.OLrzqt = BuildersKt__Builders_commonKt.launch$default(this.copydefault, null, null, new SimpleTicker$startTimer$1(function1, j, null), 3, null);
            pUU.KWHzl("SimpleTicker", "Timer started with interval: " + j + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
            return;
        }
        pUU.EZpvd("SimpleTicker", "Timer is already running");
    }

    public final void EZpvd() {
        Job job = this.OLrzqt;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.OLrzqt = null;
        pUU.KWHzl("SimpleTicker", "Timer stopped");
    }

    public final boolean OLrzqt() {
        Job job = this.OLrzqt;
        return job != null && job.isActive();
    }
}
