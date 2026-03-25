package uniffi.dex;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C4150AzS;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeChainTokensData implements FfiConverterRustBuffer<C4150AzS> {
    public static final int $stable = 0;
    public static final FfiConverterTypeChainTokensData INSTANCE = new FfiConverterTypeChainTokensData();

    private FfiConverterTypeChainTokensData() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4150AzS lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4150AzS) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4150AzS liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4150AzS) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4150AzS c4150AzS) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4150AzS);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4150AzS c4150AzS) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4150AzS);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4150AzS read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C4150AzS(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), ffiConverterString.read(byteBuffer), FfiConverterSequenceTypeTokenInfo.INSTANCE.read(byteBuffer), FfiConverterOptionalString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4150AzS c4150AzS) {
        Intrinsics.checkNotNullParameter(c4150AzS, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c4150AzS.OLrzqt()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4150AzS.AEQbTJ())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c4150AzS.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4150AzS.copydefault())) + FfiConverterSequenceTypeTokenInfo.INSTANCE.mo9529allocationSizeI7RO_PI((List) c4150AzS.AYXKKw())) + FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(c4150AzS.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4150AzS c4150AzS, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4150AzS, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c4150AzS.OLrzqt(), byteBuffer);
        ffiConverterString.write(c4150AzS.AEQbTJ(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(c4150AzS.KWHzl(), byteBuffer);
        ffiConverterString.write(c4150AzS.copydefault(), byteBuffer);
        FfiConverterSequenceTypeTokenInfo.INSTANCE.write((List) c4150AzS.AYXKKw(), byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(c4150AzS.EZpvd(), byteBuffer);
    }
}
