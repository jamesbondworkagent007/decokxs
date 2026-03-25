package uniffi.dex;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4178Azu;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes20.dex */
public final class FfiConverterTypeAddAlertResponse implements FfiConverterRustBuffer<C4178Azu> {
    public static final int $stable = 0;
    public static final FfiConverterTypeAddAlertResponse INSTANCE = new FfiConverterTypeAddAlertResponse();

    private FfiConverterTypeAddAlertResponse() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4178Azu lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4178Azu) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4178Azu liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4178Azu) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4178Azu c4178Azu) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4178Azu);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4178Azu c4178Azu) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4178Azu);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4178Azu read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C4178Azu(FfiConverterInt.INSTANCE.read(byteBuffer).intValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4178Azu c4178Azu) {
        Intrinsics.checkNotNullParameter(c4178Azu, "");
        return FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(c4178Azu.KWHzl());
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4178Azu c4178Azu, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4178Azu, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterInt.INSTANCE.write(c4178Azu.KWHzl(), byteBuffer);
    }
}
