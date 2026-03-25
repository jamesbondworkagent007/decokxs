package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.C58484zEb;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeLoginRegisterResult implements FfiConverterRustBuffer<C58484zEb> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLoginRegisterResult INSTANCE = new FfiConverterTypeLoginRegisterResult();

    private FfiConverterTypeLoginRegisterResult() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C58484zEb lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C58484zEb) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58484zEb liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C58484zEb) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C58484zEb c58484zEb) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c58484zEb);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C58484zEb c58484zEb) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c58484zEb);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58484zEb read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        String str2 = ffiConverterString.read(byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        String str3 = ffiConverterOptionalString.read(byteBuffer);
        String str4 = ffiConverterOptionalString.read(byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new C58484zEb(str, str2, str3, str4, ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterOptionalString.read(byteBuffer), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterOptionalString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C58484zEb c58484zEb) {
        Intrinsics.checkNotNullParameter(c58484zEb, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c58484zEb.AYXKKw()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c58484zEb.valueOf()));
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        long jCopydefault2 = C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c58484zEb.OLrzqt())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c58484zEb.KWHzl()));
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault2 + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c58484zEb.EZpvd())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c58484zEb.copydefault())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c58484zEb.AhwBna())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c58484zEb.djBIcL())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c58484zEb.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C58484zEb c58484zEb, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c58484zEb, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c58484zEb.AYXKKw(), byteBuffer);
        ffiConverterString.write(c58484zEb.valueOf(), byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(c58484zEb.OLrzqt(), byteBuffer);
        ffiConverterOptionalString.write(c58484zEb.KWHzl(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c58484zEb.EZpvd(), byteBuffer);
        ffiConverterOptionalString.write(c58484zEb.copydefault(), byteBuffer);
        ffiConverterBoolean.write(c58484zEb.AhwBna(), byteBuffer);
        ffiConverterBoolean.write(c58484zEb.djBIcL(), byteBuffer);
        ffiConverterOptionalString.write(c58484zEb.AEQbTJ(), byteBuffer);
    }
}
