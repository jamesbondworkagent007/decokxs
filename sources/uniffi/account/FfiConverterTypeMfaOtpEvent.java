package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58534zFy;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeMfaOtpEvent implements FfiConverterRustBuffer<AbstractC58534zFy> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMfaOtpEvent INSTANCE = new FfiConverterTypeMfaOtpEvent();

    private FfiConverterTypeMfaOtpEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC58534zFy lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC58534zFy) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC58534zFy liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC58534zFy) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC58534zFy abstractC58534zFy) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC58534zFy);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC58534zFy abstractC58534zFy) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC58534zFy);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC58534zFy read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new AbstractC58534zFy.Activity(FfiConverterBoolean.INSTANCE.read(byteBuffer).booleanValue());
        }
        if (i == 2) {
            return AbstractC58534zFy.TaskDescription.INSTANCE;
        }
        if (i == 3) {
            return new AbstractC58534zFy.Application(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC58534zFy abstractC58534zFy) {
        Intrinsics.checkNotNullParameter(abstractC58534zFy, "");
        if (abstractC58534zFy instanceof AbstractC58534zFy.Activity) {
            return C56396yDv.copydefault(FfiConverterBoolean.INSTANCE.m9530allocationSizeI7RO_PI(((AbstractC58534zFy.Activity) abstractC58534zFy).OLrzqt()) + 4);
        }
        if (abstractC58534zFy instanceof AbstractC58534zFy.TaskDescription) {
            return 4L;
        }
        if (!(abstractC58534zFy instanceof AbstractC58534zFy.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC58534zFy.Application) abstractC58534zFy).EZpvd()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC58534zFy abstractC58534zFy, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC58534zFy, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC58534zFy instanceof AbstractC58534zFy.Activity) {
            byteBuffer.putInt(1);
            FfiConverterBoolean.INSTANCE.write(((AbstractC58534zFy.Activity) abstractC58534zFy).OLrzqt(), byteBuffer);
        } else if (abstractC58534zFy instanceof AbstractC58534zFy.TaskDescription) {
            byteBuffer.putInt(2);
        } else {
            if (!(abstractC58534zFy instanceof AbstractC58534zFy.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(3);
            FfiConverterString.INSTANCE.write(((AbstractC58534zFy.Application) abstractC58534zFy).EZpvd(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
