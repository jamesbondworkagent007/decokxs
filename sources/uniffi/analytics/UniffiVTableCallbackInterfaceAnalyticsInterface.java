package uniffi.analytics;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "trackEvent", "reportToGrafana", "reportException"})
public class UniffiVTableCallbackInterfaceAnalyticsInterface extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceAnalyticsInterfaceMethod2 reportException;
    public UniffiCallbackInterfaceAnalyticsInterfaceMethod1 reportToGrafana;
    public UniffiCallbackInterfaceAnalyticsInterfaceMethod0 trackEvent;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceAnalyticsInterface() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r5v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r6v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod0) : (r7v0 uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod0))
  (wrap:uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod1) : (r8v0 uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod1))
  (wrap:uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod2) : (r9v0 uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod2))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod0, uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod1, uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod2):void (m)] (LINE:67) call: uniffi.analytics.UniffiVTableCallbackInterfaceAnalyticsInterface.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod0, uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod1, uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod2):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceAnalyticsInterface(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceAnalyticsInterfaceMethod0 uniffiCallbackInterfaceAnalyticsInterfaceMethod0, UniffiCallbackInterfaceAnalyticsInterfaceMethod1 uniffiCallbackInterfaceAnalyticsInterfaceMethod1, UniffiCallbackInterfaceAnalyticsInterfaceMethod2 uniffiCallbackInterfaceAnalyticsInterfaceMethod2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceAnalyticsInterfaceMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceAnalyticsInterfaceMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceAnalyticsInterfaceMethod2);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceAnalyticsInterface implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r5v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r6v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod0:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod0) : (r7v0 uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod0))
  (wrap:uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod1:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod1) : (r8v0 uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod1))
  (wrap:uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod2:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod2) : (r9v0 uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod2))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod0, uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod1, uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod2):void (m)] (LINE:74) call: uniffi.analytics.UniffiVTableCallbackInterfaceAnalyticsInterface.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod0, uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod1, uniffi.analytics.UniffiCallbackInterfaceAnalyticsInterfaceMethod2):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceAnalyticsInterfaceMethod0 uniffiCallbackInterfaceAnalyticsInterfaceMethod0, UniffiCallbackInterfaceAnalyticsInterfaceMethod1 uniffiCallbackInterfaceAnalyticsInterfaceMethod1, UniffiCallbackInterfaceAnalyticsInterfaceMethod2 uniffiCallbackInterfaceAnalyticsInterfaceMethod2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceAnalyticsInterfaceMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceAnalyticsInterfaceMethod1, (i & 16) != 0 ? null : uniffiCallbackInterfaceAnalyticsInterfaceMethod2);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceAnalyticsInterfaceMethod0 uniffiCallbackInterfaceAnalyticsInterfaceMethod0, UniffiCallbackInterfaceAnalyticsInterfaceMethod1 uniffiCallbackInterfaceAnalyticsInterfaceMethod1, UniffiCallbackInterfaceAnalyticsInterfaceMethod2 uniffiCallbackInterfaceAnalyticsInterfaceMethod2) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceAnalyticsInterfaceMethod0, uniffiCallbackInterfaceAnalyticsInterfaceMethod1, uniffiCallbackInterfaceAnalyticsInterfaceMethod2);
        }
    }

    public UniffiVTableCallbackInterfaceAnalyticsInterface(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceAnalyticsInterfaceMethod0 uniffiCallbackInterfaceAnalyticsInterfaceMethod0, UniffiCallbackInterfaceAnalyticsInterfaceMethod1 uniffiCallbackInterfaceAnalyticsInterfaceMethod1, UniffiCallbackInterfaceAnalyticsInterfaceMethod2 uniffiCallbackInterfaceAnalyticsInterfaceMethod2) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.trackEvent = uniffiCallbackInterfaceAnalyticsInterfaceMethod0;
        this.reportToGrafana = uniffiCallbackInterfaceAnalyticsInterfaceMethod1;
        this.reportException = uniffiCallbackInterfaceAnalyticsInterfaceMethod2;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceAnalyticsInterface uniffiVTableCallbackInterfaceAnalyticsInterface) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceAnalyticsInterface, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceAnalyticsInterface.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceAnalyticsInterface.uniffiClone;
        this.trackEvent = uniffiVTableCallbackInterfaceAnalyticsInterface.trackEvent;
        this.reportToGrafana = uniffiVTableCallbackInterfaceAnalyticsInterface.reportToGrafana;
        this.reportException = uniffiVTableCallbackInterfaceAnalyticsInterface.reportException;
    }
}
