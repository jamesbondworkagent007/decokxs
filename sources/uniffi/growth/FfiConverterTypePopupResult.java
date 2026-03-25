package uniffi.growth;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C2527APe;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.growth.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypePopupResult implements FfiConverterRustBuffer<C2527APe> {
    public static final int $stable = 0;
    public static final FfiConverterTypePopupResult INSTANCE = new FfiConverterTypePopupResult();

    private FfiConverterTypePopupResult() {
    }

    @Override // uniffi.growth.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C2527APe lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C2527APe) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2527APe liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C2527APe) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C2527APe c2527APe) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c2527APe);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C2527APe c2527APe) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c2527APe);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C2527APe read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C2527APe(FfiConverterInt.INSTANCE.read(byteBuffer).intValue(), FfiConverterString.INSTANCE.read(byteBuffer), FfiConverterTypePopupNextAction.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C2527APe c2527APe) {
        Intrinsics.checkNotNullParameter(c2527APe, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(c2527APe.AEQbTJ()) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(c2527APe.EZpvd())) + FfiConverterTypePopupNextAction.INSTANCE.mo9529allocationSizeI7RO_PI(c2527APe.copydefault()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C2527APe c2527APe, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c2527APe, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterInt.INSTANCE.write(c2527APe.AEQbTJ(), byteBuffer);
        FfiConverterString.INSTANCE.write(c2527APe.EZpvd(), byteBuffer);
        FfiConverterTypePopupNextAction.INSTANCE.write(c2527APe.copydefault(), byteBuffer);
    }
}
