package uniffi.account;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "onChanged"})
public class UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallback extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallbackMethod0 onChanged;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallback() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallbackMethod0) : (r4v0 uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallbackMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallbackMethod0):void (m)] (LINE:1502) call: uniffi.account.UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallback.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallbackMethod0):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallbackMethod0 uniffiCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallbackMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallbackMethod0);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallback implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallbackMethod0) : (r4v0 uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallbackMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallbackMethod0):void (m)] (LINE:1507) call: uniffi.account.UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallback.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallbackMethod0):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallbackMethod0 uniffiCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallbackMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallbackMethod0);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallbackMethod0 uniffiCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallbackMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallbackMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallbackMethod0 uniffiCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallbackMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.onChanged = uniffiCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallbackMethod0;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallback uniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallback) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallback, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallback.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallback.uniffiClone;
        this.onChanged = uniffiVTableCallbackInterfaceOkxPasskeyCrossDeviceSyncStateCallback.onChanged;
    }
}
