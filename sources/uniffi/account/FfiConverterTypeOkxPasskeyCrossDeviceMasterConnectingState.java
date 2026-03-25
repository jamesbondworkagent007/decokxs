package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.C58783zPe;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOkxPasskeyCrossDeviceMasterConnectingState implements FfiConverterRustBuffer<C58783zPe> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyCrossDeviceMasterConnectingState INSTANCE = new FfiConverterTypeOkxPasskeyCrossDeviceMasterConnectingState();

    private FfiConverterTypeOkxPasskeyCrossDeviceMasterConnectingState() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C58783zPe lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C58783zPe) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58783zPe liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C58783zPe) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C58783zPe c58783zPe) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c58783zPe);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C58783zPe c58783zPe) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c58783zPe);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58783zPe read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C58783zPe(FfiConverterString.INSTANCE.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C58783zPe c58783zPe) {
        Intrinsics.checkNotNullParameter(c58783zPe, "");
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(c58783zPe.OLrzqt()) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c58783zPe.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C58783zPe c58783zPe, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c58783zPe, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString.INSTANCE.write(c58783zPe.OLrzqt(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(c58783zPe.EZpvd(), byteBuffer);
    }
}
