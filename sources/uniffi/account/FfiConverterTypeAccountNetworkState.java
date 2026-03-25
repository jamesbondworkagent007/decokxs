package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC60238zyv;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeAccountNetworkState implements FfiConverterRustBuffer<AbstractC60238zyv> {
    public static final int $stable = 0;
    public static final FfiConverterTypeAccountNetworkState INSTANCE = new FfiConverterTypeAccountNetworkState();

    private FfiConverterTypeAccountNetworkState() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC60238zyv lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC60238zyv) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC60238zyv liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC60238zyv) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC60238zyv abstractC60238zyv) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC60238zyv);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC60238zyv abstractC60238zyv) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC60238zyv);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC60238zyv read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return AbstractC60238zyv.StateListAnimator.INSTANCE;
        }
        if (i == 2) {
            return AbstractC60238zyv.TaskDescription.INSTANCE;
        }
        if (i == 3) {
            return AbstractC60238zyv.ActionBar.INSTANCE;
        }
        if (i == 4) {
            return new AbstractC60238zyv.Activity(FfiConverterTypeAccountError.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC60238zyv abstractC60238zyv) {
        Intrinsics.checkNotNullParameter(abstractC60238zyv, "");
        if ((abstractC60238zyv instanceof AbstractC60238zyv.StateListAnimator) || (abstractC60238zyv instanceof AbstractC60238zyv.TaskDescription) || (abstractC60238zyv instanceof AbstractC60238zyv.ActionBar)) {
            return 4L;
        }
        if (!(abstractC60238zyv instanceof AbstractC60238zyv.Activity)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterTypeAccountError.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC60238zyv.Activity) abstractC60238zyv).AEQbTJ()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC60238zyv abstractC60238zyv, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC60238zyv, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC60238zyv instanceof AbstractC60238zyv.StateListAnimator) {
            byteBuffer.putInt(1);
        } else if (abstractC60238zyv instanceof AbstractC60238zyv.TaskDescription) {
            byteBuffer.putInt(2);
        } else if (abstractC60238zyv instanceof AbstractC60238zyv.ActionBar) {
            byteBuffer.putInt(3);
        } else {
            if (!(abstractC60238zyv instanceof AbstractC60238zyv.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(4);
            FfiConverterTypeAccountError.INSTANCE.write(((AbstractC60238zyv.Activity) abstractC60238zyv).AEQbTJ(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
