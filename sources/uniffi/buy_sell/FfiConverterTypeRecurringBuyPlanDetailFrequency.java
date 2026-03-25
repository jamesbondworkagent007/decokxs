package uniffi.buy_sell;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C3764AsB;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeRecurringBuyPlanDetailFrequency implements FfiConverterRustBuffer<C3764AsB> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRecurringBuyPlanDetailFrequency INSTANCE = new FfiConverterTypeRecurringBuyPlanDetailFrequency();

    private FfiConverterTypeRecurringBuyPlanDetailFrequency() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3764AsB lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3764AsB) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3764AsB liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3764AsB) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3764AsB c3764AsB) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3764AsB);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3764AsB c3764AsB) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3764AsB);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3764AsB read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C3764AsB(FfiConverterTypeRecurringBuyPlanDetailFrequencyOption.INSTANCE.read(byteBuffer), FfiConverterSequenceTypeRecurringBuyPlanDetailFrequencyOption.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3764AsB c3764AsB) {
        Intrinsics.checkNotNullParameter(c3764AsB, "");
        return C56396yDv.copydefault(FfiConverterTypeRecurringBuyPlanDetailFrequencyOption.INSTANCE.mo9529allocationSizeI7RO_PI(c3764AsB.AEQbTJ()) + FfiConverterSequenceTypeRecurringBuyPlanDetailFrequencyOption.INSTANCE.mo9529allocationSizeI7RO_PI((List) c3764AsB.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3764AsB c3764AsB, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3764AsB, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeRecurringBuyPlanDetailFrequencyOption.INSTANCE.write(c3764AsB.AEQbTJ(), byteBuffer);
        FfiConverterSequenceTypeRecurringBuyPlanDetailFrequencyOption.INSTANCE.write((List) c3764AsB.KWHzl(), byteBuffer);
    }
}
