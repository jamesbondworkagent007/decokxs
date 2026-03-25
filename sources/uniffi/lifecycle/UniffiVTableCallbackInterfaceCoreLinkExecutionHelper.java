package uniffi.lifecycle;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "getContextRefer", "openLink", "clearContext"})
public class UniffiVTableCallbackInterfaceCoreLinkExecutionHelper extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceCoreLinkExecutionHelperMethod2 clearContext;
    public UniffiCallbackInterfaceCoreLinkExecutionHelperMethod0 getContextRefer;
    public UniffiCallbackInterfaceCoreLinkExecutionHelperMethod1 openLink;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceCoreLinkExecutionHelper() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r5v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r6v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod0) : (r7v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod0))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod1) : (r8v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod1))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod2) : (r9v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod2))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod0, uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod1, uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod2):void (m)] (LINE:406) call: uniffi.lifecycle.UniffiVTableCallbackInterfaceCoreLinkExecutionHelper.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod0, uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod1, uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod2):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceCoreLinkExecutionHelper(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCoreLinkExecutionHelperMethod0 uniffiCallbackInterfaceCoreLinkExecutionHelperMethod0, UniffiCallbackInterfaceCoreLinkExecutionHelperMethod1 uniffiCallbackInterfaceCoreLinkExecutionHelperMethod1, UniffiCallbackInterfaceCoreLinkExecutionHelperMethod2 uniffiCallbackInterfaceCoreLinkExecutionHelperMethod2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceCoreLinkExecutionHelperMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceCoreLinkExecutionHelperMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceCoreLinkExecutionHelperMethod2);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceCoreLinkExecutionHelper implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r5v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r6v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod0) : (r7v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod0))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod1) : (r8v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod1))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod2) : (r9v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod2))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod0, uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod1, uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod2):void (m)] (LINE:413) call: uniffi.lifecycle.UniffiVTableCallbackInterfaceCoreLinkExecutionHelper.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod0, uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod1, uniffi.lifecycle.UniffiCallbackInterfaceCoreLinkExecutionHelperMethod2):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCoreLinkExecutionHelperMethod0 uniffiCallbackInterfaceCoreLinkExecutionHelperMethod0, UniffiCallbackInterfaceCoreLinkExecutionHelperMethod1 uniffiCallbackInterfaceCoreLinkExecutionHelperMethod1, UniffiCallbackInterfaceCoreLinkExecutionHelperMethod2 uniffiCallbackInterfaceCoreLinkExecutionHelperMethod2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceCoreLinkExecutionHelperMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceCoreLinkExecutionHelperMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceCoreLinkExecutionHelperMethod2);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCoreLinkExecutionHelperMethod0 uniffiCallbackInterfaceCoreLinkExecutionHelperMethod0, UniffiCallbackInterfaceCoreLinkExecutionHelperMethod1 uniffiCallbackInterfaceCoreLinkExecutionHelperMethod1, UniffiCallbackInterfaceCoreLinkExecutionHelperMethod2 uniffiCallbackInterfaceCoreLinkExecutionHelperMethod2) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceCoreLinkExecutionHelperMethod0, uniffiCallbackInterfaceCoreLinkExecutionHelperMethod1, uniffiCallbackInterfaceCoreLinkExecutionHelperMethod2);
        }
    }

    public UniffiVTableCallbackInterfaceCoreLinkExecutionHelper(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCoreLinkExecutionHelperMethod0 uniffiCallbackInterfaceCoreLinkExecutionHelperMethod0, UniffiCallbackInterfaceCoreLinkExecutionHelperMethod1 uniffiCallbackInterfaceCoreLinkExecutionHelperMethod1, UniffiCallbackInterfaceCoreLinkExecutionHelperMethod2 uniffiCallbackInterfaceCoreLinkExecutionHelperMethod2) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.getContextRefer = uniffiCallbackInterfaceCoreLinkExecutionHelperMethod0;
        this.openLink = uniffiCallbackInterfaceCoreLinkExecutionHelperMethod1;
        this.clearContext = uniffiCallbackInterfaceCoreLinkExecutionHelperMethod2;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceCoreLinkExecutionHelper uniffiVTableCallbackInterfaceCoreLinkExecutionHelper) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceCoreLinkExecutionHelper, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceCoreLinkExecutionHelper.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceCoreLinkExecutionHelper.uniffiClone;
        this.getContextRefer = uniffiVTableCallbackInterfaceCoreLinkExecutionHelper.getContextRefer;
        this.openLink = uniffiVTableCallbackInterfaceCoreLinkExecutionHelper.openLink;
        this.clearContext = uniffiVTableCallbackInterfaceCoreLinkExecutionHelper.clearContext;
    }
}
