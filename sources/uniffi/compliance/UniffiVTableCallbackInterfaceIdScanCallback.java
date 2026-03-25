package uniffi.compliance;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes25.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "onFrameSelected", "onAutofocus", "onFrameResponse", "onComplete", "onDebugData"})
public class UniffiVTableCallbackInterfaceIdScanCallback extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceIdScanCallbackMethod1 onAutofocus;
    public UniffiCallbackInterfaceIdScanCallbackMethod3 onComplete;
    public UniffiCallbackInterfaceIdScanCallbackMethod4 onDebugData;
    public UniffiCallbackInterfaceIdScanCallbackMethod2 onFrameResponse;
    public UniffiCallbackInterfaceIdScanCallbackMethod0 onFrameSelected;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceIdScanCallback() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r7v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r8v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod0) : (r9v0 uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod0))
  (wrap:uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod1) : (r10v0 uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod1))
  (wrap:uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod2) : (r11v0 uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod2))
  (wrap:uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod3:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod3) : (r12v0 uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod3))
  (wrap:uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod4:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod4) : (r13v0 uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod4))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod0, uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod1, uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod2, uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod3, uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod4):void (m)] (LINE:73) call: uniffi.compliance.UniffiVTableCallbackInterfaceIdScanCallback.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod0, uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod1, uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod2, uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod3, uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod4):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceIdScanCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceIdScanCallbackMethod0 uniffiCallbackInterfaceIdScanCallbackMethod0, UniffiCallbackInterfaceIdScanCallbackMethod1 uniffiCallbackInterfaceIdScanCallbackMethod1, UniffiCallbackInterfaceIdScanCallbackMethod2 uniffiCallbackInterfaceIdScanCallbackMethod2, UniffiCallbackInterfaceIdScanCallbackMethod3 uniffiCallbackInterfaceIdScanCallbackMethod3, UniffiCallbackInterfaceIdScanCallbackMethod4 uniffiCallbackInterfaceIdScanCallbackMethod4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceIdScanCallbackMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceIdScanCallbackMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceIdScanCallbackMethod2, (i & 32) != 0 ? null : uniffiCallbackInterfaceIdScanCallbackMethod3, (i & 64) != 0 ? null : uniffiCallbackInterfaceIdScanCallbackMethod4);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceIdScanCallback implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r7v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r8v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod0) : (r9v0 uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod0))
  (wrap:uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod1) : (r10v0 uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod1))
  (wrap:uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod2) : (r11v0 uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod2))
  (wrap:uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod3:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod3) : (r12v0 uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod3))
  (wrap:uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod4:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod4) : (r13v0 uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod4))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod0, uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod1, uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod2, uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod3, uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod4):void (m)] (LINE:82) call: uniffi.compliance.UniffiVTableCallbackInterfaceIdScanCallback.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod0, uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod1, uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod2, uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod3, uniffi.compliance.UniffiCallbackInterfaceIdScanCallbackMethod4):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceIdScanCallbackMethod0 uniffiCallbackInterfaceIdScanCallbackMethod0, UniffiCallbackInterfaceIdScanCallbackMethod1 uniffiCallbackInterfaceIdScanCallbackMethod1, UniffiCallbackInterfaceIdScanCallbackMethod2 uniffiCallbackInterfaceIdScanCallbackMethod2, UniffiCallbackInterfaceIdScanCallbackMethod3 uniffiCallbackInterfaceIdScanCallbackMethod3, UniffiCallbackInterfaceIdScanCallbackMethod4 uniffiCallbackInterfaceIdScanCallbackMethod4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceIdScanCallbackMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceIdScanCallbackMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceIdScanCallbackMethod2, (i & 32) != 0 ? null : uniffiCallbackInterfaceIdScanCallbackMethod3, (i & 64) != 0 ? null : uniffiCallbackInterfaceIdScanCallbackMethod4);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceIdScanCallbackMethod0 uniffiCallbackInterfaceIdScanCallbackMethod0, UniffiCallbackInterfaceIdScanCallbackMethod1 uniffiCallbackInterfaceIdScanCallbackMethod1, UniffiCallbackInterfaceIdScanCallbackMethod2 uniffiCallbackInterfaceIdScanCallbackMethod2, UniffiCallbackInterfaceIdScanCallbackMethod3 uniffiCallbackInterfaceIdScanCallbackMethod3, UniffiCallbackInterfaceIdScanCallbackMethod4 uniffiCallbackInterfaceIdScanCallbackMethod4) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceIdScanCallbackMethod0, uniffiCallbackInterfaceIdScanCallbackMethod1, uniffiCallbackInterfaceIdScanCallbackMethod2, uniffiCallbackInterfaceIdScanCallbackMethod3, uniffiCallbackInterfaceIdScanCallbackMethod4);
        }
    }

    public UniffiVTableCallbackInterfaceIdScanCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceIdScanCallbackMethod0 uniffiCallbackInterfaceIdScanCallbackMethod0, UniffiCallbackInterfaceIdScanCallbackMethod1 uniffiCallbackInterfaceIdScanCallbackMethod1, UniffiCallbackInterfaceIdScanCallbackMethod2 uniffiCallbackInterfaceIdScanCallbackMethod2, UniffiCallbackInterfaceIdScanCallbackMethod3 uniffiCallbackInterfaceIdScanCallbackMethod3, UniffiCallbackInterfaceIdScanCallbackMethod4 uniffiCallbackInterfaceIdScanCallbackMethod4) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.onFrameSelected = uniffiCallbackInterfaceIdScanCallbackMethod0;
        this.onAutofocus = uniffiCallbackInterfaceIdScanCallbackMethod1;
        this.onFrameResponse = uniffiCallbackInterfaceIdScanCallbackMethod2;
        this.onComplete = uniffiCallbackInterfaceIdScanCallbackMethod3;
        this.onDebugData = uniffiCallbackInterfaceIdScanCallbackMethod4;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceIdScanCallback uniffiVTableCallbackInterfaceIdScanCallback) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceIdScanCallback, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceIdScanCallback.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceIdScanCallback.uniffiClone;
        this.onFrameSelected = uniffiVTableCallbackInterfaceIdScanCallback.onFrameSelected;
        this.onAutofocus = uniffiVTableCallbackInterfaceIdScanCallback.onAutofocus;
        this.onFrameResponse = uniffiVTableCallbackInterfaceIdScanCallback.onFrameResponse;
        this.onComplete = uniffiVTableCallbackInterfaceIdScanCallback.onComplete;
        this.onDebugData = uniffiVTableCallbackInterfaceIdScanCallback.onDebugData;
    }
}
