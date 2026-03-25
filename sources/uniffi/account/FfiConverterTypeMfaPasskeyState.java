package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.C58562zGz;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeMfaPasskeyState implements FfiConverterRustBuffer<C58562zGz> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMfaPasskeyState INSTANCE = new FfiConverterTypeMfaPasskeyState();

    private FfiConverterTypeMfaPasskeyState() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C58562zGz lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C58562zGz) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58562zGz liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C58562zGz) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C58562zGz c58562zGz) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c58562zGz);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C58562zGz c58562zGz) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c58562zGz);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58562zGz read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C58562zGz(FfiConverterOptionalTypePasskeyAssertionParam.INSTANCE.read(byteBuffer), FfiConverterTypeAccountNetworkState.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C58562zGz c58562zGz) {
        Intrinsics.checkNotNullParameter(c58562zGz, "");
        return C56396yDv.copydefault(FfiConverterOptionalTypePasskeyAssertionParam.INSTANCE.mo9529allocationSizeI7RO_PI(c58562zGz.AEQbTJ()) + FfiConverterTypeAccountNetworkState.INSTANCE.mo9529allocationSizeI7RO_PI(c58562zGz.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C58562zGz c58562zGz, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c58562zGz, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalTypePasskeyAssertionParam.INSTANCE.write(c58562zGz.AEQbTJ(), byteBuffer);
        FfiConverterTypeAccountNetworkState.INSTANCE.write(c58562zGz.EZpvd(), byteBuffer);
    }
}
