package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C2836Aab;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypePreConditionResponse implements FfiConverterRustBuffer<C2836Aab> {
    public static final int $stable = 0;
    public static final FfiConverterTypePreConditionResponse INSTANCE = new FfiConverterTypePreConditionResponse();

    private FfiConverterTypePreConditionResponse() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2836Aab lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2836Aab) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2836Aab liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2836Aab) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2836Aab c2836Aab) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2836Aab);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2836Aab c2836Aab) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2836Aab);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2836Aab read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return new C2836Aab(ffiConverterOptionalString.read(byteBuffer), FfiConverterOptionalSequenceString.INSTANCE.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2836Aab c2836Aab) {
        Intrinsics.checkNotNullParameter(c2836Aab, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c2836Aab.OLrzqt()) + FfiConverterOptionalSequenceString.INSTANCE.mo9529allocationSizeI7RO_PI(c2836Aab.copydefault())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c2836Aab.EZpvd()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2836Aab c2836Aab, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2836Aab, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(c2836Aab.OLrzqt(), byteBuffer);
        FfiConverterOptionalSequenceString.INSTANCE.write(c2836Aab.copydefault(), byteBuffer);
        ffiConverterOptionalString.write(c2836Aab.EZpvd(), byteBuffer);
    }
}
