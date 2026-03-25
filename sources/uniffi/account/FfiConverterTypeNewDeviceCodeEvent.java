package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zJH;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNewDeviceCodeEvent implements FfiConverterRustBuffer<zJH> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceCodeEvent INSTANCE = new FfiConverterTypeNewDeviceCodeEvent();

    private FfiConverterTypeNewDeviceCodeEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zJH lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zJH) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zJH liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zJH) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zJH zjh) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zjh);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zJH zjh) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zjh);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zJH read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new zJH.Activity(FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
        }
        if (i == 2) {
            return zJH.Application.INSTANCE;
        }
        if (i == 3) {
            return zJH.ActionBar.INSTANCE;
        }
        if (i == 4) {
            return zJH.StateListAnimator.INSTANCE;
        }
        if (i == 5) {
            return new zJH.TaskDescription(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zJH zjh) {
        Intrinsics.checkNotNullParameter(zjh, "");
        if (zjh instanceof zJH.Activity) {
            return C56396yDv.copydefault(FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(((zJH.Activity) zjh).EZpvd()) + 4);
        }
        if ((zjh instanceof zJH.Application) || (zjh instanceof zJH.ActionBar) || (zjh instanceof zJH.StateListAnimator)) {
            return 4L;
        }
        if (!(zjh instanceof zJH.TaskDescription)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zJH.TaskDescription) zjh).EZpvd()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zJH zjh, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zjh, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (zjh instanceof zJH.Activity) {
            byteBuffer.putInt(1);
            FfiConverterBoolean.INSTANCE.write(((zJH.Activity) zjh).EZpvd(), byteBuffer);
        } else if (zjh instanceof zJH.Application) {
            byteBuffer.putInt(2);
        } else if (zjh instanceof zJH.ActionBar) {
            byteBuffer.putInt(3);
        } else if (zjh instanceof zJH.StateListAnimator) {
            byteBuffer.putInt(4);
        } else {
            if (!(zjh instanceof zJH.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(5);
            FfiConverterString.INSTANCE.write(((zJH.TaskDescription) zjh).EZpvd(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
