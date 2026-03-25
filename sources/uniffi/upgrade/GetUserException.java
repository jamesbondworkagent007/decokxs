package uniffi.upgrade;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60181zxr;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.ok_future_utils.OkCancellationException;

/* JADX INFO: loaded from: classes17.dex */
public abstract class GetUserException extends Exception {
    public static final int $stable = 0;
    public static final Activity ErrorHandler = new Activity(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.upgrade.GetUserException.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ GetUserException(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private GetUserException() {
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class RequestFailed extends GetUserException {
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

    /* JADX INFO: loaded from: classes25.dex */
    public static final class InvalidId extends GetUserException {
        public static final int $stable = 0;
        private final String userid;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUserid() {
            return this.userid;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidId(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.userid = str;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "userid=" + this.userid;
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class OperationCancelled extends GetUserException {
        public static final int $stable = 0;
        private final OkCancellationException v1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OkCancellationException getV1() {
            return this.v1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OperationCancelled(@NotNull OkCancellationException okCancellationException) {
            super(null);
            Intrinsics.checkNotNullParameter(okCancellationException, "");
            this.v1 = okCancellationException;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "v1=" + this.v1;
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class InternalException extends GetUserException {
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

    /* JADX INFO: loaded from: classes25.dex */
    public static final class Activity implements InterfaceC60181zxr<GetUserException> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.upgrade.GetUserException.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
        @Override // o.InterfaceC60181zxr
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public GetUserException copydefault(@NotNull RustBuffer.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            return (GetUserException) FfiConverterTypeGetUserError.INSTANCE.lift2(byValue);
        }
    }
}
