package uniffi.wallet;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.wallet.FfiConverterRustBuffer;
import uniffi.wallet.WalletHeaderProviderException;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeWalletHeaderProviderError implements FfiConverterRustBuffer<WalletHeaderProviderException> {
    public static final int $stable = 0;
    public static final FfiConverterTypeWalletHeaderProviderError INSTANCE = new FfiConverterTypeWalletHeaderProviderError();

    private FfiConverterTypeWalletHeaderProviderError() {
    }

    @Override // uniffi.wallet.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public WalletHeaderProviderException lift2(@NotNull RustBuffer.ByValue byValue) {
        return (WalletHeaderProviderException) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public WalletHeaderProviderException liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (WalletHeaderProviderException) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull WalletHeaderProviderException walletHeaderProviderException) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, walletHeaderProviderException);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull WalletHeaderProviderException walletHeaderProviderException) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, walletHeaderProviderException);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public WalletHeaderProviderException read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new WalletHeaderProviderException.NoWalletAvailable(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 2) {
            return new WalletHeaderProviderException.SignatureException(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 3) {
            return new WalletHeaderProviderException.ProviderNotRegistered();
        }
        if (i == 4) {
            return new WalletHeaderProviderException.Unknown(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid error enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull WalletHeaderProviderException walletHeaderProviderException) {
        Intrinsics.checkNotNullParameter(walletHeaderProviderException, "");
        if (walletHeaderProviderException instanceof WalletHeaderProviderException.NoWalletAvailable) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((WalletHeaderProviderException.NoWalletAvailable) walletHeaderProviderException).getMsg()) + 4);
        }
        if (walletHeaderProviderException instanceof WalletHeaderProviderException.SignatureException) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((WalletHeaderProviderException.SignatureException) walletHeaderProviderException).getMsg()) + 4);
        }
        if (walletHeaderProviderException instanceof WalletHeaderProviderException.ProviderNotRegistered) {
            return 4L;
        }
        if (!(walletHeaderProviderException instanceof WalletHeaderProviderException.Unknown)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((WalletHeaderProviderException.Unknown) walletHeaderProviderException).getMsg()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull WalletHeaderProviderException walletHeaderProviderException, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(walletHeaderProviderException, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (walletHeaderProviderException instanceof WalletHeaderProviderException.NoWalletAvailable) {
            byteBuffer.putInt(1);
            FfiConverterString.INSTANCE.write(((WalletHeaderProviderException.NoWalletAvailable) walletHeaderProviderException).getMsg(), byteBuffer);
        } else if (walletHeaderProviderException instanceof WalletHeaderProviderException.SignatureException) {
            byteBuffer.putInt(2);
            FfiConverterString.INSTANCE.write(((WalletHeaderProviderException.SignatureException) walletHeaderProviderException).getMsg(), byteBuffer);
        } else if (walletHeaderProviderException instanceof WalletHeaderProviderException.ProviderNotRegistered) {
            byteBuffer.putInt(3);
        } else {
            if (!(walletHeaderProviderException instanceof WalletHeaderProviderException.Unknown)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(4);
            FfiConverterString.INSTANCE.write(((WalletHeaderProviderException.Unknown) walletHeaderProviderException).getMsg(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
