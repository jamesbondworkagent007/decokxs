package uniffi.app_state;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "getCurrentState"})
public class UniffiVTableCallbackInterfaceAppSupportInterface extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceAppSupportInterfaceMethod0 getCurrentState;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceAppSupportInterface() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.app_state.UniffiCallbackInterfaceAppSupportInterfaceMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.app_state.UniffiCallbackInterfaceAppSupportInterfaceMethod0) : (r4v0 uniffi.app_state.UniffiCallbackInterfaceAppSupportInterfaceMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.app_state.UniffiCallbackInterfaceAppSupportInterfaceMethod0):void (m)] (LINE:61) call: uniffi.app_state.UniffiVTableCallbackInterfaceAppSupportInterface.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.app_state.UniffiCallbackInterfaceAppSupportInterfaceMethod0):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceAppSupportInterface(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceAppSupportInterfaceMethod0 uniffiCallbackInterfaceAppSupportInterfaceMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceAppSupportInterfaceMethod0);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceAppSupportInterface implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.app_state.UniffiCallbackInterfaceAppSupportInterfaceMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.app_state.UniffiCallbackInterfaceAppSupportInterfaceMethod0) : (r4v0 uniffi.app_state.UniffiCallbackInterfaceAppSupportInterfaceMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.app_state.UniffiCallbackInterfaceAppSupportInterfaceMethod0):void (m)] (LINE:66) call: uniffi.app_state.UniffiVTableCallbackInterfaceAppSupportInterface.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.app_state.UniffiCallbackInterfaceAppSupportInterfaceMethod0):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceAppSupportInterfaceMethod0 uniffiCallbackInterfaceAppSupportInterfaceMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceAppSupportInterfaceMethod0);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceAppSupportInterfaceMethod0 uniffiCallbackInterfaceAppSupportInterfaceMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceAppSupportInterfaceMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceAppSupportInterface(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceAppSupportInterfaceMethod0 uniffiCallbackInterfaceAppSupportInterfaceMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.getCurrentState = uniffiCallbackInterfaceAppSupportInterfaceMethod0;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceAppSupportInterface uniffiVTableCallbackInterfaceAppSupportInterface) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceAppSupportInterface, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceAppSupportInterface.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceAppSupportInterface.uniffiClone;
        this.getCurrentState = uniffiVTableCallbackInterfaceAppSupportInterface.getCurrentState;
    }
}
