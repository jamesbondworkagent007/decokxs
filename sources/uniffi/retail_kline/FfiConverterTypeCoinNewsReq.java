package uniffi.retail_kline;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4528Bhk;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_kline.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeCoinNewsReq implements FfiConverterRustBuffer<C4528Bhk> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCoinNewsReq INSTANCE = new FfiConverterTypeCoinNewsReq();

    private FfiConverterTypeCoinNewsReq() {
    }

    @Override // uniffi.retail_kline.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4528Bhk lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4528Bhk) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4528Bhk liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4528Bhk) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4528Bhk c4528Bhk) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4528Bhk);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4528Bhk c4528Bhk) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4528Bhk);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4528Bhk read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterULong ffiConverterULong = FfiConverterULong.INSTANCE;
        long jM9561readI7RO_PI = ffiConverterULong.m9561readI7RO_PI(byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C4528Bhk(jM9561readI7RO_PI, ffiConverterString.read(byteBuffer), ffiConverterULong.m9561readI7RO_PI(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), null);
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4528Bhk c4528Bhk) {
        Intrinsics.checkNotNullParameter(c4528Bhk, "");
        FfiConverterULong ffiConverterULong = FfiConverterULong.INSTANCE;
        long jM9556allocationSizePUiSbYQ = ffiConverterULong.m9556allocationSizePUiSbYQ(c4528Bhk.gEmmrt());
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jM9556allocationSizePUiSbYQ + ffiConverterString.mo9529allocationSizeI7RO_PI(c4528Bhk.AYXKKw())) + ffiConverterULong.m9556allocationSizePUiSbYQ(c4528Bhk.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4528Bhk.djBIcL())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4528Bhk.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4528Bhk.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4528Bhk.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4528Bhk.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4528Bhk.valueOf()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4528Bhk c4528Bhk, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4528Bhk, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterULong ffiConverterULong = FfiConverterULong.INSTANCE;
        ffiConverterULong.m9562write4PLdz1A(c4528Bhk.gEmmrt(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c4528Bhk.AYXKKw(), byteBuffer);
        ffiConverterULong.m9562write4PLdz1A(c4528Bhk.AEQbTJ(), byteBuffer);
        ffiConverterString.write(c4528Bhk.djBIcL(), byteBuffer);
        ffiConverterString.write(c4528Bhk.EZpvd(), byteBuffer);
        ffiConverterString.write(c4528Bhk.copydefault(), byteBuffer);
        ffiConverterString.write(c4528Bhk.KWHzl(), byteBuffer);
        ffiConverterString.write(c4528Bhk.OLrzqt(), byteBuffer);
        ffiConverterString.write(c4528Bhk.valueOf(), byteBuffer);
    }
}
