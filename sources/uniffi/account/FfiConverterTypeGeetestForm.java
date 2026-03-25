package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.C58403zBb;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeGeetestForm implements FfiConverterRustBuffer<C58403zBb> {
    public static final int $stable = 0;
    public static final FfiConverterTypeGeetestForm INSTANCE = new FfiConverterTypeGeetestForm();

    private FfiConverterTypeGeetestForm() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C58403zBb lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C58403zBb) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58403zBb liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C58403zBb) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C58403zBb c58403zBb) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c58403zBb);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C58403zBb c58403zBb) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c58403zBb);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58403zBb read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C58403zBb(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C58403zBb c58403zBb) {
        Intrinsics.checkNotNullParameter(c58403zBb, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c58403zBb.KWHzl()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c58403zBb.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c58403zBb.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c58403zBb.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c58403zBb.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C58403zBb c58403zBb, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c58403zBb, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c58403zBb.KWHzl(), byteBuffer);
        ffiConverterString.write(c58403zBb.AEQbTJ(), byteBuffer);
        ffiConverterString.write(c58403zBb.EZpvd(), byteBuffer);
        ffiConverterString.write(c58403zBb.copydefault(), byteBuffer);
        ffiConverterString.write(c58403zBb.OLrzqt(), byteBuffer);
    }
}
