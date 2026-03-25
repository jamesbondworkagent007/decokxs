package uniffi.dex;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C2299AGk;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypePresetUserParamsJson implements FfiConverterRustBuffer<C2299AGk> {
    public static final int $stable = 0;
    public static final FfiConverterTypePresetUserParamsJson INSTANCE = new FfiConverterTypePresetUserParamsJson();

    private FfiConverterTypePresetUserParamsJson() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2299AGk lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2299AGk) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2299AGk liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2299AGk) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2299AGk c2299AGk) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2299AGk);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2299AGk c2299AGk) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2299AGk);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2299AGk read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C2299AGk(FfiConverterString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2299AGk c2299AGk) {
        Intrinsics.checkNotNullParameter(c2299AGk, "");
        return FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(c2299AGk.OLrzqt());
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2299AGk c2299AGk, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2299AGk, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString.INSTANCE.write(c2299AGk.OLrzqt(), byteBuffer);
    }
}
