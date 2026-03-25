package uniffi.retail_trading;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.BkS;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.retail_trading.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeQuotationDataSourceChangedEvent implements FfiConverterRustBuffer<BkS> {
    public static final int $stable = 0;
    public static final FfiConverterTypeQuotationDataSourceChangedEvent INSTANCE = new FfiConverterTypeQuotationDataSourceChangedEvent();

    private FfiConverterTypeQuotationDataSourceChangedEvent() {
    }

    @Override // uniffi.retail_trading.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public BkS lift2(@NotNull RustBuffer.ByValue byValue) {
        return (BkS) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BkS liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (BkS) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull BkS bkS) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, bkS);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BkS bkS) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, bkS);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public BkS read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new BkS.StateListAnimator(FfiConverterString.INSTANCE.read(byteBuffer), FfiConverterLong.INSTANCE.read(byteBuffer).longValue());
        }
        if (i == 2) {
            return new BkS.Activity(FfiConverterLong.INSTANCE.read(byteBuffer).longValue());
        }
        if (i == 3) {
            return new BkS.ActionBar(FfiConverterLong.INSTANCE.read(byteBuffer).longValue());
        }
        if (i == 4) {
            return new BkS.TaskDescription(FfiConverterLong.INSTANCE.read(byteBuffer).longValue());
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull BkS bkS) {
        Intrinsics.checkNotNullParameter(bkS, "");
        if (bkS instanceof BkS.StateListAnimator) {
            BkS.StateListAnimator stateListAnimator = (BkS.StateListAnimator) bkS;
            return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(stateListAnimator.EZpvd()) + 4) + FfiConverterLong.INSTANCE.m9537allocationSizeI7RO_PI(stateListAnimator.copydefault()));
        }
        if (bkS instanceof BkS.Activity) {
            return C56396yDv.copydefault(FfiConverterLong.INSTANCE.m9537allocationSizeI7RO_PI(((BkS.Activity) bkS).copydefault()) + 4);
        }
        if (bkS instanceof BkS.ActionBar) {
            return C56396yDv.copydefault(FfiConverterLong.INSTANCE.m9537allocationSizeI7RO_PI(((BkS.ActionBar) bkS).OLrzqt()) + 4);
        }
        if (!(bkS instanceof BkS.TaskDescription)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterLong.INSTANCE.m9537allocationSizeI7RO_PI(((BkS.TaskDescription) bkS).AEQbTJ()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull BkS bkS, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(bkS, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (bkS instanceof BkS.StateListAnimator) {
            byteBuffer.putInt(1);
            BkS.StateListAnimator stateListAnimator = (BkS.StateListAnimator) bkS;
            FfiConverterString.INSTANCE.write(stateListAnimator.EZpvd(), byteBuffer);
            FfiConverterLong.INSTANCE.write(stateListAnimator.copydefault(), byteBuffer);
        } else if (bkS instanceof BkS.Activity) {
            byteBuffer.putInt(2);
            FfiConverterLong.INSTANCE.write(((BkS.Activity) bkS).copydefault(), byteBuffer);
        } else if (bkS instanceof BkS.ActionBar) {
            byteBuffer.putInt(3);
            FfiConverterLong.INSTANCE.write(((BkS.ActionBar) bkS).OLrzqt(), byteBuffer);
        } else {
            if (!(bkS instanceof BkS.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(4);
            FfiConverterLong.INSTANCE.write(((BkS.TaskDescription) bkS).AEQbTJ(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
