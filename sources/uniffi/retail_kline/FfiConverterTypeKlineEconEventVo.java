package uniffi.retail_kline;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4531Bhn;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_kline.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeKlineEconEventVo implements FfiConverterRustBuffer<C4531Bhn> {
    public static final int $stable = 0;
    public static final FfiConverterTypeKlineEconEventVo INSTANCE = new FfiConverterTypeKlineEconEventVo();

    private FfiConverterTypeKlineEconEventVo() {
    }

    @Override // uniffi.retail_kline.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4531Bhn lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4531Bhn) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4531Bhn liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4531Bhn) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4531Bhn c4531Bhn) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4531Bhn);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4531Bhn c4531Bhn) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4531Bhn);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4531Bhn read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C4531Bhn(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4531Bhn c4531Bhn) {
        Intrinsics.checkNotNullParameter(c4531Bhn, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c4531Bhn.copydefault()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4531Bhn.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4531Bhn.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4531Bhn.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4531Bhn.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4531Bhn.AhwBna())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4531Bhn.AYXKKw())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4531Bhn.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4531Bhn.djBIcL())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4531Bhn.gEmmrt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4531Bhn.values()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4531Bhn c4531Bhn, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4531Bhn, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c4531Bhn.copydefault(), byteBuffer);
        ffiConverterString.write(c4531Bhn.EZpvd(), byteBuffer);
        ffiConverterString.write(c4531Bhn.KWHzl(), byteBuffer);
        ffiConverterString.write(c4531Bhn.AEQbTJ(), byteBuffer);
        ffiConverterString.write(c4531Bhn.OLrzqt(), byteBuffer);
        ffiConverterString.write(c4531Bhn.AhwBna(), byteBuffer);
        ffiConverterString.write(c4531Bhn.AYXKKw(), byteBuffer);
        ffiConverterString.write(c4531Bhn.valueOf(), byteBuffer);
        ffiConverterString.write(c4531Bhn.djBIcL(), byteBuffer);
        ffiConverterString.write(c4531Bhn.gEmmrt(), byteBuffer);
        ffiConverterString.write(c4531Bhn.values(), byteBuffer);
    }
}
