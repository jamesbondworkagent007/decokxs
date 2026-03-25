package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.zDE;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeLoginPasskeyEvent implements FfiConverterRustBuffer<zDE> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLoginPasskeyEvent INSTANCE = new FfiConverterTypeLoginPasskeyEvent();

    private FfiConverterTypeLoginPasskeyEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public zDE lift2(@NotNull RustBuffer.ByValue byValue) {
        return (zDE) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zDE liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (zDE) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull zDE zde) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, zde);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull zDE zde) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, zde);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public zDE read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new zDE.StateListAnimator(FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
        }
        if (i == 2) {
            return new zDE.Activity(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 3) {
            return new zDE.TaskDescription(FfiConverterTypeLoginWithPasskeyStartResponse.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull zDE zde) {
        Intrinsics.checkNotNullParameter(zde, "");
        if (zde instanceof zDE.StateListAnimator) {
            return C56396yDv.copydefault(FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(((zDE.StateListAnimator) zde).AEQbTJ()) + 4);
        }
        if (zde instanceof zDE.Activity) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((zDE.Activity) zde).EZpvd()) + 4);
        }
        if (!(zde instanceof zDE.TaskDescription)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterTypeLoginWithPasskeyStartResponse.INSTANCE.mo9529allocationSizeI7RO_PI(((zDE.TaskDescription) zde).OLrzqt()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull zDE zde, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(zde, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (zde instanceof zDE.StateListAnimator) {
            byteBuffer.putInt(1);
            FfiConverterBoolean.INSTANCE.write(((zDE.StateListAnimator) zde).AEQbTJ(), byteBuffer);
        } else if (zde instanceof zDE.Activity) {
            byteBuffer.putInt(2);
            FfiConverterString.INSTANCE.write(((zDE.Activity) zde).EZpvd(), byteBuffer);
        } else {
            if (!(zde instanceof zDE.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(3);
            FfiConverterTypeLoginWithPasskeyStartResponse.INSTANCE.write(((zDE.TaskDescription) zde).OLrzqt(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
