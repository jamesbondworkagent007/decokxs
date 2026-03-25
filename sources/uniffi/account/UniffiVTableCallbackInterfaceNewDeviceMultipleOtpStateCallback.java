package uniffi.account;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "onChanged"})
public class UniffiVTableCallbackInterfaceNewDeviceMultipleOtpStateCallback extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceNewDeviceMultipleOtpStateCallbackMethod0 onChanged;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceNewDeviceMultipleOtpStateCallback() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfaceNewDeviceMultipleOtpStateCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceNewDeviceMultipleOtpStateCallbackMethod0) : (r4v0 uniffi.account.UniffiCallbackInterfaceNewDeviceMultipleOtpStateCallbackMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceNewDeviceMultipleOtpStateCallbackMethod0):void (m)] (LINE:1331) call: uniffi.account.UniffiVTableCallbackInterfaceNewDeviceMultipleOtpStateCallback.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceNewDeviceMultipleOtpStateCallbackMethod0):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceNewDeviceMultipleOtpStateCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceNewDeviceMultipleOtpStateCallbackMethod0 uniffiCallbackInterfaceNewDeviceMultipleOtpStateCallbackMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceNewDeviceMultipleOtpStateCallbackMethod0);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceNewDeviceMultipleOtpStateCallback implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfaceNewDeviceMultipleOtpStateCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceNewDeviceMultipleOtpStateCallbackMethod0) : (r4v0 uniffi.account.UniffiCallbackInterfaceNewDeviceMultipleOtpStateCallbackMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceNewDeviceMultipleOtpStateCallbackMethod0):void (m)] (LINE:1336) call: uniffi.account.UniffiVTableCallbackInterfaceNewDeviceMultipleOtpStateCallback.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceNewDeviceMultipleOtpStateCallbackMethod0):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceNewDeviceMultipleOtpStateCallbackMethod0 uniffiCallbackInterfaceNewDeviceMultipleOtpStateCallbackMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceNewDeviceMultipleOtpStateCallbackMethod0);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceNewDeviceMultipleOtpStateCallbackMethod0 uniffiCallbackInterfaceNewDeviceMultipleOtpStateCallbackMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceNewDeviceMultipleOtpStateCallbackMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceNewDeviceMultipleOtpStateCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceNewDeviceMultipleOtpStateCallbackMethod0 uniffiCallbackInterfaceNewDeviceMultipleOtpStateCallbackMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.onChanged = uniffiCallbackInterfaceNewDeviceMultipleOtpStateCallbackMethod0;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceNewDeviceMultipleOtpStateCallback uniffiVTableCallbackInterfaceNewDeviceMultipleOtpStateCallback) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceNewDeviceMultipleOtpStateCallback, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceNewDeviceMultipleOtpStateCallback.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceNewDeviceMultipleOtpStateCallback.uniffiClone;
        this.onChanged = uniffiVTableCallbackInterfaceNewDeviceMultipleOtpStateCallback.onChanged;
    }
}
