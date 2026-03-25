package uniffi.dex;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.AAJ;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes20.dex */
public final class FfiConverterTypeDexHolderData implements FfiConverterRustBuffer<AAJ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeDexHolderData INSTANCE = new FfiConverterTypeDexHolderData();

    private FfiConverterTypeDexHolderData() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AAJ lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AAJ) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AAJ liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AAJ) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AAJ aaj) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, aaj);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AAJ aaj) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, aaj);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AAJ read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int iIntValue = FfiConverterInt.INSTANCE.read(byteBuffer).intValue();
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new AAJ(iIntValue, ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AAJ aaj) {
        Intrinsics.checkNotNullParameter(aaj, "");
        long jM9536allocationSizeI7RO_PI = FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(aaj.OLrzqt());
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(jM9536allocationSizeI7RO_PI + ffiConverterString.mo9529allocationSizeI7RO_PI(aaj.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(aaj.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AAJ aaj, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(aaj, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterInt.INSTANCE.write(aaj.OLrzqt(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(aaj.copydefault(), byteBuffer);
        ffiConverterString.write(aaj.KWHzl(), byteBuffer);
    }
}
