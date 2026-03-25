package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3763AsA;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeRecurringBuyPlanDetailDependencies implements FfiConverterRustBuffer<C3763AsA> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRecurringBuyPlanDetailDependencies INSTANCE = new FfiConverterTypeRecurringBuyPlanDetailDependencies();

    private FfiConverterTypeRecurringBuyPlanDetailDependencies() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3763AsA lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3763AsA) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3763AsA liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3763AsA) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3763AsA c3763AsA) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3763AsA);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3763AsA c3763AsA) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3763AsA);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3763AsA read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C3763AsA(FfiConverterTypeRecurringBuyPlanDetailLocalization.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3763AsA c3763AsA) {
        Intrinsics.checkNotNullParameter(c3763AsA, "");
        return FfiConverterTypeRecurringBuyPlanDetailLocalization.INSTANCE.mo9529allocationSizeI7RO_PI(c3763AsA.EZpvd());
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3763AsA c3763AsA, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3763AsA, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeRecurringBuyPlanDetailLocalization.INSTANCE.write(c3763AsA.EZpvd(), byteBuffer);
    }
}
