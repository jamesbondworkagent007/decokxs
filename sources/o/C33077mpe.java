package o;

import com.okinc.core.common.OkRustFutureWrapper$exec$1;
import com.okinc.core.common.OkRustFutureWrapper$execute$2;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mpe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C33077mpe<T, E extends java.lang.Throwable> {
    public final Function0<T> AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final Function0<E> KWHzl;
    public final Function1<InterfaceC4440Bed, Unit> OLrzqt;
    public final Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object OLrzqt(@NotNull Continuation<? super T> continuation) {
        return OLrzqt(this, continuation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.Bed, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function0<? extends E extends java.lang.Throwable> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function0<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C33077mpe(@NotNull Function1<? super InterfaceC4440Bed, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Function0<? extends E> function02, @NotNull Function0<? extends T> function03, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = function1;
        this.copydefault = function0;
        this.KWHzl = function02;
        this.AEQbTJ = function03;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r7v0 kotlin.jvm.functions.Function1)
  (r8v0 kotlin.jvm.functions.Function0)
  (r9v0 kotlin.jvm.functions.Function0)
  (r10v0 kotlin.jvm.functions.Function0)
  (wrap:kotlinx.coroutines.CoroutineDispatcher:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0004: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getIO():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:30)) : (r11v0 kotlinx.coroutines.CoroutineDispatcher))
 A[MD:(kotlin.jvm.functions.Function1<? super o.Bed, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<? extends E extends java.lang.Throwable>, kotlin.jvm.functions.Function0<? extends T>, kotlinx.coroutines.CoroutineDispatcher):void (m)] (LINE:25) call: o.mpe.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlinx.coroutines.CoroutineDispatcher):void type: THIS */
    public /* synthetic */ C33077mpe(Function1 function1, Function0 function0, Function0 function02, Function0 function03, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, function0, function02, function03, (i & 16) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    /* JADX INFO: renamed from: o.mpe$ActionBar */
    public final class ActionBar implements InterfaceC4440Bed {
        public final /* synthetic */ C33077mpe<T, E> AEQbTJ;
        public final AtomicBoolean EZpvd;
        public final Function0<E> KWHzl;
        public final Function0<T> OLrzqt;
        public final Continuation<T> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends E extends java.lang.Throwable> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function0<? extends T> */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.coroutines.Continuation<? super T> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(@NotNull C33077mpe c33077mpe, @NotNull Function0<? extends E> function0, @NotNull Function0<? extends T> function02, Continuation<? super T> continuation) {
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            Intrinsics.checkNotNullParameter(continuation, "");
            this.AEQbTJ = c33077mpe;
            this.KWHzl = function0;
            this.OLrzqt = function02;
            this.copydefault = continuation;
            this.EZpvd = new AtomicBoolean(false);
        }

        @Override // o.InterfaceC4440Bed
        public void OLrzqt() {
            if (this.EZpvd.compareAndSet(false, true)) {
                try {
                    E eInvoke = this.KWHzl.invoke();
                    T tInvoke = this.OLrzqt.invoke();
                    if (eInvoke != null) {
                        Continuation<T> continuation = this.copydefault;
                        Result.Application application = Result.Companion;
                        continuation.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(eInvoke)));
                    } else if (tInvoke != null) {
                        Continuation<T> continuation2 = this.copydefault;
                        Result.Application application2 = Result.Companion;
                        continuation2.resumeWith(Result.m7377constructorimpl(tInvoke));
                    } else {
                        Continuation<T> continuation3 = this.copydefault;
                        Result.Application application3 = Result.Companion;
                        continuation3.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.IllegalStateException("No result returned from Rust future"))));
                    }
                } catch (java.lang.Throwable th) {
                    Continuation<T> continuation4 = this.copydefault;
                    Result.Application application4 = Result.Companion;
                    continuation4.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(th)));
                }
            }
        }
    }

    public static /* synthetic */ <T, E extends java.lang.Throwable> java.lang.Object OLrzqt(C33077mpe<T, ? extends E> c33077mpe, Continuation<? super T> continuation) {
        return BuildersKt.withContext(c33077mpe.EZpvd, new OkRustFutureWrapper$execute$2(c33077mpe, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Result<? extends T>> continuation) {
        OkRustFutureWrapper$exec$1 okRustFutureWrapper$exec$1;
        if (continuation instanceof OkRustFutureWrapper$exec$1) {
            okRustFutureWrapper$exec$1 = (OkRustFutureWrapper$exec$1) continuation;
            int i = okRustFutureWrapper$exec$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                okRustFutureWrapper$exec$1.label = i - Integer.MIN_VALUE;
            } else {
                okRustFutureWrapper$exec$1 = new OkRustFutureWrapper$exec$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = okRustFutureWrapper$exec$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = okRustFutureWrapper$exec$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                Result.Application application = Result.Companion;
                okRustFutureWrapper$exec$1.label = 1;
                objOLrzqt = OLrzqt(okRustFutureWrapper$exec$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            return Result.m7377constructorimpl(objOLrzqt);
        } catch (java.lang.IllegalStateException e) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(e));
        } catch (java.lang.Throwable th) {
            Result.Application application3 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
