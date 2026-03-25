package uniffi.dex;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.ABG;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes20.dex */
public final class FfiConverterTypeFeeConfig implements FfiConverterRustBuffer<ABG> {
    public static final int $stable = 0;
    public static final FfiConverterTypeFeeConfig INSTANCE = new FfiConverterTypeFeeConfig();

    private FfiConverterTypeFeeConfig() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public ABG lift2(@NotNull RustBuffer.ByValue byValue) {
        return (ABG) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public ABG liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (ABG) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull ABG abg) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abg);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull ABG abg) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abg);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public ABG read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        String str2 = ffiConverterString.read(byteBuffer);
        String str3 = ffiConverterString.read(byteBuffer);
        String str4 = ffiConverterString.read(byteBuffer);
        FfiConverterSequenceTypeFeeOption ffiConverterSequenceTypeFeeOption = FfiConverterSequenceTypeFeeOption.INSTANCE;
        return new ABG(str, str2, str3, str4, ffiConverterSequenceTypeFeeOption.read(byteBuffer), ffiConverterSequenceTypeFeeOption.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull ABG abg) {
        Intrinsics.checkNotNullParameter(abg, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(abg.gEmmrt()) + ffiConverterString.mo9529allocationSizeI7RO_PI(abg.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abg.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(abg.OLrzqt()));
        FfiConverterSequenceTypeFeeOption ffiConverterSequenceTypeFeeOption = FfiConverterSequenceTypeFeeOption.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterSequenceTypeFeeOption.mo9529allocationSizeI7RO_PI((List) abg.AEQbTJ())) + ffiConverterSequenceTypeFeeOption.mo9529allocationSizeI7RO_PI((List) abg.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull ABG abg, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abg, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(abg.gEmmrt(), byteBuffer);
        ffiConverterString.write(abg.EZpvd(), byteBuffer);
        ffiConverterString.write(abg.copydefault(), byteBuffer);
        ffiConverterString.write(abg.OLrzqt(), byteBuffer);
        FfiConverterSequenceTypeFeeOption ffiConverterSequenceTypeFeeOption = FfiConverterSequenceTypeFeeOption.INSTANCE;
        ffiConverterSequenceTypeFeeOption.write((List) abg.AEQbTJ(), byteBuffer);
        ffiConverterSequenceTypeFeeOption.write((List) abg.KWHzl(), byteBuffer);
    }
}
