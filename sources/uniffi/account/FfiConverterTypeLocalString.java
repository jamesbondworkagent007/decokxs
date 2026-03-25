package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zCC;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeLocalString implements FfiConverterRustBuffer<zCC> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLocalString INSTANCE = new FfiConverterTypeLocalString();

    private FfiConverterTypeLocalString() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zCC lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zCC) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zCC liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zCC) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zCC zcc) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zcc);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zCC zcc) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zcc);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zCC read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new zCC.Application(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 2) {
            return new zCC.StateListAnimator(FfiConverterString.INSTANCE.read(byteBuffer), FfiConverterOptionalMapStringString.INSTANCE.read(byteBuffer));
        }
        if (i == 3) {
            return new zCC.Activity(FfiConverterString.INSTANCE.read(byteBuffer), FfiConverterInt.INSTANCE.read(byteBuffer).intValue(), FfiConverterMapStringString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zCC zcc) {
        Intrinsics.checkNotNullParameter(zcc, "");
        if (zcc instanceof zCC.Application) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zCC.Application) zcc).AEQbTJ()) + 4);
        }
        if (zcc instanceof zCC.StateListAnimator) {
            zCC.StateListAnimator stateListAnimator = (zCC.StateListAnimator) zcc;
            return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(stateListAnimator.AEQbTJ()) + 4) + FfiConverterOptionalMapStringString.INSTANCE.mo9529allocationSizeI7RO_PI(stateListAnimator.OLrzqt()));
        }
        if (!(zcc instanceof zCC.Activity)) {
            throw new NoWhenBranchMatchedException();
        }
        zCC.Activity activity = (zCC.Activity) zcc;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(activity.KWHzl()) + 4) + FfiConverterInt.INSTANCE.m9536allocationSizeI7RO_PI(activity.EZpvd())) + FfiConverterMapStringString.INSTANCE.mo9529allocationSizeI7RO_PI(activity.OLrzqt()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zCC zcc, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zcc, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (zcc instanceof zCC.Application) {
            byteBuffer.putInt(1);
            FfiConverterString.INSTANCE.write(((zCC.Application) zcc).AEQbTJ(), byteBuffer);
        } else if (zcc instanceof zCC.StateListAnimator) {
            byteBuffer.putInt(2);
            zCC.StateListAnimator stateListAnimator = (zCC.StateListAnimator) zcc;
            FfiConverterString.INSTANCE.write(stateListAnimator.AEQbTJ(), byteBuffer);
            FfiConverterOptionalMapStringString.INSTANCE.write(stateListAnimator.OLrzqt(), byteBuffer);
        } else {
            if (!(zcc instanceof zCC.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(3);
            zCC.Activity activity = (zCC.Activity) zcc;
            FfiConverterString.INSTANCE.write(activity.KWHzl(), byteBuffer);
            FfiConverterInt.INSTANCE.write(activity.EZpvd(), byteBuffer);
            FfiConverterMapStringString.INSTANCE.write(activity.OLrzqt(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
