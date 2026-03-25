package uniffi.account;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.C58983zWt;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypePasskeyListItem implements FfiConverterRustBuffer<C58983zWt> {
    public static final int $stable = 0;
    public static final FfiConverterTypePasskeyListItem INSTANCE = new FfiConverterTypePasskeyListItem();

    private FfiConverterTypePasskeyListItem() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C58983zWt lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C58983zWt) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58983zWt liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C58983zWt) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C58983zWt c58983zWt) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c58983zWt);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C58983zWt c58983zWt) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c58983zWt);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58983zWt read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        String str2 = ffiConverterString.read(byteBuffer);
        String str3 = ffiConverterString.read(byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        boolean zBooleanValue = ffiConverterBoolean.read(byteBuffer).booleanValue();
        boolean zBooleanValue2 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        FfiConverterOptionalDouble ffiConverterOptionalDouble = FfiConverterOptionalDouble.INSTANCE;
        Double d = ffiConverterOptionalDouble.read(byteBuffer);
        Double d2 = ffiConverterOptionalDouble.read(byteBuffer);
        boolean zBooleanValue3 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        FfiConverterSequenceTypeChainInfo ffiConverterSequenceTypeChainInfo = FfiConverterSequenceTypeChainInfo.INSTANCE;
        return new C58983zWt(str, str2, str3, zBooleanValue, zBooleanValue2, d, d2, zBooleanValue3, ffiConverterSequenceTypeChainInfo.read(byteBuffer), ffiConverterSequenceTypeChainInfo.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C58983zWt c58983zWt) {
        Intrinsics.checkNotNullParameter(c58983zWt, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c58983zWt.OLrzqt()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c58983zWt.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c58983zWt.copydefault()));
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        long jCopydefault2 = C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c58983zWt.gEmmrt())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c58983zWt.AYXKKw()));
        FfiConverterOptionalDouble ffiConverterOptionalDouble = FfiConverterOptionalDouble.INSTANCE;
        long jCopydefault3 = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault2 + ffiConverterOptionalDouble.mo9529allocationSizeI7RO_PI(c58983zWt.valueOf())) + ffiConverterOptionalDouble.mo9529allocationSizeI7RO_PI(c58983zWt.djBIcL())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c58983zWt.AhwBna()));
        FfiConverterSequenceTypeChainInfo ffiConverterSequenceTypeChainInfo = FfiConverterSequenceTypeChainInfo.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault3 + ffiConverterSequenceTypeChainInfo.mo9529allocationSizeI7RO_PI((List) c58983zWt.EZpvd())) + ffiConverterSequenceTypeChainInfo.mo9529allocationSizeI7RO_PI((List) c58983zWt.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C58983zWt c58983zWt, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c58983zWt, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c58983zWt.OLrzqt(), byteBuffer);
        ffiConverterString.write(c58983zWt.AEQbTJ(), byteBuffer);
        ffiConverterString.write(c58983zWt.copydefault(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c58983zWt.gEmmrt(), byteBuffer);
        ffiConverterBoolean.write(c58983zWt.AYXKKw(), byteBuffer);
        FfiConverterOptionalDouble ffiConverterOptionalDouble = FfiConverterOptionalDouble.INSTANCE;
        ffiConverterOptionalDouble.write(c58983zWt.valueOf(), byteBuffer);
        ffiConverterOptionalDouble.write(c58983zWt.djBIcL(), byteBuffer);
        ffiConverterBoolean.write(c58983zWt.AhwBna(), byteBuffer);
        FfiConverterSequenceTypeChainInfo ffiConverterSequenceTypeChainInfo = FfiConverterSequenceTypeChainInfo.INSTANCE;
        ffiConverterSequenceTypeChainInfo.write((List) c58983zWt.EZpvd(), byteBuffer);
        ffiConverterSequenceTypeChainInfo.write((List) c58983zWt.KWHzl(), byteBuffer);
    }
}
