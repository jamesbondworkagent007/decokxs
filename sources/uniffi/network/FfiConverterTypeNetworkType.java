package uniffi.network;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC4260BaJ;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.network.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeNetworkType implements FfiConverterRustBuffer<AbstractC4260BaJ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNetworkType INSTANCE = new FfiConverterTypeNetworkType();

    private FfiConverterTypeNetworkType() {
    }

    @Override // uniffi.network.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC4260BaJ lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC4260BaJ) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC4260BaJ liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC4260BaJ) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC4260BaJ abstractC4260BaJ) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC4260BaJ);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC4260BaJ abstractC4260BaJ) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC4260BaJ);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC4260BaJ read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return AbstractC4260BaJ.Activity.INSTANCE;
        }
        if (i == 2) {
            return AbstractC4260BaJ.Application.INSTANCE;
        }
        if (i == 3) {
            return new AbstractC4260BaJ.ActionBar(FfiConverterTypeMobileType.INSTANCE.read(byteBuffer));
        }
        if (i == 4) {
            return AbstractC4260BaJ.StateListAnimator.INSTANCE;
        }
        if (i == 5) {
            return AbstractC4260BaJ.TaskDescription.INSTANCE;
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC4260BaJ abstractC4260BaJ) {
        Intrinsics.checkNotNullParameter(abstractC4260BaJ, "");
        if ((abstractC4260BaJ instanceof AbstractC4260BaJ.Activity) || (abstractC4260BaJ instanceof AbstractC4260BaJ.Application)) {
            return 4L;
        }
        if (abstractC4260BaJ instanceof AbstractC4260BaJ.ActionBar) {
            return C56396yDv.copydefault(FfiConverterTypeMobileType.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC4260BaJ.ActionBar) abstractC4260BaJ).OLrzqt()) + 4);
        }
        if ((abstractC4260BaJ instanceof AbstractC4260BaJ.StateListAnimator) || (abstractC4260BaJ instanceof AbstractC4260BaJ.TaskDescription)) {
            return 4L;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC4260BaJ abstractC4260BaJ, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC4260BaJ, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC4260BaJ instanceof AbstractC4260BaJ.Activity) {
            byteBuffer.putInt(1);
        } else if (abstractC4260BaJ instanceof AbstractC4260BaJ.Application) {
            byteBuffer.putInt(2);
        } else if (abstractC4260BaJ instanceof AbstractC4260BaJ.ActionBar) {
            byteBuffer.putInt(3);
            FfiConverterTypeMobileType.INSTANCE.write(((AbstractC4260BaJ.ActionBar) abstractC4260BaJ).OLrzqt(), byteBuffer);
        } else if (abstractC4260BaJ instanceof AbstractC4260BaJ.StateListAnimator) {
            byteBuffer.putInt(4);
        } else {
            if (!(abstractC4260BaJ instanceof AbstractC4260BaJ.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(5);
        }
        Unit unit = Unit.INSTANCE;
    }
}
