package uniffi.user;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C5012Bzi;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.user.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes14.dex */
public final class FfiConverterTypeSubAccountFunction implements FfiConverterRustBuffer<C5012Bzi> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSubAccountFunction INSTANCE = new FfiConverterTypeSubAccountFunction();

    private FfiConverterTypeSubAccountFunction() {
    }

    @Override // uniffi.user.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C5012Bzi lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C5012Bzi) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C5012Bzi liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C5012Bzi) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C5012Bzi c5012Bzi) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c5012Bzi);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C5012Bzi c5012Bzi) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c5012Bzi);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C5012Bzi read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new C5012Bzi(ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C5012Bzi c5012Bzi) {
        Intrinsics.checkNotNullParameter(c5012Bzi, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterBoolean.m9530allocationSizeI7RO_PI(c5012Bzi.OLrzqt()) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c5012Bzi.AEQbTJ())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c5012Bzi.EZpvd())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c5012Bzi.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C5012Bzi c5012Bzi, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c5012Bzi, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c5012Bzi.OLrzqt(), byteBuffer);
        ffiConverterBoolean.write(c5012Bzi.AEQbTJ(), byteBuffer);
        ffiConverterBoolean.write(c5012Bzi.EZpvd(), byteBuffer);
        ffiConverterBoolean.write(c5012Bzi.KWHzl(), byteBuffer);
    }
}
