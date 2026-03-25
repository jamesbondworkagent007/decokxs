package uniffi.wallet;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60181zxr;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public abstract class WalletHeaderProviderException extends Exception {
    public static final int $stable = 0;
    public static final Activity ErrorHandler = new Activity(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.wallet.WalletHeaderProviderException.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ WalletHeaderProviderException(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private WalletHeaderProviderException() {
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class NoWalletAvailable extends WalletHeaderProviderException {
        public static final int $stable = 0;
        private final String msg;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMsg() {
            return this.msg;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoWalletAvailable(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.msg = str;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "msg=" + this.msg;
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class SignatureException extends WalletHeaderProviderException {
        public static final int $stable = 0;
        private final String msg;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMsg() {
            return this.msg;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignatureException(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.msg = str;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "msg=" + this.msg;
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class ProviderNotRegistered extends WalletHeaderProviderException {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Throwable
        public String getMessage() {
            return "";
        }

        public ProviderNotRegistered() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class Unknown extends WalletHeaderProviderException {
        public static final int $stable = 0;
        private final String msg;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMsg() {
            return this.msg;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.msg = str;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "msg=" + this.msg;
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class Activity implements InterfaceC60181zxr<WalletHeaderProviderException> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.wallet.WalletHeaderProviderException.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
        @Override // o.InterfaceC60181zxr
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public WalletHeaderProviderException copydefault(@NotNull RustBuffer.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            return (WalletHeaderProviderException) FfiConverterTypeWalletHeaderProviderError.INSTANCE.lift2(byValue);
        }
    }
}
