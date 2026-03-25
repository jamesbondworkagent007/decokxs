package uniffi.lifecycle;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "getPath", "getMode", "requireAuth", "supportRbacAccount", "supportRmAccount"})
public class UniffiVTableCallbackInterfaceCoreDeeplinkMetadata extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceCoreDeeplinkMetadataMethod1 getMode;
    public UniffiCallbackInterfaceCoreDeeplinkMetadataMethod0 getPath;
    public UniffiCallbackInterfaceCoreDeeplinkMetadataMethod2 requireAuth;
    public UniffiCallbackInterfaceCoreDeeplinkMetadataMethod3 supportRbacAccount;
    public UniffiCallbackInterfaceCoreDeeplinkMetadataMethod4 supportRmAccount;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceCoreDeeplinkMetadata() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r7v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r8v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod0) : (r9v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod0))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod1) : (r10v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod1))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod2) : (r11v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod2))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod3:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod3) : (r12v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod3))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod4:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod4) : (r13v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod4))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod0, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod1, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod2, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod3, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod4):void (m)] (LINE:307) call: uniffi.lifecycle.UniffiVTableCallbackInterfaceCoreDeeplinkMetadata.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod0, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod1, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod2, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod3, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod4):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceCoreDeeplinkMetadata(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCoreDeeplinkMetadataMethod0 uniffiCallbackInterfaceCoreDeeplinkMetadataMethod0, UniffiCallbackInterfaceCoreDeeplinkMetadataMethod1 uniffiCallbackInterfaceCoreDeeplinkMetadataMethod1, UniffiCallbackInterfaceCoreDeeplinkMetadataMethod2 uniffiCallbackInterfaceCoreDeeplinkMetadataMethod2, UniffiCallbackInterfaceCoreDeeplinkMetadataMethod3 uniffiCallbackInterfaceCoreDeeplinkMetadataMethod3, UniffiCallbackInterfaceCoreDeeplinkMetadataMethod4 uniffiCallbackInterfaceCoreDeeplinkMetadataMethod4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceCoreDeeplinkMetadataMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceCoreDeeplinkMetadataMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceCoreDeeplinkMetadataMethod2, (i & 32) != 0 ? null : uniffiCallbackInterfaceCoreDeeplinkMetadataMethod3, (i & 64) != 0 ? null : uniffiCallbackInterfaceCoreDeeplinkMetadataMethod4);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceCoreDeeplinkMetadata implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r7v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r8v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod0) : (r9v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod0))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod1) : (r10v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod1))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod2) : (r11v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod2))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod3:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod3) : (r12v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod3))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod4:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod4) : (r13v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod4))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod0, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod1, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod2, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod3, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod4):void (m)] (LINE:316) call: uniffi.lifecycle.UniffiVTableCallbackInterfaceCoreDeeplinkMetadata.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod0, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod1, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod2, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod3, uniffi.lifecycle.UniffiCallbackInterfaceCoreDeeplinkMetadataMethod4):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCoreDeeplinkMetadataMethod0 uniffiCallbackInterfaceCoreDeeplinkMetadataMethod0, UniffiCallbackInterfaceCoreDeeplinkMetadataMethod1 uniffiCallbackInterfaceCoreDeeplinkMetadataMethod1, UniffiCallbackInterfaceCoreDeeplinkMetadataMethod2 uniffiCallbackInterfaceCoreDeeplinkMetadataMethod2, UniffiCallbackInterfaceCoreDeeplinkMetadataMethod3 uniffiCallbackInterfaceCoreDeeplinkMetadataMethod3, UniffiCallbackInterfaceCoreDeeplinkMetadataMethod4 uniffiCallbackInterfaceCoreDeeplinkMetadataMethod4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceCoreDeeplinkMetadataMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceCoreDeeplinkMetadataMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceCoreDeeplinkMetadataMethod2, (i & 32) != 0 ? null : uniffiCallbackInterfaceCoreDeeplinkMetadataMethod3, (i & 64) != 0 ? null : uniffiCallbackInterfaceCoreDeeplinkMetadataMethod4);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCoreDeeplinkMetadataMethod0 uniffiCallbackInterfaceCoreDeeplinkMetadataMethod0, UniffiCallbackInterfaceCoreDeeplinkMetadataMethod1 uniffiCallbackInterfaceCoreDeeplinkMetadataMethod1, UniffiCallbackInterfaceCoreDeeplinkMetadataMethod2 uniffiCallbackInterfaceCoreDeeplinkMetadataMethod2, UniffiCallbackInterfaceCoreDeeplinkMetadataMethod3 uniffiCallbackInterfaceCoreDeeplinkMetadataMethod3, UniffiCallbackInterfaceCoreDeeplinkMetadataMethod4 uniffiCallbackInterfaceCoreDeeplinkMetadataMethod4) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceCoreDeeplinkMetadataMethod0, uniffiCallbackInterfaceCoreDeeplinkMetadataMethod1, uniffiCallbackInterfaceCoreDeeplinkMetadataMethod2, uniffiCallbackInterfaceCoreDeeplinkMetadataMethod3, uniffiCallbackInterfaceCoreDeeplinkMetadataMethod4);
        }
    }

    public UniffiVTableCallbackInterfaceCoreDeeplinkMetadata(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCoreDeeplinkMetadataMethod0 uniffiCallbackInterfaceCoreDeeplinkMetadataMethod0, UniffiCallbackInterfaceCoreDeeplinkMetadataMethod1 uniffiCallbackInterfaceCoreDeeplinkMetadataMethod1, UniffiCallbackInterfaceCoreDeeplinkMetadataMethod2 uniffiCallbackInterfaceCoreDeeplinkMetadataMethod2, UniffiCallbackInterfaceCoreDeeplinkMetadataMethod3 uniffiCallbackInterfaceCoreDeeplinkMetadataMethod3, UniffiCallbackInterfaceCoreDeeplinkMetadataMethod4 uniffiCallbackInterfaceCoreDeeplinkMetadataMethod4) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.getPath = uniffiCallbackInterfaceCoreDeeplinkMetadataMethod0;
        this.getMode = uniffiCallbackInterfaceCoreDeeplinkMetadataMethod1;
        this.requireAuth = uniffiCallbackInterfaceCoreDeeplinkMetadataMethod2;
        this.supportRbacAccount = uniffiCallbackInterfaceCoreDeeplinkMetadataMethod3;
        this.supportRmAccount = uniffiCallbackInterfaceCoreDeeplinkMetadataMethod4;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceCoreDeeplinkMetadata uniffiVTableCallbackInterfaceCoreDeeplinkMetadata) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceCoreDeeplinkMetadata, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceCoreDeeplinkMetadata.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceCoreDeeplinkMetadata.uniffiClone;
        this.getPath = uniffiVTableCallbackInterfaceCoreDeeplinkMetadata.getPath;
        this.getMode = uniffiVTableCallbackInterfaceCoreDeeplinkMetadata.getMode;
        this.requireAuth = uniffiVTableCallbackInterfaceCoreDeeplinkMetadata.requireAuth;
        this.supportRbacAccount = uniffiVTableCallbackInterfaceCoreDeeplinkMetadata.supportRbacAccount;
        this.supportRmAccount = uniffiVTableCallbackInterfaceCoreDeeplinkMetadata.supportRmAccount;
    }
}
