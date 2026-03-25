package uniffi.lifecycle;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "getAppLinkHandler", "getAppLinkMetadata"})
public class UniffiVTableCallbackInterfaceCoreAppLinkInfoFetcher extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod0 getAppLinkHandler;
    public UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod1 getAppLinkMetadata;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceCoreAppLinkInfoFetcher() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod0) : (r4v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod0))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod1) : (r5v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod0, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod1):void (m)] (LINE:201) call: uniffi.lifecycle.UniffiVTableCallbackInterfaceCoreAppLinkInfoFetcher.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod0, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod1):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceCoreAppLinkInfoFetcher(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod0 uniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod0, UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod1 uniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod1);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceCoreAppLinkInfoFetcher implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod0) : (r4v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod0))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod1) : (r5v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod0, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod1):void (m)] (LINE:207) call: uniffi.lifecycle.UniffiVTableCallbackInterfaceCoreAppLinkInfoFetcher.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod0, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod1):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod0 uniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod0, UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod1 uniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod1);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod0 uniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod0, UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod1 uniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod1) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod0, uniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod1);
        }
    }

    public UniffiVTableCallbackInterfaceCoreAppLinkInfoFetcher(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod0 uniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod0, UniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod1 uniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod1) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.getAppLinkHandler = uniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod0;
        this.getAppLinkMetadata = uniffiCallbackInterfaceCoreAppLinkInfoFetcherMethod1;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceCoreAppLinkInfoFetcher uniffiVTableCallbackInterfaceCoreAppLinkInfoFetcher) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceCoreAppLinkInfoFetcher, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceCoreAppLinkInfoFetcher.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceCoreAppLinkInfoFetcher.uniffiClone;
        this.getAppLinkHandler = uniffiVTableCallbackInterfaceCoreAppLinkInfoFetcher.getAppLinkHandler;
        this.getAppLinkMetadata = uniffiVTableCallbackInterfaceCoreAppLinkInfoFetcher.getAppLinkMetadata;
    }
}
