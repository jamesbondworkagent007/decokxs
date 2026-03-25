package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3843Atb;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeRecurringBuyPlanDetailItem implements FfiConverterRustBuffer<C3843Atb> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRecurringBuyPlanDetailItem INSTANCE = new FfiConverterTypeRecurringBuyPlanDetailItem();

    private FfiConverterTypeRecurringBuyPlanDetailItem() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3843Atb lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3843Atb) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3843Atb liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3843Atb) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3843Atb c3843Atb) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3843Atb);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3843Atb c3843Atb) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3843Atb);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3843Atb read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C3843Atb(FfiConverterString.INSTANCE.read(byteBuffer), FfiConverterTypeRecurringBuyPlanDetailBanner.INSTANCE.read(byteBuffer), FfiConverterTypeRecurringBuyPlanDetailSummary.INSTANCE.read(byteBuffer), FfiConverterTypeRecurringBuyPlanDetailPnl.INSTANCE.read(byteBuffer), FfiConverterTypeRecurringBuyPlanDetailActions.INSTANCE.read(byteBuffer), FfiConverterTypeRecurringBuyPlanDetailOrders.INSTANCE.read(byteBuffer), FfiConverterTypeRecurringBuyPlanDetailFrequency.INSTANCE.read(byteBuffer), FfiConverterTypeRecurringBuyPlanDetailPaymentMethod.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3843Atb c3843Atb) {
        Intrinsics.checkNotNullParameter(c3843Atb, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(c3843Atb.AYXKKw()) + FfiConverterTypeRecurringBuyPlanDetailBanner.INSTANCE.mo9529allocationSizeI7RO_PI(c3843Atb.AEQbTJ())) + FfiConverterTypeRecurringBuyPlanDetailSummary.INSTANCE.mo9529allocationSizeI7RO_PI(c3843Atb.AhwBna())) + FfiConverterTypeRecurringBuyPlanDetailPnl.INSTANCE.mo9529allocationSizeI7RO_PI(c3843Atb.gEmmrt())) + FfiConverterTypeRecurringBuyPlanDetailActions.INSTANCE.mo9529allocationSizeI7RO_PI(c3843Atb.OLrzqt())) + FfiConverterTypeRecurringBuyPlanDetailOrders.INSTANCE.mo9529allocationSizeI7RO_PI(c3843Atb.copydefault())) + FfiConverterTypeRecurringBuyPlanDetailFrequency.INSTANCE.mo9529allocationSizeI7RO_PI(c3843Atb.EZpvd())) + FfiConverterTypeRecurringBuyPlanDetailPaymentMethod.INSTANCE.mo9529allocationSizeI7RO_PI(c3843Atb.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3843Atb c3843Atb, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3843Atb, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString.INSTANCE.write(c3843Atb.AYXKKw(), byteBuffer);
        FfiConverterTypeRecurringBuyPlanDetailBanner.INSTANCE.write(c3843Atb.AEQbTJ(), byteBuffer);
        FfiConverterTypeRecurringBuyPlanDetailSummary.INSTANCE.write(c3843Atb.AhwBna(), byteBuffer);
        FfiConverterTypeRecurringBuyPlanDetailPnl.INSTANCE.write(c3843Atb.gEmmrt(), byteBuffer);
        FfiConverterTypeRecurringBuyPlanDetailActions.INSTANCE.write(c3843Atb.OLrzqt(), byteBuffer);
        FfiConverterTypeRecurringBuyPlanDetailOrders.INSTANCE.write(c3843Atb.copydefault(), byteBuffer);
        FfiConverterTypeRecurringBuyPlanDetailFrequency.INSTANCE.write(c3843Atb.EZpvd(), byteBuffer);
        FfiConverterTypeRecurringBuyPlanDetailPaymentMethod.INSTANCE.write(c3843Atb.KWHzl(), byteBuffer);
    }
}
