package uniffi.dex;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4176Azs;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes20.dex */
public final class FfiConverterTypeAlertDataResponse implements FfiConverterRustBuffer<C4176Azs> {
    public static final int $stable = 0;
    public static final FfiConverterTypeAlertDataResponse INSTANCE = new FfiConverterTypeAlertDataResponse();

    private FfiConverterTypeAlertDataResponse() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4176Azs lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4176Azs) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4176Azs liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4176Azs) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4176Azs c4176Azs) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4176Azs);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4176Azs c4176Azs) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4176Azs);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4176Azs read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        AlertType alertType = FfiConverterTypeAlertType.INSTANCE.read(byteBuffer);
        AlertPromptType alertPromptType = FfiConverterTypeAlertPromptType.INSTANCE.read(byteBuffer);
        AlertRepeatType alertRepeatType = FfiConverterTypeAlertRepeatType.INSTANCE.read(byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C4176Azs(alertType, alertPromptType, alertRepeatType, ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4176Azs c4176Azs) {
        Intrinsics.checkNotNullParameter(c4176Azs, "");
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterTypeAlertType.INSTANCE.mo9529allocationSizeI7RO_PI(c4176Azs.AEQbTJ()) + FfiConverterTypeAlertPromptType.INSTANCE.mo9529allocationSizeI7RO_PI(c4176Azs.AhwBna())) + FfiConverterTypeAlertRepeatType.INSTANCE.mo9529allocationSizeI7RO_PI(c4176Azs.gEmmrt()));
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterString.mo9529allocationSizeI7RO_PI(c4176Azs.AYXKKw())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4176Azs.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4176Azs.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4176Azs.fetchVPNInfo())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4176Azs.djBIcL())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c4176Azs.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4176Azs.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4176Azs.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4176Azs c4176Azs, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4176Azs, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeAlertType.INSTANCE.write(c4176Azs.AEQbTJ(), byteBuffer);
        FfiConverterTypeAlertPromptType.INSTANCE.write(c4176Azs.AhwBna(), byteBuffer);
        FfiConverterTypeAlertRepeatType.INSTANCE.write(c4176Azs.gEmmrt(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c4176Azs.AYXKKw(), byteBuffer);
        ffiConverterString.write(c4176Azs.EZpvd(), byteBuffer);
        ffiConverterString.write(c4176Azs.valueOf(), byteBuffer);
        ffiConverterString.write(c4176Azs.fetchVPNInfo(), byteBuffer);
        ffiConverterString.write(c4176Azs.djBIcL(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(c4176Azs.copydefault(), byteBuffer);
        ffiConverterString.write(c4176Azs.OLrzqt(), byteBuffer);
        ffiConverterString.write(c4176Azs.KWHzl(), byteBuffer);
    }
}
