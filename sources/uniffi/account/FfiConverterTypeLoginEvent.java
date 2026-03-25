package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zCF;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeLoginEvent implements FfiConverterRustBuffer<zCF> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLoginEvent INSTANCE = new FfiConverterTypeLoginEvent();

    private FfiConverterTypeLoginEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zCF lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zCF) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zCF liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zCF) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zCF zcf) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zcf);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zCF zcf) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zcf);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zCF read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        switch (byteBuffer.getInt()) {
            case 1:
                return new zCF.TaskDescription(FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
            case 2:
                return zCF.Dialog.INSTANCE;
            case 3:
                return new zCF.PendingIntent(FfiConverterTypeLoginWithPasskeyStartResponse.INSTANCE.read(byteBuffer));
            case 4:
                return new zCF.Application(FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
            case 5:
                return new zCF.StateListAnimator(FfiConverterString.INSTANCE.read(byteBuffer));
            case 6:
                return new zCF.ActionBar(FfiConverterString.INSTANCE.read(byteBuffer));
            case 7:
                return new zCF.Activity(FfiConverterString.INSTANCE.read(byteBuffer));
            default:
                throw new RuntimeException("invalid enum value, something is very wrong!!");
        }
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zCF zcf) {
        Intrinsics.checkNotNullParameter(zcf, "");
        if (zcf instanceof zCF.TaskDescription) {
            return C56396yDv.copydefault(FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(((zCF.TaskDescription) zcf).EZpvd()) + 4);
        }
        if (zcf instanceof zCF.Dialog) {
            return 4L;
        }
        if (zcf instanceof zCF.PendingIntent) {
            return C56396yDv.copydefault(FfiConverterTypeLoginWithPasskeyStartResponse.INSTANCE.mo9529allocationSizeI7RO_PI(((zCF.PendingIntent) zcf).KWHzl()) + 4);
        }
        if (zcf instanceof zCF.Application) {
            return C56396yDv.copydefault(FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(((zCF.Application) zcf).KWHzl()) + 4);
        }
        if (zcf instanceof zCF.StateListAnimator) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zCF.StateListAnimator) zcf).OLrzqt()) + 4);
        }
        if (zcf instanceof zCF.ActionBar) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zCF.ActionBar) zcf).KWHzl()) + 4);
        }
        if (!(zcf instanceof zCF.Activity)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zCF.Activity) zcf).EZpvd()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zCF zcf, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zcf, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (zcf instanceof zCF.TaskDescription) {
            byteBuffer.putInt(1);
            FfiConverterBoolean.INSTANCE.write(((zCF.TaskDescription) zcf).EZpvd(), byteBuffer);
        } else if (zcf instanceof zCF.Dialog) {
            byteBuffer.putInt(2);
        } else if (zcf instanceof zCF.PendingIntent) {
            byteBuffer.putInt(3);
            FfiConverterTypeLoginWithPasskeyStartResponse.INSTANCE.write(((zCF.PendingIntent) zcf).KWHzl(), byteBuffer);
        } else if (zcf instanceof zCF.Application) {
            byteBuffer.putInt(4);
            FfiConverterBoolean.INSTANCE.write(((zCF.Application) zcf).KWHzl(), byteBuffer);
        } else if (zcf instanceof zCF.StateListAnimator) {
            byteBuffer.putInt(5);
            FfiConverterString.INSTANCE.write(((zCF.StateListAnimator) zcf).OLrzqt(), byteBuffer);
        } else if (zcf instanceof zCF.ActionBar) {
            byteBuffer.putInt(6);
            FfiConverterString.INSTANCE.write(((zCF.ActionBar) zcf).KWHzl(), byteBuffer);
        } else {
            if (!(zcf instanceof zCF.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(7);
            FfiConverterString.INSTANCE.write(((zCF.Activity) zcf).EZpvd(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
