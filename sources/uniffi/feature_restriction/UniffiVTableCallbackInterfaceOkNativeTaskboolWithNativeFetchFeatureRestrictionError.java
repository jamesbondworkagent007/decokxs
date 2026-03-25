package uniffi.feature_restriction;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "execute", OtpEventTracker.OTP_EVENT_VALUE_CANCEL})
public class UniffiVTableCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionError extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod1 cancel;
    public UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod0 execute;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionError() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.feature_restriction.UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.feature_restriction.UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod0) : (r4v0 uniffi.feature_restriction.UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod0))
  (wrap:uniffi.feature_restriction.UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.feature_restriction.UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod1) : (r5v0 uniffi.feature_restriction.UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.feature_restriction.UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod0, uniffi.feature_restriction.UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod1):void (m)] (LINE:202) call: uniffi.feature_restriction.UniffiVTableCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionError.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.feature_restriction.UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod0, uniffi.feature_restriction.UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod1):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionError(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod0 uniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod0, UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod1 uniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod1);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionError implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.feature_restriction.UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.feature_restriction.UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod0) : (r4v0 uniffi.feature_restriction.UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod0))
  (wrap:uniffi.feature_restriction.UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.feature_restriction.UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod1) : (r5v0 uniffi.feature_restriction.UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.feature_restriction.UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod0, uniffi.feature_restriction.UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod1):void (m)] (LINE:208) call: uniffi.feature_restriction.UniffiVTableCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionError.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.feature_restriction.UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod0, uniffi.feature_restriction.UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod1):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod0 uniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod0, UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod1 uniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod1);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod0 uniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod0, UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod1 uniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod1) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod0, uniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod1);
        }
    }

    public UniffiVTableCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionError(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod0 uniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod0, UniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod1 uniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod1) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.execute = uniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod0;
        this.cancel = uniffiCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionErrorMethod1;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionError uniffiVTableCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionError) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionError, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionError.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionError.uniffiClone;
        this.execute = uniffiVTableCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionError.execute;
        this.cancel = uniffiVTableCallbackInterfaceOkNativeTaskboolWithNativeFetchFeatureRestrictionError.cancel;
    }
}
