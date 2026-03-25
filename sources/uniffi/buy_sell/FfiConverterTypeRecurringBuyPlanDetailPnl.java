package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3818AtC;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeRecurringBuyPlanDetailPnl implements FfiConverterRustBuffer<C3818AtC> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRecurringBuyPlanDetailPnl INSTANCE = new FfiConverterTypeRecurringBuyPlanDetailPnl();

    private FfiConverterTypeRecurringBuyPlanDetailPnl() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3818AtC lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3818AtC) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3818AtC liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3818AtC) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3818AtC c3818AtC) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3818AtC);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3818AtC c3818AtC) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3818AtC);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3818AtC read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeRecurringBuyPlanDetailPnlBlock ffiConverterTypeRecurringBuyPlanDetailPnlBlock = FfiConverterTypeRecurringBuyPlanDetailPnlBlock.INSTANCE;
        return new C3818AtC(ffiConverterTypeRecurringBuyPlanDetailPnlBlock.read(byteBuffer), ffiConverterTypeRecurringBuyPlanDetailPnlBlock.read(byteBuffer), ffiConverterTypeRecurringBuyPlanDetailPnlBlock.read(byteBuffer), ffiConverterTypeRecurringBuyPlanDetailPnlBlock.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3818AtC c3818AtC) {
        Intrinsics.checkNotNullParameter(c3818AtC, "");
        FfiConverterTypeRecurringBuyPlanDetailPnlBlock ffiConverterTypeRecurringBuyPlanDetailPnlBlock = FfiConverterTypeRecurringBuyPlanDetailPnlBlock.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterTypeRecurringBuyPlanDetailPnlBlock.mo9529allocationSizeI7RO_PI(c3818AtC.OLrzqt()) + ffiConverterTypeRecurringBuyPlanDetailPnlBlock.mo9529allocationSizeI7RO_PI(c3818AtC.EZpvd())) + ffiConverterTypeRecurringBuyPlanDetailPnlBlock.mo9529allocationSizeI7RO_PI(c3818AtC.copydefault())) + ffiConverterTypeRecurringBuyPlanDetailPnlBlock.mo9529allocationSizeI7RO_PI(c3818AtC.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3818AtC c3818AtC, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3818AtC, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeRecurringBuyPlanDetailPnlBlock ffiConverterTypeRecurringBuyPlanDetailPnlBlock = FfiConverterTypeRecurringBuyPlanDetailPnlBlock.INSTANCE;
        ffiConverterTypeRecurringBuyPlanDetailPnlBlock.write(c3818AtC.OLrzqt(), byteBuffer);
        ffiConverterTypeRecurringBuyPlanDetailPnlBlock.write(c3818AtC.EZpvd(), byteBuffer);
        ffiConverterTypeRecurringBuyPlanDetailPnlBlock.write(c3818AtC.copydefault(), byteBuffer);
        ffiConverterTypeRecurringBuyPlanDetailPnlBlock.write(c3818AtC.KWHzl(), byteBuffer);
    }
}
