package uniffi.feature_restriction;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60181zxr;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public abstract class NativeFetchFeatureRestrictionException extends Exception {
    public static final int $stable = 0;
    public static final StateListAnimator ErrorHandler = new StateListAnimator(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.feature_restriction.NativeFetchFeatureRestrictionException.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ NativeFetchFeatureRestrictionException(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NativeFetchFeatureRestrictionException() {
    }

    public static final class FetchFailed extends NativeFetchFeatureRestrictionException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }

        public FetchFailed() {
            super(null);
        }
    }

    public static final class StateListAnimator implements InterfaceC60181zxr<NativeFetchFeatureRestrictionException> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.feature_restriction.NativeFetchFeatureRestrictionException.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
        @Override // o.InterfaceC60181zxr
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public NativeFetchFeatureRestrictionException copydefault(@NotNull RustBuffer.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            return (NativeFetchFeatureRestrictionException) FfiConverterTypeNativeFetchFeatureRestrictionError.INSTANCE.lift2(byValue);
        }
    }
}
