package uniffi.account;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "onStepChanged"})
public class UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallback extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallbackMethod0 onStepChanged;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallback() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallbackMethod0) : (r4v0 uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallbackMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallbackMethod0):void (m)] (LINE:1464) call: uniffi.account.UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallback.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallbackMethod0):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallbackMethod0 uniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallbackMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallbackMethod0);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallback implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallbackMethod0) : (r4v0 uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallbackMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallbackMethod0):void (m)] (LINE:1469) call: uniffi.account.UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallback.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallbackMethod0):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallbackMethod0 uniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallbackMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallbackMethod0);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallbackMethod0 uniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallbackMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallbackMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallbackMethod0 uniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallbackMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.onStepChanged = uniffiCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallbackMethod0;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallback uniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallback) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallback, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallback.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallback.uniffiClone;
        this.onStepChanged = uniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceMasterStepCallback.onStepChanged;
    }
}
