package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58665zKu;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNewDeviceConfirmEvent implements FfiConverterRustBuffer<AbstractC58665zKu> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceConfirmEvent INSTANCE = new FfiConverterTypeNewDeviceConfirmEvent();

    private FfiConverterTypeNewDeviceConfirmEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC58665zKu lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC58665zKu) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC58665zKu liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC58665zKu) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC58665zKu abstractC58665zKu) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC58665zKu);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC58665zKu abstractC58665zKu) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC58665zKu);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC58665zKu read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new AbstractC58665zKu.TaskDescription(FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
        }
        if (i == 2) {
            return new AbstractC58665zKu.ActionBar(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC58665zKu abstractC58665zKu) {
        Intrinsics.checkNotNullParameter(abstractC58665zKu, "");
        if (abstractC58665zKu instanceof AbstractC58665zKu.TaskDescription) {
            return C56396yDv.copydefault(FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(((AbstractC58665zKu.TaskDescription) abstractC58665zKu).copydefault()) + 4);
        }
        if (!(abstractC58665zKu instanceof AbstractC58665zKu.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58665zKu.ActionBar) abstractC58665zKu).OLrzqt()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC58665zKu abstractC58665zKu, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC58665zKu, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC58665zKu instanceof AbstractC58665zKu.TaskDescription) {
            byteBuffer.putInt(1);
            FfiConverterBoolean.INSTANCE.write(((AbstractC58665zKu.TaskDescription) abstractC58665zKu).copydefault(), byteBuffer);
        } else {
            if (!(abstractC58665zKu instanceof AbstractC58665zKu.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(2);
            FfiConverterString.INSTANCE.write(((AbstractC58665zKu.ActionBar) abstractC58665zKu).OLrzqt(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
