package uniffi.experiment;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60181zxr;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes20.dex */
public abstract class QueryFeatureInfoException extends Exception {
    public static final int $stable = 0;
    public static final Activity ErrorHandler = new Activity(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.experiment.QueryFeatureInfoException.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ QueryFeatureInfoException(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private QueryFeatureInfoException() {
    }

    public static final class RequestFailed extends QueryFeatureInfoException {
        public static final int $stable = 0;
        private final String errorMessage;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestFailed(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.errorMessage = str;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "errorMessage=" + this.errorMessage;
        }
    }

    public static final class InternalException extends QueryFeatureInfoException {
        public static final int $stable = 0;
        private final String errorMessage;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InternalException(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.errorMessage = str;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "errorMessage=" + this.errorMessage;
        }
    }

    public static final class Activity implements InterfaceC60181zxr<QueryFeatureInfoException> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.experiment.QueryFeatureInfoException.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
        @Override // o.InterfaceC60181zxr
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public QueryFeatureInfoException copydefault(@NotNull RustBuffer.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            return (QueryFeatureInfoException) FfiConverterTypeQueryFeatureInfoError.INSTANCE.lift2(byValue);
        }
    }
}
