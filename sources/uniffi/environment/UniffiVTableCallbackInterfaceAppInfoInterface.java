package uniffi.environment;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "getBundleId", "getAppName", "getAppVersion", "getAppVersionCode", "getAppType"})
public class UniffiVTableCallbackInterfaceAppInfoInterface extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceAppInfoInterfaceMethod1 getAppName;
    public UniffiCallbackInterfaceAppInfoInterfaceMethod4 getAppType;
    public UniffiCallbackInterfaceAppInfoInterfaceMethod2 getAppVersion;
    public UniffiCallbackInterfaceAppInfoInterfaceMethod3 getAppVersionCode;
    public UniffiCallbackInterfaceAppInfoInterfaceMethod0 getBundleId;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceAppInfoInterface() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r7v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r8v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod0) : (r9v0 uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod0))
  (wrap:uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod1) : (r10v0 uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod1))
  (wrap:uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod2) : (r11v0 uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod2))
  (wrap:uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod3:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod3) : (r12v0 uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod3))
  (wrap:uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod4:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod4) : (r13v0 uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod4))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod0, uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod1, uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod2, uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod3, uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod4):void (m)] (LINE:88) call: uniffi.environment.UniffiVTableCallbackInterfaceAppInfoInterface.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod0, uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod1, uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod2, uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod3, uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod4):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceAppInfoInterface(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceAppInfoInterfaceMethod0 uniffiCallbackInterfaceAppInfoInterfaceMethod0, UniffiCallbackInterfaceAppInfoInterfaceMethod1 uniffiCallbackInterfaceAppInfoInterfaceMethod1, UniffiCallbackInterfaceAppInfoInterfaceMethod2 uniffiCallbackInterfaceAppInfoInterfaceMethod2, UniffiCallbackInterfaceAppInfoInterfaceMethod3 uniffiCallbackInterfaceAppInfoInterfaceMethod3, UniffiCallbackInterfaceAppInfoInterfaceMethod4 uniffiCallbackInterfaceAppInfoInterfaceMethod4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceAppInfoInterfaceMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceAppInfoInterfaceMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceAppInfoInterfaceMethod2, (i & 32) != 0 ? null : uniffiCallbackInterfaceAppInfoInterfaceMethod3, (i & 64) != 0 ? null : uniffiCallbackInterfaceAppInfoInterfaceMethod4);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceAppInfoInterface implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r7v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r8v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod0) : (r9v0 uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod0))
  (wrap:uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod1) : (r10v0 uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod1))
  (wrap:uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod2) : (r11v0 uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod2))
  (wrap:uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod3:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod3) : (r12v0 uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod3))
  (wrap:uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod4:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod4) : (r13v0 uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod4))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod0, uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod1, uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod2, uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod3, uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod4):void (m)] (LINE:97) call: uniffi.environment.UniffiVTableCallbackInterfaceAppInfoInterface.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod0, uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod1, uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod2, uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod3, uniffi.environment.UniffiCallbackInterfaceAppInfoInterfaceMethod4):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceAppInfoInterfaceMethod0 uniffiCallbackInterfaceAppInfoInterfaceMethod0, UniffiCallbackInterfaceAppInfoInterfaceMethod1 uniffiCallbackInterfaceAppInfoInterfaceMethod1, UniffiCallbackInterfaceAppInfoInterfaceMethod2 uniffiCallbackInterfaceAppInfoInterfaceMethod2, UniffiCallbackInterfaceAppInfoInterfaceMethod3 uniffiCallbackInterfaceAppInfoInterfaceMethod3, UniffiCallbackInterfaceAppInfoInterfaceMethod4 uniffiCallbackInterfaceAppInfoInterfaceMethod4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceAppInfoInterfaceMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceAppInfoInterfaceMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceAppInfoInterfaceMethod2, (i & 32) != 0 ? null : uniffiCallbackInterfaceAppInfoInterfaceMethod3, (i & 64) != 0 ? null : uniffiCallbackInterfaceAppInfoInterfaceMethod4);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceAppInfoInterfaceMethod0 uniffiCallbackInterfaceAppInfoInterfaceMethod0, UniffiCallbackInterfaceAppInfoInterfaceMethod1 uniffiCallbackInterfaceAppInfoInterfaceMethod1, UniffiCallbackInterfaceAppInfoInterfaceMethod2 uniffiCallbackInterfaceAppInfoInterfaceMethod2, UniffiCallbackInterfaceAppInfoInterfaceMethod3 uniffiCallbackInterfaceAppInfoInterfaceMethod3, UniffiCallbackInterfaceAppInfoInterfaceMethod4 uniffiCallbackInterfaceAppInfoInterfaceMethod4) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceAppInfoInterfaceMethod0, uniffiCallbackInterfaceAppInfoInterfaceMethod1, uniffiCallbackInterfaceAppInfoInterfaceMethod2, uniffiCallbackInterfaceAppInfoInterfaceMethod3, uniffiCallbackInterfaceAppInfoInterfaceMethod4);
        }
    }

    public UniffiVTableCallbackInterfaceAppInfoInterface(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceAppInfoInterfaceMethod0 uniffiCallbackInterfaceAppInfoInterfaceMethod0, UniffiCallbackInterfaceAppInfoInterfaceMethod1 uniffiCallbackInterfaceAppInfoInterfaceMethod1, UniffiCallbackInterfaceAppInfoInterfaceMethod2 uniffiCallbackInterfaceAppInfoInterfaceMethod2, UniffiCallbackInterfaceAppInfoInterfaceMethod3 uniffiCallbackInterfaceAppInfoInterfaceMethod3, UniffiCallbackInterfaceAppInfoInterfaceMethod4 uniffiCallbackInterfaceAppInfoInterfaceMethod4) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.getBundleId = uniffiCallbackInterfaceAppInfoInterfaceMethod0;
        this.getAppName = uniffiCallbackInterfaceAppInfoInterfaceMethod1;
        this.getAppVersion = uniffiCallbackInterfaceAppInfoInterfaceMethod2;
        this.getAppVersionCode = uniffiCallbackInterfaceAppInfoInterfaceMethod3;
        this.getAppType = uniffiCallbackInterfaceAppInfoInterfaceMethod4;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceAppInfoInterface uniffiVTableCallbackInterfaceAppInfoInterface) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceAppInfoInterface, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceAppInfoInterface.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceAppInfoInterface.uniffiClone;
        this.getBundleId = uniffiVTableCallbackInterfaceAppInfoInterface.getBundleId;
        this.getAppName = uniffiVTableCallbackInterfaceAppInfoInterface.getAppName;
        this.getAppVersion = uniffiVTableCallbackInterfaceAppInfoInterface.getAppVersion;
        this.getAppVersionCode = uniffiVTableCallbackInterfaceAppInfoInterface.getAppVersionCode;
        this.getAppType = uniffiVTableCallbackInterfaceAppInfoInterface.getAppType;
    }
}
