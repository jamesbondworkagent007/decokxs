package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zPM;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOkxPasskeyCrossDeviceSyncEvent implements FfiConverterRustBuffer<zPM> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyCrossDeviceSyncEvent INSTANCE = new FfiConverterTypeOkxPasskeyCrossDeviceSyncEvent();

    private FfiConverterTypeOkxPasskeyCrossDeviceSyncEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zPM lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zPM) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zPM liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zPM) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zPM zpm) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zpm);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zPM zpm) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zpm);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zPM read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new zPM.TaskDescription(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 2) {
            return zPM.StateListAnimator.INSTANCE;
        }
        if (i == 3) {
            return new zPM.Activity(FfiConverterTypeSyncViolatedPrecondition.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zPM zpm) {
        Intrinsics.checkNotNullParameter(zpm, "");
        if (zpm instanceof zPM.TaskDescription) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zPM.TaskDescription) zpm).KWHzl()) + 4);
        }
        if (zpm instanceof zPM.StateListAnimator) {
            return 4L;
        }
        if (!(zpm instanceof zPM.Activity)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterTypeSyncViolatedPrecondition.INSTANCE.mo9529allocationSizeI7RO_PI(((zPM.Activity) zpm).AEQbTJ()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zPM zpm, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zpm, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (zpm instanceof zPM.TaskDescription) {
            byteBuffer.putInt(1);
            FfiConverterString.INSTANCE.write(((zPM.TaskDescription) zpm).KWHzl(), byteBuffer);
        } else if (zpm instanceof zPM.StateListAnimator) {
            byteBuffer.putInt(2);
        } else {
            if (!(zpm instanceof zPM.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(3);
            FfiConverterTypeSyncViolatedPrecondition.INSTANCE.write(((zPM.Activity) zpm).AEQbTJ(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
