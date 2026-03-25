package uniffi.account;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "onDeviceFound"})
public class UniffiVTableCallbackInterfaceBleDeviceDiscoveryCallback extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceBleDeviceDiscoveryCallbackMethod0 onDeviceFound;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceBleDeviceDiscoveryCallback() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfaceBleDeviceDiscoveryCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceBleDeviceDiscoveryCallbackMethod0) : (r4v0 uniffi.account.UniffiCallbackInterfaceBleDeviceDiscoveryCallbackMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceBleDeviceDiscoveryCallbackMethod0):void (m)] (LINE:573) call: uniffi.account.UniffiVTableCallbackInterfaceBleDeviceDiscoveryCallback.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceBleDeviceDiscoveryCallbackMethod0):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceBleDeviceDiscoveryCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBleDeviceDiscoveryCallbackMethod0 uniffiCallbackInterfaceBleDeviceDiscoveryCallbackMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceBleDeviceDiscoveryCallbackMethod0);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceBleDeviceDiscoveryCallback implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfaceBleDeviceDiscoveryCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceBleDeviceDiscoveryCallbackMethod0) : (r4v0 uniffi.account.UniffiCallbackInterfaceBleDeviceDiscoveryCallbackMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceBleDeviceDiscoveryCallbackMethod0):void (m)] (LINE:578) call: uniffi.account.UniffiVTableCallbackInterfaceBleDeviceDiscoveryCallback.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceBleDeviceDiscoveryCallbackMethod0):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBleDeviceDiscoveryCallbackMethod0 uniffiCallbackInterfaceBleDeviceDiscoveryCallbackMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceBleDeviceDiscoveryCallbackMethod0);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBleDeviceDiscoveryCallbackMethod0 uniffiCallbackInterfaceBleDeviceDiscoveryCallbackMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceBleDeviceDiscoveryCallbackMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceBleDeviceDiscoveryCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceBleDeviceDiscoveryCallbackMethod0 uniffiCallbackInterfaceBleDeviceDiscoveryCallbackMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.onDeviceFound = uniffiCallbackInterfaceBleDeviceDiscoveryCallbackMethod0;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceBleDeviceDiscoveryCallback uniffiVTableCallbackInterfaceBleDeviceDiscoveryCallback) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceBleDeviceDiscoveryCallback, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceBleDeviceDiscoveryCallback.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceBleDeviceDiscoveryCallback.uniffiClone;
        this.onDeviceFound = uniffiVTableCallbackInterfaceBleDeviceDiscoveryCallback.onDeviceFound;
    }
}
