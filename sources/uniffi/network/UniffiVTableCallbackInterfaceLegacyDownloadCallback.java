package uniffi.network;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "onProgress", "onError", "onSuccess"})
public class UniffiVTableCallbackInterfaceLegacyDownloadCallback extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceLegacyDownloadCallbackMethod1 onError;
    public UniffiCallbackInterfaceLegacyDownloadCallbackMethod0 onProgress;
    public UniffiCallbackInterfaceLegacyDownloadCallbackMethod2 onSuccess;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceLegacyDownloadCallback() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r5v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r6v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod0) : (r7v0 uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod0))
  (wrap:uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod1) : (r8v0 uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod1))
  (wrap:uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod2) : (r9v0 uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod2))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod0, uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod1, uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod2):void (m)] (LINE:158) call: uniffi.network.UniffiVTableCallbackInterfaceLegacyDownloadCallback.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod0, uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod1, uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod2):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceLegacyDownloadCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceLegacyDownloadCallbackMethod0 uniffiCallbackInterfaceLegacyDownloadCallbackMethod0, UniffiCallbackInterfaceLegacyDownloadCallbackMethod1 uniffiCallbackInterfaceLegacyDownloadCallbackMethod1, UniffiCallbackInterfaceLegacyDownloadCallbackMethod2 uniffiCallbackInterfaceLegacyDownloadCallbackMethod2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceLegacyDownloadCallbackMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceLegacyDownloadCallbackMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceLegacyDownloadCallbackMethod2);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceLegacyDownloadCallback implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r5v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r6v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod0) : (r7v0 uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod0))
  (wrap:uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod1) : (r8v0 uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod1))
  (wrap:uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod2) : (r9v0 uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod2))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod0, uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod1, uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod2):void (m)] (LINE:165) call: uniffi.network.UniffiVTableCallbackInterfaceLegacyDownloadCallback.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod0, uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod1, uniffi.network.UniffiCallbackInterfaceLegacyDownloadCallbackMethod2):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceLegacyDownloadCallbackMethod0 uniffiCallbackInterfaceLegacyDownloadCallbackMethod0, UniffiCallbackInterfaceLegacyDownloadCallbackMethod1 uniffiCallbackInterfaceLegacyDownloadCallbackMethod1, UniffiCallbackInterfaceLegacyDownloadCallbackMethod2 uniffiCallbackInterfaceLegacyDownloadCallbackMethod2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceLegacyDownloadCallbackMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceLegacyDownloadCallbackMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceLegacyDownloadCallbackMethod2);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceLegacyDownloadCallbackMethod0 uniffiCallbackInterfaceLegacyDownloadCallbackMethod0, UniffiCallbackInterfaceLegacyDownloadCallbackMethod1 uniffiCallbackInterfaceLegacyDownloadCallbackMethod1, UniffiCallbackInterfaceLegacyDownloadCallbackMethod2 uniffiCallbackInterfaceLegacyDownloadCallbackMethod2) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceLegacyDownloadCallbackMethod0, uniffiCallbackInterfaceLegacyDownloadCallbackMethod1, uniffiCallbackInterfaceLegacyDownloadCallbackMethod2);
        }
    }

    public UniffiVTableCallbackInterfaceLegacyDownloadCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceLegacyDownloadCallbackMethod0 uniffiCallbackInterfaceLegacyDownloadCallbackMethod0, UniffiCallbackInterfaceLegacyDownloadCallbackMethod1 uniffiCallbackInterfaceLegacyDownloadCallbackMethod1, UniffiCallbackInterfaceLegacyDownloadCallbackMethod2 uniffiCallbackInterfaceLegacyDownloadCallbackMethod2) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.onProgress = uniffiCallbackInterfaceLegacyDownloadCallbackMethod0;
        this.onError = uniffiCallbackInterfaceLegacyDownloadCallbackMethod1;
        this.onSuccess = uniffiCallbackInterfaceLegacyDownloadCallbackMethod2;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceLegacyDownloadCallback uniffiVTableCallbackInterfaceLegacyDownloadCallback) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceLegacyDownloadCallback, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceLegacyDownloadCallback.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceLegacyDownloadCallback.uniffiClone;
        this.onProgress = uniffiVTableCallbackInterfaceLegacyDownloadCallback.onProgress;
        this.onError = uniffiVTableCallbackInterfaceLegacyDownloadCallback.onError;
        this.onSuccess = uniffiVTableCallbackInterfaceLegacyDownloadCallback.onSuccess;
    }
}
