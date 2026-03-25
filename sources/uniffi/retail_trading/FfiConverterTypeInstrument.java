package uniffi.retail_trading;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.BjV;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_trading.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeInstrument implements FfiConverterRustBuffer<BjV> {
    public static final int $stable = 0;
    public static final FfiConverterTypeInstrument INSTANCE = new FfiConverterTypeInstrument();

    private FfiConverterTypeInstrument() {
    }

    @Override // uniffi.retail_trading.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BjV lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BjV) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BjV liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BjV) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BjV bjV) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bjV);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BjV bjV) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bjV);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BjV read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new BjV.Activity(FfiConverterTypeDexInstrument.INSTANCE.read(byteBuffer));
        }
        if (i == 2) {
            return new BjV.Application(FfiConverterTypeSpotInstrument.INSTANCE.read(byteBuffer));
        }
        if (i == 3) {
            return new BjV.TaskDescription(FfiConverterTypeSwapInstrument.INSTANCE.read(byteBuffer));
        }
        if (i == 4) {
            return new BjV.StateListAnimator(FfiConverterTypeFutureInstrument.INSTANCE.read(byteBuffer));
        }
        if (i == 5) {
            return new BjV.ActionBar(FfiConverterTypeOptionInstrument.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BjV bjV) {
        Intrinsics.checkNotNullParameter(bjV, "");
        if (bjV instanceof BjV.Activity) {
            return C56396yDv.copydefault(FfiConverterTypeDexInstrument.INSTANCE.mo9529allocationSizeI7RO_PI(((BjV.Activity) bjV).EZpvd()) + 4);
        }
        if (bjV instanceof BjV.Application) {
            return C56396yDv.copydefault(FfiConverterTypeSpotInstrument.INSTANCE.mo9529allocationSizeI7RO_PI(((BjV.Application) bjV).EZpvd()) + 4);
        }
        if (bjV instanceof BjV.TaskDescription) {
            return C56396yDv.copydefault(FfiConverterTypeSwapInstrument.INSTANCE.mo9529allocationSizeI7RO_PI(((BjV.TaskDescription) bjV).OLrzqt()) + 4);
        }
        if (bjV instanceof BjV.StateListAnimator) {
            return C56396yDv.copydefault(FfiConverterTypeFutureInstrument.INSTANCE.mo9529allocationSizeI7RO_PI(((BjV.StateListAnimator) bjV).EZpvd()) + 4);
        }
        if (!(bjV instanceof BjV.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterTypeOptionInstrument.INSTANCE.mo9529allocationSizeI7RO_PI(((BjV.ActionBar) bjV).copydefault()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BjV bjV, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bjV, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (bjV instanceof BjV.Activity) {
            byteBuffer.putInt(1);
            FfiConverterTypeDexInstrument.INSTANCE.write(((BjV.Activity) bjV).EZpvd(), byteBuffer);
        } else if (bjV instanceof BjV.Application) {
            byteBuffer.putInt(2);
            FfiConverterTypeSpotInstrument.INSTANCE.write(((BjV.Application) bjV).EZpvd(), byteBuffer);
        } else if (bjV instanceof BjV.TaskDescription) {
            byteBuffer.putInt(3);
            FfiConverterTypeSwapInstrument.INSTANCE.write(((BjV.TaskDescription) bjV).OLrzqt(), byteBuffer);
        } else if (bjV instanceof BjV.StateListAnimator) {
            byteBuffer.putInt(4);
            FfiConverterTypeFutureInstrument.INSTANCE.write(((BjV.StateListAnimator) bjV).EZpvd(), byteBuffer);
        } else {
            if (!(bjV instanceof BjV.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(5);
            FfiConverterTypeOptionInstrument.INSTANCE.write(((BjV.ActionBar) bjV).copydefault(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
