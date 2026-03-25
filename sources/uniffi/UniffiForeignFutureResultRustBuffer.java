package uniffi;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60174zxk;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes17.dex */
@Structure.FieldOrder({"returnValue", "callStatus"})
public class UniffiForeignFutureResultRustBuffer extends Structure {
    public static final int $stable = 8;
    public UniffiRustCallStatus.ByValue callStatus;
    public RustBuffer.ByValue returnValue;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r1v0 o.zxk)
  (wrap:uniffi.RustBuffer$ByValue:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:uniffi.RustBuffer$ByValue:0x0006: CONSTRUCTOR (r1v0 o.zxk) A[MD:(o.zxk):void (m), WRAPPED] (LINE:709) call: uniffi.RustBuffer.ByValue.<init>(o.zxk):void type: CONSTRUCTOR) : (r2v0 uniffi.RustBuffer$ByValue))
  (wrap:uniffi.UniffiRustCallStatus$ByValue:?: TERNARY null = ((wrap:int:0x0009: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:uniffi.UniffiRustCallStatus$ByValue:0x000f: CONSTRUCTOR (r1v0 o.zxk) A[MD:(o.zxk):void (m), WRAPPED] (LINE:710) call: uniffi.UniffiRustCallStatus.ByValue.<init>(o.zxk):void type: CONSTRUCTOR) : (r3v0 uniffi.UniffiRustCallStatus$ByValue))
 A[MD:(o.zxk, uniffi.RustBuffer$ByValue, uniffi.UniffiRustCallStatus$ByValue):void (m)] (LINE:707) call: uniffi.UniffiForeignFutureResultRustBuffer.<init>(o.zxk, uniffi.RustBuffer$ByValue, uniffi.UniffiRustCallStatus$ByValue):void type: THIS */
    public /* synthetic */ UniffiForeignFutureResultRustBuffer(InterfaceC60174zxk interfaceC60174zxk, RustBuffer.ByValue byValue, UniffiRustCallStatus.ByValue byValue2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC60174zxk, (i & 2) != 0 ? new RustBuffer.ByValue(interfaceC60174zxk) : byValue, (i & 4) != 0 ? new UniffiRustCallStatus.ByValue(interfaceC60174zxk) : byValue2);
    }

    public UniffiForeignFutureResultRustBuffer(InterfaceC60174zxk interfaceC60174zxk, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus.ByValue byValue2) {
        Intrinsics.checkNotNullParameter(byValue, "");
        Intrinsics.checkNotNullParameter(byValue2, "");
        this.returnValue = byValue;
        this.callStatus = byValue2;
    }

    public static final class UniffiByValue extends UniffiForeignFutureResultRustBuffer implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r1v0 o.zxk)
  (wrap:uniffi.RustBuffer$ByValue:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:uniffi.RustBuffer$ByValue:0x0006: CONSTRUCTOR (r1v0 o.zxk) A[MD:(o.zxk):void (m), WRAPPED] (LINE:716) call: uniffi.RustBuffer.ByValue.<init>(o.zxk):void type: CONSTRUCTOR) : (r2v0 uniffi.RustBuffer$ByValue))
  (wrap:uniffi.UniffiRustCallStatus$ByValue:?: TERNARY null = ((wrap:int:0x0009: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:uniffi.UniffiRustCallStatus$ByValue:0x000f: CONSTRUCTOR (r1v0 o.zxk) A[MD:(o.zxk):void (m), WRAPPED] (LINE:717) call: uniffi.UniffiRustCallStatus.ByValue.<init>(o.zxk):void type: CONSTRUCTOR) : (r3v0 uniffi.UniffiRustCallStatus$ByValue))
 A[MD:(o.zxk, uniffi.RustBuffer$ByValue, uniffi.UniffiRustCallStatus$ByValue):void (m)] (LINE:714) call: uniffi.UniffiForeignFutureResultRustBuffer.UniffiByValue.<init>(o.zxk, uniffi.RustBuffer$ByValue, uniffi.UniffiRustCallStatus$ByValue):void type: THIS */
        public /* synthetic */ UniffiByValue(InterfaceC60174zxk interfaceC60174zxk, RustBuffer.ByValue byValue, UniffiRustCallStatus.ByValue byValue2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC60174zxk, (i & 2) != 0 ? new RustBuffer.ByValue(interfaceC60174zxk) : byValue, (i & 4) != 0 ? new UniffiRustCallStatus.ByValue(interfaceC60174zxk) : byValue2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UniffiByValue(InterfaceC60174zxk interfaceC60174zxk, @NotNull RustBuffer.ByValue byValue, @NotNull UniffiRustCallStatus.ByValue byValue2) {
            super(interfaceC60174zxk, byValue, byValue2);
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(byValue2, "");
        }
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiForeignFutureResultRustBuffer uniffiForeignFutureResultRustBuffer) {
        Intrinsics.checkNotNullParameter(uniffiForeignFutureResultRustBuffer, "");
        this.returnValue = uniffiForeignFutureResultRustBuffer.returnValue;
        this.callStatus = uniffiForeignFutureResultRustBuffer.callStatus;
    }
}
