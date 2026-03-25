package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C2931AcQ;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeRegisterOTPState implements FfiConverterRustBuffer<C2931AcQ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRegisterOTPState INSTANCE = new FfiConverterTypeRegisterOTPState();

    private FfiConverterTypeRegisterOTPState() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2931AcQ lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2931AcQ) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2931AcQ liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2931AcQ) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2931AcQ c2931AcQ) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2931AcQ);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2931AcQ c2931AcQ) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2931AcQ);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2931AcQ read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C2931AcQ(FfiConverterTypeSendCodeState.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2931AcQ c2931AcQ) {
        Intrinsics.checkNotNullParameter(c2931AcQ, "");
        return FfiConverterTypeSendCodeState.INSTANCE.mo9529allocationSizeI7RO_PI(c2931AcQ.AEQbTJ());
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2931AcQ c2931AcQ, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2931AcQ, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeSendCodeState.INSTANCE.write(c2931AcQ.AEQbTJ(), byteBuffer);
    }
}
