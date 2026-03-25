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
public class UniffiVTableCallbackInterfaceOkNativeTaskResponseWithNetworkError extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod1 cancel;
    public UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod0 execute;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceOkNativeTaskResponseWithNetworkError() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.network.UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod0) : (r4v0 uniffi.network.UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod0))
  (wrap:uniffi.network.UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod1) : (r5v0 uniffi.network.UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod0, uniffi.network.UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod1):void (m)] (LINE:296) call: uniffi.network.UniffiVTableCallbackInterfaceOkNativeTaskResponseWithNetworkError.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod0, uniffi.network.UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod1):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceOkNativeTaskResponseWithNetworkError(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod0 uniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod0, UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod1 uniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod1);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceOkNativeTaskResponseWithNetworkError implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.network.UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod0) : (r4v0 uniffi.network.UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod0))
  (wrap:uniffi.network.UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod1) : (r5v0 uniffi.network.UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod0, uniffi.network.UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod1):void (m)] (LINE:302) call: uniffi.network.UniffiVTableCallbackInterfaceOkNativeTaskResponseWithNetworkError.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod0, uniffi.network.UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod1):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod0 uniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod0, UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod1 uniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod1);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod0 uniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod0, UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod1 uniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod1) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod0, uniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod1);
        }
    }

    public UniffiVTableCallbackInterfaceOkNativeTaskResponseWithNetworkError(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod0 uniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod0, UniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod1 uniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod1) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.execute = uniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod0;
        this.cancel = uniffiCallbackInterfaceOkNativeTaskResponseWithNetworkErrorMethod1;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceOkNativeTaskResponseWithNetworkError uniffiVTableCallbackInterfaceOkNativeTaskResponseWithNetworkError) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceOkNativeTaskResponseWithNetworkError, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceOkNativeTaskResponseWithNetworkError.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceOkNativeTaskResponseWithNetworkError.uniffiClone;
        this.execute = uniffiVTableCallbackInterfaceOkNativeTaskResponseWithNetworkError.execute;
        this.cancel = uniffiVTableCallbackInterfaceOkNativeTaskResponseWithNetworkError.cancel;
    }
}
