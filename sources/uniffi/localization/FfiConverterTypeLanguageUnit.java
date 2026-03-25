package uniffi.localization;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C2777AYv;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.localization.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeLanguageUnit implements FfiConverterRustBuffer<C2777AYv> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLanguageUnit INSTANCE = new FfiConverterTypeLanguageUnit();

    private FfiConverterTypeLanguageUnit() {
    }

    @Override // uniffi.localization.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2777AYv lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2777AYv) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2777AYv liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2777AYv) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2777AYv c2777AYv) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2777AYv);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2777AYv c2777AYv) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2777AYv);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2777AYv read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C2777AYv(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2777AYv c2777AYv) {
        Intrinsics.checkNotNullParameter(c2777AYv, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c2777AYv.OLrzqt()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2777AYv.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2777AYv c2777AYv, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2777AYv, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c2777AYv.OLrzqt(), byteBuffer);
        ffiConverterString.write(c2777AYv.AEQbTJ(), byteBuffer);
    }
}
