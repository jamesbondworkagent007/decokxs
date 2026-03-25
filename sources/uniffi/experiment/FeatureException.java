package uniffi.experiment;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60181zxr;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public abstract class FeatureException extends Exception {
    public static final int $stable = 0;
    public static final ActionBar ErrorHandler = new ActionBar(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.experiment.FeatureException.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ FeatureException(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FeatureException() {
    }

    public static final class Message extends FeatureException {
        public static final int $stable = 0;
        private final String v1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getV1() {
            return this.v1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Message(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.v1 = str;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "v1=" + this.v1;
        }
    }

    public static final class ActionBar implements InterfaceC60181zxr<FeatureException> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.experiment.FeatureException.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
        @Override // o.InterfaceC60181zxr
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public FeatureException copydefault(@NotNull RustBuffer.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            return (FeatureException) FfiConverterTypeFeatureError.INSTANCE.lift2(byValue);
        }
    }
}
