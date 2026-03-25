package uniffi.account;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C3201AhV;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeUploadIdState implements FfiConverterRustBuffer<C3201AhV> {
    public static final int $stable = 0;
    public static final FfiConverterTypeUploadIdState INSTANCE = new FfiConverterTypeUploadIdState();

    private FfiConverterTypeUploadIdState() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3201AhV lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3201AhV) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3201AhV liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3201AhV) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3201AhV c3201AhV) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3201AhV);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3201AhV c3201AhV) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3201AhV);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3201AhV read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C3201AhV(FfiConverterSequenceLong.INSTANCE.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), FfiConverterOptionalString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3201AhV c3201AhV) {
        Intrinsics.checkNotNullParameter(c3201AhV, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterSequenceLong.INSTANCE.mo9529allocationSizeI7RO_PI((List) c3201AhV.KWHzl()) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c3201AhV.AEQbTJ())) + FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(c3201AhV.copydefault()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3201AhV c3201AhV, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3201AhV, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterSequenceLong.INSTANCE.write((List) c3201AhV.KWHzl(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(c3201AhV.AEQbTJ(), byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(c3201AhV.copydefault(), byteBuffer);
    }
}
