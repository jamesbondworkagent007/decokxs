package uniffi.dex;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.AGI;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes20.dex */
public final class FfiConverterTypeSubscribeProvider implements FfiConverterRustBuffer<AGI> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSubscribeProvider INSTANCE = new FfiConverterTypeSubscribeProvider();

    private FfiConverterTypeSubscribeProvider() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AGI lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AGI) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AGI liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AGI) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AGI agi) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, agi);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AGI agi) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, agi);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AGI read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return new AGI(ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AGI agi) {
        Intrinsics.checkNotNullParameter(agi, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(agi.KWHzl()) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(agi.AEQbTJ())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(agi.copydefault())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(agi.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AGI agi, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(agi, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(agi.KWHzl(), byteBuffer);
        ffiConverterOptionalString.write(agi.AEQbTJ(), byteBuffer);
        ffiConverterOptionalString.write(agi.copydefault(), byteBuffer);
        ffiConverterOptionalString.write(agi.OLrzqt(), byteBuffer);
    }
}
