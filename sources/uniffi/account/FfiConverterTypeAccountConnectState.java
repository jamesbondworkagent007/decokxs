package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.C60222zyf;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeAccountConnectState implements FfiConverterRustBuffer<C60222zyf> {
    public static final int $stable = 0;
    public static final FfiConverterTypeAccountConnectState INSTANCE = new FfiConverterTypeAccountConnectState();

    private FfiConverterTypeAccountConnectState() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C60222zyf lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C60222zyf) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C60222zyf liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C60222zyf) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C60222zyf c60222zyf) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c60222zyf);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C60222zyf c60222zyf) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c60222zyf);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C60222zyf read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        boolean zBooleanValue = ffiConverterBoolean.read(byteBuffer).booleanValue();
        boolean zBooleanValue2 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        boolean zBooleanValue3 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return new C60222zyf(zBooleanValue, zBooleanValue2, zBooleanValue3, ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C60222zyf c60222zyf) {
        Intrinsics.checkNotNullParameter(c60222zyf, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterBoolean.m9530allocationSizeI7RO_PI(c60222zyf.gEmmrt()) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c60222zyf.KWHzl())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c60222zyf.copydefault()));
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c60222zyf.EZpvd())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c60222zyf.AEQbTJ())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c60222zyf.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C60222zyf c60222zyf, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c60222zyf, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c60222zyf.gEmmrt(), byteBuffer);
        ffiConverterBoolean.write(c60222zyf.KWHzl(), byteBuffer);
        ffiConverterBoolean.write(c60222zyf.copydefault(), byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(c60222zyf.EZpvd(), byteBuffer);
        ffiConverterOptionalString.write(c60222zyf.AEQbTJ(), byteBuffer);
        ffiConverterOptionalString.write(c60222zyf.OLrzqt(), byteBuffer);
    }
}
