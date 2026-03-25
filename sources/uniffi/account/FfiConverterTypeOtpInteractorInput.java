package uniffi.account;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zUR;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeOtpInteractorInput implements FfiConverterRustBuffer<zUR> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOtpInteractorInput INSTANCE = new FfiConverterTypeOtpInteractorInput();

    private FfiConverterTypeOtpInteractorInput() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zUR lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zUR) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zUR liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zUR) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zUR zur) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zur);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zUR zur) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zur);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zUR read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new zUR(FfiConverterTypeOtpType.INSTANCE.read(byteBuffer), FfiConverterSequenceTypeOtpType.INSTANCE.read(byteBuffer), FfiConverterTypeStep2Type.INSTANCE.read(byteBuffer), FfiConverterInt.INSTANCE.read(byteBuffer).intValue(), FfiConverterString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zUR zur) {
        Intrinsics.checkNotNullParameter(zur, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterTypeOtpType.INSTANCE.mo9529allocationSizeI7RO_PI(zur.OLrzqt()) + FfiConverterSequenceTypeOtpType.INSTANCE.mo9529allocationSizeI7RO_PI((List) zur.AEQbTJ())) + FfiConverterTypeStep2Type.INSTANCE.mo9529allocationSizeI7RO_PI(zur.EZpvd())) + FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(zur.copydefault())) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(zur.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zUR zur, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zur, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeOtpType.INSTANCE.write(zur.OLrzqt(), byteBuffer);
        FfiConverterSequenceTypeOtpType.INSTANCE.write((List) zur.AEQbTJ(), byteBuffer);
        FfiConverterTypeStep2Type.INSTANCE.write(zur.EZpvd(), byteBuffer);
        FfiConverterInt.INSTANCE.write(zur.copydefault(), byteBuffer);
        FfiConverterString.INSTANCE.write(zur.KWHzl(), byteBuffer);
    }
}
