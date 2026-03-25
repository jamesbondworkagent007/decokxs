package uniffi.analytics;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3551AoA;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.analytics.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeGrafanaEventData implements FfiConverterRustBuffer<C3551AoA> {
    public static final int $stable = 0;
    public static final FfiConverterTypeGrafanaEventData INSTANCE = new FfiConverterTypeGrafanaEventData();

    private FfiConverterTypeGrafanaEventData() {
    }

    @Override // uniffi.analytics.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3551AoA lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3551AoA) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3551AoA liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3551AoA) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3551AoA c3551AoA) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3551AoA);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3551AoA c3551AoA) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3551AoA);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3551AoA read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        String str = FfiConverterString.INSTANCE.read(byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return new C3551AoA(str, ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), ffiConverterOptionalString.read(byteBuffer), FfiConverterOptionalMapStringString.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3551AoA c3551AoA) {
        Intrinsics.checkNotNullParameter(c3551AoA, "");
        long jMo9529allocationSizeI7RO_PI = FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(c3551AoA.copydefault());
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jMo9529allocationSizeI7RO_PI + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c3551AoA.valueOf())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c3551AoA.EZpvd())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c3551AoA.AEQbTJ())) + ffiConverterOptionalString.mo9529allocationSizeI7RO_PI(c3551AoA.KWHzl())) + FfiConverterOptionalMapStringString.INSTANCE.mo9529allocationSizeI7RO_PI(c3551AoA.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3551AoA c3551AoA, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3551AoA, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString.INSTANCE.write(c3551AoA.copydefault(), byteBuffer);
        FfiConverterOptionalString ffiConverterOptionalString = FfiConverterOptionalString.INSTANCE;
        ffiConverterOptionalString.write(c3551AoA.valueOf(), byteBuffer);
        ffiConverterOptionalString.write(c3551AoA.EZpvd(), byteBuffer);
        ffiConverterOptionalString.write(c3551AoA.AEQbTJ(), byteBuffer);
        ffiConverterOptionalString.write(c3551AoA.KWHzl(), byteBuffer);
        FfiConverterOptionalMapStringString.INSTANCE.write(c3551AoA.OLrzqt(), byteBuffer);
    }
}
