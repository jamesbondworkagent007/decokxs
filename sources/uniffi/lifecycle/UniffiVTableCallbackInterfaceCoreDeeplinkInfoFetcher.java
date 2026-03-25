package uniffi.lifecycle;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "getDeeplinkHandler", "getDeeplinkMetadata", "getHandlerForScheme", "getMetadataForScheme"})
public class UniffiVTableCallbackInterfaceCoreDeeplinkInfoFetcher extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod0 getDeeplinkHandler;
    public UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod1 getDeeplinkMetadata;
    public UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod2 getHandlerForScheme;
    public UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod3 getMetadataForScheme;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceCoreDeeplinkInfoFetcher() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r6v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r7v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod0) : (r8v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod0))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod1) : (r9v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod1))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod2) : (r10v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod2))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod3:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod3) : (r11v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod3))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod0, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod1, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod2, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod3):void (m)] (LINE:279) call: uniffi.lifecycle.UniffiVTableCallbackInterfaceCoreDeeplinkInfoFetcher.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod0, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod1, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod2, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod3):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceCoreDeeplinkInfoFetcher(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod0 uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod0, UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod1 uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod1, UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod2 uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod2, UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod3 uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod2, (i & 32) != 0 ? null : uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod3);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceCoreDeeplinkInfoFetcher implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r6v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r7v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod0) : (r8v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod0))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod1) : (r9v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod1))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod2) : (r10v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod2))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod3:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod3) : (r11v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod3))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod0, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod1, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod2, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod3):void (m)] (LINE:287) call: uniffi.lifecycle.UniffiVTableCallbackInterfaceCoreDeeplinkInfoFetcher.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod0, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod1, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod2, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod3):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod0 uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod0, UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod1 uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod1, UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod2 uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod2, UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod3 uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod2, (i & 32) != 0 ? null : uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod3);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod0 uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod0, UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod1 uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod1, UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod2 uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod2, UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod3 uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod3) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod0, uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod1, uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod2, uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod3);
        }
    }

    public UniffiVTableCallbackInterfaceCoreDeeplinkInfoFetcher(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod0 uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod0, UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod1 uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod1, UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod2 uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod2, UniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod3 uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod3) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.getDeeplinkHandler = uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod0;
        this.getDeeplinkMetadata = uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod1;
        this.getHandlerForScheme = uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod2;
        this.getMetadataForScheme = uniffiCallbackInterfaceCoreDeeplinkInfoFetcherMethod3;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceCoreDeeplinkInfoFetcher uniffiVTableCallbackInterfaceCoreDeeplinkInfoFetcher) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceCoreDeeplinkInfoFetcher, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceCoreDeeplinkInfoFetcher.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceCoreDeeplinkInfoFetcher.uniffiClone;
        this.getDeeplinkHandler = uniffiVTableCallbackInterfaceCoreDeeplinkInfoFetcher.getDeeplinkHandler;
        this.getDeeplinkMetadata = uniffiVTableCallbackInterfaceCoreDeeplinkInfoFetcher.getDeeplinkMetadata;
        this.getHandlerForScheme = uniffiVTableCallbackInterfaceCoreDeeplinkInfoFetcher.getHandlerForScheme;
        this.getMetadataForScheme = uniffiVTableCallbackInterfaceCoreDeeplinkInfoFetcher.getMetadataForScheme;
    }
}
