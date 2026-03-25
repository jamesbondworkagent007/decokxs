package uniffi.network;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.network.FfiConverterRustBuffer;
import uniffi.network.NetworkException;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeNetworkError implements FfiConverterRustBuffer<NetworkException> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNetworkError INSTANCE = new FfiConverterTypeNetworkError();

    private FfiConverterTypeNetworkError() {
    }

    @Override // uniffi.network.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public NetworkException lift2(@NotNull RustBuffer.ByValue byValue) {
        return (NetworkException) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public NetworkException liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (NetworkException) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull NetworkException networkException) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, networkException);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull NetworkException networkException) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, networkException);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public NetworkException read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new NetworkException.RequestFailed(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 2) {
            return new NetworkException.Timeout();
        }
        if (i == 3) {
            return new NetworkException.InvalidUrl(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 4) {
            return new NetworkException.Serialization(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid error enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull NetworkException networkException) {
        Intrinsics.checkNotNullParameter(networkException, "");
        if (networkException instanceof NetworkException.RequestFailed) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((NetworkException.RequestFailed) networkException).getErrorMessage()) + 4);
        }
        if (networkException instanceof NetworkException.Timeout) {
            return 4L;
        }
        if (networkException instanceof NetworkException.InvalidUrl) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((NetworkException.InvalidUrl) networkException).getUrl()) + 4);
        }
        if (!(networkException instanceof NetworkException.Serialization)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((NetworkException.Serialization) networkException).getV1()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull NetworkException networkException, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(networkException, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (networkException instanceof NetworkException.RequestFailed) {
            byteBuffer.putInt(1);
            FfiConverterString.INSTANCE.write(((NetworkException.RequestFailed) networkException).getErrorMessage(), byteBuffer);
        } else if (networkException instanceof NetworkException.Timeout) {
            byteBuffer.putInt(2);
        } else if (networkException instanceof NetworkException.InvalidUrl) {
            byteBuffer.putInt(3);
            FfiConverterString.INSTANCE.write(((NetworkException.InvalidUrl) networkException).getUrl(), byteBuffer);
        } else {
            if (!(networkException instanceof NetworkException.Serialization)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(4);
            FfiConverterString.INSTANCE.write(((NetworkException.Serialization) networkException).getV1(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
