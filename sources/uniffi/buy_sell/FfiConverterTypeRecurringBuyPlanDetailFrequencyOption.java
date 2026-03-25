package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3769AsG;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeRecurringBuyPlanDetailFrequencyOption implements FfiConverterRustBuffer<C3769AsG> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRecurringBuyPlanDetailFrequencyOption INSTANCE = new FfiConverterTypeRecurringBuyPlanDetailFrequencyOption();

    private FfiConverterTypeRecurringBuyPlanDetailFrequencyOption() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3769AsG lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3769AsG) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3769AsG liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3769AsG) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3769AsG c3769AsG) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3769AsG);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3769AsG c3769AsG) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3769AsG);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3769AsG read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C3769AsG(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3769AsG c3769AsG) {
        Intrinsics.checkNotNullParameter(c3769AsG, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c3769AsG.copydefault()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3769AsG.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3769AsG.KWHzl())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c3769AsG.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3769AsG c3769AsG, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3769AsG, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c3769AsG.copydefault(), byteBuffer);
        ffiConverterString.write(c3769AsG.EZpvd(), byteBuffer);
        ffiConverterString.write(c3769AsG.KWHzl(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(c3769AsG.AEQbTJ(), byteBuffer);
    }
}
