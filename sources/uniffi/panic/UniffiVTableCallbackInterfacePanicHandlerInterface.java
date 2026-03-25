package uniffi.panic;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "handlePanic"})
public class UniffiVTableCallbackInterfacePanicHandlerInterface extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfacePanicHandlerInterfaceMethod0 handlePanic;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfacePanicHandlerInterface() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.panic.UniffiCallbackInterfacePanicHandlerInterfaceMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.panic.UniffiCallbackInterfacePanicHandlerInterfaceMethod0) : (r4v0 uniffi.panic.UniffiCallbackInterfacePanicHandlerInterfaceMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.panic.UniffiCallbackInterfacePanicHandlerInterfaceMethod0):void (m)] (LINE:61) call: uniffi.panic.UniffiVTableCallbackInterfacePanicHandlerInterface.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.panic.UniffiCallbackInterfacePanicHandlerInterfaceMethod0):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfacePanicHandlerInterface(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePanicHandlerInterfaceMethod0 uniffiCallbackInterfacePanicHandlerInterfaceMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfacePanicHandlerInterfaceMethod0);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfacePanicHandlerInterface implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.panic.UniffiCallbackInterfacePanicHandlerInterfaceMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.panic.UniffiCallbackInterfacePanicHandlerInterfaceMethod0) : (r4v0 uniffi.panic.UniffiCallbackInterfacePanicHandlerInterfaceMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.panic.UniffiCallbackInterfacePanicHandlerInterfaceMethod0):void (m)] (LINE:66) call: uniffi.panic.UniffiVTableCallbackInterfacePanicHandlerInterface.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.panic.UniffiCallbackInterfacePanicHandlerInterfaceMethod0):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePanicHandlerInterfaceMethod0 uniffiCallbackInterfacePanicHandlerInterfaceMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfacePanicHandlerInterfaceMethod0);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePanicHandlerInterfaceMethod0 uniffiCallbackInterfacePanicHandlerInterfaceMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfacePanicHandlerInterfaceMethod0);
        }
    }

    public UniffiVTableCallbackInterfacePanicHandlerInterface(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePanicHandlerInterfaceMethod0 uniffiCallbackInterfacePanicHandlerInterfaceMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.handlePanic = uniffiCallbackInterfacePanicHandlerInterfaceMethod0;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfacePanicHandlerInterface uniffiVTableCallbackInterfacePanicHandlerInterface) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfacePanicHandlerInterface, "");
        this.uniffiFree = uniffiVTableCallbackInterfacePanicHandlerInterface.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfacePanicHandlerInterface.uniffiClone;
        this.handlePanic = uniffiVTableCallbackInterfacePanicHandlerInterface.handlePanic;
    }
}
