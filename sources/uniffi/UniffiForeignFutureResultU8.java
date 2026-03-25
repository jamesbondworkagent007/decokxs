package uniffi;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60174zxk;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes25.dex */
@Structure.FieldOrder({"returnValue", "callStatus"})
public class UniffiForeignFutureResultU8 extends Structure {
    public static final int $stable = 8;
    public UniffiRustCallStatus.ByValue callStatus;
    public byte returnValue;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r1v0 o.zxk)
  (wrap:byte:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 byte) : (r2v0 byte))
  (wrap:uniffi.UniffiRustCallStatus$ByValue:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:uniffi.UniffiRustCallStatus$ByValue:0x000b: CONSTRUCTOR (r1v0 o.zxk) A[MD:(o.zxk):void (m), WRAPPED] (LINE:460) call: uniffi.UniffiRustCallStatus.ByValue.<init>(o.zxk):void type: CONSTRUCTOR) : (r3v0 uniffi.UniffiRustCallStatus$ByValue))
 A[MD:(o.zxk, byte, uniffi.UniffiRustCallStatus$ByValue):void (m)] (LINE:457) call: uniffi.UniffiForeignFutureResultU8.<init>(o.zxk, byte, uniffi.UniffiRustCallStatus$ByValue):void type: THIS */
    public /* synthetic */ UniffiForeignFutureResultU8(InterfaceC60174zxk interfaceC60174zxk, byte b, UniffiRustCallStatus.ByValue byValue, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC60174zxk, (i & 2) != 0 ? (byte) 0 : b, (i & 4) != 0 ? new UniffiRustCallStatus.ByValue(interfaceC60174zxk) : byValue);
    }

    public UniffiForeignFutureResultU8(@NotNull InterfaceC60174zxk interfaceC60174zxk, byte b, @NotNull UniffiRustCallStatus.ByValue byValue) {
        Intrinsics.checkNotNullParameter(interfaceC60174zxk, "");
        Intrinsics.checkNotNullParameter(byValue, "");
        this.returnValue = b;
        this.callStatus = byValue;
    }

    public static final class UniffiByValue extends UniffiForeignFutureResultU8 implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r1v0 o.zxk)
  (wrap:byte:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 byte) : (r2v0 byte))
  (wrap:uniffi.UniffiRustCallStatus$ByValue:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:uniffi.UniffiRustCallStatus$ByValue:0x000b: CONSTRUCTOR (r1v0 o.zxk) A[MD:(o.zxk):void (m), WRAPPED] (LINE:467) call: uniffi.UniffiRustCallStatus.ByValue.<init>(o.zxk):void type: CONSTRUCTOR) : (r3v0 uniffi.UniffiRustCallStatus$ByValue))
 A[MD:(o.zxk, byte, uniffi.UniffiRustCallStatus$ByValue):void (m)] (LINE:464) call: uniffi.UniffiForeignFutureResultU8.UniffiByValue.<init>(o.zxk, byte, uniffi.UniffiRustCallStatus$ByValue):void type: THIS */
        public /* synthetic */ UniffiByValue(InterfaceC60174zxk interfaceC60174zxk, byte b, UniffiRustCallStatus.ByValue byValue, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC60174zxk, (i & 2) != 0 ? (byte) 0 : b, (i & 4) != 0 ? new UniffiRustCallStatus.ByValue(interfaceC60174zxk) : byValue);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UniffiByValue(@NotNull InterfaceC60174zxk interfaceC60174zxk, byte b, @NotNull UniffiRustCallStatus.ByValue byValue) {
            super(interfaceC60174zxk, b, byValue);
            Intrinsics.checkNotNullParameter(interfaceC60174zxk, "");
            Intrinsics.checkNotNullParameter(byValue, "");
        }
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiForeignFutureResultU8 uniffiForeignFutureResultU8) {
        Intrinsics.checkNotNullParameter(uniffiForeignFutureResultU8, "");
        this.returnValue = uniffiForeignFutureResultU8.returnValue;
        this.callStatus = uniffiForeignFutureResultU8.callStatus;
    }
}
