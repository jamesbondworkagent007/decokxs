package uniffi;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60174zxk;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;

/* JADX INFO: loaded from: classes17.dex */
@Structure.FieldOrder({"callStatus"})
public class UniffiForeignFutureResultVoid extends Structure {
    public static final int $stable = 8;
    public UniffiRustCallStatus.ByValue callStatus;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (r1v0 o.zxk)
  (wrap:uniffi.UniffiRustCallStatus$ByValue:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:uniffi.UniffiRustCallStatus$ByValue:0x0006: CONSTRUCTOR (r1v0 o.zxk) A[MD:(o.zxk):void (m), WRAPPED] (LINE:738) call: uniffi.UniffiRustCallStatus.ByValue.<init>(o.zxk):void type: CONSTRUCTOR) : (r2v0 uniffi.UniffiRustCallStatus$ByValue))
 A[MD:(o.zxk, uniffi.UniffiRustCallStatus$ByValue):void (m)] (LINE:736) call: uniffi.UniffiForeignFutureResultVoid.<init>(o.zxk, uniffi.UniffiRustCallStatus$ByValue):void type: THIS */
    public /* synthetic */ UniffiForeignFutureResultVoid(InterfaceC60174zxk interfaceC60174zxk, UniffiRustCallStatus.ByValue byValue, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC60174zxk, (i & 2) != 0 ? new UniffiRustCallStatus.ByValue(interfaceC60174zxk) : byValue);
    }

    public UniffiForeignFutureResultVoid(InterfaceC60174zxk interfaceC60174zxk, @NotNull UniffiRustCallStatus.ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        this.callStatus = byValue;
    }

    public static final class UniffiByValue extends UniffiForeignFutureResultVoid implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (r1v0 o.zxk)
  (wrap:uniffi.UniffiRustCallStatus$ByValue:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:uniffi.UniffiRustCallStatus$ByValue:0x0006: CONSTRUCTOR (r1v0 o.zxk) A[MD:(o.zxk):void (m), WRAPPED] (LINE:744) call: uniffi.UniffiRustCallStatus.ByValue.<init>(o.zxk):void type: CONSTRUCTOR) : (r2v0 uniffi.UniffiRustCallStatus$ByValue))
 A[MD:(o.zxk, uniffi.UniffiRustCallStatus$ByValue):void (m)] (LINE:742) call: uniffi.UniffiForeignFutureResultVoid.UniffiByValue.<init>(o.zxk, uniffi.UniffiRustCallStatus$ByValue):void type: THIS */
        public /* synthetic */ UniffiByValue(InterfaceC60174zxk interfaceC60174zxk, UniffiRustCallStatus.ByValue byValue, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC60174zxk, (i & 2) != 0 ? new UniffiRustCallStatus.ByValue(interfaceC60174zxk) : byValue);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UniffiByValue(InterfaceC60174zxk interfaceC60174zxk, @NotNull UniffiRustCallStatus.ByValue byValue) {
            super(interfaceC60174zxk, byValue);
            Intrinsics.checkNotNullParameter(byValue, "");
        }
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiForeignFutureResultVoid uniffiForeignFutureResultVoid) {
        Intrinsics.checkNotNullParameter(uniffiForeignFutureResultVoid, "");
        this.callStatus = uniffiForeignFutureResultVoid.callStatus;
    }
}
