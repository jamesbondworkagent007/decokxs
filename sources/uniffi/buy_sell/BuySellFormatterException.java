package uniffi.buy_sell;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60181zxr;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BuySellFormatterException extends Exception {
    public static final int $stable = 0;
    public static final Application ErrorHandler = new Application(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: uniffi.buy_sell.BuySellFormatterException.<init>(java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ BuySellFormatterException(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private BuySellFormatterException(String str) {
        super(str);
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class InvalidAmount extends BuySellFormatterException {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidAmount(@NotNull String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class InvalidCurrency extends BuySellFormatterException {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidCurrency(@NotNull String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class FormattingFailed extends BuySellFormatterException {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FormattingFailed(@NotNull String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class InvalidPrecision extends BuySellFormatterException {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidPrecision(@NotNull String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class Application implements InterfaceC60181zxr<BuySellFormatterException> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.buy_sell.BuySellFormatterException.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
        @Override // o.InterfaceC60181zxr
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public BuySellFormatterException copydefault(@NotNull RustBuffer.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            return (BuySellFormatterException) FfiConverterTypeBuySellFormatterError.INSTANCE.lift2(byValue);
        }
    }
}
