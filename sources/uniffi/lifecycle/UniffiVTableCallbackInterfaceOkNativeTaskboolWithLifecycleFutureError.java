package uniffi.lifecycle;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "execute", OtpEventTracker.OTP_EVENT_VALUE_CANCEL})
public class UniffiVTableCallbackInterfaceOkNativeTaskboolWithLifecycleFutureError extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod1 cancel;
    public UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod0 execute;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceOkNativeTaskboolWithLifecycleFutureError() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod0) : (r4v0 uniffi.lifecycle.UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod0))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod1) : (r5v0 uniffi.lifecycle.UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod0, uniffi.lifecycle.UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod1):void (m)] (LINE:431) call: uniffi.lifecycle.UniffiVTableCallbackInterfaceOkNativeTaskboolWithLifecycleFutureError.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod0, uniffi.lifecycle.UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod1):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceOkNativeTaskboolWithLifecycleFutureError(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod0 uniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod0, UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod1 uniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod1);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceOkNativeTaskboolWithLifecycleFutureError implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod0) : (r4v0 uniffi.lifecycle.UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod0))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod1) : (r5v0 uniffi.lifecycle.UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod0, uniffi.lifecycle.UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod1):void (m)] (LINE:437) call: uniffi.lifecycle.UniffiVTableCallbackInterfaceOkNativeTaskboolWithLifecycleFutureError.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod0, uniffi.lifecycle.UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod1):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod0 uniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod0, UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod1 uniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod1);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod0 uniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod0, UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod1 uniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod1) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod0, uniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod1);
        }
    }

    public UniffiVTableCallbackInterfaceOkNativeTaskboolWithLifecycleFutureError(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod0 uniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod0, UniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod1 uniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod1) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.execute = uniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod0;
        this.cancel = uniffiCallbackInterfaceOkNativeTaskboolWithLifecycleFutureErrorMethod1;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceOkNativeTaskboolWithLifecycleFutureError uniffiVTableCallbackInterfaceOkNativeTaskboolWithLifecycleFutureError) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceOkNativeTaskboolWithLifecycleFutureError, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceOkNativeTaskboolWithLifecycleFutureError.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceOkNativeTaskboolWithLifecycleFutureError.uniffiClone;
        this.execute = uniffiVTableCallbackInterfaceOkNativeTaskboolWithLifecycleFutureError.execute;
        this.cancel = uniffiVTableCallbackInterfaceOkNativeTaskboolWithLifecycleFutureError.cancel;
    }
}
