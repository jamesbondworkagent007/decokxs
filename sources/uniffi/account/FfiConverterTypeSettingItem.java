package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3117Afr;
import o.C56396yDv;
import o.zCC;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeSettingItem implements FfiConverterRustBuffer<C3117Afr> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSettingItem INSTANCE = new FfiConverterTypeSettingItem();

    private FfiConverterTypeSettingItem() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3117Afr lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3117Afr) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3117Afr liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3117Afr) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3117Afr c3117Afr) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3117Afr);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3117Afr c3117Afr) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3117Afr);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3117Afr read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        PreferenceType preferenceType = FfiConverterTypePreferenceType.INSTANCE.read(byteBuffer);
        FfiConverterTypeLocalString ffiConverterTypeLocalString = FfiConverterTypeLocalString.INSTANCE;
        zCC zcc = ffiConverterTypeLocalString.read(byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new C3117Afr(preferenceType, zcc, ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterTypeLocalString.read(byteBuffer), FfiConverterString.INSTANCE.read(byteBuffer), FfiConverterOptionalBoolean.INSTANCE.read(byteBuffer), ffiConverterBoolean.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3117Afr c3117Afr) {
        Intrinsics.checkNotNullParameter(c3117Afr, "");
        long jMo9529allocationSizeI7RO_PI = FfiConverterTypePreferenceType.INSTANCE.mo9529allocationSizeI7RO_PI(c3117Afr.copydefault());
        FfiConverterTypeLocalString ffiConverterTypeLocalString = FfiConverterTypeLocalString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(jMo9529allocationSizeI7RO_PI + ffiConverterTypeLocalString.mo9529allocationSizeI7RO_PI(c3117Afr.KWHzl()));
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3117Afr.djBIcL())) + ffiConverterTypeLocalString.mo9529allocationSizeI7RO_PI(c3117Afr.OLrzqt())) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(c3117Afr.EZpvd())) + FfiConverterOptionalBoolean.INSTANCE.mo9529allocationSizeI7RO_PI(c3117Afr.gEmmrt())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3117Afr.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3117Afr c3117Afr, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3117Afr, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypePreferenceType.INSTANCE.write(c3117Afr.copydefault(), byteBuffer);
        FfiConverterTypeLocalString ffiConverterTypeLocalString = FfiConverterTypeLocalString.INSTANCE;
        ffiConverterTypeLocalString.write(c3117Afr.KWHzl(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c3117Afr.djBIcL(), byteBuffer);
        ffiConverterTypeLocalString.write(c3117Afr.OLrzqt(), byteBuffer);
        FfiConverterString.INSTANCE.write(c3117Afr.EZpvd(), byteBuffer);
        FfiConverterOptionalBoolean.INSTANCE.write(c3117Afr.gEmmrt(), byteBuffer);
        ffiConverterBoolean.write(c3117Afr.AEQbTJ(), byteBuffer);
    }
}
