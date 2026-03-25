package uniffi.account;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "onChanged"})
public class UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallback extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallbackMethod0 onChanged;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallback() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallbackMethod0) : (r4v0 uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallbackMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallbackMethod0):void (m)] (LINE:1407) call: uniffi.account.UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallback.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallbackMethod0):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallbackMethod0 uniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallbackMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallbackMethod0);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallback implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallbackMethod0) : (r4v0 uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallbackMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallbackMethod0):void (m)] (LINE:1412) call: uniffi.account.UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallback.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallbackMethod0):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallbackMethod0 uniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallbackMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallbackMethod0);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallbackMethod0 uniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallbackMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallbackMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallbackMethod0 uniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallbackMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.onChanged = uniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallbackMethod0;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallback uniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallback) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallback, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallback.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallback.uniffiClone;
        this.onChanged = uniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterAuthenticateStateCallback.onChanged;
    }
}
