package uniffi.account;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C2908Abu;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeRegisterCorState implements FfiConverterRustBuffer<C2908Abu> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRegisterCorState INSTANCE = new FfiConverterTypeRegisterCorState();

    private FfiConverterTypeRegisterCorState() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2908Abu lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2908Abu) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2908Abu liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2908Abu) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2908Abu c2908Abu) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2908Abu);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2908Abu c2908Abu) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2908Abu);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2908Abu read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        String str = ffiConverterOptionalString.read(byteBuffer);
        String str2 = ffiConverterOptionalString.read(byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new C2908Abu(str, str2, ffiConverterBoolean.read(byteBuffer).booleanValue(), FfiConverterOptionalTypeConsentResponse.INSTANCE.read(byteBuffer), FfiConverterSequenceTypeConsentItem.INSTANCE.read(byteBuffer), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2908Abu c2908Abu) {
        Intrinsics.checkNotNullParameter(c2908Abu, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c2908Abu.copydefault()) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c2908Abu.EZpvd()));
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c2908Abu.AYXKKw())) + FfiConverterOptionalTypeConsentResponse.INSTANCE.mo9529allocationSizeI7RO_PI(c2908Abu.OLrzqt())) + FfiConverterSequenceTypeConsentItem.INSTANCE.mo9529allocationSizeI7RO_PI((List) c2908Abu.AEQbTJ())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c2908Abu.djBIcL())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c2908Abu.AhwBna())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c2908Abu.KWHzl())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c2908Abu.valueOf()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2908Abu c2908Abu, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2908Abu, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(c2908Abu.copydefault(), byteBuffer);
        ffiConverterOptionalString.write(c2908Abu.EZpvd(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c2908Abu.AYXKKw(), byteBuffer);
        FfiConverterOptionalTypeConsentResponse.INSTANCE.write(c2908Abu.OLrzqt(), byteBuffer);
        FfiConverterSequenceTypeConsentItem.INSTANCE.write((List) c2908Abu.AEQbTJ(), byteBuffer);
        ffiConverterBoolean.write(c2908Abu.djBIcL(), byteBuffer);
        ffiConverterBoolean.write(c2908Abu.AhwBna(), byteBuffer);
        ffiConverterBoolean.write(c2908Abu.KWHzl(), byteBuffer);
        ffiConverterBoolean.write(c2908Abu.valueOf(), byteBuffer);
    }
}
