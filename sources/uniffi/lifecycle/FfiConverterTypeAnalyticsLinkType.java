package uniffi.lifecycle;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.lifecycle.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeAnalyticsLinkType implements FfiConverterRustBuffer<AnalyticsLinkType> {
    public static final int $stable = 0;
    public static final FfiConverterTypeAnalyticsLinkType INSTANCE = new FfiConverterTypeAnalyticsLinkType();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AnalyticsLinkType analyticsLinkType) {
        Intrinsics.checkNotNullParameter(analyticsLinkType, "");
        return 4L;
    }

    private FfiConverterTypeAnalyticsLinkType() {
    }

    @Override // uniffi.lifecycle.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AnalyticsLinkType lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AnalyticsLinkType) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AnalyticsLinkType liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AnalyticsLinkType) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AnalyticsLinkType analyticsLinkType) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, analyticsLinkType);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AnalyticsLinkType analyticsLinkType) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, analyticsLinkType);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AnalyticsLinkType read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        try {
            return AnalyticsLinkType.values()[byteBuffer.getInt() - 1];
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException("invalid enum value, something is very wrong!!", e);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AnalyticsLinkType analyticsLinkType, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(analyticsLinkType, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        byteBuffer.putInt(analyticsLinkType.ordinal() + 1);
    }
}
