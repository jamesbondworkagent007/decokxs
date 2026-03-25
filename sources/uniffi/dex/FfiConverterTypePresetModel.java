package uniffi.dex;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C2294AGf;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes20.dex */
public final class FfiConverterTypePresetModel implements FfiConverterRustBuffer<C2294AGf> {
    public static final int $stable = 0;
    public static final FfiConverterTypePresetModel INSTANCE = new FfiConverterTypePresetModel();

    private FfiConverterTypePresetModel() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2294AGf lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2294AGf) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2294AGf liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2294AGf) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2294AGf c2294AGf) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2294AGf);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2294AGf c2294AGf) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2294AGf);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2294AGf read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        long jLongValue = ffiConverterLong.read(byteBuffer).longValue();
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        FfiConverterTypePresetData ffiConverterTypePresetData = FfiConverterTypePresetData.INSTANCE;
        return new C2294AGf(jLongValue, str, ffiConverterTypePresetData.read(byteBuffer), ffiConverterLong.read(byteBuffer).longValue(), ffiConverterTypePresetData.read(byteBuffer), FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue(), ffiConverterString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2294AGf c2294AGf) {
        Intrinsics.checkNotNullParameter(c2294AGf, "");
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        long jM9537allocationSizeI7RO_PI = ffiConverterLong.m9537allocationSizeI7RO_PI(c2294AGf.AEQbTJ());
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(jM9537allocationSizeI7RO_PI + ffiConverterString.mo9529allocationSizeI7RO_PI(c2294AGf.copydefault()));
        FfiConverterTypePresetData ffiConverterTypePresetData = FfiConverterTypePresetData.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterTypePresetData.mo9529allocationSizeI7RO_PI(c2294AGf.OLrzqt())) + ffiConverterLong.m9537allocationSizeI7RO_PI(c2294AGf.EZpvd())) + ffiConverterTypePresetData.mo9529allocationSizeI7RO_PI(c2294AGf.valueOf())) + FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(c2294AGf.gEmmrt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c2294AGf.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2294AGf c2294AGf, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2294AGf, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterLong ffiConverterLong = FfiConverterLong.INSTANCE;
        ffiConverterLong.write(c2294AGf.AEQbTJ(), byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c2294AGf.copydefault(), byteBuffer);
        FfiConverterTypePresetData ffiConverterTypePresetData = FfiConverterTypePresetData.INSTANCE;
        ffiConverterTypePresetData.write(c2294AGf.OLrzqt(), byteBuffer);
        ffiConverterLong.write(c2294AGf.EZpvd(), byteBuffer);
        ffiConverterTypePresetData.write(c2294AGf.valueOf(), byteBuffer);
        FfiConverterBoolean.INSTANCE.write(c2294AGf.gEmmrt(), byteBuffer);
        ffiConverterString.write(c2294AGf.KWHzl(), byteBuffer);
    }
}
