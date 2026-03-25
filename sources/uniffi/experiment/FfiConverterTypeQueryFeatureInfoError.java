package uniffi.experiment;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.experiment.FfiConverterRustBuffer;
import uniffi.experiment.QueryFeatureInfoException;

/* JADX INFO: loaded from: classes20.dex */
public final class FfiConverterTypeQueryFeatureInfoError implements FfiConverterRustBuffer<QueryFeatureInfoException> {
    public static final int $stable = 0;
    public static final FfiConverterTypeQueryFeatureInfoError INSTANCE = new FfiConverterTypeQueryFeatureInfoError();

    private FfiConverterTypeQueryFeatureInfoError() {
    }

    @Override // uniffi.experiment.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public QueryFeatureInfoException lift2(@NotNull RustBuffer.ByValue byValue) {
        return (QueryFeatureInfoException) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public QueryFeatureInfoException liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (QueryFeatureInfoException) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull QueryFeatureInfoException queryFeatureInfoException) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, queryFeatureInfoException);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull QueryFeatureInfoException queryFeatureInfoException) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, queryFeatureInfoException);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public QueryFeatureInfoException read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new QueryFeatureInfoException.RequestFailed(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 2) {
            return new QueryFeatureInfoException.InternalException(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid error enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull QueryFeatureInfoException queryFeatureInfoException) {
        Intrinsics.checkNotNullParameter(queryFeatureInfoException, "");
        if (queryFeatureInfoException instanceof QueryFeatureInfoException.RequestFailed) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((QueryFeatureInfoException.RequestFailed) queryFeatureInfoException).getErrorMessage()) + 4);
        }
        if (!(queryFeatureInfoException instanceof QueryFeatureInfoException.InternalException)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((QueryFeatureInfoException.InternalException) queryFeatureInfoException).getErrorMessage()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull QueryFeatureInfoException queryFeatureInfoException, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(queryFeatureInfoException, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (queryFeatureInfoException instanceof QueryFeatureInfoException.RequestFailed) {
            byteBuffer.putInt(1);
            FfiConverterString.INSTANCE.write(((QueryFeatureInfoException.RequestFailed) queryFeatureInfoException).getErrorMessage(), byteBuffer);
        } else {
            if (!(queryFeatureInfoException instanceof QueryFeatureInfoException.InternalException)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(2);
            FfiConverterString.INSTANCE.write(((QueryFeatureInfoException.InternalException) queryFeatureInfoException).getErrorMessage(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
