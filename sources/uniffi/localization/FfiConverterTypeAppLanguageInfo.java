package uniffi.localization;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C2757AYb;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.localization.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeAppLanguageInfo implements FfiConverterRustBuffer<C2757AYb> {
    public static final int $stable = 0;
    public static final FfiConverterTypeAppLanguageInfo INSTANCE = new FfiConverterTypeAppLanguageInfo();

    private FfiConverterTypeAppLanguageInfo() {
    }

    @Override // uniffi.localization.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2757AYb lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2757AYb) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2757AYb liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2757AYb) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2757AYb c2757AYb) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2757AYb);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2757AYb c2757AYb) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2757AYb);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2757AYb read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C2757AYb(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2757AYb c2757AYb) {
        Intrinsics.checkNotNullParameter(c2757AYb, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c2757AYb.copydefault()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2757AYb.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2757AYb.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2757AYb.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2757AYb c2757AYb, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2757AYb, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c2757AYb.copydefault(), byteBuffer);
        ffiConverterString.write(c2757AYb.EZpvd(), byteBuffer);
        ffiConverterString.write(c2757AYb.KWHzl(), byteBuffer);
        ffiConverterString.write(c2757AYb.OLrzqt(), byteBuffer);
    }
}
