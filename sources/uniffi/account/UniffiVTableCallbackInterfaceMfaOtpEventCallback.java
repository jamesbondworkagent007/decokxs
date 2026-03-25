package uniffi.account;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "onEvent"})
public class UniffiVTableCallbackInterfaceMfaOtpEventCallback extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceMfaOtpEventCallbackMethod0 onEvent;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceMfaOtpEventCallback() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfaceMfaOtpEventCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceMfaOtpEventCallbackMethod0) : (r4v0 uniffi.account.UniffiCallbackInterfaceMfaOtpEventCallbackMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceMfaOtpEventCallbackMethod0):void (m)] (LINE:861) call: uniffi.account.UniffiVTableCallbackInterfaceMfaOtpEventCallback.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceMfaOtpEventCallbackMethod0):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceMfaOtpEventCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceMfaOtpEventCallbackMethod0 uniffiCallbackInterfaceMfaOtpEventCallbackMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceMfaOtpEventCallbackMethod0);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceMfaOtpEventCallback implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfaceMfaOtpEventCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceMfaOtpEventCallbackMethod0) : (r4v0 uniffi.account.UniffiCallbackInterfaceMfaOtpEventCallbackMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceMfaOtpEventCallbackMethod0):void (m)] (LINE:866) call: uniffi.account.UniffiVTableCallbackInterfaceMfaOtpEventCallback.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceMfaOtpEventCallbackMethod0):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceMfaOtpEventCallbackMethod0 uniffiCallbackInterfaceMfaOtpEventCallbackMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceMfaOtpEventCallbackMethod0);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceMfaOtpEventCallbackMethod0 uniffiCallbackInterfaceMfaOtpEventCallbackMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceMfaOtpEventCallbackMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceMfaOtpEventCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceMfaOtpEventCallbackMethod0 uniffiCallbackInterfaceMfaOtpEventCallbackMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.onEvent = uniffiCallbackInterfaceMfaOtpEventCallbackMethod0;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceMfaOtpEventCallback uniffiVTableCallbackInterfaceMfaOtpEventCallback) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceMfaOtpEventCallback, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceMfaOtpEventCallback.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceMfaOtpEventCallback.uniffiClone;
        this.onEvent = uniffiVTableCallbackInterfaceMfaOtpEventCallback.onEvent;
    }
}
