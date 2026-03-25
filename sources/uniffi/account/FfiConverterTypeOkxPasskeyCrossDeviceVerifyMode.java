package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zRJ;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeOkxPasskeyCrossDeviceVerifyMode implements FfiConverterRustBuffer<zRJ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyCrossDeviceVerifyMode INSTANCE = new FfiConverterTypeOkxPasskeyCrossDeviceVerifyMode();

    private FfiConverterTypeOkxPasskeyCrossDeviceVerifyMode() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zRJ lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zRJ) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zRJ liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zRJ) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zRJ zrj) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zrj);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zRJ zrj) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zrj);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zRJ read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            return new zRJ.TaskDescription(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
        }
        if (i == 2) {
            FfiConverterString ffiConverterString2 = FfiConverterString.INSTANCE;
            return new zRJ.StateListAnimator(ffiConverterString2.read(byteBuffer), ffiConverterString2.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zRJ zrj) {
        Intrinsics.checkNotNullParameter(zrj, "");
        if (zrj instanceof zRJ.TaskDescription) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            zRJ.TaskDescription taskDescription = (zRJ.TaskDescription) zrj;
            return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(taskDescription.KWHzl()) + 4) + ffiConverterString.mo9529allocationSizeI7RO_PI(taskDescription.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(taskDescription.EZpvd()));
        }
        if (!(zrj instanceof zRJ.StateListAnimator)) {
            throw new NoWhenBranchMatchedException();
        }
        FfiConverterString ffiConverterString2 = FfiConverterString.INSTANCE;
        zRJ.StateListAnimator stateListAnimator = (zRJ.StateListAnimator) zrj;
        return C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString2.mo9529allocationSizeI7RO_PI(stateListAnimator.AEQbTJ()) + 4) + ffiConverterString2.mo9529allocationSizeI7RO_PI(stateListAnimator.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zRJ zrj, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zrj, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (zrj instanceof zRJ.TaskDescription) {
            byteBuffer.putInt(1);
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            zRJ.TaskDescription taskDescription = (zRJ.TaskDescription) zrj;
            ffiConverterString.write(taskDescription.KWHzl(), byteBuffer);
            ffiConverterString.write(taskDescription.OLrzqt(), byteBuffer);
            ffiConverterString.write(taskDescription.EZpvd(), byteBuffer);
        } else {
            if (!(zrj instanceof zRJ.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(2);
            FfiConverterString ffiConverterString2 = FfiConverterString.INSTANCE;
            zRJ.StateListAnimator stateListAnimator = (zRJ.StateListAnimator) zrj;
            ffiConverterString2.write(stateListAnimator.AEQbTJ(), byteBuffer);
            ffiConverterString2.write(stateListAnimator.KWHzl(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
