package uniffi.experiment;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "enableMonitorShaking", "disableMonitorShaking"})
public class UniffiVTableCallbackInterfaceFeedbackInterface extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceFeedbackInterfaceMethod1 disableMonitorShaking;
    public UniffiCallbackInterfaceFeedbackInterfaceMethod0 enableMonitorShaking;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceFeedbackInterface() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.experiment.UniffiCallbackInterfaceFeedbackInterfaceMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.experiment.UniffiCallbackInterfaceFeedbackInterfaceMethod0) : (r4v0 uniffi.experiment.UniffiCallbackInterfaceFeedbackInterfaceMethod0))
  (wrap:uniffi.experiment.UniffiCallbackInterfaceFeedbackInterfaceMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.experiment.UniffiCallbackInterfaceFeedbackInterfaceMethod1) : (r5v0 uniffi.experiment.UniffiCallbackInterfaceFeedbackInterfaceMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.experiment.UniffiCallbackInterfaceFeedbackInterfaceMethod0, uniffi.experiment.UniffiCallbackInterfaceFeedbackInterfaceMethod1):void (m)] (LINE:120) call: uniffi.experiment.UniffiVTableCallbackInterfaceFeedbackInterface.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.experiment.UniffiCallbackInterfaceFeedbackInterfaceMethod0, uniffi.experiment.UniffiCallbackInterfaceFeedbackInterfaceMethod1):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceFeedbackInterface(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceFeedbackInterfaceMethod0 uniffiCallbackInterfaceFeedbackInterfaceMethod0, UniffiCallbackInterfaceFeedbackInterfaceMethod1 uniffiCallbackInterfaceFeedbackInterfaceMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceFeedbackInterfaceMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceFeedbackInterfaceMethod1);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceFeedbackInterface implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.experiment.UniffiCallbackInterfaceFeedbackInterfaceMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.experiment.UniffiCallbackInterfaceFeedbackInterfaceMethod0) : (r4v0 uniffi.experiment.UniffiCallbackInterfaceFeedbackInterfaceMethod0))
  (wrap:uniffi.experiment.UniffiCallbackInterfaceFeedbackInterfaceMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.experiment.UniffiCallbackInterfaceFeedbackInterfaceMethod1) : (r5v0 uniffi.experiment.UniffiCallbackInterfaceFeedbackInterfaceMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.experiment.UniffiCallbackInterfaceFeedbackInterfaceMethod0, uniffi.experiment.UniffiCallbackInterfaceFeedbackInterfaceMethod1):void (m)] (LINE:126) call: uniffi.experiment.UniffiVTableCallbackInterfaceFeedbackInterface.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.experiment.UniffiCallbackInterfaceFeedbackInterfaceMethod0, uniffi.experiment.UniffiCallbackInterfaceFeedbackInterfaceMethod1):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceFeedbackInterfaceMethod0 uniffiCallbackInterfaceFeedbackInterfaceMethod0, UniffiCallbackInterfaceFeedbackInterfaceMethod1 uniffiCallbackInterfaceFeedbackInterfaceMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceFeedbackInterfaceMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceFeedbackInterfaceMethod1);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceFeedbackInterfaceMethod0 uniffiCallbackInterfaceFeedbackInterfaceMethod0, UniffiCallbackInterfaceFeedbackInterfaceMethod1 uniffiCallbackInterfaceFeedbackInterfaceMethod1) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceFeedbackInterfaceMethod0, uniffiCallbackInterfaceFeedbackInterfaceMethod1);
        }
    }

    public UniffiVTableCallbackInterfaceFeedbackInterface(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceFeedbackInterfaceMethod0 uniffiCallbackInterfaceFeedbackInterfaceMethod0, UniffiCallbackInterfaceFeedbackInterfaceMethod1 uniffiCallbackInterfaceFeedbackInterfaceMethod1) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.enableMonitorShaking = uniffiCallbackInterfaceFeedbackInterfaceMethod0;
        this.disableMonitorShaking = uniffiCallbackInterfaceFeedbackInterfaceMethod1;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceFeedbackInterface uniffiVTableCallbackInterfaceFeedbackInterface) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceFeedbackInterface, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceFeedbackInterface.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceFeedbackInterface.uniffiClone;
        this.enableMonitorShaking = uniffiVTableCallbackInterfaceFeedbackInterface.enableMonitorShaking;
        this.disableMonitorShaking = uniffiVTableCallbackInterfaceFeedbackInterface.disableMonitorShaking;
    }
}
