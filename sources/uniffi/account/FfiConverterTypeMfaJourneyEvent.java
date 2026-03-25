package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58517zFh;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeMfaJourneyEvent implements FfiConverterRustBuffer<AbstractC58517zFh> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMfaJourneyEvent INSTANCE = new FfiConverterTypeMfaJourneyEvent();

    private FfiConverterTypeMfaJourneyEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC58517zFh lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC58517zFh) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC58517zFh liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC58517zFh) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC58517zFh abstractC58517zFh) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC58517zFh);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC58517zFh abstractC58517zFh) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC58517zFh);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC58517zFh read(@NotNull ByteBuffer byteBuffer) {
        AbstractC58517zFh actionBar;
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        switch (byteBuffer.getInt()) {
            case 1:
                actionBar = new AbstractC58517zFh.ActionBar(FfiConverterTypeAccountNetworkState.INSTANCE.read(byteBuffer));
                break;
            case 2:
                return AbstractC58517zFh.TaskDescription.INSTANCE;
            case 3:
                actionBar = new AbstractC58517zFh.Activity(FfiConverterString.INSTANCE.read(byteBuffer));
                break;
            case 4:
                actionBar = new AbstractC58517zFh.StateListAnimator(FfiConverterString.INSTANCE.read(byteBuffer));
                break;
            case 5:
                return AbstractC58517zFh.Application.INSTANCE;
            case 6:
                return AbstractC58517zFh.LoaderManager.INSTANCE;
            default:
                throw new RuntimeException("invalid enum value, something is very wrong!!");
        }
        return actionBar;
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC58517zFh abstractC58517zFh) {
        Intrinsics.checkNotNullParameter(abstractC58517zFh, "");
        if (abstractC58517zFh instanceof AbstractC58517zFh.ActionBar) {
            return C56396yDv.copydefault(FfiConverterTypeAccountNetworkState.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58517zFh.ActionBar) abstractC58517zFh).EZpvd()) + 4);
        }
        if (abstractC58517zFh instanceof AbstractC58517zFh.TaskDescription) {
            return 4L;
        }
        if (abstractC58517zFh instanceof AbstractC58517zFh.Activity) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58517zFh.Activity) abstractC58517zFh).copydefault()) + 4);
        }
        if (abstractC58517zFh instanceof AbstractC58517zFh.StateListAnimator) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58517zFh.StateListAnimator) abstractC58517zFh).copydefault()) + 4);
        }
        if ((abstractC58517zFh instanceof AbstractC58517zFh.Application) || (abstractC58517zFh instanceof AbstractC58517zFh.LoaderManager)) {
            return 4L;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC58517zFh abstractC58517zFh, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC58517zFh, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC58517zFh instanceof AbstractC58517zFh.ActionBar) {
            byteBuffer.putInt(1);
            FfiConverterTypeAccountNetworkState.INSTANCE.write(((AbstractC58517zFh.ActionBar) abstractC58517zFh).EZpvd(), byteBuffer);
        } else if (abstractC58517zFh instanceof AbstractC58517zFh.TaskDescription) {
            byteBuffer.putInt(2);
        } else if (abstractC58517zFh instanceof AbstractC58517zFh.Activity) {
            byteBuffer.putInt(3);
            FfiConverterString.INSTANCE.write(((AbstractC58517zFh.Activity) abstractC58517zFh).copydefault(), byteBuffer);
        } else if (abstractC58517zFh instanceof AbstractC58517zFh.StateListAnimator) {
            byteBuffer.putInt(4);
            FfiConverterString.INSTANCE.write(((AbstractC58517zFh.StateListAnimator) abstractC58517zFh).copydefault(), byteBuffer);
        } else if (abstractC58517zFh instanceof AbstractC58517zFh.Application) {
            byteBuffer.putInt(5);
        } else {
            if (!(abstractC58517zFh instanceof AbstractC58517zFh.LoaderManager)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(6);
        }
        Unit unit = Unit.INSTANCE;
    }
}
