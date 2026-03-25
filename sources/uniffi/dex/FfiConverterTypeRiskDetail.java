package uniffi.dex;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C2296AGh;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeRiskDetail implements FfiConverterRustBuffer<C2296AGh> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRiskDetail INSTANCE = new FfiConverterTypeRiskDetail();

    private FfiConverterTypeRiskDetail() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2296AGh lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2296AGh) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2296AGh liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2296AGh) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2296AGh c2296AGh) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2296AGh);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2296AGh c2296AGh) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2296AGh);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2296AGh read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C2296AGh(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterTypeCoinRiskLevel.INSTANCE.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2296AGh c2296AGh) {
        Intrinsics.checkNotNullParameter(c2296AGh, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c2296AGh.copydefault()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2296AGh.KWHzl())) + FfiConverterTypeCoinRiskLevel.INSTANCE.mo9529allocationSizeI7RO_PI(c2296AGh.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2296AGh.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2296AGh c2296AGh, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2296AGh, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c2296AGh.copydefault(), byteBuffer);
        ffiConverterString.write(c2296AGh.KWHzl(), byteBuffer);
        FfiConverterTypeCoinRiskLevel.INSTANCE.write(c2296AGh.OLrzqt(), byteBuffer);
        ffiConverterString.write(c2296AGh.EZpvd(), byteBuffer);
    }
}
