package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.C58655zKk;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNewDeviceCodeState implements FfiConverterRustBuffer<C58655zKk> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceCodeState INSTANCE = new FfiConverterTypeNewDeviceCodeState();

    private FfiConverterTypeNewDeviceCodeState() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C58655zKk lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C58655zKk) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58655zKk liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C58655zKk) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C58655zKk c58655zKk) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c58655zKk);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C58655zKk c58655zKk) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c58655zKk);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58655zKk read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C58655zKk(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C58655zKk c58655zKk) {
        Intrinsics.checkNotNullParameter(c58655zKk, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c58655zKk.KWHzl()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c58655zKk.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C58655zKk c58655zKk, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c58655zKk, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c58655zKk.KWHzl(), byteBuffer);
        ffiConverterString.write(c58655zKk.AEQbTJ(), byteBuffer);
    }
}
