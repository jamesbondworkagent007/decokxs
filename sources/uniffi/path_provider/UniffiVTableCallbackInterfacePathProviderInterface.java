package uniffi.path_provider;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "getTemporaryDirectory", "getApplicationDocumentsDirectory", "getApplicationSupportDirectory", "getApplicationCacheDirectory", "getDownloadsDirectory"})
public class UniffiVTableCallbackInterfacePathProviderInterface extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfacePathProviderInterfaceMethod3 getApplicationCacheDirectory;
    public UniffiCallbackInterfacePathProviderInterfaceMethod1 getApplicationDocumentsDirectory;
    public UniffiCallbackInterfacePathProviderInterfaceMethod2 getApplicationSupportDirectory;
    public UniffiCallbackInterfacePathProviderInterfaceMethod4 getDownloadsDirectory;
    public UniffiCallbackInterfacePathProviderInterfaceMethod0 getTemporaryDirectory;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfacePathProviderInterface() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r7v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r8v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod0) : (r9v0 uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod0))
  (wrap:uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod1) : (r10v0 uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod1))
  (wrap:uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod2) : (r11v0 uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod2))
  (wrap:uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod3:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod3) : (r12v0 uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod3))
  (wrap:uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod4:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod4) : (r13v0 uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod4))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod0, uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod1, uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod2, uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod3, uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod4):void (m)] (LINE:73) call: uniffi.path_provider.UniffiVTableCallbackInterfacePathProviderInterface.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod0, uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod1, uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod2, uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod3, uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod4):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfacePathProviderInterface(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePathProviderInterfaceMethod0 uniffiCallbackInterfacePathProviderInterfaceMethod0, UniffiCallbackInterfacePathProviderInterfaceMethod1 uniffiCallbackInterfacePathProviderInterfaceMethod1, UniffiCallbackInterfacePathProviderInterfaceMethod2 uniffiCallbackInterfacePathProviderInterfaceMethod2, UniffiCallbackInterfacePathProviderInterfaceMethod3 uniffiCallbackInterfacePathProviderInterfaceMethod3, UniffiCallbackInterfacePathProviderInterfaceMethod4 uniffiCallbackInterfacePathProviderInterfaceMethod4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfacePathProviderInterfaceMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfacePathProviderInterfaceMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfacePathProviderInterfaceMethod2, (i & 32) != 0 ? null : uniffiCallbackInterfacePathProviderInterfaceMethod3, (i & 64) != 0 ? null : uniffiCallbackInterfacePathProviderInterfaceMethod4);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfacePathProviderInterface implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r7v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r8v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod0) : (r9v0 uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod0))
  (wrap:uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod1) : (r10v0 uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod1))
  (wrap:uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod2) : (r11v0 uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod2))
  (wrap:uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod3:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod3) : (r12v0 uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod3))
  (wrap:uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod4:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod4) : (r13v0 uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod4))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod0, uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod1, uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod2, uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod3, uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod4):void (m)] (LINE:82) call: uniffi.path_provider.UniffiVTableCallbackInterfacePathProviderInterface.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod0, uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod1, uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod2, uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod3, uniffi.path_provider.UniffiCallbackInterfacePathProviderInterfaceMethod4):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePathProviderInterfaceMethod0 uniffiCallbackInterfacePathProviderInterfaceMethod0, UniffiCallbackInterfacePathProviderInterfaceMethod1 uniffiCallbackInterfacePathProviderInterfaceMethod1, UniffiCallbackInterfacePathProviderInterfaceMethod2 uniffiCallbackInterfacePathProviderInterfaceMethod2, UniffiCallbackInterfacePathProviderInterfaceMethod3 uniffiCallbackInterfacePathProviderInterfaceMethod3, UniffiCallbackInterfacePathProviderInterfaceMethod4 uniffiCallbackInterfacePathProviderInterfaceMethod4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfacePathProviderInterfaceMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfacePathProviderInterfaceMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfacePathProviderInterfaceMethod2, (i & 32) != 0 ? null : uniffiCallbackInterfacePathProviderInterfaceMethod3, (i & 64) != 0 ? null : uniffiCallbackInterfacePathProviderInterfaceMethod4);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePathProviderInterfaceMethod0 uniffiCallbackInterfacePathProviderInterfaceMethod0, UniffiCallbackInterfacePathProviderInterfaceMethod1 uniffiCallbackInterfacePathProviderInterfaceMethod1, UniffiCallbackInterfacePathProviderInterfaceMethod2 uniffiCallbackInterfacePathProviderInterfaceMethod2, UniffiCallbackInterfacePathProviderInterfaceMethod3 uniffiCallbackInterfacePathProviderInterfaceMethod3, UniffiCallbackInterfacePathProviderInterfaceMethod4 uniffiCallbackInterfacePathProviderInterfaceMethod4) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfacePathProviderInterfaceMethod0, uniffiCallbackInterfacePathProviderInterfaceMethod1, uniffiCallbackInterfacePathProviderInterfaceMethod2, uniffiCallbackInterfacePathProviderInterfaceMethod3, uniffiCallbackInterfacePathProviderInterfaceMethod4);
        }
    }

    public UniffiVTableCallbackInterfacePathProviderInterface(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePathProviderInterfaceMethod0 uniffiCallbackInterfacePathProviderInterfaceMethod0, UniffiCallbackInterfacePathProviderInterfaceMethod1 uniffiCallbackInterfacePathProviderInterfaceMethod1, UniffiCallbackInterfacePathProviderInterfaceMethod2 uniffiCallbackInterfacePathProviderInterfaceMethod2, UniffiCallbackInterfacePathProviderInterfaceMethod3 uniffiCallbackInterfacePathProviderInterfaceMethod3, UniffiCallbackInterfacePathProviderInterfaceMethod4 uniffiCallbackInterfacePathProviderInterfaceMethod4) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.getTemporaryDirectory = uniffiCallbackInterfacePathProviderInterfaceMethod0;
        this.getApplicationDocumentsDirectory = uniffiCallbackInterfacePathProviderInterfaceMethod1;
        this.getApplicationSupportDirectory = uniffiCallbackInterfacePathProviderInterfaceMethod2;
        this.getApplicationCacheDirectory = uniffiCallbackInterfacePathProviderInterfaceMethod3;
        this.getDownloadsDirectory = uniffiCallbackInterfacePathProviderInterfaceMethod4;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfacePathProviderInterface uniffiVTableCallbackInterfacePathProviderInterface) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfacePathProviderInterface, "");
        this.uniffiFree = uniffiVTableCallbackInterfacePathProviderInterface.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfacePathProviderInterface.uniffiClone;
        this.getTemporaryDirectory = uniffiVTableCallbackInterfacePathProviderInterface.getTemporaryDirectory;
        this.getApplicationDocumentsDirectory = uniffiVTableCallbackInterfacePathProviderInterface.getApplicationDocumentsDirectory;
        this.getApplicationSupportDirectory = uniffiVTableCallbackInterfacePathProviderInterface.getApplicationSupportDirectory;
        this.getApplicationCacheDirectory = uniffiVTableCallbackInterfacePathProviderInterface.getApplicationCacheDirectory;
        this.getDownloadsDirectory = uniffiVTableCallbackInterfacePathProviderInterface.getDownloadsDirectory;
    }
}
