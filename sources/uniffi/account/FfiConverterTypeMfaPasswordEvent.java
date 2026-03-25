package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zGG;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeMfaPasswordEvent implements FfiConverterRustBuffer<zGG> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMfaPasswordEvent INSTANCE = new FfiConverterTypeMfaPasswordEvent();

    private FfiConverterTypeMfaPasswordEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zGG lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zGG) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zGG liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zGG) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zGG zgg) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zgg);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zGG zgg) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zgg);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zGG read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new zGG.Activity(FfiConverterTypeAccountNetworkState.INSTANCE.read(byteBuffer));
        }
        if (i == 2) {
            return zGG.TaskDescription.INSTANCE;
        }
        if (i == 3) {
            return new zGG.StateListAnimator(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zGG zgg) {
        Intrinsics.checkNotNullParameter(zgg, "");
        if (zgg instanceof zGG.Activity) {
            return C56396yDv.copydefault(FfiConverterTypeAccountNetworkState.INSTANCE.mo9529allocationSizeI7RO_PI(((zGG.Activity) zgg).AEQbTJ()) + 4);
        }
        if (zgg instanceof zGG.TaskDescription) {
            return 4L;
        }
        if (!(zgg instanceof zGG.StateListAnimator)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zGG.StateListAnimator) zgg).AEQbTJ()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zGG zgg, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zgg, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (zgg instanceof zGG.Activity) {
            byteBuffer.putInt(1);
            FfiConverterTypeAccountNetworkState.INSTANCE.write(((zGG.Activity) zgg).AEQbTJ(), byteBuffer);
        } else if (zgg instanceof zGG.TaskDescription) {
            byteBuffer.putInt(2);
        } else {
            if (!(zgg instanceof zGG.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(3);
            FfiConverterString.INSTANCE.write(((zGG.StateListAnimator) zgg).AEQbTJ(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
