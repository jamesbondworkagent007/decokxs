package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C2853Aas;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeProfileListInput implements FfiConverterRustBuffer<C2853Aas> {
    public static final int $stable = 0;
    public static final FfiConverterTypeProfileListInput INSTANCE = new FfiConverterTypeProfileListInput();

    private FfiConverterTypeProfileListInput() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2853Aas lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2853Aas) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2853Aas liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2853Aas) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2853Aas c2853Aas) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2853Aas);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2853Aas c2853Aas) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2853Aas);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2853Aas read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        String str = ffiConverterOptionalString.read(byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new C2853Aas(str, ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterOptionalString.read(byteBuffer), FfiConverterInt.INSTANCE.read(byteBuffer).intValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2853Aas c2853Aas) {
        Intrinsics.checkNotNullParameter(c2853Aas, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        long jMo9529allocationSizeI7RO_PI = ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c2853Aas.AEQbTJ());
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jMo9529allocationSizeI7RO_PI + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c2853Aas.OLrzqt())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c2853Aas.KWHzl())) + FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(c2853Aas.EZpvd())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c2853Aas.gEmmrt())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c2853Aas.copydefault()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2853Aas c2853Aas, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2853Aas, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(c2853Aas.AEQbTJ(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c2853Aas.OLrzqt(), byteBuffer);
        ffiConverterOptionalString.write(c2853Aas.KWHzl(), byteBuffer);
        FfiConverterInt.INSTANCE.write(c2853Aas.EZpvd(), byteBuffer);
        ffiConverterBoolean.write(c2853Aas.gEmmrt(), byteBuffer);
        ffiConverterBoolean.write(c2853Aas.copydefault(), byteBuffer);
    }
}
