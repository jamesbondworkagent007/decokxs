package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3835AtT;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeRecurringBuyPlanListDependencies implements FfiConverterRustBuffer<C3835AtT> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRecurringBuyPlanListDependencies INSTANCE = new FfiConverterTypeRecurringBuyPlanListDependencies();

    private FfiConverterTypeRecurringBuyPlanListDependencies() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3835AtT lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3835AtT) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3835AtT liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3835AtT) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3835AtT c3835AtT) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3835AtT);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3835AtT c3835AtT) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3835AtT);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3835AtT read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C3835AtT(FfiConverterTypeRecurringBuyPlanListLocalization.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3835AtT c3835AtT) {
        Intrinsics.checkNotNullParameter(c3835AtT, "");
        return FfiConverterTypeRecurringBuyPlanListLocalization.INSTANCE.mo9529allocationSizeI7RO_PI(c3835AtT.KWHzl());
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3835AtT c3835AtT, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3835AtT, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeRecurringBuyPlanListLocalization.INSTANCE.write(c3835AtT.KWHzl(), byteBuffer);
    }
}
