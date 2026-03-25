package uniffi.experiment;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C2349AIi;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.experiment.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeFeatureInfo implements FfiConverterRustBuffer<C2349AIi> {
    public static final int $stable = 0;
    public static final FfiConverterTypeFeatureInfo INSTANCE = new FfiConverterTypeFeatureInfo();

    private FfiConverterTypeFeatureInfo() {
    }

    @Override // uniffi.experiment.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2349AIi lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2349AIi) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2349AIi liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2349AIi) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2349AIi c2349AIi) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2349AIi);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2349AIi c2349AIi) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2349AIi);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2349AIi read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        boolean zBooleanValue = FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue();
        int iIntValue = FfiConverterInt.INSTANCE.read(byteBuffer).intValue();
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        String str2 = ffiConverterString.read(byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return new C2349AIi(zBooleanValue, iIntValue, str, str2, ffiConverterOptionalString.read(byteBuffer), FfiConverterOptionalInt.INSTANCE.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2349AIi c2349AIi) {
        Intrinsics.checkNotNullParameter(c2349AIi, "");
        long jCopydefault = C56396yDv.copydefault(FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c2349AIi.DbNXlk()) + FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(c2349AIi.KWHzl()));
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault2 = C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterString.mo9529allocationSizeI7RO_PI(c2349AIi.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2349AIi.AYXKKw()));
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault2 + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c2349AIi.gEmmrt())) + FfiConverterOptionalInt.INSTANCE.mo9529allocationSizeI7RO_PI(c2349AIi.copydefault())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c2349AIi.OLrzqt())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c2349AIi.AEQbTJ())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c2349AIi.djBIcL())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c2349AIi.AhwBna())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c2349AIi.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2349AIi c2349AIi, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2349AIi, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean.INSTANCE.write(c2349AIi.DbNXlk(), byteBuffer);
        FfiConverterInt.INSTANCE.write(c2349AIi.KWHzl(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c2349AIi.valueOf(), byteBuffer);
        ffiConverterString.write(c2349AIi.AYXKKw(), byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(c2349AIi.gEmmrt(), byteBuffer);
        FfiConverterOptionalInt.INSTANCE.write(c2349AIi.copydefault(), byteBuffer);
        ffiConverterOptionalString.write(c2349AIi.OLrzqt(), byteBuffer);
        ffiConverterOptionalString.write(c2349AIi.AEQbTJ(), byteBuffer);
        ffiConverterOptionalString.write(c2349AIi.djBIcL(), byteBuffer);
        ffiConverterOptionalString.write(c2349AIi.AhwBna(), byteBuffer);
        ffiConverterOptionalString.write(c2349AIi.EZpvd(), byteBuffer);
    }
}
