package uniffi.account;

import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC2816AaH;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.account.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeProfileListItem implements FfiConverterRustBuffer<AbstractC2816AaH> {
    public static final int $stable = 0;
    public static final FfiConverterTypeProfileListItem INSTANCE = new FfiConverterTypeProfileListItem();

    private FfiConverterTypeProfileListItem() {
    }

    @Override // uniffi.account.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public AbstractC2816AaH lift2(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC2816AaH) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC2816AaH liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (AbstractC2816AaH) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull AbstractC2816AaH abstractC2816AaH) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, abstractC2816AaH);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull AbstractC2816AaH abstractC2816AaH) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, abstractC2816AaH);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public AbstractC2816AaH read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        if (i != 1) {
            if (i == 2) {
                return new AbstractC2816AaH.Activity(FfiConverterTypeProfileListType.INSTANCE.read(byteBuffer), FfiConverterTypeLocalString.INSTANCE.read(byteBuffer), FfiConverterString.INSTANCE.read(byteBuffer), FfiConverterTypeKycState.INSTANCE.read(byteBuffer));
            }
            throw new RuntimeException("invalid enum value, something is very wrong!!");
        }
        ProfileListType profileListType = FfiConverterTypeProfileListType.INSTANCE.read(byteBuffer);
        FfiConverterTypeLocalString ffiConverterTypeLocalString = FfiConverterTypeLocalString.INSTANCE;
        return new AbstractC2816AaH.Application(profileListType, ffiConverterTypeLocalString.read(byteBuffer), ffiConverterTypeLocalString.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull AbstractC2816AaH abstractC2816AaH) {
        Intrinsics.checkNotNullParameter(abstractC2816AaH, "");
        if (abstractC2816AaH instanceof AbstractC2816AaH.Application) {
            AbstractC2816AaH.Application application = (AbstractC2816AaH.Application) abstractC2816AaH;
            long jCopydefault = C56396yDv.copydefault(FfiConverterTypeProfileListType.INSTANCE.mo9529allocationSizeI7RO_PI(application.EZpvd()) + 4);
            FfiConverterTypeLocalString ffiConverterTypeLocalString = FfiConverterTypeLocalString.INSTANCE;
            return C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterTypeLocalString.mo9529allocationSizeI7RO_PI(application.OLrzqt())) + ffiConverterTypeLocalString.mo9529allocationSizeI7RO_PI(application.KWHzl()));
        }
        if (!(abstractC2816AaH instanceof AbstractC2816AaH.Activity)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC2816AaH.Activity activity = (AbstractC2816AaH.Activity) abstractC2816AaH;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(FfiConverterTypeProfileListType.INSTANCE.mo9529allocationSizeI7RO_PI(activity.AEQbTJ()) + 4) + FfiConverterTypeLocalString.INSTANCE.mo9529allocationSizeI7RO_PI(activity.copydefault())) + FfiConverterString.INSTANCE.mo9529allocationSizeI7RO_PI(activity.OLrzqt())) + FfiConverterTypeKycState.INSTANCE.mo9529allocationSizeI7RO_PI(activity.KWHzl()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull AbstractC2816AaH abstractC2816AaH, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(abstractC2816AaH, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        if (abstractC2816AaH instanceof AbstractC2816AaH.Application) {
            byteBuffer.putInt(1);
            AbstractC2816AaH.Application application = (AbstractC2816AaH.Application) abstractC2816AaH;
            FfiConverterTypeProfileListType.INSTANCE.write(application.EZpvd(), byteBuffer);
            FfiConverterTypeLocalString ffiConverterTypeLocalString = FfiConverterTypeLocalString.INSTANCE;
            ffiConverterTypeLocalString.write(application.OLrzqt(), byteBuffer);
            ffiConverterTypeLocalString.write(application.KWHzl(), byteBuffer);
        } else {
            if (!(abstractC2816AaH instanceof AbstractC2816AaH.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            byteBuffer.putInt(2);
            AbstractC2816AaH.Activity activity = (AbstractC2816AaH.Activity) abstractC2816AaH;
            FfiConverterTypeProfileListType.INSTANCE.write(activity.AEQbTJ(), byteBuffer);
            FfiConverterTypeLocalString.INSTANCE.write(activity.copydefault(), byteBuffer);
            FfiConverterString.INSTANCE.write(activity.OLrzqt(), byteBuffer);
            FfiConverterTypeKycState.INSTANCE.write(activity.KWHzl(), byteBuffer);
        }
        Unit unit = Unit.INSTANCE;
    }
}
