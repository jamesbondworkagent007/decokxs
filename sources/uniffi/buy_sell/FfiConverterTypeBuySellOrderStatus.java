package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC3718ArI;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeBuySellOrderStatus implements FfiConverterRustBuffer<AbstractC3718ArI> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBuySellOrderStatus INSTANCE = new FfiConverterTypeBuySellOrderStatus();

    private FfiConverterTypeBuySellOrderStatus() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC3718ArI lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC3718ArI) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC3718ArI liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC3718ArI) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC3718ArI abstractC3718ArI) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC3718ArI);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC3718ArI abstractC3718ArI) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC3718ArI);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC3718ArI read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        switch (byteBuffer.getInt()) {
            case 1:
                return AbstractC3718ArI.StateListAnimator.INSTANCE;
            case 2:
                return AbstractC3718ArI.PendingIntent.INSTANCE;
            case 3:
                return AbstractC3718ArI.ActionBar.INSTANCE;
            case 4:
                return AbstractC3718ArI.Activity.INSTANCE;
            case 5:
                return AbstractC3718ArI.LoaderManager.INSTANCE;
            case 6:
                return AbstractC3718ArI.Application.INSTANCE;
            case 7:
                return AbstractC3718ArI.TaskDescription.INSTANCE;
            case 8:
                return new AbstractC3718ArI.Dialog(FfiConverterInt.INSTANCE.read(byteBuffer).intValue());
            default:
                throw new RuntimeException("invalid enum value, something is very wrong!!");
        }
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC3718ArI abstractC3718ArI) {
        Intrinsics.checkNotNullParameter(abstractC3718ArI, "");
        if ((abstractC3718ArI instanceof AbstractC3718ArI.StateListAnimator) || (abstractC3718ArI instanceof AbstractC3718ArI.PendingIntent) || (abstractC3718ArI instanceof AbstractC3718ArI.ActionBar) || (abstractC3718ArI instanceof AbstractC3718ArI.Activity) || (abstractC3718ArI instanceof AbstractC3718ArI.LoaderManager) || (abstractC3718ArI instanceof AbstractC3718ArI.Application) || (abstractC3718ArI instanceof AbstractC3718ArI.TaskDescription)) {
            return 4L;
        }
        if (!(abstractC3718ArI instanceof AbstractC3718ArI.Dialog)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(((AbstractC3718ArI.Dialog) abstractC3718ArI).KWHzl()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC3718ArI abstractC3718ArI, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC3718ArI, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC3718ArI instanceof AbstractC3718ArI.StateListAnimator) {
            byteBuffer.putInt(1);
        } else if (abstractC3718ArI instanceof AbstractC3718ArI.PendingIntent) {
            byteBuffer.putInt(2);
        } else if (abstractC3718ArI instanceof AbstractC3718ArI.ActionBar) {
            byteBuffer.putInt(3);
        } else if (abstractC3718ArI instanceof AbstractC3718ArI.Activity) {
            byteBuffer.putInt(4);
        } else if (abstractC3718ArI instanceof AbstractC3718ArI.LoaderManager) {
            byteBuffer.putInt(5);
        } else if (abstractC3718ArI instanceof AbstractC3718ArI.Application) {
            byteBuffer.putInt(6);
        } else if (abstractC3718ArI instanceof AbstractC3718ArI.TaskDescription) {
            byteBuffer.putInt(7);
        } else {
            if (!(abstractC3718ArI instanceof AbstractC3718ArI.Dialog)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(8);
            FfiConverterInt.INSTANCE.write(((AbstractC3718ArI.Dialog) abstractC3718ArI).KWHzl(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
