package uniffi.dex;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4149AzR;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeBridgeTokenListRequest implements FfiConverterRustBuffer<C4149AzR> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBridgeTokenListRequest INSTANCE = new FfiConverterTypeBridgeTokenListRequest();

    private FfiConverterTypeBridgeTokenListRequest() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4149AzR lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4149AzR) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4149AzR liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4149AzR) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4149AzR c4149AzR) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4149AzR);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4149AzR c4149AzR) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4149AzR);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4149AzR read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return new C4149AzR(ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4149AzR c4149AzR) {
        Intrinsics.checkNotNullParameter(c4149AzR, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4149AzR.copydefault()) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4149AzR.djBIcL())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4149AzR.AEQbTJ())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4149AzR.isConnected())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4149AzR.DbNXlk())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4149AzR.OLrzqt())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4149AzR.gEmmrt())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4149AzR.AhwBna())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4149AzR.KWHzl())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4149AzR.EZpvd())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4149AzR.valueOf())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c4149AzR.AYXKKw()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4149AzR c4149AzR, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4149AzR, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(c4149AzR.copydefault(), byteBuffer);
        ffiConverterOptionalString.write(c4149AzR.djBIcL(), byteBuffer);
        ffiConverterOptionalString.write(c4149AzR.AEQbTJ(), byteBuffer);
        ffiConverterOptionalString.write(c4149AzR.isConnected(), byteBuffer);
        ffiConverterOptionalString.write(c4149AzR.DbNXlk(), byteBuffer);
        ffiConverterOptionalString.write(c4149AzR.OLrzqt(), byteBuffer);
        ffiConverterOptionalString.write(c4149AzR.gEmmrt(), byteBuffer);
        ffiConverterOptionalString.write(c4149AzR.AhwBna(), byteBuffer);
        ffiConverterOptionalString.write(c4149AzR.KWHzl(), byteBuffer);
        ffiConverterOptionalString.write(c4149AzR.EZpvd(), byteBuffer);
        ffiConverterOptionalString.write(c4149AzR.valueOf(), byteBuffer);
        ffiConverterOptionalString.write(c4149AzR.AYXKKw(), byteBuffer);
    }
}
