package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zDG;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeLoginNameResult implements FfiConverterRustBuffer<zDG> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLoginNameResult INSTANCE = new FfiConverterTypeLoginNameResult();

    private FfiConverterTypeLoginNameResult() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zDG lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zDG) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zDG liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zDG) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zDG zdg) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zdg);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zDG zdg) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zdg);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zDG read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return new zDG(ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), FfiConverterString.INSTANCE.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), FfiConverterOptionalBoolean.INSTANCE.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zDG zdg) {
        Intrinsics.checkNotNullParameter(zdg, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(zdg.copydefault()) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(zdg.KWHzl())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(zdg.OLrzqt())) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(zdg.gEmmrt())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(zdg.EZpvd())) + FfiConverterOptionalBoolean.INSTANCE.mo9529allocationSizeI7RO_PI(zdg.valueOf())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(zdg.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zDG zdg, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zdg, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(zdg.copydefault(), byteBuffer);
        ffiConverterOptionalString.write(zdg.KWHzl(), byteBuffer);
        ffiConverterOptionalString.write(zdg.OLrzqt(), byteBuffer);
        FfiConverterString.INSTANCE.write(zdg.gEmmrt(), byteBuffer);
        ffiConverterOptionalString.write(zdg.EZpvd(), byteBuffer);
        FfiConverterOptionalBoolean.INSTANCE.write(zdg.valueOf(), byteBuffer);
        ffiConverterOptionalString.write(zdg.AEQbTJ(), byteBuffer);
    }
}
