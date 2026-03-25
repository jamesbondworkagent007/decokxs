package uniffi.settings;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.BnW;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.settings.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeLanguageListState implements FfiConverterRustBuffer<BnW> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLanguageListState INSTANCE = new FfiConverterTypeLanguageListState();

    private FfiConverterTypeLanguageListState() {
    }

    @Override // uniffi.settings.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BnW lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BnW) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BnW liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BnW) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BnW bnW) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bnW);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BnW bnW) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bnW);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BnW read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new BnW(FfiConverterSequenceTypeSelectableLanguageItem.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BnW bnW) {
        Intrinsics.checkNotNullParameter(bnW, "");
        return FfiConverterSequenceTypeSelectableLanguageItem.INSTANCE.mo9529allocationSizeI7RO_PI((List) bnW.copydefault());
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BnW bnW, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bnW, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterSequenceTypeSelectableLanguageItem.INSTANCE.write((List) bnW.copydefault(), byteBuffer);
    }
}
