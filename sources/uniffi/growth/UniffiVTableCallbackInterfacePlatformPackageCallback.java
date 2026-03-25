package uniffi.growth;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "isPackageInstalled", "filterAvailableSharePlatforms"})
public class UniffiVTableCallbackInterfacePlatformPackageCallback extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfacePlatformPackageCallbackMethod1 filterAvailableSharePlatforms;
    public UniffiCallbackInterfacePlatformPackageCallbackMethod0 isPackageInstalled;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfacePlatformPackageCallback() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.growth.UniffiCallbackInterfacePlatformPackageCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.growth.UniffiCallbackInterfacePlatformPackageCallbackMethod0) : (r4v0 uniffi.growth.UniffiCallbackInterfacePlatformPackageCallbackMethod0))
  (wrap:uniffi.growth.UniffiCallbackInterfacePlatformPackageCallbackMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.growth.UniffiCallbackInterfacePlatformPackageCallbackMethod1) : (r5v0 uniffi.growth.UniffiCallbackInterfacePlatformPackageCallbackMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.growth.UniffiCallbackInterfacePlatformPackageCallbackMethod0, uniffi.growth.UniffiCallbackInterfacePlatformPackageCallbackMethod1):void (m)] (LINE:107) call: uniffi.growth.UniffiVTableCallbackInterfacePlatformPackageCallback.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.growth.UniffiCallbackInterfacePlatformPackageCallbackMethod0, uniffi.growth.UniffiCallbackInterfacePlatformPackageCallbackMethod1):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfacePlatformPackageCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePlatformPackageCallbackMethod0 uniffiCallbackInterfacePlatformPackageCallbackMethod0, UniffiCallbackInterfacePlatformPackageCallbackMethod1 uniffiCallbackInterfacePlatformPackageCallbackMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfacePlatformPackageCallbackMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfacePlatformPackageCallbackMethod1);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfacePlatformPackageCallback implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.growth.UniffiCallbackInterfacePlatformPackageCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.growth.UniffiCallbackInterfacePlatformPackageCallbackMethod0) : (r4v0 uniffi.growth.UniffiCallbackInterfacePlatformPackageCallbackMethod0))
  (wrap:uniffi.growth.UniffiCallbackInterfacePlatformPackageCallbackMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.growth.UniffiCallbackInterfacePlatformPackageCallbackMethod1) : (r5v0 uniffi.growth.UniffiCallbackInterfacePlatformPackageCallbackMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.growth.UniffiCallbackInterfacePlatformPackageCallbackMethod0, uniffi.growth.UniffiCallbackInterfacePlatformPackageCallbackMethod1):void (m)] (LINE:113) call: uniffi.growth.UniffiVTableCallbackInterfacePlatformPackageCallback.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.growth.UniffiCallbackInterfacePlatformPackageCallbackMethod0, uniffi.growth.UniffiCallbackInterfacePlatformPackageCallbackMethod1):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePlatformPackageCallbackMethod0 uniffiCallbackInterfacePlatformPackageCallbackMethod0, UniffiCallbackInterfacePlatformPackageCallbackMethod1 uniffiCallbackInterfacePlatformPackageCallbackMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfacePlatformPackageCallbackMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfacePlatformPackageCallbackMethod1);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePlatformPackageCallbackMethod0 uniffiCallbackInterfacePlatformPackageCallbackMethod0, UniffiCallbackInterfacePlatformPackageCallbackMethod1 uniffiCallbackInterfacePlatformPackageCallbackMethod1) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfacePlatformPackageCallbackMethod0, uniffiCallbackInterfacePlatformPackageCallbackMethod1);
        }
    }

    public UniffiVTableCallbackInterfacePlatformPackageCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfacePlatformPackageCallbackMethod0 uniffiCallbackInterfacePlatformPackageCallbackMethod0, UniffiCallbackInterfacePlatformPackageCallbackMethod1 uniffiCallbackInterfacePlatformPackageCallbackMethod1) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.isPackageInstalled = uniffiCallbackInterfacePlatformPackageCallbackMethod0;
        this.filterAvailableSharePlatforms = uniffiCallbackInterfacePlatformPackageCallbackMethod1;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfacePlatformPackageCallback uniffiVTableCallbackInterfacePlatformPackageCallback) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfacePlatformPackageCallback, "");
        this.uniffiFree = uniffiVTableCallbackInterfacePlatformPackageCallback.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfacePlatformPackageCallback.uniffiClone;
        this.isPackageInstalled = uniffiVTableCallbackInterfacePlatformPackageCallback.isPackageInstalled;
        this.filterAvailableSharePlatforms = uniffiVTableCallbackInterfacePlatformPackageCallback.filterAvailableSharePlatforms;
    }
}
