package uniffi.environment;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "getDeviceId", "getDeviceName", "getDeviceModel", "getSystemName", "getSystemVersion"})
public class UniffiVTableCallbackInterfaceDeviceInfoInterface extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceDeviceInfoInterfaceMethod0 getDeviceId;
    public UniffiCallbackInterfaceDeviceInfoInterfaceMethod2 getDeviceModel;
    public UniffiCallbackInterfaceDeviceInfoInterfaceMethod1 getDeviceName;
    public UniffiCallbackInterfaceDeviceInfoInterfaceMethod3 getSystemName;
    public UniffiCallbackInterfaceDeviceInfoInterfaceMethod4 getSystemVersion;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceDeviceInfoInterface() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r7v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r8v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod0) : (r9v0 uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod0))
  (wrap:uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod1) : (r10v0 uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod1))
  (wrap:uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod2) : (r11v0 uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod2))
  (wrap:uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod3:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod3) : (r12v0 uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod3))
  (wrap:uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod4:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod4) : (r13v0 uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod4))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod0, uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod1, uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod2, uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod3, uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod4):void (m)] (LINE:119) call: uniffi.environment.UniffiVTableCallbackInterfaceDeviceInfoInterface.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod0, uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod1, uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod2, uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod3, uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod4):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceDeviceInfoInterface(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceDeviceInfoInterfaceMethod0 uniffiCallbackInterfaceDeviceInfoInterfaceMethod0, UniffiCallbackInterfaceDeviceInfoInterfaceMethod1 uniffiCallbackInterfaceDeviceInfoInterfaceMethod1, UniffiCallbackInterfaceDeviceInfoInterfaceMethod2 uniffiCallbackInterfaceDeviceInfoInterfaceMethod2, UniffiCallbackInterfaceDeviceInfoInterfaceMethod3 uniffiCallbackInterfaceDeviceInfoInterfaceMethod3, UniffiCallbackInterfaceDeviceInfoInterfaceMethod4 uniffiCallbackInterfaceDeviceInfoInterfaceMethod4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceDeviceInfoInterfaceMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceDeviceInfoInterfaceMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceDeviceInfoInterfaceMethod2, (i & 32) != 0 ? null : uniffiCallbackInterfaceDeviceInfoInterfaceMethod3, (i & 64) != 0 ? null : uniffiCallbackInterfaceDeviceInfoInterfaceMethod4);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceDeviceInfoInterface implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r7v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r8v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod0) : (r9v0 uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod0))
  (wrap:uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod1) : (r10v0 uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod1))
  (wrap:uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod2) : (r11v0 uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod2))
  (wrap:uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod3:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod3) : (r12v0 uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod3))
  (wrap:uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod4:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod4) : (r13v0 uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod4))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod0, uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod1, uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod2, uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod3, uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod4):void (m)] (LINE:128) call: uniffi.environment.UniffiVTableCallbackInterfaceDeviceInfoInterface.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod0, uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod1, uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod2, uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod3, uniffi.environment.UniffiCallbackInterfaceDeviceInfoInterfaceMethod4):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceDeviceInfoInterfaceMethod0 uniffiCallbackInterfaceDeviceInfoInterfaceMethod0, UniffiCallbackInterfaceDeviceInfoInterfaceMethod1 uniffiCallbackInterfaceDeviceInfoInterfaceMethod1, UniffiCallbackInterfaceDeviceInfoInterfaceMethod2 uniffiCallbackInterfaceDeviceInfoInterfaceMethod2, UniffiCallbackInterfaceDeviceInfoInterfaceMethod3 uniffiCallbackInterfaceDeviceInfoInterfaceMethod3, UniffiCallbackInterfaceDeviceInfoInterfaceMethod4 uniffiCallbackInterfaceDeviceInfoInterfaceMethod4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceDeviceInfoInterfaceMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceDeviceInfoInterfaceMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceDeviceInfoInterfaceMethod2, (i & 32) != 0 ? null : uniffiCallbackInterfaceDeviceInfoInterfaceMethod3, (i & 64) != 0 ? null : uniffiCallbackInterfaceDeviceInfoInterfaceMethod4);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceDeviceInfoInterfaceMethod0 uniffiCallbackInterfaceDeviceInfoInterfaceMethod0, UniffiCallbackInterfaceDeviceInfoInterfaceMethod1 uniffiCallbackInterfaceDeviceInfoInterfaceMethod1, UniffiCallbackInterfaceDeviceInfoInterfaceMethod2 uniffiCallbackInterfaceDeviceInfoInterfaceMethod2, UniffiCallbackInterfaceDeviceInfoInterfaceMethod3 uniffiCallbackInterfaceDeviceInfoInterfaceMethod3, UniffiCallbackInterfaceDeviceInfoInterfaceMethod4 uniffiCallbackInterfaceDeviceInfoInterfaceMethod4) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceDeviceInfoInterfaceMethod0, uniffiCallbackInterfaceDeviceInfoInterfaceMethod1, uniffiCallbackInterfaceDeviceInfoInterfaceMethod2, uniffiCallbackInterfaceDeviceInfoInterfaceMethod3, uniffiCallbackInterfaceDeviceInfoInterfaceMethod4);
        }
    }

    public UniffiVTableCallbackInterfaceDeviceInfoInterface(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceDeviceInfoInterfaceMethod0 uniffiCallbackInterfaceDeviceInfoInterfaceMethod0, UniffiCallbackInterfaceDeviceInfoInterfaceMethod1 uniffiCallbackInterfaceDeviceInfoInterfaceMethod1, UniffiCallbackInterfaceDeviceInfoInterfaceMethod2 uniffiCallbackInterfaceDeviceInfoInterfaceMethod2, UniffiCallbackInterfaceDeviceInfoInterfaceMethod3 uniffiCallbackInterfaceDeviceInfoInterfaceMethod3, UniffiCallbackInterfaceDeviceInfoInterfaceMethod4 uniffiCallbackInterfaceDeviceInfoInterfaceMethod4) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.getDeviceId = uniffiCallbackInterfaceDeviceInfoInterfaceMethod0;
        this.getDeviceName = uniffiCallbackInterfaceDeviceInfoInterfaceMethod1;
        this.getDeviceModel = uniffiCallbackInterfaceDeviceInfoInterfaceMethod2;
        this.getSystemName = uniffiCallbackInterfaceDeviceInfoInterfaceMethod3;
        this.getSystemVersion = uniffiCallbackInterfaceDeviceInfoInterfaceMethod4;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceDeviceInfoInterface uniffiVTableCallbackInterfaceDeviceInfoInterface) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceDeviceInfoInterface, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceDeviceInfoInterface.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceDeviceInfoInterface.uniffiClone;
        this.getDeviceId = uniffiVTableCallbackInterfaceDeviceInfoInterface.getDeviceId;
        this.getDeviceName = uniffiVTableCallbackInterfaceDeviceInfoInterface.getDeviceName;
        this.getDeviceModel = uniffiVTableCallbackInterfaceDeviceInfoInterface.getDeviceModel;
        this.getSystemName = uniffiVTableCallbackInterfaceDeviceInfoInterface.getSystemName;
        this.getSystemVersion = uniffiVTableCallbackInterfaceDeviceInfoInterface.getSystemVersion;
    }
}
