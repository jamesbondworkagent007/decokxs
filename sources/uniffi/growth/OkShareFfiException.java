package uniffi.growth;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60181zxr;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public abstract class OkShareFfiException extends Exception {
    public static final int $stable = 0;
    public static final Activity ErrorHandler = new Activity(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.growth.OkShareFfiException.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ OkShareFfiException(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OkShareFfiException() {
    }

    public static final class NetworkFailed extends OkShareFfiException {
        public static final int $stable = 0;
        private final int businessCode;
        private final String errorMsg;
        private final int httpStatus;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getBusinessCode() {
            return this.businessCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getErrorMsg() {
            return this.errorMsg;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getHttpStatus() {
            return this.httpStatus;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkFailed(int i, int i2, @NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.httpStatus = i;
            this.businessCode = i2;
            this.errorMsg = str;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "httpStatus=" + this.httpStatus + ", businessCode=" + this.businessCode + ", errorMsg=" + this.errorMsg;
        }
    }

    public static final class ServerResponseException extends OkShareFfiException {
        public static final int $stable = 0;
        private final int businessCode;
        private final String errorMsg;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getBusinessCode() {
            return this.businessCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getErrorMsg() {
            return this.errorMsg;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ServerResponseException(int i, @NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.businessCode = i;
            this.errorMsg = str;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "businessCode=" + this.businessCode + ", errorMsg=" + this.errorMsg;
        }
    }

    public static final class JsonParseException extends OkShareFfiException {
        public static final int $stable = 0;
        private final String errorMsg;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getErrorMsg() {
            return this.errorMsg;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JsonParseException(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.errorMsg = str;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "errorMsg=" + this.errorMsg;
        }
    }

    public static final class InternalException extends OkShareFfiException {
        public static final int $stable = 0;
        private final String errorMsg;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getErrorMsg() {
            return this.errorMsg;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InternalException(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.errorMsg = str;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "errorMsg=" + this.errorMsg;
        }
    }

    public static final class Activity implements InterfaceC60181zxr<OkShareFfiException> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.growth.OkShareFfiException.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
        @Override // o.InterfaceC60181zxr
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public OkShareFfiException copydefault(@NotNull RustBuffer.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            return (OkShareFfiException) FfiConverterTypeOKShareFFIError.INSTANCE.lift2(byValue);
        }
    }
}
