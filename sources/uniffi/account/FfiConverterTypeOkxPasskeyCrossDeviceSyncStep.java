package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zQK;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOkxPasskeyCrossDeviceSyncStep implements FfiConverterRustBuffer<zQK> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyCrossDeviceSyncStep INSTANCE = new FfiConverterTypeOkxPasskeyCrossDeviceSyncStep();

    private FfiConverterTypeOkxPasskeyCrossDeviceSyncStep() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zQK lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zQK) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zQK liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zQK) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zQK zqk) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zqk);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zQK zqk) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zqk);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zQK read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        switch (byteBuffer.getInt()) {
            case 1:
                return zQK.Activity.INSTANCE;
            case 2:
                return zQK.TaskDescription.INSTANCE;
            case 3:
                return zQK.Application.INSTANCE;
            case 4:
                return zQK.Fragment.INSTANCE;
            case 5:
                return new zQK.ActionBar(FfiConverterString.INSTANCE.read(byteBuffer));
            case 6:
                return zQK.StateListAnimator.INSTANCE;
            default:
                throw new RuntimeException("invalid enum value, something is very wrong!!");
        }
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zQK zqk) {
        Intrinsics.checkNotNullParameter(zqk, "");
        if ((zqk instanceof zQK.Activity) || (zqk instanceof zQK.TaskDescription) || (zqk instanceof zQK.Application) || (zqk instanceof zQK.Fragment)) {
            return 4L;
        }
        if (zqk instanceof zQK.ActionBar) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zQK.ActionBar) zqk).copydefault()) + 4);
        }
        if (zqk instanceof zQK.StateListAnimator) {
            return 4L;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zQK zqk, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zqk, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (zqk instanceof zQK.Activity) {
            byteBuffer.putInt(1);
        } else if (zqk instanceof zQK.TaskDescription) {
            byteBuffer.putInt(2);
        } else if (zqk instanceof zQK.Application) {
            byteBuffer.putInt(3);
        } else if (zqk instanceof zQK.Fragment) {
            byteBuffer.putInt(4);
        } else if (zqk instanceof zQK.ActionBar) {
            byteBuffer.putInt(5);
            FfiConverterString.INSTANCE.write(((zQK.ActionBar) zqk).copydefault(), byteBuffer);
        } else {
            if (!(zqk instanceof zQK.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(6);
        }
        Unit unit = Unit.INSTANCE;
    }
}
