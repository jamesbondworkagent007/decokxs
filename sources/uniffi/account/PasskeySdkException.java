package uniffi.account;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60181zxr;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public abstract class PasskeySdkException extends Exception {
    public static final int $stable = 0;
    public static final Activity ErrorHandler = new Activity(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.account.PasskeySdkException.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PasskeySdkException(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PasskeySdkException() {
    }

    public static final class Cancelled extends PasskeySdkException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }

        public Cancelled() {
            super(null);
        }
    }

    public static final class NotAvailable extends PasskeySdkException {
        public static final int $stable = 0;
        private final String reason;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getReason() {
            return this.reason;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotAvailable(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "reason=" + this.reason;
        }
    }

    public static final class NoCredentials extends PasskeySdkException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }

        public NoCredentials() {
            super(null);
        }
    }

    public static final class AlreadyRegistered extends PasskeySdkException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }

        public AlreadyRegistered() {
            super(null);
        }
    }

    public static final class AuthenticationFailed extends PasskeySdkException {
        public static final int $stable = 0;
        private final String reason;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getReason() {
            return this.reason;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthenticationFailed(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "reason=" + this.reason;
        }
    }

    public static final class RegistrationFailed extends PasskeySdkException {
        public static final int $stable = 0;
        private final String reason;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getReason() {
            return this.reason;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RegistrationFailed(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "reason=" + this.reason;
        }
    }

    public static final class BiometricNotAvailable extends PasskeySdkException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }

        public BiometricNotAvailable() {
            super(null);
        }
    }

    public static final class BiometricChanged extends PasskeySdkException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }

        public BiometricChanged() {
            super(null);
        }
    }

    public static final class Unknown extends PasskeySdkException {
        public static final int $stable = 0;
        private final String reason;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getReason() {
            return this.reason;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "reason=" + this.reason;
        }
    }

    public static final class Activity implements InterfaceC60181zxr<PasskeySdkException> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.account.PasskeySdkException.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
        @Override // o.InterfaceC60181zxr
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public PasskeySdkException copydefault(@NotNull RustBuffer.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            return (PasskeySdkException) FfiConverterTypePasskeySDKError.INSTANCE.lift2(byValue);
        }
    }
}
