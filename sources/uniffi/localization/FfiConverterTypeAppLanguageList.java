package uniffi.localization;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C2758AYc;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.localization.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeAppLanguageList implements FfiConverterRustBuffer<C2758AYc> {
    public static final int $stable = 0;
    public static final FfiConverterTypeAppLanguageList INSTANCE = new FfiConverterTypeAppLanguageList();

    private FfiConverterTypeAppLanguageList() {
    }

    @Override // uniffi.localization.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2758AYc lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2758AYc) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2758AYc liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2758AYc) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2758AYc c2758AYc) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2758AYc);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2758AYc c2758AYc) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2758AYc);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2758AYc read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C2758AYc(FfiConverterSequenceTypeAppLanguageItem.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2758AYc c2758AYc) {
        Intrinsics.checkNotNullParameter(c2758AYc, "");
        return FfiConverterSequenceTypeAppLanguageItem.INSTANCE.mo9529allocationSizeI7RO_PI((List) c2758AYc.EZpvd());
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2758AYc c2758AYc, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2758AYc, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterSequenceTypeAppLanguageItem.INSTANCE.write((List) c2758AYc.EZpvd(), byteBuffer);
    }
}
