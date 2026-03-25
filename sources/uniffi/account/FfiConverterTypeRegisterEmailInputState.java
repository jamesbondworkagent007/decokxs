package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C2883AbV;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeRegisterEmailInputState implements FfiConverterRustBuffer<C2883AbV> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRegisterEmailInputState INSTANCE = new FfiConverterTypeRegisterEmailInputState();

    private FfiConverterTypeRegisterEmailInputState() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2883AbV lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2883AbV) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2883AbV liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2883AbV) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2883AbV c2883AbV) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2883AbV);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2883AbV c2883AbV) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2883AbV);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2883AbV read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C2883AbV(FfiConverterOptionalString.INSTANCE.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2883AbV c2883AbV) {
        Intrinsics.checkNotNullParameter(c2883AbV, "");
        return C56396yDv.copydefault(FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(c2883AbV.OLrzqt()) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c2883AbV.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2883AbV c2883AbV, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2883AbV, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString.INSTANCE.write(c2883AbV.OLrzqt(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(c2883AbV.AEQbTJ(), byteBuffer);
    }
}
