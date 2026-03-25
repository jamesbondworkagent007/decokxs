package uniffi.dex;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.AGF;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeSingleTokenListRequest implements FfiConverterRustBuffer<AGF> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSingleTokenListRequest INSTANCE = new FfiConverterTypeSingleTokenListRequest();

    private FfiConverterTypeSingleTokenListRequest() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AGF lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AGF) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AGF liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AGF) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AGF agf) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, agf);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AGF agf) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, agf);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AGF read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        String str = ffiConverterOptionalString.read(byteBuffer);
        String str2 = ffiConverterOptionalString.read(byteBuffer);
        String str3 = ffiConverterOptionalString.read(byteBuffer);
        String str4 = ffiConverterOptionalString.read(byteBuffer);
        String str5 = ffiConverterOptionalString.read(byteBuffer);
        FfiConverterOptionalInt ffiConverterOptionalInt = FfiConverterOptionalInt.INSTANCE;
        return new AGF(str, str2, str3, str4, str5, ffiConverterOptionalInt.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalInt.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AGF agf) {
        Intrinsics.checkNotNullParameter(agf, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(agf.AEQbTJ()) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(agf.AhwBna())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(agf.gEmmrt())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(agf.EZpvd())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(agf.AYXKKw()));
        FfiConverterOptionalInt ffiConverterOptionalInt = FfiConverterOptionalInt.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterOptionalInt.mo9529allocationSizeI7RO_PI(agf.djBIcL())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(agf.OLrzqt())) + ffiConverterOptionalInt.mo9529allocationSizeI7RO_PI(agf.valueOf())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(agf.KWHzl())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(agf.copydefault()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AGF agf, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(agf, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(agf.AEQbTJ(), byteBuffer);
        ffiConverterOptionalString.write(agf.AhwBna(), byteBuffer);
        ffiConverterOptionalString.write(agf.gEmmrt(), byteBuffer);
        ffiConverterOptionalString.write(agf.EZpvd(), byteBuffer);
        ffiConverterOptionalString.write(agf.AYXKKw(), byteBuffer);
        FfiConverterOptionalInt ffiConverterOptionalInt = FfiConverterOptionalInt.INSTANCE;
        ffiConverterOptionalInt.write(agf.djBIcL(), byteBuffer);
        ffiConverterOptionalString.write(agf.OLrzqt(), byteBuffer);
        ffiConverterOptionalInt.write(agf.valueOf(), byteBuffer);
        ffiConverterOptionalString.write(agf.KWHzl(), byteBuffer);
        ffiConverterOptionalString.write(agf.copydefault(), byteBuffer);
    }
}
