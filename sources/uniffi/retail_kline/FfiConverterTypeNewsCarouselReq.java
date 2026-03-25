package uniffi.retail_kline;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.BhO;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_kline.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNewsCarouselReq implements FfiConverterRustBuffer<BhO> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewsCarouselReq INSTANCE = new FfiConverterTypeNewsCarouselReq();

    private FfiConverterTypeNewsCarouselReq() {
    }

    @Override // uniffi.retail_kline.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BhO lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BhO) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BhO liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BhO) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BhO bhO) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bhO);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BhO bhO) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bhO);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BhO read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        String str2 = ffiConverterString.read(byteBuffer);
        String str3 = ffiConverterString.read(byteBuffer);
        String str4 = ffiConverterString.read(byteBuffer);
        String str5 = ffiConverterString.read(byteBuffer);
        String str6 = ffiConverterString.read(byteBuffer);
        String str7 = ffiConverterString.read(byteBuffer);
        String str8 = ffiConverterString.read(byteBuffer);
        FfiConverterULong ffiConverterULong = FfiConverterULong.INSTANCE;
        return new BhO(str, str2, str3, str4, str5, str6, str7, str8, ffiConverterULong.m9561readI7RO_PI(byteBuffer), ffiConverterULong.m9561readI7RO_PI(byteBuffer), null);
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BhO bhO) {
        Intrinsics.checkNotNullParameter(bhO, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(bhO.AhwBna()) + ffiConverterString.mo9529allocationSizeI7RO_PI(bhO.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bhO.AYXKKw())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bhO.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bhO.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bhO.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bhO.djBIcL())) + ffiConverterString.mo9529allocationSizeI7RO_PI(bhO.valueOf()));
        FfiConverterULong ffiConverterULong = FfiConverterULong.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterULong.m9556allocationSizePUiSbYQ(bhO.gEmmrt())) + ffiConverterULong.m9556allocationSizePUiSbYQ(bhO.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BhO bhO, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bhO, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(bhO.AhwBna(), byteBuffer);
        ffiConverterString.write(bhO.KWHzl(), byteBuffer);
        ffiConverterString.write(bhO.AYXKKw(), byteBuffer);
        ffiConverterString.write(bhO.OLrzqt(), byteBuffer);
        ffiConverterString.write(bhO.copydefault(), byteBuffer);
        ffiConverterString.write(bhO.EZpvd(), byteBuffer);
        ffiConverterString.write(bhO.djBIcL(), byteBuffer);
        ffiConverterString.write(bhO.valueOf(), byteBuffer);
        FfiConverterULong ffiConverterULong = FfiConverterULong.INSTANCE;
        ffiConverterULong.m9562write4PLdz1A(bhO.gEmmrt(), byteBuffer);
        ffiConverterULong.m9562write4PLdz1A(bhO.AEQbTJ(), byteBuffer);
    }
}
