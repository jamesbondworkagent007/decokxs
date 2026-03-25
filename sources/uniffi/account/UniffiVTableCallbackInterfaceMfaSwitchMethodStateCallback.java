package uniffi.account;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "onChanged"})
public class UniffiVTableCallbackInterfaceMfaSwitchMethodStateCallback extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceMfaSwitchMethodStateCallbackMethod0 onChanged;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceMfaSwitchMethodStateCallback() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfaceMfaSwitchMethodStateCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceMfaSwitchMethodStateCallbackMethod0) : (r4v0 uniffi.account.UniffiCallbackInterfaceMfaSwitchMethodStateCallbackMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceMfaSwitchMethodStateCallbackMethod0):void (m)] (LINE:1013) call: uniffi.account.UniffiVTableCallbackInterfaceMfaSwitchMethodStateCallback.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceMfaSwitchMethodStateCallbackMethod0):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceMfaSwitchMethodStateCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceMfaSwitchMethodStateCallbackMethod0 uniffiCallbackInterfaceMfaSwitchMethodStateCallbackMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceMfaSwitchMethodStateCallbackMethod0);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceMfaSwitchMethodStateCallback implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.account.UniffiCallbackInterfaceMfaSwitchMethodStateCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.account.UniffiCallbackInterfaceMfaSwitchMethodStateCallbackMethod0) : (r4v0 uniffi.account.UniffiCallbackInterfaceMfaSwitchMethodStateCallbackMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceMfaSwitchMethodStateCallbackMethod0):void (m)] (LINE:1018) call: uniffi.account.UniffiVTableCallbackInterfaceMfaSwitchMethodStateCallback.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.account.UniffiCallbackInterfaceMfaSwitchMethodStateCallbackMethod0):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceMfaSwitchMethodStateCallbackMethod0 uniffiCallbackInterfaceMfaSwitchMethodStateCallbackMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceMfaSwitchMethodStateCallbackMethod0);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceMfaSwitchMethodStateCallbackMethod0 uniffiCallbackInterfaceMfaSwitchMethodStateCallbackMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceMfaSwitchMethodStateCallbackMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceMfaSwitchMethodStateCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceMfaSwitchMethodStateCallbackMethod0 uniffiCallbackInterfaceMfaSwitchMethodStateCallbackMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.onChanged = uniffiCallbackInterfaceMfaSwitchMethodStateCallbackMethod0;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceMfaSwitchMethodStateCallback uniffiVTableCallbackInterfaceMfaSwitchMethodStateCallback) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceMfaSwitchMethodStateCallback, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceMfaSwitchMethodStateCallback.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceMfaSwitchMethodStateCallback.uniffiClone;
        this.onChanged = uniffiVTableCallbackInterfaceMfaSwitchMethodStateCallback.onChanged;
    }
}
