package uniffi.retail_kline;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4526Bhi;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_kline.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeBigEventPo implements FfiConverterRustBuffer<C4526Bhi> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBigEventPo INSTANCE = new FfiConverterTypeBigEventPo();

    private FfiConverterTypeBigEventPo() {
    }

    @Override // uniffi.retail_kline.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4526Bhi lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4526Bhi) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4526Bhi liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4526Bhi) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4526Bhi c4526Bhi) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4526Bhi);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4526Bhi c4526Bhi) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4526Bhi);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4526Bhi read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        String str2 = ffiConverterString.read(byteBuffer);
        long jLongValue = FfiConverterLong.INSTANCE.read(byteBuffer).longValue();
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return new C4526Bhi(str, str2, jLongValue, ffiConverterOptionalString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterOptionalSequenceString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4526Bhi c4526Bhi) {
        Intrinsics.checkNotNullParameter(c4526Bhi, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c4526Bhi.AYXKKw()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4526Bhi.OLrzqt())) + FfiConverterLong.INSTANCE.m9537allocationSizeI7RO_PI(c4526Bhi.AkhnZx()));
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4526Bhi.DbNXlk())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4526Bhi.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4526Bhi.values())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4526Bhi.AhwBna())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4526Bhi.KWHzl())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4526Bhi.gEmmrt())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4526Bhi.fetchVPNInfo())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4526Bhi.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4526Bhi.djBIcL())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4526Bhi.AEQbTJ())) + FfiConverterOptionalSequenceString.INSTANCE.mo9529allocationSizeI7RO_PI(c4526Bhi.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4526Bhi c4526Bhi, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4526Bhi, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c4526Bhi.AYXKKw(), byteBuffer);
        ffiConverterString.write(c4526Bhi.OLrzqt(), byteBuffer);
        FfiConverterLong.INSTANCE.write(c4526Bhi.AkhnZx(), byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(c4526Bhi.DbNXlk(), byteBuffer);
        ffiConverterString.write(c4526Bhi.copydefault(), byteBuffer);
        ffiConverterString.write(c4526Bhi.values(), byteBuffer);
        ffiConverterOptionalString.write(c4526Bhi.AhwBna(), byteBuffer);
        ffiConverterOptionalString.write(c4526Bhi.KWHzl(), byteBuffer);
        ffiConverterOptionalString.write(c4526Bhi.gEmmrt(), byteBuffer);
        ffiConverterOptionalString.write(c4526Bhi.fetchVPNInfo(), byteBuffer);
        ffiConverterString.write(c4526Bhi.valueOf(), byteBuffer);
        ffiConverterString.write(c4526Bhi.djBIcL(), byteBuffer);
        ffiConverterString.write(c4526Bhi.AEQbTJ(), byteBuffer);
        FfiConverterOptionalSequenceString.INSTANCE.write(c4526Bhi.EZpvd(), byteBuffer);
    }
}
