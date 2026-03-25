package uniffi;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60174zxk;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes25.dex */
@Structure.FieldOrder({"returnValue", "callStatus"})
public class UniffiForeignFutureResultU32 extends Structure {
    public static final int $stable = 8;
    public UniffiRustCallStatus.ByValue callStatus;
    public int returnValue;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r1v0 o.zxk)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:uniffi.UniffiRustCallStatus$ByValue:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:uniffi.UniffiRustCallStatus$ByValue:0x000b: CONSTRUCTOR (r1v0 o.zxk) A[MD:(o.zxk):void (m), WRAPPED] (LINE:560) call: uniffi.UniffiRustCallStatus.ByValue.<init>(o.zxk):void type: CONSTRUCTOR) : (r3v0 uniffi.UniffiRustCallStatus$ByValue))
 A[MD:(o.zxk, int, uniffi.UniffiRustCallStatus$ByValue):void (m)] (LINE:557) call: uniffi.UniffiForeignFutureResultU32.<init>(o.zxk, int, uniffi.UniffiRustCallStatus$ByValue):void type: THIS */
    public /* synthetic */ UniffiForeignFutureResultU32(InterfaceC60174zxk interfaceC60174zxk, int i, UniffiRustCallStatus.ByValue byValue, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC60174zxk, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? new UniffiRustCallStatus.ByValue(interfaceC60174zxk) : byValue);
    }

    public UniffiForeignFutureResultU32(@NotNull InterfaceC60174zxk interfaceC60174zxk, int i, @NotNull UniffiRustCallStatus.ByValue byValue) {
        Intrinsics.checkNotNullParameter(interfaceC60174zxk, "");
        Intrinsics.checkNotNullParameter(byValue, "");
        this.returnValue = i;
        this.callStatus = byValue;
    }

    public static final class UniffiByValue extends UniffiForeignFutureResultU32 implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r1v0 o.zxk)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:uniffi.UniffiRustCallStatus$ByValue:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:uniffi.UniffiRustCallStatus$ByValue:0x000b: CONSTRUCTOR (r1v0 o.zxk) A[MD:(o.zxk):void (m), WRAPPED] (LINE:567) call: uniffi.UniffiRustCallStatus.ByValue.<init>(o.zxk):void type: CONSTRUCTOR) : (r3v0 uniffi.UniffiRustCallStatus$ByValue))
 A[MD:(o.zxk, int, uniffi.UniffiRustCallStatus$ByValue):void (m)] (LINE:564) call: uniffi.UniffiForeignFutureResultU32.UniffiByValue.<init>(o.zxk, int, uniffi.UniffiRustCallStatus$ByValue):void type: THIS */
        public /* synthetic */ UniffiByValue(InterfaceC60174zxk interfaceC60174zxk, int i, UniffiRustCallStatus.ByValue byValue, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC60174zxk, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? new UniffiRustCallStatus.ByValue(interfaceC60174zxk) : byValue);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UniffiByValue(@NotNull InterfaceC60174zxk interfaceC60174zxk, int i, @NotNull UniffiRustCallStatus.ByValue byValue) {
            super(interfaceC60174zxk, i, byValue);
            Intrinsics.checkNotNullParameter(interfaceC60174zxk, "");
            Intrinsics.checkNotNullParameter(byValue, "");
        }
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiForeignFutureResultU32 uniffiForeignFutureResultU32) {
        Intrinsics.checkNotNullParameter(uniffiForeignFutureResultU32, "");
        this.returnValue = uniffiForeignFutureResultU32.returnValue;
        this.callStatus = uniffiForeignFutureResultU32.callStatus;
    }
}
