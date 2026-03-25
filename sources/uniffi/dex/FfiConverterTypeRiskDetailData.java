package uniffi.dex;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C2300AGl;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeRiskDetailData implements FfiConverterRustBuffer<C2300AGl> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRiskDetailData INSTANCE = new FfiConverterTypeRiskDetailData();

    private FfiConverterTypeRiskDetailData() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2300AGl lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2300AGl) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2300AGl liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2300AGl) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2300AGl c2300AGl) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2300AGl);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2300AGl c2300AGl) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2300AGl);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2300AGl read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C2300AGl(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2300AGl c2300AGl) {
        Intrinsics.checkNotNullParameter(c2300AGl, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c2300AGl.OLrzqt()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2300AGl.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2300AGl.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2300AGl.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2300AGl.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2300AGl.gEmmrt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2300AGl.AYXKKw()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2300AGl c2300AGl, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2300AGl, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c2300AGl.OLrzqt(), byteBuffer);
        ffiConverterString.write(c2300AGl.KWHzl(), byteBuffer);
        ffiConverterString.write(c2300AGl.EZpvd(), byteBuffer);
        ffiConverterString.write(c2300AGl.AEQbTJ(), byteBuffer);
        ffiConverterString.write(c2300AGl.copydefault(), byteBuffer);
        ffiConverterString.write(c2300AGl.gEmmrt(), byteBuffer);
        ffiConverterString.write(c2300AGl.AYXKKw(), byteBuffer);
    }
}
