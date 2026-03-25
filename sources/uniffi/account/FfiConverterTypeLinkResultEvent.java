package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58433zCe;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeLinkResultEvent implements FfiConverterRustBuffer<AbstractC58433zCe> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLinkResultEvent INSTANCE = new FfiConverterTypeLinkResultEvent();

    private FfiConverterTypeLinkResultEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC58433zCe lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC58433zCe) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC58433zCe liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC58433zCe) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC58433zCe abstractC58433zCe) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC58433zCe);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC58433zCe abstractC58433zCe) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC58433zCe);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC58433zCe read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new AbstractC58433zCe.ActionBar(FfiConverterTypeAccountNetworkState.INSTANCE.read(byteBuffer));
        }
        if (i == 2) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            return new AbstractC58433zCe.Activity(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
        }
        if (i == 3) {
            return new AbstractC58433zCe.TaskDescription(FfiConverterString.INSTANCE.read(byteBuffer), FfiConverterTypeAccountErrorType.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC58433zCe abstractC58433zCe) {
        Intrinsics.checkNotNullParameter(abstractC58433zCe, "");
        if (abstractC58433zCe instanceof AbstractC58433zCe.ActionBar) {
            return C56396yDv.copydefault(FfiConverterTypeAccountNetworkState.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58433zCe.ActionBar) abstractC58433zCe).KWHzl()) + 4);
        }
        if (abstractC58433zCe instanceof AbstractC58433zCe.Activity) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            AbstractC58433zCe.Activity activity = (AbstractC58433zCe.Activity) abstractC58433zCe;
            return C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(activity.AEQbTJ()) + 4) + ffiConverterString.mo9529allocationSizeI7RO_PI(activity.KWHzl()));
        }
        if (!(abstractC58433zCe instanceof AbstractC58433zCe.TaskDescription)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC58433zCe.TaskDescription taskDescription = (AbstractC58433zCe.TaskDescription) abstractC58433zCe;
        return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(taskDescription.AEQbTJ()) + 4) + FfiConverterTypeAccountErrorType.INSTANCE.mo9529allocationSizeI7RO_PI(taskDescription.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC58433zCe abstractC58433zCe, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC58433zCe, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC58433zCe instanceof AbstractC58433zCe.ActionBar) {
            byteBuffer.putInt(1);
            FfiConverterTypeAccountNetworkState.INSTANCE.write(((AbstractC58433zCe.ActionBar) abstractC58433zCe).KWHzl(), byteBuffer);
        } else if (abstractC58433zCe instanceof AbstractC58433zCe.Activity) {
            byteBuffer.putInt(2);
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            AbstractC58433zCe.Activity activity = (AbstractC58433zCe.Activity) abstractC58433zCe;
            ffiConverterString.write(activity.AEQbTJ(), byteBuffer);
            ffiConverterString.write(activity.KWHzl(), byteBuffer);
        } else {
            if (!(abstractC58433zCe instanceof AbstractC58433zCe.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(3);
            AbstractC58433zCe.TaskDescription taskDescription = (AbstractC58433zCe.TaskDescription) abstractC58433zCe;
            FfiConverterString.INSTANCE.write(taskDescription.AEQbTJ(), byteBuffer);
            FfiConverterTypeAccountErrorType.INSTANCE.write(taskDescription.KWHzl(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
