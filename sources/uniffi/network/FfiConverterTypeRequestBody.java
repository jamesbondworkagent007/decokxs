package uniffi.network;

import java.nio.ByteBuffer;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC4327BbX;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.network.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeRequestBody implements FfiConverterRustBuffer<AbstractC4327BbX> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRequestBody INSTANCE = new FfiConverterTypeRequestBody();

    private FfiConverterTypeRequestBody() {
    }

    @Override // uniffi.network.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC4327BbX lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC4327BbX) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC4327BbX liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC4327BbX) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC4327BbX abstractC4327BbX) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC4327BbX);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC4327BbX abstractC4327BbX) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC4327BbX);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC4327BbX read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return AbstractC4327BbX.Application.INSTANCE;
        }
        if (i == 2) {
            return new AbstractC4327BbX.TaskDescription(FfiConverterByteArray.INSTANCE.read(byteBuffer));
        }
        if (i == 3) {
            return new AbstractC4327BbX.Activity(FfiConverterString.INSTANCE.read(byteBuffer));
        }
        if (i == 4) {
            return new AbstractC4327BbX.StateListAnimator(FfiConverterSequenceTypeFormField.INSTANCE.read(byteBuffer));
        }
        if (i == 5) {
            return new AbstractC4327BbX.ActionBar(FfiConverterSequenceTypeMultipartPart.INSTANCE.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC4327BbX abstractC4327BbX) {
        Intrinsics.checkNotNullParameter(abstractC4327BbX, "");
        if (abstractC4327BbX instanceof AbstractC4327BbX.Application) {
            return 4L;
        }
        if (abstractC4327BbX instanceof AbstractC4327BbX.TaskDescription) {
            return C56396yDv.copydefault(FfiConverterByteArray.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC4327BbX.TaskDescription) abstractC4327BbX).KWHzl()) + 4);
        }
        if (abstractC4327BbX instanceof AbstractC4327BbX.Activity) {
            return C56396yDv.copydefault(FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC4327BbX.Activity) abstractC4327BbX).EZpvd()) + 4);
        }
        if (abstractC4327BbX instanceof AbstractC4327BbX.StateListAnimator) {
            return C56396yDv.copydefault(FfiConverterSequenceTypeFormField.INSTANCE.mo9529allocationSizeI7RO_PI((List) ((AbstractC4327BbX.StateListAnimator) abstractC4327BbX).EZpvd()) + 4);
        }
        if (!(abstractC4327BbX instanceof AbstractC4327BbX.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        return C56396yDv.copydefault(FfiConverterSequenceTypeMultipartPart.INSTANCE.mo9529allocationSizeI7RO_PI((List) ((AbstractC4327BbX.ActionBar) abstractC4327BbX).OLrzqt()) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC4327BbX abstractC4327BbX, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC4327BbX, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC4327BbX instanceof AbstractC4327BbX.Application) {
            byteBuffer.putInt(1);
        } else if (abstractC4327BbX instanceof AbstractC4327BbX.TaskDescription) {
            byteBuffer.putInt(2);
            FfiConverterByteArray.INSTANCE.write(((AbstractC4327BbX.TaskDescription) abstractC4327BbX).KWHzl(), byteBuffer);
        } else if (abstractC4327BbX instanceof AbstractC4327BbX.Activity) {
            byteBuffer.putInt(3);
            FfiConverterString.INSTANCE.write(((AbstractC4327BbX.Activity) abstractC4327BbX).EZpvd(), byteBuffer);
        } else if (abstractC4327BbX instanceof AbstractC4327BbX.StateListAnimator) {
            byteBuffer.putInt(4);
            FfiConverterSequenceTypeFormField.INSTANCE.write((List) ((AbstractC4327BbX.StateListAnimator) abstractC4327BbX).EZpvd(), byteBuffer);
        } else {
            if (!(abstractC4327BbX instanceof AbstractC4327BbX.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(5);
            FfiConverterSequenceTypeMultipartPart.INSTANCE.write((List) ((AbstractC4327BbX.ActionBar) abstractC4327BbX).OLrzqt(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
