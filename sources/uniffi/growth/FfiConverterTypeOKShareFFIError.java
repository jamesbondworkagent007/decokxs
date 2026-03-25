package uniffi.growth;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.growth.FfiConverterRustBuffer;
import uniffi.growth.OkShareFfiException;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeOKShareFFIError implements FfiConverterRustBuffer<OkShareFfiException> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKShareFFIError INSTANCE = new FfiConverterTypeOKShareFFIError();

    private FfiConverterTypeOKShareFFIError() {
    }

    @Override // uniffi.growth.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public OkShareFfiException lift2(@NotNull RustBuffer.ByValue byValue) {
        return (OkShareFfiException) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public OkShareFfiException liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (OkShareFfiException) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull OkShareFfiException okShareFfiException) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, okShareFfiException);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull OkShareFfiException okShareFfiException) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, okShareFfiException);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public OkShareFfiException read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
            return new OkShareFfiException.NetworkFailed(ffiConverterInt.read(byteBuffer).intValue(), ffiConverterInt.read(byteBuffer).intValue(), FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 2) {
            return new OkShareFfiException.ServerResponseException(FfiConverterInt.INSTANCE.read(byteBuffer).intValue(), FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 3) {
            return new OkShareFfiException.JsonParseException(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 4) {
            return new OkShareFfiException.InternalException(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid error enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull OkShareFfiException okShareFfiException) {
        Intrinsics.checkNotNullParameter(okShareFfiException, "");
        if (okShareFfiException instanceof OkShareFfiException.NetworkFailed) {
            FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
            OkShareFfiException.NetworkFailed networkFailed = (OkShareFfiException.NetworkFailed) okShareFfiException;
            return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterInt.m9536allocationSizeI7RO_PI(networkFailed.getHttpStatus()) + 4) + ffiConverterInt.m9536allocationSizeI7RO_PI(networkFailed.getBusinessCode())) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(networkFailed.getErrorMsg()));
        }
        if (okShareFfiException instanceof OkShareFfiException.ServerResponseException) {
            OkShareFfiException.ServerResponseException serverResponseException = (OkShareFfiException.ServerResponseException) okShareFfiException;
            return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(serverResponseException.getBusinessCode()) + 4) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(serverResponseException.getErrorMsg()));
        }
        if (okShareFfiException instanceof OkShareFfiException.JsonParseException) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((OkShareFfiException.JsonParseException) okShareFfiException).getErrorMsg()) + 4);
        }
        if (!(okShareFfiException instanceof OkShareFfiException.InternalException)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((OkShareFfiException.InternalException) okShareFfiException).getErrorMsg()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull OkShareFfiException okShareFfiException, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(okShareFfiException, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (okShareFfiException instanceof OkShareFfiException.NetworkFailed) {
            byteBuffer.putInt(1);
            FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
            OkShareFfiException.NetworkFailed networkFailed = (OkShareFfiException.NetworkFailed) okShareFfiException;
            ffiConverterInt.write(networkFailed.getHttpStatus(), byteBuffer);
            ffiConverterInt.write(networkFailed.getBusinessCode(), byteBuffer);
            FfiConverterString.INSTANCE.write(networkFailed.getErrorMsg(), byteBuffer);
        } else if (okShareFfiException instanceof OkShareFfiException.ServerResponseException) {
            byteBuffer.putInt(2);
            OkShareFfiException.ServerResponseException serverResponseException = (OkShareFfiException.ServerResponseException) okShareFfiException;
            FfiConverterInt.INSTANCE.write(serverResponseException.getBusinessCode(), byteBuffer);
            FfiConverterString.INSTANCE.write(serverResponseException.getErrorMsg(), byteBuffer);
        } else if (okShareFfiException instanceof OkShareFfiException.JsonParseException) {
            byteBuffer.putInt(3);
            FfiConverterString.INSTANCE.write(((OkShareFfiException.JsonParseException) okShareFfiException).getErrorMsg(), byteBuffer);
        } else {
            if (!(okShareFfiException instanceof OkShareFfiException.InternalException)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(4);
            FfiConverterString.INSTANCE.write(((OkShareFfiException.InternalException) okShareFfiException).getErrorMsg(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
