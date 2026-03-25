package uniffi.growth;

import java.nio.ByteBuffer;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.AOH;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.growth.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypePopupPriorityConfig implements FfiConverterRustBuffer<AOH> {
    public static final int $stable = 0;
    public static final FfiConverterTypePopupPriorityConfig INSTANCE = new FfiConverterTypePopupPriorityConfig();

    private FfiConverterTypePopupPriorityConfig() {
    }

    @Override // uniffi.growth.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AOH lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AOH) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AOH liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AOH) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AOH aoh) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, aoh);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AOH aoh) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, aoh);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AOH read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new AOH(FfiConverterMapIntInt.INSTANCE.read(byteBuffer), FfiConverterMapIntTypePopupNextAction.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AOH aoh) {
        Intrinsics.checkNotNullParameter(aoh, "");
        return C56396yDv.copydefault(FfiConverterMapIntInt.INSTANCE.mo9529allocationSizeI7RO_PI(aoh.KWHzl()) + FfiConverterMapIntTypePopupNextAction.INSTANCE.mo9529allocationSizeI7RO_PI((Map<Integer, ? extends PopupNextAction>) aoh.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AOH aoh, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(aoh, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterMapIntInt.INSTANCE.write(aoh.KWHzl(), byteBuffer);
        FfiConverterMapIntTypePopupNextAction.INSTANCE.write((Map<Integer, ? extends PopupNextAction>) aoh.EZpvd(), byteBuffer);
    }
}
