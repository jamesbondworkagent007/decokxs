package o;

import com.okinc.buysell.util.BannerPollingManager$startPolling$1;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lTY {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final CoroutineContext AEQbTJ;
    public Job KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public lTY() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public lTY(@NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        this.AEQbTJ = coroutineContext;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:kotlin.coroutines.CoroutineContext:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.coroutines.CoroutineContext:0x0004: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getIO():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:16)) : (r1v0 kotlin.coroutines.CoroutineContext))
 A[MD:(kotlin.coroutines.CoroutineContext):void (m)] (LINE:16) call: o.lTY.<init>(kotlin.coroutines.CoroutineContext):void type: THIS */
    public /* synthetic */ lTY(CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dispatchers.getIO() : coroutineContext);
    }

    public final void KWHzl(int i, @NotNull Function1<? super Continuation<? super Unit>, ? extends java.lang.Object> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Job job = this.KWHzl;
        if (job == null || !job.isActive()) {
            this.KWHzl = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.AEQbTJ), null, null, new BannerPollingManager$startPolling$1(function1, i, null), 3, null);
        }
    }

    public final void EZpvd() {
        Job job;
        Job job2 = this.KWHzl;
        if (job2 == null || !job2.isActive() || (job = this.KWHzl) == null) {
            return;
        }
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lTY.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
