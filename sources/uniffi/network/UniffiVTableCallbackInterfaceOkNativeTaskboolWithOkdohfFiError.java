package uniffi.network;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "execute", OtpEventTracker.OTP_EVENT_VALUE_CANCEL})
public class UniffiVTableCallbackInterfaceOkNativeTaskboolWithOkdohfFiError extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod1 cancel;
    public UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod0 execute;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceOkNativeTaskboolWithOkdohfFiError() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.network.UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod0) : (r4v0 uniffi.network.UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod0))
  (wrap:uniffi.network.UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod1) : (r5v0 uniffi.network.UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod0, uniffi.network.UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod1):void (m)] (LINE:318) call: uniffi.network.UniffiVTableCallbackInterfaceOkNativeTaskboolWithOkdohfFiError.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod0, uniffi.network.UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod1):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceOkNativeTaskboolWithOkdohfFiError(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod0 uniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod0, UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod1 uniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod1);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceOkNativeTaskboolWithOkdohfFiError implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.network.UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod0) : (r4v0 uniffi.network.UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod0))
  (wrap:uniffi.network.UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod1) : (r5v0 uniffi.network.UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod0, uniffi.network.UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod1):void (m)] (LINE:324) call: uniffi.network.UniffiVTableCallbackInterfaceOkNativeTaskboolWithOkdohfFiError.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod0, uniffi.network.UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod1):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod0 uniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod0, UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod1 uniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod1);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod0 uniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod0, UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod1 uniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod1) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod0, uniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod1);
        }
    }

    public UniffiVTableCallbackInterfaceOkNativeTaskboolWithOkdohfFiError(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod0 uniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod0, UniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod1 uniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod1) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.execute = uniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod0;
        this.cancel = uniffiCallbackInterfaceOkNativeTaskboolWithOkdohfFiErrorMethod1;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceOkNativeTaskboolWithOkdohfFiError uniffiVTableCallbackInterfaceOkNativeTaskboolWithOkdohfFiError) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceOkNativeTaskboolWithOkdohfFiError, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceOkNativeTaskboolWithOkdohfFiError.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceOkNativeTaskboolWithOkdohfFiError.uniffiClone;
        this.execute = uniffiVTableCallbackInterfaceOkNativeTaskboolWithOkdohfFiError.execute;
        this.cancel = uniffiVTableCallbackInterfaceOkNativeTaskboolWithOkdohfFiError.cancel;
    }
}
