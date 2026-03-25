package uniffi.user;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C5011Bzh;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.user.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes14.dex */
public final class FfiConverterTypeLocalUserData implements FfiConverterRustBuffer<C5011Bzh> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLocalUserData INSTANCE = new FfiConverterTypeLocalUserData();

    private FfiConverterTypeLocalUserData() {
    }

    @Override // uniffi.user.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C5011Bzh lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C5011Bzh) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C5011Bzh liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C5011Bzh) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C5011Bzh c5011Bzh) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c5011Bzh);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C5011Bzh c5011Bzh) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c5011Bzh);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C5011Bzh read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        boolean zBooleanValue = ffiConverterBoolean.read(byteBuffer).booleanValue();
        boolean zBooleanValue2 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        String str = FfiConverterOptionalString.INSTANCE.read(byteBuffer);
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        return new C5011Bzh(zBooleanValue, zBooleanValue2, str, ffiConverterLong.read(byteBuffer).longValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterLong.read(byteBuffer).longValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C5011Bzh c5011Bzh) {
        Intrinsics.checkNotNullParameter(c5011Bzh, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterBoolean.m9530allocationSizeI7RO_PI(c5011Bzh.gEmmrt()) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c5011Bzh.OLrzqt())) + FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(c5011Bzh.EZpvd()));
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterLong.m9537allocationSizeI7RO_PI(c5011Bzh.KWHzl())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c5011Bzh.AhwBna())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c5011Bzh.copydefault())) + ffiConverterLong.m9537allocationSizeI7RO_PI(c5011Bzh.AEQbTJ())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c5011Bzh.AYXKKw())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c5011Bzh.djBIcL())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c5011Bzh.valueOf()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C5011Bzh c5011Bzh, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c5011Bzh, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c5011Bzh.gEmmrt(), byteBuffer);
        ffiConverterBoolean.write(c5011Bzh.OLrzqt(), byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(c5011Bzh.EZpvd(), byteBuffer);
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        ffiConverterLong.write(c5011Bzh.KWHzl(), byteBuffer);
        ffiConverterBoolean.write(c5011Bzh.AhwBna(), byteBuffer);
        ffiConverterBoolean.write(c5011Bzh.copydefault(), byteBuffer);
        ffiConverterLong.write(c5011Bzh.AEQbTJ(), byteBuffer);
        ffiConverterBoolean.write(c5011Bzh.AYXKKw(), byteBuffer);
        ffiConverterBoolean.write(c5011Bzh.djBIcL(), byteBuffer);
        ffiConverterBoolean.write(c5011Bzh.valueOf(), byteBuffer);
    }
}
