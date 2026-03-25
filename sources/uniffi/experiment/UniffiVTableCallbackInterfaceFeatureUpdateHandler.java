package uniffi.experiment;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "onFeatureUpdated"})
public class UniffiVTableCallbackInterfaceFeatureUpdateHandler extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceFeatureUpdateHandlerMethod0 onFeatureUpdated;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceFeatureUpdateHandler() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.experiment.UniffiCallbackInterfaceFeatureUpdateHandlerMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.experiment.UniffiCallbackInterfaceFeatureUpdateHandlerMethod0) : (r4v0 uniffi.experiment.UniffiCallbackInterfaceFeatureUpdateHandlerMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.experiment.UniffiCallbackInterfaceFeatureUpdateHandlerMethod0):void (m)] (LINE:101) call: uniffi.experiment.UniffiVTableCallbackInterfaceFeatureUpdateHandler.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.experiment.UniffiCallbackInterfaceFeatureUpdateHandlerMethod0):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceFeatureUpdateHandler(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceFeatureUpdateHandlerMethod0 uniffiCallbackInterfaceFeatureUpdateHandlerMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceFeatureUpdateHandlerMethod0);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceFeatureUpdateHandler implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.experiment.UniffiCallbackInterfaceFeatureUpdateHandlerMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.experiment.UniffiCallbackInterfaceFeatureUpdateHandlerMethod0) : (r4v0 uniffi.experiment.UniffiCallbackInterfaceFeatureUpdateHandlerMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.experiment.UniffiCallbackInterfaceFeatureUpdateHandlerMethod0):void (m)] (LINE:106) call: uniffi.experiment.UniffiVTableCallbackInterfaceFeatureUpdateHandler.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.experiment.UniffiCallbackInterfaceFeatureUpdateHandlerMethod0):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceFeatureUpdateHandlerMethod0 uniffiCallbackInterfaceFeatureUpdateHandlerMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceFeatureUpdateHandlerMethod0);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceFeatureUpdateHandlerMethod0 uniffiCallbackInterfaceFeatureUpdateHandlerMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceFeatureUpdateHandlerMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceFeatureUpdateHandler(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceFeatureUpdateHandlerMethod0 uniffiCallbackInterfaceFeatureUpdateHandlerMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.onFeatureUpdated = uniffiCallbackInterfaceFeatureUpdateHandlerMethod0;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceFeatureUpdateHandler uniffiVTableCallbackInterfaceFeatureUpdateHandler) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceFeatureUpdateHandler, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceFeatureUpdateHandler.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceFeatureUpdateHandler.uniffiClone;
        this.onFeatureUpdated = uniffiVTableCallbackInterfaceFeatureUpdateHandler.onFeatureUpdated;
    }
}
