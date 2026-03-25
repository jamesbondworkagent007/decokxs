package uniffi.dex;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C2297AGi;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypePresetUserParams implements FfiConverterRustBuffer<C2297AGi> {
    public static final int $stable = 0;
    public static final FfiConverterTypePresetUserParams INSTANCE = new FfiConverterTypePresetUserParams();

    private FfiConverterTypePresetUserParams() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2297AGi lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2297AGi) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2297AGi liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2297AGi) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2297AGi c2297AGi) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2297AGi);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2297AGi c2297AGi) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2297AGi);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2297AGi read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C2297AGi(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterSequenceTypePreset.INSTANCE.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2297AGi c2297AGi) {
        Intrinsics.checkNotNullParameter(c2297AGi, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c2297AGi.copydefault()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2297AGi.EZpvd())) + FfiConverterSequenceTypePreset.INSTANCE.mo9529allocationSizeI7RO_PI((List) c2297AGi.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2297AGi.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2297AGi.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2297AGi c2297AGi, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2297AGi, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c2297AGi.copydefault(), byteBuffer);
        ffiConverterString.write(c2297AGi.EZpvd(), byteBuffer);
        FfiConverterSequenceTypePreset.INSTANCE.write((List) c2297AGi.AEQbTJ(), byteBuffer);
        ffiConverterString.write(c2297AGi.OLrzqt(), byteBuffer);
        ffiConverterString.write(c2297AGi.KWHzl(), byteBuffer);
    }
}
