package uniffi.dex;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4180Azw;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeBridgeApproveData implements FfiConverterRustBuffer<C4180Azw> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBridgeApproveData INSTANCE = new FfiConverterTypeBridgeApproveData();

    private FfiConverterTypeBridgeApproveData() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4180Azw lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4180Azw) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4180Azw liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4180Azw) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4180Azw c4180Azw) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4180Azw);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4180Azw c4180Azw) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4180Azw);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4180Azw read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C4180Azw(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4180Azw c4180Azw) {
        Intrinsics.checkNotNullParameter(c4180Azw, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c4180Azw.AEQbTJ()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4180Azw.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4180Azw.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4180Azw.djBIcL())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4180Azw.gEmmrt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4180Azw.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4180Azw.AYXKKw())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4180Azw.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4180Azw c4180Azw, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4180Azw, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c4180Azw.AEQbTJ(), byteBuffer);
        ffiConverterString.write(c4180Azw.copydefault(), byteBuffer);
        ffiConverterString.write(c4180Azw.OLrzqt(), byteBuffer);
        ffiConverterString.write(c4180Azw.djBIcL(), byteBuffer);
        ffiConverterString.write(c4180Azw.gEmmrt(), byteBuffer);
        ffiConverterString.write(c4180Azw.KWHzl(), byteBuffer);
        ffiConverterString.write(c4180Azw.AYXKKw(), byteBuffer);
        ffiConverterString.write(c4180Azw.EZpvd(), byteBuffer);
    }
}
