package uniffi.network;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4345Bbp;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.network.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeOKXCacheConfig implements FfiConverterRustBuffer<C4345Bbp> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKXCacheConfig INSTANCE = new FfiConverterTypeOKXCacheConfig();

    private FfiConverterTypeOKXCacheConfig() {
    }

    @Override // uniffi.network.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4345Bbp lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4345Bbp) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4345Bbp liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4345Bbp) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4345Bbp c4345Bbp) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4345Bbp);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4345Bbp c4345Bbp) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4345Bbp);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4345Bbp read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C4345Bbp(FfiConverterTypeCacheStrategy.INSTANCE.read(byteBuffer), FfiConverterLong.INSTANCE.read(byteBuffer).longValue(), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4345Bbp c4345Bbp) {
        Intrinsics.checkNotNullParameter(c4345Bbp, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterTypeCacheStrategy.INSTANCE.mo9529allocationSizeI7RO_PI(c4345Bbp.OLrzqt()) + FfiConverterLong.INSTANCE.m9537allocationSizeI7RO_PI(c4345Bbp.AEQbTJ())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c4345Bbp.copydefault()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4345Bbp c4345Bbp, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4345Bbp, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeCacheStrategy.INSTANCE.write(c4345Bbp.OLrzqt(), byteBuffer);
        FfiConverterLong.INSTANCE.write(c4345Bbp.AEQbTJ(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(c4345Bbp.copydefault(), byteBuffer);
    }
}
