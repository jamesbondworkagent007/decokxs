package uniffi.network;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4367BcK;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.network.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeWsStaticConnectionConfig implements FfiConverterRustBuffer<C4367BcK> {
    public static final int $stable = 0;
    public static final FfiConverterTypeWsStaticConnectionConfig INSTANCE = new FfiConverterTypeWsStaticConnectionConfig();

    private FfiConverterTypeWsStaticConnectionConfig() {
    }

    @Override // uniffi.network.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4367BcK lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4367BcK) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4367BcK liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4367BcK) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4367BcK c4367BcK) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4367BcK);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4367BcK c4367BcK) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4367BcK);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4367BcK read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        String str = FfiConverterString.INSTANCE.read(byteBuffer);
        WsDoh wsDoh = FfiConverterTypeWsDoh.INSTANCE.read(byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new C4367BcK(str, wsDoh, ffiConverterBoolean.read(byteBuffer).booleanValue(), FfiConverterOptionalString.INSTANCE.read(byteBuffer), FfiConverterOptionalULong.INSTANCE.read(byteBuffer), ffiConverterBoolean.read(byteBuffer).booleanValue(), FfiConverterOptionalMapStringString.INSTANCE.read(byteBuffer), null);
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4367BcK c4367BcK) {
        Intrinsics.checkNotNullParameter(c4367BcK, "");
        long jCopydefault = C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(c4367BcK.EZpvd()) + FfiConverterTypeWsDoh.INSTANCE.mo9529allocationSizeI7RO_PI(c4367BcK.OLrzqt()));
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c4367BcK.AhwBna())) + FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(c4367BcK.djBIcL())) + FfiConverterOptionalULong.INSTANCE.mo9529allocationSizeI7RO_PI(c4367BcK.AEQbTJ())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c4367BcK.copydefault())) + FfiConverterOptionalMapStringString.INSTANCE.mo9529allocationSizeI7RO_PI(c4367BcK.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4367BcK c4367BcK, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4367BcK, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString.INSTANCE.write(c4367BcK.EZpvd(), byteBuffer);
        FfiConverterTypeWsDoh.INSTANCE.write(c4367BcK.OLrzqt(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c4367BcK.AhwBna(), byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(c4367BcK.djBIcL(), byteBuffer);
        FfiConverterOptionalULong.INSTANCE.write(c4367BcK.AEQbTJ(), byteBuffer);
        ffiConverterBoolean.write(c4367BcK.copydefault(), byteBuffer);
        FfiConverterOptionalMapStringString.INSTANCE.write(c4367BcK.KWHzl(), byteBuffer);
    }
}
