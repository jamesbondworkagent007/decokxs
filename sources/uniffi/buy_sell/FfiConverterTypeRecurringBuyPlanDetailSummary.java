package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3826AtK;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeRecurringBuyPlanDetailSummary implements FfiConverterRustBuffer<C3826AtK> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRecurringBuyPlanDetailSummary INSTANCE = new FfiConverterTypeRecurringBuyPlanDetailSummary();

    private FfiConverterTypeRecurringBuyPlanDetailSummary() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3826AtK lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3826AtK) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3826AtK liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3826AtK) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3826AtK c3826AtK) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3826AtK);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3826AtK c3826AtK) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3826AtK);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3826AtK read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        String str2 = ffiConverterString.read(byteBuffer);
        String str3 = ffiConverterString.read(byteBuffer);
        String str4 = ffiConverterString.read(byteBuffer);
        String str5 = ffiConverterString.read(byteBuffer);
        String str6 = ffiConverterString.read(byteBuffer);
        String str7 = ffiConverterString.read(byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new C3826AtK(str, str2, str3, str4, str5, str6, str7, ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3826AtK c3826AtK) {
        Intrinsics.checkNotNullParameter(c3826AtK, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c3826AtK.djBIcL()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3826AtK.AhwBna())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3826AtK.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3826AtK.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3826AtK.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3826AtK.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3826AtK.gEmmrt()));
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3826AtK.copydefault())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3826AtK.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3826AtK.AYXKKw()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3826AtK c3826AtK, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3826AtK, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c3826AtK.djBIcL(), byteBuffer);
        ffiConverterString.write(c3826AtK.AhwBna(), byteBuffer);
        ffiConverterString.write(c3826AtK.EZpvd(), byteBuffer);
        ffiConverterString.write(c3826AtK.KWHzl(), byteBuffer);
        ffiConverterString.write(c3826AtK.AEQbTJ(), byteBuffer);
        ffiConverterString.write(c3826AtK.OLrzqt(), byteBuffer);
        ffiConverterString.write(c3826AtK.gEmmrt(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c3826AtK.copydefault(), byteBuffer);
        ffiConverterBoolean.write(c3826AtK.valueOf(), byteBuffer);
        ffiConverterString.write(c3826AtK.AYXKKw(), byteBuffer);
    }
}
