package uniffi.dex;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.dex.CoinCheckResult;
import uniffi.dex.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeCoinCheckResult implements FfiConverterRustBuffer<CoinCheckResult> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCoinCheckResult INSTANCE = new FfiConverterTypeCoinCheckResult();

    private FfiConverterTypeCoinCheckResult() {
    }

    @Override // uniffi.dex.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public CoinCheckResult lift2(@NotNull RustBuffer.ByValue byValue) {
        return (CoinCheckResult) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public CoinCheckResult liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (CoinCheckResult) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull CoinCheckResult coinCheckResult) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, coinCheckResult);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull CoinCheckResult coinCheckResult) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, coinCheckResult);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public CoinCheckResult read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new CoinCheckResult.ActionBar(FfiConverterTypeCoinRisk.INSTANCE.read(byteBuffer));
        }
        if (i == 2) {
            return CoinCheckResult.Activity.INSTANCE;
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull CoinCheckResult coinCheckResult) {
        Intrinsics.checkNotNullParameter(coinCheckResult, "");
        if (coinCheckResult instanceof CoinCheckResult.ActionBar) {
            return C56396yDv.copydefault(FfiConverterTypeCoinRisk.INSTANCE.mo9529allocationSizeI7RO_PI(((CoinCheckResult.ActionBar) coinCheckResult).OLrzqt()) + 4);
        }
        if (coinCheckResult instanceof CoinCheckResult.Activity) {
            return 4L;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull CoinCheckResult coinCheckResult, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(coinCheckResult, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (coinCheckResult instanceof CoinCheckResult.ActionBar) {
            byteBuffer.putInt(1);
            FfiConverterTypeCoinRisk.INSTANCE.write(((CoinCheckResult.ActionBar) coinCheckResult).OLrzqt(), byteBuffer);
        } else {
            if (!(coinCheckResult instanceof CoinCheckResult.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(2);
        }
        Unit unit = Unit.INSTANCE;
    }
}
