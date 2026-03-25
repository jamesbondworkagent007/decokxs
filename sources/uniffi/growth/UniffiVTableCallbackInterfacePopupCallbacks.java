package uniffi.growth;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes25.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "onShow", "onComplete"})
public class UniffiVTableCallbackInterfacePopupCallbacks extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfacePopupCallbacksMethod1 onComplete;
    public UniffiCallbackInterfacePopupCallbacksMethod0 onShow;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfacePopupCallbacks() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.growth.UniffiCallbackInterfacePopupCallbacksMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.growth.UniffiCallbackInterfacePopupCallbacksMethod0) : (r4v0 uniffi.growth.UniffiCallbackInterfacePopupCallbacksMethod0))
  (wrap:uniffi.growth.UniffiCallbackInterfacePopupCallbacksMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.growth.UniffiCallbackInterfacePopupCallbacksMethod1) : (r5v0 uniffi.growth.UniffiCallbackInterfacePopupCallbacksMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.growth.UniffiCallbackInterfacePopupCallbacksMethod0, uniffi.growth.UniffiCallbackInterfacePopupCallbacksMethod1):void (m)] (LINE:129) call: uniffi.growth.UniffiVTableCallbackInterfacePopupCallbacks.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.growth.UniffiCallbackInterfacePopupCallbacksMethod0, uniffi.growth.UniffiCallbackInterfacePopupCallbacksMethod1):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfacePopupCallbacks(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePopupCallbacksMethod0 uniffiCallbackInterfacePopupCallbacksMethod0, UniffiCallbackInterfacePopupCallbacksMethod1 uniffiCallbackInterfacePopupCallbacksMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfacePopupCallbacksMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfacePopupCallbacksMethod1);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfacePopupCallbacks implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.growth.UniffiCallbackInterfacePopupCallbacksMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.growth.UniffiCallbackInterfacePopupCallbacksMethod0) : (r4v0 uniffi.growth.UniffiCallbackInterfacePopupCallbacksMethod0))
  (wrap:uniffi.growth.UniffiCallbackInterfacePopupCallbacksMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.growth.UniffiCallbackInterfacePopupCallbacksMethod1) : (r5v0 uniffi.growth.UniffiCallbackInterfacePopupCallbacksMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.growth.UniffiCallbackInterfacePopupCallbacksMethod0, uniffi.growth.UniffiCallbackInterfacePopupCallbacksMethod1):void (m)] (LINE:135) call: uniffi.growth.UniffiVTableCallbackInterfacePopupCallbacks.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.growth.UniffiCallbackInterfacePopupCallbacksMethod0, uniffi.growth.UniffiCallbackInterfacePopupCallbacksMethod1):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePopupCallbacksMethod0 uniffiCallbackInterfacePopupCallbacksMethod0, UniffiCallbackInterfacePopupCallbacksMethod1 uniffiCallbackInterfacePopupCallbacksMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfacePopupCallbacksMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfacePopupCallbacksMethod1);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePopupCallbacksMethod0 uniffiCallbackInterfacePopupCallbacksMethod0, UniffiCallbackInterfacePopupCallbacksMethod1 uniffiCallbackInterfacePopupCallbacksMethod1) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfacePopupCallbacksMethod0, uniffiCallbackInterfacePopupCallbacksMethod1);
        }
    }

    public UniffiVTableCallbackInterfacePopupCallbacks(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePopupCallbacksMethod0 uniffiCallbackInterfacePopupCallbacksMethod0, UniffiCallbackInterfacePopupCallbacksMethod1 uniffiCallbackInterfacePopupCallbacksMethod1) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.onShow = uniffiCallbackInterfacePopupCallbacksMethod0;
        this.onComplete = uniffiCallbackInterfacePopupCallbacksMethod1;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfacePopupCallbacks uniffiVTableCallbackInterfacePopupCallbacks) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfacePopupCallbacks, "");
        this.uniffiFree = uniffiVTableCallbackInterfacePopupCallbacks.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfacePopupCallbacks.uniffiClone;
        this.onShow = uniffiVTableCallbackInterfacePopupCallbacks.onShow;
        this.onComplete = uniffiVTableCallbackInterfacePopupCallbacks.onComplete;
    }
}
