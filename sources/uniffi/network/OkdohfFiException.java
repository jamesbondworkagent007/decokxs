package uniffi.network;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60181zxr;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public abstract class OkdohfFiException extends java.lang.Exception {
    public static final int $stable = 0;
    public static final TaskDescription ErrorHandler = new TaskDescription(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.network.OkdohfFiException.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ OkdohfFiException(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OkdohfFiException() {
    }

    public static final class Exception extends OkdohfFiException {
        public static final int $stable = 0;
        private final String errorMessage;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Exception(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.errorMessage = str;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "errorMessage=" + this.errorMessage;
        }
    }

    public static final class TaskDescription implements InterfaceC60181zxr<OkdohfFiException> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.network.OkdohfFiException.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
        @Override // o.InterfaceC60181zxr
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public OkdohfFiException copydefault(@NotNull RustBuffer.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            return (OkdohfFiException) FfiConverterTypeOKDOHFFiError.INSTANCE.lift2(byValue);
        }
    }
}
