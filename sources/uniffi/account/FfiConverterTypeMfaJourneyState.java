package uniffi.account;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.C58524zFo;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeMfaJourneyState implements FfiConverterRustBuffer<C58524zFo> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMfaJourneyState INSTANCE = new FfiConverterTypeMfaJourneyState();

    private FfiConverterTypeMfaJourneyState() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C58524zFo lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C58524zFo) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58524zFo liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C58524zFo) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C58524zFo c58524zFo) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c58524zFo);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C58524zFo c58524zFo) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c58524zFo);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C58524zFo read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        MfaStep mfaStep = FfiConverterTypeMfaStep.INSTANCE.read(byteBuffer);
        List<String> list = FfiConverterSequenceString.INSTANCE.read(byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        boolean zBooleanValue = ffiConverterBoolean.read(byteBuffer).booleanValue();
        boolean zBooleanValue2 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        boolean zBooleanValue3 = ffiConverterBoolean.read(byteBuffer).booleanValue();
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        int iIntValue = ffiConverterInt.read(byteBuffer).intValue();
        int iIntValue2 = ffiConverterInt.read(byteBuffer).intValue();
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return new C58524zFo(mfaStep, list, zBooleanValue, zBooleanValue2, zBooleanValue3, iIntValue, iIntValue2, ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterOptionalString.read(byteBuffer), ffiConverterInt.read(byteBuffer).intValue(), ffiConverterInt.read(byteBuffer).intValue());
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C58524zFo c58524zFo) {
        Intrinsics.checkNotNullParameter(c58524zFo, "");
        long jCopydefault = C56396yDv.copydefault(FfiConverterTypeMfaStep.INSTANCE.mo9529allocationSizeI7RO_PI(c58524zFo.gEmmrt()) + FfiConverterSequenceString.INSTANCE.mo9529allocationSizeI7RO_PI((List) c58524zFo.AEQbTJ()));
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        long jCopydefault2 = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c58524zFo.OLrzqt())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c58524zFo.EZpvd())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c58524zFo.KWHzl()));
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        long jCopydefault3 = C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault2 + ffiConverterInt.m9536allocationSizeI7RO_PI(c58524zFo.valueOf())) + ffiConverterInt.m9536allocationSizeI7RO_PI(c58524zFo.fJNWhG()));
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault3 + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c58524zFo.AhwBna())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c58524zFo.DbNXlk())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c58524zFo.copydefault())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c58524zFo.isConnected())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c58524zFo.AkhnZx())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c58524zFo.fetchVPNInfo())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c58524zFo.fARcdN())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c58524zFo.djBIcL())) + ffiConverterInt.m9536allocationSizeI7RO_PI(c58524zFo.values())) + ffiConverterInt.m9536allocationSizeI7RO_PI(c58524zFo.AYXKKw()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C58524zFo c58524zFo, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c58524zFo, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterTypeMfaStep.INSTANCE.write(c58524zFo.gEmmrt(), byteBuffer);
        FfiConverterSequenceString.INSTANCE.write((List) c58524zFo.AEQbTJ(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c58524zFo.OLrzqt(), byteBuffer);
        ffiConverterBoolean.write(c58524zFo.EZpvd(), byteBuffer);
        ffiConverterBoolean.write(c58524zFo.KWHzl(), byteBuffer);
        FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
        ffiConverterInt.write(c58524zFo.valueOf(), byteBuffer);
        ffiConverterInt.write(c58524zFo.fJNWhG(), byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(c58524zFo.AhwBna(), byteBuffer);
        ffiConverterOptionalString.write(c58524zFo.DbNXlk(), byteBuffer);
        ffiConverterOptionalString.write(c58524zFo.copydefault(), byteBuffer);
        ffiConverterOptionalString.write(c58524zFo.isConnected(), byteBuffer);
        ffiConverterOptionalString.write(c58524zFo.AkhnZx(), byteBuffer);
        ffiConverterBoolean.write(c58524zFo.fetchVPNInfo(), byteBuffer);
        ffiConverterBoolean.write(c58524zFo.fARcdN(), byteBuffer);
        ffiConverterOptionalString.write(c58524zFo.djBIcL(), byteBuffer);
        ffiConverterInt.write(c58524zFo.values(), byteBuffer);
        ffiConverterInt.write(c58524zFo.AYXKKw(), byteBuffer);
    }
}
