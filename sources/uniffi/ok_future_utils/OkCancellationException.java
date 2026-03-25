package uniffi.ok_future_utils;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60181zxr;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public abstract class OkCancellationException extends Exception {
    public static final int $stable = 0;
    public static final Application ErrorHandler = new Application(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.ok_future_utils.OkCancellationException.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ OkCancellationException(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OkCancellationException() {
    }

    public static final class Cancelled extends OkCancellationException {
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

    public static final class Application implements InterfaceC60181zxr<OkCancellationException> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.ok_future_utils.OkCancellationException.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
        @Override // o.InterfaceC60181zxr
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public OkCancellationException copydefault(@NotNull RustBuffer.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            return (OkCancellationException) FfiConverterTypeOKCancellationError.INSTANCE.lift2(byValue);
        }
    }
}
