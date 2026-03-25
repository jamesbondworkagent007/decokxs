package uniffi.growth;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C2500AOd;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.growth.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeLinkShareParams implements FfiConverterRustBuffer<C2500AOd> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLinkShareParams INSTANCE = new FfiConverterTypeLinkShareParams();

    private FfiConverterTypeLinkShareParams() {
    }

    @Override // uniffi.growth.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2500AOd lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2500AOd) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2500AOd liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2500AOd) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2500AOd c2500AOd) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2500AOd);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2500AOd c2500AOd) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2500AOd);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2500AOd read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C2500AOd(FfiConverterTypeShareParamsCommon.INSTANCE.read(byteBuffer), FfiConverterString.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeImageSource.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2500AOd c2500AOd) {
        Intrinsics.checkNotNullParameter(c2500AOd, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterTypeShareParamsCommon.INSTANCE.mo9529allocationSizeI7RO_PI(c2500AOd.EZpvd()) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(c2500AOd.copydefault())) + FfiConverterOptionalTypeImageSource.INSTANCE.mo9529allocationSizeI7RO_PI(c2500AOd.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2500AOd c2500AOd, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2500AOd, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeShareParamsCommon.INSTANCE.write(c2500AOd.EZpvd(), byteBuffer);
        FfiConverterString.INSTANCE.write(c2500AOd.copydefault(), byteBuffer);
        FfiConverterOptionalTypeImageSource.INSTANCE.write(c2500AOd.OLrzqt(), byteBuffer);
    }
}
