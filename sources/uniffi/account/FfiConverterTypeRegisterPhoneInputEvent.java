package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC2974AdG;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeRegisterPhoneInputEvent implements FfiConverterRustBuffer<AbstractC2974AdG> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRegisterPhoneInputEvent INSTANCE = new FfiConverterTypeRegisterPhoneInputEvent();

    private FfiConverterTypeRegisterPhoneInputEvent() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC2974AdG lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC2974AdG) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC2974AdG liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC2974AdG) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC2974AdG abstractC2974AdG) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC2974AdG);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC2974AdG abstractC2974AdG) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC2974AdG);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC2974AdG read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i == 1) {
            return new AbstractC2974AdG.Activity(FfiConverterTypeAccountNetworkState.INSTANCE.read(byteBuffer));
        }
        if (i == 2) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            return new AbstractC2974AdG.Application(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
        }
        if (i == 3) {
            FfiConverterString ffiConverterString2 = FfiConverterString.INSTANCE;
            return new AbstractC2974AdG.ActionBar(ffiConverterString2.read(byteBuffer), ffiConverterString2.read(byteBuffer));
        }
        if (i == 4) {
            FfiConverterString ffiConverterString3 = FfiConverterString.INSTANCE;
            return new AbstractC2974AdG.TaskDescription(ffiConverterString3.read(byteBuffer), ffiConverterString3.read(byteBuffer));
        }
        throw new RuntimeException("invalid enum value, something is very wrong!!");
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC2974AdG abstractC2974AdG) {
        Intrinsics.checkNotNullParameter(abstractC2974AdG, "");
        if (abstractC2974AdG instanceof AbstractC2974AdG.Activity) {
            return C56396yDv.copydefault(FfiConverterTypeAccountNetworkState.INSTANCE.mo9529allocationSizeI7RO_PI(((AbstractC2974AdG.Activity) abstractC2974AdG).KWHzl()) + 4);
        }
        if (abstractC2974AdG instanceof AbstractC2974AdG.Application) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            AbstractC2974AdG.Application application = (AbstractC2974AdG.Application) abstractC2974AdG;
            return C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(application.KWHzl()) + 4) + ffiConverterString.mo9529allocationSizeI7RO_PI(application.OLrzqt()));
        }
        if (abstractC2974AdG instanceof AbstractC2974AdG.ActionBar) {
            FfiConverterString ffiConverterString2 = FfiConverterString.INSTANCE;
            AbstractC2974AdG.ActionBar actionBar = (AbstractC2974AdG.ActionBar) abstractC2974AdG;
            return C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString2.mo9529allocationSizeI7RO_PI(actionBar.AEQbTJ()) + 4) + ffiConverterString2.mo9529allocationSizeI7RO_PI(actionBar.OLrzqt()));
        }
        if (!(abstractC2974AdG instanceof AbstractC2974AdG.TaskDescription)) {
            throw new NoWhenBranchMatchedException();
        }
        FfiConverterString ffiConverterString3 = FfiConverterString.INSTANCE;
        AbstractC2974AdG.TaskDescription taskDescription = (AbstractC2974AdG.TaskDescription) abstractC2974AdG;
        return C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString3.mo9529allocationSizeI7RO_PI(taskDescription.OLrzqt()) + 4) + ffiConverterString3.mo9529allocationSizeI7RO_PI(taskDescription.AEQbTJ()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC2974AdG abstractC2974AdG, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC2974AdG, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC2974AdG instanceof AbstractC2974AdG.Activity) {
            byteBuffer.putInt(1);
            FfiConverterTypeAccountNetworkState.INSTANCE.write(((AbstractC2974AdG.Activity) abstractC2974AdG).KWHzl(), byteBuffer);
        } else if (abstractC2974AdG instanceof AbstractC2974AdG.Application) {
            byteBuffer.putInt(2);
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            AbstractC2974AdG.Application application = (AbstractC2974AdG.Application) abstractC2974AdG;
            ffiConverterString.write(application.KWHzl(), byteBuffer);
            ffiConverterString.write(application.OLrzqt(), byteBuffer);
        } else if (abstractC2974AdG instanceof AbstractC2974AdG.ActionBar) {
            byteBuffer.putInt(3);
            FfiConverterString ffiConverterString2 = FfiConverterString.INSTANCE;
            AbstractC2974AdG.ActionBar actionBar = (AbstractC2974AdG.ActionBar) abstractC2974AdG;
            ffiConverterString2.write(actionBar.AEQbTJ(), byteBuffer);
            ffiConverterString2.write(actionBar.OLrzqt(), byteBuffer);
        } else {
            if (!(abstractC2974AdG instanceof AbstractC2974AdG.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(4);
            FfiConverterString ffiConverterString3 = FfiConverterString.INSTANCE;
            AbstractC2974AdG.TaskDescription taskDescription = (AbstractC2974AdG.TaskDescription) abstractC2974AdG;
            ffiConverterString3.write(taskDescription.OLrzqt(), byteBuffer);
            ffiConverterString3.write(taskDescription.AEQbTJ(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
