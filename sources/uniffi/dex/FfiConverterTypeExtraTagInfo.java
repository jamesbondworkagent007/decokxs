package uniffi.dex;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.ABK;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeExtraTagInfo implements FfiConverterRustBuffer<ABK> {
    public static final int $stable = 0;
    public static final FfiConverterTypeExtraTagInfo INSTANCE = new FfiConverterTypeExtraTagInfo();

    private FfiConverterTypeExtraTagInfo() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public ABK lift2(@NotNull RustBuffer.ByValue byValue) {
        return (ABK) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public ABK liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (ABK) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull ABK abk) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abk);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull ABK abk) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abk);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public ABK read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return new ABK(ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull ABK abk) {
        Intrinsics.checkNotNullParameter(abk, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abk.djBIcL()) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abk.EZpvd())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abk.copydefault())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abk.OLrzqt())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abk.AEQbTJ())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abk.valueOf())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abk.AYXKKw())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(abk.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull ABK abk, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abk, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(abk.djBIcL(), byteBuffer);
        ffiConverterOptionalString.write(abk.EZpvd(), byteBuffer);
        ffiConverterOptionalString.write(abk.copydefault(), byteBuffer);
        ffiConverterOptionalString.write(abk.OLrzqt(), byteBuffer);
        ffiConverterOptionalString.write(abk.AEQbTJ(), byteBuffer);
        ffiConverterOptionalString.write(abk.valueOf(), byteBuffer);
        ffiConverterOptionalString.write(abk.AYXKKw(), byteBuffer);
        ffiConverterOptionalString.write(abk.KWHzl(), byteBuffer);
    }
}
