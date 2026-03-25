package uniffi.buy_sell;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C3877AuI;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeRecurringBuyPlanOrderListContentState implements FfiConverterRustBuffer<C3877AuI> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRecurringBuyPlanOrderListContentState INSTANCE = new FfiConverterTypeRecurringBuyPlanOrderListContentState();

    private FfiConverterTypeRecurringBuyPlanOrderListContentState() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3877AuI lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3877AuI) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3877AuI liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3877AuI) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3877AuI c3877AuI) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3877AuI);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3877AuI c3877AuI) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3877AuI);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3877AuI read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C3877AuI(FfiConverterTypeRecurringBuyPlanOrderListContentStateVariant.INSTANCE.read(byteBuffer), FfiConverterSequenceTypeRecurringBuyPlanOrderListItem.INSTANCE.read(byteBuffer), FfiConverterString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3877AuI c3877AuI) {
        Intrinsics.checkNotNullParameter(c3877AuI, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterTypeRecurringBuyPlanOrderListContentStateVariant.INSTANCE.mo9529allocationSizeI7RO_PI(c3877AuI.OLrzqt()) + FfiConverterSequenceTypeRecurringBuyPlanOrderListItem.INSTANCE.mo9529allocationSizeI7RO_PI((List) c3877AuI.AEQbTJ())) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(c3877AuI.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3877AuI c3877AuI, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3877AuI, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeRecurringBuyPlanOrderListContentStateVariant.INSTANCE.write(c3877AuI.OLrzqt(), byteBuffer);
        FfiConverterSequenceTypeRecurringBuyPlanOrderListItem.INSTANCE.write((List) c3877AuI.AEQbTJ(), byteBuffer);
        FfiConverterString.INSTANCE.write(c3877AuI.EZpvd(), byteBuffer);
    }
}
