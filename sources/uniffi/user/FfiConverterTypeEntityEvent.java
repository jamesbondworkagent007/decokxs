package uniffi.user;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5009Bzf;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.user.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeEntityEvent implements FfiConverterRustBuffer<AbstractC5009Bzf> {
    public static final int $stable = 0;
    public static final FfiConverterTypeEntityEvent INSTANCE = new FfiConverterTypeEntityEvent();

    private FfiConverterTypeEntityEvent() {
    }

    @Override // uniffi.user.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC5009Bzf lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC5009Bzf) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC5009Bzf liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC5009Bzf) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC5009Bzf abstractC5009Bzf) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC5009Bzf);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC5009Bzf abstractC5009Bzf) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC5009Bzf);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC5009Bzf read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (byteBuffer.getInt() == 1) {
            return new AbstractC5009Bzf.TaskDescription(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC5009Bzf abstractC5009Bzf) {
        Intrinsics.checkNotNullParameter(abstractC5009Bzf, "");
        if (!(abstractC5009Bzf instanceof AbstractC5009Bzf.TaskDescription)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC5009Bzf.TaskDescription) abstractC5009Bzf).EZpvd()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC5009Bzf abstractC5009Bzf, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC5009Bzf, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (!(abstractC5009Bzf instanceof AbstractC5009Bzf.TaskDescription)) {
            throw new NoWhenBranchMatchedException();
        }
        byteBuffer.putInt(1);
        FfiConverterString.INSTANCE.write(((AbstractC5009Bzf.TaskDescription) abstractC5009Bzf).EZpvd(), byteBuffer);
        Unit unit = Unit.INSTANCE;
    }
}
