package uniffi.growth;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.ANX;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.growth.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeImageFooterConfig implements FfiConverterRustBuffer<ANX> {
    public static final int $stable = 0;
    public static final FfiConverterTypeImageFooterConfig INSTANCE = new FfiConverterTypeImageFooterConfig();

    private FfiConverterTypeImageFooterConfig() {
    }

    @Override // uniffi.growth.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public ANX lift2(@NotNull RustBuffer.ByValue byValue) {
        return (ANX) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public ANX liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (ANX) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull ANX anx) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, anx);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull ANX anx) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, anx);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public ANX read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        String str = ffiConverterOptionalString.read(byteBuffer);
        String str2 = ffiConverterOptionalString.read(byteBuffer);
        String str3 = ffiConverterOptionalString.read(byteBuffer);
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        return new ANX(str, str2, str3, ffiConverterInt.read(byteBuffer).intValue(), ffiConverterInt.read(byteBuffer).intValue(), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), ffiConverterOptionalString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull ANX anx) {
        Intrinsics.checkNotNullParameter(anx, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(anx.djBIcL()) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(anx.KWHzl())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(anx.copydefault()));
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterInt.m9536allocationSizeI7RO_PI(anx.AEQbTJ())) + ffiConverterInt.m9536allocationSizeI7RO_PI(anx.AhwBna())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(anx.OLrzqt())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(anx.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull ANX anx, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(anx, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(anx.djBIcL(), byteBuffer);
        ffiConverterOptionalString.write(anx.KWHzl(), byteBuffer);
        ffiConverterOptionalString.write(anx.copydefault(), byteBuffer);
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        ffiConverterInt.write(anx.AEQbTJ(), byteBuffer);
        ffiConverterInt.write(anx.AhwBna(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(anx.OLrzqt(), byteBuffer);
        ffiConverterOptionalString.write(anx.EZpvd(), byteBuffer);
    }
}
