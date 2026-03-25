package uniffi.feature_restriction;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC2440ALv;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.feature_restriction.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeFeatureRestrictionEvent implements FfiConverterRustBuffer<AbstractC2440ALv> {
    public static final int $stable = 0;
    public static final FfiConverterTypeFeatureRestrictionEvent INSTANCE = new FfiConverterTypeFeatureRestrictionEvent();

    private FfiConverterTypeFeatureRestrictionEvent() {
    }

    @Override // uniffi.feature_restriction.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC2440ALv lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC2440ALv) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC2440ALv liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC2440ALv) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC2440ALv abstractC2440ALv) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC2440ALv);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC2440ALv abstractC2440ALv) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC2440ALv);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC2440ALv read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return AbstractC2440ALv.Application.INSTANCE;
        }
        if (i == 2) {
            return new AbstractC2440ALv.TaskDescription(FfiConverterTypeFeatureRestrictionEventDiffSet.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC2440ALv abstractC2440ALv) {
        Intrinsics.checkNotNullParameter(abstractC2440ALv, "");
        if (abstractC2440ALv instanceof AbstractC2440ALv.Application) {
            return 4L;
        }
        if (!(abstractC2440ALv instanceof AbstractC2440ALv.TaskDescription)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterTypeFeatureRestrictionEventDiffSet.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC2440ALv.TaskDescription) abstractC2440ALv).AEQbTJ()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC2440ALv abstractC2440ALv, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC2440ALv, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC2440ALv instanceof AbstractC2440ALv.Application) {
            byteBuffer.putInt(1);
        } else {
            if (!(abstractC2440ALv instanceof AbstractC2440ALv.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(2);
            FfiConverterTypeFeatureRestrictionEventDiffSet.INSTANCE.write(((AbstractC2440ALv.TaskDescription) abstractC2440ALv).AEQbTJ(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
