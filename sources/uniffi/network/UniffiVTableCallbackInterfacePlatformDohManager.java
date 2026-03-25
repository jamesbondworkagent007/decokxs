package uniffi.network;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "setCorDomain", "setH5CorDomain", "clearCorDomain"})
public class UniffiVTableCallbackInterfacePlatformDohManager extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfacePlatformDohManagerMethod2 clearCorDomain;
    public UniffiCallbackInterfacePlatformDohManagerMethod0 setCorDomain;
    public UniffiCallbackInterfacePlatformDohManagerMethod1 setH5CorDomain;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfacePlatformDohManager() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r5v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r6v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod0) : (r7v0 uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod0))
  (wrap:uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod1) : (r8v0 uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod1))
  (wrap:uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod2) : (r9v0 uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod2))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod0, uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod1, uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod2):void (m)] (LINE:384) call: uniffi.network.UniffiVTableCallbackInterfacePlatformDohManager.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod0, uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod1, uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod2):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfacePlatformDohManager(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePlatformDohManagerMethod0 uniffiCallbackInterfacePlatformDohManagerMethod0, UniffiCallbackInterfacePlatformDohManagerMethod1 uniffiCallbackInterfacePlatformDohManagerMethod1, UniffiCallbackInterfacePlatformDohManagerMethod2 uniffiCallbackInterfacePlatformDohManagerMethod2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfacePlatformDohManagerMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfacePlatformDohManagerMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfacePlatformDohManagerMethod2);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfacePlatformDohManager implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r5v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r6v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod0) : (r7v0 uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod0))
  (wrap:uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod1) : (r8v0 uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod1))
  (wrap:uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod2) : (r9v0 uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod2))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod0, uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod1, uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod2):void (m)] (LINE:391) call: uniffi.network.UniffiVTableCallbackInterfacePlatformDohManager.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod0, uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod1, uniffi.network.UniffiCallbackInterfacePlatformDohManagerMethod2):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePlatformDohManagerMethod0 uniffiCallbackInterfacePlatformDohManagerMethod0, UniffiCallbackInterfacePlatformDohManagerMethod1 uniffiCallbackInterfacePlatformDohManagerMethod1, UniffiCallbackInterfacePlatformDohManagerMethod2 uniffiCallbackInterfacePlatformDohManagerMethod2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfacePlatformDohManagerMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfacePlatformDohManagerMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfacePlatformDohManagerMethod2);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePlatformDohManagerMethod0 uniffiCallbackInterfacePlatformDohManagerMethod0, UniffiCallbackInterfacePlatformDohManagerMethod1 uniffiCallbackInterfacePlatformDohManagerMethod1, UniffiCallbackInterfacePlatformDohManagerMethod2 uniffiCallbackInterfacePlatformDohManagerMethod2) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfacePlatformDohManagerMethod0, uniffiCallbackInterfacePlatformDohManagerMethod1, uniffiCallbackInterfacePlatformDohManagerMethod2);
        }
    }

    public UniffiVTableCallbackInterfacePlatformDohManager(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePlatformDohManagerMethod0 uniffiCallbackInterfacePlatformDohManagerMethod0, UniffiCallbackInterfacePlatformDohManagerMethod1 uniffiCallbackInterfacePlatformDohManagerMethod1, UniffiCallbackInterfacePlatformDohManagerMethod2 uniffiCallbackInterfacePlatformDohManagerMethod2) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.setCorDomain = uniffiCallbackInterfacePlatformDohManagerMethod0;
        this.setH5CorDomain = uniffiCallbackInterfacePlatformDohManagerMethod1;
        this.clearCorDomain = uniffiCallbackInterfacePlatformDohManagerMethod2;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfacePlatformDohManager uniffiVTableCallbackInterfacePlatformDohManager) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfacePlatformDohManager, "");
        this.uniffiFree = uniffiVTableCallbackInterfacePlatformDohManager.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfacePlatformDohManager.uniffiClone;
        this.setCorDomain = uniffiVTableCallbackInterfacePlatformDohManager.setCorDomain;
        this.setH5CorDomain = uniffiVTableCallbackInterfacePlatformDohManager.setH5CorDomain;
        this.clearCorDomain = uniffiVTableCallbackInterfacePlatformDohManager.clearCorDomain;
    }
}
