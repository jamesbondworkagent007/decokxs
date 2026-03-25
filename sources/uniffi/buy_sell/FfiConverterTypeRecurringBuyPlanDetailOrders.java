package uniffi.buy_sell;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C3816AtA;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeRecurringBuyPlanDetailOrders implements FfiConverterRustBuffer<C3816AtA> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRecurringBuyPlanDetailOrders INSTANCE = new FfiConverterTypeRecurringBuyPlanDetailOrders();

    private FfiConverterTypeRecurringBuyPlanDetailOrders() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3816AtA lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3816AtA) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3816AtA liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3816AtA) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3816AtA c3816AtA) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3816AtA);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3816AtA c3816AtA) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3816AtA);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3816AtA read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C3816AtA(FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), FfiConverterSequenceTypeRecurringBuyPlanOrderListItem.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3816AtA c3816AtA) {
        Intrinsics.checkNotNullParameter(c3816AtA, "");
        return C56396yDv.copydefault(FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c3816AtA.EZpvd()) + FfiConverterSequenceTypeRecurringBuyPlanOrderListItem.INSTANCE.mo9529allocationSizeI7RO_PI((List) c3816AtA.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3816AtA c3816AtA, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3816AtA, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean.INSTANCE.write(c3816AtA.EZpvd(), byteBuffer);
        FfiConverterSequenceTypeRecurringBuyPlanOrderListItem.INSTANCE.write((List) c3816AtA.AEQbTJ(), byteBuffer);
    }
}
