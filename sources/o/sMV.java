package o;

import com.okinc.okimcore.feature.message.utility.PriorityTaskQueue$enqueueSuspend$2;
import com.okinc.okimcore.feature.message.utility.PriorityTaskQueue$init$1;
import com.okinc.okimcore.feature.message.utility.TaskPriority;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sMV {
    public final CoroutineDispatcher AEQbTJ;
    public final PriorityQueue<sMQ> AYXKKw;
    public CompletableDeferred<Unit> AhwBna;
    public final AtomicLong EZpvd;
    public final Mutex KWHzl;
    public final boolean OLrzqt;
    public final CoroutineDispatcher copydefault;
    public final java.lang.String gEmmrt;
    public final Function0<CoroutineScope> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriorityQueue<sMQ> OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CompletableDeferred<Unit> copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull CompletableDeferred<Unit> completableDeferred) {
        Intrinsics.checkNotNullParameter(completableDeferred, "");
        this.AhwBna = completableDeferred;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends kotlinx.coroutines.CoroutineScope> */
    /* JADX WARN: Multi-variable type inference failed */
    public sMV(@NotNull java.lang.String str, @NotNull Function0<? extends CoroutineScope> function0, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineDispatcher coroutineDispatcher2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
        this.gEmmrt = str;
        this.valueOf = function0;
        this.copydefault = coroutineDispatcher;
        this.AEQbTJ = coroutineDispatcher2;
        this.OLrzqt = z;
        this.AYXKKw = new PriorityQueue<>(new StateListAnimator(new ActionBar()));
        this.KWHzl = MutexKt.Mutex$default(false, 1, null);
        this.AhwBna = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.EZpvd = new AtomicLong(0L);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 kotlin.jvm.functions.Function0)
  (wrap:kotlinx.coroutines.CoroutineDispatcher:0x000f: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x000b: INVOKE 
  (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0007: INVOKE (wrap:o.sDN:0x0005: SGET  A[WRAPPED] (LINE:43) o.sDN.copydefault o.sDN) VIRTUAL call: o.sDN.copydefault():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:43))
  (5 int)
 VIRTUAL call: kotlinx.coroutines.CoroutineDispatcher.limitedParallelism(int):kotlinx.coroutines.CoroutineDispatcher A[MD:(int):kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:43)) : (r10v0 kotlinx.coroutines.CoroutineDispatcher))
  (wrap:kotlinx.coroutines.CoroutineDispatcher:0x001e: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x001a: INVOKE 
  (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0016: INVOKE (wrap:o.sDN:0x0014: SGET  A[WRAPPED] (LINE:44) o.sDN.copydefault o.sDN) VIRTUAL call: o.sDN.copydefault():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:44))
  (5 int)
 VIRTUAL call: kotlinx.coroutines.CoroutineDispatcher.limitedParallelism(int):kotlinx.coroutines.CoroutineDispatcher A[MD:(int):kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:44)) : (r11v0 kotlinx.coroutines.CoroutineDispatcher))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
 A[MD:(java.lang.String, kotlin.jvm.functions.Function0<? extends kotlinx.coroutines.CoroutineScope>, kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher, boolean):void (m)] (LINE:40) call: o.sMV.<init>(java.lang.String, kotlin.jvm.functions.Function0, kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher, boolean):void type: THIS */
    public /* synthetic */ sMV(java.lang.String str, Function0 function0, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function0, (i & 4) != 0 ? sDN.copydefault.copydefault().limitedParallelism(5) : coroutineDispatcher, (i & 8) != 0 ? sDN.copydefault.copydefault().limitedParallelism(5) : coroutineDispatcher2, (i & 16) != 0 ? false : z);
    }

    public final Job KWHzl() {
        return BuildersKt__Builders_commonKt.launch$default(C44157sFk.EZpvd(this.valueOf, this.gEmmrt), this.AEQbTJ, null, new PriorityTaskQueue$init$1(this, null), 2, null);
    }

    public static final class ActionBar<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(((sMQ) t).EZpvd().getValue()), java.lang.Integer.valueOf(((sMQ) t2).EZpvd().getValue()));
        }
    }

    public final java.lang.Object AEQbTJ(@NotNull TaskPriority taskPriority, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Job> continuation) {
        return CoroutineScopeKt.coroutineScope(new PriorityTaskQueue$enqueueSuspend$2(this, taskPriority, function2, null), continuation);
    }

    public static final class StateListAnimator<T> implements java.util.Comparator {
        public final /* synthetic */ java.util.Comparator copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(java.util.Comparator comparator) {
            this.copydefault = comparator;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.copydefault.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            return yET.KWHzl(java.lang.Long.valueOf(((sMQ) t).copydefault()), java.lang.Long.valueOf(((sMQ) t2).copydefault()));
        }
    }
}
