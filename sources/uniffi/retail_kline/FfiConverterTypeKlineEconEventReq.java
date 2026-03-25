package uniffi.retail_kline;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C4529Bhl;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_kline.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeKlineEconEventReq implements FfiConverterRustBuffer<C4529Bhl> {
    public static final int $stable = 0;
    public static final FfiConverterTypeKlineEconEventReq INSTANCE = new FfiConverterTypeKlineEconEventReq();

    private FfiConverterTypeKlineEconEventReq() {
    }

    @Override // uniffi.retail_kline.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4529Bhl lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4529Bhl) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4529Bhl liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4529Bhl) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4529Bhl c4529Bhl) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4529Bhl);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4529Bhl c4529Bhl) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4529Bhl);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4529Bhl read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return new C4529Bhl(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), FfiConverterULong.INSTANCE.m9561readI7RO_PI(byteBuffer), null);
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4529Bhl c4529Bhl) {
        Intrinsics.checkNotNullParameter(c4529Bhl, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c4529Bhl.KWHzl()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4529Bhl.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c4529Bhl.AEQbTJ())) + FfiConverterULong.INSTANCE.m9556allocationSizePUiSbYQ(c4529Bhl.copydefault()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4529Bhl c4529Bhl, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4529Bhl, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c4529Bhl.KWHzl(), byteBuffer);
        ffiConverterString.write(c4529Bhl.OLrzqt(), byteBuffer);
        ffiConverterString.write(c4529Bhl.AEQbTJ(), byteBuffer);
        FfiConverterULong.INSTANCE.m9562write4PLdz1A(c4529Bhl.copydefault(), byteBuffer);
    }
}
