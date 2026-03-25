package uniffi.network;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4343Bbn;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.network.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOKXHttpRequestOptions implements FfiConverterRustBuffer<C4343Bbn> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKXHttpRequestOptions INSTANCE = new FfiConverterTypeOKXHttpRequestOptions();

    private FfiConverterTypeOKXHttpRequestOptions() {
    }

    @Override // uniffi.network.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4343Bbn lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4343Bbn) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4343Bbn liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4343Bbn) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4343Bbn c4343Bbn) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4343Bbn);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4343Bbn c4343Bbn) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4343Bbn);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4343Bbn read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C4343Bbn(FfiConverterTypeHttpMethod.INSTANCE.read(byteBuffer), FfiConverterString.INSTANCE.read(byteBuffer), FfiConverterMapStringString.INSTANCE.read(byteBuffer), FfiConverterTypeRequestBody.INSTANCE.read(byteBuffer), FfiConverterOptionalULong.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeOKXCacheConfig.INSTANCE.read(byteBuffer), FfiConverterTypeSubDomainStrategy.INSTANCE.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), FfiConverterOptionalTypeSecurityConfig.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeUploadProgressCallback.INSTANCE.read(byteBuffer), null);
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4343Bbn c4343Bbn) {
        Intrinsics.checkNotNullParameter(c4343Bbn, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterTypeHttpMethod.INSTANCE.mo9529allocationSizeI7RO_PI(c4343Bbn.AEQbTJ()) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(c4343Bbn.AYXKKw())) + FfiConverterMapStringString.INSTANCE.mo9529allocationSizeI7RO_PI(c4343Bbn.KWHzl())) + FfiConverterTypeRequestBody.INSTANCE.mo9529allocationSizeI7RO_PI(c4343Bbn.OLrzqt())) + FfiConverterOptionalULong.INSTANCE.mo9529allocationSizeI7RO_PI(c4343Bbn.gEmmrt())) + FfiConverterOptionalTypeOKXCacheConfig.INSTANCE.mo9529allocationSizeI7RO_PI(c4343Bbn.copydefault())) + FfiConverterTypeSubDomainStrategy.INSTANCE.mo9529allocationSizeI7RO_PI(c4343Bbn.valueOf())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c4343Bbn.EZpvd())) + FfiConverterOptionalTypeSecurityConfig.INSTANCE.mo9529allocationSizeI7RO_PI(c4343Bbn.djBIcL())) + FfiConverterOptionalTypeUploadProgressCallback.INSTANCE.mo9529allocationSizeI7RO_PI(c4343Bbn.AhwBna()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4343Bbn c4343Bbn, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4343Bbn, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeHttpMethod.INSTANCE.write(c4343Bbn.AEQbTJ(), byteBuffer);
        FfiConverterString.INSTANCE.write(c4343Bbn.AYXKKw(), byteBuffer);
        FfiConverterMapStringString.INSTANCE.write(c4343Bbn.KWHzl(), byteBuffer);
        FfiConverterTypeRequestBody.INSTANCE.write(c4343Bbn.OLrzqt(), byteBuffer);
        FfiConverterOptionalULong.INSTANCE.write(c4343Bbn.gEmmrt(), byteBuffer);
        FfiConverterOptionalTypeOKXCacheConfig.INSTANCE.write(c4343Bbn.copydefault(), byteBuffer);
        FfiConverterTypeSubDomainStrategy.INSTANCE.write(c4343Bbn.valueOf(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(c4343Bbn.EZpvd(), byteBuffer);
        FfiConverterOptionalTypeSecurityConfig.INSTANCE.write(c4343Bbn.djBIcL(), byteBuffer);
        FfiConverterOptionalTypeUploadProgressCallback.INSTANCE.write(c4343Bbn.AhwBna(), byteBuffer);
    }
}
