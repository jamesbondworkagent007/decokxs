package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.C58391zAq;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeConsentItem implements FfiConverterRustBuffer<C58391zAq> {
    public static final int $stable = 0;
    public static final FfiConverterTypeConsentItem INSTANCE = new FfiConverterTypeConsentItem();

    private FfiConverterTypeConsentItem() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C58391zAq lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C58391zAq) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58391zAq liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C58391zAq) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C58391zAq c58391zAq) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c58391zAq);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C58391zAq c58391zAq) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c58391zAq);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58391zAq read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        String str = ffiConverterOptionalString.read(byteBuffer);
        String str2 = ffiConverterOptionalString.read(byteBuffer);
        String str3 = ffiConverterOptionalString.read(byteBuffer);
        String str4 = ffiConverterOptionalString.read(byteBuffer);
        ConsentDisplayType consentDisplayType = FfiConverterOptionalTypeConsentDisplayType.INSTANCE.read(byteBuffer);
        FfiConverterOptionalBoolean ffiConverterOptionalBoolean = FfiConverterOptionalBoolean.INSTANCE;
        return new C58391zAq(str, str2, str3, str4, consentDisplayType, ffiConverterOptionalBoolean.read(byteBuffer), ffiConverterOptionalBoolean.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), FfiConverterOptionalSequenceTypeLinkTextParam.INSTANCE.read(byteBuffer), ffiConverterOptionalBoolean.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C58391zAq c58391zAq) {
        Intrinsics.checkNotNullParameter(c58391zAq, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c58391zAq.KWHzl()) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c58391zAq.AEQbTJ())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c58391zAq.EZpvd())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c58391zAq.AYXKKw())) + FfiConverterOptionalTypeConsentDisplayType.INSTANCE.mo9529allocationSizeI7RO_PI(c58391zAq.OLrzqt()));
        FfiConverterOptionalBoolean ffiConverterOptionalBoolean = FfiConverterOptionalBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterOptionalBoolean.mo9529allocationSizeI7RO_PI(c58391zAq.copydefault())) + ffiConverterOptionalBoolean.mo9529allocationSizeI7RO_PI(c58391zAq.valueOf())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c58391zAq.gEmmrt())) + FfiConverterOptionalSequenceTypeLinkTextParam.INSTANCE.mo9529allocationSizeI7RO_PI(c58391zAq.AhwBna())) + ffiConverterOptionalBoolean.mo9529allocationSizeI7RO_PI(c58391zAq.djBIcL()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C58391zAq c58391zAq, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c58391zAq, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(c58391zAq.KWHzl(), byteBuffer);
        ffiConverterOptionalString.write(c58391zAq.AEQbTJ(), byteBuffer);
        ffiConverterOptionalString.write(c58391zAq.EZpvd(), byteBuffer);
        ffiConverterOptionalString.write(c58391zAq.AYXKKw(), byteBuffer);
        FfiConverterOptionalTypeConsentDisplayType.INSTANCE.write(c58391zAq.OLrzqt(), byteBuffer);
        FfiConverterOptionalBoolean ffiConverterOptionalBoolean = FfiConverterOptionalBoolean.INSTANCE;
        ffiConverterOptionalBoolean.write(c58391zAq.copydefault(), byteBuffer);
        ffiConverterOptionalBoolean.write(c58391zAq.valueOf(), byteBuffer);
        ffiConverterOptionalString.write(c58391zAq.gEmmrt(), byteBuffer);
        FfiConverterOptionalSequenceTypeLinkTextParam.INSTANCE.write(c58391zAq.AhwBna(), byteBuffer);
        ffiConverterOptionalBoolean.write(c58391zAq.djBIcL(), byteBuffer);
    }
}
