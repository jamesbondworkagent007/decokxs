package uniffi.feature_restriction;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "onFeatureRestrictionEvent"})
public class UniffiVTableCallbackInterfaceFeatureRestrictionListener extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceFeatureRestrictionListenerMethod0 onFeatureRestrictionEvent;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceFeatureRestrictionListener() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.feature_restriction.UniffiCallbackInterfaceFeatureRestrictionListenerMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.feature_restriction.UniffiCallbackInterfaceFeatureRestrictionListenerMethod0) : (r4v0 uniffi.feature_restriction.UniffiCallbackInterfaceFeatureRestrictionListenerMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.feature_restriction.UniffiCallbackInterfaceFeatureRestrictionListenerMethod0):void (m)] (LINE:122) call: uniffi.feature_restriction.UniffiVTableCallbackInterfaceFeatureRestrictionListener.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.feature_restriction.UniffiCallbackInterfaceFeatureRestrictionListenerMethod0):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceFeatureRestrictionListener(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceFeatureRestrictionListenerMethod0 uniffiCallbackInterfaceFeatureRestrictionListenerMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceFeatureRestrictionListenerMethod0);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceFeatureRestrictionListener implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.feature_restriction.UniffiCallbackInterfaceFeatureRestrictionListenerMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.feature_restriction.UniffiCallbackInterfaceFeatureRestrictionListenerMethod0) : (r4v0 uniffi.feature_restriction.UniffiCallbackInterfaceFeatureRestrictionListenerMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.feature_restriction.UniffiCallbackInterfaceFeatureRestrictionListenerMethod0):void (m)] (LINE:127) call: uniffi.feature_restriction.UniffiVTableCallbackInterfaceFeatureRestrictionListener.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.feature_restriction.UniffiCallbackInterfaceFeatureRestrictionListenerMethod0):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceFeatureRestrictionListenerMethod0 uniffiCallbackInterfaceFeatureRestrictionListenerMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceFeatureRestrictionListenerMethod0);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceFeatureRestrictionListenerMethod0 uniffiCallbackInterfaceFeatureRestrictionListenerMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceFeatureRestrictionListenerMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceFeatureRestrictionListener(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceFeatureRestrictionListenerMethod0 uniffiCallbackInterfaceFeatureRestrictionListenerMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.onFeatureRestrictionEvent = uniffiCallbackInterfaceFeatureRestrictionListenerMethod0;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceFeatureRestrictionListener uniffiVTableCallbackInterfaceFeatureRestrictionListener) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceFeatureRestrictionListener, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceFeatureRestrictionListener.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceFeatureRestrictionListener.uniffiClone;
        this.onFeatureRestrictionEvent = uniffiVTableCallbackInterfaceFeatureRestrictionListener.onFeatureRestrictionEvent;
    }
}
