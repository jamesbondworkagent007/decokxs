package uniffi.growth;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.APJ;
import o.C2498AOb;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.growth.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeMultiShareConfig implements FfiConverterRustBuffer<C2498AOb> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMultiShareConfig INSTANCE = new FfiConverterTypeMultiShareConfig();

    private FfiConverterTypeMultiShareConfig() {
    }

    @Override // uniffi.growth.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2498AOb lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2498AOb) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2498AOb liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2498AOb) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2498AOb c2498AOb) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2498AOb);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2498AOb c2498AOb) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2498AOb);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2498AOb read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        List<APJ> list = FfiConverterSequenceTypeShareConfig.INSTANCE.read(byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new C2498AOb(list, ffiConverterBoolean.read(byteBuffer).booleanValue(), FfiConverterFloat.INSTANCE.read(byteBuffer).floatValue(), ffiConverterBoolean.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2498AOb c2498AOb) {
        Intrinsics.checkNotNullParameter(c2498AOb, "");
        long jMo9529allocationSizeI7RO_PI = FfiConverterSequenceTypeShareConfig.INSTANCE.mo9529allocationSizeI7RO_PI((List) c2498AOb.KWHzl());
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jMo9529allocationSizeI7RO_PI + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c2498AOb.EZpvd())) + FfiConverterFloat.INSTANCE.m9535allocationSizeI7RO_PI(c2498AOb.copydefault())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c2498AOb.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2498AOb c2498AOb, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2498AOb, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterSequenceTypeShareConfig.INSTANCE.write((List) c2498AOb.KWHzl(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c2498AOb.EZpvd(), byteBuffer);
        FfiConverterFloat.INSTANCE.write(c2498AOb.copydefault(), byteBuffer);
        ffiConverterBoolean.write(c2498AOb.AEQbTJ(), byteBuffer);
    }
}
