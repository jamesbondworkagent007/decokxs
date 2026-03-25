package uniffi.account;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60181zxr;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public abstract class OkxPasskeyException extends Exception {
    public static final int $stable = 0;
    public static final StateListAnimator ErrorHandler = new StateListAnimator(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.account.OkxPasskeyException.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ OkxPasskeyException(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OkxPasskeyException() {
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class KeyAlreadyExists extends OkxPasskeyException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }

        public KeyAlreadyExists() {
            super(null);
        }
    }

    public static final class KeyNotFound extends OkxPasskeyException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }

        public KeyNotFound() {
            super(null);
        }
    }

    public static final class KeyDataInvalid extends OkxPasskeyException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }

        public KeyDataInvalid() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class KeyCreationFailed extends OkxPasskeyException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }

        public KeyCreationFailed() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class KeyExportFailed extends OkxPasskeyException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }

        public KeyExportFailed() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class SignatureFailed extends OkxPasskeyException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }

        public SignatureFailed() {
            super(null);
        }
    }

    public static final class UserCancelled extends OkxPasskeyException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }

        public UserCancelled() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class DeviceLockout extends OkxPasskeyException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }

        public DeviceLockout() {
            super(null);
        }
    }

    public static final class NoDevicePasscode extends OkxPasskeyException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }

        public NoDevicePasscode() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class KeychainException extends OkxPasskeyException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }

        public KeychainException() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class SerializationFailed extends OkxPasskeyException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }

        public SerializationFailed() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class InvalidParameters extends OkxPasskeyException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }

        public InvalidParameters() {
            super(null);
        }
    }

    public static final class InternalException extends OkxPasskeyException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }

        public InternalException() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class AccountMismatch extends OkxPasskeyException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }

        public AccountMismatch() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class NetworkException extends OkxPasskeyException {
        public static final int $stable = 0;
        private final String v1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getV1() {
            return this.v1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkException(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.v1 = str;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "v1=" + this.v1;
        }
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class StateListAnimator implements InterfaceC60181zxr<OkxPasskeyException> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.account.OkxPasskeyException.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
        @Override // o.InterfaceC60181zxr
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public OkxPasskeyException copydefault(@NotNull RustBuffer.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            return (OkxPasskeyException) FfiConverterTypeOkxPasskeyError.INSTANCE.lift2(byValue);
        }
    }
}
