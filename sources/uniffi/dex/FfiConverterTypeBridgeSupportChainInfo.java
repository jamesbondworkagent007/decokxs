package uniffi.dex;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4136AzE;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeBridgeSupportChainInfo implements FfiConverterRustBuffer<C4136AzE> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBridgeSupportChainInfo INSTANCE = new FfiConverterTypeBridgeSupportChainInfo();

    private FfiConverterTypeBridgeSupportChainInfo() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4136AzE lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4136AzE) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4136AzE liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4136AzE) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4136AzE c4136AzE) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4136AzE);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4136AzE c4136AzE) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4136AzE);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4136AzE read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        String str = ffiConverterOptionalString.read(byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C4136AzE(str, ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4136AzE c4136AzE) {
        Intrinsics.checkNotNullParameter(c4136AzE, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        long jMo9529allocationSizeI7RO_PI = ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4136AzE.EZpvd());
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jMo9529allocationSizeI7RO_PI + ffiConverterString.mo9529allocationSizeI7RO_PI(c4136AzE.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4136AzE.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4136AzE.copydefault())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4136AzE.AEQbTJ())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4136AzE.AhwBna())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4136AzE.valueOf())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4136AzE.djBIcL())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4136AzE.gEmmrt())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c4136AzE.AYXKKw()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4136AzE c4136AzE, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4136AzE, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(c4136AzE.EZpvd(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c4136AzE.KWHzl(), byteBuffer);
        ffiConverterString.write(c4136AzE.OLrzqt(), byteBuffer);
        ffiConverterString.write(c4136AzE.copydefault(), byteBuffer);
        ffiConverterOptionalString.write(c4136AzE.AEQbTJ(), byteBuffer);
        ffiConverterOptionalString.write(c4136AzE.AhwBna(), byteBuffer);
        ffiConverterOptionalString.write(c4136AzE.valueOf(), byteBuffer);
        ffiConverterOptionalString.write(c4136AzE.djBIcL(), byteBuffer);
        ffiConverterOptionalString.write(c4136AzE.gEmmrt(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(c4136AzE.AYXKKw(), byteBuffer);
    }
}
