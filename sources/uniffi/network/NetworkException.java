package uniffi.network;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60181zxr;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public abstract class NetworkException extends Exception {
    public static final int $stable = 0;
    public static final Application ErrorHandler = new Application(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.network.NetworkException.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ NetworkException(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NetworkException() {
    }

    public static final class RequestFailed extends NetworkException {
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

    public static final class Timeout extends NetworkException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }

        public Timeout() {
            super(null);
        }
    }

    public static final class InvalidUrl extends NetworkException {
        public static final int $stable = 0;
        private final String url;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUrl() {
            return this.url;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidUrl(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "url=" + this.url;
        }
    }

    public static final class Serialization extends NetworkException {
        public static final int $stable = 0;
        private final String v1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getV1() {
            return this.v1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Serialization(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.v1 = str;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "v1=" + this.v1;
        }
    }

    public static final class Application implements InterfaceC60181zxr<NetworkException> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.network.NetworkException.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
        @Override // o.InterfaceC60181zxr
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public NetworkException copydefault(@NotNull RustBuffer.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            return (NetworkException) FfiConverterTypeNetworkError.INSTANCE.lift2(byValue);
        }
    }
}
