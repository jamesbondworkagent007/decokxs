package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zDZ;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;
import uniffi.user.FfiConverterTypeCoreUser;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeLoginResult implements FfiConverterRustBuffer<zDZ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLoginResult INSTANCE = new FfiConverterTypeLoginResult();

    private FfiConverterTypeLoginResult() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zDZ lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zDZ) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zDZ liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zDZ) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zDZ zdz) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zdz);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zDZ zdz) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zdz);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zDZ read(@NotNull ByteBuffer byteBuffer) {
        zDZ activity;
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            activity = new zDZ.Activity(FfiConverterTypeCoreUser.INSTANCE.read(byteBuffer));
        } else if (i == 2) {
            activity = new zDZ.Application(FfiConverterTypeLoginNextStep.INSTANCE.read(byteBuffer));
        } else {
            if (i != 3) {
                if (i == 4) {
                    return zDZ.ActionBar.INSTANCE;
                }
                throw new RuntimeException("invalid enum value, something is very wrong!!");
            }
            activity = new zDZ.TaskDescription(FfiConverterTypeAccountError.INSTANCE.read(byteBuffer));
        }
        return activity;
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zDZ zdz) {
        Intrinsics.checkNotNullParameter(zdz, "");
        if (zdz instanceof zDZ.Activity) {
            return C56396yDv.copydefault(FfiConverterTypeCoreUser.INSTANCE.mo9529allocationSizeI7RO_PI(((zDZ.Activity) zdz).OLrzqt()) + 4);
        }
        if (zdz instanceof zDZ.Application) {
            return C56396yDv.copydefault(FfiConverterTypeLoginNextStep.INSTANCE.mo9529allocationSizeI7RO_PI(((zDZ.Application) zdz).KWHzl()) + 4);
        }
        if (zdz instanceof zDZ.TaskDescription) {
            return C56396yDv.copydefault(FfiConverterTypeAccountError.INSTANCE.mo9529allocationSizeI7RO_PI(((zDZ.TaskDescription) zdz).EZpvd()) + 4);
        }
        if (zdz instanceof zDZ.ActionBar) {
            return 4L;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zDZ zdz, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zdz, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (zdz instanceof zDZ.Activity) {
            byteBuffer.putInt(1);
            FfiConverterTypeCoreUser.INSTANCE.write(((zDZ.Activity) zdz).OLrzqt(), byteBuffer);
        } else if (zdz instanceof zDZ.Application) {
            byteBuffer.putInt(2);
            FfiConverterTypeLoginNextStep.INSTANCE.write(((zDZ.Application) zdz).KWHzl(), byteBuffer);
        } else if (zdz instanceof zDZ.TaskDescription) {
            byteBuffer.putInt(3);
            FfiConverterTypeAccountError.INSTANCE.write(((zDZ.TaskDescription) zdz).EZpvd(), byteBuffer);
        } else {
            if (!(zdz instanceof zDZ.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(4);
        }
        Unit unit = Unit.INSTANCE;
    }
}
