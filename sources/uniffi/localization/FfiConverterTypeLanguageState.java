package uniffi.localization;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C2772AYq;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.localization.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeLanguageState implements FfiConverterRustBuffer<C2772AYq> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLanguageState INSTANCE = new FfiConverterTypeLanguageState();

    private FfiConverterTypeLanguageState() {
    }

    @Override // uniffi.localization.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2772AYq lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2772AYq) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2772AYq liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2772AYq) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2772AYq c2772AYq) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2772AYq);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2772AYq c2772AYq) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2772AYq);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2772AYq read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeAppLanguage ffiConverterTypeAppLanguage = FfiConverterTypeAppLanguage.INSTANCE;
        return new C2772AYq(ffiConverterTypeAppLanguage.read(byteBuffer), ffiConverterTypeAppLanguage.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2772AYq c2772AYq) {
        Intrinsics.checkNotNullParameter(c2772AYq, "");
        FfiConverterTypeAppLanguage ffiConverterTypeAppLanguage = FfiConverterTypeAppLanguage.INSTANCE;
        return C56396yDv.copydefault(ffiConverterTypeAppLanguage.mo9529allocationSizeI7RO_PI(c2772AYq.copydefault()) + ffiConverterTypeAppLanguage.mo9529allocationSizeI7RO_PI(c2772AYq.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2772AYq c2772AYq, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2772AYq, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeAppLanguage ffiConverterTypeAppLanguage = FfiConverterTypeAppLanguage.INSTANCE;
        ffiConverterTypeAppLanguage.write(c2772AYq.copydefault(), byteBuffer);
        ffiConverterTypeAppLanguage.write(c2772AYq.AEQbTJ(), byteBuffer);
    }
}
