package uniffi.user;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C5010Bzg;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.user.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes14.dex */
public final class FfiConverterTypeRbacFeatures implements FfiConverterRustBuffer<C5010Bzg> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRbacFeatures INSTANCE = new FfiConverterTypeRbacFeatures();

    private FfiConverterTypeRbacFeatures() {
    }

    @Override // uniffi.user.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C5010Bzg lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C5010Bzg) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C5010Bzg liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C5010Bzg) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C5010Bzg c5010Bzg) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c5010Bzg);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C5010Bzg c5010Bzg) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c5010Bzg);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C5010Bzg read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new C5010Bzg(ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C5010Bzg c5010Bzg) {
        Intrinsics.checkNotNullParameter(c5010Bzg, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterBoolean.m9530allocationSizeI7RO_PI(c5010Bzg.OLrzqt()) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c5010Bzg.AEQbTJ())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c5010Bzg.EZpvd())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c5010Bzg.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C5010Bzg c5010Bzg, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c5010Bzg, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c5010Bzg.OLrzqt(), byteBuffer);
        ffiConverterBoolean.write(c5010Bzg.AEQbTJ(), byteBuffer);
        ffiConverterBoolean.write(c5010Bzg.EZpvd(), byteBuffer);
        ffiConverterBoolean.write(c5010Bzg.KWHzl(), byteBuffer);
    }
}
