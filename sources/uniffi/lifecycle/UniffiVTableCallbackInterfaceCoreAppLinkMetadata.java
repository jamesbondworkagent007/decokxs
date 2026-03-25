package uniffi.lifecycle;

import androidx.core.app.FrameMetricsAggregator;
import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "getLink", "getMode", "requireAuth", "getSupportedOkxDomains", "supportRbacAccount", "supportRmAccount", "opensInWebview"})
public class UniffiVTableCallbackInterfaceCoreAppLinkMetadata extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceCoreAppLinkMetadataMethod0 getLink;
    public UniffiCallbackInterfaceCoreAppLinkMetadataMethod1 getMode;
    public UniffiCallbackInterfaceCoreAppLinkMetadataMethod3 getSupportedOkxDomains;
    public UniffiCallbackInterfaceCoreAppLinkMetadataMethod6 opensInWebview;
    public UniffiCallbackInterfaceCoreAppLinkMetadataMethod2 requireAuth;
    public UniffiCallbackInterfaceCoreAppLinkMetadataMethod4 supportRbacAccount;
    public UniffiCallbackInterfaceCoreAppLinkMetadataMethod5 supportRmAccount;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceCoreAppLinkMetadata() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r11v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r12v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod0:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod0) : (r13v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod0))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod1:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod1) : (r14v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod1))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod2:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod2) : (r15v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod2))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod3:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod3) : (r16v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod3))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod4:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod4) : (r17v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod4))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod5:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod5) : (r18v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod5))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod6:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod6) : (null uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod6))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod0, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod1, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod2, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod3, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod4, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod5, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod6):void (m)] (LINE:223) call: uniffi.lifecycle.UniffiVTableCallbackInterfaceCoreAppLinkMetadata.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod0, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod1, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod2, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod3, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod4, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod5, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod6):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceCoreAppLinkMetadata(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCoreAppLinkMetadataMethod0 uniffiCallbackInterfaceCoreAppLinkMetadataMethod0, UniffiCallbackInterfaceCoreAppLinkMetadataMethod1 uniffiCallbackInterfaceCoreAppLinkMetadataMethod1, UniffiCallbackInterfaceCoreAppLinkMetadataMethod2 uniffiCallbackInterfaceCoreAppLinkMetadataMethod2, UniffiCallbackInterfaceCoreAppLinkMetadataMethod3 uniffiCallbackInterfaceCoreAppLinkMetadataMethod3, UniffiCallbackInterfaceCoreAppLinkMetadataMethod4 uniffiCallbackInterfaceCoreAppLinkMetadataMethod4, UniffiCallbackInterfaceCoreAppLinkMetadataMethod5 uniffiCallbackInterfaceCoreAppLinkMetadataMethod5, UniffiCallbackInterfaceCoreAppLinkMetadataMethod6 uniffiCallbackInterfaceCoreAppLinkMetadataMethod6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceCoreAppLinkMetadataMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceCoreAppLinkMetadataMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceCoreAppLinkMetadataMethod2, (i & 32) != 0 ? null : uniffiCallbackInterfaceCoreAppLinkMetadataMethod3, (i & 64) != 0 ? null : uniffiCallbackInterfaceCoreAppLinkMetadataMethod4, (i & 128) != 0 ? null : uniffiCallbackInterfaceCoreAppLinkMetadataMethod5, (i & 256) == 0 ? uniffiCallbackInterfaceCoreAppLinkMetadataMethod6 : null);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceCoreAppLinkMetadata implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r11v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r12v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod0:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod0) : (r13v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod0))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod1:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod1) : (r14v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod1))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod2:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod2) : (r15v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod2))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod3:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod3) : (r16v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod3))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod4:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod4) : (r17v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod4))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod5:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod5) : (r18v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod5))
  (wrap:uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod6:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod6) : (null uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod6))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod0, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod1, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod2, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod3, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod4, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod5, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod6):void (m)] (LINE:234) call: uniffi.lifecycle.UniffiVTableCallbackInterfaceCoreAppLinkMetadata.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod0, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod1, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod2, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod3, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod4, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod5, uniffi.lifecycle.UniffiCallbackInterfaceCoreAppLinkMetadataMethod6):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCoreAppLinkMetadataMethod0 uniffiCallbackInterfaceCoreAppLinkMetadataMethod0, UniffiCallbackInterfaceCoreAppLinkMetadataMethod1 uniffiCallbackInterfaceCoreAppLinkMetadataMethod1, UniffiCallbackInterfaceCoreAppLinkMetadataMethod2 uniffiCallbackInterfaceCoreAppLinkMetadataMethod2, UniffiCallbackInterfaceCoreAppLinkMetadataMethod3 uniffiCallbackInterfaceCoreAppLinkMetadataMethod3, UniffiCallbackInterfaceCoreAppLinkMetadataMethod4 uniffiCallbackInterfaceCoreAppLinkMetadataMethod4, UniffiCallbackInterfaceCoreAppLinkMetadataMethod5 uniffiCallbackInterfaceCoreAppLinkMetadataMethod5, UniffiCallbackInterfaceCoreAppLinkMetadataMethod6 uniffiCallbackInterfaceCoreAppLinkMetadataMethod6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceCoreAppLinkMetadataMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceCoreAppLinkMetadataMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceCoreAppLinkMetadataMethod2, (i & 32) != 0 ? null : uniffiCallbackInterfaceCoreAppLinkMetadataMethod3, (i & 64) != 0 ? null : uniffiCallbackInterfaceCoreAppLinkMetadataMethod4, (i & 128) != 0 ? null : uniffiCallbackInterfaceCoreAppLinkMetadataMethod5, (i & 256) == 0 ? uniffiCallbackInterfaceCoreAppLinkMetadataMethod6 : null);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCoreAppLinkMetadataMethod0 uniffiCallbackInterfaceCoreAppLinkMetadataMethod0, UniffiCallbackInterfaceCoreAppLinkMetadataMethod1 uniffiCallbackInterfaceCoreAppLinkMetadataMethod1, UniffiCallbackInterfaceCoreAppLinkMetadataMethod2 uniffiCallbackInterfaceCoreAppLinkMetadataMethod2, UniffiCallbackInterfaceCoreAppLinkMetadataMethod3 uniffiCallbackInterfaceCoreAppLinkMetadataMethod3, UniffiCallbackInterfaceCoreAppLinkMetadataMethod4 uniffiCallbackInterfaceCoreAppLinkMetadataMethod4, UniffiCallbackInterfaceCoreAppLinkMetadataMethod5 uniffiCallbackInterfaceCoreAppLinkMetadataMethod5, UniffiCallbackInterfaceCoreAppLinkMetadataMethod6 uniffiCallbackInterfaceCoreAppLinkMetadataMethod6) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceCoreAppLinkMetadataMethod0, uniffiCallbackInterfaceCoreAppLinkMetadataMethod1, uniffiCallbackInterfaceCoreAppLinkMetadataMethod2, uniffiCallbackInterfaceCoreAppLinkMetadataMethod3, uniffiCallbackInterfaceCoreAppLinkMetadataMethod4, uniffiCallbackInterfaceCoreAppLinkMetadataMethod5, uniffiCallbackInterfaceCoreAppLinkMetadataMethod6);
        }
    }

    public UniffiVTableCallbackInterfaceCoreAppLinkMetadata(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceCoreAppLinkMetadataMethod0 uniffiCallbackInterfaceCoreAppLinkMetadataMethod0, UniffiCallbackInterfaceCoreAppLinkMetadataMethod1 uniffiCallbackInterfaceCoreAppLinkMetadataMethod1, UniffiCallbackInterfaceCoreAppLinkMetadataMethod2 uniffiCallbackInterfaceCoreAppLinkMetadataMethod2, UniffiCallbackInterfaceCoreAppLinkMetadataMethod3 uniffiCallbackInterfaceCoreAppLinkMetadataMethod3, UniffiCallbackInterfaceCoreAppLinkMetadataMethod4 uniffiCallbackInterfaceCoreAppLinkMetadataMethod4, UniffiCallbackInterfaceCoreAppLinkMetadataMethod5 uniffiCallbackInterfaceCoreAppLinkMetadataMethod5, UniffiCallbackInterfaceCoreAppLinkMetadataMethod6 uniffiCallbackInterfaceCoreAppLinkMetadataMethod6) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.getLink = uniffiCallbackInterfaceCoreAppLinkMetadataMethod0;
        this.getMode = uniffiCallbackInterfaceCoreAppLinkMetadataMethod1;
        this.requireAuth = uniffiCallbackInterfaceCoreAppLinkMetadataMethod2;
        this.getSupportedOkxDomains = uniffiCallbackInterfaceCoreAppLinkMetadataMethod3;
        this.supportRbacAccount = uniffiCallbackInterfaceCoreAppLinkMetadataMethod4;
        this.supportRmAccount = uniffiCallbackInterfaceCoreAppLinkMetadataMethod5;
        this.opensInWebview = uniffiCallbackInterfaceCoreAppLinkMetadataMethod6;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceCoreAppLinkMetadata uniffiVTableCallbackInterfaceCoreAppLinkMetadata) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceCoreAppLinkMetadata, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceCoreAppLinkMetadata.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceCoreAppLinkMetadata.uniffiClone;
        this.getLink = uniffiVTableCallbackInterfaceCoreAppLinkMetadata.getLink;
        this.getMode = uniffiVTableCallbackInterfaceCoreAppLinkMetadata.getMode;
        this.requireAuth = uniffiVTableCallbackInterfaceCoreAppLinkMetadata.requireAuth;
        this.getSupportedOkxDomains = uniffiVTableCallbackInterfaceCoreAppLinkMetadata.getSupportedOkxDomains;
        this.supportRbacAccount = uniffiVTableCallbackInterfaceCoreAppLinkMetadata.supportRbacAccount;
        this.supportRmAccount = uniffiVTableCallbackInterfaceCoreAppLinkMetadata.supportRmAccount;
        this.opensInWebview = uniffiVTableCallbackInterfaceCoreAppLinkMetadata.opensInWebview;
    }
}
