package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3813Asy;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeRecurringBuyPlanDetailBanner implements FfiConverterRustBuffer<C3813Asy> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRecurringBuyPlanDetailBanner INSTANCE = new FfiConverterTypeRecurringBuyPlanDetailBanner();

    private FfiConverterTypeRecurringBuyPlanDetailBanner() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3813Asy lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3813Asy) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3813Asy liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3813Asy) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3813Asy c3813Asy) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3813Asy);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3813Asy c3813Asy) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3813Asy);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3813Asy read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        boolean zBooleanValue = ffiConverterBoolean.read(byteBuffer).booleanValue();
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C3813Asy(zBooleanValue, ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterString.read(byteBuffer), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3813Asy c3813Asy) {
        Intrinsics.checkNotNullParameter(c3813Asy, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        long jM9530allocationSizeI7RO_PI = ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3813Asy.AYXKKw());
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jM9530allocationSizeI7RO_PI + ffiConverterString.mo9529allocationSizeI7RO_PI(c3813Asy.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3813Asy.AhwBna())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3813Asy.OLrzqt())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3813Asy.djBIcL())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3813Asy.EZpvd())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3813Asy.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3813Asy.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3813Asy c3813Asy, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3813Asy, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c3813Asy.AYXKKw(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c3813Asy.KWHzl(), byteBuffer);
        ffiConverterString.write(c3813Asy.AhwBna(), byteBuffer);
        ffiConverterString.write(c3813Asy.OLrzqt(), byteBuffer);
        ffiConverterBoolean.write(c3813Asy.djBIcL(), byteBuffer);
        ffiConverterString.write(c3813Asy.EZpvd(), byteBuffer);
        ffiConverterBoolean.write(c3813Asy.copydefault(), byteBuffer);
        ffiConverterString.write(c3813Asy.AEQbTJ(), byteBuffer);
    }
}
