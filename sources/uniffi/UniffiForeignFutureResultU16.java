package uniffi;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60174zxk;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes25.dex */
@Structure.FieldOrder({"returnValue", "callStatus"})
public class UniffiForeignFutureResultU16 extends Structure {
    public static final int $stable = 8;
    public UniffiRustCallStatus.ByValue callStatus;
    public short returnValue;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r1v0 o.zxk)
  (wrap:short:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 short) : (r2v0 short))
  (wrap:uniffi.UniffiRustCallStatus$ByValue:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:uniffi.UniffiRustCallStatus$ByValue:0x000b: CONSTRUCTOR (r1v0 o.zxk) A[MD:(o.zxk):void (m), WRAPPED] (LINE:510) call: uniffi.UniffiRustCallStatus.ByValue.<init>(o.zxk):void type: CONSTRUCTOR) : (r3v0 uniffi.UniffiRustCallStatus$ByValue))
 A[MD:(o.zxk, short, uniffi.UniffiRustCallStatus$ByValue):void (m)] (LINE:507) call: uniffi.UniffiForeignFutureResultU16.<init>(o.zxk, short, uniffi.UniffiRustCallStatus$ByValue):void type: THIS */
    public /* synthetic */ UniffiForeignFutureResultU16(InterfaceC60174zxk interfaceC60174zxk, short s, UniffiRustCallStatus.ByValue byValue, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC60174zxk, (i & 2) != 0 ? (short) 0 : s, (i & 4) != 0 ? new UniffiRustCallStatus.ByValue(interfaceC60174zxk) : byValue);
    }

    public UniffiForeignFutureResultU16(@NotNull InterfaceC60174zxk interfaceC60174zxk, short s, @NotNull UniffiRustCallStatus.ByValue byValue) {
        Intrinsics.checkNotNullParameter(interfaceC60174zxk, "");
        Intrinsics.checkNotNullParameter(byValue, "");
        this.returnValue = s;
        this.callStatus = byValue;
    }

    public static final class UniffiByValue extends UniffiForeignFutureResultU16 implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r1v0 o.zxk)
  (wrap:short:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 short) : (r2v0 short))
  (wrap:uniffi.UniffiRustCallStatus$ByValue:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:uniffi.UniffiRustCallStatus$ByValue:0x000b: CONSTRUCTOR (r1v0 o.zxk) A[MD:(o.zxk):void (m), WRAPPED] (LINE:517) call: uniffi.UniffiRustCallStatus.ByValue.<init>(o.zxk):void type: CONSTRUCTOR) : (r3v0 uniffi.UniffiRustCallStatus$ByValue))
 A[MD:(o.zxk, short, uniffi.UniffiRustCallStatus$ByValue):void (m)] (LINE:514) call: uniffi.UniffiForeignFutureResultU16.UniffiByValue.<init>(o.zxk, short, uniffi.UniffiRustCallStatus$ByValue):void type: THIS */
        public /* synthetic */ UniffiByValue(InterfaceC60174zxk interfaceC60174zxk, short s, UniffiRustCallStatus.ByValue byValue, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC60174zxk, (i & 2) != 0 ? (short) 0 : s, (i & 4) != 0 ? new UniffiRustCallStatus.ByValue(interfaceC60174zxk) : byValue);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UniffiByValue(@NotNull InterfaceC60174zxk interfaceC60174zxk, short s, @NotNull UniffiRustCallStatus.ByValue byValue) {
            super(interfaceC60174zxk, s, byValue);
            Intrinsics.checkNotNullParameter(interfaceC60174zxk, "");
            Intrinsics.checkNotNullParameter(byValue, "");
        }
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiForeignFutureResultU16 uniffiForeignFutureResultU16) {
        Intrinsics.checkNotNullParameter(uniffiForeignFutureResultU16, "");
        this.returnValue = uniffiForeignFutureResultU16.returnValue;
        this.callStatus = uniffiForeignFutureResultU16.callStatus;
    }
}
