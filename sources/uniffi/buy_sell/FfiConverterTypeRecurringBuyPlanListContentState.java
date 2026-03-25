package uniffi.buy_sell;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C3829AtN;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeRecurringBuyPlanListContentState implements FfiConverterRustBuffer<C3829AtN> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRecurringBuyPlanListContentState INSTANCE = new FfiConverterTypeRecurringBuyPlanListContentState();

    private FfiConverterTypeRecurringBuyPlanListContentState() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3829AtN lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3829AtN) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3829AtN liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3829AtN) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3829AtN c3829AtN) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3829AtN);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3829AtN c3829AtN) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3829AtN);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3829AtN read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C3829AtN(FfiConverterTypeRecurringBuyPlanListContentStateVariant.INSTANCE.read(byteBuffer), FfiConverterSequenceTypeRecurringBuyPlanListItem.INSTANCE.read(byteBuffer), FfiConverterString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3829AtN c3829AtN) {
        Intrinsics.checkNotNullParameter(c3829AtN, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterTypeRecurringBuyPlanListContentStateVariant.INSTANCE.mo9529allocationSizeI7RO_PI(c3829AtN.copydefault()) + FfiConverterSequenceTypeRecurringBuyPlanListItem.INSTANCE.mo9529allocationSizeI7RO_PI((List) c3829AtN.OLrzqt())) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(c3829AtN.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3829AtN c3829AtN, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3829AtN, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeRecurringBuyPlanListContentStateVariant.INSTANCE.write(c3829AtN.copydefault(), byteBuffer);
        FfiConverterSequenceTypeRecurringBuyPlanListItem.INSTANCE.write((List) c3829AtN.OLrzqt(), byteBuffer);
        FfiConverterString.INSTANCE.write(c3829AtN.KWHzl(), byteBuffer);
    }
}
