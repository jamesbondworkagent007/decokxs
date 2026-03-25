package uniffi.dex;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C2165ABg;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeDexPoolInfo implements FfiConverterRustBuffer<C2165ABg> {
    public static final int $stable = 0;
    public static final FfiConverterTypeDexPoolInfo INSTANCE = new FfiConverterTypeDexPoolInfo();

    private FfiConverterTypeDexPoolInfo() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2165ABg lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2165ABg) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2165ABg liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2165ABg) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2165ABg c2165ABg) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2165ABg);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2165ABg c2165ABg) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2165ABg);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2165ABg read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C2165ABg(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterSequenceTypeDexPoolTokenInfo.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2165ABg c2165ABg) {
        Intrinsics.checkNotNullParameter(c2165ABg, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c2165ABg.EZpvd()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2165ABg.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2165ABg.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2165ABg.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2165ABg.AhwBna())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2165ABg.copydefault())) + FfiConverterSequenceTypeDexPoolTokenInfo.INSTANCE.mo9529allocationSizeI7RO_PI((List) c2165ABg.gEmmrt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2165ABg c2165ABg, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2165ABg, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c2165ABg.EZpvd(), byteBuffer);
        ffiConverterString.write(c2165ABg.KWHzl(), byteBuffer);
        ffiConverterString.write(c2165ABg.AEQbTJ(), byteBuffer);
        ffiConverterString.write(c2165ABg.OLrzqt(), byteBuffer);
        ffiConverterString.write(c2165ABg.AhwBna(), byteBuffer);
        ffiConverterString.write(c2165ABg.copydefault(), byteBuffer);
        FfiConverterSequenceTypeDexPoolTokenInfo.INSTANCE.write((List) c2165ABg.gEmmrt(), byteBuffer);
    }
}
