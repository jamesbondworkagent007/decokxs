package uniffi.user;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C5016Bzm;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.user.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes14.dex */
public final class FfiConverterTypeSubUserAuthModel implements FfiConverterRustBuffer<C5016Bzm> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSubUserAuthModel INSTANCE = new FfiConverterTypeSubUserAuthModel();

    private FfiConverterTypeSubUserAuthModel() {
    }

    @Override // uniffi.user.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C5016Bzm lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C5016Bzm) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C5016Bzm liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C5016Bzm) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C5016Bzm c5016Bzm) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c5016Bzm);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C5016Bzm c5016Bzm) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c5016Bzm);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C5016Bzm read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new C5016Bzm(ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C5016Bzm c5016Bzm) {
        Intrinsics.checkNotNullParameter(c5016Bzm, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterBoolean.m9530allocationSizeI7RO_PI(c5016Bzm.OLrzqt()) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c5016Bzm.KWHzl())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c5016Bzm.values())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c5016Bzm.AYXKKw())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c5016Bzm.valueOf())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c5016Bzm.EZpvd())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c5016Bzm.gEmmrt())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c5016Bzm.djBIcL())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c5016Bzm.AhwBna())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c5016Bzm.AEQbTJ())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c5016Bzm.copydefault()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C5016Bzm c5016Bzm, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c5016Bzm, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c5016Bzm.OLrzqt(), byteBuffer);
        ffiConverterBoolean.write(c5016Bzm.KWHzl(), byteBuffer);
        ffiConverterBoolean.write(c5016Bzm.values(), byteBuffer);
        ffiConverterBoolean.write(c5016Bzm.AYXKKw(), byteBuffer);
        ffiConverterBoolean.write(c5016Bzm.valueOf(), byteBuffer);
        ffiConverterBoolean.write(c5016Bzm.EZpvd(), byteBuffer);
        ffiConverterBoolean.write(c5016Bzm.gEmmrt(), byteBuffer);
        ffiConverterBoolean.write(c5016Bzm.djBIcL(), byteBuffer);
        ffiConverterBoolean.write(c5016Bzm.AhwBna(), byteBuffer);
        ffiConverterBoolean.write(c5016Bzm.AEQbTJ(), byteBuffer);
        ffiConverterBoolean.write(c5016Bzm.copydefault(), byteBuffer);
    }
}
