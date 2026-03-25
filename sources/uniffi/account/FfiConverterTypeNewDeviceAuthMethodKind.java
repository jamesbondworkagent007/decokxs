package uniffi.account;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zJJ;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeNewDeviceAuthMethodKind implements FfiConverterRustBuffer<zJJ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceAuthMethodKind INSTANCE = new FfiConverterTypeNewDeviceAuthMethodKind();

    private FfiConverterTypeNewDeviceAuthMethodKind() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zJJ lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zJJ) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zJJ liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zJJ) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zJJ zjj) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zjj);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zJJ zjj) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zjj);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zJJ read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new zJJ.StateListAnimator(FfiConverterString.INSTANCE.read(byteBuffer), FfiConverterLong.INSTANCE.read(byteBuffer).longValue());
        }
        if (i == 2) {
            return new zJJ.TaskDescription(FfiConverterSequenceTypeOtpType.INSTANCE.read(byteBuffer));
        }
        if (i == 3) {
            return new zJJ.ActionBar(FfiConverterTypeOtpType.INSTANCE.read(byteBuffer), FfiConverterSequenceTypeOtpType.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zJJ zjj) {
        Intrinsics.checkNotNullParameter(zjj, "");
        if (zjj instanceof zJJ.StateListAnimator) {
            zJJ.StateListAnimator stateListAnimator = (zJJ.StateListAnimator) zjj;
            return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(stateListAnimator.OLrzqt()) + 4) + FfiConverterLong.INSTANCE.m9537allocationSizeI7RO_PI(stateListAnimator.AEQbTJ()));
        }
        if (zjj instanceof zJJ.TaskDescription) {
            return C56396yDv.copydefault(FfiConverterSequenceTypeOtpType.INSTANCE.mo9529allocationSizeI7RO_PI((List) ((zJJ.TaskDescription) zjj).EZpvd()) + 4);
        }
        if (!(zjj instanceof zJJ.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        zJJ.ActionBar actionBar = (zJJ.ActionBar) zjj;
        return C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterTypeOtpType.INSTANCE.mo9529allocationSizeI7RO_PI(actionBar.KWHzl()) + 4) + FfiConverterSequenceTypeOtpType.INSTANCE.mo9529allocationSizeI7RO_PI((List) actionBar.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zJJ zjj, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zjj, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (zjj instanceof zJJ.StateListAnimator) {
            byteBuffer.putInt(1);
            zJJ.StateListAnimator stateListAnimator = (zJJ.StateListAnimator) zjj;
            FfiConverterString.INSTANCE.write(stateListAnimator.OLrzqt(), byteBuffer);
            FfiConverterLong.INSTANCE.write(stateListAnimator.AEQbTJ(), byteBuffer);
        } else if (zjj instanceof zJJ.TaskDescription) {
            byteBuffer.putInt(2);
            FfiConverterSequenceTypeOtpType.INSTANCE.write((List) ((zJJ.TaskDescription) zjj).EZpvd(), byteBuffer);
        } else {
            if (!(zjj instanceof zJJ.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(3);
            zJJ.ActionBar actionBar = (zJJ.ActionBar) zjj;
            FfiConverterTypeOtpType.INSTANCE.write(actionBar.KWHzl(), byteBuffer);
            FfiConverterSequenceTypeOtpType.INSTANCE.write((List) actionBar.AEQbTJ(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
