package uniffi.dex;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C4183Azz;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes20.dex */
public final class FfiConverterTypeAlertListResponse implements FfiConverterRustBuffer<C4183Azz> {
    public static final int $stable = 0;
    public static final FfiConverterTypeAlertListResponse INSTANCE = new FfiConverterTypeAlertListResponse();

    private FfiConverterTypeAlertListResponse() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4183Azz lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4183Azz) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4183Azz liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4183Azz) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4183Azz c4183Azz) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4183Azz);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4183Azz c4183Azz) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4183Azz);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4183Azz read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        boolean zBooleanValue = FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue();
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C4183Azz(zBooleanValue, ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterSequenceTypeAlertDataResponse.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4183Azz c4183Azz) {
        Intrinsics.checkNotNullParameter(c4183Azz, "");
        long jM9530allocationSizeI7RO_PI = FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c4183Azz.OLrzqt());
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jM9530allocationSizeI7RO_PI + ffiConverterString.mo9529allocationSizeI7RO_PI(c4183Azz.EZpvd())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4183Azz.AEQbTJ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4183Azz.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4183Azz.djBIcL())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4183Azz.AYXKKw())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4183Azz.copydefault())) + FfiConverterSequenceTypeAlertDataResponse.INSTANCE.mo9529allocationSizeI7RO_PI((List) c4183Azz.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4183Azz c4183Azz, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4183Azz, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterBoolean.INSTANCE.write(c4183Azz.OLrzqt(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c4183Azz.EZpvd(), byteBuffer);
        ffiConverterString.write(c4183Azz.AEQbTJ(), byteBuffer);
        ffiConverterString.write(c4183Azz.valueOf(), byteBuffer);
        ffiConverterString.write(c4183Azz.djBIcL(), byteBuffer);
        ffiConverterString.write(c4183Azz.AYXKKw(), byteBuffer);
        ffiConverterString.write(c4183Azz.copydefault(), byteBuffer);
        FfiConverterSequenceTypeAlertDataResponse.INSTANCE.write((List) c4183Azz.KWHzl(), byteBuffer);
    }
}
