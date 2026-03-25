package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeRecurringBuyPlanOrderListContentStateVariant implements FfiConverterRustBuffer<RecurringBuyPlanOrderListContentStateVariant> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRecurringBuyPlanOrderListContentStateVariant INSTANCE = new FfiConverterTypeRecurringBuyPlanOrderListContentStateVariant();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull RecurringBuyPlanOrderListContentStateVariant recurringBuyPlanOrderListContentStateVariant) {
        Intrinsics.checkNotNullParameter(recurringBuyPlanOrderListContentStateVariant, "");
        return 4L;
    }

    private FfiConverterTypeRecurringBuyPlanOrderListContentStateVariant() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public RecurringBuyPlanOrderListContentStateVariant lift2(@NotNull RustBuffer.ByValue byValue) {
        return (RecurringBuyPlanOrderListContentStateVariant) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public RecurringBuyPlanOrderListContentStateVariant liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (RecurringBuyPlanOrderListContentStateVariant) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull RecurringBuyPlanOrderListContentStateVariant recurringBuyPlanOrderListContentStateVariant) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, recurringBuyPlanOrderListContentStateVariant);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull RecurringBuyPlanOrderListContentStateVariant recurringBuyPlanOrderListContentStateVariant) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, recurringBuyPlanOrderListContentStateVariant);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public RecurringBuyPlanOrderListContentStateVariant read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        try {
            return RecurringBuyPlanOrderListContentStateVariant.values()[byteBuffer.getInt() - 1];
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException("invalid enum value, something is very wrong!!", e);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull RecurringBuyPlanOrderListContentStateVariant recurringBuyPlanOrderListContentStateVariant, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(recurringBuyPlanOrderListContentStateVariant, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        byteBuffer.putInt(recurringBuyPlanOrderListContentStateVariant.ordinal() + 1);
    }
}
