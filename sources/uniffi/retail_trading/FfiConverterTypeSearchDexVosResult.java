package uniffi.retail_trading;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C4648Blw;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_trading.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeSearchDexVosResult implements FfiConverterRustBuffer<C4648Blw> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSearchDexVosResult INSTANCE = new FfiConverterTypeSearchDexVosResult();

    private FfiConverterTypeSearchDexVosResult() {
    }

    @Override // uniffi.retail_trading.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C4648Blw lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C4648Blw) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4648Blw liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C4648Blw) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C4648Blw c4648Blw) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c4648Blw);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C4648Blw c4648Blw) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c4648Blw);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C4648Blw read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return new C4648Blw(FfiConverterOptionalString.INSTANCE.read(byteBuffer), FfiConverterSequenceTypeDexChainGroupVo.INSTANCE.read(byteBuffer), FfiConverterOptionalSequenceTypeQuotationDexItemVo.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C4648Blw c4648Blw) {
        Intrinsics.checkNotNullParameter(c4648Blw, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterOptionalString.INSTANCE.mo9529allocationSizeI7RO_PI(c4648Blw.KWHzl()) + FfiConverterSequenceTypeDexChainGroupVo.INSTANCE.mo9529allocationSizeI7RO_PI((List) c4648Blw.AEQbTJ())) + FfiConverterOptionalSequenceTypeQuotationDexItemVo.INSTANCE.mo9529allocationSizeI7RO_PI(c4648Blw.copydefault()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C4648Blw c4648Blw, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c4648Blw, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterOptionalString.INSTANCE.write(c4648Blw.KWHzl(), byteBuffer);
        FfiConverterSequenceTypeDexChainGroupVo.INSTANCE.write((List) c4648Blw.AEQbTJ(), byteBuffer);
        FfiConverterOptionalSequenceTypeQuotationDexItemVo.INSTANCE.write(c4648Blw.copydefault(), byteBuffer);
    }
}
