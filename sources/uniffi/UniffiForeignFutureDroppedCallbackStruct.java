package uniffi;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Structure.FieldOrder({"handle", "free"})
public class UniffiForeignFutureDroppedCallbackStruct extends Structure {
    public static final int $stable = 8;
    public UniffiForeignFutureDroppedCallback free;
    public long handle;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiForeignFutureDroppedCallbackStruct() {
        this(0L, null, 3, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r1v0 long))
  (wrap:uniffi.UniffiForeignFutureDroppedCallback:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiForeignFutureDroppedCallback) : (r3v0 uniffi.UniffiForeignFutureDroppedCallback))
 A[MD:(long, uniffi.UniffiForeignFutureDroppedCallback):void (m)] (LINE:440) call: uniffi.UniffiForeignFutureDroppedCallbackStruct.<init>(long, uniffi.UniffiForeignFutureDroppedCallback):void type: THIS */
    public /* synthetic */ UniffiForeignFutureDroppedCallbackStruct(long j, UniffiForeignFutureDroppedCallback uniffiForeignFutureDroppedCallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : uniffiForeignFutureDroppedCallback);
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class UniffiByValue extends UniffiForeignFutureDroppedCallbackStruct implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(0L, null, 3, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r1v0 long))
  (wrap:uniffi.UniffiForeignFutureDroppedCallback:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiForeignFutureDroppedCallback) : (r3v0 uniffi.UniffiForeignFutureDroppedCallback))
 A[MD:(long, uniffi.UniffiForeignFutureDroppedCallback):void (m)] (LINE:444) call: uniffi.UniffiForeignFutureDroppedCallbackStruct.UniffiByValue.<init>(long, uniffi.UniffiForeignFutureDroppedCallback):void type: THIS */
        public /* synthetic */ UniffiByValue(long j, UniffiForeignFutureDroppedCallback uniffiForeignFutureDroppedCallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : uniffiForeignFutureDroppedCallback);
        }

        public UniffiByValue(long j, UniffiForeignFutureDroppedCallback uniffiForeignFutureDroppedCallback) {
            super(j, uniffiForeignFutureDroppedCallback);
        }
    }

    public UniffiForeignFutureDroppedCallbackStruct(long j, UniffiForeignFutureDroppedCallback uniffiForeignFutureDroppedCallback) {
        this.handle = j;
        this.free = uniffiForeignFutureDroppedCallback;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
        Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
        this.handle = uniffiForeignFutureDroppedCallbackStruct.handle;
        this.free = uniffiForeignFutureDroppedCallbackStruct.free;
    }
}
