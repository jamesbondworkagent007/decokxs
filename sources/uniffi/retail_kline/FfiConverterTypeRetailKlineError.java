package uniffi.retail_kline;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_kline.FfiConverterRustBuffer;
import uniffi.retail_kline.RetailKlineException;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeRetailKlineError implements FfiConverterRustBuffer<RetailKlineException> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRetailKlineError INSTANCE = new FfiConverterTypeRetailKlineError();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull RetailKlineException retailKlineException) {
        Intrinsics.checkNotNullParameter(retailKlineException, "");
        return 4L;
    }

    private FfiConverterTypeRetailKlineError() {
    }

    @Override // uniffi.retail_kline.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public RetailKlineException lift2(@NotNull RustBuffer.ByValue byValue) {
        return (RetailKlineException) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public RetailKlineException liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (RetailKlineException) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull RetailKlineException retailKlineException) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, retailKlineException);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull RetailKlineException retailKlineException) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, retailKlineException);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public RetailKlineException read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new RetailKlineException.NetworkFailed(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 2) {
            return new RetailKlineException.ServerResponseException(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 3) {
            return new RetailKlineException.JsonParseException(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 4) {
            return new RetailKlineException.InvalidParameter(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 5) {
            return new RetailKlineException.InternalException(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid error enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull RetailKlineException retailKlineException, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(retailKlineException, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (retailKlineException instanceof RetailKlineException.NetworkFailed) {
            byteBuffer.putInt(1);
        } else if (retailKlineException instanceof RetailKlineException.ServerResponseException) {
            byteBuffer.putInt(2);
        } else if (retailKlineException instanceof RetailKlineException.JsonParseException) {
            byteBuffer.putInt(3);
        } else if (retailKlineException instanceof RetailKlineException.InvalidParameter) {
            byteBuffer.putInt(4);
        } else {
            if (!(retailKlineException instanceof RetailKlineException.InternalException)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(5);
        }
        Unit unit = Unit.INSTANCE;
    }
}
