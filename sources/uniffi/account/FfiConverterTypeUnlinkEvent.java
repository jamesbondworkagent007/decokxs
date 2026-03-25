package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC3207Ahb;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeUnlinkEvent implements FfiConverterRustBuffer<AbstractC3207Ahb> {
    public static final int $stable = 0;
    public static final FfiConverterTypeUnlinkEvent INSTANCE = new FfiConverterTypeUnlinkEvent();

    private FfiConverterTypeUnlinkEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC3207Ahb lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC3207Ahb) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC3207Ahb liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC3207Ahb) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC3207Ahb abstractC3207Ahb) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC3207Ahb);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC3207Ahb abstractC3207Ahb) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC3207Ahb);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC3207Ahb read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new AbstractC3207Ahb.Application(FfiConverterTypeAccountNetworkState.INSTANCE.read(byteBuffer));
        }
        if (i == 2) {
            return AbstractC3207Ahb.TaskDescription.INSTANCE;
        }
        if (i == 3) {
            return new AbstractC3207Ahb.Activity(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC3207Ahb abstractC3207Ahb) {
        Intrinsics.checkNotNullParameter(abstractC3207Ahb, "");
        if (abstractC3207Ahb instanceof AbstractC3207Ahb.Application) {
            return C56396yDv.copydefault(FfiConverterTypeAccountNetworkState.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC3207Ahb.Application) abstractC3207Ahb).copydefault()) + 4);
        }
        if (abstractC3207Ahb instanceof AbstractC3207Ahb.TaskDescription) {
            return 4L;
        }
        if (!(abstractC3207Ahb instanceof AbstractC3207Ahb.Activity)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC3207Ahb.Activity) abstractC3207Ahb).EZpvd()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC3207Ahb abstractC3207Ahb, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC3207Ahb, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC3207Ahb instanceof AbstractC3207Ahb.Application) {
            byteBuffer.putInt(1);
            FfiConverterTypeAccountNetworkState.INSTANCE.write(((AbstractC3207Ahb.Application) abstractC3207Ahb).copydefault(), byteBuffer);
        } else if (abstractC3207Ahb instanceof AbstractC3207Ahb.TaskDescription) {
            byteBuffer.putInt(2);
        } else {
            if (!(abstractC3207Ahb instanceof AbstractC3207Ahb.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(3);
            FfiConverterString.INSTANCE.write(((AbstractC3207Ahb.Activity) abstractC3207Ahb).EZpvd(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
