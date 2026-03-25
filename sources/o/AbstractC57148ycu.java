package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ycu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC57148ycu {
    public final CoroutineDispatcher AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final CoroutineScope KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final C57138yck copydefault;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57138yck EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoroutineDispatcher KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoroutineScope copydefault() {
        return this.KWHzl;
    }

    public abstract void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    public AbstractC57148ycu(@NotNull java.lang.String str, @NotNull C57138yck c57138yck, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineDispatcher coroutineDispatcher2, @NotNull CoroutineDispatcher coroutineDispatcher3, @NotNull CoroutineExceptionHandler coroutineExceptionHandler) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c57138yck, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher3, "");
        Intrinsics.checkNotNullParameter(coroutineExceptionHandler, "");
        this.gEmmrt = str;
        this.copydefault = c57138yck;
        this.OLrzqt = coroutineDispatcher;
        this.EZpvd = coroutineDispatcher2;
        this.AEQbTJ = coroutineDispatcher3;
        this.KWHzl = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher).plus(coroutineExceptionHandler));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002e: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 o.yck)
  (wrap:kotlinx.coroutines.CoroutineDispatcher:0x000c: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0008: INVOKE 
  (wrap:kotlinx.coroutines.MainCoroutineDispatcher:0x0004: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getMain():kotlinx.coroutines.MainCoroutineDispatcher A[MD:():kotlinx.coroutines.MainCoroutineDispatcher (m), WRAPPED] (LINE:17))
 VIRTUAL call: kotlinx.coroutines.MainCoroutineDispatcher.getImmediate():kotlinx.coroutines.MainCoroutineDispatcher A[MD:():kotlinx.coroutines.MainCoroutineDispatcher (m), WRAPPED] (LINE:17)) : (r10v0 kotlinx.coroutines.CoroutineDispatcher))
  (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0015: TERNARY null = ((wrap:int:0x000d: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0011: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getDefault():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:18)) : (r11v0 kotlinx.coroutines.CoroutineDispatcher))
  (wrap:kotlinx.coroutines.CoroutineDispatcher:0x001e: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x001a: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getIO():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:19)) : (r12v0 kotlinx.coroutines.CoroutineDispatcher))
  (wrap:kotlinx.coroutines.CoroutineExceptionHandler:?: TERNARY null = ((wrap:int:0x001f: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineExceptionHandler:0x0027: CONSTRUCTOR 
  (wrap:kotlinx.coroutines.CoroutineExceptionHandler$Key:0x0025: SGET  A[WRAPPED] kotlinx.coroutines.CoroutineExceptionHandler.Key kotlinx.coroutines.CoroutineExceptionHandler$Key)
  (r8v0 java.lang.String)
 A[MD:(kotlinx.coroutines.CoroutineExceptionHandler$Key, java.lang.String):void (m), WRAPPED] (LINE:30) call: o.ycu.TaskDescription.<init>(kotlinx.coroutines.CoroutineExceptionHandler$Key, java.lang.String):void type: CONSTRUCTOR) : (r13v0 kotlinx.coroutines.CoroutineExceptionHandler))
 A[MD:(java.lang.String, o.yck, kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineExceptionHandler):void (m)] (LINE:14) call: o.ycu.<init>(java.lang.String, o.yck, kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineExceptionHandler):void type: THIS */
    public /* synthetic */ AbstractC57148ycu(java.lang.String str, C57138yck c57138yck, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineExceptionHandler coroutineExceptionHandler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c57138yck, (i & 4) != 0 ? Dispatchers.getMain().getImmediate() : coroutineDispatcher, (i & 8) != 0 ? Dispatchers.getDefault() : coroutineDispatcher2, (i & 16) != 0 ? Dispatchers.getIO() : coroutineDispatcher3, (i & 32) != 0 ? new TaskDescription(CoroutineExceptionHandler.Key, str) : coroutineExceptionHandler);
    }

    /* JADX INFO: renamed from: o.ycu$TaskDescription */
    public static final class TaskDescription extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public final /* synthetic */ java.lang.String AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(CoroutineExceptionHandler.Key key, java.lang.String str) {
            super(key);
            this.AEQbTJ = str;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            pUU.AEQbTJ("Handler", "Throwable caught when handling " + this.AEQbTJ, th);
        }
    }
}
