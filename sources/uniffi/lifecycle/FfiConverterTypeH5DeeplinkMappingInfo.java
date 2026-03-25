package uniffi.lifecycle;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C2695AVr;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.lifecycle.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeH5DeeplinkMappingInfo implements FfiConverterRustBuffer<C2695AVr> {
    public static final int $stable = 0;
    public static final FfiConverterTypeH5DeeplinkMappingInfo INSTANCE = new FfiConverterTypeH5DeeplinkMappingInfo();

    private FfiConverterTypeH5DeeplinkMappingInfo() {
    }

    @Override // uniffi.lifecycle.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2695AVr lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2695AVr) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2695AVr liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2695AVr) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2695AVr c2695AVr) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2695AVr);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2695AVr c2695AVr) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2695AVr);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2695AVr read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C2695AVr(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2695AVr c2695AVr) {
        Intrinsics.checkNotNullParameter(c2695AVr, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c2695AVr.OLrzqt()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2695AVr.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2695AVr.copydefault()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2695AVr c2695AVr, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2695AVr, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c2695AVr.OLrzqt(), byteBuffer);
        ffiConverterString.write(c2695AVr.AEQbTJ(), byteBuffer);
        ffiConverterString.write(c2695AVr.copydefault(), byteBuffer);
    }
}
