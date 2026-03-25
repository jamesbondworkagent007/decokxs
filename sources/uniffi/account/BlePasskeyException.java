package uniffi.account;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC60181zxr;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BlePasskeyException extends Exception {
    public static final int $stable = 0;
    public static final Application ErrorHandler = new Application(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: uniffi.account.BlePasskeyException.<init>(java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ BlePasskeyException(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private BlePasskeyException(String str) {
        super(str);
    }

    public static final class BluetoothNotEnabled extends BlePasskeyException {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BluetoothNotEnabled(@NotNull String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public static final class PermissionsNotGranted extends BlePasskeyException {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PermissionsNotGranted(@NotNull String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public static final class ServiceUuidNotSet extends BlePasskeyException {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ServiceUuidNotSet(@NotNull String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public static final class AdvertisingNotSupported extends BlePasskeyException {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdvertisingNotSupported(@NotNull String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public static final class GattServerFailed extends BlePasskeyException {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GattServerFailed(@NotNull String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public static final class AdvertisingFailed extends BlePasskeyException {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdvertisingFailed(@NotNull String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class ScanningFailed extends BlePasskeyException {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScanningFailed(@NotNull String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public static final class ConnectionFailed extends BlePasskeyException {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConnectionFailed(@NotNull String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public static final class NotConnected extends BlePasskeyException {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotConnected(@NotNull String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public static final class ServiceNotFound extends BlePasskeyException {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ServiceNotFound(@NotNull String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public static final class CharacteristicNotFound extends BlePasskeyException {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CharacteristicNotFound(@NotNull String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    public static final class SendFailed extends BlePasskeyException {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendFailed(@NotNull String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class Timeout extends BlePasskeyException {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Timeout(@NotNull String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class InternalException extends BlePasskeyException {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InternalException(@NotNull String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class Application implements InterfaceC60181zxr<BlePasskeyException> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: uniffi.account.BlePasskeyException.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
        @Override // o.InterfaceC60181zxr
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public BlePasskeyException copydefault(@NotNull RustBuffer.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            return (BlePasskeyException) FfiConverterTypeBlePasskeyError.INSTANCE.lift2(byValue);
        }
    }
}
