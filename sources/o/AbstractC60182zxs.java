package o;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC60182zxs;
import o.InterfaceC60177zxn;
import org.jetbrains.annotations.NotNull;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: renamed from: o.zxs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC60182zxs implements InterfaceC60170zxg, java.lang.AutoCloseable {
    public static final int $stable = 8;
    private final AtomicLong callCounter;
    private final InterfaceC60177zxn.TaskDescription cleanable;
    private final Function2<java.lang.Long, UniffiRustCallStatus, java.lang.Long> cloneHandleFn;
    private final Function2<java.lang.Long, UniffiRustCallStatus, Unit> freeHandle;
    private final long handle;
    private final RustBuffer rustBuffer;
    private final AtomicBoolean wasDestroyed;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC60177zxn.TaskDescription getCleanable() {
        return this.cleanable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getHandle() {
        return this.handle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RustBuffer getRustBuffer() {
        return this.rustBuffer;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Long, ? super uniffi.UniffiRustCallStatus, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Long, ? super uniffi.UniffiRustCallStatus, java.lang.Long> */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC60182zxs(long j, @NotNull InterfaceC60177zxn interfaceC60177zxn, @NotNull RustBuffer rustBuffer, @NotNull Function2<? super java.lang.Long, ? super UniffiRustCallStatus, Unit> function2, @NotNull Function2<? super java.lang.Long, ? super UniffiRustCallStatus, java.lang.Long> function22) {
        Intrinsics.checkNotNullParameter(interfaceC60177zxn, "");
        Intrinsics.checkNotNullParameter(rustBuffer, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function22, "");
        this.handle = j;
        this.rustBuffer = rustBuffer;
        this.freeHandle = function2;
        this.cloneHandleFn = function22;
        this.cleanable = interfaceC60177zxn.OLrzqt(this, new StateListAnimator(j, rustBuffer, function2));
        this.wasDestroyed = new AtomicBoolean(false);
        this.callCounter = new AtomicLong(1L);
    }

    @Override // o.InterfaceC60170zxg
    public void destroy() {
        if (this.wasDestroyed.compareAndSet(false, true) && this.callCounter.decrementAndGet() == 0) {
            this.cleanable.AEQbTJ();
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            destroy();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r7.callCounter.decrementAndGet() == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        r7.cleanable.AEQbTJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        throw r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <R> R callWithHandle$OKCore_deploy(@NotNull Function1<? super java.lang.Long, ? extends R> function1) {
        long j;
        Intrinsics.checkNotNullParameter(function1, "");
        do {
            j = this.callCounter.get();
            if (j == 0) {
                throw new java.lang.IllegalStateException(getClass().getSimpleName() + " object has already been destroyed");
            }
            if (j == Long.MAX_VALUE) {
                throw new java.lang.IllegalStateException(getClass().getSimpleName() + " call counter would overflow");
            }
        } while (!this.callCounter.compareAndSet(j, 1 + j));
        return function1.invoke(java.lang.Long.valueOf(uniffiCloneHandle()));
    }

    /* JADX INFO: renamed from: o.zxs$StateListAnimator */
    public static final class StateListAnimator implements java.lang.Runnable {
        public final long AEQbTJ;
        public final RustBuffer EZpvd;
        public final Function2<java.lang.Long, UniffiRustCallStatus, Unit> OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Long, ? super uniffi.UniffiRustCallStatus, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(long j, @NotNull RustBuffer rustBuffer, @NotNull Function2<? super java.lang.Long, ? super UniffiRustCallStatus, Unit> function2) {
            Intrinsics.checkNotNullParameter(rustBuffer, "");
            Intrinsics.checkNotNullParameter(function2, "");
            this.AEQbTJ = j;
            this.EZpvd = rustBuffer;
            this.OLrzqt = function2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.AEQbTJ == 0) {
                return;
            }
            C60173zxj.uniffiRustCall(this.EZpvd, new Function1() { // from class: o.zxv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC60182zxs.StateListAnimator.run$lambda$0(this.EZpvd, (UniffiRustCallStatus) obj);
                }
            });
        }

        public static final Unit run$lambda$0(StateListAnimator stateListAnimator, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            stateListAnimator.OLrzqt.invoke(java.lang.Long.valueOf(stateListAnimator.AEQbTJ), uniffiRustCallStatus);
            return Unit.INSTANCE;
        }
    }

    public final long uniffiCloneHandle() throws InternalException {
        if (this.handle == 0) {
            throw new InternalException("uniffiCloneHandle() called on NoHandle object");
        }
        return ((java.lang.Number) C60173zxj.uniffiRustCall(this.rustBuffer, new Function1() { // from class: o.zxt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(AbstractC60182zxs.uniffiCloneHandle$lambda$0(this.KWHzl, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long uniffiCloneHandle$lambda$0(AbstractC60182zxs abstractC60182zxs, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return abstractC60182zxs.cloneHandleFn.invoke(java.lang.Long.valueOf(abstractC60182zxs.handle), uniffiRustCallStatus).longValue();
    }
}
