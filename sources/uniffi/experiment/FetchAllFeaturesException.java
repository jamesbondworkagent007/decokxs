package uniffi.experiment;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60181zxr;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public abstract class FetchAllFeaturesException extends Exception {
    public static final int $stable = 0;
    public static final TaskDescription ErrorHandler = new TaskDescription(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.experiment.FetchAllFeaturesException.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ FetchAllFeaturesException(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FetchAllFeaturesException() {
    }

    public static final class RequestFailed extends FetchAllFeaturesException {
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

    public static final class InternalException extends FetchAllFeaturesException {
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

    public static final class TaskDescription implements InterfaceC60181zxr<FetchAllFeaturesException> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.experiment.FetchAllFeaturesException.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
        @Override // o.InterfaceC60181zxr
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public FetchAllFeaturesException copydefault(@NotNull RustBuffer.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            return (FetchAllFeaturesException) FfiConverterTypeFetchAllFeaturesError.INSTANCE.lift2(byValue);
        }
    }
}
