package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3814Asz;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeRecurringBuyPlanDetailActions implements FfiConverterRustBuffer<C3814Asz> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRecurringBuyPlanDetailActions INSTANCE = new FfiConverterTypeRecurringBuyPlanDetailActions();

    private FfiConverterTypeRecurringBuyPlanDetailActions() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3814Asz lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3814Asz) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3814Asz liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3814Asz) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3814Asz c3814Asz) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3814Asz);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3814Asz c3814Asz) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3814Asz);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3814Asz read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new C3814Asz(ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3814Asz c3814Asz) {
        Intrinsics.checkNotNullParameter(c3814Asz, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3814Asz.copydefault()) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3814Asz.OLrzqt())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3814Asz.EZpvd())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3814Asz.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3814Asz c3814Asz, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3814Asz, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c3814Asz.copydefault(), byteBuffer);
        ffiConverterBoolean.write(c3814Asz.OLrzqt(), byteBuffer);
        ffiConverterBoolean.write(c3814Asz.EZpvd(), byteBuffer);
        ffiConverterBoolean.write(c3814Asz.AEQbTJ(), byteBuffer);
    }
}
