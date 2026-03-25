package uniffi.settings;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60181zxr;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public abstract class SettingsException extends java.lang.Exception {
    public static final int $stable = 0;
    public static final TaskDescription ErrorHandler = new TaskDescription(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.settings.SettingsException.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SettingsException(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SettingsException() {
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class Exception extends SettingsException {
        public static final int $stable = 0;
        private final int businessCode;
        private final String errorMessage;
        private final SettingsErrorType errorType;
        private final int httpStatus;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getBusinessCode() {
            return this.businessCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SettingsErrorType getErrorType() {
            return this.errorType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getHttpStatus() {
            return this.httpStatus;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Exception(int i, int i2, @NotNull String str, @NotNull SettingsErrorType settingsErrorType) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(settingsErrorType, "");
            this.httpStatus = i;
            this.businessCode = i2;
            this.errorMessage = str;
            this.errorType = settingsErrorType;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "httpStatus=" + this.httpStatus + ", businessCode=" + this.businessCode + ", errorMessage=" + this.errorMessage + ", errorType=" + this.errorType;
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class TaskDescription implements InterfaceC60181zxr<SettingsException> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.settings.SettingsException.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
        @Override // o.InterfaceC60181zxr
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public SettingsException copydefault(@NotNull RustBuffer.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            return (SettingsException) FfiConverterTypeSettingsError.INSTANCE.lift2(byValue);
        }
    }
}
