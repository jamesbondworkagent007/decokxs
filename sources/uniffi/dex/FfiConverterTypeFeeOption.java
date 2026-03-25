package uniffi.dex;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.ABL;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes20.dex */
public final class FfiConverterTypeFeeOption implements FfiConverterRustBuffer<ABL> {
    public static final int $stable = 0;
    public static final FfiConverterTypeFeeOption INSTANCE = new FfiConverterTypeFeeOption();

    private FfiConverterTypeFeeOption() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public ABL lift2(@NotNull RustBuffer.ByValue byValue) {
        return (ABL) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public ABL liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (ABL) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull ABL abl) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abl);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull ABL abl) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abl);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public ABL read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new ABL(FfiConverterLong.INSTANCE.read(byteBuffer).longValue(), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), FfiConverterString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull ABL abl) {
        Intrinsics.checkNotNullParameter(abl, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterLong.INSTANCE.m9537allocationSizeI7RO_PI(abl.OLrzqt()) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(abl.EZpvd())) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(abl.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull ABL abl, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abl, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterLong.INSTANCE.write(abl.OLrzqt(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(abl.EZpvd(), byteBuffer);
        FfiConverterString.INSTANCE.write(abl.KWHzl(), byteBuffer);
    }
}
