package uniffi.upgrade;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes14.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "getAppMode", "getBundleId", "getAppDisplayMode"})
public class UniffiVTableCallbackInterfaceUpgradeContextInterface extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceUpgradeContextInterfaceMethod2 getAppDisplayMode;
    public UniffiCallbackInterfaceUpgradeContextInterfaceMethod0 getAppMode;
    public UniffiCallbackInterfaceUpgradeContextInterfaceMethod1 getBundleId;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceUpgradeContextInterface() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r5v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r6v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod0) : (r7v0 uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod0))
  (wrap:uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod1) : (r8v0 uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod1))
  (wrap:uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod2) : (r9v0 uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod2))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod0, uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod1, uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod2):void (m)] (LINE:142) call: uniffi.upgrade.UniffiVTableCallbackInterfaceUpgradeContextInterface.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod0, uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod1, uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod2):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceUpgradeContextInterface(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceUpgradeContextInterfaceMethod0 uniffiCallbackInterfaceUpgradeContextInterfaceMethod0, UniffiCallbackInterfaceUpgradeContextInterfaceMethod1 uniffiCallbackInterfaceUpgradeContextInterfaceMethod1, UniffiCallbackInterfaceUpgradeContextInterfaceMethod2 uniffiCallbackInterfaceUpgradeContextInterfaceMethod2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceUpgradeContextInterfaceMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceUpgradeContextInterfaceMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceUpgradeContextInterfaceMethod2);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceUpgradeContextInterface implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r5v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r6v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod0) : (r7v0 uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod0))
  (wrap:uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod1) : (r8v0 uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod1))
  (wrap:uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod2) : (r9v0 uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod2))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod0, uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod1, uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod2):void (m)] (LINE:149) call: uniffi.upgrade.UniffiVTableCallbackInterfaceUpgradeContextInterface.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod0, uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod1, uniffi.upgrade.UniffiCallbackInterfaceUpgradeContextInterfaceMethod2):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceUpgradeContextInterfaceMethod0 uniffiCallbackInterfaceUpgradeContextInterfaceMethod0, UniffiCallbackInterfaceUpgradeContextInterfaceMethod1 uniffiCallbackInterfaceUpgradeContextInterfaceMethod1, UniffiCallbackInterfaceUpgradeContextInterfaceMethod2 uniffiCallbackInterfaceUpgradeContextInterfaceMethod2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceUpgradeContextInterfaceMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceUpgradeContextInterfaceMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceUpgradeContextInterfaceMethod2);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceUpgradeContextInterfaceMethod0 uniffiCallbackInterfaceUpgradeContextInterfaceMethod0, UniffiCallbackInterfaceUpgradeContextInterfaceMethod1 uniffiCallbackInterfaceUpgradeContextInterfaceMethod1, UniffiCallbackInterfaceUpgradeContextInterfaceMethod2 uniffiCallbackInterfaceUpgradeContextInterfaceMethod2) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceUpgradeContextInterfaceMethod0, uniffiCallbackInterfaceUpgradeContextInterfaceMethod1, uniffiCallbackInterfaceUpgradeContextInterfaceMethod2);
        }
    }

    public UniffiVTableCallbackInterfaceUpgradeContextInterface(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceUpgradeContextInterfaceMethod0 uniffiCallbackInterfaceUpgradeContextInterfaceMethod0, UniffiCallbackInterfaceUpgradeContextInterfaceMethod1 uniffiCallbackInterfaceUpgradeContextInterfaceMethod1, UniffiCallbackInterfaceUpgradeContextInterfaceMethod2 uniffiCallbackInterfaceUpgradeContextInterfaceMethod2) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.getAppMode = uniffiCallbackInterfaceUpgradeContextInterfaceMethod0;
        this.getBundleId = uniffiCallbackInterfaceUpgradeContextInterfaceMethod1;
        this.getAppDisplayMode = uniffiCallbackInterfaceUpgradeContextInterfaceMethod2;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceUpgradeContextInterface uniffiVTableCallbackInterfaceUpgradeContextInterface) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceUpgradeContextInterface, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceUpgradeContextInterface.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceUpgradeContextInterface.uniffiClone;
        this.getAppMode = uniffiVTableCallbackInterfaceUpgradeContextInterface.getAppMode;
        this.getBundleId = uniffiVTableCallbackInterfaceUpgradeContextInterface.getBundleId;
        this.getAppDisplayMode = uniffiVTableCallbackInterfaceUpgradeContextInterface.getAppDisplayMode;
    }
}
