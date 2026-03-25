package uniffi.growth;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "fetchDisplaySharePlatformList", "getCachedSharePlatformList", "fetchShareComponentConfig", "generateUniversalLink"})
public class UniffiVTableCallbackInterfaceSharePlatformManager extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceSharePlatformManagerMethod0 fetchDisplaySharePlatformList;
    public UniffiCallbackInterfaceSharePlatformManagerMethod2 fetchShareComponentConfig;
    public UniffiCallbackInterfaceSharePlatformManagerMethod3 generateUniversalLink;
    public UniffiCallbackInterfaceSharePlatformManagerMethod1 getCachedSharePlatformList;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceSharePlatformManager() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r6v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r7v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod0) : (r8v0 uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod0))
  (wrap:uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod1) : (r9v0 uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod1))
  (wrap:uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod2) : (r10v0 uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod2))
  (wrap:uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod3:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod3) : (r11v0 uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod3))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod0, uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod1, uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod2, uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod3):void (m)] (LINE:198) call: uniffi.growth.UniffiVTableCallbackInterfaceSharePlatformManager.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod0, uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod1, uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod2, uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod3):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceSharePlatformManager(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceSharePlatformManagerMethod0 uniffiCallbackInterfaceSharePlatformManagerMethod0, UniffiCallbackInterfaceSharePlatformManagerMethod1 uniffiCallbackInterfaceSharePlatformManagerMethod1, UniffiCallbackInterfaceSharePlatformManagerMethod2 uniffiCallbackInterfaceSharePlatformManagerMethod2, UniffiCallbackInterfaceSharePlatformManagerMethod3 uniffiCallbackInterfaceSharePlatformManagerMethod3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceSharePlatformManagerMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceSharePlatformManagerMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceSharePlatformManagerMethod2, (i & 32) != 0 ? null : uniffiCallbackInterfaceSharePlatformManagerMethod3);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceSharePlatformManager implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r6v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r7v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod0) : (r8v0 uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod0))
  (wrap:uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod1) : (r9v0 uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod1))
  (wrap:uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod2) : (r10v0 uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod2))
  (wrap:uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod3:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod3) : (r11v0 uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod3))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod0, uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod1, uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod2, uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod3):void (m)] (LINE:206) call: uniffi.growth.UniffiVTableCallbackInterfaceSharePlatformManager.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod0, uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod1, uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod2, uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod3):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceSharePlatformManagerMethod0 uniffiCallbackInterfaceSharePlatformManagerMethod0, UniffiCallbackInterfaceSharePlatformManagerMethod1 uniffiCallbackInterfaceSharePlatformManagerMethod1, UniffiCallbackInterfaceSharePlatformManagerMethod2 uniffiCallbackInterfaceSharePlatformManagerMethod2, UniffiCallbackInterfaceSharePlatformManagerMethod3 uniffiCallbackInterfaceSharePlatformManagerMethod3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceSharePlatformManagerMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceSharePlatformManagerMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceSharePlatformManagerMethod2, (i & 32) != 0 ? null : uniffiCallbackInterfaceSharePlatformManagerMethod3);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceSharePlatformManagerMethod0 uniffiCallbackInterfaceSharePlatformManagerMethod0, UniffiCallbackInterfaceSharePlatformManagerMethod1 uniffiCallbackInterfaceSharePlatformManagerMethod1, UniffiCallbackInterfaceSharePlatformManagerMethod2 uniffiCallbackInterfaceSharePlatformManagerMethod2, UniffiCallbackInterfaceSharePlatformManagerMethod3 uniffiCallbackInterfaceSharePlatformManagerMethod3) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceSharePlatformManagerMethod0, uniffiCallbackInterfaceSharePlatformManagerMethod1, uniffiCallbackInterfaceSharePlatformManagerMethod2, uniffiCallbackInterfaceSharePlatformManagerMethod3);
        }
    }

    public UniffiVTableCallbackInterfaceSharePlatformManager(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceSharePlatformManagerMethod0 uniffiCallbackInterfaceSharePlatformManagerMethod0, UniffiCallbackInterfaceSharePlatformManagerMethod1 uniffiCallbackInterfaceSharePlatformManagerMethod1, UniffiCallbackInterfaceSharePlatformManagerMethod2 uniffiCallbackInterfaceSharePlatformManagerMethod2, UniffiCallbackInterfaceSharePlatformManagerMethod3 uniffiCallbackInterfaceSharePlatformManagerMethod3) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.fetchDisplaySharePlatformList = uniffiCallbackInterfaceSharePlatformManagerMethod0;
        this.getCachedSharePlatformList = uniffiCallbackInterfaceSharePlatformManagerMethod1;
        this.fetchShareComponentConfig = uniffiCallbackInterfaceSharePlatformManagerMethod2;
        this.generateUniversalLink = uniffiCallbackInterfaceSharePlatformManagerMethod3;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceSharePlatformManager uniffiVTableCallbackInterfaceSharePlatformManager) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceSharePlatformManager, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceSharePlatformManager.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceSharePlatformManager.uniffiClone;
        this.fetchDisplaySharePlatformList = uniffiVTableCallbackInterfaceSharePlatformManager.fetchDisplaySharePlatformList;
        this.getCachedSharePlatformList = uniffiVTableCallbackInterfaceSharePlatformManager.getCachedSharePlatformList;
        this.fetchShareComponentConfig = uniffiVTableCallbackInterfaceSharePlatformManager.fetchShareComponentConfig;
        this.generateUniversalLink = uniffiVTableCallbackInterfaceSharePlatformManager.generateUniversalLink;
    }
}
