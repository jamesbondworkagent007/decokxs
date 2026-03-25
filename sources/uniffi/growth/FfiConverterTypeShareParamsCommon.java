package uniffi.growth;

import java.nio.ByteBuffer;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.APL;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.growth.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeShareParamsCommon implements FfiConverterRustBuffer<APL> {
    public static final int $stable = 0;
    public static final FfiConverterTypeShareParamsCommon INSTANCE = new FfiConverterTypeShareParamsCommon();

    private FfiConverterTypeShareParamsCommon() {
    }

    @Override // uniffi.growth.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public APL lift2(@NotNull RustBuffer.ByValue byValue) {
        return (APL) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public APL liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (APL) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull APL apl) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, apl);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull APL apl) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, apl);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public APL read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        Map<String, String> map = FfiConverterMapStringString.INSTANCE.read(byteBuffer);
        byte[] bArr = FfiConverterOptionalByteArray.INSTANCE.read(byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        String str2 = ffiConverterString.read(byteBuffer);
        String str3 = ffiConverterString.read(byteBuffer);
        TriggerSource triggerSource = FfiConverterTypeTriggerSource.INSTANCE.read(byteBuffer);
        String str4 = ffiConverterString.read(byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return new APL(map, bArr, str, str2, str3, triggerSource, str4, ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull APL apl) {
        Intrinsics.checkNotNullParameter(apl, "");
        long jCopydefault = C56396yDv.copydefault(FfiConverterMapStringString.INSTANCE.mo9529allocationSizeI7RO_PI(apl.OLrzqt()) + FfiConverterOptionalByteArray.INSTANCE.mo9529allocationSizeI7RO_PI(apl.copydefault()));
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault2 = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterString.mo9529allocationSizeI7RO_PI(apl.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(apl.AhwBna())) + ffiConverterString.mo9529allocationSizeI7RO_PI(apl.AEQbTJ())) + FfiConverterTypeTriggerSource.INSTANCE.mo9529allocationSizeI7RO_PI(apl.AYXKKw())) + ffiConverterString.mo9529allocationSizeI7RO_PI(apl.djBIcL()));
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault2 + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(apl.gEmmrt())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(apl.KWHzl())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(apl.EZpvd())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(apl.AkhnZx()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull APL apl, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(apl, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterMapStringString.INSTANCE.write(apl.OLrzqt(), byteBuffer);
        FfiConverterOptionalByteArray.INSTANCE.write(apl.copydefault(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(apl.valueOf(), byteBuffer);
        ffiConverterString.write(apl.AhwBna(), byteBuffer);
        ffiConverterString.write(apl.AEQbTJ(), byteBuffer);
        FfiConverterTypeTriggerSource.INSTANCE.write(apl.AYXKKw(), byteBuffer);
        ffiConverterString.write(apl.djBIcL(), byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(apl.gEmmrt(), byteBuffer);
        ffiConverterOptionalString.write(apl.KWHzl(), byteBuffer);
        ffiConverterOptionalString.write(apl.EZpvd(), byteBuffer);
        ffiConverterOptionalString.write(apl.AkhnZx(), byteBuffer);
    }
}
